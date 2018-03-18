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
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.pdulvp.data.DataPackage;
import org.pdulvp.data.ScreenList;
import org.pdulvp.data.helpers.CategoryExt;

/**
 * This is the item provider adapter for a {@link org.pdulvp.data.ScreenList} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class ScreenListItemProvider extends AbstractItemItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ScreenListItemProvider(AdapterFactory adapterFactory) {
    super(adapterFactory);
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

      addCategoryPropertyDescriptor(object);
      addScreenPropertyDescriptor(object);
      addIconDataPropertyDescriptor(object);
      addStylePropertyDescriptor(object);
      addPacksPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

	/**
   * This adds a property descriptor for the Icon Data feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addIconDataPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_ScreenList_iconData_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_ScreenList_iconData_feature", "_UI_ScreenList_type"),
         DataPackage.Literals.SCREEN_LIST__ICON_DATA,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Style feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addStylePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_ScreenList_style_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_ScreenList_style_feature", "_UI_ScreenList_type"),
         DataPackage.Literals.SCREEN_LIST__STYLE,
         false,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Packs feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addPacksPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_ScreenList_packs_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_ScreenList_packs_feature", "_UI_ScreenList_type"),
         DataPackage.Literals.SCREEN_LIST__PACKS,
         false,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

	/**
	 * This adds a property descriptor for the Category feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addCategoryPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_ScreenList_category_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_ScreenList_category_feature", "_UI_ScreenList_type"),
         DataPackage.Literals.SCREEN_LIST__CATEGORY,
         true,
         false,
         true,
         null,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Screen feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addScreenPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_ScreenList_screen_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_ScreenList_screen_feature", "_UI_ScreenList_type"),
         DataPackage.Literals.SCREEN_LIST__SCREEN,
         true,
         false,
         true,
         null,
         null,
         null));
  }

	/**
	 * This returns ScreenList.gif. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/ScreenList"));
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
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */

	@Override
	public String getText(Object object) {

		String label = CategoryExt.getText((((ScreenList) object).getCategory()));
		String labelScreen = ((ScreenList) object).getScreen().getTag();

		return (label == null) || (label.length() == 0) ? getString("_UI_ScreenList_type") : label + "__" + labelScreen;
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

    switch (notification.getFeatureID(ScreenList.class)) {
      case DataPackage.SCREEN_LIST__ICON_DATA:
      case DataPackage.SCREEN_LIST__STYLE:
      case DataPackage.SCREEN_LIST__PACKS:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
    }
    super.notifyChanged(notification);
  }

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
    super.collectNewChildDescriptors(newChildDescriptors, object);
  }

}
