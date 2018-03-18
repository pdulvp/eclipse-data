/**
 */
package org.pdulvp.data.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.pdulvp.data.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataFactoryImpl extends EFactoryImpl implements DataFactory {
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DataFactory init() {
    try {
      DataFactory theDataFactory = (DataFactory)EPackage.Registry.INSTANCE.getEFactory(DataPackage.eNS_URI);
      if (theDataFactory != null) {
        return theDataFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DataFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataFactoryImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
      case DataPackage.ITEM_ROOT: return createItemRoot();
      case DataPackage.ITEM_PKG: return createItemPkg();
      case DataPackage.SCREEN_PKG: return createScreenPkg();
      case DataPackage.CATEGORY_PKG: return createCategoryPkg();
      case DataPackage.ITEM_TYPE_PKG: return createItemTypePkg();
      case DataPackage.TIMESTAMP: return createTimestamp();
      case DataPackage.CATEGORY: return createCategory();
      case DataPackage.ITEM: return createItem();
      case DataPackage.HOME_ITEM: return createHomeItem();
      case DataPackage.SCREEN: return createScreen();
      case DataPackage.USER: return createUser();
      case DataPackage.SCREEN_LIST: return createScreenList();
      case DataPackage.HOME_SCREEN_LIST: return createHomeScreenList();
      case DataPackage.CATEGORY_VIEW: return createCategoryView();
      case DataPackage.FAVOURITE_ITEMS_VIEW: return createFavouriteItemsView();
      case DataPackage.FAVOURITE_CATEGORIES_VIEW: return createFavouriteCategoriesView();
      case DataPackage.ITEM_TYPE: return createItemType();
      case DataPackage.METADATAS: return createMetadatas();
      case DataPackage.PRODUCT_PKG: return createProductPkg();
      case DataPackage.PRODUCT: return createProduct();
      case DataPackage.ITEM_PRODUCT: return createItemProduct();
      case DataPackage.OAUTH_TOKEN: return createOAuthToken();
      case DataPackage.APPLICATION: return createApplication();
      case DataPackage.SCHEMA_PKG: return createSchemaPkg();
      case DataPackage.SCHEMA: return createSchema();
      case DataPackage.SCHEMA_CLASS: return createSchemaClass();
      case DataPackage.SCHEMA_FEATURE: return createSchemaFeature();
      case DataPackage.REQUEST_PKG: return createRequestPkg();
      case DataPackage.REQUEST: return createRequest();
      case DataPackage.JOB_PKG: return createJobPkg();
      case DataPackage.JOB: return createJob();
      case DataPackage.TRIGGER: return createTrigger();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItemRoot createItemRoot() {
    ItemRootImpl itemRoot = new ItemRootImpl();
    return itemRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItemPkg createItemPkg() {
    ItemPkgImpl itemPkg = new ItemPkgImpl();
    return itemPkg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScreenPkg createScreenPkg() {
    ScreenPkgImpl screenPkg = new ScreenPkgImpl();
    return screenPkg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CategoryPkg createCategoryPkg() {
    CategoryPkgImpl categoryPkg = new CategoryPkgImpl();
    return categoryPkg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProductPkg createProductPkg() {
    ProductPkgImpl productPkg = new ProductPkgImpl();
    return productPkg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItemTypePkg createItemTypePkg() {
    ItemTypePkgImpl itemTypePkg = new ItemTypePkgImpl();
    return itemTypePkg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Timestamp createTimestamp() {
    TimestampImpl timestamp = new TimestampImpl();
    return timestamp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Category createCategory() {
    CategoryImpl category = new CategoryImpl();
    return category;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Item createItem() {
    ItemImpl item = new ItemImpl();
    return item;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Screen createScreen() {
    ScreenImpl screen = new ScreenImpl();
    return screen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public User createUser() {
    UserImpl user = new UserImpl();
    return user;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScreenList createScreenList() {
    ScreenListImpl screenList = new ScreenListImpl();
    return screenList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HomeScreenList createHomeScreenList() {
    HomeScreenListImpl homeScreenList = new HomeScreenListImpl();
    return homeScreenList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CategoryView createCategoryView() {
    CategoryViewImpl categoryView = new CategoryViewImpl();
    return categoryView;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FavouriteItemsView createFavouriteItemsView() {
    FavouriteItemsViewImpl favouriteItemsView = new FavouriteItemsViewImpl();
    return favouriteItemsView;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FavouriteCategoriesView createFavouriteCategoriesView() {
    FavouriteCategoriesViewImpl favouriteCategoriesView = new FavouriteCategoriesViewImpl();
    return favouriteCategoriesView;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OAuthToken createOAuthToken() {
    OAuthTokenImpl oAuthToken = new OAuthTokenImpl();
    return oAuthToken;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItemType createItemType() {
    ItemTypeImpl itemType = new ItemTypeImpl();
    return itemType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Metadatas createMetadatas() {
    MetadatasImpl metadatas = new MetadatasImpl();
    return metadatas;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HomeItem createHomeItem() {
    HomeItemImpl homeItem = new HomeItemImpl();
    return homeItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Application createApplication() {
    ApplicationImpl application = new ApplicationImpl();
    return application;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemaPkg createSchemaPkg() {
    SchemaPkgImpl schemaPkg = new SchemaPkgImpl();
    return schemaPkg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Product createProduct() {
    ProductImpl product = new ProductImpl();
    return product;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Schema createSchema() {
    SchemaImpl schema = new SchemaImpl();
    return schema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemaClass createSchemaClass() {
    SchemaClassImpl schemaClass = new SchemaClassImpl();
    return schemaClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemaFeature createSchemaFeature() {
    SchemaFeatureImpl schemaFeature = new SchemaFeatureImpl();
    return schemaFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequestPkg createRequestPkg() {
    RequestPkgImpl requestPkg = new RequestPkgImpl();
    return requestPkg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Request createRequest() {
    RequestImpl request = new RequestImpl();
    return request;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JobPkg createJobPkg() {
    JobPkgImpl jobPkg = new JobPkgImpl();
    return jobPkg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Job createJob() {
    JobImpl job = new JobImpl();
    return job;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trigger createTrigger() {
    TriggerImpl trigger = new TriggerImpl();
    return trigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItemProduct createItemProduct() {
    ItemProductImpl itemProduct = new ItemProductImpl();
    return itemProduct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataPackage getDataPackage() {
    return (DataPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DataPackage getPackage() {
    return DataPackage.eINSTANCE;
  }

} //DataFactoryImpl
