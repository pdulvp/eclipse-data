package org.pdulvp.data.res;

import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionListener;
import org.eclipse.sirius.business.api.session.SessionManagerListener;

public class SessionManagerListener1 extends SessionManagerListener.Stub {

	@Override
	public void notify(Session updated, int notification) {
		switch (notification) {
		case SessionListener.OPENED:
			notifyOpenedSession(updated);
		default:
		}
	}

	private void notifyOpenedSession(Session updated) {
		updated.getTransactionalEditingDomain().addResourceSetListener(new AutoUpdateAttributesListener());
	}

}
