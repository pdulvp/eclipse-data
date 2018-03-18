package org.pdulvp.data.appgen.site;

import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.osgi.util.NLS;
import org.pdulvp.common.helpers.FileHelper;
import org.pdulvp.data.AbstractItem;
import org.pdulvp.data.Category;
import org.pdulvp.data.DataPackage;
import org.pdulvp.data.Item;
import org.pdulvp.data.ScreenListGroup;

import com.juuyi.security.enc.Encrypt;

public class ImageHelper {

  private class Couple<K, V> {
    K k;
    V v;

    Couple(K k_p, V v_p) {
      k = k_p;
      v = v_p;
    }
  }

  public static void updateImage(final Item image) {
    final HashMap<EStructuralFeature, String> paths = new HashMap<EStructuralFeature, String>();
    paths.put(DataPackage.Literals.IMAGE_ITEM__GICON16_PATH, "/gen/images_src/" + image.getId() + "_icon16" + ".png");
    paths.put(DataPackage.Literals.IMAGE_ITEM__GIMAGE_DATA_PATH,
        "/gen/images_src/" + image.getId() + "_imageData" + ".png");
    paths.put(DataPackage.Literals.IMAGE_ITEM__GICON_DATA_PATH,
        "/gen/images_src/" + image.getId() + "_iconData" + ".png");

    TransactionUtil.getEditingDomain(image).getCommandStack()
        .execute(new RecordingCommand(TransactionUtil.getEditingDomain(image)) {

          @Override
          protected void doExecute() {
            // TODO Auto-generated method stub

            for (EStructuralFeature feature : paths.keySet()) {
              String pathValue = paths.get(feature);
              new File("W:/Works/android_git/data" + pathValue).delete();
              image.eSet(feature, pathValue);
            }
          }
        });
    GenerateImageHelper.generateIcon16(image.getSourcePath(), paths.get(DataPackage.Literals.IMAGE_ITEM__GICON16_PATH));
    GenerateImageHelper.generateImageData(image.getSourcePath(),
        paths.get(DataPackage.Literals.IMAGE_ITEM__GIMAGE_DATA_PATH));
    GenerateImageHelper.generateIconData(image.getSourcePath(),
        paths.get(DataPackage.Literals.IMAGE_ITEM__GICON_DATA_PATH));

  }

  public static String getPacks(Item item) {
    try {
      Collection<byte[]> packs = new LinkedHashSet<byte[]>();
      for (Category category : item.getCategories()) {
        Category toVisit = category;
        while (toVisit != null) {
          if (category.isInapp()) {
            String pack = CategoryHelper.getPackId(category);
            packs.add(pack.getBytes("UTF-8"));
          }
          if ((toVisit.eContainer() != null) && (toVisit.eContainer() instanceof Category)) {
            toVisit = (Category) toVisit.eContainer();
          } else {
            break;
          }
        }
      }
      if (packs.size() > 0) {
        return new String(Encrypt.encrypt(item.getId().getBytes("UTF-8"), packs));
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return "";
  }

  public static String getIconData(AbstractItem item) {
    try {
      String path = ResourcesPlugin.getWorkspace().getRoot().getProject("gen").getLocation().removeLastSegments(1)
          .append(((Item) item).getGIconDataPath()).toFile().getAbsolutePath();
      if (path != null) {
        byte[] iconData = Encrypt.getContent(path);
        if (iconData == null) {
          GenerateImageHelper.generateIconData(((Item) item).getSourcePath(), ((Item) item).getGIconDataPath());
          iconData = Encrypt.getContent(path);
        }
        return new String(Encrypt.encrypt(item.getId().getBytes("UTF-8"), Collections.singletonList(iconData)));
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return "";
  }

  public static String getImageData(AbstractItem item) {
    try {
      String path = ResourcesPlugin.getWorkspace().getRoot().getProject("gen").getLocation().removeLastSegments(1)
          .append(((Item) item).getGImageDataPath()).toFile().getAbsolutePath();
      if (path != null) {
        byte[] iconData = Encrypt.getContent(path);
        if (iconData == null) {
          GenerateImageHelper.generateImageData(((Item) item).getSourcePath(), ((Item) item).getGImageDataPath());
          iconData = Encrypt.getContent(path);
        }
        String a = new String(Encrypt.encrypt(item.getId().getBytes("UTF-8"), Collections.singletonList(iconData)));
        return a;
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    return "";
  }

  public static void getJson(Item item, ScreenListGroup group, StringBuffer buffer) {
    getJson(item, group, buffer, false);
  }

  public static void getJson(Item item, ScreenListGroup group, StringBuffer buffer, boolean full_p) {

    buffer.append(NLS.bind(
        "'{'\"id\":\"{0}\",\"type\":\"image\",\"lastUpdated\":\"{1}\",\"packs\":\"{2}\",\"iconData\":\"{3}\"",
        new String[] { item.getId(), item.getTimestamp(), ImageHelper.getPacks(item), ImageHelper.getIconData(item) }));

    String catName = null;

    if ((group != null) && (group.getName() != null)) {
      catName = group.getName();
    }

    if ((group != null) && (group.getCategory() != null)) {
      catName = group.getCategory().getName();
      buffer.append(NLS.bind(",\"catid\":\"{0}\"", group.getCategory().getId()));
      buffer.append(NLS.bind(",\"catname_frFR\":\"{0}\"", group.getCategory().getName_frFR()));
    }

    if (catName != null) {
      buffer.append(NLS.bind(",\"catname\":\"{0}\"", group.getName()));
    }

    if (item.getStyle() != null && !item.getStyle().isEmpty()) {
      buffer.append(NLS.bind(",\"style\":\"{0}\"", item.getStyle()));
    }

    if (full_p) {
      buffer.append(NLS.bind(",\"imageData\":\"{0}\"", ImageHelper.getImageData(item)));
    }

    buffer.append("}\n");
  }

  public static void generateFullJson(Item image) {
    StringBuffer buffer = new StringBuffer();
    buffer.append("{\"item\" : ");
    getJson(image, null, buffer, true);
    buffer.append("}");
    String json = buffer.toString();

    // if (!new File("W:/Works/android_git/data/gen/images/" + image.getId()
    // + "_full" + ".json").exists()) {

    IProject baseProject = ResourcesPlugin.getWorkspace().getRoot().getProject("gen");
    IFile file = baseProject.getFolder("images").getFile(image.getId() + "_full" + ".json");
    FileHelper.writeFile(file, json);
    // }
  }

}
