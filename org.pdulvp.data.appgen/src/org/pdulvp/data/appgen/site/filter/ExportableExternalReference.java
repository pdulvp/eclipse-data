package org.pdulvp.data.appgen.site.filter;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

public class ExportableExternalReference extends ExportableFeature {

  @Override
  public boolean evaluate(EStructuralFeature feature) {
    if (super.evaluate(feature) && feature.isMany()) {
      if (feature instanceof EReference && feature.getEAnnotation("database").getDetails().containsKey("external")) {
        return true;

      } else if (feature instanceof EReference
          && feature.getEAnnotation("database").getDetails().containsKey("external")) {
        return feature.getEType().getEAnnotation("database").getDetails().containsKey("external");
      }
    }
    return false;
  }

}
