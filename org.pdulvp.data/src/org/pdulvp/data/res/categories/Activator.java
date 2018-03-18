package org.pdulvp.data.res.categories;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.ecore.EPackage;
import org.osgi.framework.BundleContext;
import org.pdulvp.data.DataPackage;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends Plugin {

  // The plug-in ID
  public static final String PLUGIN_ID = "org.pdulvp.data.res"; //$NON-NLS-1$

  // The shared instance
  private static Activator plugin;

  /**
   * The constructor
   */
  public Activator() {
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
   */
  @Override
  public void start(BundleContext context) throws Exception {
    super.start(context);
    plugin = this;
    EPackage.Registry.INSTANCE.put(DataPackage.eNS_URI, DataPackage.eINSTANCE);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
   */
  @Override
  public void stop(BundleContext context) throws Exception {
    plugin = null;
    super.stop(context);
  }

  /**
   * Returns the shared instance
   * 
   * @return the shared instance
   */
  public static Activator getDefault() {
    return plugin;
  }

}
