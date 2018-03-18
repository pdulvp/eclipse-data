/**
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
import org.pdulvp.data.ImageItem;

/**
 * This is the item provider adapter for a {@link org.pdulvp.data.ImageItem} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ImageItemItemProvider extends ChildItemItemProvider {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImageItemItemProvider(AdapterFactory adapterFactory) {
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

      addSourcePathPropertyDescriptor(object);
      addDateCreatedPropertyDescriptor(object);
      addStylePropertyDescriptor(object);
      addGImageDataPathPropertyDescriptor(object);
      addGIconDataPathPropertyDescriptor(object);
      addGIcon16PathPropertyDescriptor(object);
      addGTypePropertyDescriptor(object);
      addIconDataPropertyDescriptor(object);
      addImageDataPropertyDescriptor(object);
      addPacksPropertyDescriptor(object);
      addRankPropertyDescriptor(object);
      addExternalPathPropertyDescriptor(object);
      addProductsPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
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
         getString("_UI_ImageItem_packs_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_ImageItem_packs_feature", "_UI_ImageItem_type"),
         DataPackage.Literals.IMAGE_ITEM__PACKS,
         false,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Products feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addProductsPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_ImageItem_products_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_ImageItem_products_feature", "_UI_ImageItem_type"),
         DataPackage.Literals.IMAGE_ITEM__PRODUCTS,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Source Path feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addSourcePathPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_ImageItem_sourcePath_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_ImageItem_sourcePath_feature", "_UI_ImageItem_type"),
         DataPackage.Literals.IMAGE_ITEM__SOURCE_PATH,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Date Created feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addDateCreatedPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_ImageItem_dateCreated_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_ImageItem_dateCreated_feature", "_UI_ImageItem_type"),
         DataPackage.Literals.IMAGE_ITEM__DATE_CREATED,
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
         getString("_UI_ImageItem_style_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_ImageItem_style_feature", "_UI_ImageItem_type"),
         DataPackage.Literals.IMAGE_ITEM__STYLE,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the GImage Data Path feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addGImageDataPathPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_ImageItem_gImageDataPath_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_ImageItem_gImageDataPath_feature", "_UI_ImageItem_type"),
         DataPackage.Literals.IMAGE_ITEM__GIMAGE_DATA_PATH,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the GIcon Data Path feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addGIconDataPathPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_ImageItem_gIconDataPath_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_ImageItem_gIconDataPath_feature", "_UI_ImageItem_type"),
         DataPackage.Literals.IMAGE_ITEM__GICON_DATA_PATH,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the GIcon16 Path feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addGIcon16PathPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_ImageItem_gIcon16Path_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_ImageItem_gIcon16Path_feature", "_UI_ImageItem_type"),
         DataPackage.Literals.IMAGE_ITEM__GICON16_PATH,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the GType feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addGTypePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_ImageItem_gType_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_ImageItem_gType_feature", "_UI_ImageItem_type"),
         DataPackage.Literals.IMAGE_ITEM__GTYPE,
         true,
         false,
         true,
         null,
         null,
         null));
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
         getString("_UI_ImageItem_iconData_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_ImageItem_iconData_feature", "_UI_ImageItem_type"),
         DataPackage.Literals.IMAGE_ITEM__ICON_DATA,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Image Data feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addImageDataPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_ImageItem_imageData_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_ImageItem_imageData_feature", "_UI_ImageItem_type"),
         DataPackage.Literals.IMAGE_ITEM__IMAGE_DATA,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Rank feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addRankPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_ImageItem_rank_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_ImageItem_rank_feature", "_UI_ImageItem_type"),
         DataPackage.Literals.IMAGE_ITEM__RANK,
         true,
         false,
         false,
         ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the External Path feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addExternalPathPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_ImageItem_externalPath_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_ImageItem_externalPath_feature", "_UI_ImageItem_type"),
         DataPackage.Literals.IMAGE_ITEM__EXTERNAL_PATH,
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
      childrenFeatures.add(DataPackage.Literals.IMAGE_ITEM__METADATAS);
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
    String label = ((ImageItem)object).getId();
    return label == null || label.length() == 0 ?
      getString("_UI_ImageItem_type") :
      getString("_UI_ImageItem_type") + " " + label;
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

    switch (notification.getFeatureID(ImageItem.class)) {
      case DataPackage.IMAGE_ITEM__SOURCE_PATH:
      case DataPackage.IMAGE_ITEM__DATE_CREATED:
      case DataPackage.IMAGE_ITEM__STYLE:
      case DataPackage.IMAGE_ITEM__GIMAGE_DATA_PATH:
      case DataPackage.IMAGE_ITEM__GICON_DATA_PATH:
      case DataPackage.IMAGE_ITEM__GICON16_PATH:
      case DataPackage.IMAGE_ITEM__ICON_DATA:
      case DataPackage.IMAGE_ITEM__IMAGE_DATA:
      case DataPackage.IMAGE_ITEM__PACKS:
      case DataPackage.IMAGE_ITEM__RANK:
      case DataPackage.IMAGE_ITEM__EXTERNAL_PATH:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
      case DataPackage.IMAGE_ITEM__METADATAS:
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
        (DataPackage.Literals.IMAGE_ITEM__METADATAS,
         DataFactory.eINSTANCE.createMetadatas()));
  }

}
