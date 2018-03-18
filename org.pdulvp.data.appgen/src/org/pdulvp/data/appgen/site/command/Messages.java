package org.pdulvp.data.appgen.site.command;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "com.juuyi.commands.server.messages"; //$NON-NLS-1$
	
	public static String PublishCategories_2;
	public static String PublishCategories_3;
	public static String PublishCategories_4;
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
