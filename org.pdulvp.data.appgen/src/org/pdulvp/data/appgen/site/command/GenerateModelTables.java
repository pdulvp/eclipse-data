package org.pdulvp.data.appgen.site.command;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.function.Predicate;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.osgi.util.NLS;
import org.pdulvp.common.commands.TransactionalProgressCommandHandler;
import org.pdulvp.common.helpers.Couple;
import org.pdulvp.data.DataFactory;
import org.pdulvp.data.Schema;
import org.pdulvp.data.SchemaClass;
import org.pdulvp.data.SchemaFeature;
import org.pdulvp.data.appgen.site.JSONBufferExt;
import org.pdulvp.data.appgen.site.SchemaExt;
import org.pdulvp.data.appgen.site.template.ControllersTemplater;
import org.pdulvp.data.appgen.site.template.FactoriesTemplater;
import org.pdulvp.data.appgen.site.template.ModelTableTemplater;
import org.pdulvp.data.appgen.site.template.ModelTemplater;
import org.pdulvp.data.table.DAttribute;
import org.pdulvp.data.table.DFeature;
import org.pdulvp.data.table.DKey;
import org.pdulvp.data.table.DKeyValue;
import org.pdulvp.data.table.DReference;
import org.pdulvp.data.table.DTable;
import org.pdulvp.data.table.TableFactory;
import org.pdulvp.retriever.model.handler.helpers.LogHelper;

public class GenerateModelTables extends TransactionalProgressCommandHandler {

  protected Predicate enablement(IStructuredSelection selection) {
    return ca -> ca instanceof Schema;
  }
  
  @Override
  public void proceed(Collection<Object> selection, ExecutionEvent event_p, IProgressMonitor monitor_p) {

    if (!selection.iterator().hasNext()) {
      LogHelper.error("error, please select a Schema");
      return;
    }
    if (!(selection.iterator().next() instanceof Schema)) {
      LogHelper.error("error, please select a Schema");
      return;
    }

    Schema schema = (Schema) selection.iterator().next();
    String namespace = schema.getNamespace();

    //Clear schema
    schema.getOwnedTables().clear();
    for (SchemaClass clazz : schema.getOwnedClasses()) {
      clazz.setTable(null);
      clazz.getExternalFeatures().clear();
    }
    
    for (SchemaClass clazz : schema.getOwnedClasses()) {
      createSchemaTable(clazz, schema);
      
      for (EReference ref : clazz.getClazz().getEAllReferences()) {
        if (ref.isMany() && ref.getEAnnotation("database") != null) {
          createSchemaTable(clazz, ref, schema);
        }
      }
      for (EAttribute ref : clazz.getClazz().getEAllAttributes()) {
        if (ref.isMany() && ref.getEAnnotation("database") != null) {
           createSchemaTable(clazz, ref, schema);
        }
      }
    }

    for (SchemaClass clazz : schema.getOwnedClasses()) {
      createTableKeys(clazz, schema);
    }
    
    
    IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject("www");
    if (!project.exists()) {
      LogHelper.error("www project doesn't exist");
      return;
    }

    IFolder tableFolder = project.getFolder("main").getFolder("module").getFolder("Application").getFolder("generated")
        .getFolder(namespace).getFolder("Table");
    IFolder modelFolder = project.getFolder("main").getFolder("module").getFolder("Application").getFolder("generated")
        .getFolder(namespace).getFolder("Model");
    IFolder v2Folder = project.getFolder("main").getFolder("module").getFolder("Application").getFolder("generated")
        .getFolder(namespace);
    IFolder controllerFolder = project.getFolder("main").getFolder("module").getFolder("Application")
        .getFolder("generated").getFolder(namespace).getFolder("Controller");
    try {
      v2Folder.create(true, true, new NullProgressMonitor());
    } catch (CoreException e) {
    }
    try {
      controllerFolder.create(true, true, new NullProgressMonitor());
    } catch (CoreException e) {
    }
    try {
      modelFolder.create(true, true, new NullProgressMonitor());
    } catch (CoreException e) {
    }
    try {
      tableFolder.create(true, true, new NullProgressMonitor());
    } catch (CoreException e) {
    }

    for (DTable table : schema.getOwnedTables()) {
    	new ModelTableTemplater(schema, tableFolder).execute(table);
    	new ModelTemplater(schema, modelFolder).execute(table);
    }

    new ControllersTemplater(schema, controllerFolder).execute(schema.eClass());
    new FactoriesTemplater(schema, v2Folder).execute(schema.eClass());

  }

