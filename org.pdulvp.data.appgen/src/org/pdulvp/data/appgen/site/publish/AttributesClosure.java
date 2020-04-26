package org.pdulvp.data.appgen.site.publish;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.function.Consumer;

import org.eclipse.emf.ecore.EObject;
import org.pdulvp.data.Application;
import org.pdulvp.data.SchemaClass;
import org.pdulvp.data.appgen.site.JSONBufferExt;
import org.pdulvp.data.appgen.site.SchemaExt;
import org.pdulvp.data.table.DAttribute;
import org.pdulvp.data.table.DKey;
import org.pdulvp.data.table.DTable;

public class AttributesClosure implements Consumer<EObject> {

  Application application ;
  
  String url;

  public AttributesClosure(Application application, String url_p) {
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
    for (DAttribute attribute : table.getOwnedAttributes()) {
      if (!attribute.isMany() && !primary.getFeatures().contains(attribute)) {
        Object value = JSONBufferExt.getExportableFeatureValue(object, attribute.getFeature());
        if (value != null) {
          values.put(attribute.getDbName(), value);
        }
      }
    }
    
    String route = SchemaExt.getRoute(application.getSchema());
    String uri = application.getServerUrl() + "/"+route+"/" + url + "/edit";
    String value = JSONBufferExt.toJSON(values);
    System.out.println();
    //HttpRequest.make(uri, value);
  }
}