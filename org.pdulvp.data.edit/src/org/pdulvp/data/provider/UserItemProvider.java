/**
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
import org.pdulvp.data.User;

/**
 * This is the item provider adapter for a {@link org.pdulvp.data.User} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UserItemProvider 
	extends AbstractItemItemProvider {
	/**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public UserItemProvider(AdapterFactory adapterFactory) {
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

      addMailPropertyDescriptor(object);
      addPasswordPropertyDescriptor(object);
      addFavouriteCategoriesPropertyDescriptor(object);
      addFavouriteItemsPropertyDescriptor(object);
      addClickedItemsPropertyDescriptor(object);
      addWidgetedItemsPropertyDescriptor(object);
      addGcmPropertyDescriptor(object);
      addIdentifiersPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

	/**
   * This adds a property descriptor for the Mail feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addMailPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_User_mail_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_User_mail_feature", "_UI_User_type"),
         DataPackage.Literals.USER__MAIL,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Password feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addPasswordPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_User_password_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_User_password_feature", "_UI_User_type"),
         DataPackage.Literals.USER__PASSWORD,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Favourite Categories feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addFavouriteCategoriesPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_User_favouriteCategories_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_User_favouriteCategories_feature", "_UI_User_type"),
         DataPackage.Literals.USER__FAVOURITE_CATEGORIES,
         true,
         false,
         true,
         null,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Favourite Items feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addFavouriteItemsPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_User_favouriteItems_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_User_favouriteItems_feature", "_UI_User_type"),
         DataPackage.Literals.USER__FAVOURITE_ITEMS,
         true,
         false,
         true,
         null,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Clicked Items feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addClickedItemsPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_User_clickedItems_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_User_clickedItems_feature", "_UI_User_type"),
         DataPackage.Literals.USER__CLICKED_ITEMS,
         true,
         false,
         true,
         null,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Widgeted Items feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addWidgetedItemsPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_User_widgetedItems_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_User_widgetedItems_feature", "_UI_User_type"),
         DataPackage.Literals.USER__WIDGETED_ITEMS,
         true,
         false,
         true,
         null,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Gcm feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addGcmPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_User_gcm_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_User_gcm_feature", "_UI_User_type"),
         DataPackage.Literals.USER__GCM,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Identifiers feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addIdentifiersPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_User_identifiers_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_User_identifiers_feature", "_UI_User_type"),
         DataPackage.Literals.USER__IDENTIFIERS,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This returns User.gif.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/User"));
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
    String label = ((User)object).getId();
    return label == null || label.length() == 0 ?
      getString("_UI_User_type") :
      getString("_UI_User_type") + " " + label;
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

    switch (notification.getFeatureID(User.class)) {
      case DataPackage.USER__MAIL:
      case DataPackage.USER__PASSWORD:
      case DataPackage.USER__GCM:
      case DataPackage.USER__IDENTIFIERS:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
  }

}
