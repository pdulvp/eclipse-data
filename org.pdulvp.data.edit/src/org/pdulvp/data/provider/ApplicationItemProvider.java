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
import org.eclipse.osgi.util.NLS;
import org.pdulvp.data.Application;
import org.pdulvp.data.Category;
import org.pdulvp.data.DataFactory;
import org.pdulvp.data.DataPackage;
import org.pdulvp.data.HomeItem;

/**
 * This is the item provider adapter for a {@link org.pdulvp.data.Application} object.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class ApplicationItemProvider extends AbstractItemItemProvider {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ApplicationItemProvider(AdapterFactory adapterFactory) {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
    if (itemPropertyDescriptors == null) {
      super.getPropertyDescriptors(object);

      addNamePropertyDescriptor(object);
      addName_frFRPropertyDescriptor(object);
      addOwnedJobsPropertyDescriptor(object);
      addOwnedRequestsPropertyDescriptor(object);
      addOwnedSchemasPropertyDescriptor(object);
      addCategoryPropertyDescriptor(object);
      addSchemaPropertyDescriptor(object);
      addServerUrlPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Name feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
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
   * <!-- begin-user-doc --> <!-- end-user-doc -->
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
   * This adds a property descriptor for the Owned Jobs feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addOwnedJobsPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_JobPkg_ownedJobs_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_JobPkg_ownedJobs_feature", "_UI_JobPkg_type"),
         DataPackage.Literals.JOB_PKG__OWNED_JOBS,
         true,
         false,
         false,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Owned Requests feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addOwnedRequestsPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_RequestPkg_ownedRequests_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_RequestPkg_ownedRequests_feature", "_UI_RequestPkg_type"),
         DataPackage.Literals.REQUEST_PKG__OWNED_REQUESTS,
         true,
         false,
         false,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Owned Schemas feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addOwnedSchemasPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_SchemaPkg_ownedSchemas_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_SchemaPkg_ownedSchemas_feature", "_UI_SchemaPkg_type"),
         DataPackage.Literals.SCHEMA_PKG__OWNED_SCHEMAS,
         true,
         false,
         false,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Category feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addCategoryPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Application_category_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Application_category_feature", "_UI_Application_type"),
         DataPackage.Literals.APPLICATION__CATEGORY,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Schema feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addSchemaPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Application_schema_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Application_schema_feature", "_UI_Application_type"),
         DataPackage.Literals.APPLICATION__SCHEMA,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Server Url feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addServerUrlPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Application_serverUrl_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Application_serverUrl_feature", "_UI_Application_type"),
         DataPackage.Literals.APPLICATION__SERVER_URL,
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
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
    if (childrenFeatures == null) {
      super.getChildrenFeatures(object);
      childrenFeatures.add(DataPackage.Literals.CATEGORY_PKG__OWNED_CATEGORY_PKGS);
      childrenFeatures.add(DataPackage.Literals.CATEGORY_PKG__OWNED_CATEGORIES);
      childrenFeatures.add(DataPackage.Literals.ITEM_PKG__OWNED_ITEM_PKGS);
      childrenFeatures.add(DataPackage.Literals.ITEM_PKG__OWNED_ITEMS);
      childrenFeatures.add(DataPackage.Literals.SCREEN_PKG__OWNED_SCREEN_PKGS);
      childrenFeatures.add(DataPackage.Literals.SCREEN_PKG__OWNED_SCREENS);
      childrenFeatures.add(DataPackage.Literals.JOB_PKG__OWNED_JOBS);
      childrenFeatures.add(DataPackage.Literals.JOB_PKG__OWNED_JOB_PKGS);
      childrenFeatures.add(DataPackage.Literals.REQUEST_PKG__OWNED_REQUESTS);
      childrenFeatures.add(DataPackage.Literals.REQUEST_PKG__OWNED_REQUEST_PKGS);
      childrenFeatures.add(DataPackage.Literals.SCHEMA_PKG__OWNED_SCHEMAS);
      childrenFeatures.add(DataPackage.Literals.APPLICATION__OWNED_HOMES);
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
   * This returns Application.gif.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/Application"));
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
   * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  @Override
  public String getText(Object object) {
    String sameApp = null;
    Application app = null;

    Category cat = ((Application) object).getCategory();
    sameApp = NLS.bind("{0} [{1}]", (cat == null ? "nocategory" : cat.getName()), ((Application) object).getTag());

    for (HomeItem item : ((Application) object).getOwnedHomes()) {
      if (item.getApplication() == null) {
        sameApp = "no app";
        break;
      } else if (app == null) {
        app = item.getApplication();
        sameApp = NLS.bind("{0} [{1}]", (cat == null ? "nocategory" : cat.getName()), item.getApplication().getTag());

      } else if (!app.equals(item.getApplication())) {
        sameApp = "not same app";
        break;
      }
    }

    return getString("_UI_Application_type") + " " + sameApp;

  }

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void notifyChanged(Notification notification) {
    updateChildren(notification);

    switch (notification.getFeatureID(Application.class)) {
      case DataPackage.APPLICATION__NAME:
      case DataPackage.APPLICATION__NAME_FR_FR:
      case DataPackage.APPLICATION__SERVER_URL:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
      case DataPackage.APPLICATION__OWNED_CATEGORY_PKGS:
      case DataPackage.APPLICATION__OWNED_CATEGORIES:
      case DataPackage.APPLICATION__OWNED_ITEM_PKGS:
      case DataPackage.APPLICATION__OWNED_ITEMS:
      case DataPackage.APPLICATION__OWNED_SCREEN_PKGS:
      case DataPackage.APPLICATION__OWNED_SCREENS:
      case DataPackage.APPLICATION__OWNED_JOBS:
      case DataPackage.APPLICATION__OWNED_JOB_PKGS:
      case DataPackage.APPLICATION__OWNED_REQUESTS:
      case DataPackage.APPLICATION__OWNED_REQUEST_PKGS:
      case DataPackage.APPLICATION__OWNED_SCHEMAS:
      case DataPackage.APPLICATION__OWNED_HOMES:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
        return;
    }
    super.notifyChanged(notification);
  }

  /**
   * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
   * that can be created under this object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
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
        (DataPackage.Literals.JOB_PKG__OWNED_JOBS,
         DataFactory.eINSTANCE.createJob()));

    newChildDescriptors.add
      (createChildParameter
        (DataPackage.Literals.JOB_PKG__OWNED_JOB_PKGS,
         DataFactory.eINSTANCE.createApplication()));

    newChildDescriptors.add
      (createChildParameter
        (DataPackage.Literals.JOB_PKG__OWNED_JOB_PKGS,
         DataFactory.eINSTANCE.createJobPkg()));

    newChildDescriptors.add
      (createChildParameter
        (DataPackage.Literals.REQUEST_PKG__OWNED_REQUESTS,
         DataFactory.eINSTANCE.createRequest()));

    newChildDescriptors.add
      (createChildParameter
        (DataPackage.Literals.REQUEST_PKG__OWNED_REQUEST_PKGS,
         DataFactory.eINSTANCE.createApplication()));

    newChildDescriptors.add
      (createChildParameter
        (DataPackage.Literals.REQUEST_PKG__OWNED_REQUEST_PKGS,
         DataFactory.eINSTANCE.createRequestPkg()));

    newChildDescriptors.add
      (createChildParameter
        (DataPackage.Literals.SCHEMA_PKG__OWNED_SCHEMAS,
         DataFactory.eINSTANCE.createSchema()));

    newChildDescriptors.add
      (createChildParameter
        (DataPackage.Literals.APPLICATION__OWNED_HOMES,
         DataFactory.eINSTANCE.createHomeItem()));
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
      childFeature == DataPackage.Literals.ITEM_PKG__OWNED_ITEM_PKGS ||
      childFeature == DataPackage.Literals.SCREEN_PKG__OWNED_SCREEN_PKGS ||
      childFeature == DataPackage.Literals.JOB_PKG__OWNED_JOB_PKGS ||
      childFeature == DataPackage.Literals.REQUEST_PKG__OWNED_REQUEST_PKGS ||
      childFeature == DataPackage.Literals.CATEGORY_PKG__OWNED_CATEGORIES;

    if (qualify) {
      return getString
        ("_UI_CreateChild_text2",
         new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
    }
    return super.getCreateChildText(owner, feature, child, selection);
  }

}
