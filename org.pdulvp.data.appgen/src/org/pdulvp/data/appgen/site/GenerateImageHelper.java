package org.pdulvp.data.appgen.site;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;

public class GenerateImageHelper {

	public static void generateImageData(String sourcePath, String targetPath) {
		try {

			String S = "W:/Works/android_git/data";
			if (!new File(S + targetPath).exists()) {
				IWorkspace workspace = ResourcesPlugin.getWorkspace();
				Process process = new ProcessBuilder("E:/Tools/ImageMagick-6.8.6-8/convert.exe", S + sourcePath, "-resize", "500x", S + targetPath).start();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void generateIconData(String sourcePath, String targetPath) {
		try {

			String S = "W:/Works/android_git/data";
			if (!new File(S + targetPath).exists()) {
				IWorkspace workspace = ResourcesPlugin.getWorkspace();
				Process process = new ProcessBuilder("E:/Tools/ImageMagick-6.8.6-8/convert.exe", S + sourcePath, "-resize", "100x100", "-background", "none", "-gravity", "center", "-extent", "100x100", S + targetPath).start();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void generateIcon16(String sourcePath, String targetPath) {
		try {
			String S = "W:/Works/android_git/data";
			if (!new File(S + targetPath).exists()) {
				Process process = new ProcessBuilder("E:/Tools/ImageMagick-6.8.6-8/convert.exe", S + sourcePath, "-resize", "16x16", "-background", "none", "-gravity", "center", "-extent", "16x16", S + targetPath).start();
				process.waitFor();
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