  protected Collection<EAnnotation> getSourceFeatures(EAttribute reference) {
    ArrayList<EAnnotation> features = new ArrayList<EAnnotation>();
    for (EAnnotation feature : JSONBufferExt.getRelatedFeatures(reference)) {
      if (isSource(reference, feature)) {
        features.add(feature);
      }
    }
    return features;
  }

  protected boolean isSource(EAttribute reference, EAnnotation feature) {
    return !JSONBufferExt.getRelatedFeatureIsMany(reference, feature);
  }

  protected DFeature getFeature(DTable table, EStructuralFeature feature) {
	  for (DAttribute attribute : table.getOwnedAttributes()) {
		  if (feature.equals(attribute.getFeature())) {
			  return attribute;
		  }
	  }
	  for (DReference attribute : table.getOwnedReferences()) {
		  if (feature.equals(attribute.getFeature())) {
			  return attribute;
		  }
	  }
	  return null;
  }
  
  private String getOrderingValue(Schema schema, DKeyValue indexKey, DTable table, EStructuralFeature feature) {
	String result = NLS.bind("$this->serviceManager->get(''{0}\\Table\\{1}Table'')->get(${2})->{3}.\" DESC\"",
    new String[] { schema.getNamespace(), table.getDbName(), indexKey.getDbName(), feature.getName() });
    return result;
  }

  private String getFilteringValue(Schema schema, DKeyValue indexKey, DTable table, EStructuralFeature feature) {
		String dbKey = table.getPrimaryKey().getFeatures().iterator().next().getDbName();
	    String result = NLS.bind("$this->serviceManager->get(''{0}\\Table\\{1}Table'')->get(${2})->{3}",
	    new String[] { schema.getNamespace(), table.getDbName(), indexKey.getDbName(), feature.getName() });
	    return result;
  }

  private Integer getPagination(EClass clazz) {
    if (clazz.getEAnnotation("database").getDetails().containsKey("pagination")) {
      return Integer.valueOf(clazz.getEAnnotation("database").getDetails().get("pagination"));
    }
    return null;
  }

  protected void createSchemaTable(SchemaClass clazz, EAttribute ref, Schema schema) {
    DTable table = TableFactory.eINSTANCE.createDTable();
    table.setDbName(getDBName(ref));
    table.setClassName(getClassName(ref));
    schema.getOwnedTables().add(table);
    
    SchemaFeature sFeature = DataFactory.eINSTANCE.createSchemaFeature();
    sFeature.setFeature((EStructuralFeature)ref);
    sFeature.setTable(table);
    clazz.getExternalFeatures().add(sFeature);

    DKey key = TableFactory.eINSTANCE.createDKey();
    table.setPrimaryKey(key);
    key.setDbName("primaryKey");

    for (EAnnotation annotation : JSONBufferExt.getRelatedFeatures(ref)) {
      DFeature feature = annotation.getReferences().get(0) instanceof EAttribute
          ? TableFactory.eINSTANCE.createDAttribute() : TableFactory.eINSTANCE.createDReference();
      feature.setDbName(getDBName(ref, annotation));
      feature.setJsonName(getJSONName(ref, annotation));
      feature.setEditable(true);
      feature.setExternal(false);
      feature.setFeature((EStructuralFeature)annotation.getReferences().get(0));
      feature.setMany(false);
      feature.setExportJson(true);

      key.getFeatures().add(feature);
      
      DKey indexKey = TableFactory.eINSTANCE.createDKey();
      table.getIndexKeys().add(indexKey);
      indexKey.setDbName(feature.getDbName());
      indexKey.getFeatures().add(feature);
      
      if (feature instanceof DAttribute) {
        table.getOwnedAttributes().add((DAttribute) feature);
      } else {
        table.getOwnedReferences().add((DReference) feature);
      }
    }
  }

