package org.pdulvp.data.appgen.site.filter;

import java.util.function.Predicate;

import org.eclipse.emf.ecore.EStructuralFeature;

public class ExportableFeature implements Predicate<EStructuralFeature> {

	@Override
	public boolean test(EStructuralFeature feature) {
		return feature.getEAnnotation("database") != null && feature.getEAnnotation("deprecated") == null;
	}

}
