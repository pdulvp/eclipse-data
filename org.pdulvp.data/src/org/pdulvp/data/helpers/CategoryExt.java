package org.pdulvp.data.helpers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.pdulvp.data.Application;
import org.pdulvp.data.Category;
import org.pdulvp.data.ChildItem;
import org.pdulvp.data.DataPackage;
import org.pdulvp.data.Item;
import org.pdulvp.data.ItemRoot;
import org.pdulvp.data.Screen;

public class CategoryExt {

  public static Category getCategory(Resource resource_p, String path) {
    ItemRoot root = (ItemRoot) resource_p.getContents().get(0);
    Category rootCategory = root.getOwnedCategories().get(0);

    String[] split = path.split("\\.");

    Category toVisit = rootCategory;
    for (String part : split) {
      toVisit = getCategory(toVisit, part);
      if (toVisit == null) {
        return null;
      }
    }
    return toVisit;
  }

  public static Category getCategoryFree(EObject object) {
    if (object.eResource() != null) {

      Resource res = object.eResource().getResourceSet()
          .getResource(URI.createPlatformResourceURI("/base/categories.data", true), true);
      ItemRoot root = (ItemRoot) res.getContents().get(0);
      for (Category cat : root.getOwnedCategories()) {
        Category free = CategoryExt.getCategory(cat, "free");
        if (free != null) {
          return free;
        }
      }
    }
    return null;
  }

  public static Category getCategoryMonthly01(EObject object) {
    if (object.eResource() != null) {

      Resource res = object.eResource().getResourceSet()
          .getResource(URI.createPlatformResourceURI("/base/categories.data", true), true);
      ItemRoot root = (ItemRoot) res.getContents().get(0);
      for (Category cat : root.getOwnedCategories()) {
        Category free = CategoryExt.getCategory(cat, "sub_yearly_01");
        if (free != null) {
          return free;
        }
      }
    }
    return null;
  }

  public static Category getCategory(Category parent, String name) {
    for (Category cat : parent.getOwnedCategories()) {
      if (name.equals(cat.getTag())) {
        return cat;
      }
    }
    return null;
  }

  public static Category getParentCategory(Category object) {
    EObject parent = object.eContainer();

    while ((parent != null) && (parent instanceof Category)) {
      if (((Category) parent).isVisible()) {
        return (Category) parent;
      } else if ("root".equals(((Category) parent).getTag())) {
        return (Category) parent;
      }
      parent = parent.eContainer();
    }
    return null;
  }

  public static Category getGroupCategory(Category object) {
    EObject parent = object.eContainer();
    if (!object.getOwnedCategories().isEmpty()) {
      parent = object;
    }
    if (parent instanceof Category) {
      if (!"root".equals(((Category) parent).getTag())) {
        return (Category) parent;
      } else {
        return object;
      }
    }
    return null;
  }

  public static String getCategoryName(Category rootCategory) {
    EObject parent = rootCategory;
    while ((parent != null) && (parent instanceof Category)) {
      if (((Category) parent).getName_frFR() != null) {
        return ((Category) parent).getName_frFR();
      }
      if (((Category) parent).getName() != null) {
        return ((Category) parent).getName();
      }
      parent = parent.eContainer();
    }
    return null;
  }

  public static String getScreens(Category rootCategory) {
    Iterator<Screen> screens = rootCategory.getScreens().iterator();
    String screensValue = "";
    while (screens.hasNext()) {
      Screen screen = screens.next();
      screensValue += screen.getTag();
      if (screens.hasNext()) {
        screensValue += ",";
      }
    }
    return screensValue;
  }

  public static ECrossReferenceAdapter getCrossReferencer(ResourceSet resourceSet_p) {
    for (Adapter adapter : resourceSet_p.eAdapters()) {
      if (adapter instanceof ECrossReferenceAdapter) {
        return (ECrossReferenceAdapter) adapter;
      }
    }
    ECrossReferenceAdapter result = new ECrossReferenceAdapter();
    resourceSet_p.eAdapters().add(result);
    return result;
  }

  public static Collection<ChildItem> getImages(Category category_p) {
    ArrayList<ChildItem> images = new ArrayList<ChildItem>();

    for (Setting setting : SessionManager.INSTANCE.getSession(category_p).getSemanticCrossReferencer()
        .getInverseReferences(category_p)) {
      if (setting.getEStructuralFeature().equals(DataPackage.Literals.CHILD_ITEM__CATEGORIES)) {
        images.add((ChildItem) setting.getEObject());
      }
    }
    return images;
  }

  public static Collection<ChildItem> getAllImages(Category category_p) {
    ArrayList<ChildItem> images = new ArrayList<ChildItem>();

    for (Category category : getAllCategories(category_p)) {
      for (Setting setting : SessionManager.INSTANCE.getSession(category_p).getSemanticCrossReferencer()
          .getInverseReferences(category)) {
        if (setting.getEStructuralFeature().equals(DataPackage.Literals.CHILD_ITEM__CATEGORIES)) {
          images.add((ChildItem) setting.getEObject());
        }
      }
    }
    return images;
  }

  public static Collection<Category> getAllCategories(Category category_p) {
    ArrayList<Category> categories = new ArrayList<Category>();
    LinkedList<Category> toVisit = new LinkedList<Category>();
    toVisit.add(category_p);
    while (!toVisit.isEmpty()) {
      Category category = toVisit.removeFirst();
      if (!categories.contains(category)) {
        categories.add(category);
        toVisit.addAll(category.getOwnedCategories());
      }
    }
    return categories;
  }

  public static String getText(Category category) {
    String label = category.getName_frFR();
    if (label == null || label.isEmpty()) {
      label = category.getName();
    }
    if (label == null || label.isEmpty()) {
      label = category.getTag();
    }
    if ("root.pays".equals(label)) {
      label = "root.pays";
    } else {
      label = getParentText(category);
    }
    return label;
  }

  public static String getParentText(Object object) {
    Category category = (Category) object;
    String label = category.getName_frFR();
    if (label == null || label.isEmpty()) {
      label = category.getName();
    }
    if (label == null || label.isEmpty()) {
      label = category.getTag();
    }
    if (label == null) {
      return "";
    }
    if ("root".equals(label)) {
      label = "";
    }

    if ((object instanceof Category) && (((Category) object).getParent() instanceof Category)) {
      String parent = getParentText(((Category) object).getParent());
      if (!parent.isEmpty() && !(parent.endsWith(" > "))) {
        parent = parent + " > ";
      }
      label = parent + label;
    }

    return label;
  }

  public static String getPackId(Category category) {
    return getText(category).replace(".", "_");
  }

  public static Category getRootCategory(Category category) {
    if (category == null) {
      return null;
    }
    if (category.getParent() != null) {
      return getRootCategory(category.getParent());
    }
    return category;
  }

  public static Application getApplication(EObject object) {
    if (object instanceof Application ) return (Application)object;
    if (object == null) {
      return null;
    }
    return getApplication(object.eContainer());
  }

}
