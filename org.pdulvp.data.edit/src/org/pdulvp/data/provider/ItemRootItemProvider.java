/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pdulvp.data.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.pdulvp.data.DataFactory;
import org.pdulvp.data.DataPackage;
import org.pdulvp.data.ItemRoot;
import org.pdulvp.data.table.TableFactory;
import org.pdulvp.data.table.TablePackage;

/**
 * This is the item provider adapter for a {@link org.pdulvp.data.ItemRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ItemRootItemProvider
	extends AbstractItemItemProvider {
	/**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ItemRootItemProvider(AdapterFactory adapterFactory) {
    super(adapterFactory);
  }

	/**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
    if (itemPropertyDescriptors == null) {
      super.getPropertyDescriptors(object);

      addNamePropertyDescriptor(object);
      addName_frFRPropertyDescriptor(object);
      addDbNamePropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

	/**
   * This adds a property descriptor for the Name feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addNamePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_NamedItem_name_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_NamedItem_name_feature", "_UI_NamedItem_type"),
         DataPackage.Literals.NAMED_ITEM__NAME,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Name fr FR feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addName_frFRPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_NamedItem_name_frFR_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_NamedItem_name_frFR_feature", "_UI_NamedItem_type"),
         DataPackage.Literals.NAMED_ITEM__NAME_FR_FR,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Db Name feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addDbNamePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_DNamedElement_dbName_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_DNamedElement_dbName_feature", "_UI_DNamedElement_type"),
         TablePackage.Literals.DNAMED_ELEMENT__DB_NAME,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
   * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
   * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
    if (childrenFeatures == null) {
      super.getChildrenFeatures(object);
      childrenFeatures.add(DataPackage.Literals.CATEGORY_PKG__OWNED_CATEGORY_PKGS);
      childrenFeatures.add(DataPackage.Literals.CATEGORY_PKG__OWNED_CATEGORIES);
      childrenFeatures.add(DataPackage.Literals.PRODUCT_PKG__OWNED_PRODUCT_PKGS);
      childrenFeatures.add(DataPackage.Literals.PRODUCT_PKG__OWNED_PRODUCTS);
      childrenFeatures.add(DataPackage.Literals.ITEM_PKG__OWNED_ITEM_PKGS);
      childrenFeatures.add(DataPackage.Literals.ITEM_PKG__OWNED_ITEMS);
      childrenFeatures.add(DataPackage.Literals.SCREEN_PKG__OWNED_SCREEN_PKGS);
      childrenFeatures.add(DataPackage.Literals.SCREEN_PKG__OWNED_SCREENS);
      childrenFeatures.add(DataPackage.Literals.ITEM_TYPE_PKG__OWNED_TYPE_PKGS);
      childrenFeatures.add(DataPackage.Literals.ITEM_TYPE_PKG__OWNED_TYPES);
      childrenFeatures.add(TablePackage.Literals.DTABLE_PKG__OWNED_TABLES);
      childrenFeatures.add(DataPackage.Literals.ITEM_ROOT__OWNED_APPLICATIONS);
      childrenFeatures.add(DataPackage.Literals.ITEM_ROOT__OWNED_SCREEN_LISTS);
      childrenFeatures.add(DataPackage.Literals.ITEM_ROOT__OWNED_ITEM_TYPES);
    }
    return childrenFeatures;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
    // Check the type of the specified child object and return the proper feature to use for
    // adding (see {@link AddCommand}) it as a child.

    return super.getChildFeature(object, child);
  }

	/**
   * This returns ItemRoot.gif.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/ItemRoot"));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected boolean shouldComposeCreationImage() {
    return true;
  }

	/**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String getText(Object object) {
    String label = ((ItemRoot)object).getName();
    return label == null || label.length() == 0 ?
      getString("_UI_ItemRoot_type") :
      getString("_UI_ItemRoot_type") + " " + label;
  }

	/**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void notifyChanged(Notification notification) {
    updateChildren(notification);

    switch (notification.getFeatureID(ItemRoot.class)) {
      case DataPackage.ITEM_ROOT__NAME:
      case DataPackage.ITEM_ROOT__NAME_FR_FR:
      case DataPackage.ITEM_ROOT__DB_NAME:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
      case DataPackage.ITEM_ROOT__OWNED_CATEGORY_PKGS:
      case DataPackage.ITEM_ROOT__OWNED_CATEGORIES:
      case DataPackage.ITEM_ROOT__OWNED_PRODUCT_PKGS:
      case DataPackage.ITEM_ROOT__OWNED_PRODUCTS:
      case DataPackage.ITEM_ROOT__OWNED_ITEM_PKGS:
      case DataPackage.ITEM_ROOT__OWNED_ITEMS:
      case DataPackage.ITEM_ROOT__OWNED_SCREEN_PKGS:
      case DataPackage.ITEM_ROOT__OWNED_SCREENS:
      case DataPackage.ITEM_ROOT__OWNED_TYPE_PKGS:
      case DataPackage.ITEM_ROOT__OWNED_TYPES:
      case DataPackage.ITEM_ROOT__OWNED_TABLES:
      case DataPackage.ITEM_ROOT__OWNED_APPLICATIONS:
      case DataPackage.ITEM_ROOT__OWNED_SCREEN_LISTS:
      case DataPackage.ITEM_ROOT__OWNED_ITEM_TYPES:
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
        (DataPackage.Literals.CATEGORY_PKG__OWNED_CATEGORY_PKGS,
         DataFactory.eINSTANCE.createItemRoot()));

    newChildDescriptors.add
      (createChildParameter
        (DataPackage.Literals.CATEGORY_PKG__OWNED_CATEGORY_PKGS,
         DataFactory.eINSTANCE.createCategoryPkg()));

    newChildDescriptors.add
      (createChildParameter
        (DataPackage.Literals.CATEGORY_PKG__OWNED_CATEGORY_PKGS,
         DataFactory.eINSTANCE.createApplication()));

    newChildDescriptors.add
      (createChildParameter
        (DataPackage.Literals.CATEGORY_PKG__OWNED_CATEGORIES,
         DataFactory.eINSTANCE.createCategory()));

    newChildDescriptors.add
      (createChildParameter
        (DataPackage.Literals.CATEGORY_PKG__OWNED_CATEGORIES,
         DataFactory.eINSTANCE.createCategoryView()));

    newChildDescriptors.add
      (createChildParameter
        (DataPackage.Literals.PRODUCT_PKG__OWNED_PRODUCT_PKGS,
         DataFactory.eINSTANCE.createItemRoot()));

    newChildDescriptors.add
      (createChildParameter
        (DataPackage.Literals.PRODUCT_PKG__OWNED_PRODUCT_PKGS,
         DataFactory.eINSTANCE.createProductPkg()));

    newChildDescriptors.add
      (createChildParameter
        (DataPackage.Literals.PRODUCT_PKG__OWNED_PRODUCTS,
         DataFactory.eINSTANCE.createProduct()));

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
        (DataPackage.Literals.SCREEN_PKG__OWNED_SCREEN_PKGS,
         DataFactory.eINSTANCE.createItemRoot()));

    newChildDescriptors.add
      (createChildParameter
        (DataPackage.Literals.SCREEN_PKG__OWNED_SCREEN_PKGS,
         DataFactory.eINSTANCE.createScreenPkg()));

    newChildDescriptors.add
      (createChildParameter
        (DataPackage.Literals.SCREEN_PKG__OWNED_SCREEN_PKGS,
         DataFactory.eINSTANCE.createApplication()));

    newChildDescriptors.add
      (createChildParameter
        (DataPackage.Literals.SCREEN_PKG__OWNED_SCREENS,
         DataFactory.eINSTANCE.createScreen()));

    newChildDescriptors.add
      (createChildParameter
        (DataPackage.Literals.ITEM_TYPE_PKG__OWNED_TYPE_PKGS,
         DataFactory.eINSTANCE.createItemRoot()));

    newChildDescriptors.add
      (createChildParameter
        (DataPackage.Literals.ITEM_TYPE_PKG__OWNED_TYPE_PKGS,
         DataFactory.eINSTANCE.createItemTypePkg()));

    newChildDescriptors.add
      (createChildParameter
        (DataPackage.Literals.ITEM_TYPE_PKG__OWNED_TYPES,
         DataFactory.eINSTANCE.createItemType()));

    newChildDescriptors.add
      (createChildParameter
        (TablePackage.Literals.DTABLE_PKG__OWNED_TABLES,
         TableFactory.eINSTANCE.createDTable()));

    newChildDescriptors.add
      (createChildParameter
        (DataPackage.Literals.ITEM_ROOT__OWNED_APPLICATIONS,
         DataFactory.eINSTANCE.createApplication()));

    newChildDescriptors.add
      (createChildParameter
        (DataPackage.Literals.ITEM_ROOT__OWNED_SCREEN_LISTS,
         DataFactory.eINSTANCE.createScreenList()));

    newChildDescriptors.add
      (createChildParameter
        (DataPackage.Literals.ITEM_ROOT__OWNED_SCREEN_LISTS,
         DataFactory.eINSTANCE.createHomeScreenList()));

    newChildDescriptors.add
      (createChildParameter
        (DataPackage.Literals.ITEM_ROOT__OWNED_SCREEN_LISTS,
         DataFactory.eINSTANCE.createFavouriteItemsView()));

    newChildDescriptors.add
      (createChildParameter
        (DataPackage.Literals.ITEM_ROOT__OWNED_SCREEN_LISTS,
         DataFactory.eINSTANCE.createFavouriteCategoriesView()));

    newChildDescriptors.add
      (createChildParameter
        (DataPackage.Literals.ITEM_ROOT__OWNED_ITEM_TYPES,
         DataFactory.eINSTANCE.createItemType()));
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
      childFeature == DataPackage.Literals.CATEGORY_PKG__OWNED_CATEGORY_PKGS ||
      childFeature == DataPackage.Literals.PRODUCT_PKG__OWNED_PRODUCT_PKGS ||
      childFeature == DataPackage.Literals.ITEM_PKG__OWNED_ITEM_PKGS ||
      childFeature == DataPackage.Literals.SCREEN_PKG__OWNED_SCREEN_PKGS ||
      childFeature == DataPackage.Literals.ITEM_TYPE_PKG__OWNED_TYPE_PKGS ||
      childFeature == DataPackage.Literals.ITEM_ROOT__OWNED_APPLICATIONS ||
      childFeature == DataPackage.Literals.CATEGORY_PKG__OWNED_CATEGORIES ||
      childFeature == DataPackage.Literals.ITEM_TYPE_PKG__OWNED_TYPES ||
      childFeature == DataPackage.Literals.ITEM_ROOT__OWNED_ITEM_TYPES;

    if (qualify) {
      return getString
        ("_UI_CreateChild_text2",
         new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
    }
    return super.getCreateChildText(owner, feature, child, selection);
  }

}
