package org.pdulvp.data.appgen.site.publish;

import java.util.HashMap;
import java.util.function.Consumer;

import org.eclipse.emf.ecore.EObject;
import org.pdulvp.data.Application;
import org.pdulvp.data.appgen.site.JSONBufferExt;
import org.pdulvp.data.appgen.site.SchemaExt;
import org.pdulvp.data.table.DReference;

public class ReferenceClosure implements Consumer<DReference> {

  Application application ;
  String url;
  EObject object;

  public ReferenceClosure(Application application, EObject object_p, String url_p) {
    url = url_p;
    object = object_p;
    this.application = application;
    if (application == null) {
      throw new RuntimeException();
    }
  }

  @Override
  public void accept(final DReference dreference) {
    String url2 = JSONBufferExt.getDBTable(dreference.getFeature());
    if (url2 == null) {
      url2 = url;
    }

    HashMap<String, Object> values = new HashMap<String, Object>();

    String route = SchemaExt.getRoute(application.getSchema());

    /*
    Collection<ENamedElement> identifiers = JSONBufferExt.getExportableIdentifier(object.eClass());
    for (ENamedElement feature : identifiers) {
      Object value = JSONBufferExt.getExportableFeatureValue(object, feature);
      if (value != null) {
        values.put(JSONBufferExt.getExportableFeatureName(feature), value);
      }
    }
    Collection<EAnnotation> features = JSONBufferExt.getRelatedFeatures(reference);
    for (EAnnotation feature : features) {
      String name = JSONBufferExt.getRelatedFeatureName(reference, feature);
      for (String value : JSONBufferExt.getRelatedFeatureValues(object, reference, feature)) {
        if (JSONBufferExt.getRelatedFeatureIsMany(reference, feature)) {
          if (!values.containsKey(name)) {
            values.put(name, new ArrayList<String>());
          }
          ((List) values.get(name)).add(value);
        } else {
          values.put(name, value);
        }
      }
    }

    if (values.size() == features.size() + identifiers.size()) {
      String object = JSONBufferExt.toJSON(values);
      System.out.println(url);
      System.out.println(object);
      //Object result = AbstractDataManager
      //    .syncRequestPost(AbstractDataManager.SERVER + "/" + route + "/" + url2 + "/edit", object, true);
      System.out.println(result);
    }*/

  }
}