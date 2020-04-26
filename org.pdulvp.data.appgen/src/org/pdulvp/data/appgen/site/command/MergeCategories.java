package org.pdulvp.data.appgen.site.command;

import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.json.JSONObject;
import org.pdulvp.common.commands.ProgressCommandHandler;
import org.pdulvp.common.helpers.AbstractDataManager;
import org.pdulvp.data.Category;
import org.pdulvp.data.DataPackage;
import org.pdulvp.data.ItemRoot;
import org.pdulvp.data.appgen.site.ElementFactory;

public class MergeCategories extends ProgressCommandHandler implements Consumer<EObject> {

  protected Predicate enablement(IStructuredSelection selection) {
    return ca -> false;
  }
  ItemRoot _target = null;

  @Override
  public void proceed(Collection<Object> selection, ExecutionEvent event_p, IProgressMonitor monitor_p) {
    EObject root = (EObject) (selection.iterator().next());
    Resource categories = root.eResource().getResourceSet()
        .getResource(URI.createPlatformResourceURI("/base/categories.data", true), true);
    ItemRoot rootElement = (ItemRoot) categories.getContents().get(0);

    Session session = SessionManager.INSTANCE.getSession(root);
    TransactionalEditingDomain domain = session.getTransactionalEditingDomain();

  }

  @Override
  public void accept(EObject arg0) {
    String id = ((Category) arg0).getId();
    String server = "http://cluster015.ovh.net/~pdulkvdp/public";
    Object object = AbstractDataManager.syncRequest(server + "/v2/categories/get/" + id, true);
    EObject result = ElementFactory.create((JSONObject) object, DataPackage.Literals.CATEGORY.getName());
    if (result instanceof Category) {
      _target.getOwnedCategories().add((Category) result);
    }
  }
}
