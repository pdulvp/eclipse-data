/**
 */
package org.pdulvp.data;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.pdulvp.data.DataFactory
 * @model kind="package"
 * @generated
 */
public interface DataPackage extends EPackage {
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "data";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://org.pdulvp/data";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "data";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DataPackage eINSTANCE = org.pdulvp.data.impl.DataPackageImpl.init();

  /**
   * The meta object id for the '{@link org.pdulvp.data.impl.TimestampImpl <em>Timestamp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.impl.TimestampImpl
   * @see org.pdulvp.data.impl.DataPackageImpl#getTimestamp()
   * @generated
   */
  int TIMESTAMP = 6;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMESTAMP__TIMESTAMP = 0;

  /**
   * The number of structural features of the '<em>Timestamp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMESTAMP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.pdulvp.data.impl.AbstractItemImpl <em>Abstract Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.impl.AbstractItemImpl
   * @see org.pdulvp.data.impl.DataPackageImpl#getAbstractItem()
   * @generated
   */
  int ABSTRACT_ITEM = 7;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ITEM__TIMESTAMP = TIMESTAMP__TIMESTAMP;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ITEM__ID = TIMESTAMP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ITEM__TAG = TIMESTAMP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Abstract Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ITEM_FEATURE_COUNT = TIMESTAMP_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.pdulvp.data.impl.ItemRootImpl <em>Item Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.impl.ItemRootImpl
   * @see org.pdulvp.data.impl.DataPackageImpl#getItemRoot()
   * @generated
   */
  int ITEM_ROOT = 0;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_ROOT__TIMESTAMP = ABSTRACT_ITEM__TIMESTAMP;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_ROOT__ID = ABSTRACT_ITEM__ID;

  /**
   * The feature id for the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_ROOT__TAG = ABSTRACT_ITEM__TAG;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_ROOT__NAME = ABSTRACT_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name fr FR</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_ROOT__NAME_FR_FR = ABSTRACT_ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Owned Category Pkgs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_ROOT__OWNED_CATEGORY_PKGS = ABSTRACT_ITEM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Owned Categories</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_ROOT__OWNED_CATEGORIES = ABSTRACT_ITEM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Owned Product Pkgs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_ROOT__OWNED_PRODUCT_PKGS = ABSTRACT_ITEM_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Owned Products</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_ROOT__OWNED_PRODUCTS = ABSTRACT_ITEM_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Owned Item Pkgs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_ROOT__OWNED_ITEM_PKGS = ABSTRACT_ITEM_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Owned Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_ROOT__OWNED_ITEMS = ABSTRACT_ITEM_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Owned Screen Pkgs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_ROOT__OWNED_SCREEN_PKGS = ABSTRACT_ITEM_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Owned Screens</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_ROOT__OWNED_SCREENS = ABSTRACT_ITEM_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Owned Type Pkgs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_ROOT__OWNED_TYPE_PKGS = ABSTRACT_ITEM_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Owned Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_ROOT__OWNED_TYPES = ABSTRACT_ITEM_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Db Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_ROOT__DB_NAME = ABSTRACT_ITEM_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Owned Tables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_ROOT__OWNED_TABLES = ABSTRACT_ITEM_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Owned Applications</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_ROOT__OWNED_APPLICATIONS = ABSTRACT_ITEM_FEATURE_COUNT + 14;

  /**
   * The feature id for the '<em><b>Owned Screen Lists</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_ROOT__OWNED_SCREEN_LISTS = ABSTRACT_ITEM_FEATURE_COUNT + 15;

  /**
   * The feature id for the '<em><b>Owned Item Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_ROOT__OWNED_ITEM_TYPES = ABSTRACT_ITEM_FEATURE_COUNT + 16;

  /**
   * The number of structural features of the '<em>Item Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_ROOT_FEATURE_COUNT = ABSTRACT_ITEM_FEATURE_COUNT + 17;

  /**
   * The meta object id for the '{@link org.pdulvp.data.impl.NamedItemImpl <em>Named Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.impl.NamedItemImpl
   * @see org.pdulvp.data.impl.DataPackageImpl#getNamedItem()
   * @generated
   */
  int NAMED_ITEM = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ITEM__NAME = 0;

  /**
   * The feature id for the '<em><b>Name fr FR</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ITEM__NAME_FR_FR = 1;

  /**
   * The number of structural features of the '<em>Named Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ITEM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.pdulvp.data.impl.ItemPkgImpl <em>Item Pkg</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.impl.ItemPkgImpl
   * @see org.pdulvp.data.impl.DataPackageImpl#getItemPkg()
   * @generated
   */
  int ITEM_PKG = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_PKG__NAME = NAMED_ITEM__NAME;

  /**
   * The feature id for the '<em><b>Name fr FR</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_PKG__NAME_FR_FR = NAMED_ITEM__NAME_FR_FR;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_PKG__TIMESTAMP = NAMED_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_PKG__ID = NAMED_ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_PKG__TAG = NAMED_ITEM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Owned Item Pkgs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_PKG__OWNED_ITEM_PKGS = NAMED_ITEM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Owned Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_PKG__OWNED_ITEMS = NAMED_ITEM_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Item Pkg</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_PKG_FEATURE_COUNT = NAMED_ITEM_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.pdulvp.data.impl.ChildItemImpl <em>Child Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.impl.ChildItemImpl
   * @see org.pdulvp.data.impl.DataPackageImpl#getChildItem()
   * @generated
   */
  int CHILD_ITEM = 2;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHILD_ITEM__TIMESTAMP = ABSTRACT_ITEM__TIMESTAMP;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHILD_ITEM__ID = ABSTRACT_ITEM__ID;

  /**
   * The feature id for the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHILD_ITEM__TAG = ABSTRACT_ITEM__TAG;

  /**
   * The feature id for the '<em><b>Categories</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHILD_ITEM__CATEGORIES = ABSTRACT_ITEM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Child Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHILD_ITEM_FEATURE_COUNT = ABSTRACT_ITEM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.pdulvp.data.impl.ScreenPkgImpl <em>Screen Pkg</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.impl.ScreenPkgImpl
   * @see org.pdulvp.data.impl.DataPackageImpl#getScreenPkg()
   * @generated
   */
  int SCREEN_PKG = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN_PKG__NAME = NAMED_ITEM__NAME;

  /**
   * The feature id for the '<em><b>Name fr FR</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN_PKG__NAME_FR_FR = NAMED_ITEM__NAME_FR_FR;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN_PKG__TIMESTAMP = NAMED_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN_PKG__ID = NAMED_ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN_PKG__TAG = NAMED_ITEM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Owned Screen Pkgs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN_PKG__OWNED_SCREEN_PKGS = NAMED_ITEM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Owned Screens</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN_PKG__OWNED_SCREENS = NAMED_ITEM_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Screen Pkg</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN_PKG_FEATURE_COUNT = NAMED_ITEM_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.pdulvp.data.impl.CategoryPkgImpl <em>Category Pkg</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.impl.CategoryPkgImpl
   * @see org.pdulvp.data.impl.DataPackageImpl#getCategoryPkg()
   * @generated
   */
  int CATEGORY_PKG = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_PKG__NAME = NAMED_ITEM__NAME;

  /**
   * The feature id for the '<em><b>Name fr FR</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_PKG__NAME_FR_FR = NAMED_ITEM__NAME_FR_FR;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_PKG__TIMESTAMP = NAMED_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_PKG__ID = NAMED_ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_PKG__TAG = NAMED_ITEM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Owned Category Pkgs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_PKG__OWNED_CATEGORY_PKGS = NAMED_ITEM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Owned Categories</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_PKG__OWNED_CATEGORIES = NAMED_ITEM_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Category Pkg</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_PKG_FEATURE_COUNT = NAMED_ITEM_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.pdulvp.data.impl.ProductPkgImpl <em>Product Pkg</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.impl.ProductPkgImpl
   * @see org.pdulvp.data.impl.DataPackageImpl#getProductPkg()
   * @generated
   */
  int PRODUCT_PKG = 22;

  /**
   * The meta object id for the '{@link org.pdulvp.data.impl.ItemTypePkgImpl <em>Item Type Pkg</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.impl.ItemTypePkgImpl
   * @see org.pdulvp.data.impl.DataPackageImpl#getItemTypePkg()
   * @generated
   */
  int ITEM_TYPE_PKG = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_TYPE_PKG__NAME = NAMED_ITEM__NAME;

  /**
   * The feature id for the '<em><b>Name fr FR</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_TYPE_PKG__NAME_FR_FR = NAMED_ITEM__NAME_FR_FR;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_TYPE_PKG__TIMESTAMP = NAMED_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_TYPE_PKG__ID = NAMED_ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_TYPE_PKG__TAG = NAMED_ITEM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Owned Type Pkgs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_TYPE_PKG__OWNED_TYPE_PKGS = NAMED_ITEM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Owned Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_TYPE_PKG__OWNED_TYPES = NAMED_ITEM_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Item Type Pkg</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_TYPE_PKG_FEATURE_COUNT = NAMED_ITEM_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.pdulvp.data.impl.CategoryImpl <em>Category</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.impl.CategoryImpl
   * @see org.pdulvp.data.impl.DataPackageImpl#getCategory()
   * @generated
   */
  int CATEGORY = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY__NAME = NAMED_ITEM__NAME;

  /**
   * The feature id for the '<em><b>Name fr FR</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY__NAME_FR_FR = NAMED_ITEM__NAME_FR_FR;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY__TIMESTAMP = NAMED_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY__ID = NAMED_ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY__TAG = NAMED_ITEM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Owned Item Pkgs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY__OWNED_ITEM_PKGS = NAMED_ITEM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Owned Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY__OWNED_ITEMS = NAMED_ITEM_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY__VISIBLE = NAMED_ITEM_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Inapp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY__INAPP = NAMED_ITEM_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Inapp Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY__INAPP_DESCRIPTION = NAMED_ITEM_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Inapp Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY__INAPP_TITLE = NAMED_ITEM_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Price</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY__PRICE = NAMED_ITEM_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY__PARENT = NAMED_ITEM_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Owned Categories</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY__OWNED_CATEGORIES = NAMED_ITEM_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Screens</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY__SCREENS = NAMED_ITEM_FEATURE_COUNT + 12;

  /**
   * The number of structural features of the '<em>Category</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_FEATURE_COUNT = NAMED_ITEM_FEATURE_COUNT + 13;

  /**
   * The meta object id for the '{@link org.pdulvp.data.impl.ImageItemImpl <em>Image Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.impl.ImageItemImpl
   * @see org.pdulvp.data.impl.DataPackageImpl#getImageItem()
   * @generated
   */
  int IMAGE_ITEM = 11;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_ITEM__TIMESTAMP = CHILD_ITEM__TIMESTAMP;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_ITEM__ID = CHILD_ITEM__ID;

  /**
   * The feature id for the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_ITEM__TAG = CHILD_ITEM__TAG;

  /**
   * The feature id for the '<em><b>Categories</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_ITEM__CATEGORIES = CHILD_ITEM__CATEGORIES;

    /**
   * The feature id for the '<em><b>Source Path</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
    int IMAGE_ITEM__SOURCE_PATH = CHILD_ITEM_FEATURE_COUNT + 0;

    /**
   * The feature id for the '<em><b>Date Created</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
    int IMAGE_ITEM__DATE_CREATED = CHILD_ITEM_FEATURE_COUNT + 1;

    /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
    int IMAGE_ITEM__STYLE = CHILD_ITEM_FEATURE_COUNT + 2;

    /**
   * The feature id for the '<em><b>GImage Data Path</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
    int IMAGE_ITEM__GIMAGE_DATA_PATH = CHILD_ITEM_FEATURE_COUNT + 3;

    /**
   * The feature id for the '<em><b>GIcon Data Path</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
    int IMAGE_ITEM__GICON_DATA_PATH = CHILD_ITEM_FEATURE_COUNT + 4;

    /**
   * The feature id for the '<em><b>GIcon16 Path</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
    int IMAGE_ITEM__GICON16_PATH = CHILD_ITEM_FEATURE_COUNT + 5;

    /**
   * The feature id for the '<em><b>GType</b></em>' reference.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
    int IMAGE_ITEM__GTYPE = CHILD_ITEM_FEATURE_COUNT + 6;

    /**
   * The feature id for the '<em><b>Icon Data</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
    int IMAGE_ITEM__ICON_DATA = CHILD_ITEM_FEATURE_COUNT + 7;

    /**
   * The feature id for the '<em><b>Image Data</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
    int IMAGE_ITEM__IMAGE_DATA = CHILD_ITEM_FEATURE_COUNT + 8;

    /**
   * The feature id for the '<em><b>Packs</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
    int IMAGE_ITEM__PACKS = CHILD_ITEM_FEATURE_COUNT + 9;

    /**
   * The feature id for the '<em><b>Rank</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_ITEM__RANK = CHILD_ITEM_FEATURE_COUNT + 10;

    /**
   * The feature id for the '<em><b>Metadatas</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_ITEM__METADATAS = CHILD_ITEM_FEATURE_COUNT + 11;

    /**
   * The feature id for the '<em><b>External Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_ITEM__EXTERNAL_PATH = CHILD_ITEM_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Products</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_ITEM__PRODUCTS = CHILD_ITEM_FEATURE_COUNT + 13;

  /**
   * The number of structural features of the '<em>Image Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_ITEM_FEATURE_COUNT = CHILD_ITEM_FEATURE_COUNT + 14;

  /**
   * The meta object id for the '{@link org.pdulvp.data.impl.ItemImpl <em>Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.impl.ItemImpl
   * @see org.pdulvp.data.impl.DataPackageImpl#getItem()
   * @generated
   */
  int ITEM = 10;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM__TIMESTAMP = IMAGE_ITEM__TIMESTAMP;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM__ID = IMAGE_ITEM__ID;

