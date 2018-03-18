package org.pdulvp.data.appgen.site.filter;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

public class ExportableReference extends ExportableFeature {

	@Override
	public boolean evaluate(EStructuralFeature feature) {
		return super.evaluate(feature) && feature instanceof EReference;
	}

}