  protected void createSchemaTable(SchemaClass clazz, EReference ref, Schema schema) {
    DTable table = TableFactory.eINSTANCE.createDTable();
    table.setDbName(getDBName(ref));
    table.setClassName(getClassName(ref));
    schema.getOwnedTables().add(table);
    
    SchemaFeature sFeature = DataFactory.eINSTANCE.createSchemaFeature();
    sFeature.setFeature((EStructuralFeature)ref);
    sFeature.setTable(table);
    clazz.getExternalFeatures().add(sFeature);
    
    DKey key = TableFactory.eINSTANCE.createDKey();
    table.setPrimaryKey(key);
    key.setDbName("primaryKey");

    for (EAnnotation annotation : JSONBufferExt.getRelatedFeatures(ref)) {
      DFeature feature = annotation.getReferences().get(0) instanceof EAttribute
          ? TableFactory.eINSTANCE.createDAttribute() : TableFactory.eINSTANCE.createDReference();
      feature.setDbName(getDBName(ref, annotation));
      feature.setJsonName(getJSONName(ref, annotation));
      feature.setEditable(true);
      feature.setMany(false);
      feature.setFeature((EStructuralFeature)annotation.getReferences().get(0));
      feature.setExternal(false);
      feature.setExportJson(true);
      
      key.getFeatures().add(feature);
      

      DKey indexKey = TableFactory.eINSTANCE.createDKey();
      table.getIndexKeys().add(indexKey);
      indexKey.setDbName(feature.getDbName());
      indexKey.getFeatures().add(feature);
      
      if (feature instanceof DAttribute) {
        table.getOwnedAttributes().add((DAttribute) feature);
      } else {
        table.getOwnedReferences().add((DReference) feature);
      }
    }
  }

  protected String getClassName(EClass clazz) {
    String name = clazz.getEAnnotation("database").getDetails().get("db_table");
    name = SchemaExt.toUpperFirst(name);
    return name;
  }
  protected String getClassName(EStructuralFeature ref) {
    String name = ref.getEAnnotation("database").getDetails().get("db_table");
    name = SchemaExt.toUpperFirst(name);
    return name;
  }
  
  protected String getDBName(EClass clazz) {
    String name = clazz.getEAnnotation("database").getDetails().get("db_table");
    return name;
  }
  
  protected String getDBName(EStructuralFeature ref) {
    String name = ref.getEAnnotation("database").getDetails().get("db_table");
    return name;
  }

  protected String getDBName(EStructuralFeature ref, EAnnotation feature) {
    return JSONBufferExt.getRelatedFeatureName(feature);
  }

