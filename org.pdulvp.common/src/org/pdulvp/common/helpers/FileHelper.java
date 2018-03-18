package org.pdulvp.common.helpers;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;

public class FileHelper {

  public static byte[] getContent(String path) {
    try {
      return FileUtils.readFileToByteArray(new File(path));
    } catch (IOException e) {
      return null;
    }
  }

  public static void writeFile(IFile file, String string) {

    if (!file.getParent().exists()) {
      try {
        ((IFolder) file.getParent()).create(true, true, new NullProgressMonitor());
      } catch (CoreException e) {
        e.printStackTrace();

      }
    }

    if (file.exists()) {
      try {
        file.delete(true, new NullProgressMonitor());
      } catch (CoreException e) {
        e.printStackTrace();

      }
    }

    InputStream stream = null;
    try {
      stream = new ByteArrayInputStream(string.getBytes("UTF-8"));
      file.create(stream, IFile.FORCE, new NullProgressMonitor());
    } catch (Exception e) {
      // Nothing
      e.printStackTrace();
    } finally {
      if (stream != null) {
        try {
          stream.close();
        } catch (Exception e) {
          e.printStackTrace();
          // Nothing
        }
      }
    }
  }

  public static String getCurrentDate() {
    return getCurrentDate(new Date().getTime());
  }

  public static String getCurrentDate(long i) {
    String date = new java.text.SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date(i));
    return date;
  }

  public static String getAndroidVersion(String format) {
    String date = new java.text.SimpleDateFormat(format).format(new java.util.Date(new Date().getTime()));
    return date;
  }

}
