package org.pdulvp.common.commands;

import java.util.Collection;
import java.util.Map;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.commands.IElementUpdater;
import org.eclipse.ui.menus.UIElement;
import org.eclipse.ui.statushandlers.StatusManager;

public class JobToggleHandler extends CommandHandler implements IElementUpdater {

	protected boolean isJobEnabled() {
		return true;
	}
	
	protected void setStart() {
		
	}

	protected void setStop() {
		
	}
	protected String getName() {
		return getClass().getSimpleName();
	}
	
	
	public void updateElement(UIElement element, Map parameters) {
		// the checked state depends on if we have an activation for that
		// context ID or not
	}

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		if (!isJobEnabled()) {
			setStart();
			StatusManager.getManager().handle(new Status(IStatus.WARNING, "lol", "Started "+getName() ));
		} else {
			setStop();
			StatusManager.getManager().handle(new Status(IStatus.WARNING, "lol", "Stopped "+getName() ));
		}
		
		ICommandService service = (ICommandService)PlatformUI.getWorkbench().getService(ICommandService.class);//event.getCommand().
		service.refreshElements(event.getCommand().getId(), null);
		return event;
	}

	@Override
	protected void proceed(Collection<Object> selection2, ExecutionEvent event_p, IProgressMonitor monitor_p) {

	}

}