  protected DTable createSchemaTable(SchemaClass sclazz, Schema schema) {
    EClass clazz = sclazz.getClazz();
    DTable table = TableFactory.eINSTANCE.createDTable();
    table.setDbName(getDBName(clazz));
    table.setClassName(SchemaExt.getClassName(clazz));
    schema.getOwnedTables().add(table);
    sclazz.setTable(table);

    DKey key = TableFactory.eINSTANCE.createDKey();
    table.setPrimaryKey(key);
    key.setDbName("primaryKey");
    HashMap<EStructuralFeature, DFeature> features = new HashMap<EStructuralFeature, DFeature>();

    for (EStructuralFeature feature : getAttributes(clazz)) {
      DAttribute attribute = TableFactory.eINSTANCE.createDAttribute();
      features.put(feature, attribute);
      attribute.setDbName(getDBName(clazz, feature));
      attribute.setJsonName(getJSONName(clazz, feature));
      attribute.setMany(feature.isMany());
      attribute.setFeature(feature);
      attribute.setEditable(isEditable(feature));
      attribute.setExternal(isExternal(feature));
      attribute.setExportJson(isExportJson(clazz, feature));
      table.getOwnedAttributes().add(attribute);
    }

    for (EStructuralFeature feature : getReferences(clazz)) {
      DReference reference = TableFactory.eINSTANCE.createDReference();
      features.put(feature, reference);
      reference.setDbName(getDBName(clazz, feature));
      reference.setJsonName(getJSONName(clazz, feature));
      reference.setFeature(feature);
      reference.setMany(feature.isMany());
      reference.setEditable(isEditable(feature));
      reference.setExternal(isExternal(feature));
      reference.setExportJson(isExportJson(clazz, feature));
      table.getOwnedReferences().add(reference);
    }

    for (EStructuralFeature feature : getPrimaryKey(clazz)) {
      DFeature dfeature = features.get(feature);
      if (dfeature != null) {
        key.getFeatures().add(dfeature);
      }
    }

    for (Collection<ENamedElement> index : getIndexKeys(clazz)) {
    	if (!index.isEmpty()) {
	      DKey indexKey = TableFactory.eINSTANCE.createDKey();
	      table.getIndexKeys().add(indexKey);
	      indexKey.setDbName("");
	      for (ENamedElement feature : index) {
	        DFeature dfeature = features.get(feature);
	        if (dfeature != null) {
	          indexKey.getFeatures().add(dfeature);
	  	      indexKey.setDbName(indexKey.getDbName()+dfeature.getDbName());
	        }
	      }
    	}
    }

    for (EStructuralFeature feature : getPrimaryKey(clazz)) {
      DFeature dfeature = features.get(feature);
      if (dfeature != null) {
        key.getFeatures().add(dfeature);
      }
    }

    return table;
  }

	private void createTableKeys(SchemaClass sclazz, Schema schema) {
		DTable table = sclazz.getTable();
		EClass clazz = sclazz.getClazz();
		
	    for (EAnnotation feature : getOrderingFeatures(clazz)) {
	    	Couple<EClass, EStructuralFeature> values = getOrderingFeatures(clazz, feature);
	    	DKeyValue indexKey = TableFactory.eINSTANCE.createDKeyValue();
	    	
	    	indexKey.setTable(SchemaExt.getTable(values.getK(), schema));
	    	indexKey.setFeature(getFeature(indexKey.getTable(), values.getV()));
	    	indexKey.setDbName(indexKey.getFeature().getDbName());
	    	
	    	//getDBNameVariable(values.getK(), getTable(values.getK(), tables).getPrimaryKey().getFeatures().iterator().next()));
		    //indexKey.setValue(getOrderingValue(schema, indexKey, getTable(values.getK(), tables), values.getV()));
		    table.getOrderingKeys().add(indexKey);
	    }

	    for (EAnnotation feature : getFilteringFeatures(clazz)) {
	    	Couple<EClass, EStructuralFeature> values = getOrderingFeatures(clazz, feature);
	    	DKeyValue indexKey = TableFactory.eINSTANCE.createDKeyValue();
	    	
	    	indexKey.setTable(SchemaExt.getTable(values.getK(), schema));
	    	indexKey.setFeature(getFeature(indexKey.getTable(), values.getV()));
	    	indexKey.setDbName(indexKey.getFeature().getDbName());
	    	
	    	//indexKey.setDbName(getDBNameVariable(values.getK(), getTable(values.getK(), tables).getPrimaryKey().getFeatures().iterator().next()));
		    //indexKey.setValue(getFilteringValue(schema, indexKey, getTable(values.getK(), tables), values.getV()));
		    table.getFilteringKeys().add(indexKey);
	    }
	    
	}
  



protected Couple<EClass, EStructuralFeature> getOrderingFeatures(EClass clazz, EAnnotation annotation) {
    ArrayList<EAnnotation> features = new ArrayList<EAnnotation>();
    EStructuralFeature feature = (EStructuralFeature)annotation.getReferences().get(0);
    if (annotation.getEAnnotation("orderingValue") != null) {
    	feature = (EStructuralFeature)annotation.getEAnnotation("orderingValue").getReferences().get(0);
    } else if (annotation.getEAnnotation("filteringValue") != null) {
    	feature = (EStructuralFeature)annotation.getEAnnotation("filteringValue").getReferences().get(0);
    }
    
    if (annotation.getEAnnotation("orderingTable") != null) {
    	clazz = (EClass)annotation.getEAnnotation("orderingTable").getReferences().get(0);
    } else if (annotation.getEAnnotation("filteringTable") != null) {
    	clazz = (EClass)annotation.getEAnnotation("filteringTable").getReferences().get(0);
    }
    return new Couple<EClass, EStructuralFeature>(clazz, feature);
  }

