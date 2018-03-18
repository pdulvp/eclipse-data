/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pdulvp.data.provider;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.DecorationOverlayIcon;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.swt.graphics.Image;
import org.pdulvp.data.Category;
import org.pdulvp.data.DataFactory;
import org.pdulvp.data.DataPackage;
import org.pdulvp.data.helpers.CategoryExt;

/**
 * This is the item provider adapter for a {@link org.pdulvp.data.Category} object.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class CategoryItemProvider extends NamedItemItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CategoryItemProvider(AdapterFactory adapterFactory) {
    super(adapterFactory);
  }

	@Override
	protected Object overlayImage(Object object, Object image) {
		Object i = super.overlayImage(object, image);
		Category c = (Category) object;

		List<Object> img = new ArrayList<Object>();
		img.add(i);
		if (c.isInapp()) {
			Image baseImage = ImageDescriptor.createFromURL((URL) i).createImage();
			ImageDescriptor overlayImage = ImageDescriptor.createFromURL((URL) getResourceLocator().getImage("full/obj16/coins"));

			DecorationOverlayIcon icon = new DecorationOverlayIcon(baseImage, overlayImage, IDecoration.BOTTOM_RIGHT);
			i = icon.createImage();

			//img.add(EMFEditPlugin.INSTANCE.getImage(key))
		}
		return i;

	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
    if (itemPropertyDescriptors == null) {
      super.getPropertyDescriptors(object);

      addTimestampPropertyDescriptor(object);
      addIdPropertyDescriptor(object);
      addTagPropertyDescriptor(object);
      addVisiblePropertyDescriptor(object);
      addInappPropertyDescriptor(object);
      addInappDescriptionPropertyDescriptor(object);
      addInappTitlePropertyDescriptor(object);
      addPricePropertyDescriptor(object);
      addParentPropertyDescriptor(object);
      addScreensPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

	/**
   * This adds a property descriptor for the Timestamp feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addTimestampPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Timestamp_timestamp_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Timestamp_timestamp_feature", "_UI_Timestamp_type"),
         DataPackage.Literals.TIMESTAMP__TIMESTAMP,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Id feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addIdPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_AbstractItem_id_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_AbstractItem_id_feature", "_UI_AbstractItem_type"),
         DataPackage.Literals.ABSTRACT_ITEM__ID,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Tag feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addTagPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_AbstractItem_tag_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_AbstractItem_tag_feature", "_UI_AbstractItem_type"),
         DataPackage.Literals.ABSTRACT_ITEM__TAG,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

	/**
	 * This adds a property descriptor for the Screens feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addScreensPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Category_screens_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Category_screens_feature", "_UI_Category_type"),
         DataPackage.Literals.CATEGORY__SCREENS,
         true,
         false,
         true,
         null,
         null,
         null));
  }

	/**
	 * This adds a property descriptor for the Visible feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addVisiblePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Category_visible_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Category_visible_feature", "_UI_Category_type"),
         DataPackage.Literals.CATEGORY__VISIBLE,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Inapp feature.
   * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
   * @generated
   */
	protected void addInappPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Category_inapp_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Category_inapp_feature", "_UI_Category_type"),
         DataPackage.Literals.CATEGORY__INAPP,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Inapp Description feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addInappDescriptionPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Category_inappDescription_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Category_inappDescription_feature", "_UI_Category_type"),
         DataPackage.Literals.CATEGORY__INAPP_DESCRIPTION,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Inapp Title feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addInappTitlePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Category_inappTitle_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Category_inappTitle_feature", "_UI_Category_type"),
         DataPackage.Literals.CATEGORY__INAPP_TITLE,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Price feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addPricePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Category_price_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Category_price_feature", "_UI_Category_type"),
         DataPackage.Literals.CATEGORY__PRICE,
         true,
         false,
         false,
         ItemPropertyDescriptor.REAL_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Parent feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addParentPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Category_parent_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Category_parent_feature", "_UI_Category_type"),
         DataPackage.Literals.CATEGORY__PARENT,
         true,
         false,
         true,
         null,
         null,
         null));
  }

	/**
   * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
   * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
   * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
    if (childrenFeatures == null) {
      super.getChildrenFeatures(object);
      childrenFeatures.add(DataPackage.Literals.ITEM_PKG__OWNED_ITEM_PKGS);
      childrenFeatures.add(DataPackage.Literals.ITEM_PKG__OWNED_ITEMS);
      childrenFeatures.add(DataPackage.Literals.CATEGORY__OWNED_CATEGORIES);
    }
    return childrenFeatures;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
    // Check the type of the specified child object and return the proper feature to use for
    // adding (see {@link AddCommand}) it as a child.

    return super.getChildFeature(object, child);
  }

	/**
	 * This returns Category.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		if (!((Category) object).isVisible()) {
			return overlayImage(object, getResourceLocator().getImage("full/obj16/CategoryNotVisible"));
		}
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Category"));
	}

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected boolean shouldComposeCreationImage() {
    return true;
  }

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {

		String label = CategoryExt.getText(((Category) object));
		return (label == null) || (label.length() == 0) ? getString("_UI_Category_type") : getString("_UI_Category_type") + " " + label;
	}

	/**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
   * @generated
   */
	@Override
	public void notifyChanged(Notification notification) {
    updateChildren(notification);

    switch (notification.getFeatureID(Category.class)) {
      case DataPackage.CATEGORY__TIMESTAMP:
      case DataPackage.CATEGORY__ID:
      case DataPackage.CATEGORY__TAG:
      case DataPackage.CATEGORY__VISIBLE:
      case DataPackage.CATEGORY__INAPP:
      case DataPackage.CATEGORY__INAPP_DESCRIPTION:
      case DataPackage.CATEGORY__INAPP_TITLE:
      case DataPackage.CATEGORY__PRICE:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
      case DataPackage.CATEGORY__OWNED_ITEM_PKGS:
      case DataPackage.CATEGORY__OWNED_ITEMS:
      case DataPackage.CATEGORY__OWNED_CATEGORIES:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
        return;
    }
    super.notifyChanged(notification);
  }

	/**
   * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
   * that can be created under this object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
    super.collectNewChildDescriptors(newChildDescriptors, object);

    newChildDescriptors.add
      (createChildParameter
        (DataPackage.Literals.ITEM_PKG__OWNED_ITEM_PKGS,
         DataFactory.eINSTANCE.createItemRoot()));

    newChildDescriptors.add
      (createChildParameter
        (DataPackage.Literals.ITEM_PKG__OWNED_ITEM_PKGS,
         DataFactory.eINSTANCE.createItemPkg()));

    newChildDescriptors.add
      (createChildParameter
        (DataPackage.Literals.ITEM_PKG__OWNED_ITEM_PKGS,
         DataFactory.eINSTANCE.createCategory()));

    newChildDescriptors.add
      (createChildParameter
        (DataPackage.Literals.ITEM_PKG__OWNED_ITEM_PKGS,
         DataFactory.eINSTANCE.createCategoryView()));

    newChildDescriptors.add
      (createChildParameter
        (DataPackage.Literals.ITEM_PKG__OWNED_ITEM_PKGS,
         DataFactory.eINSTANCE.createApplication()));

    newChildDescriptors.add
      (createChildParameter
        (DataPackage.Literals.ITEM_PKG__OWNED_ITEMS,
         DataFactory.eINSTANCE.createItem()));

    newChildDescriptors.add
      (createChildParameter
        (DataPackage.Literals.CATEGORY__OWNED_CATEGORIES,
         DataFactory.eINSTANCE.createCategory()));

    newChildDescriptors.add
      (createChildParameter
        (DataPackage.Literals.CATEGORY__OWNED_CATEGORIES,
         DataFactory.eINSTANCE.createCategoryView()));
  }

  /**
   * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
    Object childFeature = feature;
    Object childObject = child;

    boolean qualify =
      childFeature == DataPackage.Literals.ITEM_PKG__OWNED_ITEM_PKGS ||
      childFeature == DataPackage.Literals.CATEGORY__OWNED_CATEGORIES;

    if (qualify) {
      return getString
        ("_UI_CreateChild_text2",
         new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
    }
    return super.getCreateChildText(owner, feature, child, selection);
  }

}