  /**
   * The feature id for the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM__TAG = IMAGE_ITEM__TAG;

  /**
   * The feature id for the '<em><b>Categories</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM__CATEGORIES = IMAGE_ITEM__CATEGORIES;

    /**
   * The feature id for the '<em><b>Source Path</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
    int ITEM__SOURCE_PATH = IMAGE_ITEM__SOURCE_PATH;

    /**
   * The feature id for the '<em><b>Date Created</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
    int ITEM__DATE_CREATED = IMAGE_ITEM__DATE_CREATED;

    /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
    int ITEM__STYLE = IMAGE_ITEM__STYLE;

    /**
   * The feature id for the '<em><b>GImage Data Path</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
    int ITEM__GIMAGE_DATA_PATH = IMAGE_ITEM__GIMAGE_DATA_PATH;

    /**
   * The feature id for the '<em><b>GIcon Data Path</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
    int ITEM__GICON_DATA_PATH = IMAGE_ITEM__GICON_DATA_PATH;

    /**
   * The feature id for the '<em><b>GIcon16 Path</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
    int ITEM__GICON16_PATH = IMAGE_ITEM__GICON16_PATH;

    /**
   * The feature id for the '<em><b>GType</b></em>' reference.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
    int ITEM__GTYPE = IMAGE_ITEM__GTYPE;

    /**
   * The feature id for the '<em><b>Icon Data</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
    int ITEM__ICON_DATA = IMAGE_ITEM__ICON_DATA;

    /**
   * The feature id for the '<em><b>Image Data</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
    int ITEM__IMAGE_DATA = IMAGE_ITEM__IMAGE_DATA;

    /**
   * The feature id for the '<em><b>Packs</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
    int ITEM__PACKS = IMAGE_ITEM__PACKS;

    /**
   * The feature id for the '<em><b>Rank</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM__RANK = IMAGE_ITEM__RANK;

    /**
   * The feature id for the '<em><b>Metadatas</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM__METADATAS = IMAGE_ITEM__METADATAS;

    /**
   * The feature id for the '<em><b>External Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM__EXTERNAL_PATH = IMAGE_ITEM__EXTERNAL_PATH;

  /**
   * The feature id for the '<em><b>Products</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM__PRODUCTS = IMAGE_ITEM__PRODUCTS;

  /**
   * The number of structural features of the '<em>Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_FEATURE_COUNT = IMAGE_ITEM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.pdulvp.data.impl.ScreenImpl <em>Screen</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.impl.ScreenImpl
   * @see org.pdulvp.data.impl.DataPackageImpl#getScreen()
   * @generated
   */
  int SCREEN = 13;

  /**
   * The meta object id for the '{@link org.pdulvp.data.impl.UserImpl <em>User</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.impl.UserImpl
   * @see org.pdulvp.data.impl.DataPackageImpl#getUser()
   * @generated
   */
  int USER = 14;

  /**
   * The meta object id for the '{@link org.pdulvp.data.impl.ScreenListImpl <em>Screen List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.impl.ScreenListImpl
   * @see org.pdulvp.data.impl.DataPackageImpl#getScreenList()
   * @generated
   */
  int SCREEN_LIST = 15;

  /**
   * The meta object id for the '{@link org.pdulvp.data.impl.HomeScreenListImpl <em>Home Screen List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.impl.HomeScreenListImpl
   * @see org.pdulvp.data.impl.DataPackageImpl#getHomeScreenList()
   * @generated
   */
  int HOME_SCREEN_LIST = 16;

  /**
   * The meta object id for the '{@link org.pdulvp.data.impl.CategoryViewImpl <em>Category View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.impl.CategoryViewImpl
   * @see org.pdulvp.data.impl.DataPackageImpl#getCategoryView()
   * @generated
   */
  int CATEGORY_VIEW = 17;

  /**
   * The meta object id for the '{@link org.pdulvp.data.impl.FavouriteItemsViewImpl <em>Favourite Items View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.impl.FavouriteItemsViewImpl
   * @see org.pdulvp.data.impl.DataPackageImpl#getFavouriteItemsView()
   * @generated
   */
  int FAVOURITE_ITEMS_VIEW = 18;

  /**
   * The meta object id for the '{@link org.pdulvp.data.impl.FavouriteCategoriesViewImpl <em>Favourite Categories View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.impl.FavouriteCategoriesViewImpl
   * @see org.pdulvp.data.impl.DataPackageImpl#getFavouriteCategoriesView()
   * @generated
   */
  int FAVOURITE_CATEGORIES_VIEW = 19;

  /**
   * The meta object id for the '{@link org.pdulvp.data.impl.OAuthTokenImpl <em>OAuth Token</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.impl.OAuthTokenImpl
   * @see org.pdulvp.data.impl.DataPackageImpl#getOAuthToken()
   * @generated
   */
  int OAUTH_TOKEN = 25;

  /**
   * The meta object id for the '{@link org.pdulvp.data.impl.ItemTypeImpl <em>Item Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.impl.ItemTypeImpl
   * @see org.pdulvp.data.impl.DataPackageImpl#getItemType()
   * @generated
   */
  int ITEM_TYPE = 20;

  /**
   * The meta object id for the '{@link org.pdulvp.data.impl.MetadatasImpl <em>Metadatas</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.impl.MetadatasImpl
   * @see org.pdulvp.data.impl.DataPackageImpl#getMetadatas()
   * @generated
   */
  int METADATAS = 21;

  /**
   * The meta object id for the '{@link org.pdulvp.data.impl.HomeItemImpl <em>Home Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.impl.HomeItemImpl
   * @see org.pdulvp.data.impl.DataPackageImpl#getHomeItem()
   * @generated
   */
  int HOME_ITEM = 12;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOME_ITEM__TIMESTAMP = ABSTRACT_ITEM__TIMESTAMP;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOME_ITEM__ID = ABSTRACT_ITEM__ID;

  /**
   * The feature id for the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOME_ITEM__TAG = ABSTRACT_ITEM__TAG;

  /**
   * The feature id for the '<em><b>Application</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOME_ITEM__APPLICATION = ABSTRACT_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOME_ITEM__CATEGORY = ABSTRACT_ITEM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Home Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOME_ITEM_FEATURE_COUNT = ABSTRACT_ITEM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN__NAME = NAMED_ITEM__NAME;

  /**
   * The feature id for the '<em><b>Name fr FR</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN__NAME_FR_FR = NAMED_ITEM__NAME_FR_FR;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN__TIMESTAMP = NAMED_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN__ID = NAMED_ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN__TAG = NAMED_ITEM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Ordering</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN__ORDERING = NAMED_ITEM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Filtering</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN__FILTERING = NAMED_ITEM_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Screen</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN_FEATURE_COUNT = NAMED_ITEM_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER__TIMESTAMP = ABSTRACT_ITEM__TIMESTAMP;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER__ID = ABSTRACT_ITEM__ID;

  /**
   * The feature id for the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER__TAG = ABSTRACT_ITEM__TAG;

  /**
   * The feature id for the '<em><b>Mail</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER__MAIL = ABSTRACT_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Password</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER__PASSWORD = ABSTRACT_ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Favourite Categories</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER__FAVOURITE_CATEGORIES = ABSTRACT_ITEM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Favourite Items</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER__FAVOURITE_ITEMS = ABSTRACT_ITEM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Clicked Items</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER__CLICKED_ITEMS = ABSTRACT_ITEM_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Widgeted Items</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER__WIDGETED_ITEMS = ABSTRACT_ITEM_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Gcm</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER__GCM = ABSTRACT_ITEM_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Identifiers</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER__IDENTIFIERS = ABSTRACT_ITEM_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>User</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_FEATURE_COUNT = ABSTRACT_ITEM_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN_LIST__TIMESTAMP = ABSTRACT_ITEM__TIMESTAMP;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN_LIST__ID = ABSTRACT_ITEM__ID;

  /**
   * The feature id for the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN_LIST__TAG = ABSTRACT_ITEM__TAG;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN_LIST__CATEGORY = ABSTRACT_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Screen</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN_LIST__SCREEN = ABSTRACT_ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Icon Data</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN_LIST__ICON_DATA = ABSTRACT_ITEM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SCREEN_LIST__STYLE = ABSTRACT_ITEM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Packs</b></em>' attribute.
   * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
int SCREEN_LIST__PACKS = ABSTRACT_ITEM_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Screen List</em>' class.
   * <!-- begin-user-doc -->
  * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
 int SCREEN_LIST_FEATURE_COUNT = ABSTRACT_ITEM_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOME_SCREEN_LIST__TIMESTAMP = SCREEN_LIST__TIMESTAMP;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOME_SCREEN_LIST__ID = SCREEN_LIST__ID;

  /**
   * The feature id for the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOME_SCREEN_LIST__TAG = SCREEN_LIST__TAG;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOME_SCREEN_LIST__CATEGORY = SCREEN_LIST__CATEGORY;

  /**
   * The feature id for the '<em><b>Screen</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOME_SCREEN_LIST__SCREEN = SCREEN_LIST__SCREEN;

  /**
   * The feature id for the '<em><b>Icon Data</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOME_SCREEN_LIST__ICON_DATA = SCREEN_LIST__ICON_DATA;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int HOME_SCREEN_LIST__STYLE = SCREEN_LIST__STYLE;

  /**
   * The feature id for the '<em><b>Packs</b></em>' attribute.
   * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
int HOME_SCREEN_LIST__PACKS = SCREEN_LIST__PACKS;

  /**
   * The feature id for the '<em><b>Application</b></em>' reference.
   * <!-- begin-user-doc -->
  * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
 int HOME_SCREEN_LIST__APPLICATION = SCREEN_LIST_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Home Screen List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOME_SCREEN_LIST_FEATURE_COUNT = SCREEN_LIST_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_VIEW__NAME = CATEGORY__NAME;

  /**
   * The feature id for the '<em><b>Name fr FR</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_VIEW__NAME_FR_FR = CATEGORY__NAME_FR_FR;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_VIEW__TIMESTAMP = CATEGORY__TIMESTAMP;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_VIEW__ID = CATEGORY__ID;

  /**
   * The feature id for the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_VIEW__TAG = CATEGORY__TAG;

  /**
   * The feature id for the '<em><b>Owned Item Pkgs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_VIEW__OWNED_ITEM_PKGS = CATEGORY__OWNED_ITEM_PKGS;

  /**
   * The feature id for the '<em><b>Owned Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_VIEW__OWNED_ITEMS = CATEGORY__OWNED_ITEMS;

  /**
   * The feature id for the '<em><b>Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_VIEW__VISIBLE = CATEGORY__VISIBLE;

  /**
   * The feature id for the '<em><b>Inapp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_VIEW__INAPP = CATEGORY__INAPP;

  /**
   * The feature id for the '<em><b>Inapp Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_VIEW__INAPP_DESCRIPTION = CATEGORY__INAPP_DESCRIPTION;

  /**
   * The feature id for the '<em><b>Inapp Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_VIEW__INAPP_TITLE = CATEGORY__INAPP_TITLE;

  /**
   * The feature id for the '<em><b>Price</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_VIEW__PRICE = CATEGORY__PRICE;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_VIEW__PARENT = CATEGORY__PARENT;

  /**
   * The feature id for the '<em><b>Owned Categories</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_VIEW__OWNED_CATEGORIES = CATEGORY__OWNED_CATEGORIES;

  /**
   * The feature id for the '<em><b>Screens</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_VIEW__SCREENS = CATEGORY__SCREENS;

  /**
   * The feature id for the '<em><b>Screens Ids</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_VIEW__SCREENS_IDS = CATEGORY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Screens Names</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_VIEW__SCREENS_NAMES = CATEGORY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Category View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_VIEW_FEATURE_COUNT = CATEGORY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAVOURITE_ITEMS_VIEW__TIMESTAMP = SCREEN_LIST__TIMESTAMP;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAVOURITE_ITEMS_VIEW__ID = SCREEN_LIST__ID;

  /**
   * The feature id for the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAVOURITE_ITEMS_VIEW__TAG = SCREEN_LIST__TAG;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAVOURITE_ITEMS_VIEW__CATEGORY = SCREEN_LIST__CATEGORY;

  /**
   * The feature id for the '<em><b>Screen</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAVOURITE_ITEMS_VIEW__SCREEN = SCREEN_LIST__SCREEN;

  /**
   * The feature id for the '<em><b>Icon Data</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAVOURITE_ITEMS_VIEW__ICON_DATA = SCREEN_LIST__ICON_DATA;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int FAVOURITE_ITEMS_VIEW__STYLE = SCREEN_LIST__STYLE;

  /**
   * The feature id for the '<em><b>Packs</b></em>' attribute.
   * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
int FAVOURITE_ITEMS_VIEW__PACKS = SCREEN_LIST__PACKS;

  /**
   * The feature id for the '<em><b>User</b></em>' reference.
   * <!-- begin-user-doc -->
  * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
 int FAVOURITE_ITEMS_VIEW__USER = SCREEN_LIST_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Favourite Items View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAVOURITE_ITEMS_VIEW_FEATURE_COUNT = SCREEN_LIST_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAVOURITE_CATEGORIES_VIEW__TIMESTAMP = SCREEN_LIST__TIMESTAMP;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAVOURITE_CATEGORIES_VIEW__ID = SCREEN_LIST__ID;

  /**
   * The feature id for the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAVOURITE_CATEGORIES_VIEW__TAG = SCREEN_LIST__TAG;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAVOURITE_CATEGORIES_VIEW__CATEGORY = SCREEN_LIST__CATEGORY;

  /**
   * The feature id for the '<em><b>Screen</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAVOURITE_CATEGORIES_VIEW__SCREEN = SCREEN_LIST__SCREEN;

  /**
   * The feature id for the '<em><b>Icon Data</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAVOURITE_CATEGORIES_VIEW__ICON_DATA = SCREEN_LIST__ICON_DATA;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int FAVOURITE_CATEGORIES_VIEW__STYLE = SCREEN_LIST__STYLE;

  /**
   * The feature id for the '<em><b>Packs</b></em>' attribute.
   * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
int FAVOURITE_CATEGORIES_VIEW__PACKS = SCREEN_LIST__PACKS;

  /**
   * The feature id for the '<em><b>User</b></em>' reference.
   * <!-- begin-user-doc -->
  * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
 int FAVOURITE_CATEGORIES_VIEW__USER = SCREEN_LIST_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Favourite Categories View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAVOURITE_CATEGORIES_VIEW_FEATURE_COUNT = SCREEN_LIST_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_TYPE__NAME = NAMED_ITEM__NAME;

  /**
   * The feature id for the '<em><b>Name fr FR</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_TYPE__NAME_FR_FR = NAMED_ITEM__NAME_FR_FR;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_TYPE__TIMESTAMP = NAMED_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_TYPE__ID = NAMED_ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_TYPE__TAG = NAMED_ITEM_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Item Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_TYPE_FEATURE_COUNT = NAMED_ITEM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Author name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATAS__AUTHOR_NAME = 0;

  /**
   * The feature id for the '<em><b>Author email</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATAS__AUTHOR_EMAIL = 1;

  /**
   * The feature id for the '<em><b>Licence</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATAS__LICENCE = 2;

  /**
   * The feature id for the '<em><b>Category name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATAS__CATEGORY_NAME = 3;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATAS__VERSION = 4;

  /**
   * The feature id for the '<em><b>Download</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATAS__DOWNLOAD = 5;

  /**
   * The feature id for the '<em><b>Rate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATAS__RATE = 6;

  /**
   * The feature id for the '<em><b>News</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATAS__NEWS = 7;

  /**
   * The feature id for the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATAS__DATE = 8;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATAS__SIZE = 9;

  /**
   * The feature id for the '<em><b>Price</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATAS__PRICE = 10;

  /**
   * The feature id for the '<em><b>Source</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATAS__SOURCE = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATAS__NAME = 12;

  /**
   * The feature id for the '<em><b>Name fr FR</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATAS__NAME_FR_FR = 13;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATAS__DESCRIPTION = 14;

  /**
   * The feature id for the '<em><b>Description fr FR</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATAS__DESCRIPTION_FR_FR = 15;

  /**
   * The feature id for the '<em><b>Short Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATAS__SHORT_DESCRIPTION = 16;

  /**
   * The feature id for the '<em><b>Maps Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATAS__MAPS_URI = 17;

  /**
   * The feature id for the '<em><b>Image main Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATAS__IMAGE_MAIN_URI = 18;

  /**
   * The feature id for the '<em><b>Image preview2 Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATAS__IMAGE_PREVIEW2_URI = 19;

  /**
   * The feature id for the '<em><b>Site Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATAS__SITE_URI = 20;

  /**
   * The feature id for the '<em><b>Trip Advisor Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATAS__TRIP_ADVISOR_URI = 21;

  /**
   * The feature id for the '<em><b>Chart</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATAS__CHART = 22;

  /**
   * The number of structural features of the '<em>Metadatas</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATAS_FEATURE_COUNT = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_PKG__NAME = NAMED_ITEM__NAME;

  /**
   * The feature id for the '<em><b>Name fr FR</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_PKG__NAME_FR_FR = NAMED_ITEM__NAME_FR_FR;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_PKG__TIMESTAMP = NAMED_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_PKG__ID = NAMED_ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_PKG__TAG = NAMED_ITEM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Owned Product Pkgs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_PKG__OWNED_PRODUCT_PKGS = NAMED_ITEM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Owned Products</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_PKG__OWNED_PRODUCTS = NAMED_ITEM_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Product Pkg</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_PKG_FEATURE_COUNT = NAMED_ITEM_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.pdulvp.data.impl.ApplicationImpl <em>Application</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.impl.ApplicationImpl
   * @see org.pdulvp.data.impl.DataPackageImpl#getApplication()
   * @generated
   */
  int APPLICATION = 26;

