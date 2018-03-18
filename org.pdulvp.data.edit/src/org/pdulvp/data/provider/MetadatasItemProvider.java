/**
 */
package org.pdulvp.data.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.pdulvp.data.DataPackage;
import org.pdulvp.data.Metadatas;

/**
 * This is the item provider adapter for a {@link org.pdulvp.data.Metadatas} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MetadatasItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MetadatasItemProvider(AdapterFactory adapterFactory) {
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

      addAuthor_namePropertyDescriptor(object);
      addAuthor_emailPropertyDescriptor(object);
      addLicencePropertyDescriptor(object);
      addCategory_namePropertyDescriptor(object);
      addVersionPropertyDescriptor(object);
      addDownloadPropertyDescriptor(object);
      addRatePropertyDescriptor(object);
      addNewsPropertyDescriptor(object);
      addDatePropertyDescriptor(object);
      addSizePropertyDescriptor(object);
      addPricePropertyDescriptor(object);
      addSourcePropertyDescriptor(object);
      addNamePropertyDescriptor(object);
      addName_frFRPropertyDescriptor(object);
      addDescriptionPropertyDescriptor(object);
      addDescription_frFRPropertyDescriptor(object);
      addShortDescriptionPropertyDescriptor(object);
      addMapsUriPropertyDescriptor(object);
      addImage_mainUriPropertyDescriptor(object);
      addImage_preview2UriPropertyDescriptor(object);
      addSiteUriPropertyDescriptor(object);
      addTripAdvisorUriPropertyDescriptor(object);
      addChartPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

	/**
   * This adds a property descriptor for the Description feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addDescriptionPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Metadatas_description_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Metadatas_description_feature", "_UI_Metadatas_type"),
         DataPackage.Literals.METADATAS__DESCRIPTION,
         true,
         true,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Description fr FR feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addDescription_frFRPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Metadatas_description_frFR_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Metadatas_description_frFR_feature", "_UI_Metadatas_type"),
         DataPackage.Literals.METADATAS__DESCRIPTION_FR_FR,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Short Description feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addShortDescriptionPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Metadatas_shortDescription_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Metadatas_shortDescription_feature", "_UI_Metadatas_type"),
         DataPackage.Literals.METADATAS__SHORT_DESCRIPTION,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Maps Uri feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addMapsUriPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Metadatas_mapsUri_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Metadatas_mapsUri_feature", "_UI_Metadatas_type"),
         DataPackage.Literals.METADATAS__MAPS_URI,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Image main Uri feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addImage_mainUriPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Metadatas_image_mainUri_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Metadatas_image_mainUri_feature", "_UI_Metadatas_type"),
         DataPackage.Literals.METADATAS__IMAGE_MAIN_URI,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Image preview2 Uri feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addImage_preview2UriPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Metadatas_image_preview2Uri_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Metadatas_image_preview2Uri_feature", "_UI_Metadatas_type"),
         DataPackage.Literals.METADATAS__IMAGE_PREVIEW2_URI,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Site Uri feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addSiteUriPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Metadatas_siteUri_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Metadatas_siteUri_feature", "_UI_Metadatas_type"),
         DataPackage.Literals.METADATAS__SITE_URI,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Trip Advisor Uri feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addTripAdvisorUriPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Metadatas_tripAdvisorUri_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Metadatas_tripAdvisorUri_feature", "_UI_Metadatas_type"),
         DataPackage.Literals.METADATAS__TRIP_ADVISOR_URI,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Chart feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addChartPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Metadatas_chart_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Metadatas_chart_feature", "_UI_Metadatas_type"),
         DataPackage.Literals.METADATAS__CHART,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Author name feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addAuthor_namePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Metadatas_author_name_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Metadatas_author_name_feature", "_UI_Metadatas_type"),
         DataPackage.Literals.METADATAS__AUTHOR_NAME,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Author email feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addAuthor_emailPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Metadatas_author_email_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Metadatas_author_email_feature", "_UI_Metadatas_type"),
         DataPackage.Literals.METADATAS__AUTHOR_EMAIL,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Licence feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addLicencePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Metadatas_licence_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Metadatas_licence_feature", "_UI_Metadatas_type"),
         DataPackage.Literals.METADATAS__LICENCE,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Category name feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addCategory_namePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Metadatas_category_name_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Metadatas_category_name_feature", "_UI_Metadatas_type"),
         DataPackage.Literals.METADATAS__CATEGORY_NAME,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Version feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addVersionPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Metadatas_version_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Metadatas_version_feature", "_UI_Metadatas_type"),
         DataPackage.Literals.METADATAS__VERSION,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Download feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addDownloadPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Metadatas_download_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Metadatas_download_feature", "_UI_Metadatas_type"),
         DataPackage.Literals.METADATAS__DOWNLOAD,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Rate feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addRatePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Metadatas_rate_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Metadatas_rate_feature", "_UI_Metadatas_type"),
         DataPackage.Literals.METADATAS__RATE,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the News feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addNewsPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Metadatas_news_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Metadatas_news_feature", "_UI_Metadatas_type"),
         DataPackage.Literals.METADATAS__NEWS,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Date feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addDatePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Metadatas_date_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Metadatas_date_feature", "_UI_Metadatas_type"),
         DataPackage.Literals.METADATAS__DATE,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Size feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addSizePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Metadatas_size_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Metadatas_size_feature", "_UI_Metadatas_type"),
         DataPackage.Literals.METADATAS__SIZE,
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
         getString("_UI_Metadatas_price_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Metadatas_price_feature", "_UI_Metadatas_type"),
         DataPackage.Literals.METADATAS__PRICE,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Source feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addSourcePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Metadatas_source_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Metadatas_source_feature", "_UI_Metadatas_type"),
         DataPackage.Literals.METADATAS__SOURCE,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
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
         getString("_UI_Metadatas_name_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Metadatas_name_feature", "_UI_Metadatas_type"),
         DataPackage.Literals.METADATAS__NAME,
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
         getString("_UI_Metadatas_name_frFR_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Metadatas_name_frFR_feature", "_UI_Metadatas_type"),
         DataPackage.Literals.METADATAS__NAME_FR_FR,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This returns Metadatas.gif.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/Metadatas"));
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
    String label = ((Metadatas)object).getName();
    return label == null || label.length() == 0 ?
      getString("_UI_Metadatas_type") :
      getString("_UI_Metadatas_type") + " " + label;
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

    switch (notification.getFeatureID(Metadatas.class)) {
      case DataPackage.METADATAS__AUTHOR_NAME:
      case DataPackage.METADATAS__AUTHOR_EMAIL:
      case DataPackage.METADATAS__LICENCE:
      case DataPackage.METADATAS__CATEGORY_NAME:
      case DataPackage.METADATAS__VERSION:
      case DataPackage.METADATAS__DOWNLOAD:
      case DataPackage.METADATAS__RATE:
      case DataPackage.METADATAS__NEWS:
      case DataPackage.METADATAS__DATE:
      case DataPackage.METADATAS__SIZE:
      case DataPackage.METADATAS__PRICE:
      case DataPackage.METADATAS__SOURCE:
      case DataPackage.METADATAS__NAME:
      case DataPackage.METADATAS__NAME_FR_FR:
      case DataPackage.METADATAS__DESCRIPTION:
      case DataPackage.METADATAS__DESCRIPTION_FR_FR:
      case DataPackage.METADATAS__SHORT_DESCRIPTION:
      case DataPackage.METADATAS__MAPS_URI:
      case DataPackage.METADATAS__IMAGE_MAIN_URI:
      case DataPackage.METADATAS__IMAGE_PREVIEW2_URI:
      case DataPackage.METADATAS__SITE_URI:
      case DataPackage.METADATAS__TRIP_ADVISOR_URI:
      case DataPackage.METADATAS__CHART:
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

	/**
   * Return the resource locator for this item provider's resources.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public ResourceLocator getResourceLocator() {
    return DataEditPlugin.INSTANCE;
  }

}
