package org.pdulvp.data.appgen.site;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.json.JSONObject;
import org.pdulvp.data.DataFactory;
import org.pdulvp.data.DataPackage;

public class ElementFactory {

	public static EObject create(JSONObject object, String type) {
		if (object.has("error")) {
			return null;
		}
		if (object.has("type")) {
			type = object.getString("type");
		}
		EObject result = null;
		if (type != null) {
			result = DataFactory.eINSTANCE.create((EClass)DataPackage.eINSTANCE.getEClassifier("Category"));
			for (Object attribute : object.keySet()) {
				EStructuralFeature feature = result.eClass().getEStructuralFeature((String)attribute);
				if (feature != null && ("id".equals(feature.getName()) || "name".equals(feature.getName()))) {
					String value = (String)object.get((String)attribute);
					result.eSet(feature, value);
				}
			}
		}
		return result;
	}

}
