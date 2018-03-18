package org.pdulvp.common.http;

import java.util.Map;

import org.eclipse.ui.menus.UIElement;
import org.pdulvp.common.commands.JobToggleHandler;

public class HttpRequestHandler extends JobToggleHandler {

	protected boolean isJobEnabled() {
		return HttpRequestsJob.CURRENT != null;
	}

	protected void setStart() {
	  HttpRequestsJob.CURRENT = new HttpRequestsJob();
	  HttpRequestsJob.CURRENT.schedule(1000);
	}

	protected void setStop() {
	  HttpRequestsJob.CURRENT.cancel();
	  HttpRequestsJob.CURRENT = null;
	}
	
	public void updateElement(UIElement element, Map parameters) {
		// the checked state depends on if we have an activation for that
		// context ID or not
		element.setChecked(HttpRequestsJob.CURRENT != null);
	}
}
