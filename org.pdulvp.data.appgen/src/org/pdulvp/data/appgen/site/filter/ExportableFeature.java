package org.pdulvp.data.appgen.site.filter;

import org.apache.commons.collections4.Predicate;
import org.eclipse.emf.ecore.EStructuralFeature;

public class ExportableFeature implements Predicate<EStructuralFeature> {

	@Override
	public boolean evaluate(EStructuralFeature feature) {
		return feature.getEAnnotation("database") != null && feature.getEAnnotation("deprecated") == null;
	}

}
