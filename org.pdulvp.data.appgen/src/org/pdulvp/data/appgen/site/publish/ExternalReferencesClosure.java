package org.pdulvp.data.appgen.site.publish;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Consumer;

import org.eclipse.emf.ecore.EObject;
import org.pdulvp.common.http.HttpRequest;
import org.pdulvp.data.Application;
import org.pdulvp.data.SchemaClass;
import org.pdulvp.data.SchemaFeature;
import org.pdulvp.data.appgen.site.JSONBufferExt;
import org.pdulvp.data.appgen.site.SchemaExt;
import org.pdulvp.data.table.DFeature;
import org.pdulvp.data.table.DKey;
import org.pdulvp.data.table.DTable;

public class ExternalReferencesClosure implements Consumer<EObject> {

  Application application;
  String url;

  public ExternalReferencesClosure(Application application, String url_p) {
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

    HashMap<String, Object> primaryValues = JSONBufferExt.getPrimaryKeyValues(table, object);

    for (SchemaFeature sfeature : clazz.getExternalFeatures()) {

      DTable subTable = sfeature.getTable();
      DKey subprimary = subTable.getPrimaryKey();
      DFeature sourceFeature = subprimary.getFeatures().get(0);
      DFeature targetFeature = subprimary.getFeatures().get(1);

      String url2 = subTable.getDbName();
      if (url2 != null) {
        url = url2;
      }

      HashMap<String, Object> values = new LinkedHashMap<String, Object>();
      // Source Value
      if (primaryValues.size() == 1) {
        values.put(sourceFeature.getDbName(), primaryValues.get(primaryValues.keySet().iterator().next()));
      } else {
        throw new RuntimeException("A source value has many primaryKey.features");
      }

      values.put(targetFeature.getDbName(), new ArrayList<Object>());
      
      // Target Value
      for (Object evalue : JSONBufferExt.eGet(object, sfeature.getFeature())) {
        EObject tvalue = (EObject) evalue;
        if (tvalue != null) {
          SchemaClass valueClazz = SchemaExt.getSchemaClass(tvalue.eClass(), application.getSchema());
          HashMap<String, Object> primaryValueValues = JSONBufferExt.getPrimaryKeyValues(valueClazz.getTable(), tvalue);
          if (primaryValueValues.size() == 1) {
            ((List)values.get(targetFeature.getDbName())).add(
                primaryValueValues.get(primaryValueValues.keySet().iterator().next()));
          } else {
            throw new RuntimeException("A referenced value has many primaryKey.features");
          }

        } else {
          // we should remove value
        }

        String route = SchemaExt.getRoute(application.getSchema());
        String uri = application.getServerUrl() + "/" + route + "/" + url + "/edit";
        String value = JSONBufferExt.toJSON(values);

        HttpRequest.make(uri, value);
      }

      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

  }
}