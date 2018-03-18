package org.pdulvp.data.appgen.site;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.pdulvp.data.Category;
import org.pdulvp.data.DataPackage;
import org.pdulvp.data.Item;
import org.pdulvp.data.ItemRoot;
import org.pdulvp.data.Screen;

public class CategoryHelper {

	public static Category getCategory(Resource resource_p, String path) {
		ItemRoot root = (ItemRoot) resource_p.getContents().get(0);
		Category rootCategory = root.getOwnedCategories().get(0);

		String[] split = path.split("\\.");

		Category toVisit = getCategory(root, split[split.length - 1]);
		if (toVisit == null) {
			return null;
		}
		return toVisit;
	}

	public static Category getCategoryFree(EObject object) {
		if (object.eResource() != null) {

			Resource res = object.eResource().getResourceSet().getResource(URI.createPlatformResourceURI("/base/categories.data", true), true);
			ItemRoot root = (ItemRoot) res.getContents().get(0);
			for (Category cat : root.getOwnedCategories()) {
				Category free = CategoryHelper.getCategory(cat, "onetime");
				if (free != null) {
					return free;
				}
			}
		}
		return null;
	}

	public static Category getCategoryMonthly01(EObject object, String catName) {
		if (object.eResource() != null) {

			Resource res = object.eResource().getResourceSet().getResource(URI.createPlatformResourceURI("/base/categories.data", true), true);
			ItemRoot root = (ItemRoot) res.getContents().get(0);
			for (Category cat : root.getOwnedCategories()) {
				Category free = CategoryHelper.getCategory(cat, catName);
				if (free != null) {
					return free;
				}
			}
		}
		return null;
	}

	public static Category getCategory(ItemRoot root, String name) {
		TreeIterator<EObject> obj = root.eAllContents();
		while (obj.hasNext()) {
			EObject current = obj.next();
			if (current instanceof Category) {
				if (name.equals(((Category) current).getTag())) {
					return (Category) current;
				}
			}
		}
		return null;
	}

	public static Screen getScreen(ItemRoot root, String name) {
		TreeIterator<EObject> obj = root.eAllContents();
		while (obj.hasNext()) {
			EObject current = obj.next();
			if (current instanceof Screen) {
				if (name.equals(((Screen) current).getTag())) {
					return (Screen) current;
				}
			}
		}
		return null;
	}

	public static Category getCategory(Category parent, String name) {
		if (name.equals(parent.getTag())) {
			return parent;
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

	public static Collection<Item> getImages(Category category_p) {
		ArrayList<Item> images = new ArrayList<Item>();

		for (Setting setting : SessionManager.INSTANCE.getSession(category_p).getSemanticCrossReferencer().getInverseReferences(category_p)) {
			if (setting.getEStructuralFeature().equals(DataPackage.Literals.CHILD_ITEM__CATEGORIES)) {
				images.add((Item) setting.getEObject());
			}
		}
		return images;
	}

	public static Collection<Item> getAllImages(Category category_p) {
		ArrayList<Item> images = new ArrayList<Item>();

		for (Category category : getAllCategories(category_p)) {
			for (Setting setting : SessionManager.INSTANCE.getSession(category_p).getSemanticCrossReferencer().getInverseReferences(category)) {
				if (setting.getEStructuralFeature().equals(DataPackage.Literals.CHILD_ITEM__CATEGORIES)) {
					images.add((Item) setting.getEObject());
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
		String label = category.getTag();
		if ("root".equals(label)) {
			label = "root";
		} else {
			label = getParentText(category);
		}
		return label;
	}

	public static String getParentText(Object object) {
		String label = ((Category) object).getTag();
		if (label == null) {
			return "";
		}
		if ("root".equals(label)) {
			label = "";
		}

		if ((object instanceof Category) && (((Category) object).getParent() instanceof Category)) {
			String parent = getParentText(((Category) object).getParent());
			if (!parent.isEmpty() && !(parent.endsWith("."))) {
				parent = parent + ".";
			}
			label = parent + label;
		}

		return label;
	}

	public static Object getInAppCSV(Category category) {
		// pack_ns,published,managed_by_android,false,fr_FR; Pack de logos; Tous
		// les logos y compris ceux qui viendront dans les futures
		// versions,false,FR; 550000
		String name = category.getInappTitle();
		if ((name == null) || name.isEmpty()) {
			name = category.getName_frFR();
		}
		if ((name == null) || name.isEmpty()) {
			name = category.getName();
		}

		String description = category.getInappDescription();
		String price = "" + (int) ((category.getPrice() * 1000000));

		String result = getPackId(category) + ",published,managed_by_android,false,fr_FR; " + name + "; " + description + ",false,FR;" + price + "\n";
		return result;
	}

	public static String getPackId(Category category) {
	  if (category.getTag() != null ) {
		if (category.getTag().contains("android")) {
			return category.getTag();
		}
		return category.getTag().replace(".", "_");
    }
	  return null;
	}

	public static void updateParentCategories(Category rootCategory) {

		EObject toVisit = rootCategory;
		updateParentCategory(rootCategory);
		Iterator<EObject> it = toVisit.eAllContents();
		while (it.hasNext()) {
			EObject child = it.next();
			if (child instanceof Category) {
				updateParentCategory((Category) child);
			}
		}
	}

	private static void updateParentCategory(Category rootCategory) {
		if (rootCategory.eContainer() instanceof Category) {
			rootCategory.setParent((Category) rootCategory.eContainer());
		}
	}

}
