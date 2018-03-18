/**
 */
package org.pdulvp.data.table.provider;


import java.net.URL;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.DecorationOverlayIcon;
import org.eclipse.jface.viewers.IDecoration;
import org.pdulvp.data.table.DFeature;
import org.pdulvp.data.table.TablePackage;

/**
 * This is the item provider adapter for a {@link org.pdulvp.data.table.DFeature} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DFeatureItemProvider extends DNamedElementItemProvider {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DFeatureItemProvider(AdapterFactory adapterFactory) {
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

      addJsonNamePropertyDescriptor(object);
      addEditablePropertyDescriptor(object);
      addExternalPropertyDescriptor(object);
      addExportJsonPropertyDescriptor(object);
      addFeaturePropertyDescriptor(object);
      addManyPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Json Name feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addJsonNamePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_DFeature_jsonName_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_DFeature_jsonName_feature", "_UI_DFeature_type"),
         TablePackage.Literals.DFEATURE__JSON_NAME,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Editable feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addEditablePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_DFeature_editable_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_DFeature_editable_feature", "_UI_DFeature_type"),
         TablePackage.Literals.DFEATURE__EDITABLE,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the External feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addExternalPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_DFeature_external_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_DFeature_external_feature", "_UI_DFeature_type"),
         TablePackage.Literals.DFEATURE__EXTERNAL,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Export Json feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addExportJsonPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_DFeature_exportJson_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_DFeature_exportJson_feature", "_UI_DFeature_type"),
         TablePackage.Literals.DFEATURE__EXPORT_JSON,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Feature feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addFeaturePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_DFeature_feature_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_DFeature_feature_feature", "_UI_DFeature_type"),
         TablePackage.Literals.DFEATURE__FEATURE,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Many feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addManyPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_DFeature_many_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_DFeature_many_feature", "_UI_DFeature_type"),
         TablePackage.Literals.DFEATURE__MANY,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

		/**
   * This returns DFeature.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/DFeature"));
  }
  
  
  /**
	 * This returns DFeature.gif.
	 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
	 * @generated NOT
	 */
  @Override
  protected Object overlayImage(Object object, Object image) {
    Object i = super.overlayImage(object, image);
    DFeature item = (DFeature) object;

    org.eclipse.swt.graphics.Image baseImage = null;
    if (i instanceof URL) {
      baseImage = ImageDescriptor.createFromURL((URL) i).createImage();
    } else {
      baseImage = (org.eclipse.swt.graphics.Image) image;
    }
    String uri = null;
    if (!item.isEditable()) {
      uri = "full/edt16/lock";
      ImageDescriptor overlayImage = ImageDescriptor.createFromURL((URL) getResourceLocator().getImage(uri));
      DecorationOverlayIcon icon = new DecorationOverlayIcon(baseImage, overlayImage, IDecoration.BOTTOM_LEFT);
      baseImage = icon.createImage();
    }
    if (item.isExternal()) {
        uri = "full/edt16/external";
        ImageDescriptor overlayImage = ImageDescriptor.createFromURL((URL) getResourceLocator().getImage(uri));
        DecorationOverlayIcon icon = new DecorationOverlayIcon(baseImage, overlayImage, IDecoration.TOP_LEFT);
        baseImage = icon.createImage();
    }
    if (item.isExportJson()) {
        uri = "full/edt16/export";
        ImageDescriptor overlayImage = ImageDescriptor.createFromURL((URL) getResourceLocator().getImage(uri));
        DecorationOverlayIcon icon = new DecorationOverlayIcon(baseImage, overlayImage, IDecoration.BOTTOM_RIGHT);
        baseImage = icon.createImage();
    }
    return baseImage;
    /*
     * if (item.isBet()) {
     * 
     * if (item.getBetValue() == 0) { uri = "full/obj16/test-state.png"; overlayImage =
     * ImageDescriptor.createFromURL((URL) getResourceLocator().getImage(uri)); icon = new
     * DecorationOverlayIcon(baseImage, overlayImage, IDecoration.BOTTOM_LEFT); baseImage = icon.createImage();
     * 
     * } }
     */
    // img.add(EMFEditPlugin.INSTANCE.getImage(key))
    // }

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
    String label = ((DFeature)object).getId();
    return label == null || label.length() == 0 ?
      getString("_UI_DFeature_type") :
      getString("_UI_DFeature_type") + " " + label;
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

    switch (notification.getFeatureID(DFeature.class)) {
      case TablePackage.DFEATURE__JSON_NAME:
      case TablePackage.DFEATURE__EDITABLE:
      case TablePackage.DFEATURE__EXTERNAL:
      case TablePackage.DFEATURE__EXPORT_JSON:
      case TablePackage.DFEATURE__MANY:
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