  /**
   * The meta object id for the '{@link org.pdulvp.data.impl.SchemaPkgImpl <em>Schema Pkg</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.impl.SchemaPkgImpl
   * @see org.pdulvp.data.impl.DataPackageImpl#getSchemaPkg()
   * @generated
   */
  int SCHEMA_PKG = 27;

  /**
   * The meta object id for the '{@link org.pdulvp.data.impl.ProductImpl <em>Product</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.impl.ProductImpl
   * @see org.pdulvp.data.impl.DataPackageImpl#getProduct()
   * @generated
   */
  int PRODUCT = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT__NAME = NAMED_ITEM__NAME;

  /**
   * The feature id for the '<em><b>Name fr FR</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT__NAME_FR_FR = NAMED_ITEM__NAME_FR_FR;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT__TIMESTAMP = NAMED_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT__ID = NAMED_ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT__TAG = NAMED_ITEM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Owned Products</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT__OWNED_PRODUCTS = NAMED_ITEM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT__PARENT = NAMED_ITEM_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Product</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_FEATURE_COUNT = NAMED_ITEM_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.pdulvp.data.impl.SchemaImpl <em>Schema</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.impl.SchemaImpl
   * @see org.pdulvp.data.impl.DataPackageImpl#getSchema()
   * @generated
   */
  int SCHEMA = 28;

  /**
   * The meta object id for the '{@link org.pdulvp.data.impl.SchemaClassImpl <em>Schema Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.impl.SchemaClassImpl
   * @see org.pdulvp.data.impl.DataPackageImpl#getSchemaClass()
   * @generated
   */
  int SCHEMA_CLASS = 29;

  /**
   * The meta object id for the '{@link org.pdulvp.data.impl.SchemaFeatureImpl <em>Schema Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.impl.SchemaFeatureImpl
   * @see org.pdulvp.data.impl.DataPackageImpl#getSchemaFeature()
   * @generated
   */
  int SCHEMA_FEATURE = 30;

  /**
   * The meta object id for the '{@link org.pdulvp.data.impl.RequestPkgImpl <em>Request Pkg</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.impl.RequestPkgImpl
   * @see org.pdulvp.data.impl.DataPackageImpl#getRequestPkg()
   * @generated
   */
  int REQUEST_PKG = 31;

  /**
   * The meta object id for the '{@link org.pdulvp.data.impl.RequestImpl <em>Request</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.impl.RequestImpl
   * @see org.pdulvp.data.impl.DataPackageImpl#getRequest()
   * @generated
   */
  int REQUEST = 32;

  /**
   * The meta object id for the '{@link org.pdulvp.data.impl.JobPkgImpl <em>Job Pkg</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.impl.JobPkgImpl
   * @see org.pdulvp.data.impl.DataPackageImpl#getJobPkg()
   * @generated
   */
  int JOB_PKG = 33;

  /**
   * The meta object id for the '{@link org.pdulvp.data.impl.JobImpl <em>Job</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.impl.JobImpl
   * @see org.pdulvp.data.impl.DataPackageImpl#getJob()
   * @generated
   */
  int JOB = 34;

  /**
   * The meta object id for the '{@link org.pdulvp.data.impl.ItemProductImpl <em>Item Product</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.impl.ItemProductImpl
   * @see org.pdulvp.data.impl.DataPackageImpl#getItemProduct()
   * @generated
   */
  int ITEM_PRODUCT = 24;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_PRODUCT__TIMESTAMP = ABSTRACT_ITEM__TIMESTAMP;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_PRODUCT__ID = ABSTRACT_ITEM__ID;

  /**
   * The feature id for the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_PRODUCT__TAG = ABSTRACT_ITEM__TAG;

  /**
   * The feature id for the '<em><b>Item</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_PRODUCT__ITEM = ABSTRACT_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Product</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_PRODUCT__PRODUCT = ABSTRACT_ITEM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Item Product</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_PRODUCT_FEATURE_COUNT = ABSTRACT_ITEM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OAUTH_TOKEN__TIMESTAMP = TIMESTAMP__TIMESTAMP;

  /**
   * The feature id for the '<em><b>Token Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OAUTH_TOKEN__TOKEN_ID = TIMESTAMP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Device Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OAUTH_TOKEN__DEVICE_ID = TIMESTAMP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>User</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OAUTH_TOKEN__USER = TIMESTAMP_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>OAuth Token</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OAUTH_TOKEN_FEATURE_COUNT = TIMESTAMP_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__TIMESTAMP = ABSTRACT_ITEM__TIMESTAMP;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__ID = ABSTRACT_ITEM__ID;

  /**
   * The feature id for the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__TAG = ABSTRACT_ITEM__TAG;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__NAME = ABSTRACT_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name fr FR</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__NAME_FR_FR = ABSTRACT_ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Owned Category Pkgs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__OWNED_CATEGORY_PKGS = ABSTRACT_ITEM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Owned Categories</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__OWNED_CATEGORIES = ABSTRACT_ITEM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Owned Item Pkgs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__OWNED_ITEM_PKGS = ABSTRACT_ITEM_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Owned Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__OWNED_ITEMS = ABSTRACT_ITEM_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Owned Screen Pkgs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__OWNED_SCREEN_PKGS = ABSTRACT_ITEM_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Owned Screens</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__OWNED_SCREENS = ABSTRACT_ITEM_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Owned Jobs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__OWNED_JOBS = ABSTRACT_ITEM_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Owned Job Pkgs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__OWNED_JOB_PKGS = ABSTRACT_ITEM_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Owned Requests</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__OWNED_REQUESTS = ABSTRACT_ITEM_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Owned Request Pkgs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__OWNED_REQUEST_PKGS = ABSTRACT_ITEM_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Owned Schemas</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__OWNED_SCHEMAS = ABSTRACT_ITEM_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Owned Homes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__OWNED_HOMES = ABSTRACT_ITEM_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__CATEGORY = ABSTRACT_ITEM_FEATURE_COUNT + 14;

  /**
   * The feature id for the '<em><b>Schema</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__SCHEMA = ABSTRACT_ITEM_FEATURE_COUNT + 15;

  /**
   * The feature id for the '<em><b>Server Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__SERVER_URL = ABSTRACT_ITEM_FEATURE_COUNT + 16;

  /**
   * The number of structural features of the '<em>Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_FEATURE_COUNT = ABSTRACT_ITEM_FEATURE_COUNT + 17;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_PKG__TIMESTAMP = ABSTRACT_ITEM__TIMESTAMP;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_PKG__ID = ABSTRACT_ITEM__ID;

  /**
   * The feature id for the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_PKG__TAG = ABSTRACT_ITEM__TAG;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_PKG__NAME = ABSTRACT_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name fr FR</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_PKG__NAME_FR_FR = ABSTRACT_ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Owned Schemas</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_PKG__OWNED_SCHEMAS = ABSTRACT_ITEM_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Schema Pkg</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_PKG_FEATURE_COUNT = ABSTRACT_ITEM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA__TIMESTAMP = ABSTRACT_ITEM__TIMESTAMP;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA__ID = ABSTRACT_ITEM__ID;

  /**
   * The feature id for the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA__TAG = ABSTRACT_ITEM__TAG;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA__NAME = ABSTRACT_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name fr FR</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA__NAME_FR_FR = ABSTRACT_ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Db Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA__DB_NAME = ABSTRACT_ITEM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Owned Tables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA__OWNED_TABLES = ABSTRACT_ITEM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Db Schema</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA__DB_SCHEMA = ABSTRACT_ITEM_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA__NAMESPACE = ABSTRACT_ITEM_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Owned Classes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA__OWNED_CLASSES = ABSTRACT_ITEM_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Schema</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_FEATURE_COUNT = ABSTRACT_ITEM_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Clazz</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_CLASS__CLAZZ = 0;

  /**
   * The feature id for the '<em><b>Table</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_CLASS__TABLE = 1;

  /**
   * The feature id for the '<em><b>External Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_CLASS__EXTERNAL_FEATURES = 2;

  /**
   * The number of structural features of the '<em>Schema Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_CLASS_FEATURE_COUNT = 3;

  /**
   * The feature id for the '<em><b>Table</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_FEATURE__TABLE = 0;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_FEATURE__FEATURE = 1;

  /**
   * The number of structural features of the '<em>Schema Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_FEATURE_FEATURE_COUNT = 2;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST_PKG__TIMESTAMP = ABSTRACT_ITEM__TIMESTAMP;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST_PKG__ID = ABSTRACT_ITEM__ID;

  /**
   * The feature id for the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST_PKG__TAG = ABSTRACT_ITEM__TAG;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST_PKG__NAME = ABSTRACT_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name fr FR</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST_PKG__NAME_FR_FR = ABSTRACT_ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Owned Requests</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST_PKG__OWNED_REQUESTS = ABSTRACT_ITEM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Owned Request Pkgs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST_PKG__OWNED_REQUEST_PKGS = ABSTRACT_ITEM_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Request Pkg</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST_PKG_FEATURE_COUNT = ABSTRACT_ITEM_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST__TIMESTAMP = ABSTRACT_ITEM__TIMESTAMP;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST__ID = ABSTRACT_ITEM__ID;

  /**
   * The feature id for the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST__TAG = ABSTRACT_ITEM__TAG;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST__NAME = ABSTRACT_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name fr FR</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST__NAME_FR_FR = ABSTRACT_ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Owned Triggers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST__OWNED_TRIGGERS = ABSTRACT_ITEM_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Request</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST_FEATURE_COUNT = ABSTRACT_ITEM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOB_PKG__TIMESTAMP = ABSTRACT_ITEM__TIMESTAMP;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOB_PKG__ID = ABSTRACT_ITEM__ID;

  /**
   * The feature id for the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOB_PKG__TAG = ABSTRACT_ITEM__TAG;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOB_PKG__NAME = ABSTRACT_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name fr FR</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOB_PKG__NAME_FR_FR = ABSTRACT_ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Owned Jobs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOB_PKG__OWNED_JOBS = ABSTRACT_ITEM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Owned Job Pkgs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOB_PKG__OWNED_JOB_PKGS = ABSTRACT_ITEM_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Job Pkg</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOB_PKG_FEATURE_COUNT = ABSTRACT_ITEM_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOB__TIMESTAMP = ABSTRACT_ITEM__TIMESTAMP;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOB__ID = ABSTRACT_ITEM__ID;

  /**
   * The feature id for the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOB__TAG = ABSTRACT_ITEM__TAG;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOB__NAME = ABSTRACT_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name fr FR</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOB__NAME_FR_FR = ABSTRACT_ITEM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Job</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOB_FEATURE_COUNT = ABSTRACT_ITEM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.pdulvp.data.impl.TriggerImpl <em>Trigger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.data.impl.TriggerImpl
   * @see org.pdulvp.data.impl.DataPackageImpl#getTrigger()
   * @generated
   */
  int TRIGGER = 35;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER__TIMESTAMP = ABSTRACT_ITEM__TIMESTAMP;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER__ID = ABSTRACT_ITEM__ID;

