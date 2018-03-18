package org.pdulvp.data.appgen.site.filter;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

public class ExportableAttribute extends ExportableFeature {

	@Override
	public boolean evaluate(EStructuralFeature feature) {
		if (super.evaluate(feature)) {
			if (feature instanceof EAttribute ) {
				return true;
				
			} else if ( feature instanceof EReference && !feature.isMany() && feature.getEAnnotation("database").getDetails().containsKey("external")) {
				return  feature.getEType().getEAnnotation("database").getDetails().containsKey("external");
			}
		}
		return false;
	}

}
