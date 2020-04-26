package org.pdulvp.data.appgen.site.filter;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

public class ExportableReference extends ExportableFeature {

	@Override
	public boolean test(EStructuralFeature feature) {
		return super.test(feature) && feature instanceof EReference;
	}

}
