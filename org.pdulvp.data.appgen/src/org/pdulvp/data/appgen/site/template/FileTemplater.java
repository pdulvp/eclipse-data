package org.pdulvp.data.appgen.site.template;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;

public class FileTemplater<T> extends Templater<T> {

  IFolder folder;

  public FileTemplater(IFolder folder_p) {
    folder = folder_p;

  }

  protected String getFileName(T clazz) {
    return clazz.toString() + ".php";
  }

  @Override
  public void accept(T arg0) {
    IFile file = folder.getFile(getFileName(arg0));
    if (file.exists()) {
      try {
        file.delete(true, false, new NullProgressMonitor());
      } catch (CoreException e) {
        e.printStackTrace();
      }
    }

    proceed(arg0);

    InputStream stream = new ByteArrayInputStream(buffer.toString().getBytes());
    if (file.exists()) {
      try {
        file.setContents(stream, true, true, new NullProgressMonitor());
      } catch (CoreException e) {
        e.printStackTrace();
      }
    } else {
      try {
        file.create(stream, true, new NullProgressMonitor());
      } catch (CoreException e) {
        e.printStackTrace();
      }
    }

  }

  protected void proceed(T arg0) {
    // TODO Auto-generated method stub

  }

}
