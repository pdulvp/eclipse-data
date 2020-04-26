package org.pdulvp.data.appgen.site.filter;

import org.eclipse.emf.ecore.EStructuralFeature;

public class ExternalAttributeType extends ExportableFeature {

	@Override
	public boolean test(EStructuralFeature feature) {
		return super.test(feature) && feature.getEType().getEAnnotation("database") != null && feature.getEType().getEAnnotation("database").getDetails().containsKey("external");
	}

}
