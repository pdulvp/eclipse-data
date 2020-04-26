package org.pdulvp.data.appgen.site;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.json.JSONException;
import org.json.JSONObject;
import org.pdulvp.data.DataFactory;
import org.pdulvp.data.DataPackage;

public class ElementFactory {

	public static EObject create(JSONObject object, String type) {
		EObject result = null;
		try {
			 if (object.has("error")) {
			return null;
		}
		if (object.has("type")) {
			type = object.getString("type");
		}
		if (type != null) {
			result = DataFactory.eINSTANCE.create((EClass)DataPackage.eINSTANCE.getEClassifier("Category"));

	    	List<Object> keys = new ArrayList<>();
	    	object.keys().forEachRemaining(keys::add);
	    	
			for (Object attribute : keys) {
				EStructuralFeature feature = result.eClass().getEStructuralFeature((String)attribute);
				if (feature != null && ("id".equals(feature.getName()) || "name".equals(feature.getName()))) {
					String value = (String)object.get((String)attribute);
					result.eSet(feature, value);
				}
			}
		}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return result;
	}

}
