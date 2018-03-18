package org.pdulvp.data.appgen.site.filter;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

public class ExportableUnaryReference extends ExportableFeature {

	@Override
	public boolean evaluate(EStructuralFeature feature) {
		return super.evaluate(feature) && feature instanceof EReference && !feature.isMany() && !(new ExportableExternalAttribute().evaluate(feature));
	}

}
