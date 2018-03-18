package org.pdulvp.common.http;

import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.ui.statushandlers.StatusManager;
import org.pdulvp.common.helpers.AbstractDataManager;

class HttpRequestsJob extends WorkspaceJob {

  private static LinkedList<HttpRequest> REQUESTS = new LinkedList<HttpRequest>();

  public static HttpRequestsJob CURRENT;

  public HttpRequestsJob() {
    super(HttpRequestsJob.class.getSimpleName());
    this.setPriority(LONG);
  }

  public IStatus runInWorkspace(IProgressMonitor monitor) {

    long time = System.currentTimeMillis();
    //StatusManager.getManager().handle(new Status(IStatus.INFO, getName(), "Run started"));
    proceed();
    long time2 = System.currentTimeMillis();
    //StatusManager.getManager().handle(new Status(IStatus.INFO, getName(), "Run finished (" + (time2 - time) + "ms)"));

    if (HttpRequestsJob.CURRENT != null) {
      HttpRequestsJob.CURRENT.schedule(1000 * 1); // 1s
    }

    return Status.OK_STATUS;
  }

  public static void addRequest(HttpRequest request) {
    synchronized (REQUESTS) {
      REQUESTS.addLast(request);
    }
  }

  private void proceed() {
    HttpRequest request = null;
    synchronized (REQUESTS) {
      if (!REQUESTS.isEmpty()) {
        request = REQUESTS.removeFirst();
      }
    }
    if (request != null) {
      System.out.println(request.getUri());
      System.out.println(request.getValue());
      System.out.println();
      //Object result = AbstractDataManager.syncRequestPost(request.getUri(), request.getValue(), true);
      //System.out.println(result);
    }
  }

  public static URI getURI(IFile file) {
    return URI.createPlatformResourceURI(file.getFullPath().toOSString(), true);
  }

  protected void proceed(TransactionalEditingDomain domain) {

  }

}