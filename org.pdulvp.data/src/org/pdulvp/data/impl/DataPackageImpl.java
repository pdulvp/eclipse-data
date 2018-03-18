/**
 */
package org.pdulvp.data.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.pdulvp.data.AbstractItem;
import org.pdulvp.data.Application;
import org.pdulvp.data.Category;
import org.pdulvp.data.CategoryPkg;
import org.pdulvp.data.CategoryView;
import org.pdulvp.data.ChildItem;
import org.pdulvp.data.DataFactory;
import org.pdulvp.data.DataPackage;
import org.pdulvp.data.FavouriteCategoriesView;
import org.pdulvp.data.FavouriteItemsView;
import org.pdulvp.data.HomeItem;
import org.pdulvp.data.HomeScreenList;
import org.pdulvp.data.ImageItem;
import org.pdulvp.data.Item;
import org.pdulvp.data.ItemPkg;
import org.pdulvp.data.ItemProduct;
import org.pdulvp.data.ItemRoot;
import org.pdulvp.data.ItemType;
import org.pdulvp.data.ItemTypePkg;
import org.pdulvp.data.Job;
import org.pdulvp.data.JobPkg;
import org.pdulvp.data.Metadatas;
import org.pdulvp.data.NamedItem;
import org.pdulvp.data.OAuthToken;
import org.pdulvp.data.Product;
import org.pdulvp.data.ProductPkg;
import org.pdulvp.data.Request;
import org.pdulvp.data.RequestPkg;
import org.pdulvp.data.Schema;
import org.pdulvp.data.SchemaClass;
import org.pdulvp.data.SchemaFeature;
import org.pdulvp.data.SchemaPkg;
import org.pdulvp.data.Screen;
import org.pdulvp.data.ScreenList;
import org.pdulvp.data.ScreenPkg;
import org.pdulvp.data.Timestamp;
import org.pdulvp.data.Trigger;
import org.pdulvp.data.User;
import org.pdulvp.data.table.TablePackage;
import org.pdulvp.data.table.impl.TablePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataPackageImpl extends EPackageImpl implements DataPackage {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass itemRootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass itemPkgEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass childItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass screenPkgEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass categoryPkgEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass productPkgEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass itemTypePkgEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass timestampEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass categoryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass imageItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass itemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass screenEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass userEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass screenListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass homeScreenListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass categoryViewEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass favouriteItemsViewEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass favouriteCategoriesViewEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oAuthTokenEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass itemTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metadatasEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass homeItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass applicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass schemaPkgEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass productEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass schemaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass schemaClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass schemaFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass requestPkgEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass requestEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jobPkgEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jobEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass triggerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass itemProductEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.pdulvp.data.DataPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DataPackageImpl() {
    super(eNS_URI, DataFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link DataPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DataPackage init() {
    if (isInited) return (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);

    // Obtain or create and register package
    DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DataPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    EcorePackage.eINSTANCE.eClass();

    // Obtain or create and register interdependencies
    TablePackageImpl theTablePackage = (TablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TablePackage.eNS_URI) instanceof TablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TablePackage.eNS_URI) : TablePackage.eINSTANCE);

    // Create package meta-data objects
    theDataPackage.createPackageContents();
    theTablePackage.createPackageContents();

    // Initialize created meta-data
    theDataPackage.initializePackageContents();
    theTablePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDataPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DataPackage.eNS_URI, theDataPackage);
    return theDataPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getItemRoot() {
    return itemRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getItemRoot_OwnedApplications() {
    return (EReference)itemRootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getItemRoot_OwnedScreenLists() {
    return (EReference)itemRootEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getItemRoot_OwnedItemTypes() {
    return (EReference)itemRootEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getItemPkg() {
    return itemPkgEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getItemPkg_OwnedItemPkgs() {
    return (EReference)itemPkgEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getItemPkg_OwnedItems() {
    return (EReference)itemPkgEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChildItem() {
    return childItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChildItem_Categories() {
    return (EReference)childItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScreenPkg() {
    return screenPkgEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScreenPkg_OwnedScreenPkgs() {
    return (EReference)screenPkgEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScreenPkg_OwnedScreens() {
    return (EReference)screenPkgEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCategoryPkg() {
    return categoryPkgEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCategoryPkg_OwnedCategoryPkgs() {
    return (EReference)categoryPkgEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCategoryPkg_OwnedCategories() {
    return (EReference)categoryPkgEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProductPkg() {
    return productPkgEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProductPkg_OwnedProductPkgs() {
    return (EReference)productPkgEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProductPkg_OwnedProducts() {
    return (EReference)productPkgEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getItemTypePkg() {
    return itemTypePkgEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getItemTypePkg_OwnedTypePkgs() {
    return (EReference)itemTypePkgEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getItemTypePkg_OwnedTypes() {
    return (EReference)itemTypePkgEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTimestamp() {
    return timestampEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimestamp_Timestamp() {
    return (EAttribute)timestampEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractItem() {
    return abstractItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractItem_Id() {
    return (EAttribute)abstractItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractItem_Tag() {
    return (EAttribute)abstractItemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedItem() {
    return namedItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamedItem_Name() {
    return (EAttribute)namedItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamedItem_Name_frFR() {
    return (EAttribute)namedItemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCategory() {
    return categoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCategory_Visible() {
    return (EAttribute)categoryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCategory_Inapp() {
    return (EAttribute)categoryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCategory_InappDescription() {
    return (EAttribute)categoryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCategory_InappTitle() {
    return (EAttribute)categoryEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCategory_Price() {
    return (EAttribute)categoryEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCategory_Parent() {
    return (EReference)categoryEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCategory_OwnedCategories() {
    return (EReference)categoryEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCategory_Screens() {
    return (EReference)categoryEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImageItem() {
    return imageItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImageItem_SourcePath() {
    return (EAttribute)imageItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImageItem_DateCreated() {
    return (EAttribute)imageItemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImageItem_Style() {
    return (EAttribute)imageItemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImageItem_GImageDataPath() {
    return (EAttribute)imageItemEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImageItem_GIconDataPath() {
    return (EAttribute)imageItemEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImageItem_GIcon16Path() {
    return (EAttribute)imageItemEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImageItem_GType() {
    return (EReference)imageItemEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImageItem_IconData() {
    return (EAttribute)imageItemEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImageItem_ImageData() {
    return (EAttribute)imageItemEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImageItem_Rank() {
    return (EAttribute)imageItemEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImageItem_Metadatas() {
    return (EReference)imageItemEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImageItem_ExternalPath() {
    return (EAttribute)imageItemEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImageItem_Packs() {
    return (EAttribute)imageItemEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImageItem_Products() {
    return (EReference)imageItemEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getItem() {
    return itemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScreen() {
    return screenEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScreen_Ordering() {
    return (EAttribute)screenEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScreen_Filtering() {
    return (EAttribute)screenEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUser() {
    return userEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUser_Mail() {
    return (EAttribute)userEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUser_Password() {
    return (EAttribute)userEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUser_FavouriteCategories() {
    return (EReference)userEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUser_FavouriteItems() {
    return (EReference)userEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUser_ClickedItems() {
    return (EReference)userEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUser_WidgetedItems() {
    return (EReference)userEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUser_Gcm() {
    return (EAttribute)userEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUser_Identifiers() {
    return (EAttribute)userEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScreenList() {
    return screenListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScreenList_Category() {
    return (EReference)screenListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScreenList_Screen() {
    return (EReference)screenListEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScreenList_IconData() {
    return (EAttribute)screenListEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getScreenList_Style() {
    return (EAttribute)screenListEClass.getEStructuralFeatures().get(3);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getScreenList_Packs() {
    return (EAttribute)screenListEClass.getEStructuralFeatures().get(4);
  }

		/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHomeScreenList() {
    return homeScreenListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHomeScreenList_Application() {
    return (EReference)homeScreenListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCategoryView() {
    return categoryViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCategoryView_ScreensIds() {
    return (EReference)categoryViewEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCategoryView_ScreensNames() {
    return (EReference)categoryViewEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFavouriteItemsView() {
    return favouriteItemsViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFavouriteItemsView_User() {
    return (EReference)favouriteItemsViewEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFavouriteCategoriesView() {
    return favouriteCategoriesViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFavouriteCategoriesView_User() {
    return (EReference)favouriteCategoriesViewEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOAuthToken() {
    return oAuthTokenEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOAuthToken_TokenId() {
    return (EAttribute)oAuthTokenEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOAuthToken_DeviceId() {
    return (EAttribute)oAuthTokenEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOAuthToken_User() {
    return (EReference)oAuthTokenEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getItemType() {
    return itemTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMetadatas() {
    return metadatasEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetadatas_Author_name() {
    return (EAttribute)metadatasEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetadatas_Author_email() {
    return (EAttribute)metadatasEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetadatas_Licence() {
    return (EAttribute)metadatasEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetadatas_Category_name() {
    return (EAttribute)metadatasEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetadatas_Version() {
    return (EAttribute)metadatasEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetadatas_Download() {
    return (EAttribute)metadatasEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetadatas_Rate() {
    return (EAttribute)metadatasEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetadatas_News() {
    return (EAttribute)metadatasEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetadatas_Date() {
    return (EAttribute)metadatasEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetadatas_Size() {
    return (EAttribute)metadatasEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetadatas_Price() {
    return (EAttribute)metadatasEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetadatas_Source() {
    return (EAttribute)metadatasEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetadatas_Name() {
    return (EAttribute)metadatasEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetadatas_Name_frFR() {
    return (EAttribute)metadatasEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetadatas_Description() {
    return (EAttribute)metadatasEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetadatas_Description_frFR() {
    return (EAttribute)metadatasEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetadatas_ShortDescription() {
    return (EAttribute)metadatasEClass.getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetadatas_MapsUri() {
    return (EAttribute)metadatasEClass.getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetadatas_Image_mainUri() {
    return (EAttribute)metadatasEClass.getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetadatas_Image_preview2Uri() {
    return (EAttribute)metadatasEClass.getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetadatas_SiteUri() {
    return (EAttribute)metadatasEClass.getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetadatas_TripAdvisorUri() {
    return (EAttribute)metadatasEClass.getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetadatas_Chart() {
    return (EAttribute)metadatasEClass.getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHomeItem() {
    return homeItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHomeItem_Application() {
    return (EReference)homeItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHomeItem_Category() {
    return (EReference)homeItemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApplication() {
    return applicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplication_OwnedHomes() {
    return (EReference)applicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplication_Category() {
    return (EReference)applicationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplication_Schema() {
    return (EReference)applicationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplication_ServerUrl() {
    return (EAttribute)applicationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSchemaPkg() {
    return schemaPkgEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSchemaPkg_OwnedSchemas() {
    return (EReference)schemaPkgEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProduct() {
    return productEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProduct_OwnedProducts() {
    return (EReference)productEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProduct_Parent() {
    return (EReference)productEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSchema() {
    return schemaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSchema_DbSchema() {
    return (EAttribute)schemaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSchema_Namespace() {
    return (EAttribute)schemaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSchema_OwnedClasses() {
    return (EReference)schemaEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSchemaClass() {
    return schemaClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSchemaClass_Clazz() {
    return (EReference)schemaClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSchemaClass_Table() {
    return (EReference)schemaClassEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSchemaClass_ExternalFeatures() {
    return (EReference)schemaClassEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSchemaFeature() {
    return schemaFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSchemaFeature_Table() {
    return (EReference)schemaFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSchemaFeature_Feature() {
    return (EReference)schemaFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRequestPkg() {
    return requestPkgEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequestPkg_OwnedRequests() {
    return (EReference)requestPkgEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequestPkg_OwnedRequestPkgs() {
    return (EReference)requestPkgEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRequest() {
    return requestEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequest_OwnedTriggers() {
    return (EReference)requestEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJobPkg() {
    return jobPkgEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJobPkg_OwnedJobs() {
    return (EReference)jobPkgEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJobPkg_OwnedJobPkgs() {
    return (EReference)jobPkgEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJob() {
    return jobEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrigger() {
    return triggerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTrigger_Schedule() {
    return (EAttribute)triggerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getItemProduct() {
    return itemProductEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getItemProduct_Item() {
    return (EReference)itemProductEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getItemProduct_Product() {
    return (EReference)itemProductEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataFactory getDataFactory() {
    return (DataFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents() {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    itemRootEClass = createEClass(ITEM_ROOT);
    createEReference(itemRootEClass, ITEM_ROOT__OWNED_APPLICATIONS);
    createEReference(itemRootEClass, ITEM_ROOT__OWNED_SCREEN_LISTS);
    createEReference(itemRootEClass, ITEM_ROOT__OWNED_ITEM_TYPES);

    itemPkgEClass = createEClass(ITEM_PKG);
    createEReference(itemPkgEClass, ITEM_PKG__OWNED_ITEM_PKGS);
    createEReference(itemPkgEClass, ITEM_PKG__OWNED_ITEMS);

    childItemEClass = createEClass(CHILD_ITEM);
    createEReference(childItemEClass, CHILD_ITEM__CATEGORIES);

    screenPkgEClass = createEClass(SCREEN_PKG);
    createEReference(screenPkgEClass, SCREEN_PKG__OWNED_SCREEN_PKGS);
    createEReference(screenPkgEClass, SCREEN_PKG__OWNED_SCREENS);

    categoryPkgEClass = createEClass(CATEGORY_PKG);
    createEReference(categoryPkgEClass, CATEGORY_PKG__OWNED_CATEGORY_PKGS);
    createEReference(categoryPkgEClass, CATEGORY_PKG__OWNED_CATEGORIES);

    itemTypePkgEClass = createEClass(ITEM_TYPE_PKG);
    createEReference(itemTypePkgEClass, ITEM_TYPE_PKG__OWNED_TYPE_PKGS);
    createEReference(itemTypePkgEClass, ITEM_TYPE_PKG__OWNED_TYPES);

    timestampEClass = createEClass(TIMESTAMP);
    createEAttribute(timestampEClass, TIMESTAMP__TIMESTAMP);

    abstractItemEClass = createEClass(ABSTRACT_ITEM);
    createEAttribute(abstractItemEClass, ABSTRACT_ITEM__ID);
    createEAttribute(abstractItemEClass, ABSTRACT_ITEM__TAG);

    namedItemEClass = createEClass(NAMED_ITEM);
    createEAttribute(namedItemEClass, NAMED_ITEM__NAME);
    createEAttribute(namedItemEClass, NAMED_ITEM__NAME_FR_FR);

    categoryEClass = createEClass(CATEGORY);
    createEAttribute(categoryEClass, CATEGORY__VISIBLE);
    createEAttribute(categoryEClass, CATEGORY__INAPP);
    createEAttribute(categoryEClass, CATEGORY__INAPP_DESCRIPTION);
    createEAttribute(categoryEClass, CATEGORY__INAPP_TITLE);
    createEAttribute(categoryEClass, CATEGORY__PRICE);
    createEReference(categoryEClass, CATEGORY__PARENT);
    createEReference(categoryEClass, CATEGORY__OWNED_CATEGORIES);
    createEReference(categoryEClass, CATEGORY__SCREENS);

    itemEClass = createEClass(ITEM);

    imageItemEClass = createEClass(IMAGE_ITEM);
    createEAttribute(imageItemEClass, IMAGE_ITEM__SOURCE_PATH);
    createEAttribute(imageItemEClass, IMAGE_ITEM__DATE_CREATED);
    createEAttribute(imageItemEClass, IMAGE_ITEM__STYLE);
    createEAttribute(imageItemEClass, IMAGE_ITEM__GIMAGE_DATA_PATH);
    createEAttribute(imageItemEClass, IMAGE_ITEM__GICON_DATA_PATH);
    createEAttribute(imageItemEClass, IMAGE_ITEM__GICON16_PATH);
    createEReference(imageItemEClass, IMAGE_ITEM__GTYPE);
    createEAttribute(imageItemEClass, IMAGE_ITEM__ICON_DATA);
    createEAttribute(imageItemEClass, IMAGE_ITEM__IMAGE_DATA);
    createEAttribute(imageItemEClass, IMAGE_ITEM__PACKS);
    createEAttribute(imageItemEClass, IMAGE_ITEM__RANK);
    createEReference(imageItemEClass, IMAGE_ITEM__METADATAS);
    createEAttribute(imageItemEClass, IMAGE_ITEM__EXTERNAL_PATH);
    createEReference(imageItemEClass, IMAGE_ITEM__PRODUCTS);

    homeItemEClass = createEClass(HOME_ITEM);
    createEReference(homeItemEClass, HOME_ITEM__APPLICATION);
    createEReference(homeItemEClass, HOME_ITEM__CATEGORY);

    screenEClass = createEClass(SCREEN);
    createEAttribute(screenEClass, SCREEN__ORDERING);
    createEAttribute(screenEClass, SCREEN__FILTERING);

    userEClass = createEClass(USER);
    createEAttribute(userEClass, USER__MAIL);
    createEAttribute(userEClass, USER__PASSWORD);
    createEReference(userEClass, USER__FAVOURITE_CATEGORIES);
    createEReference(userEClass, USER__FAVOURITE_ITEMS);
    createEReference(userEClass, USER__CLICKED_ITEMS);
    createEReference(userEClass, USER__WIDGETED_ITEMS);
    createEAttribute(userEClass, USER__GCM);
    createEAttribute(userEClass, USER__IDENTIFIERS);

    screenListEClass = createEClass(SCREEN_LIST);
    createEReference(screenListEClass, SCREEN_LIST__CATEGORY);
    createEReference(screenListEClass, SCREEN_LIST__SCREEN);
    createEAttribute(screenListEClass, SCREEN_LIST__ICON_DATA);
    createEAttribute(screenListEClass, SCREEN_LIST__STYLE);
    createEAttribute(screenListEClass, SCREEN_LIST__PACKS);

    homeScreenListEClass = createEClass(HOME_SCREEN_LIST);
    createEReference(homeScreenListEClass, HOME_SCREEN_LIST__APPLICATION);

    categoryViewEClass = createEClass(CATEGORY_VIEW);
    createEReference(categoryViewEClass, CATEGORY_VIEW__SCREENS_IDS);
    createEReference(categoryViewEClass, CATEGORY_VIEW__SCREENS_NAMES);

    favouriteItemsViewEClass = createEClass(FAVOURITE_ITEMS_VIEW);
    createEReference(favouriteItemsViewEClass, FAVOURITE_ITEMS_VIEW__USER);

    favouriteCategoriesViewEClass = createEClass(FAVOURITE_CATEGORIES_VIEW);
    createEReference(favouriteCategoriesViewEClass, FAVOURITE_CATEGORIES_VIEW__USER);

    itemTypeEClass = createEClass(ITEM_TYPE);

    metadatasEClass = createEClass(METADATAS);
    createEAttribute(metadatasEClass, METADATAS__AUTHOR_NAME);
    createEAttribute(metadatasEClass, METADATAS__AUTHOR_EMAIL);
    createEAttribute(metadatasEClass, METADATAS__LICENCE);
    createEAttribute(metadatasEClass, METADATAS__CATEGORY_NAME);
    createEAttribute(metadatasEClass, METADATAS__VERSION);
    createEAttribute(metadatasEClass, METADATAS__DOWNLOAD);
    createEAttribute(metadatasEClass, METADATAS__RATE);
    createEAttribute(metadatasEClass, METADATAS__NEWS);
    createEAttribute(metadatasEClass, METADATAS__DATE);
    createEAttribute(metadatasEClass, METADATAS__SIZE);
    createEAttribute(metadatasEClass, METADATAS__PRICE);
    createEAttribute(metadatasEClass, METADATAS__SOURCE);
    createEAttribute(metadatasEClass, METADATAS__NAME);
    createEAttribute(metadatasEClass, METADATAS__NAME_FR_FR);
    createEAttribute(metadatasEClass, METADATAS__DESCRIPTION);
    createEAttribute(metadatasEClass, METADATAS__DESCRIPTION_FR_FR);
    createEAttribute(metadatasEClass, METADATAS__SHORT_DESCRIPTION);
    createEAttribute(metadatasEClass, METADATAS__MAPS_URI);
    createEAttribute(metadatasEClass, METADATAS__IMAGE_MAIN_URI);
    createEAttribute(metadatasEClass, METADATAS__IMAGE_PREVIEW2_URI);
    createEAttribute(metadatasEClass, METADATAS__SITE_URI);
    createEAttribute(metadatasEClass, METADATAS__TRIP_ADVISOR_URI);
    createEAttribute(metadatasEClass, METADATAS__CHART);

    productPkgEClass = createEClass(PRODUCT_PKG);
    createEReference(productPkgEClass, PRODUCT_PKG__OWNED_PRODUCT_PKGS);
    createEReference(productPkgEClass, PRODUCT_PKG__OWNED_PRODUCTS);

    productEClass = createEClass(PRODUCT);
    createEReference(productEClass, PRODUCT__OWNED_PRODUCTS);
    createEReference(productEClass, PRODUCT__PARENT);

    itemProductEClass = createEClass(ITEM_PRODUCT);
    createEReference(itemProductEClass, ITEM_PRODUCT__ITEM);
    createEReference(itemProductEClass, ITEM_PRODUCT__PRODUCT);

    oAuthTokenEClass = createEClass(OAUTH_TOKEN);
    createEAttribute(oAuthTokenEClass, OAUTH_TOKEN__TOKEN_ID);
    createEAttribute(oAuthTokenEClass, OAUTH_TOKEN__DEVICE_ID);
    createEReference(oAuthTokenEClass, OAUTH_TOKEN__USER);

    applicationEClass = createEClass(APPLICATION);
    createEReference(applicationEClass, APPLICATION__OWNED_HOMES);
    createEReference(applicationEClass, APPLICATION__CATEGORY);
    createEReference(applicationEClass, APPLICATION__SCHEMA);
    createEAttribute(applicationEClass, APPLICATION__SERVER_URL);

    schemaPkgEClass = createEClass(SCHEMA_PKG);
    createEReference(schemaPkgEClass, SCHEMA_PKG__OWNED_SCHEMAS);

    schemaEClass = createEClass(SCHEMA);
    createEAttribute(schemaEClass, SCHEMA__DB_SCHEMA);
    createEAttribute(schemaEClass, SCHEMA__NAMESPACE);
    createEReference(schemaEClass, SCHEMA__OWNED_CLASSES);

    schemaClassEClass = createEClass(SCHEMA_CLASS);
    createEReference(schemaClassEClass, SCHEMA_CLASS__CLAZZ);
    createEReference(schemaClassEClass, SCHEMA_CLASS__TABLE);
    createEReference(schemaClassEClass, SCHEMA_CLASS__EXTERNAL_FEATURES);

    schemaFeatureEClass = createEClass(SCHEMA_FEATURE);
    createEReference(schemaFeatureEClass, SCHEMA_FEATURE__TABLE);
    createEReference(schemaFeatureEClass, SCHEMA_FEATURE__FEATURE);

    requestPkgEClass = createEClass(REQUEST_PKG);
    createEReference(requestPkgEClass, REQUEST_PKG__OWNED_REQUESTS);
    createEReference(requestPkgEClass, REQUEST_PKG__OWNED_REQUEST_PKGS);

    requestEClass = createEClass(REQUEST);
    createEReference(requestEClass, REQUEST__OWNED_TRIGGERS);

    jobPkgEClass = createEClass(JOB_PKG);
    createEReference(jobPkgEClass, JOB_PKG__OWNED_JOBS);
    createEReference(jobPkgEClass, JOB_PKG__OWNED_JOB_PKGS);

    jobEClass = createEClass(JOB);

    triggerEClass = createEClass(TRIGGER);
    createEAttribute(triggerEClass, TRIGGER__SCHEDULE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents() {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    TablePackage theTablePackage = (TablePackage)EPackage.Registry.INSTANCE.getEPackage(TablePackage.eNS_URI);

    // Add subpackages
    getESubpackages().add(theTablePackage);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    itemRootEClass.getESuperTypes().add(this.getAbstractItem());
    itemRootEClass.getESuperTypes().add(this.getCategoryPkg());
    itemRootEClass.getESuperTypes().add(this.getProductPkg());
    itemRootEClass.getESuperTypes().add(this.getItemPkg());
    itemRootEClass.getESuperTypes().add(this.getScreenPkg());
    itemRootEClass.getESuperTypes().add(this.getItemTypePkg());
    itemRootEClass.getESuperTypes().add(theTablePackage.getDTablePkg());
    itemPkgEClass.getESuperTypes().add(this.getNamedItem());
    itemPkgEClass.getESuperTypes().add(this.getAbstractItem());
    childItemEClass.getESuperTypes().add(this.getAbstractItem());
    screenPkgEClass.getESuperTypes().add(this.getNamedItem());
    screenPkgEClass.getESuperTypes().add(this.getAbstractItem());
    categoryPkgEClass.getESuperTypes().add(this.getNamedItem());
    categoryPkgEClass.getESuperTypes().add(this.getAbstractItem());
    itemTypePkgEClass.getESuperTypes().add(this.getNamedItem());
    itemTypePkgEClass.getESuperTypes().add(this.getAbstractItem());
    abstractItemEClass.getESuperTypes().add(this.getTimestamp());
    categoryEClass.getESuperTypes().add(this.getNamedItem());
    categoryEClass.getESuperTypes().add(this.getAbstractItem());
    categoryEClass.getESuperTypes().add(this.getItemPkg());
    itemEClass.getESuperTypes().add(this.getImageItem());
    imageItemEClass.getESuperTypes().add(this.getChildItem());
    homeItemEClass.getESuperTypes().add(this.getAbstractItem());
    screenEClass.getESuperTypes().add(this.getNamedItem());
    screenEClass.getESuperTypes().add(this.getAbstractItem());
    userEClass.getESuperTypes().add(this.getAbstractItem());
    screenListEClass.getESuperTypes().add(this.getAbstractItem());
    homeScreenListEClass.getESuperTypes().add(this.getScreenList());
    categoryViewEClass.getESuperTypes().add(this.getCategory());
    favouriteItemsViewEClass.getESuperTypes().add(this.getScreenList());
    favouriteCategoriesViewEClass.getESuperTypes().add(this.getScreenList());
    itemTypeEClass.getESuperTypes().add(this.getNamedItem());
    itemTypeEClass.getESuperTypes().add(this.getAbstractItem());
    productPkgEClass.getESuperTypes().add(this.getNamedItem());
    productPkgEClass.getESuperTypes().add(this.getAbstractItem());
    productEClass.getESuperTypes().add(this.getNamedItem());
    productEClass.getESuperTypes().add(this.getAbstractItem());
    itemProductEClass.getESuperTypes().add(this.getAbstractItem());
    oAuthTokenEClass.getESuperTypes().add(this.getTimestamp());
    applicationEClass.getESuperTypes().add(this.getAbstractItem());
    applicationEClass.getESuperTypes().add(this.getCategoryPkg());
    applicationEClass.getESuperTypes().add(this.getItemPkg());
    applicationEClass.getESuperTypes().add(this.getScreenPkg());
    applicationEClass.getESuperTypes().add(this.getJobPkg());
    applicationEClass.getESuperTypes().add(this.getRequestPkg());
    applicationEClass.getESuperTypes().add(this.getSchemaPkg());
    schemaPkgEClass.getESuperTypes().add(this.getAbstractItem());
    schemaPkgEClass.getESuperTypes().add(this.getNamedItem());
    schemaEClass.getESuperTypes().add(this.getAbstractItem());
    schemaEClass.getESuperTypes().add(this.getNamedItem());
    schemaEClass.getESuperTypes().add(theTablePackage.getDTablePkg());
    requestPkgEClass.getESuperTypes().add(this.getAbstractItem());
    requestPkgEClass.getESuperTypes().add(this.getNamedItem());
    requestEClass.getESuperTypes().add(this.getAbstractItem());
    requestEClass.getESuperTypes().add(this.getNamedItem());
    jobPkgEClass.getESuperTypes().add(this.getAbstractItem());
    jobPkgEClass.getESuperTypes().add(this.getNamedItem());
    jobEClass.getESuperTypes().add(this.getAbstractItem());
    jobEClass.getESuperTypes().add(this.getNamedItem());
    triggerEClass.getESuperTypes().add(this.getAbstractItem());
    triggerEClass.getESuperTypes().add(this.getNamedItem());

    // Initialize classes and features; add operations and parameters
    initEClass(itemRootEClass, ItemRoot.class, "ItemRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getItemRoot_OwnedApplications(), this.getApplication(), null, "ownedApplications", null, 0, -1, ItemRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getItemRoot_OwnedScreenLists(), this.getScreenList(), null, "ownedScreenLists", null, 0, -1, ItemRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getItemRoot_OwnedItemTypes(), this.getItemType(), null, "ownedItemTypes", null, 0, -1, ItemRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(itemPkgEClass, ItemPkg.class, "ItemPkg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getItemPkg_OwnedItemPkgs(), this.getItemPkg(), null, "ownedItemPkgs", null, 0, -1, ItemPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getItemPkg_OwnedItems(), this.getChildItem(), null, "ownedItems", null, 0, -1, ItemPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(childItemEClass, ChildItem.class, "ChildItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getChildItem_Categories(), this.getCategory(), null, "categories", null, 0, -1, ChildItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(screenPkgEClass, ScreenPkg.class, "ScreenPkg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getScreenPkg_OwnedScreenPkgs(), this.getScreenPkg(), null, "ownedScreenPkgs", null, 0, -1, ScreenPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScreenPkg_OwnedScreens(), this.getScreen(), null, "ownedScreens", null, 0, -1, ScreenPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(categoryPkgEClass, CategoryPkg.class, "CategoryPkg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCategoryPkg_OwnedCategoryPkgs(), this.getCategoryPkg(), null, "ownedCategoryPkgs", null, 0, -1, CategoryPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCategoryPkg_OwnedCategories(), this.getCategory(), null, "ownedCategories", null, 0, -1, CategoryPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(itemTypePkgEClass, ItemTypePkg.class, "ItemTypePkg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getItemTypePkg_OwnedTypePkgs(), this.getItemTypePkg(), null, "ownedTypePkgs", null, 0, -1, ItemTypePkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getItemTypePkg_OwnedTypes(), this.getItemType(), null, "ownedTypes", null, 0, -1, ItemTypePkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(timestampEClass, Timestamp.class, "Timestamp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTimestamp_Timestamp(), ecorePackage.getEString(), "timestamp", null, 0, 1, Timestamp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractItemEClass, AbstractItem.class, "AbstractItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstractItem_Id(), ecorePackage.getEString(), "id", null, 0, 1, AbstractItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractItem_Tag(), ecorePackage.getEString(), "tag", null, 0, 1, AbstractItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namedItemEClass, NamedItem.class, "NamedItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNamedItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNamedItem_Name_frFR(), ecorePackage.getEString(), "name_frFR", null, 0, 1, NamedItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(categoryEClass, Category.class, "Category", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCategory_Visible(), ecorePackage.getEBoolean(), "visible", "true", 0, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCategory_Inapp(), ecorePackage.getEBoolean(), "inapp", "true", 0, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCategory_InappDescription(), ecorePackage.getEString(), "inappDescription", null, 0, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCategory_InappTitle(), ecorePackage.getEString(), "inappTitle", null, 0, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCategory_Price(), ecorePackage.getEFloat(), "price", null, 0, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCategory_Parent(), this.getCategory(), null, "parent", null, 0, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCategory_OwnedCategories(), this.getCategory(), null, "ownedCategories", null, 0, -1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCategory_Screens(), this.getScreen(), null, "screens", null, 0, -1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(itemEClass, Item.class, "Item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(imageItemEClass, ImageItem.class, "ImageItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImageItem_SourcePath(), ecorePackage.getEString(), "sourcePath", null, 0, 1, ImageItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImageItem_DateCreated(), ecorePackage.getEString(), "dateCreated", null, 0, 1, ImageItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImageItem_Style(), ecorePackage.getEString(), "style", null, 0, 1, ImageItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImageItem_GImageDataPath(), ecorePackage.getEString(), "gImageDataPath", null, 0, 1, ImageItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImageItem_GIconDataPath(), ecorePackage.getEString(), "gIconDataPath", null, 0, 1, ImageItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImageItem_GIcon16Path(), ecorePackage.getEString(), "gIcon16Path", null, 0, 1, ImageItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImageItem_GType(), this.getItemType(), null, "gType", null, 0, 1, ImageItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImageItem_IconData(), ecorePackage.getEString(), "iconData", null, 0, 1, ImageItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImageItem_ImageData(), ecorePackage.getEString(), "imageData", null, 0, 1, ImageItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImageItem_Packs(), ecorePackage.getEString(), "packs", null, 0, 1, ImageItem.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEAttribute(getImageItem_Rank(), ecorePackage.getEInt(), "rank", null, 0, 1, ImageItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImageItem_Metadatas(), this.getMetadatas(), null, "metadatas", null, 0, 1, ImageItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImageItem_ExternalPath(), ecorePackage.getEString(), "externalPath", null, 0, 1, ImageItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImageItem_Products(), this.getProduct(), null, "products", null, 0, -1, ImageItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(homeItemEClass, HomeItem.class, "HomeItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHomeItem_Application(), this.getApplication(), null, "application", null, 0, 1, HomeItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHomeItem_Category(), this.getCategory(), null, "category", null, 0, 1, HomeItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(screenEClass, Screen.class, "Screen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getScreen_Ordering(), ecorePackage.getEString(), "ordering", null, 0, 1, Screen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getScreen_Filtering(), ecorePackage.getEString(), "filtering", null, 0, 1, Screen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUser_Mail(), ecorePackage.getEString(), "mail", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUser_Password(), ecorePackage.getEString(), "password", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUser_FavouriteCategories(), this.getCategory(), null, "favouriteCategories", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUser_FavouriteItems(), this.getImageItem(), null, "favouriteItems", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUser_ClickedItems(), this.getImageItem(), null, "clickedItems", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUser_WidgetedItems(), this.getImageItem(), null, "widgetedItems", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUser_Gcm(), ecorePackage.getEString(), "gcm", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUser_Identifiers(), ecorePackage.getEString(), "identifiers", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(screenListEClass, ScreenList.class, "ScreenList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getScreenList_Category(), this.getCategory(), null, "category", null, 0, 1, ScreenList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScreenList_Screen(), this.getScreen(), null, "screen", null, 0, 1, ScreenList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getScreenList_IconData(), ecorePackage.getEString(), "iconData", null, 0, 1, ScreenList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getScreenList_Style(), ecorePackage.getEString(), "style", null, 0, 1, ScreenList.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEAttribute(getScreenList_Packs(), ecorePackage.getEString(), "packs", null, 0, 1, ScreenList.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEClass(homeScreenListEClass, HomeScreenList.class, "HomeScreenList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHomeScreenList_Application(), this.getApplication(), null, "application", null, 0, 1, HomeScreenList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(categoryViewEClass, CategoryView.class, "CategoryView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCategoryView_ScreensIds(), this.getScreen(), null, "screensIds", null, 0, 1, CategoryView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getCategoryView_ScreensNames(), this.getScreen(), null, "screensNames", null, 0, 1, CategoryView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEClass(favouriteItemsViewEClass, FavouriteItemsView.class, "FavouriteItemsView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFavouriteItemsView_User(), this.getUser(), null, "user", null, 0, 1, FavouriteItemsView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(favouriteCategoriesViewEClass, FavouriteCategoriesView.class, "FavouriteCategoriesView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFavouriteCategoriesView_User(), this.getUser(), null, "user", null, 0, 1, FavouriteCategoriesView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(itemTypeEClass, ItemType.class, "ItemType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(metadatasEClass, Metadatas.class, "Metadatas", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMetadatas_Author_name(), ecorePackage.getEString(), "author_name", null, 0, 1, Metadatas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetadatas_Author_email(), ecorePackage.getEString(), "author_email", null, 0, 1, Metadatas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetadatas_Licence(), ecorePackage.getEString(), "licence", null, 0, 1, Metadatas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetadatas_Category_name(), ecorePackage.getEString(), "category_name", null, 0, 1, Metadatas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetadatas_Version(), ecorePackage.getEString(), "version", null, 0, 1, Metadatas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetadatas_Download(), ecorePackage.getEString(), "download", null, 0, 1, Metadatas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetadatas_Rate(), ecorePackage.getEString(), "rate", null, 0, 1, Metadatas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetadatas_News(), ecorePackage.getEString(), "news", null, 0, 1, Metadatas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetadatas_Date(), ecorePackage.getEString(), "date", null, 0, 1, Metadatas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetadatas_Size(), ecorePackage.getEString(), "size", null, 0, 1, Metadatas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetadatas_Price(), ecorePackage.getEString(), "price", null, 0, 1, Metadatas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetadatas_Source(), ecorePackage.getEString(), "source", null, 0, 1, Metadatas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetadatas_Name(), ecorePackage.getEString(), "name", null, 0, 1, Metadatas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetadatas_Name_frFR(), ecorePackage.getEString(), "name_frFR", null, 0, 1, Metadatas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetadatas_Description(), ecorePackage.getEString(), "description", null, 0, 1, Metadatas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetadatas_Description_frFR(), ecorePackage.getEString(), "description_frFR", null, 0, 1, Metadatas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetadatas_ShortDescription(), ecorePackage.getEString(), "shortDescription", null, 0, 1, Metadatas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetadatas_MapsUri(), ecorePackage.getEString(), "mapsUri", null, 0, 1, Metadatas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetadatas_Image_mainUri(), ecorePackage.getEString(), "image_mainUri", null, 0, 1, Metadatas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetadatas_Image_preview2Uri(), ecorePackage.getEString(), "image_preview2Uri", null, 0, 1, Metadatas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetadatas_SiteUri(), ecorePackage.getEString(), "siteUri", null, 0, 1, Metadatas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetadatas_TripAdvisorUri(), ecorePackage.getEString(), "tripAdvisorUri", null, 0, 1, Metadatas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetadatas_Chart(), ecorePackage.getEString(), "chart", null, 0, 1, Metadatas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(productPkgEClass, ProductPkg.class, "ProductPkg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProductPkg_OwnedProductPkgs(), this.getProductPkg(), null, "ownedProductPkgs", null, 0, -1, ProductPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProductPkg_OwnedProducts(), this.getProduct(), null, "ownedProducts", null, 0, -1, ProductPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProduct_OwnedProducts(), this.getProduct(), null, "ownedProducts", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProduct_Parent(), this.getProduct(), null, "parent", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(itemProductEClass, ItemProduct.class, "ItemProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getItemProduct_Item(), this.getItem(), null, "item", null, 0, 1, ItemProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getItemProduct_Product(), this.getProduct(), null, "product", null, 0, 1, ItemProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oAuthTokenEClass, OAuthToken.class, "OAuthToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOAuthToken_TokenId(), ecorePackage.getEString(), "tokenId", null, 0, 1, OAuthToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOAuthToken_DeviceId(), ecorePackage.getEString(), "deviceId", null, 0, 1, OAuthToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOAuthToken_User(), this.getUser(), null, "user", null, 0, 1, OAuthToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getApplication_OwnedHomes(), this.getHomeItem(), null, "ownedHomes", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplication_Category(), this.getCategory(), null, "category", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplication_Schema(), this.getSchema(), null, "schema", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getApplication_ServerUrl(), ecorePackage.getEString(), "serverUrl", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(schemaPkgEClass, SchemaPkg.class, "SchemaPkg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSchemaPkg_OwnedSchemas(), this.getSchema(), null, "ownedSchemas", null, 0, -1, SchemaPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(schemaEClass, Schema.class, "Schema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSchema_DbSchema(), ecorePackage.getEString(), "dbSchema", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSchema_Namespace(), ecorePackage.getEString(), "namespace", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSchema_OwnedClasses(), this.getSchemaClass(), null, "ownedClasses", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(schemaClassEClass, SchemaClass.class, "SchemaClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSchemaClass_Clazz(), ecorePackage.getEClass(), null, "clazz", null, 0, 1, SchemaClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSchemaClass_Table(), theTablePackage.getDTable(), null, "table", null, 0, 1, SchemaClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSchemaClass_ExternalFeatures(), this.getSchemaFeature(), null, "externalFeatures", null, 0, -1, SchemaClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(schemaFeatureEClass, SchemaFeature.class, "SchemaFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSchemaFeature_Table(), theTablePackage.getDTable(), null, "table", null, 0, 1, SchemaFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSchemaFeature_Feature(), ecorePackage.getEStructuralFeature(), null, "feature", null, 0, 1, SchemaFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(requestPkgEClass, RequestPkg.class, "RequestPkg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRequestPkg_OwnedRequests(), this.getRequest(), null, "ownedRequests", null, 0, -1, RequestPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRequestPkg_OwnedRequestPkgs(), this.getRequestPkg(), null, "ownedRequestPkgs", null, 0, -1, RequestPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(requestEClass, Request.class, "Request", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRequest_OwnedTriggers(), this.getTrigger(), null, "ownedTriggers", null, 0, -1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jobPkgEClass, JobPkg.class, "JobPkg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJobPkg_OwnedJobs(), this.getJob(), null, "ownedJobs", null, 0, -1, JobPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJobPkg_OwnedJobPkgs(), this.getJobPkg(), null, "ownedJobPkgs", null, 0, -1, JobPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jobEClass, Job.class, "Job", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(triggerEClass, Trigger.class, "Trigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTrigger_Schedule(), ecorePackage.getEString(), "schedule", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // database
    createDatabaseAnnotations();
    // deprecated
    createDeprecatedAnnotations();
  }

  /**
   * Initializes the annotations for <b>database</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createDatabaseAnnotations() {
    String source = "database";	
    addAnnotation
      (getChildItem_Categories(), 
       source, 
       new String[] {
       "db_table", "itemsCategories"
       });
    addAnnotation
      (getChildItem_Categories(), 
       new boolean[] { true },
       "sourceFeature",
       new String[] {
       "name", "itemId"
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//AbstractItem/id")
       });
    addAnnotation
      (getChildItem_Categories(), 
       new boolean[] { true },
       "targetFeature",
       new String[] {
       "name", "categoryId"
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//AbstractItem/id")
       });	
    addAnnotation
      (getTimestamp_Timestamp(), 
       source, 
       new String[] {
       "db_id", "timestamp",
       "db_type", "timestamp",
       "edit", "false"
       });	
    addAnnotation
      (getAbstractItem_Id(), 
       source, 
       new String[] {
       "db_id", "id"
       });	
    addAnnotation
      (getAbstractItem_Tag(), 
       source, 
       new String[] {
       "db_id", "tag"
       });	
    addAnnotation
      (getNamedItem_Name(), 
       source, 
       new String[] {
       "db_id", "name"
       });	
    addAnnotation
      (getNamedItem_Name_frFR(), 
       source, 
       new String[] {
       "db_id", "namefrFR"
       });	
    addAnnotation
      (categoryEClass, 
       source, 
       new String[] {
       "db_table", "categories"
       });
    addAnnotation
      (categoryEClass, 
       new boolean[] { true },
       "primaryKey",
       new String[] {
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//AbstractItem/id")
       });	
    addAnnotation
      (getCategory_Visible(), 
       source, 
       new String[] {
       "db_id", "visible"
       });	
    addAnnotation
      (getCategory_Parent(), 
       source, 
       new String[] {
       "db_id", "parentId"
       });
    addAnnotation
      (getCategory_Parent(), 
       new boolean[] { true },
       "targetFeature",
       new String[] {
       "name", "parentId"
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//AbstractItem/id")
       });	
    addAnnotation
      (getCategory_Screens(), 
       source, 
       new String[] {
       "db_table", "categoriesScreens"
       });
    addAnnotation
      (getCategory_Screens(), 
       new boolean[] { true },
       "sourceFeature",
       new String[] {
       "name", "categoryId"
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//AbstractItem/id")
       });
    addAnnotation
      (getCategory_Screens(), 
       new boolean[] { true },
       "targetFeature",
       new String[] {
       "name", "screenId"
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//AbstractItem/id")
       });	
    addAnnotation
      (itemEClass, 
       source, 
       new String[] {
       "db_table", "items"
       });
    addAnnotation
      (itemEClass, 
       new boolean[] { true },
       "primaryKey",
       new String[] {
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//AbstractItem/id")
       });	
    addAnnotation
      (getImageItem_Style(), 
       source, 
       new String[] {
       "db_id", "style"
       });	
    addAnnotation
      (getImageItem_IconData(), 
       source, 
       new String[] {
       "db_id", "iconData",
       "external", "true"
       });	
    addAnnotation
      (getImageItem_ImageData(), 
       source, 
       new String[] {
       "db_id", "imageData",
       "external", "true"
       });	
    addAnnotation
      (getImageItem_Packs(), 
       source, 
       new String[] {
       "db_id", "packs",
       "external", "true"
       });	
    addAnnotation
      (getImageItem_Rank(), 
       source, 
       new String[] {
       "db_id", "rank"
       });	
    addAnnotation
      (getImageItem_Metadatas(), 
       source, 
       new String[] {
       "db_id", "metadatas",
       "external", "true"
       });	
    addAnnotation
      (getImageItem_Products(), 
       source, 
       new String[] {
       "db_table", "itemsProducts"
       });
    addAnnotation
      (getImageItem_Products(), 
       new boolean[] { true },
       "sourceFeature",
       new String[] {
       "name", "itemId"
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//AbstractItem/id")
       });
    addAnnotation
      (getImageItem_Products(), 
       new boolean[] { true },
       "targetFeature",
       new String[] {
       "name", "productId"
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//AbstractItem/id")
       });	
    addAnnotation
      (homeItemEClass, 
       source, 
       new String[] {
       "db_table", "homes"
       });
    addAnnotation
      (homeItemEClass, 
       new boolean[] { true },
       "primaryKey",
       new String[] {
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//AbstractItem/id")
       });	
    addAnnotation
      (getHomeItem_Application(), 
       source, 
       new String[] {
       "db_id", "applicationId"
       });
    addAnnotation
      (getHomeItem_Application(), 
       new boolean[] { true },
       "targetFeature",
       new String[] {
       "name", "applicationId"
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//AbstractItem/id")
       });	
    addAnnotation
      (getHomeItem_Category(), 
       source, 
       new String[] {
       "db_id", "categoryId"
       });
    addAnnotation
      (getHomeItem_Category(), 
       new boolean[] { true },
       "targetFeature",
       new String[] {
       "name", "categoryId"
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//AbstractItem/id")
       });	
    addAnnotation
      (screenEClass, 
       source, 
       new String[] {
       "db_table", "screens"
       });
    addAnnotation
      (screenEClass, 
       new boolean[] { true },
       "primaryKey",
       new String[] {
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//AbstractItem/id")
       });	
    addAnnotation
      (getScreen_Ordering(), 
       source, 
       new String[] {
       "db_id", "ordering"
       });	
    addAnnotation
      (getScreen_Filtering(), 
       source, 
       new String[] {
       "db_id", "filtering"
       });	
    addAnnotation
      (userEClass, 
       source, 
       new String[] {
       "db_table", "users"
       });
    addAnnotation
      (userEClass, 
       new boolean[] { true },
       "primaryKey",
       new String[] {
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//AbstractItem/id")
       });
    addAnnotation
      (userEClass, 
       new boolean[] { true },
       "indexKey",
       new String[] {
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//User/mail")
       });	
    addAnnotation
      (getUser_Mail(), 
       source, 
       new String[] {
       "db_id", "mail"
       });	
    addAnnotation
      (getUser_Password(), 
       source, 
       new String[] {
       "db_id", "password"
       });	
    addAnnotation
      (getUser_FavouriteCategories(), 
       source, 
       new String[] {
       "db_table", "favouriteCategories"
       });
    addAnnotation
      (getUser_FavouriteCategories(), 
       new boolean[] { true },
       "sourceFeature",
       new String[] {
       "name", "userId"
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//AbstractItem/id")
       });
    addAnnotation
      (getUser_FavouriteCategories(), 
       new boolean[] { true },
       "targetFeature",
       new String[] {
       "name", "categoryId"
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//AbstractItem/id")
       });	
    addAnnotation
      (getUser_FavouriteItems(), 
       source, 
       new String[] {
       "db_table", "favouriteItems"
       });
    addAnnotation
      (getUser_FavouriteItems(), 
       new boolean[] { true },
       "sourceFeature",
       new String[] {
       "name", "userId"
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//AbstractItem/id")
       });
    addAnnotation
      (getUser_FavouriteItems(), 
       new boolean[] { true },
       "targetFeature",
       new String[] {
       "name", "itemId"
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//AbstractItem/id")
       });	
    addAnnotation
      (getUser_ClickedItems(), 
       source, 
       new String[] {
       "db_table", "usersClickedItems"
       });
    addAnnotation
      (getUser_ClickedItems(), 
       new boolean[] { true },
       "sourceFeature",
       new String[] {
       "name", "userId"
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//AbstractItem/id")
       });
    addAnnotation
      (getUser_ClickedItems(), 
       new boolean[] { true },
       "targetFeature",
       new String[] {
       "name", "itemId"
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//AbstractItem/id")
       });	
    addAnnotation
      (getUser_WidgetedItems(), 
       source, 
       new String[] {
       "db_table", "usersWidgetedItems"
       });
    addAnnotation
      (getUser_WidgetedItems(), 
       new boolean[] { true },
       "sourceFeature",
       new String[] {
       "name", "userId"
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//AbstractItem/id")
       });
    addAnnotation
      (getUser_WidgetedItems(), 
       new boolean[] { true },
       "targetFeature",
       new String[] {
       "name", "itemId"
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//AbstractItem/id")
       });	
    addAnnotation
      (getUser_Gcm(), 
       source, 
       new String[] {
       "db_table", "usersGcm",
       "db_id", "usersGcm"
       });
    addAnnotation
      (getUser_Gcm(), 
       new boolean[] { true },
       "sourceFeature",
       new String[] {
       "name", "userId"
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//AbstractItem/id")
       });
    addAnnotation
      (getUser_Gcm(), 
       new boolean[] { true },
       "targetFeature",
       new String[] {
       "name", "gcm"
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//User/gcm")
       });	
    addAnnotation
      (getUser_Identifiers(), 
       source, 
       new String[] {
       "db_id", "identifiers"
       });	
    addAnnotation
      (screenListEClass, 
       source, 
       new String[] {
       "pagination", "10",
       "db_table", "screensLists",
       "description", "This is the SQL-View used for all screens per category"
       });
    addAnnotation
      (screenListEClass, 
       new boolean[] { true },
       "primaryKey",
       new String[] {
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//AbstractItem/id")
       });
    addAnnotation
      (screenListEClass, 
       new boolean[] { true },
       "indexKey",
       new String[] {
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//ScreenList/category")
       });
    addAnnotation
      (screenListEClass, 
       new boolean[] { true },
       "ordering",
       new String[] {
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//AbstractItem/id")
       });
    addAnnotation
      (screenListEClass, 
       new boolean[] { true, true },
       "orderingTable",
       new String[] {
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//Screen")
       });
    addAnnotation
      (screenListEClass, 
       new boolean[] { true, true },
       "orderingValue",
       new String[] {
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//Screen/ordering")
       });
    addAnnotation
      (screenListEClass, 
       new boolean[] { true },
       "filtering",
       new String[] {
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//AbstractItem/id")
       });
    addAnnotation
      (screenListEClass, 
       new boolean[] { true, true },
       "filteringTable",
       new String[] {
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//Screen")
       });
    addAnnotation
      (screenListEClass, 
       new boolean[] { true, true },
       "filteringValue",
       new String[] {
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//Screen/filtering")
       });	
    addAnnotation
      (getScreenList_Category(), 
       source, 
       new String[] {
       "db_id", "categoryId"
       });
    addAnnotation
      (getScreenList_Category(), 
       new boolean[] { true },
       "targetFeature",
       new String[] {
       "name", "categoryId"
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//AbstractItem/id")
       });	
    addAnnotation
      (getScreenList_Screen(), 
       source, 
       new String[] {
       "db_id", "screenId"
       });
    addAnnotation
      (getScreenList_Screen(), 
       new boolean[] { true },
       "targetFeature",
       new String[] {
       "name", "screenId"
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//AbstractItem/id")
       });	
    addAnnotation
      (getScreenList_IconData(), 
       source, 
       new String[] {
       "db_id", "iconData",
       "external", "true",
       "edit", "false"
       });	
    addAnnotation
      (getScreenList_Style(), 
       source, 
       new String[] {
       "db_id", "style",
       "edit", "false"
       });	
    addAnnotation
      (getScreenList_Packs(), 
       source, 
       new String[] {
       "db_id", "packs",
       "external", "true",
       "edit", "false"
       });	
    addAnnotation
      (homeScreenListEClass, 
       source, 
       new String[] {
       "db_table", "homeScreensLists",
       "description", "This is the SQL-View used for the home.json",
       "pagination", "10"
       });
    addAnnotation
      (homeScreenListEClass, 
       new boolean[] { true },
       "primaryKey",
       new String[] {
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//AbstractItem/id")
       });
    addAnnotation
      (homeScreenListEClass, 
       new boolean[] { true },
       "indexKey",
       new String[] {
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//HomeScreenList/application")
       });
    addAnnotation
      (homeScreenListEClass, 
       new boolean[] { true },
       "excluded_toJSON",
       new String[] {
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//HomeScreenList/application")
       });	
    addAnnotation
      (getHomeScreenList_Application(), 
       source, 
       new String[] {
       "db_id", "applicationTag"
       });
    addAnnotation
      (getHomeScreenList_Application(), 
       new boolean[] { true },
       "targetFeature",
       new String[] {
       "name", "applicationTag"
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//AbstractItem/tag")
       });	
    addAnnotation
      (categoryViewEClass, 
       source, 
       new String[] {
       "db_table", "categoriesView",
       "description", "This is the SQL-View used for the categories.json"
       });
    addAnnotation
      (categoryViewEClass, 
       new boolean[] { true },
       "databasess",
       new String[] {
       "viewSql", "SELECT categories.id, categories.name, categories.\"parentId\", categories.\"tag\", array_agg(\"screenId\") as \"screenIds\" from categories, \"categoriesScreens\" where \"categoriesScreens\".\"categoryId\" = categories.id group by categories.id, categories.name, categories.\"parentId\", categories.\"tag\"",
       "db_tabl", "categoriesList",
       "s", "SELECT \"itemId\", array_agg(ppp) as \"categoriesId\" FROM ( SELECT items.id as \"itemId\", \"itemsCategories\".\"categoryId\" as cat, parent_categories(\"itemsCategories\".\"categoryId\") as ppp FROM items, \"itemsCategories\" WHERE (items.id = \"itemsCategories\".\"itemId\") group by items.id, \"itemsCategories\".\"categoryId\" ) as List Group by \"itemId\", cat",
       "db_tabls", "itemsCategoriesAll"
       });
    addAnnotation
      (categoryViewEClass, 
       new boolean[] { true },
       "primaryKey",
       new String[] {
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//AbstractItem/id")
       });	
    addAnnotation
      (getCategoryView_ScreensIds(), 
       source, 
       new String[] {
       "db_id", "screensIds",
       "edit", "false"
       });
    addAnnotation
      (getCategoryView_ScreensIds(), 
       new boolean[] { true },
       "targetFeature",
       new String[] {
       "name", "screensIds"
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//AbstractItem/id")
       });	
    addAnnotation
      (getCategoryView_ScreensNames(), 
       source, 
       new String[] {
       "db_id", "screensNames",
       "edit", "false"
       });
    addAnnotation
      (getCategoryView_ScreensNames(), 
       new boolean[] { true },
       "targetFeature",
       new String[] {
       "name", "screensNames"
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//NamedItem/name")
       });	
    addAnnotation
      (favouriteItemsViewEClass, 
       source, 
       new String[] {
       "db_table", "favouriteItemsView"
       });
    addAnnotation
      (favouriteItemsViewEClass, 
       new boolean[] { true },
       "primaryKey",
       new String[] {
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//FavouriteItemsView/user")
       });
    addAnnotation
      (favouriteItemsViewEClass, 
       new boolean[] { true },
       "excluded_toJSON",
       new String[] {
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//FavouriteItemsView/user"),
       URI.createURI(eNS_URI).appendFragment("//Timestamp/timestamp")
       });	
    addAnnotation
      (getFavouriteItemsView_User(), 
       source, 
       new String[] {
       "db_id", "userId"
       });
    addAnnotation
      (getFavouriteItemsView_User(), 
       new boolean[] { true },
       "targetFeature",
       new String[] {
       "name", "userId"
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//AbstractItem/id")
       });	
    addAnnotation
      (favouriteCategoriesViewEClass, 
       source, 
       new String[] {
       "db_table", "favouriteCategoriesView"
       });
    addAnnotation
      (favouriteCategoriesViewEClass, 
       new boolean[] { true },
       "primaryKey",
       new String[] {
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//FavouriteCategoriesView/user")
       });
    addAnnotation
      (favouriteCategoriesViewEClass, 
       new boolean[] { true },
       "excluded_toJSON",
       new String[] {
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//FavouriteCategoriesView/user"),
       URI.createURI(eNS_URI).appendFragment("//Timestamp/timestamp")
       });	
    addAnnotation
      (getFavouriteCategoriesView_User(), 
       source, 
       new String[] {
       "db_id", "userId",
       "toJSON", "false"
       });
    addAnnotation
      (getFavouriteCategoriesView_User(), 
       new boolean[] { true },
       "targetFeature",
       new String[] {
       "name", "userId"
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//AbstractItem/id")
       });	
    addAnnotation
      (metadatasEClass, 
       source, 
       new String[] {
       "external", "true"
       });	
    addAnnotation
      (getMetadatas_Author_name(), 
       source, 
       new String[] {
       "db_id", "meta_author_name",
       "external", "true"
       });	
    addAnnotation
      (getMetadatas_Author_email(), 
       source, 
       new String[] {
       "db_id", "meta_author_email",
       "external", "true"
       });	
    addAnnotation
      (getMetadatas_Licence(), 
       source, 
       new String[] {
       "db_id", "meta_licence",
       "external", "true"
       });	
    addAnnotation
      (getMetadatas_Category_name(), 
       source, 
       new String[] {
       "db_id", "meta_category_name",
       "external", "true"
       });	
    addAnnotation
      (getMetadatas_Version(), 
       source, 
       new String[] {
       "db_id", "meta_version",
       "external", "true"
       });	
    addAnnotation
      (getMetadatas_Download(), 
       source, 
       new String[] {
       "db_id", "meta_download",
       "external", "true"
       });	
    addAnnotation
      (getMetadatas_Rate(), 
       source, 
       new String[] {
       "db_id", "meta_rate",
       "external", "true"
       });	
    addAnnotation
      (getMetadatas_News(), 
       source, 
       new String[] {
       "db_id", "meta_news",
       "external", "true"
       });	
    addAnnotation
      (getMetadatas_Date(), 
       source, 
       new String[] {
       "db_id", "meta_date",
       "external", "true"
       });	
    addAnnotation
      (getMetadatas_Size(), 
       source, 
       new String[] {
       "db_id", "meta_size",
       "external", "true"
       });	
    addAnnotation
      (getMetadatas_Price(), 
       source, 
       new String[] {
       "db_id", "meta_price",
       "external", "true"
       });	
    addAnnotation
      (getMetadatas_Source(), 
       source, 
       new String[] {
       "db_id", "meta_source",
       "external", "true"
       });	
    addAnnotation
      (getMetadatas_Name(), 
       source, 
       new String[] {
       "db_id", "meta_name",
       "external", "true"
       });	
    addAnnotation
      (getMetadatas_Name_frFR(), 
       source, 
       new String[] {
       "db_id", "meta_namefrFR",
       "external", "true"
       });	
    addAnnotation
      (getMetadatas_Description(), 
       source, 
       new String[] {
       "db_id", "meta_description",
       "external", "true"
       });	
    addAnnotation
      (getMetadatas_Description_frFR(), 
       source, 
       new String[] {
       "db_id", "meta_descriptionfrFR",
       "external", "true"
       });	
    addAnnotation
      (getMetadatas_ShortDescription(), 
       source, 
       new String[] {
       "db_id", "meta_description",
       "external", "true"
       });	
    addAnnotation
      (getMetadatas_MapsUri(), 
       source, 
       new String[] {
       "db_id", "meta_mapsUri",
       "external", "true"
       });	
    addAnnotation
      (getMetadatas_Image_mainUri(), 
       source, 
       new String[] {
       "db_id", "meta_image_mainUri",
       "external", "true"
       });	
    addAnnotation
      (getMetadatas_Image_preview2Uri(), 
       source, 
       new String[] {
       "db_id", "meta_image_preview2Uri",
       "external", "true"
       });	
    addAnnotation
      (getMetadatas_SiteUri(), 
       source, 
       new String[] {
       "db_id", "meta_siteUri",
       "external", "true"
       });	
    addAnnotation
      (getMetadatas_TripAdvisorUri(), 
       source, 
       new String[] {
       "db_id", "meta_tripAdvisorUri",
       "external", "true"
       });	
    addAnnotation
      (getMetadatas_Chart(), 
       source, 
       new String[] {
       "db_id", "meta_chart",
       "external", "true"
       });	
    addAnnotation
      (productEClass, 
       source, 
       new String[] {
       "db_table", "products"
       });
    addAnnotation
      (productEClass, 
       new boolean[] { true },
       "primaryKey",
       new String[] {
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//AbstractItem/id")
       });	
    addAnnotation
      (getProduct_Parent(), 
       source, 
       new String[] {
       "db_id", "parentId"
       });
    addAnnotation
      (getProduct_Parent(), 
       new boolean[] { true },
       "targetFeature",
       new String[] {
       "name", "parentId"
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//AbstractItem/id")
       });	
    addAnnotation
      (itemProductEClass, 
       source, 
       new String[] {
       "db_table", "itemsProducts"
       });
    addAnnotation
      (itemProductEClass, 
       new boolean[] { true },
       "primaryKey",
       new String[] {
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//AbstractItem/id")
       });
    addAnnotation
      (itemProductEClass, 
       new boolean[] { true },
       "indexKey",
       new String[] {
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//ItemProduct/product"),
       URI.createURI(eNS_URI).appendFragment("//ItemProduct/item")
       });	
    addAnnotation
      (getItemProduct_Item(), 
       source, 
       new String[] {
       "db_id", "itemId"
       });
    addAnnotation
      (getItemProduct_Item(), 
       new boolean[] { true },
       "targetFeature",
       new String[] {
       "name", "itemId"
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//AbstractItem/id")
       });	
    addAnnotation
      (getItemProduct_Product(), 
       source, 
       new String[] {
       "db_id", "productId"
       });
    addAnnotation
      (getItemProduct_Product(), 
       new boolean[] { true },
       "targetFeature",
       new String[] {
       "name", "productId"
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//AbstractItem/id")
       });	
    addAnnotation
      (oAuthTokenEClass, 
       source, 
       new String[] {
       "db_table", "tokens"
       });
    addAnnotation
      (oAuthTokenEClass, 
       new boolean[] { true },
       "primaryKey",
       new String[] {
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//OAuthToken/tokenId")
       });	
    addAnnotation
      (getOAuthToken_TokenId(), 
       source, 
       new String[] {
       "db_id", "tokenId"
       });	
    addAnnotation
      (getOAuthToken_DeviceId(), 
       source, 
       new String[] {
       "db_id", "deviceId"
       });	
    addAnnotation
      (getOAuthToken_User(), 
       source, 
       new String[] {
       "db_id", "userId"
       });
    addAnnotation
      (getOAuthToken_User(), 
       new boolean[] { true },
       "targetFeature",
       new String[] {
       "name", "userId"
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//AbstractItem/id")
       });	
    addAnnotation
      (applicationEClass, 
       source, 
       new String[] {
       "db_table", "applications"
       });
    addAnnotation
      (applicationEClass, 
       new boolean[] { true },
       "primaryKey",
       new String[] {
       },
       new URI[] {
       URI.createURI(eNS_URI).appendFragment("//AbstractItem/id")
       });
  }

  /**
   * Initializes the annotations for <b>deprecated</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createDeprecatedAnnotations() {
    String source = "deprecated";	
    addAnnotation
      (getScreenList_Screen(), 
       source, 
       new String[] {
       });
  }

} //DataPackageImpl
