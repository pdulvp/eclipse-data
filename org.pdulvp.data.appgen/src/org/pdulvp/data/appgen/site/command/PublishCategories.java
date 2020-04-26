package org.pdulvp.data.appgen.site.command;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.pdulvp.common.commands.ProgressCommandHandler;
import org.pdulvp.data.Application;
import org.pdulvp.data.Category;
import org.pdulvp.data.DataPackage;
import org.pdulvp.data.HomeItem;
import org.pdulvp.data.ItemRoot;
import org.pdulvp.data.Product;
import org.pdulvp.data.appgen.site.EObjectExt;
import org.pdulvp.data.appgen.site.publish.AttributesClosure;
import org.pdulvp.data.appgen.site.publish.ExternalReferencesClosure;
import org.pdulvp.data.appgen.site.publish.UnaryReferencesClosure;
import org.pdulvp.data.helpers.CategoryExt;
import org.pdulvp.retriever.model.handler.helpers.LogHelper;

public class PublishCategories extends ProgressCommandHandler {
  
  protected Predicate enablement(IStructuredSelection selection) {
    return ca -> ca instanceof Application || ca instanceof Category  || ca instanceof HomeItem ;
  }
  

  @Override
  public void proceed(Collection<Object> selection, ExecutionEvent event_p, IProgressMonitor monitor_p) {
    EObject root = (EObject) (selection.iterator().next());
    Resource categories = root.eResource().getResourceSet()
        .getResource(URI.createPlatformResourceURI("/base/categories.data", true), true);
    ItemRoot rootElement = (ItemRoot) categories.getContents().get(0);

    if (root instanceof Application) {
      for (Object o : selection) {
        EObjectExt.apply(new AttributesClosure((Application) o, "applications"),
            Collections.singletonList((EObject) o), DataPackage.Literals.APPLICATION, monitor_p);
        //EObjectExt.apply(new UnaryReferencesClosure((Application) o, "applications"),
        //    Collections.singletonList((EObject) o), DataPackage.Literals.APPLICATION, monitor_p);
        //EObjectExt.apply(new ExternalReferencesClosure((Application) o, "applications"),
        //    Collections.singletonList((EObject) o), DataPackage.Literals.APPLICATION, monitor_p);
      }

    } else if (root instanceof HomeItem) {
      for (Object o : selection) {
        Application application = CategoryExt.getApplication((HomeItem) o);
        EObjectExt.apply(new AttributesClosure(application, "homeItems"), Collections.singletonList((EObject) o),
            DataPackage.Literals.HOME_ITEM, monitor_p);
        EObjectExt.apply(new UnaryReferencesClosure(application, "homeItems"),
            Collections.singletonList((EObject) o), DataPackage.Literals.HOME_ITEM, monitor_p);
        EObjectExt.apply(new ExternalReferencesClosure(application, "homeItems"),
            Collections.singletonList((EObject) o), DataPackage.Literals.HOME_ITEM, monitor_p);
      }

    } else if (root instanceof Category) {

      for (Object o : selection) {
        if (o instanceof Category) {
          Application application = CategoryExt.getApplication((EObject) o);
          publishCategory(application, (Category) o, monitor_p);
        }
      }

    } else if (root instanceof Product) {
      for (Object o : selection) {

        Application application = CategoryExt.getApplication((Category) o);
        EObjectExt.apply(new AttributesClosure(null, "products"), Collections.singletonList((EObject) o),
            DataPackage.Literals.PRODUCT, monitor_p);
        EObjectExt.apply(new UnaryReferencesClosure(null, "products"),
            Collections.singletonList((EObject) o), DataPackage.Literals.PRODUCT, monitor_p);
        EObjectExt.apply(new ExternalReferencesClosure(null, "products"),
            Collections.singletonList((EObject) o), DataPackage.Literals.PRODUCT, monitor_p);
      }

    } else if (!(root instanceof Category)) {
    	List<EObject> list = new ArrayList<>();
    	rootElement.eAllContents().forEachRemaining(list::add);
    	
      EObjectExt.apply(new AttributesClosure(null, "categories"), list,
          DataPackage.Literals.CATEGORY, monitor_p);
      EObjectExt.apply(new UnaryReferencesClosure(null, "categories"), list,
          DataPackage.Literals.CATEGORY, monitor_p);
      EObjectExt.apply(new ExternalReferencesClosure(null, "categories"), list,
          DataPackage.Literals.CATEGORY, monitor_p);
    }

  }

  public static void publishCategory(Application application, Category category, IProgressMonitor monitor) {

    if (application == null) {
      LogHelper.error("No application for the given category");
      return;
    }


    EObjectExt.apply(new AttributesClosure(application, "categories"),
        Collections.singletonList((EObject) category), DataPackage.Literals.CATEGORY, monitor);

    EObjectExt.apply(new UnaryReferencesClosure(application, "categories"),
        Collections.singletonList((EObject) category), DataPackage.Literals.CATEGORY, monitor);

    EObjectExt.apply(new ExternalReferencesClosure(application, "categories"),
        Collections.singletonList((EObject) category), DataPackage.Literals.CATEGORY, monitor);
  }
}
