package org.pdulvp.data.appgen.site;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.map.MultiValueMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.pdulvp.data.DataPackage;
import org.pdulvp.data.Item;
import org.pdulvp.data.Schema;
import org.pdulvp.data.SchemaClass;
import org.pdulvp.data.appgen.site.filter.ExportableAttribute;
import org.pdulvp.data.appgen.site.filter.ExportableExternalAttribute;
import org.pdulvp.data.appgen.site.filter.ExportableExternalReference;
import org.pdulvp.data.appgen.site.filter.ExportableManyReference;
import org.pdulvp.data.appgen.site.filter.ExportableReference;
import org.pdulvp.data.appgen.site.filter.ExportableUnaryReference;
import org.pdulvp.data.appgen.site.filter.ExternalAttributeType;
import org.pdulvp.data.table.DFeature;
import org.pdulvp.data.table.DKey;
import org.pdulvp.data.table.DTable;

import com.juuyi.java.util.Base64Codec;

public class JSONBufferExt {

  public static String toJSON(HashMap<String, Object> values) {
    StringBuffer buffer = new StringBuffer();
    buffer.append("{");

    Iterator<String> keys = values.keySet().iterator();
    while (keys.hasNext()) {
      String key = keys.next();
      buffer.append("\"" + key + "\"");
      buffer.append(":");

      Object res = values.get(key);
      if (res instanceof String) {
        buffer.append("\"" + res + "\"");

      } else if (res instanceof Boolean) {
        buffer.append(((Boolean) res).booleanValue());

      } else if (res instanceof Integer) {
        buffer.append(((Integer) res).intValue());

      } else if (res instanceof HashMap) {
        buffer.append(toJSON((HashMap) res));

      } else if (res instanceof Collection) {
        buffer.append("[");
        Collection<String> resC = (Collection) res;
        Iterator<String> itRes = resC.iterator();
        while (itRes.hasNext()) {
          String itRe = itRes.next();
          buffer.append("\"" + itRe + "\"");
          if (itRes.hasNext()) {
            buffer.append(",");
          }
        }
        buffer.append("]");
      }

      if (keys.hasNext()) {
        buffer.append(",");
      }
    }
    buffer.append("}");
    return buffer.toString();
  }

  public static String toJSONList(MultiValueMap<String, String> values) {
    StringBuffer buffer = new StringBuffer();
    buffer.append("{");

    Iterator<String> keys = values.keySet().iterator();
    while (keys.hasNext()) {
      String key = keys.next();
      buffer.append("\"" + key + "\"");
      buffer.append(":");

      if (keys.hasNext()) {
        buffer.append(",");
      }
    }
    buffer.append("}");
    return buffer.toString();
  }

  public static Collection<EAnnotation> getRelatedFeatures(EStructuralFeature reference) {
    Collection<EAnnotation> features = new ArrayList<EAnnotation>();

    EAnnotation sourceId = reference.getEAnnotation("database").getEAnnotation("sourceFeature");
    if (sourceId != null) {
      features.add(sourceId);
    }

    EAnnotation targetId = reference.getEAnnotation("database").getEAnnotation("targetFeature");
    if (targetId != null) {
      features.add(targetId);
    }

    return features;
  }

  public static boolean isDBTable(ENamedElement reference) {
    if (reference.getEAnnotation("database") != null) {
      return reference.getEAnnotation("database").getDetails().containsKey("db_table");
    }
    return false;
  }

  public static String getDBTable(ENamedElement reference) {
    return reference.getEAnnotation("database").getDetails().get("db_table");
  }

  public static String getRelatedFeatureName(EAnnotation feature) {
    return feature.getDetails().get("name");
  }

  public static Collection<String> getRelatedFeatureValues(EObject current, EStructuralFeature reference,
      EAnnotation feature) {
    ArrayList<String> result = new ArrayList<String>();
    EObject value = current;
    Collection<EObject> toVisit = new ArrayList<EObject>();
    if (feature.getSource().equals("targetFeature")) {
      value = null;
      if (reference.isMany()) {
        if (!((EList) current.eGet(reference)).isEmpty()) {
          toVisit.addAll(((EList) current.eGet(reference)));
        }
      } else if (current.eGet(reference) instanceof EObject) {
        toVisit.add((EObject) current.eGet(reference));
      }
    } else {
      toVisit.add(value);
    }

    for (EObject object : toVisit) {
      EStructuralFeature targetFeature = ((EStructuralFeature) feature.getReferences().get(0));
      result.add((String) (object.eGet(targetFeature)));
    }

    return result;
  }

