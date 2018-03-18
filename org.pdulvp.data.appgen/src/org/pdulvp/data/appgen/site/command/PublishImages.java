package org.pdulvp.data.appgen.site.command;

import java.util.Collection;
import java.util.function.Predicate;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.pdulvp.common.commands.TransactionalProgressCommandHandler;

public class PublishImages extends TransactionalProgressCommandHandler {

  protected Predicate enablement(IStructuredSelection selection) {
    return ca -> false;
  }
  
  @Override
  public void proceed(Collection<Object> selection, ExecutionEvent event_p, IProgressMonitor monitor_p) {
    EObject root = (EObject) (selection.iterator().next());

    for (Object o : selection) {

    }

    /*
     * if (obj instanceof Item) {
     * 
     * // if (((Item) obj).getGIcon16Path() == null || ((Item) obj).getGIcon16Path().isEmpty()) {
     * ImageHelper.updateImage(((Item) obj)); // }
     * 
     * EObjectExt.apply(new AttributesClosure("items"), Collections.singleton((EObject) obj).iterator(),
     * DataPackage.Literals.ITEM, monitor_p); EObjectExt.apply(new ExternalReferencesClosure("items"),
     * Collections.singleton((EObject) obj).iterator(), DataPackage.Literals.ITEM, monitor_p);
     * 
     * } else if (obj instanceof ItemRoot) { Resource categories = root.eResource().getResourceSet()
     * .getResource(URI.createPlatformResourceURI("/base/images.data", true), true); ItemRoot rootElement = (ItemRoot)
     * categories.getContents().get(0);
     * 
     * EObjectExt.apply(new AttributesClosure("items"), rootElement.eAllContents(), DataPackage.Literals.ITEM,
     * monitor_p); EObjectExt.apply(new ExternalReferencesClosure("items"), rootElement.eAllContents(),
     * DataPackage.Literals.ITEM, monitor_p);
     * 
     * }
     */

  }


}
