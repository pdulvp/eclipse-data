package org.pdulvp.data.presentation;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;

/**
 * This class contains convenient static methods for working with EMF objects.
 */
public class EcoreUtil2 {
  public static String defaultPattern = "{1} {0}"; //$NON-NLS-1$

  /**
   * Returns the URI from the path (with compatible encoding for EMF.getResource(URI) method)
   */
  public static URI getURI(IFile file) {
    return URI.createPlatformResourceURI(file.getFullPath().toOSString(), true);
  }
  /**
   * Return the file where is persisted given EMF object.
   * @param resource_p
   * @return <code>null</code> if given object is not persisted.
   */
  public static IFile getFile(Resource resource_p) {
    IFile result = null;
    // Precondition.
    if (null == resource_p) {
      return result;
    }
    result = WorkspaceSynchronizer.getFile(resource_p);
    return result;
  }
}