  public static boolean getRelatedFeatureIsMany(EStructuralFeature reference, EAnnotation feature) {
    if (feature.getSource().equals("targetFeature")) {
      return reference.isMany();
    }
    return false;
  }

  public static Collection<EAnnotation> getFiltering(EClass object) {
    ArrayList<EAnnotation> result = new ArrayList<EAnnotation>();
    if (object.getEAnnotation("database").getEAnnotation("filtering") != null) {
      result.add(object.getEAnnotation("database").getEAnnotation("filtering"));
    }
    return result;
  }

  public static Collection<EAnnotation> getOrdering(EClass object) {
    ArrayList<EAnnotation> result = new ArrayList<EAnnotation>();
    if (object.getEAnnotation("database").getEAnnotation("ordering") != null) {
      result.add(object.getEAnnotation("database").getEAnnotation("ordering"));
    }
    return result;
  }

  public static Collection<Collection<ENamedElement>> getIndexes(EClass object) {
    ArrayList<Collection<ENamedElement>> result = new ArrayList<Collection<ENamedElement>>();
    Collection<ENamedElement> res = new ArrayList<ENamedElement>();

    String ii = "";
    int i = 0;
    while (object.getEAnnotation("database").getEAnnotation("indexKey" + ii) != null) {
      for (EObject reference : object.getEAnnotation("database").getEAnnotation("indexKey" + ii).getReferences()) {
        if (reference instanceof ENamedElement) {
          res.add((ENamedElement) reference);
        }
      }
      ii = "_" + (++i);
    }
    result.add(res);
    return result;
  }

  public static Collection<EStructuralFeature> getExportableIdentifier(EClass object) {
    ArrayList<EStructuralFeature> result = new ArrayList<EStructuralFeature>();
    if (object.getEAnnotation("database").getEAnnotation("primaryKey") != null) {
      for (EObject reference : object.getEAnnotation("database").getEAnnotation("primaryKey").getReferences()) {
        if (reference instanceof EStructuralFeature) {
          result.add((EStructuralFeature) reference);
        }
      }
    }
    return result;
  }

  public static String getJSONExportableFeatureName(ENamedElement feature) {
    if (feature.getEAnnotation("database").getDetails().containsKey("json_id")) {
      return feature.getEAnnotation("database").getDetails().get("json_id");
    }
    return feature.getEAnnotation("database").getDetails().get("db_id");
  }

  public static String getExportableFeatureName(ENamedElement feature) {
    if (feature.getEAnnotation("database").getDetails().get("db_table") != null) {
      return feature.getEAnnotation("database").getDetails().get("db_table");
    }
    ;
    return feature.getEAnnotation("database").getDetails().get("db_id");
  }
  
  public static <T> Collection<T> eGet(EObject object, EStructuralFeature feature) {
    if (feature.isMany()) {
      return (EList<T>)object.eGet(feature);
    }
    return Collections.singletonList((T)object.eGet(feature));
  }

  public static Object getExportableFeatureValue(EObject object, EStructuralFeature feature) {
    if (DataPackage.Literals.ABSTRACT_ITEM__ID.equals(feature)) {
      return ((object.eGet(feature)));

    } else if (DataPackage.Literals.IMAGE_ITEM__PACKS.equals(feature)) {
      return ImageHelper.getPacks((Item) object);

    } else if (DataPackage.Literals.ABSTRACT_ITEM__TAG.equals(feature)) {
      return ((object.eGet(feature)));

    } else if (new ExportableExternalAttribute().evaluate(feature)) {
      if (DataPackage.Literals.IMAGE_ITEM__ICON_DATA.equals(feature)) {
        return ImageHelper.getIconData((Item) object);

      } else if (DataPackage.Literals.IMAGE_ITEM__IMAGE_DATA.equals(feature)) {
        return ImageHelper.getImageData((Item) object);

      } else if (new ExternalAttributeType().evaluate(feature)) {
        return toJSonExternalAttribute(feature, (EObject) object.eGet(feature));
      }

    }
    try {
      if (object.eGet(feature) instanceof Boolean) {
        return ((object.eGet(feature)));

      } else if (feature.getName().toLowerCase().contains("name")) {
        if (object.eGet(feature) != null) {
          if (((String) (object.eGet(feature))).length() > 0) {
            String is = EObjectExt.getText((String) (object.eGet(feature)));
            return new String(Base64Codec.getEncoder().encode(is.getBytes("UTF-8")));
          }
        } else {
          return null;
        }

        // return (object.eGet( feature));
      } else if (feature.eContainer().equals(DataPackage.Literals.METADATAS)) {
        if (object.eGet(feature) != null) {
          if (((String) (object.eGet(feature))).length() > 0) {
            String is = EObjectExt.getText((String) (object.eGet(feature)));
            return new String(Base64Codec.getEncoder().encode(is.getBytes("UTF-8")));
          }
        } else {
          return null;
        }
      }

      return (object.eGet(feature));

    } catch (Exception e) {
      // e.printStackTrace();
    }
    return null;
  }