  /**
   * The feature id for the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER__TAG = ABSTRACT_ITEM__TAG;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER__NAME = ABSTRACT_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name fr FR</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER__NAME_FR_FR = ABSTRACT_ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Schedule</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER__SCHEDULE = ABSTRACT_ITEM_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Trigger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER_FEATURE_COUNT = ABSTRACT_ITEM_FEATURE_COUNT + 3;

  /**
   * Returns the meta object for class '{@link org.pdulvp.data.ItemRoot <em>Item Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Item Root</em>'.
   * @see org.pdulvp.data.ItemRoot
   * @generated
   */
  EClass getItemRoot();

  /**
   * Returns the meta object for the containment reference list '{@link org.pdulvp.data.ItemRoot#getOwnedApplications <em>Owned Applications</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Applications</em>'.
   * @see org.pdulvp.data.ItemRoot#getOwnedApplications()
   * @see #getItemRoot()
   * @generated
   */
  EReference getItemRoot_OwnedApplications();

  /**
   * Returns the meta object for the containment reference list '{@link org.pdulvp.data.ItemRoot#getOwnedScreenLists <em>Owned Screen Lists</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Screen Lists</em>'.
   * @see org.pdulvp.data.ItemRoot#getOwnedScreenLists()
   * @see #getItemRoot()
   * @generated
   */
  EReference getItemRoot_OwnedScreenLists();

  /**
   * Returns the meta object for the containment reference list '{@link org.pdulvp.data.ItemRoot#getOwnedItemTypes <em>Owned Item Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Item Types</em>'.
   * @see org.pdulvp.data.ItemRoot#getOwnedItemTypes()
   * @see #getItemRoot()
   * @generated
   */
  EReference getItemRoot_OwnedItemTypes();

  /**
   * Returns the meta object for class '{@link org.pdulvp.data.ItemPkg <em>Item Pkg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Item Pkg</em>'.
   * @see org.pdulvp.data.ItemPkg
   * @generated
   */
  EClass getItemPkg();

  /**
   * Returns the meta object for the containment reference list '{@link org.pdulvp.data.ItemPkg#getOwnedItemPkgs <em>Owned Item Pkgs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Item Pkgs</em>'.
   * @see org.pdulvp.data.ItemPkg#getOwnedItemPkgs()
   * @see #getItemPkg()
   * @generated
   */
  EReference getItemPkg_OwnedItemPkgs();

  /**
   * Returns the meta object for the containment reference list '{@link org.pdulvp.data.ItemPkg#getOwnedItems <em>Owned Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Items</em>'.
   * @see org.pdulvp.data.ItemPkg#getOwnedItems()
   * @see #getItemPkg()
   * @generated
   */
  EReference getItemPkg_OwnedItems();

  /**
   * Returns the meta object for class '{@link org.pdulvp.data.ChildItem <em>Child Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Child Item</em>'.
   * @see org.pdulvp.data.ChildItem
   * @generated
   */
  EClass getChildItem();

  /**
   * Returns the meta object for the reference list '{@link org.pdulvp.data.ChildItem#getCategories <em>Categories</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Categories</em>'.
   * @see org.pdulvp.data.ChildItem#getCategories()
   * @see #getChildItem()
   * @generated
   */
  EReference getChildItem_Categories();

  /**
   * Returns the meta object for class '{@link org.pdulvp.data.ScreenPkg <em>Screen Pkg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Screen Pkg</em>'.
   * @see org.pdulvp.data.ScreenPkg
   * @generated
   */
  EClass getScreenPkg();

  /**
   * Returns the meta object for the containment reference list '{@link org.pdulvp.data.ScreenPkg#getOwnedScreenPkgs <em>Owned Screen Pkgs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Screen Pkgs</em>'.
   * @see org.pdulvp.data.ScreenPkg#getOwnedScreenPkgs()
   * @see #getScreenPkg()
   * @generated
   */
  EReference getScreenPkg_OwnedScreenPkgs();

  /**
   * Returns the meta object for the containment reference list '{@link org.pdulvp.data.ScreenPkg#getOwnedScreens <em>Owned Screens</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Screens</em>'.
   * @see org.pdulvp.data.ScreenPkg#getOwnedScreens()
   * @see #getScreenPkg()
   * @generated
   */
  EReference getScreenPkg_OwnedScreens();

  /**
   * Returns the meta object for class '{@link org.pdulvp.data.CategoryPkg <em>Category Pkg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Category Pkg</em>'.
   * @see org.pdulvp.data.CategoryPkg
   * @generated
   */
  EClass getCategoryPkg();

  /**
   * Returns the meta object for the containment reference list '{@link org.pdulvp.data.CategoryPkg#getOwnedCategoryPkgs <em>Owned Category Pkgs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Category Pkgs</em>'.
   * @see org.pdulvp.data.CategoryPkg#getOwnedCategoryPkgs()
   * @see #getCategoryPkg()
   * @generated
   */
  EReference getCategoryPkg_OwnedCategoryPkgs();

  /**
   * Returns the meta object for the containment reference list '{@link org.pdulvp.data.CategoryPkg#getOwnedCategories <em>Owned Categories</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Categories</em>'.
   * @see org.pdulvp.data.CategoryPkg#getOwnedCategories()
   * @see #getCategoryPkg()
   * @generated
   */
  EReference getCategoryPkg_OwnedCategories();

  /**
   * Returns the meta object for class '{@link org.pdulvp.data.ProductPkg <em>Product Pkg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Product Pkg</em>'.
   * @see org.pdulvp.data.ProductPkg
   * @generated
   */
  EClass getProductPkg();

  /**
   * Returns the meta object for the containment reference list '{@link org.pdulvp.data.ProductPkg#getOwnedProductPkgs <em>Owned Product Pkgs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Product Pkgs</em>'.
   * @see org.pdulvp.data.ProductPkg#getOwnedProductPkgs()
   * @see #getProductPkg()
   * @generated
   */
  EReference getProductPkg_OwnedProductPkgs();

  /**
   * Returns the meta object for the containment reference list '{@link org.pdulvp.data.ProductPkg#getOwnedProducts <em>Owned Products</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Products</em>'.
   * @see org.pdulvp.data.ProductPkg#getOwnedProducts()
   * @see #getProductPkg()
   * @generated
   */
  EReference getProductPkg_OwnedProducts();

  /**
   * Returns the meta object for class '{@link org.pdulvp.data.ItemTypePkg <em>Item Type Pkg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Item Type Pkg</em>'.
   * @see org.pdulvp.data.ItemTypePkg
   * @generated
   */
  EClass getItemTypePkg();

  /**
   * Returns the meta object for the containment reference list '{@link org.pdulvp.data.ItemTypePkg#getOwnedTypePkgs <em>Owned Type Pkgs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Type Pkgs</em>'.
   * @see org.pdulvp.data.ItemTypePkg#getOwnedTypePkgs()
   * @see #getItemTypePkg()
   * @generated
   */
  EReference getItemTypePkg_OwnedTypePkgs();

  /**
   * Returns the meta object for the containment reference list '{@link org.pdulvp.data.ItemTypePkg#getOwnedTypes <em>Owned Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Types</em>'.
   * @see org.pdulvp.data.ItemTypePkg#getOwnedTypes()
   * @see #getItemTypePkg()
   * @generated
   */
  EReference getItemTypePkg_OwnedTypes();

  /**
   * Returns the meta object for class '{@link org.pdulvp.data.Timestamp <em>Timestamp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Timestamp</em>'.
   * @see org.pdulvp.data.Timestamp
   * @generated
   */
  EClass getTimestamp();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.Timestamp#getTimestamp <em>Timestamp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Timestamp</em>'.
   * @see org.pdulvp.data.Timestamp#getTimestamp()
   * @see #getTimestamp()
   * @generated
   */
  EAttribute getTimestamp_Timestamp();

  /**
   * Returns the meta object for class '{@link org.pdulvp.data.AbstractItem <em>Abstract Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Item</em>'.
   * @see org.pdulvp.data.AbstractItem
   * @generated
   */
  EClass getAbstractItem();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.AbstractItem#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.pdulvp.data.AbstractItem#getId()
   * @see #getAbstractItem()
   * @generated
   */
  EAttribute getAbstractItem_Id();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.AbstractItem#getTag <em>Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tag</em>'.
   * @see org.pdulvp.data.AbstractItem#getTag()
   * @see #getAbstractItem()
   * @generated
   */
  EAttribute getAbstractItem_Tag();

  /**
   * Returns the meta object for class '{@link org.pdulvp.data.NamedItem <em>Named Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Item</em>'.
   * @see org.pdulvp.data.NamedItem
   * @generated
   */
  EClass getNamedItem();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.NamedItem#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.pdulvp.data.NamedItem#getName()
   * @see #getNamedItem()
   * @generated
   */
  EAttribute getNamedItem_Name();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.NamedItem#getName_frFR <em>Name fr FR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name fr FR</em>'.
   * @see org.pdulvp.data.NamedItem#getName_frFR()
   * @see #getNamedItem()
   * @generated
   */
  EAttribute getNamedItem_Name_frFR();

  /**
   * Returns the meta object for class '{@link org.pdulvp.data.Category <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Category</em>'.
   * @see org.pdulvp.data.Category
   * @generated
   */
  EClass getCategory();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.Category#isVisible <em>Visible</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visible</em>'.
   * @see org.pdulvp.data.Category#isVisible()
   * @see #getCategory()
   * @generated
   */
  EAttribute getCategory_Visible();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.Category#isInapp <em>Inapp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inapp</em>'.
   * @see org.pdulvp.data.Category#isInapp()
   * @see #getCategory()
   * @generated
   */
  EAttribute getCategory_Inapp();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.Category#getInappDescription <em>Inapp Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inapp Description</em>'.
   * @see org.pdulvp.data.Category#getInappDescription()
   * @see #getCategory()
   * @generated
   */
  EAttribute getCategory_InappDescription();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.Category#getInappTitle <em>Inapp Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inapp Title</em>'.
   * @see org.pdulvp.data.Category#getInappTitle()
   * @see #getCategory()
   * @generated
   */
  EAttribute getCategory_InappTitle();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.Category#getPrice <em>Price</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Price</em>'.
   * @see org.pdulvp.data.Category#getPrice()
   * @see #getCategory()
   * @generated
   */
  EAttribute getCategory_Price();

  /**
   * Returns the meta object for the reference '{@link org.pdulvp.data.Category#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent</em>'.
   * @see org.pdulvp.data.Category#getParent()
   * @see #getCategory()
   * @generated
   */
  EReference getCategory_Parent();

  /**
   * Returns the meta object for the containment reference list '{@link org.pdulvp.data.Category#getOwnedCategories <em>Owned Categories</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Categories</em>'.
   * @see org.pdulvp.data.Category#getOwnedCategories()
   * @see #getCategory()
   * @generated
   */
  EReference getCategory_OwnedCategories();

  /**
   * Returns the meta object for the reference list '{@link org.pdulvp.data.Category#getScreens <em>Screens</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Screens</em>'.
   * @see org.pdulvp.data.Category#getScreens()
   * @see #getCategory()
   * @generated
   */
  EReference getCategory_Screens();

  /**
   * Returns the meta object for class '{@link org.pdulvp.data.ImageItem <em>Image Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Image Item</em>'.
   * @see org.pdulvp.data.ImageItem
   * @generated
   */
  EClass getImageItem();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.ImageItem#getSourcePath <em>Source Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source Path</em>'.
   * @see org.pdulvp.data.ImageItem#getSourcePath()
   * @see #getImageItem()
   * @generated
   */
  EAttribute getImageItem_SourcePath();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.ImageItem#getDateCreated <em>Date Created</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Date Created</em>'.
   * @see org.pdulvp.data.ImageItem#getDateCreated()
   * @see #getImageItem()
   * @generated
   */
  EAttribute getImageItem_DateCreated();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.ImageItem#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Style</em>'.
   * @see org.pdulvp.data.ImageItem#getStyle()
   * @see #getImageItem()
   * @generated
   */
  EAttribute getImageItem_Style();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.ImageItem#getGImageDataPath <em>GImage Data Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>GImage Data Path</em>'.
   * @see org.pdulvp.data.ImageItem#getGImageDataPath()
   * @see #getImageItem()
   * @generated
   */
  EAttribute getImageItem_GImageDataPath();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.ImageItem#getGIconDataPath <em>GIcon Data Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>GIcon Data Path</em>'.
   * @see org.pdulvp.data.ImageItem#getGIconDataPath()
   * @see #getImageItem()
   * @generated
   */
  EAttribute getImageItem_GIconDataPath();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.ImageItem#getGIcon16Path <em>GIcon16 Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>GIcon16 Path</em>'.
   * @see org.pdulvp.data.ImageItem#getGIcon16Path()
   * @see #getImageItem()
   * @generated
   */
  EAttribute getImageItem_GIcon16Path();

