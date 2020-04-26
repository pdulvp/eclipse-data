package org.pdulvp.data.appgen.site.command;

import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.pdulvp.common.commands.ProgressCommandHandler;
import org.pdulvp.data.Application;
import org.pdulvp.data.DataPackage;
import org.pdulvp.data.Screen;
import org.pdulvp.data.appgen.site.EObjectExt;
import org.pdulvp.data.appgen.site.publish.AttributesClosure;
import org.pdulvp.data.appgen.site.publish.ExternalReferencesClosure;
import org.pdulvp.data.appgen.site.publish.UnaryReferencesClosure;
import org.pdulvp.data.helpers.CategoryExt;

public class PublishScreens extends ProgressCommandHandler {

  protected Predicate enablement(IStructuredSelection selection) {
    return ca -> ca instanceof Screen;
  }
  
	@Override
	public void proceed(Collection<Object> selection, ExecutionEvent event_p, IProgressMonitor monitor_p) {
		EObject root = (EObject) (selection.iterator().next());
		Resource categories = root.eResource().getResourceSet().getResource(URI.createPlatformResourceURI("/base/screens.data", true), true);
		
    for (Object o : selection) {
      Application application = CategoryExt.getApplication((EObject)o);
      EObjectExt.apply(new AttributesClosure(application, "screens"), Collections.singletonList((EObject) o),
          DataPackage.Literals.SCREEN, monitor_p);
      
      EObjectExt.apply(new UnaryReferencesClosure(application, "screens"), Collections.singletonList((EObject) o),
          DataPackage.Literals.SCREEN, monitor_p);
      
      EObjectExt.apply(new ExternalReferencesClosure(application, "screens"), Collections.singletonList((EObject) o),
          DataPackage.Literals.SCREEN, monitor_p);
    }
    
    
		//EObjectExt.apply(new AttributesClosure("screens"), rootElement.eAllContents(), DataPackage.Literals.SCREEN, monitor_p);
		//EObjectExt.apply(new ExternalReferencesClosure("screens"), rootElement.eAllContents(), DataPackage.Literals.SCREEN, monitor_p);
	}

}
