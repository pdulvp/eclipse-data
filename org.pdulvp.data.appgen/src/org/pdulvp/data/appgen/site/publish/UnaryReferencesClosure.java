package org.pdulvp.data.appgen.site.publish;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.function.Consumer;

import org.eclipse.emf.ecore.EObject;
import org.pdulvp.common.http.HttpRequest;
import org.pdulvp.data.Application;
import org.pdulvp.data.SchemaClass;
import org.pdulvp.data.appgen.site.JSONBufferExt;
import org.pdulvp.data.appgen.site.SchemaExt;
import org.pdulvp.data.table.DKey;
import org.pdulvp.data.table.DReference;
import org.pdulvp.data.table.DTable;

public class UnaryReferencesClosure implements Consumer<EObject> {

  Application application ;
	String url;

	public UnaryReferencesClosure(Application application,String url_p) {
		url = url_p;
    this.application = application;
    if (application == null) {
      throw new RuntimeException();
    }
	}

	@Override
	public void accept(final EObject object) {

    SchemaClass clazz = SchemaExt.getSchemaClass(object.eClass(), application.getSchema());
    DTable table = clazz.getTable();

    DKey primary = table.getPrimaryKey();
    HashMap<String, Object> primaryValues = JSONBufferExt.getPrimaryKeyValues(table, object);
    
    HashMap<String, Object> values = new LinkedHashMap<String, Object>(primaryValues);
    for (DReference attribute : table.getOwnedReferences()) {
      if (!attribute.isExternal() && !attribute.isMany() && !primary.getFeatures().contains(attribute)) {
        
        EObject value = (EObject)JSONBufferExt.eGet(object, attribute.getFeature()).iterator().next();
        if (value != null) {
          SchemaClass valueClazz = SchemaExt.getSchemaClass(value.eClass(), application.getSchema());
          HashMap<String, Object> primaryValueValues = JSONBufferExt.getPrimaryKeyValues(valueClazz.getTable(), value);
          if (primaryValueValues.size() == 1) {
            values.put(attribute.getDbName(), primaryValueValues.get(primaryValueValues.keySet().iterator().next()));
          } else {
            throw new RuntimeException("A referenced value has many primaryKey.features");
          }
          
        } else {
          //we should remove value 
        }
      }
    }

    String route = SchemaExt.getRoute(application.getSchema());
    String uri = application.getServerUrl() + "/"+route+"/" + url + "/edit";
    String value = JSONBufferExt.toJSON(values);
    HttpRequest.make(uri, value);
    
	}
}