  /**
   * Returns the meta object for the reference '{@link org.pdulvp.data.ImageItem#getGType <em>GType</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>GType</em>'.
   * @see org.pdulvp.data.ImageItem#getGType()
   * @see #getImageItem()
   * @generated
   */
  EReference getImageItem_GType();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.ImageItem#getIconData <em>Icon Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Icon Data</em>'.
   * @see org.pdulvp.data.ImageItem#getIconData()
   * @see #getImageItem()
   * @generated
   */
  EAttribute getImageItem_IconData();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.ImageItem#getImageData <em>Image Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Image Data</em>'.
   * @see org.pdulvp.data.ImageItem#getImageData()
   * @see #getImageItem()
   * @generated
   */
  EAttribute getImageItem_ImageData();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.ImageItem#getRank <em>Rank</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rank</em>'.
   * @see org.pdulvp.data.ImageItem#getRank()
   * @see #getImageItem()
   * @generated
   */
  EAttribute getImageItem_Rank();

  /**
   * Returns the meta object for the containment reference '{@link org.pdulvp.data.ImageItem#getMetadatas <em>Metadatas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Metadatas</em>'.
   * @see org.pdulvp.data.ImageItem#getMetadatas()
   * @see #getImageItem()
   * @generated
   */
  EReference getImageItem_Metadatas();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.ImageItem#getExternalPath <em>External Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>External Path</em>'.
   * @see org.pdulvp.data.ImageItem#getExternalPath()
   * @see #getImageItem()
   * @generated
   */
  EAttribute getImageItem_ExternalPath();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.ImageItem#getPacks <em>Packs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Packs</em>'.
   * @see org.pdulvp.data.ImageItem#getPacks()
   * @see #getImageItem()
   * @generated
   */
  EAttribute getImageItem_Packs();

  /**
   * Returns the meta object for the reference list '{@link org.pdulvp.data.ImageItem#getProducts <em>Products</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Products</em>'.
   * @see org.pdulvp.data.ImageItem#getProducts()
   * @see #getImageItem()
   * @generated
   */
  EReference getImageItem_Products();

  /**
   * Returns the meta object for class '{@link org.pdulvp.data.Item <em>Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Item</em>'.
   * @see org.pdulvp.data.Item
   * @generated
   */
  EClass getItem();

  /**
   * Returns the meta object for class '{@link org.pdulvp.data.Screen <em>Screen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Screen</em>'.
   * @see org.pdulvp.data.Screen
   * @generated
   */
  EClass getScreen();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.Screen#getOrdering <em>Ordering</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ordering</em>'.
   * @see org.pdulvp.data.Screen#getOrdering()
   * @see #getScreen()
   * @generated
   */
  EAttribute getScreen_Ordering();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.Screen#getFiltering <em>Filtering</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Filtering</em>'.
   * @see org.pdulvp.data.Screen#getFiltering()
   * @see #getScreen()
   * @generated
   */
  EAttribute getScreen_Filtering();

  /**
   * Returns the meta object for class '{@link org.pdulvp.data.User <em>User</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>User</em>'.
   * @see org.pdulvp.data.User
   * @generated
   */
  EClass getUser();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.User#getMail <em>Mail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mail</em>'.
   * @see org.pdulvp.data.User#getMail()
   * @see #getUser()
   * @generated
   */
  EAttribute getUser_Mail();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.User#getPassword <em>Password</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Password</em>'.
   * @see org.pdulvp.data.User#getPassword()
   * @see #getUser()
   * @generated
   */
  EAttribute getUser_Password();

  /**
   * Returns the meta object for the reference list '{@link org.pdulvp.data.User#getFavouriteCategories <em>Favourite Categories</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Favourite Categories</em>'.
   * @see org.pdulvp.data.User#getFavouriteCategories()
   * @see #getUser()
   * @generated
   */
  EReference getUser_FavouriteCategories();

  /**
   * Returns the meta object for the reference list '{@link org.pdulvp.data.User#getFavouriteItems <em>Favourite Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Favourite Items</em>'.
   * @see org.pdulvp.data.User#getFavouriteItems()
   * @see #getUser()
   * @generated
   */
  EReference getUser_FavouriteItems();

  /**
   * Returns the meta object for the reference list '{@link org.pdulvp.data.User#getClickedItems <em>Clicked Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Clicked Items</em>'.
   * @see org.pdulvp.data.User#getClickedItems()
   * @see #getUser()
   * @generated
   */
  EReference getUser_ClickedItems();

  /**
   * Returns the meta object for the reference list '{@link org.pdulvp.data.User#getWidgetedItems <em>Widgeted Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Widgeted Items</em>'.
   * @see org.pdulvp.data.User#getWidgetedItems()
   * @see #getUser()
   * @generated
   */
  EReference getUser_WidgetedItems();

  /**
   * Returns the meta object for the attribute list '{@link org.pdulvp.data.User#getGcm <em>Gcm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Gcm</em>'.
   * @see org.pdulvp.data.User#getGcm()
   * @see #getUser()
   * @generated
   */
  EAttribute getUser_Gcm();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.User#getIdentifiers <em>Identifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifiers</em>'.
   * @see org.pdulvp.data.User#getIdentifiers()
   * @see #getUser()
   * @generated
   */
  EAttribute getUser_Identifiers();

  /**
   * Returns the meta object for class '{@link org.pdulvp.data.ScreenList <em>Screen List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Screen List</em>'.
   * @see org.pdulvp.data.ScreenList
   * @generated
   */
  EClass getScreenList();

  /**
   * Returns the meta object for the reference '{@link org.pdulvp.data.ScreenList#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Category</em>'.
   * @see org.pdulvp.data.ScreenList#getCategory()
   * @see #getScreenList()
   * @generated
   */
  EReference getScreenList_Category();

  /**
   * Returns the meta object for the reference '{@link org.pdulvp.data.ScreenList#getScreen <em>Screen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Screen</em>'.
   * @see org.pdulvp.data.ScreenList#getScreen()
   * @see #getScreenList()
   * @generated
   */
  EReference getScreenList_Screen();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.ScreenList#getIconData <em>Icon Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Icon Data</em>'.
   * @see org.pdulvp.data.ScreenList#getIconData()
   * @see #getScreenList()
   * @generated
   */
  EAttribute getScreenList_IconData();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.ScreenList#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Style</em>'.
   * @see org.pdulvp.data.ScreenList#getStyle()
   * @see #getScreenList()
   * @generated
   */
	EAttribute getScreenList_Style();

		/**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.ScreenList#getPacks <em>Packs</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Packs</em>'.
   * @see org.pdulvp.data.ScreenList#getPacks()
   * @see #getScreenList()
   * @generated
   */
	EAttribute getScreenList_Packs();

		/**
   * Returns the meta object for class '{@link org.pdulvp.data.HomeScreenList <em>Home Screen List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Home Screen List</em>'.
   * @see org.pdulvp.data.HomeScreenList
   * @generated
   */
  EClass getHomeScreenList();

  /**
   * Returns the meta object for the reference '{@link org.pdulvp.data.HomeScreenList#getApplication <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Application</em>'.
   * @see org.pdulvp.data.HomeScreenList#getApplication()
   * @see #getHomeScreenList()
   * @generated
   */
  EReference getHomeScreenList_Application();

  /**
   * Returns the meta object for class '{@link org.pdulvp.data.CategoryView <em>Category View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Category View</em>'.
   * @see org.pdulvp.data.CategoryView
   * @generated
   */
  EClass getCategoryView();

  /**
   * Returns the meta object for the reference '{@link org.pdulvp.data.CategoryView#getScreensIds <em>Screens Ids</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Screens Ids</em>'.
   * @see org.pdulvp.data.CategoryView#getScreensIds()
   * @see #getCategoryView()
   * @generated
   */
  EReference getCategoryView_ScreensIds();

  /**
   * Returns the meta object for the reference '{@link org.pdulvp.data.CategoryView#getScreensNames <em>Screens Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Screens Names</em>'.
   * @see org.pdulvp.data.CategoryView#getScreensNames()
   * @see #getCategoryView()
   * @generated
   */
  EReference getCategoryView_ScreensNames();

  /**
   * Returns the meta object for class '{@link org.pdulvp.data.FavouriteItemsView <em>Favourite Items View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Favourite Items View</em>'.
   * @see org.pdulvp.data.FavouriteItemsView
   * @generated
   */
  EClass getFavouriteItemsView();

  /**
   * Returns the meta object for the reference '{@link org.pdulvp.data.FavouriteItemsView#getUser <em>User</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>User</em>'.
   * @see org.pdulvp.data.FavouriteItemsView#getUser()
   * @see #getFavouriteItemsView()
   * @generated
   */
  EReference getFavouriteItemsView_User();

  /**
   * Returns the meta object for class '{@link org.pdulvp.data.FavouriteCategoriesView <em>Favourite Categories View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Favourite Categories View</em>'.
   * @see org.pdulvp.data.FavouriteCategoriesView
   * @generated
   */
  EClass getFavouriteCategoriesView();

  /**
   * Returns the meta object for the reference '{@link org.pdulvp.data.FavouriteCategoriesView#getUser <em>User</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>User</em>'.
   * @see org.pdulvp.data.FavouriteCategoriesView#getUser()
   * @see #getFavouriteCategoriesView()
   * @generated
   */
  EReference getFavouriteCategoriesView_User();

  /**
   * Returns the meta object for class '{@link org.pdulvp.data.OAuthToken <em>OAuth Token</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>OAuth Token</em>'.
   * @see org.pdulvp.data.OAuthToken
   * @generated
   */
  EClass getOAuthToken();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.OAuthToken#getTokenId <em>Token Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Token Id</em>'.
   * @see org.pdulvp.data.OAuthToken#getTokenId()
   * @see #getOAuthToken()
   * @generated
   */
  EAttribute getOAuthToken_TokenId();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.OAuthToken#getDeviceId <em>Device Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Id</em>'.
   * @see org.pdulvp.data.OAuthToken#getDeviceId()
   * @see #getOAuthToken()
   * @generated
   */
  EAttribute getOAuthToken_DeviceId();

  /**
   * Returns the meta object for the reference '{@link org.pdulvp.data.OAuthToken#getUser <em>User</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>User</em>'.
   * @see org.pdulvp.data.OAuthToken#getUser()
   * @see #getOAuthToken()
   * @generated
   */
  EReference getOAuthToken_User();

  /**
   * Returns the meta object for class '{@link org.pdulvp.data.ItemType <em>Item Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Item Type</em>'.
   * @see org.pdulvp.data.ItemType
   * @generated
   */
  EClass getItemType();

  /**
   * Returns the meta object for class '{@link org.pdulvp.data.Metadatas <em>Metadatas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Metadatas</em>'.
   * @see org.pdulvp.data.Metadatas
   * @generated
   */
  EClass getMetadatas();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.Metadatas#getAuthor_name <em>Author name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Author name</em>'.
   * @see org.pdulvp.data.Metadatas#getAuthor_name()
   * @see #getMetadatas()
   * @generated
   */
  EAttribute getMetadatas_Author_name();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.Metadatas#getAuthor_email <em>Author email</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Author email</em>'.
   * @see org.pdulvp.data.Metadatas#getAuthor_email()
   * @see #getMetadatas()
   * @generated
   */
  EAttribute getMetadatas_Author_email();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.Metadatas#getLicence <em>Licence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Licence</em>'.
   * @see org.pdulvp.data.Metadatas#getLicence()
   * @see #getMetadatas()
   * @generated
   */
  EAttribute getMetadatas_Licence();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.Metadatas#getCategory_name <em>Category name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Category name</em>'.
   * @see org.pdulvp.data.Metadatas#getCategory_name()
   * @see #getMetadatas()
   * @generated
   */
  EAttribute getMetadatas_Category_name();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.Metadatas#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see org.pdulvp.data.Metadatas#getVersion()
   * @see #getMetadatas()
   * @generated
   */
  EAttribute getMetadatas_Version();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.Metadatas#getDownload <em>Download</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Download</em>'.
   * @see org.pdulvp.data.Metadatas#getDownload()
   * @see #getMetadatas()
   * @generated
   */
  EAttribute getMetadatas_Download();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.Metadatas#getRate <em>Rate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rate</em>'.
   * @see org.pdulvp.data.Metadatas#getRate()
   * @see #getMetadatas()
   * @generated
   */
  EAttribute getMetadatas_Rate();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.Metadatas#getNews <em>News</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>News</em>'.
   * @see org.pdulvp.data.Metadatas#getNews()
   * @see #getMetadatas()
   * @generated
   */
  EAttribute getMetadatas_News();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.Metadatas#getDate <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Date</em>'.
   * @see org.pdulvp.data.Metadatas#getDate()
   * @see #getMetadatas()
   * @generated
   */
  EAttribute getMetadatas_Date();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.Metadatas#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see org.pdulvp.data.Metadatas#getSize()
   * @see #getMetadatas()
   * @generated
   */
  EAttribute getMetadatas_Size();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.Metadatas#getPrice <em>Price</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Price</em>'.
   * @see org.pdulvp.data.Metadatas#getPrice()
   * @see #getMetadatas()
   * @generated
   */
  EAttribute getMetadatas_Price();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.Metadatas#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source</em>'.
   * @see org.pdulvp.data.Metadatas#getSource()
   * @see #getMetadatas()
   * @generated
   */
  EAttribute getMetadatas_Source();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.Metadatas#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.pdulvp.data.Metadatas#getName()
   * @see #getMetadatas()
   * @generated
   */
  EAttribute getMetadatas_Name();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.Metadatas#getName_frFR <em>Name fr FR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name fr FR</em>'.
   * @see org.pdulvp.data.Metadatas#getName_frFR()
   * @see #getMetadatas()
   * @generated
   */
  EAttribute getMetadatas_Name_frFR();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.Metadatas#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.pdulvp.data.Metadatas#getDescription()
   * @see #getMetadatas()
   * @generated
   */
  EAttribute getMetadatas_Description();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.Metadatas#getDescription_frFR <em>Description fr FR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description fr FR</em>'.
   * @see org.pdulvp.data.Metadatas#getDescription_frFR()
   * @see #getMetadatas()
   * @generated
   */
  EAttribute getMetadatas_Description_frFR();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.Metadatas#getShortDescription <em>Short Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Short Description</em>'.
   * @see org.pdulvp.data.Metadatas#getShortDescription()
   * @see #getMetadatas()
   * @generated
   */
  EAttribute getMetadatas_ShortDescription();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.Metadatas#getMapsUri <em>Maps Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Maps Uri</em>'.
   * @see org.pdulvp.data.Metadatas#getMapsUri()
   * @see #getMetadatas()
   * @generated
   */
  EAttribute getMetadatas_MapsUri();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.Metadatas#getImage_mainUri <em>Image main Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Image main Uri</em>'.
   * @see org.pdulvp.data.Metadatas#getImage_mainUri()
   * @see #getMetadatas()
   * @generated
   */
  EAttribute getMetadatas_Image_mainUri();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.Metadatas#getImage_preview2Uri <em>Image preview2 Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Image preview2 Uri</em>'.
   * @see org.pdulvp.data.Metadatas#getImage_preview2Uri()
   * @see #getMetadatas()
   * @generated
   */
  EAttribute getMetadatas_Image_preview2Uri();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.Metadatas#getSiteUri <em>Site Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Site Uri</em>'.
   * @see org.pdulvp.data.Metadatas#getSiteUri()
   * @see #getMetadatas()
   * @generated
   */
  EAttribute getMetadatas_SiteUri();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.Metadatas#getTripAdvisorUri <em>Trip Advisor Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Trip Advisor Uri</em>'.
   * @see org.pdulvp.data.Metadatas#getTripAdvisorUri()
   * @see #getMetadatas()
   * @generated
   */
  EAttribute getMetadatas_TripAdvisorUri();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.Metadatas#getChart <em>Chart</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Chart</em>'.
   * @see org.pdulvp.data.Metadatas#getChart()
   * @see #getMetadatas()
   * @generated
   */
  EAttribute getMetadatas_Chart();