  protected Collection<EAnnotation> getOrderingFeatures(EClass clazz) {
    ArrayList<EAnnotation> features = new ArrayList<EAnnotation>();
    features.addAll(JSONBufferExt.getOrdering(clazz));
    return features;
  }

  protected Collection<EAnnotation> getFilteringFeatures(EClass clazz) {
    ArrayList<EAnnotation> features = new ArrayList<EAnnotation>();
    features.addAll(JSONBufferExt.getFiltering(clazz));
    return features;
  }

  protected Collection<Collection<ENamedElement>> getIndexKeys(EClass clazz) {
    return JSONBufferExt.getIndexes(clazz);
  }

  protected Collection<EStructuralFeature> getPrimaryKey(EClass clazz) {
    ArrayList<EStructuralFeature> features = new ArrayList<EStructuralFeature>();
    features.addAll(JSONBufferExt.getExportableIdentifier(clazz));
    return features;
  }

  protected Collection<EStructuralFeature> getAttributes(EClass clazz) {
    ArrayList<EStructuralFeature> features = new ArrayList<EStructuralFeature>();
    features.addAll(JSONBufferExt.getAttributes(clazz));
    return features;
  }

  protected Collection<EStructuralFeature> getReferences(EClass clazz) {
    ArrayList<EStructuralFeature> features = new ArrayList<EStructuralFeature>();
    features.addAll(JSONBufferExt.getUnaryReferences(clazz));
    //features.addAll(JSONBufferExt.getExternalReferences(clazz));
    return features;
  }

  protected String getDBName(EClass clazz, EStructuralFeature feature) {
    return JSONBufferExt.getExportableFeatureName(feature);
  }

  protected String getDBNameVariable(EClass clazz, DFeature dFeature) {
    String name = clazz.getName();
    String featureName = dFeature.getDbName();
    name = SchemaExt.toLowerFirst(name);
    name += SchemaExt.toUpperFirst(featureName);
    return name;
  }
  
  private boolean isExportJson(EClass clazz, EStructuralFeature feature) {
    try {
      return !clazz.getEAnnotation("database").getEAnnotation("excluded_toJSON").getReferences().contains(feature);
    } catch (Exception e) {
      return true;
    }
  }

  protected String getJSONName(EStructuralFeature reference, EAnnotation feature) {
    return JSONBufferExt.getRelatedFeatureName(feature);
  }

  protected String getJSONName(EClass clazz, EStructuralFeature feature) {
    return JSONBufferExt.getJSONExportableFeatureName(feature);
  }

  protected boolean isEditable(EStructuralFeature feature) {
    return !(feature.getEAnnotation("database").getDetails().containsKey("edit")
        && "false".equals(feature.getEAnnotation("database").getDetails().get("edit")));
  }

  protected boolean isExternal(EStructuralFeature feature) {
    return JSONBufferExt.isExternal(feature);
  }
}