  private static HashMap<String, Object> toJSonExternalAttribute(EStructuralFeature aa, EObject object) {
    HashMap<String, Object> values = new HashMap<String, Object>();

    if (object != null) {

      for (EStructuralFeature feature : JSONBufferExt.getAttributes(object.eClass())) {
        if (new ExportableExternalAttribute().evaluate(feature)) {
          Object value = JSONBufferExt.getExportableFeatureValue(object, feature);
          if (value != null && (value instanceof String && !((String) value).isEmpty())) {
            values.put(JSONBufferExt.getExportableFeatureName(feature), value);
          }
        }
      }

    }
    return values;
  }

  public static Collection<EStructuralFeature> getAttributes(EClass clazz) {
    return CollectionUtils.select(clazz.getEAllStructuralFeatures(), new ExportableAttribute());
  }

  public static boolean isExternal(ENamedElement feature) {
    return feature.getEAnnotation("database").getDetails().containsKey("external");
  }

  public static Collection<EStructuralFeature> getExternalAttributes(EClass clazz) {
    return CollectionUtils.select(clazz.getEAllStructuralFeatures(), new ExportableExternalAttribute());
  }

  public static Collection<EStructuralFeature> getExternalReferences(EClass clazz) {
    return CollectionUtils.select(clazz.getEAllStructuralFeatures(), new ExportableExternalReference());
  }

  public static Collection<EStructuralFeature> getReferences(EClass clazz) {
    return CollectionUtils.select(clazz.getEAllStructuralFeatures(), new ExportableReference());
  }

  public static Collection<EStructuralFeature> getManyReferences(EClass clazz) {
    return CollectionUtils.select(clazz.getEAllStructuralFeatures(), new ExportableManyReference());
  }

  public static Collection<EStructuralFeature> getUnaryReferences(EClass clazz) {
    return CollectionUtils.select(clazz.getEAllStructuralFeatures(), new ExportableUnaryReference());
  }

  public static Collection<ENamedElement> getTables(Schema schema) {
    List<ENamedElement> clazzes = new ArrayList<ENamedElement>();
    for (SchemaClass clazz : schema.getOwnedClasses()) {
      if (clazz.getClazz() != null) {
        clazzes.add(clazz.getClazz());
      }
    }

    clazzes = getTables(clazzes);
    Collections.sort(clazzes, new Comparator<ENamedElement>() {

      @Override
      public int compare(ENamedElement o1, ENamedElement o2) {
        return o1.getName().compareTo(o2.getName());
      }
    });
    return clazzes;
  }

  public static List<ENamedElement> getTables(Collection<ENamedElement> clazzes_p) {
    Collection<ENamedElement> clazzes = new HashSet<ENamedElement>();
    for (ENamedElement clazz : clazzes_p) {
      if (clazz instanceof EClass) {
        if (isDBTable(clazz)) {
          clazzes.add(clazz);
        }

        for (EStructuralFeature ref : ((EClass) clazz).getEAllStructuralFeatures()) {
          if (isDBTable(ref)) {
            clazzes.add(ref);
          }
        }

      }

    }
    return new ArrayList<ENamedElement>(clazzes);
  }

  public static HashMap<String, Object> getPrimaryKeyValues(DTable table, EObject object) {

    HashMap<String, Object> primaryValues = new LinkedHashMap<String, Object>();
    DKey primary = table.getPrimaryKey();
    for (DFeature primaryAttribute : primary.getFeatures()) {
      Object value = JSONBufferExt.getExportableFeatureValue(object, primaryAttribute.getFeature());
      if (value != null) {
        primaryValues.put(primaryAttribute.getDbName(), value);
      }
    }
    return primaryValues;
  }

}