  /**
   * Returns the meta object for class '{@link org.pdulvp.data.HomeItem <em>Home Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Home Item</em>'.
   * @see org.pdulvp.data.HomeItem
   * @generated
   */
  EClass getHomeItem();

  /**
   * Returns the meta object for the reference '{@link org.pdulvp.data.HomeItem#getApplication <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Application</em>'.
   * @see org.pdulvp.data.HomeItem#getApplication()
   * @see #getHomeItem()
   * @generated
   */
  EReference getHomeItem_Application();

  /**
   * Returns the meta object for the reference '{@link org.pdulvp.data.HomeItem#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Category</em>'.
   * @see org.pdulvp.data.HomeItem#getCategory()
   * @see #getHomeItem()
   * @generated
   */
  EReference getHomeItem_Category();

  /**
   * Returns the meta object for class '{@link org.pdulvp.data.Application <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application</em>'.
   * @see org.pdulvp.data.Application
   * @generated
   */
  EClass getApplication();

  /**
   * Returns the meta object for the containment reference list '{@link org.pdulvp.data.Application#getOwnedHomes <em>Owned Homes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Homes</em>'.
   * @see org.pdulvp.data.Application#getOwnedHomes()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_OwnedHomes();

  /**
   * Returns the meta object for the reference '{@link org.pdulvp.data.Application#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Category</em>'.
   * @see org.pdulvp.data.Application#getCategory()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_Category();

  /**
   * Returns the meta object for the reference '{@link org.pdulvp.data.Application#getSchema <em>Schema</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Schema</em>'.
   * @see org.pdulvp.data.Application#getSchema()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_Schema();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.Application#getServerUrl <em>Server Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Server Url</em>'.
   * @see org.pdulvp.data.Application#getServerUrl()
   * @see #getApplication()
   * @generated
   */
  EAttribute getApplication_ServerUrl();

  /**
   * Returns the meta object for class '{@link org.pdulvp.data.SchemaPkg <em>Schema Pkg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Schema Pkg</em>'.
   * @see org.pdulvp.data.SchemaPkg
   * @generated
   */
  EClass getSchemaPkg();

  /**
   * Returns the meta object for the containment reference list '{@link org.pdulvp.data.SchemaPkg#getOwnedSchemas <em>Owned Schemas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Schemas</em>'.
   * @see org.pdulvp.data.SchemaPkg#getOwnedSchemas()
   * @see #getSchemaPkg()
   * @generated
   */
  EReference getSchemaPkg_OwnedSchemas();

  /**
   * Returns the meta object for class '{@link org.pdulvp.data.Product <em>Product</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Product</em>'.
   * @see org.pdulvp.data.Product
   * @generated
   */
  EClass getProduct();

  /**
   * Returns the meta object for the containment reference list '{@link org.pdulvp.data.Product#getOwnedProducts <em>Owned Products</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Products</em>'.
   * @see org.pdulvp.data.Product#getOwnedProducts()
   * @see #getProduct()
   * @generated
   */
  EReference getProduct_OwnedProducts();

  /**
   * Returns the meta object for the reference '{@link org.pdulvp.data.Product#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent</em>'.
   * @see org.pdulvp.data.Product#getParent()
   * @see #getProduct()
   * @generated
   */
  EReference getProduct_Parent();

  /**
   * Returns the meta object for class '{@link org.pdulvp.data.Schema <em>Schema</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Schema</em>'.
   * @see org.pdulvp.data.Schema
   * @generated
   */
  EClass getSchema();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.Schema#getDbSchema <em>Db Schema</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Schema</em>'.
   * @see org.pdulvp.data.Schema#getDbSchema()
   * @see #getSchema()
   * @generated
   */
  EAttribute getSchema_DbSchema();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.Schema#getNamespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Namespace</em>'.
   * @see org.pdulvp.data.Schema#getNamespace()
   * @see #getSchema()
   * @generated
   */
  EAttribute getSchema_Namespace();

  /**
   * Returns the meta object for the containment reference list '{@link org.pdulvp.data.Schema#getOwnedClasses <em>Owned Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Classes</em>'.
   * @see org.pdulvp.data.Schema#getOwnedClasses()
   * @see #getSchema()
   * @generated
   */
  EReference getSchema_OwnedClasses();

  /**
   * Returns the meta object for class '{@link org.pdulvp.data.SchemaClass <em>Schema Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Schema Class</em>'.
   * @see org.pdulvp.data.SchemaClass
   * @generated
   */
  EClass getSchemaClass();

  /**
   * Returns the meta object for the reference '{@link org.pdulvp.data.SchemaClass#getClazz <em>Clazz</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Clazz</em>'.
   * @see org.pdulvp.data.SchemaClass#getClazz()
   * @see #getSchemaClass()
   * @generated
   */
  EReference getSchemaClass_Clazz();

  /**
   * Returns the meta object for the reference '{@link org.pdulvp.data.SchemaClass#getTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Table</em>'.
   * @see org.pdulvp.data.SchemaClass#getTable()
   * @see #getSchemaClass()
   * @generated
   */
  EReference getSchemaClass_Table();

  /**
   * Returns the meta object for the containment reference list '{@link org.pdulvp.data.SchemaClass#getExternalFeatures <em>External Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>External Features</em>'.
   * @see org.pdulvp.data.SchemaClass#getExternalFeatures()
   * @see #getSchemaClass()
   * @generated
   */
  EReference getSchemaClass_ExternalFeatures();

  /**
   * Returns the meta object for class '{@link org.pdulvp.data.SchemaFeature <em>Schema Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Schema Feature</em>'.
   * @see org.pdulvp.data.SchemaFeature
   * @generated
   */
  EClass getSchemaFeature();

  /**
   * Returns the meta object for the reference '{@link org.pdulvp.data.SchemaFeature#getTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Table</em>'.
   * @see org.pdulvp.data.SchemaFeature#getTable()
   * @see #getSchemaFeature()
   * @generated
   */
  EReference getSchemaFeature_Table();

  /**
   * Returns the meta object for the reference '{@link org.pdulvp.data.SchemaFeature#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feature</em>'.
   * @see org.pdulvp.data.SchemaFeature#getFeature()
   * @see #getSchemaFeature()
   * @generated
   */
  EReference getSchemaFeature_Feature();

  /**
   * Returns the meta object for class '{@link org.pdulvp.data.RequestPkg <em>Request Pkg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Request Pkg</em>'.
   * @see org.pdulvp.data.RequestPkg
   * @generated
   */
  EClass getRequestPkg();

  /**
   * Returns the meta object for the containment reference list '{@link org.pdulvp.data.RequestPkg#getOwnedRequests <em>Owned Requests</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Requests</em>'.
   * @see org.pdulvp.data.RequestPkg#getOwnedRequests()
   * @see #getRequestPkg()
   * @generated
   */
  EReference getRequestPkg_OwnedRequests();

  /**
   * Returns the meta object for the containment reference list '{@link org.pdulvp.data.RequestPkg#getOwnedRequestPkgs <em>Owned Request Pkgs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Request Pkgs</em>'.
   * @see org.pdulvp.data.RequestPkg#getOwnedRequestPkgs()
   * @see #getRequestPkg()
   * @generated
   */
  EReference getRequestPkg_OwnedRequestPkgs();

  /**
   * Returns the meta object for class '{@link org.pdulvp.data.Request <em>Request</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Request</em>'.
   * @see org.pdulvp.data.Request
   * @generated
   */
  EClass getRequest();

  /**
   * Returns the meta object for the containment reference list '{@link org.pdulvp.data.Request#getOwnedTriggers <em>Owned Triggers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Triggers</em>'.
   * @see org.pdulvp.data.Request#getOwnedTriggers()
   * @see #getRequest()
   * @generated
   */
  EReference getRequest_OwnedTriggers();

  /**
   * Returns the meta object for class '{@link org.pdulvp.data.JobPkg <em>Job Pkg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Job Pkg</em>'.
   * @see org.pdulvp.data.JobPkg
   * @generated
   */
  EClass getJobPkg();

  /**
   * Returns the meta object for the containment reference list '{@link org.pdulvp.data.JobPkg#getOwnedJobs <em>Owned Jobs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Jobs</em>'.
   * @see org.pdulvp.data.JobPkg#getOwnedJobs()
   * @see #getJobPkg()
   * @generated
   */
  EReference getJobPkg_OwnedJobs();

  /**
   * Returns the meta object for the containment reference list '{@link org.pdulvp.data.JobPkg#getOwnedJobPkgs <em>Owned Job Pkgs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Job Pkgs</em>'.
   * @see org.pdulvp.data.JobPkg#getOwnedJobPkgs()
   * @see #getJobPkg()
   * @generated
   */
  EReference getJobPkg_OwnedJobPkgs();

  /**
   * Returns the meta object for class '{@link org.pdulvp.data.Job <em>Job</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Job</em>'.
   * @see org.pdulvp.data.Job
   * @generated
   */
  EClass getJob();

  /**
   * Returns the meta object for class '{@link org.pdulvp.data.Trigger <em>Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trigger</em>'.
   * @see org.pdulvp.data.Trigger
   * @generated
   */
  EClass getTrigger();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.data.Trigger#getSchedule <em>Schedule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Schedule</em>'.
   * @see org.pdulvp.data.Trigger#getSchedule()
   * @see #getTrigger()
   * @generated
   */
  EAttribute getTrigger_Schedule();

  /**
   * Returns the meta object for class '{@link org.pdulvp.data.ItemProduct <em>Item Product</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Item Product</em>'.
   * @see org.pdulvp.data.ItemProduct
   * @generated
   */
  EClass getItemProduct();

  /**
   * Returns the meta object for the reference '{@link org.pdulvp.data.ItemProduct#getItem <em>Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Item</em>'.
   * @see org.pdulvp.data.ItemProduct#getItem()
   * @see #getItemProduct()
   * @generated
   */
  EReference getItemProduct_Item();

