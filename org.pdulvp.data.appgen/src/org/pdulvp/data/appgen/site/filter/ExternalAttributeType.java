package org.pdulvp.data.appgen.site.filter;

import org.eclipse.emf.ecore.EStructuralFeature;

public class ExternalAttributeType extends ExportableFeature {

	@Override
	public boolean evaluate(EStructuralFeature feature) {
		return super.evaluate(feature) && feature.getEType().getEAnnotation("database") != null && feature.getEType().getEAnnotation("database").getDetails().containsKey("external");
	}

}
