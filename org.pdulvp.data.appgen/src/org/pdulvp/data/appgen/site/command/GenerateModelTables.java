package org.pdulvp.data.appgen.site.command;

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
    	new ModelTableTemplater(schema, tableFolder).accept(table);
    	new ModelTemplater(schema, modelFolder).accept(table);
    }

    new ControllersTemplater(schema, controllerFolder).accept(schema.eClass());
    new FactoriesTemplater(schema, v2Folder).accept(schema.eClass());

  }


  public static void createSchemaTable(SchemaClass clazz, EAttribute ref, Schema schema) {
    DTable table = TableFactory.eINSTANCE.createDTable();
    table.setDbName(JSONBufferExt.getDBName(ref));
    table.setClassName(JSONBufferExt.getClassName(ref));
    schema.getOwnedTables().add(table);
    
    SchemaFeature sFeature = DataFactory.eINSTANCE.createSchemaFeature();
    sFeature.setFeature((EStructuralFeature)ref);
    sFeature.setTable(table);
    clazz.getExternalFeatures().add(sFeature);

    DKey key = TableFactory.eINSTANCE.createDKey();
    table.setPrimaryKey(key);
    key.setDbName("primaryKey");

    for (EAnnotation annotation : JSONBufferExt.getRelatedFeatures(clazz, ref)) {
      DFeature feature = annotation.getReferences().get(0) instanceof EAttribute
          ? TableFactory.eINSTANCE.createDAttribute() : TableFactory.eINSTANCE.createDReference();
      feature.setDbName(JSONBufferExt.getDBName(ref, annotation));
      feature.setJsonName(JSONBufferExt.getJSONName(ref, annotation));
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

  public static void createSchemaTable(SchemaClass clazz, EReference ref, Schema schema) {
    DTable table = TableFactory.eINSTANCE.createDTable();
    table.setDbName(JSONBufferExt.getDBName(ref));
    table.setClassName(JSONBufferExt.getClassName(ref));
    schema.getOwnedTables().add(table);
    
    SchemaFeature sFeature = DataFactory.eINSTANCE.createSchemaFeature();
    sFeature.setFeature((EStructuralFeature)ref);
    sFeature.setTable(table);
    clazz.getExternalFeatures().add(sFeature);
    
    DKey key = TableFactory.eINSTANCE.createDKey();
    table.setPrimaryKey(key);
    key.setDbName("primaryKey");

    for (EAnnotation annotation : JSONBufferExt.getRelatedFeatures(clazz, ref)) {
      DFeature feature = annotation.getReferences().get(0) instanceof EAttribute
          ? TableFactory.eINSTANCE.createDAttribute() : TableFactory.eINSTANCE.createDReference();
      feature.setDbName(JSONBufferExt.getDBName(ref, annotation));
      feature.setJsonName(JSONBufferExt.getJSONName(ref, annotation));
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

  public static DTable createSchemaTable(SchemaClass sclazz, Schema schema) {
    EClass clazz = sclazz.getClazz();
    DTable table = TableFactory.eINSTANCE.createDTable();
    table.setDbName(JSONBufferExt.getDBName(clazz));
    table.setClassName(SchemaExt.getClassName(clazz));
    schema.getOwnedTables().add(table);
    sclazz.setTable(table);

    DKey key = TableFactory.eINSTANCE.createDKey();
    table.setPrimaryKey(key);
    key.setDbName("primaryKey");
    HashMap<EStructuralFeature, DFeature> features = new HashMap<EStructuralFeature, DFeature>();

    for (EStructuralFeature feature : JSONBufferExt.getAttributes(clazz)) {
      DAttribute attribute = TableFactory.eINSTANCE.createDAttribute();
      features.put(feature, attribute);
      attribute.setDbName(JSONBufferExt.getDBName(clazz, feature));
      attribute.setJsonName(JSONBufferExt.getJSONName(clazz, feature));
      attribute.setMany(feature.isMany());
      attribute.setFeature(feature);
      attribute.setEditable(JSONBufferExt.isEditable(feature));
      attribute.setExternal(JSONBufferExt.isExternal(feature));
      attribute.setExportJson(JSONBufferExt.isExportJson(clazz, feature));
      table.getOwnedAttributes().add(attribute);
    }

    for (EStructuralFeature feature : JSONBufferExt.getUnaryReferences(clazz)) {
      DReference reference = TableFactory.eINSTANCE.createDReference();
      features.put(feature, reference);
      reference.setDbName(JSONBufferExt.getDBName(clazz, feature));
      reference.setJsonName(JSONBufferExt.getJSONName(clazz, feature));
      reference.setFeature(feature);
      reference.setMany(feature.isMany());
      reference.setEditable(JSONBufferExt.isEditable(feature));
      reference.setExternal(JSONBufferExt.isExternal(feature));
      reference.setExportJson(JSONBufferExt.isExportJson(clazz, feature));
      table.getOwnedReferences().add(reference);
    }

    for (EStructuralFeature feature : JSONBufferExt.getPrimaryKey(clazz)) {
      DFeature dfeature = features.get(feature);
      if (dfeature != null) {
        key.getFeatures().add(dfeature);
      }
    }

    for (Collection<ENamedElement> index : JSONBufferExt.getIndexKeys(clazz)) {
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

    for (EStructuralFeature feature : JSONBufferExt.getPrimaryKey(clazz)) {
      DFeature dfeature = features.get(feature);
      if (dfeature != null) {
        key.getFeatures().add(dfeature);
      }
    }

    return table;
  }

  public static void createTableKeys(SchemaClass sclazz, Schema schema) {
		DTable table = sclazz.getTable();
		EClass clazz = sclazz.getClazz();
		
	    for (EAnnotation feature : JSONBufferExt.getOrderingFeatures(clazz)) {
	    	Couple<EClass, EStructuralFeature> values = JSONBufferExt.getOrderingFeatures(clazz, feature);
	    	DKeyValue indexKey = TableFactory.eINSTANCE.createDKeyValue();
	    	
	    	indexKey.setTable(SchemaExt.getTable(values.getK(), schema));
	    	indexKey.setFeature(JSONBufferExt.getFeature(indexKey.getTable(), values.getV()));
	    	indexKey.setDbName(indexKey.getFeature().getDbName());
	    	
	    	//getDBNameVariable(values.getK(), getTable(values.getK(), tables).getPrimaryKey().getFeatures().iterator().next()));
		    //indexKey.setValue(getOrderingValue(schema, indexKey, getTable(values.getK(), tables), values.getV()));
		    table.getOrderingKeys().add(indexKey);
	    }

	    for (EAnnotation feature : JSONBufferExt.getFilteringFeatures(clazz)) {
	    	Couple<EClass, EStructuralFeature> values = JSONBufferExt.getOrderingFeatures(clazz, feature);
	    	DKeyValue indexKey = TableFactory.eINSTANCE.createDKeyValue();
	    	
	    	indexKey.setTable(SchemaExt.getTable(values.getK(), schema));
	    	indexKey.setFeature(JSONBufferExt.getFeature(indexKey.getTable(), values.getV()));
	    	indexKey.setDbName(indexKey.getFeature().getDbName());
	    	
	    	//indexKey.setDbName(getDBNameVariable(values.getK(), getTable(values.getK(), tables).getPrimaryKey().getFeatures().iterator().next()));
		    //indexKey.setValue(getFilteringValue(schema, indexKey, getTable(values.getK(), tables), values.getV()));
		    table.getFilteringKeys().add(indexKey);
	    }
	    
	}
  


}