  /**
   * Returns the meta object for the reference '{@link org.pdulvp.data.ItemProduct#getProduct <em>Product</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Product</em>'.
   * @see org.pdulvp.data.ItemProduct#getProduct()
   * @see #getItemProduct()
   * @generated
   */
  EReference getItemProduct_Product();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DataFactory getDataFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals {
    /**
     * The meta object literal for the '{@link org.pdulvp.data.impl.ItemRootImpl <em>Item Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.impl.ItemRootImpl
     * @see org.pdulvp.data.impl.DataPackageImpl#getItemRoot()
     * @generated
     */
    EClass ITEM_ROOT = eINSTANCE.getItemRoot();

    /**
     * The meta object literal for the '<em><b>Owned Applications</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITEM_ROOT__OWNED_APPLICATIONS = eINSTANCE.getItemRoot_OwnedApplications();

    /**
     * The meta object literal for the '<em><b>Owned Screen Lists</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITEM_ROOT__OWNED_SCREEN_LISTS = eINSTANCE.getItemRoot_OwnedScreenLists();

    /**
     * The meta object literal for the '<em><b>Owned Item Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITEM_ROOT__OWNED_ITEM_TYPES = eINSTANCE.getItemRoot_OwnedItemTypes();

    /**
     * The meta object literal for the '{@link org.pdulvp.data.impl.ItemPkgImpl <em>Item Pkg</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.impl.ItemPkgImpl
     * @see org.pdulvp.data.impl.DataPackageImpl#getItemPkg()
     * @generated
     */
    EClass ITEM_PKG = eINSTANCE.getItemPkg();

    /**
     * The meta object literal for the '<em><b>Owned Item Pkgs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITEM_PKG__OWNED_ITEM_PKGS = eINSTANCE.getItemPkg_OwnedItemPkgs();

    /**
     * The meta object literal for the '<em><b>Owned Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITEM_PKG__OWNED_ITEMS = eINSTANCE.getItemPkg_OwnedItems();

    /**
     * The meta object literal for the '{@link org.pdulvp.data.impl.ChildItemImpl <em>Child Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.impl.ChildItemImpl
     * @see org.pdulvp.data.impl.DataPackageImpl#getChildItem()
     * @generated
     */
    EClass CHILD_ITEM = eINSTANCE.getChildItem();

    /**
     * The meta object literal for the '<em><b>Categories</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHILD_ITEM__CATEGORIES = eINSTANCE.getChildItem_Categories();

    /**
     * The meta object literal for the '{@link org.pdulvp.data.impl.ScreenPkgImpl <em>Screen Pkg</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.impl.ScreenPkgImpl
     * @see org.pdulvp.data.impl.DataPackageImpl#getScreenPkg()
     * @generated
     */
    EClass SCREEN_PKG = eINSTANCE.getScreenPkg();

    /**
     * The meta object literal for the '<em><b>Owned Screen Pkgs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCREEN_PKG__OWNED_SCREEN_PKGS = eINSTANCE.getScreenPkg_OwnedScreenPkgs();

    /**
     * The meta object literal for the '<em><b>Owned Screens</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCREEN_PKG__OWNED_SCREENS = eINSTANCE.getScreenPkg_OwnedScreens();

    /**
     * The meta object literal for the '{@link org.pdulvp.data.impl.CategoryPkgImpl <em>Category Pkg</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.impl.CategoryPkgImpl
     * @see org.pdulvp.data.impl.DataPackageImpl#getCategoryPkg()
     * @generated
     */
    EClass CATEGORY_PKG = eINSTANCE.getCategoryPkg();

    /**
     * The meta object literal for the '<em><b>Owned Category Pkgs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CATEGORY_PKG__OWNED_CATEGORY_PKGS = eINSTANCE.getCategoryPkg_OwnedCategoryPkgs();

    /**
     * The meta object literal for the '<em><b>Owned Categories</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CATEGORY_PKG__OWNED_CATEGORIES = eINSTANCE.getCategoryPkg_OwnedCategories();

    /**
     * The meta object literal for the '{@link org.pdulvp.data.impl.ProductPkgImpl <em>Product Pkg</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.impl.ProductPkgImpl
     * @see org.pdulvp.data.impl.DataPackageImpl#getProductPkg()
     * @generated
     */
    EClass PRODUCT_PKG = eINSTANCE.getProductPkg();

    /**
     * The meta object literal for the '<em><b>Owned Product Pkgs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRODUCT_PKG__OWNED_PRODUCT_PKGS = eINSTANCE.getProductPkg_OwnedProductPkgs();

    /**
     * The meta object literal for the '<em><b>Owned Products</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRODUCT_PKG__OWNED_PRODUCTS = eINSTANCE.getProductPkg_OwnedProducts();

    /**
     * The meta object literal for the '{@link org.pdulvp.data.impl.ItemTypePkgImpl <em>Item Type Pkg</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.impl.ItemTypePkgImpl
     * @see org.pdulvp.data.impl.DataPackageImpl#getItemTypePkg()
     * @generated
     */
    EClass ITEM_TYPE_PKG = eINSTANCE.getItemTypePkg();

    /**
     * The meta object literal for the '<em><b>Owned Type Pkgs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITEM_TYPE_PKG__OWNED_TYPE_PKGS = eINSTANCE.getItemTypePkg_OwnedTypePkgs();

    /**
     * The meta object literal for the '<em><b>Owned Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITEM_TYPE_PKG__OWNED_TYPES = eINSTANCE.getItemTypePkg_OwnedTypes();

    /**
     * The meta object literal for the '{@link org.pdulvp.data.impl.TimestampImpl <em>Timestamp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.impl.TimestampImpl
     * @see org.pdulvp.data.impl.DataPackageImpl#getTimestamp()
     * @generated
     */
    EClass TIMESTAMP = eINSTANCE.getTimestamp();

    /**
     * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIMESTAMP__TIMESTAMP = eINSTANCE.getTimestamp_Timestamp();

    /**
     * The meta object literal for the '{@link org.pdulvp.data.impl.AbstractItemImpl <em>Abstract Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.impl.AbstractItemImpl
     * @see org.pdulvp.data.impl.DataPackageImpl#getAbstractItem()
     * @generated
     */
    EClass ABSTRACT_ITEM = eINSTANCE.getAbstractItem();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_ITEM__ID = eINSTANCE.getAbstractItem_Id();

    /**
     * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_ITEM__TAG = eINSTANCE.getAbstractItem_Tag();

    /**
     * The meta object literal for the '{@link org.pdulvp.data.impl.NamedItemImpl <em>Named Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.impl.NamedItemImpl
     * @see org.pdulvp.data.impl.DataPackageImpl#getNamedItem()
     * @generated
     */
    EClass NAMED_ITEM = eINSTANCE.getNamedItem();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED_ITEM__NAME = eINSTANCE.getNamedItem_Name();

    /**
     * The meta object literal for the '<em><b>Name fr FR</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED_ITEM__NAME_FR_FR = eINSTANCE.getNamedItem_Name_frFR();

    /**
     * The meta object literal for the '{@link org.pdulvp.data.impl.CategoryImpl <em>Category</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.impl.CategoryImpl
     * @see org.pdulvp.data.impl.DataPackageImpl#getCategory()
     * @generated
     */
    EClass CATEGORY = eINSTANCE.getCategory();

    /**
     * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CATEGORY__VISIBLE = eINSTANCE.getCategory_Visible();

    /**
     * The meta object literal for the '<em><b>Inapp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CATEGORY__INAPP = eINSTANCE.getCategory_Inapp();

    /**
     * The meta object literal for the '<em><b>Inapp Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CATEGORY__INAPP_DESCRIPTION = eINSTANCE.getCategory_InappDescription();

    /**
     * The meta object literal for the '<em><b>Inapp Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CATEGORY__INAPP_TITLE = eINSTANCE.getCategory_InappTitle();

    /**
     * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CATEGORY__PRICE = eINSTANCE.getCategory_Price();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CATEGORY__PARENT = eINSTANCE.getCategory_Parent();

    /**
     * The meta object literal for the '<em><b>Owned Categories</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CATEGORY__OWNED_CATEGORIES = eINSTANCE.getCategory_OwnedCategories();

    /**
     * The meta object literal for the '<em><b>Screens</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CATEGORY__SCREENS = eINSTANCE.getCategory_Screens();

    /**
     * The meta object literal for the '{@link org.pdulvp.data.impl.ImageItemImpl <em>Image Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.impl.ImageItemImpl
     * @see org.pdulvp.data.impl.DataPackageImpl#getImageItem()
     * @generated
     */
    EClass IMAGE_ITEM = eINSTANCE.getImageItem();

    /**
     * The meta object literal for the '<em><b>Source Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE_ITEM__SOURCE_PATH = eINSTANCE.getImageItem_SourcePath();

    /**
     * The meta object literal for the '<em><b>Date Created</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE_ITEM__DATE_CREATED = eINSTANCE.getImageItem_DateCreated();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE_ITEM__STYLE = eINSTANCE.getImageItem_Style();

    /**
     * The meta object literal for the '<em><b>GImage Data Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE_ITEM__GIMAGE_DATA_PATH = eINSTANCE.getImageItem_GImageDataPath();

    /**
     * The meta object literal for the '<em><b>GIcon Data Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE_ITEM__GICON_DATA_PATH = eINSTANCE.getImageItem_GIconDataPath();

    /**
     * The meta object literal for the '<em><b>GIcon16 Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE_ITEM__GICON16_PATH = eINSTANCE.getImageItem_GIcon16Path();

    /**
     * The meta object literal for the '<em><b>GType</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMAGE_ITEM__GTYPE = eINSTANCE.getImageItem_GType();

    /**
     * The meta object literal for the '<em><b>Icon Data</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE_ITEM__ICON_DATA = eINSTANCE.getImageItem_IconData();

    /**
     * The meta object literal for the '<em><b>Image Data</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE_ITEM__IMAGE_DATA = eINSTANCE.getImageItem_ImageData();

    /**
     * The meta object literal for the '<em><b>Rank</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE_ITEM__RANK = eINSTANCE.getImageItem_Rank();

    /**
     * The meta object literal for the '<em><b>Metadatas</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMAGE_ITEM__METADATAS = eINSTANCE.getImageItem_Metadatas();

    /**
     * The meta object literal for the '<em><b>External Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE_ITEM__EXTERNAL_PATH = eINSTANCE.getImageItem_ExternalPath();

    /**
     * The meta object literal for the '<em><b>Packs</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE_ITEM__PACKS = eINSTANCE.getImageItem_Packs();

    /**
     * The meta object literal for the '<em><b>Products</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMAGE_ITEM__PRODUCTS = eINSTANCE.getImageItem_Products();

    /**
     * The meta object literal for the '{@link org.pdulvp.data.impl.ItemImpl <em>Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.impl.ItemImpl
     * @see org.pdulvp.data.impl.DataPackageImpl#getItem()
     * @generated
     */
    EClass ITEM = eINSTANCE.getItem();

    /**
     * The meta object literal for the '{@link org.pdulvp.data.impl.ScreenImpl <em>Screen</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.impl.ScreenImpl
     * @see org.pdulvp.data.impl.DataPackageImpl#getScreen()
     * @generated
     */
    EClass SCREEN = eINSTANCE.getScreen();

    /**
     * The meta object literal for the '<em><b>Ordering</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCREEN__ORDERING = eINSTANCE.getScreen_Ordering();

    /**
     * The meta object literal for the '<em><b>Filtering</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCREEN__FILTERING = eINSTANCE.getScreen_Filtering();

    /**
     * The meta object literal for the '{@link org.pdulvp.data.impl.UserImpl <em>User</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.impl.UserImpl
     * @see org.pdulvp.data.impl.DataPackageImpl#getUser()
     * @generated
     */
    EClass USER = eINSTANCE.getUser();

    /**
     * The meta object literal for the '<em><b>Mail</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USER__MAIL = eINSTANCE.getUser_Mail();

    /**
     * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USER__PASSWORD = eINSTANCE.getUser_Password();

    /**
     * The meta object literal for the '<em><b>Favourite Categories</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USER__FAVOURITE_CATEGORIES = eINSTANCE.getUser_FavouriteCategories();

    /**
     * The meta object literal for the '<em><b>Favourite Items</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USER__FAVOURITE_ITEMS = eINSTANCE.getUser_FavouriteItems();

    /**
     * The meta object literal for the '<em><b>Clicked Items</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USER__CLICKED_ITEMS = eINSTANCE.getUser_ClickedItems();

    /**
     * The meta object literal for the '<em><b>Widgeted Items</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USER__WIDGETED_ITEMS = eINSTANCE.getUser_WidgetedItems();

    /**
     * The meta object literal for the '<em><b>Gcm</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USER__GCM = eINSTANCE.getUser_Gcm();

    /**
     * The meta object literal for the '<em><b>Identifiers</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USER__IDENTIFIERS = eINSTANCE.getUser_Identifiers();

    /**
     * The meta object literal for the '{@link org.pdulvp.data.impl.ScreenListImpl <em>Screen List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.impl.ScreenListImpl
     * @see org.pdulvp.data.impl.DataPackageImpl#getScreenList()
     * @generated
     */
    EClass SCREEN_LIST = eINSTANCE.getScreenList();

    /**
     * The meta object literal for the '<em><b>Category</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCREEN_LIST__CATEGORY = eINSTANCE.getScreenList_Category();

    /**
     * The meta object literal for the '<em><b>Screen</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCREEN_LIST__SCREEN = eINSTANCE.getScreenList_Screen();

    /**
     * The meta object literal for the '<em><b>Icon Data</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCREEN_LIST__ICON_DATA = eINSTANCE.getScreenList_IconData();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute SCREEN_LIST__STYLE = eINSTANCE.getScreenList_Style();

				/**
     * The meta object literal for the '<em><b>Packs</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute SCREEN_LIST__PACKS = eINSTANCE.getScreenList_Packs();

				/**
     * The meta object literal for the '{@link org.pdulvp.data.impl.HomeScreenListImpl <em>Home Screen List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.impl.HomeScreenListImpl
     * @see org.pdulvp.data.impl.DataPackageImpl#getHomeScreenList()
     * @generated
     */
    EClass HOME_SCREEN_LIST = eINSTANCE.getHomeScreenList();

    /**
     * The meta object literal for the '<em><b>Application</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HOME_SCREEN_LIST__APPLICATION = eINSTANCE.getHomeScreenList_Application();

    /**
     * The meta object literal for the '{@link org.pdulvp.data.impl.CategoryViewImpl <em>Category View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.impl.CategoryViewImpl
     * @see org.pdulvp.data.impl.DataPackageImpl#getCategoryView()
     * @generated
     */
    EClass CATEGORY_VIEW = eINSTANCE.getCategoryView();

    /**
     * The meta object literal for the '<em><b>Screens Ids</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CATEGORY_VIEW__SCREENS_IDS = eINSTANCE.getCategoryView_ScreensIds();

    /**
     * The meta object literal for the '<em><b>Screens Names</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CATEGORY_VIEW__SCREENS_NAMES = eINSTANCE.getCategoryView_ScreensNames();

    /**
     * The meta object literal for the '{@link org.pdulvp.data.impl.FavouriteItemsViewImpl <em>Favourite Items View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.impl.FavouriteItemsViewImpl
     * @see org.pdulvp.data.impl.DataPackageImpl#getFavouriteItemsView()
     * @generated
     */
    EClass FAVOURITE_ITEMS_VIEW = eINSTANCE.getFavouriteItemsView();

    /**
     * The meta object literal for the '<em><b>User</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FAVOURITE_ITEMS_VIEW__USER = eINSTANCE.getFavouriteItemsView_User();

    /**
     * The meta object literal for the '{@link org.pdulvp.data.impl.FavouriteCategoriesViewImpl <em>Favourite Categories View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.impl.FavouriteCategoriesViewImpl
     * @see org.pdulvp.data.impl.DataPackageImpl#getFavouriteCategoriesView()
     * @generated
     */
    EClass FAVOURITE_CATEGORIES_VIEW = eINSTANCE.getFavouriteCategoriesView();

    /**
     * The meta object literal for the '<em><b>User</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FAVOURITE_CATEGORIES_VIEW__USER = eINSTANCE.getFavouriteCategoriesView_User();

    /**
     * The meta object literal for the '{@link org.pdulvp.data.impl.OAuthTokenImpl <em>OAuth Token</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.impl.OAuthTokenImpl
     * @see org.pdulvp.data.impl.DataPackageImpl#getOAuthToken()
     * @generated
     */
    EClass OAUTH_TOKEN = eINSTANCE.getOAuthToken();

    /**
     * The meta object literal for the '<em><b>Token Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OAUTH_TOKEN__TOKEN_ID = eINSTANCE.getOAuthToken_TokenId();

    /**
     * The meta object literal for the '<em><b>Device Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OAUTH_TOKEN__DEVICE_ID = eINSTANCE.getOAuthToken_DeviceId();

    /**
     * The meta object literal for the '<em><b>User</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OAUTH_TOKEN__USER = eINSTANCE.getOAuthToken_User();

    /**
     * The meta object literal for the '{@link org.pdulvp.data.impl.ItemTypeImpl <em>Item Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.impl.ItemTypeImpl
     * @see org.pdulvp.data.impl.DataPackageImpl#getItemType()
     * @generated
     */
    EClass ITEM_TYPE = eINSTANCE.getItemType();

    /**
     * The meta object literal for the '{@link org.pdulvp.data.impl.MetadatasImpl <em>Metadatas</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.impl.MetadatasImpl
     * @see org.pdulvp.data.impl.DataPackageImpl#getMetadatas()
     * @generated
     */
    EClass METADATAS = eINSTANCE.getMetadatas();

    /**
     * The meta object literal for the '<em><b>Author name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METADATAS__AUTHOR_NAME = eINSTANCE.getMetadatas_Author_name();

    /**
     * The meta object literal for the '<em><b>Author email</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METADATAS__AUTHOR_EMAIL = eINSTANCE.getMetadatas_Author_email();

    /**
     * The meta object literal for the '<em><b>Licence</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METADATAS__LICENCE = eINSTANCE.getMetadatas_Licence();

    /**
     * The meta object literal for the '<em><b>Category name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METADATAS__CATEGORY_NAME = eINSTANCE.getMetadatas_Category_name();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METADATAS__VERSION = eINSTANCE.getMetadatas_Version();

    /**
     * The meta object literal for the '<em><b>Download</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METADATAS__DOWNLOAD = eINSTANCE.getMetadatas_Download();

    /**
     * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METADATAS__RATE = eINSTANCE.getMetadatas_Rate();

    /**
     * The meta object literal for the '<em><b>News</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METADATAS__NEWS = eINSTANCE.getMetadatas_News();

    /**
     * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METADATAS__DATE = eINSTANCE.getMetadatas_Date();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METADATAS__SIZE = eINSTANCE.getMetadatas_Size();

    /**
     * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METADATAS__PRICE = eINSTANCE.getMetadatas_Price();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METADATAS__SOURCE = eINSTANCE.getMetadatas_Source();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METADATAS__NAME = eINSTANCE.getMetadatas_Name();

    /**
     * The meta object literal for the '<em><b>Name fr FR</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METADATAS__NAME_FR_FR = eINSTANCE.getMetadatas_Name_frFR();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METADATAS__DESCRIPTION = eINSTANCE.getMetadatas_Description();

    /**
     * The meta object literal for the '<em><b>Description fr FR</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METADATAS__DESCRIPTION_FR_FR = eINSTANCE.getMetadatas_Description_frFR();

    /**
     * The meta object literal for the '<em><b>Short Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METADATAS__SHORT_DESCRIPTION = eINSTANCE.getMetadatas_ShortDescription();

    /**
     * The meta object literal for the '<em><b>Maps Uri</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METADATAS__MAPS_URI = eINSTANCE.getMetadatas_MapsUri();

    /**
     * The meta object literal for the '<em><b>Image main Uri</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METADATAS__IMAGE_MAIN_URI = eINSTANCE.getMetadatas_Image_mainUri();

    /**
     * The meta object literal for the '<em><b>Image preview2 Uri</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METADATAS__IMAGE_PREVIEW2_URI = eINSTANCE.getMetadatas_Image_preview2Uri();

    /**
     * The meta object literal for the '<em><b>Site Uri</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METADATAS__SITE_URI = eINSTANCE.getMetadatas_SiteUri();

    /**
     * The meta object literal for the '<em><b>Trip Advisor Uri</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METADATAS__TRIP_ADVISOR_URI = eINSTANCE.getMetadatas_TripAdvisorUri();

    /**
     * The meta object literal for the '<em><b>Chart</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METADATAS__CHART = eINSTANCE.getMetadatas_Chart();

    /**
     * The meta object literal for the '{@link org.pdulvp.data.impl.HomeItemImpl <em>Home Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.impl.HomeItemImpl
     * @see org.pdulvp.data.impl.DataPackageImpl#getHomeItem()
     * @generated
     */
    EClass HOME_ITEM = eINSTANCE.getHomeItem();

    /**
     * The meta object literal for the '<em><b>Application</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HOME_ITEM__APPLICATION = eINSTANCE.getHomeItem_Application();

    /**
     * The meta object literal for the '<em><b>Category</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HOME_ITEM__CATEGORY = eINSTANCE.getHomeItem_Category();

    /**
     * The meta object literal for the '{@link org.pdulvp.data.impl.ApplicationImpl <em>Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.impl.ApplicationImpl
     * @see org.pdulvp.data.impl.DataPackageImpl#getApplication()
     * @generated
     */
    EClass APPLICATION = eINSTANCE.getApplication();

    /**
     * The meta object literal for the '<em><b>Owned Homes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__OWNED_HOMES = eINSTANCE.getApplication_OwnedHomes();

    /**
     * The meta object literal for the '<em><b>Category</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__CATEGORY = eINSTANCE.getApplication_Category();

    /**
     * The meta object literal for the '<em><b>Schema</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__SCHEMA = eINSTANCE.getApplication_Schema();

    /**
     * The meta object literal for the '<em><b>Server Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION__SERVER_URL = eINSTANCE.getApplication_ServerUrl();

    /**
     * The meta object literal for the '{@link org.pdulvp.data.impl.SchemaPkgImpl <em>Schema Pkg</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.impl.SchemaPkgImpl
     * @see org.pdulvp.data.impl.DataPackageImpl#getSchemaPkg()
     * @generated
     */
    EClass SCHEMA_PKG = eINSTANCE.getSchemaPkg();

    /**
     * The meta object literal for the '<em><b>Owned Schemas</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCHEMA_PKG__OWNED_SCHEMAS = eINSTANCE.getSchemaPkg_OwnedSchemas();

    /**
     * The meta object literal for the '{@link org.pdulvp.data.impl.ProductImpl <em>Product</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.impl.ProductImpl
     * @see org.pdulvp.data.impl.DataPackageImpl#getProduct()
     * @generated
     */
    EClass PRODUCT = eINSTANCE.getProduct();

    /**
     * The meta object literal for the '<em><b>Owned Products</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRODUCT__OWNED_PRODUCTS = eINSTANCE.getProduct_OwnedProducts();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRODUCT__PARENT = eINSTANCE.getProduct_Parent();

    /**
     * The meta object literal for the '{@link org.pdulvp.data.impl.SchemaImpl <em>Schema</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.impl.SchemaImpl
     * @see org.pdulvp.data.impl.DataPackageImpl#getSchema()
     * @generated
     */
    EClass SCHEMA = eINSTANCE.getSchema();

    /**
     * The meta object literal for the '<em><b>Db Schema</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCHEMA__DB_SCHEMA = eINSTANCE.getSchema_DbSchema();

    /**
     * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCHEMA__NAMESPACE = eINSTANCE.getSchema_Namespace();

    /**
     * The meta object literal for the '<em><b>Owned Classes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCHEMA__OWNED_CLASSES = eINSTANCE.getSchema_OwnedClasses();

    /**
     * The meta object literal for the '{@link org.pdulvp.data.impl.SchemaClassImpl <em>Schema Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.impl.SchemaClassImpl
     * @see org.pdulvp.data.impl.DataPackageImpl#getSchemaClass()
     * @generated
     */
    EClass SCHEMA_CLASS = eINSTANCE.getSchemaClass();

    /**
     * The meta object literal for the '<em><b>Clazz</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCHEMA_CLASS__CLAZZ = eINSTANCE.getSchemaClass_Clazz();

    /**
     * The meta object literal for the '<em><b>Table</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCHEMA_CLASS__TABLE = eINSTANCE.getSchemaClass_Table();

    /**
     * The meta object literal for the '<em><b>External Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCHEMA_CLASS__EXTERNAL_FEATURES = eINSTANCE.getSchemaClass_ExternalFeatures();

    /**
     * The meta object literal for the '{@link org.pdulvp.data.impl.SchemaFeatureImpl <em>Schema Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.impl.SchemaFeatureImpl
     * @see org.pdulvp.data.impl.DataPackageImpl#getSchemaFeature()
     * @generated
     */
    EClass SCHEMA_FEATURE = eINSTANCE.getSchemaFeature();

    /**
     * The meta object literal for the '<em><b>Table</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCHEMA_FEATURE__TABLE = eINSTANCE.getSchemaFeature_Table();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCHEMA_FEATURE__FEATURE = eINSTANCE.getSchemaFeature_Feature();

    /**
     * The meta object literal for the '{@link org.pdulvp.data.impl.RequestPkgImpl <em>Request Pkg</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.impl.RequestPkgImpl
     * @see org.pdulvp.data.impl.DataPackageImpl#getRequestPkg()
     * @generated
     */
    EClass REQUEST_PKG = eINSTANCE.getRequestPkg();

    /**
     * The meta object literal for the '<em><b>Owned Requests</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUEST_PKG__OWNED_REQUESTS = eINSTANCE.getRequestPkg_OwnedRequests();

    /**
     * The meta object literal for the '<em><b>Owned Request Pkgs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUEST_PKG__OWNED_REQUEST_PKGS = eINSTANCE.getRequestPkg_OwnedRequestPkgs();

    /**
     * The meta object literal for the '{@link org.pdulvp.data.impl.RequestImpl <em>Request</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.impl.RequestImpl
     * @see org.pdulvp.data.impl.DataPackageImpl#getRequest()
     * @generated
     */
    EClass REQUEST = eINSTANCE.getRequest();

    /**
     * The meta object literal for the '<em><b>Owned Triggers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUEST__OWNED_TRIGGERS = eINSTANCE.getRequest_OwnedTriggers();

    /**
     * The meta object literal for the '{@link org.pdulvp.data.impl.JobPkgImpl <em>Job Pkg</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.impl.JobPkgImpl
     * @see org.pdulvp.data.impl.DataPackageImpl#getJobPkg()
     * @generated
     */
    EClass JOB_PKG = eINSTANCE.getJobPkg();

    /**
     * The meta object literal for the '<em><b>Owned Jobs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOB_PKG__OWNED_JOBS = eINSTANCE.getJobPkg_OwnedJobs();

    /**
     * The meta object literal for the '<em><b>Owned Job Pkgs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOB_PKG__OWNED_JOB_PKGS = eINSTANCE.getJobPkg_OwnedJobPkgs();

    /**
     * The meta object literal for the '{@link org.pdulvp.data.impl.JobImpl <em>Job</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.impl.JobImpl
     * @see org.pdulvp.data.impl.DataPackageImpl#getJob()
     * @generated
     */
    EClass JOB = eINSTANCE.getJob();

    /**
     * The meta object literal for the '{@link org.pdulvp.data.impl.TriggerImpl <em>Trigger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.impl.TriggerImpl
     * @see org.pdulvp.data.impl.DataPackageImpl#getTrigger()
     * @generated
     */
    EClass TRIGGER = eINSTANCE.getTrigger();

    /**
     * The meta object literal for the '<em><b>Schedule</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRIGGER__SCHEDULE = eINSTANCE.getTrigger_Schedule();

    /**
     * The meta object literal for the '{@link org.pdulvp.data.impl.ItemProductImpl <em>Item Product</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.data.impl.ItemProductImpl
     * @see org.pdulvp.data.impl.DataPackageImpl#getItemProduct()
     * @generated
     */
    EClass ITEM_PRODUCT = eINSTANCE.getItemProduct();

    /**
     * The meta object literal for the '<em><b>Item</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITEM_PRODUCT__ITEM = eINSTANCE.getItemProduct_Item();

    /**
     * The meta object literal for the '<em><b>Product</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITEM_PRODUCT__PRODUCT = eINSTANCE.getItemProduct_Product();

  }

} //DataPackage
