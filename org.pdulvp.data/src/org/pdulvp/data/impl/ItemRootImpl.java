/**
 */
package org.pdulvp.data.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.pdulvp.data.Application;
import org.pdulvp.data.Category;
import org.pdulvp.data.CategoryPkg;
import org.pdulvp.data.ChildItem;
import org.pdulvp.data.DataPackage;
import org.pdulvp.data.ItemPkg;
import org.pdulvp.data.ItemRoot;
import org.pdulvp.data.ItemType;
import org.pdulvp.data.ItemTypePkg;
import org.pdulvp.data.NamedItem;
import org.pdulvp.data.Product;
import org.pdulvp.data.ProductPkg;
import org.pdulvp.data.Screen;
import org.pdulvp.data.ScreenList;
import org.pdulvp.data.ScreenPkg;
import org.pdulvp.data.table.DNamedElement;
import org.pdulvp.data.table.DTable;
import org.pdulvp.data.table.DTablePkg;
import org.pdulvp.data.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.impl.ItemRootImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ItemRootImpl#getName_frFR <em>Name fr FR</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ItemRootImpl#getOwnedCategoryPkgs <em>Owned Category Pkgs</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ItemRootImpl#getOwnedCategories <em>Owned Categories</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ItemRootImpl#getOwnedProductPkgs <em>Owned Product Pkgs</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ItemRootImpl#getOwnedProducts <em>Owned Products</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ItemRootImpl#getOwnedItemPkgs <em>Owned Item Pkgs</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ItemRootImpl#getOwnedItems <em>Owned Items</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ItemRootImpl#getOwnedScreenPkgs <em>Owned Screen Pkgs</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ItemRootImpl#getOwnedScreens <em>Owned Screens</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ItemRootImpl#getOwnedTypePkgs <em>Owned Type Pkgs</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ItemRootImpl#getOwnedTypes <em>Owned Types</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ItemRootImpl#getDbName <em>Db Name</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ItemRootImpl#getOwnedTables <em>Owned Tables</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ItemRootImpl#getOwnedApplications <em>Owned Applications</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ItemRootImpl#getOwnedScreenLists <em>Owned Screen Lists</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ItemRootImpl#getOwnedItemTypes <em>Owned Item Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemRootImpl extends AbstractItemImpl implements ItemRoot {
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getName_frFR() <em>Name fr FR</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName_frFR()
   * @generated
   * @ordered
   */
  protected static final String NAME_FR_FR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName_frFR() <em>Name fr FR</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName_frFR()
   * @generated
   * @ordered
   */
  protected String name_frFR = NAME_FR_FR_EDEFAULT;

  /**
   * The cached value of the '{@link #getOwnedCategoryPkgs() <em>Owned Category Pkgs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedCategoryPkgs()
   * @generated
   * @ordered
   */
  protected EList<CategoryPkg> ownedCategoryPkgs;

  /**
   * The cached value of the '{@link #getOwnedCategories() <em>Owned Categories</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedCategories()
   * @generated
   * @ordered
   */
  protected EList<Category> ownedCategories;

  /**
   * The cached value of the '{@link #getOwnedProductPkgs() <em>Owned Product Pkgs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedProductPkgs()
   * @generated
   * @ordered
   */
  protected EList<ProductPkg> ownedProductPkgs;

  /**
   * The cached value of the '{@link #getOwnedProducts() <em>Owned Products</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedProducts()
   * @generated
   * @ordered
   */
  protected EList<Product> ownedProducts;

  /**
   * The cached value of the '{@link #getOwnedItemPkgs() <em>Owned Item Pkgs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedItemPkgs()
   * @generated
   * @ordered
   */
  protected EList<ItemPkg> ownedItemPkgs;

  /**
   * The cached value of the '{@link #getOwnedItems() <em>Owned Items</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedItems()
   * @generated
   * @ordered
   */
  protected EList<ChildItem> ownedItems;

  /**
   * The cached value of the '{@link #getOwnedScreenPkgs() <em>Owned Screen Pkgs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedScreenPkgs()
   * @generated
   * @ordered
   */
  protected EList<ScreenPkg> ownedScreenPkgs;

  /**
   * The cached value of the '{@link #getOwnedScreens() <em>Owned Screens</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedScreens()
   * @generated
   * @ordered
   */
  protected EList<Screen> ownedScreens;

  /**
   * The cached value of the '{@link #getOwnedTypePkgs() <em>Owned Type Pkgs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedTypePkgs()
   * @generated
   * @ordered
   */
  protected EList<ItemTypePkg> ownedTypePkgs;

  /**
   * The cached value of the '{@link #getOwnedTypes() <em>Owned Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedTypes()
   * @generated
   * @ordered
   */
  protected EList<ItemType> ownedTypes;

  /**
   * The default value of the '{@link #getDbName() <em>Db Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbName()
   * @generated
   * @ordered
   */
  protected static final String DB_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDbName() <em>Db Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbName()
   * @generated
   * @ordered
   */
  protected String dbName = DB_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getOwnedTables() <em>Owned Tables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedTables()
   * @generated
   * @ordered
   */
  protected EList<DTable> ownedTables;

  /**
   * The cached value of the '{@link #getOwnedApplications() <em>Owned Applications</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedApplications()
   * @generated
   * @ordered
   */
  protected EList<Application> ownedApplications;

  /**
   * The cached value of the '{@link #getOwnedScreenLists() <em>Owned Screen Lists</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedScreenLists()
   * @generated
   * @ordered
   */
  protected EList<ScreenList> ownedScreenLists;

  /**
   * The cached value of the '{@link #getOwnedItemTypes() <em>Owned Item Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedItemTypes()
   * @generated
   * @ordered
   */
  protected EList<ItemType> ownedItemTypes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ItemRootImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return DataPackage.Literals.ITEM_ROOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.ITEM_ROOT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName_frFR() {
    return name_frFR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName_frFR(String newName_frFR) {
    String oldName_frFR = name_frFR;
    name_frFR = newName_frFR;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.ITEM_ROOT__NAME_FR_FR, oldName_frFR, name_frFR));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CategoryPkg> getOwnedCategoryPkgs() {
    if (ownedCategoryPkgs == null) {
      ownedCategoryPkgs = new EObjectContainmentEList<CategoryPkg>(CategoryPkg.class, this, DataPackage.ITEM_ROOT__OWNED_CATEGORY_PKGS);
    }
    return ownedCategoryPkgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Category> getOwnedCategories() {
    if (ownedCategories == null) {
      ownedCategories = new EObjectContainmentEList<Category>(Category.class, this, DataPackage.ITEM_ROOT__OWNED_CATEGORIES);
    }
    return ownedCategories;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProductPkg> getOwnedProductPkgs() {
    if (ownedProductPkgs == null) {
      ownedProductPkgs = new EObjectContainmentEList<ProductPkg>(ProductPkg.class, this, DataPackage.ITEM_ROOT__OWNED_PRODUCT_PKGS);
    }
    return ownedProductPkgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Product> getOwnedProducts() {
    if (ownedProducts == null) {
      ownedProducts = new EObjectContainmentEList<Product>(Product.class, this, DataPackage.ITEM_ROOT__OWNED_PRODUCTS);
    }
    return ownedProducts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ItemPkg> getOwnedItemPkgs() {
    if (ownedItemPkgs == null) {
      ownedItemPkgs = new EObjectContainmentEList<ItemPkg>(ItemPkg.class, this, DataPackage.ITEM_ROOT__OWNED_ITEM_PKGS);
    }
    return ownedItemPkgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ChildItem> getOwnedItems() {
    if (ownedItems == null) {
      ownedItems = new EObjectContainmentEList<ChildItem>(ChildItem.class, this, DataPackage.ITEM_ROOT__OWNED_ITEMS);
    }
    return ownedItems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ScreenPkg> getOwnedScreenPkgs() {
    if (ownedScreenPkgs == null) {
      ownedScreenPkgs = new EObjectContainmentEList<ScreenPkg>(ScreenPkg.class, this, DataPackage.ITEM_ROOT__OWNED_SCREEN_PKGS);
    }
    return ownedScreenPkgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Screen> getOwnedScreens() {
    if (ownedScreens == null) {
      ownedScreens = new EObjectContainmentEList<Screen>(Screen.class, this, DataPackage.ITEM_ROOT__OWNED_SCREENS);
    }
    return ownedScreens;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ItemTypePkg> getOwnedTypePkgs() {
    if (ownedTypePkgs == null) {
      ownedTypePkgs = new EObjectContainmentEList<ItemTypePkg>(ItemTypePkg.class, this, DataPackage.ITEM_ROOT__OWNED_TYPE_PKGS);
    }
    return ownedTypePkgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ItemType> getOwnedTypes() {
    if (ownedTypes == null) {
      ownedTypes = new EObjectContainmentEList<ItemType>(ItemType.class, this, DataPackage.ITEM_ROOT__OWNED_TYPES);
    }
    return ownedTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDbName() {
    return dbName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbName(String newDbName) {
    String oldDbName = dbName;
    dbName = newDbName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.ITEM_ROOT__DB_NAME, oldDbName, dbName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DTable> getOwnedTables() {
    if (ownedTables == null) {
      ownedTables = new EObjectContainmentEList<DTable>(DTable.class, this, DataPackage.ITEM_ROOT__OWNED_TABLES);
    }
    return ownedTables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Application> getOwnedApplications() {
    if (ownedApplications == null) {
      ownedApplications = new EObjectContainmentEList<Application>(Application.class, this, DataPackage.ITEM_ROOT__OWNED_APPLICATIONS);
    }
    return ownedApplications;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ScreenList> getOwnedScreenLists() {
    if (ownedScreenLists == null) {
      ownedScreenLists = new EObjectContainmentEList<ScreenList>(ScreenList.class, this, DataPackage.ITEM_ROOT__OWNED_SCREEN_LISTS);
    }
    return ownedScreenLists;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ItemType> getOwnedItemTypes() {
    if (ownedItemTypes == null) {
      ownedItemTypes = new EObjectContainmentEList<ItemType>(ItemType.class, this, DataPackage.ITEM_ROOT__OWNED_ITEM_TYPES);
    }
    return ownedItemTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case DataPackage.ITEM_ROOT__OWNED_CATEGORY_PKGS:
        return ((InternalEList<?>)getOwnedCategoryPkgs()).basicRemove(otherEnd, msgs);
      case DataPackage.ITEM_ROOT__OWNED_CATEGORIES:
        return ((InternalEList<?>)getOwnedCategories()).basicRemove(otherEnd, msgs);
      case DataPackage.ITEM_ROOT__OWNED_PRODUCT_PKGS:
        return ((InternalEList<?>)getOwnedProductPkgs()).basicRemove(otherEnd, msgs);
      case DataPackage.ITEM_ROOT__OWNED_PRODUCTS:
        return ((InternalEList<?>)getOwnedProducts()).basicRemove(otherEnd, msgs);
      case DataPackage.ITEM_ROOT__OWNED_ITEM_PKGS:
        return ((InternalEList<?>)getOwnedItemPkgs()).basicRemove(otherEnd, msgs);
      case DataPackage.ITEM_ROOT__OWNED_ITEMS:
        return ((InternalEList<?>)getOwnedItems()).basicRemove(otherEnd, msgs);
      case DataPackage.ITEM_ROOT__OWNED_SCREEN_PKGS:
        return ((InternalEList<?>)getOwnedScreenPkgs()).basicRemove(otherEnd, msgs);
      case DataPackage.ITEM_ROOT__OWNED_SCREENS:
        return ((InternalEList<?>)getOwnedScreens()).basicRemove(otherEnd, msgs);
      case DataPackage.ITEM_ROOT__OWNED_TYPE_PKGS:
        return ((InternalEList<?>)getOwnedTypePkgs()).basicRemove(otherEnd, msgs);
      case DataPackage.ITEM_ROOT__OWNED_TYPES:
        return ((InternalEList<?>)getOwnedTypes()).basicRemove(otherEnd, msgs);
      case DataPackage.ITEM_ROOT__OWNED_TABLES:
        return ((InternalEList<?>)getOwnedTables()).basicRemove(otherEnd, msgs);
      case DataPackage.ITEM_ROOT__OWNED_APPLICATIONS:
        return ((InternalEList<?>)getOwnedApplications()).basicRemove(otherEnd, msgs);
      case DataPackage.ITEM_ROOT__OWNED_SCREEN_LISTS:
        return ((InternalEList<?>)getOwnedScreenLists()).basicRemove(otherEnd, msgs);
      case DataPackage.ITEM_ROOT__OWNED_ITEM_TYPES:
        return ((InternalEList<?>)getOwnedItemTypes()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case DataPackage.ITEM_ROOT__NAME:
        return getName();
      case DataPackage.ITEM_ROOT__NAME_FR_FR:
        return getName_frFR();
      case DataPackage.ITEM_ROOT__OWNED_CATEGORY_PKGS:
        return getOwnedCategoryPkgs();
      case DataPackage.ITEM_ROOT__OWNED_CATEGORIES:
        return getOwnedCategories();
      case DataPackage.ITEM_ROOT__OWNED_PRODUCT_PKGS:
        return getOwnedProductPkgs();
      case DataPackage.ITEM_ROOT__OWNED_PRODUCTS:
        return getOwnedProducts();
      case DataPackage.ITEM_ROOT__OWNED_ITEM_PKGS:
        return getOwnedItemPkgs();
      case DataPackage.ITEM_ROOT__OWNED_ITEMS:
        return getOwnedItems();
      case DataPackage.ITEM_ROOT__OWNED_SCREEN_PKGS:
        return getOwnedScreenPkgs();
      case DataPackage.ITEM_ROOT__OWNED_SCREENS:
        return getOwnedScreens();
      case DataPackage.ITEM_ROOT__OWNED_TYPE_PKGS:
        return getOwnedTypePkgs();
      case DataPackage.ITEM_ROOT__OWNED_TYPES:
        return getOwnedTypes();
      case DataPackage.ITEM_ROOT__DB_NAME:
        return getDbName();
      case DataPackage.ITEM_ROOT__OWNED_TABLES:
        return getOwnedTables();
      case DataPackage.ITEM_ROOT__OWNED_APPLICATIONS:
        return getOwnedApplications();
      case DataPackage.ITEM_ROOT__OWNED_SCREEN_LISTS:
        return getOwnedScreenLists();
      case DataPackage.ITEM_ROOT__OWNED_ITEM_TYPES:
        return getOwnedItemTypes();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case DataPackage.ITEM_ROOT__NAME:
        setName((String)newValue);
        return;
      case DataPackage.ITEM_ROOT__NAME_FR_FR:
        setName_frFR((String)newValue);
        return;
      case DataPackage.ITEM_ROOT__OWNED_CATEGORY_PKGS:
        getOwnedCategoryPkgs().clear();
        getOwnedCategoryPkgs().addAll((Collection<? extends CategoryPkg>)newValue);
        return;
      case DataPackage.ITEM_ROOT__OWNED_CATEGORIES:
        getOwnedCategories().clear();
        getOwnedCategories().addAll((Collection<? extends Category>)newValue);
        return;
      case DataPackage.ITEM_ROOT__OWNED_PRODUCT_PKGS:
        getOwnedProductPkgs().clear();
        getOwnedProductPkgs().addAll((Collection<? extends ProductPkg>)newValue);
        return;
      case DataPackage.ITEM_ROOT__OWNED_PRODUCTS:
        getOwnedProducts().clear();
        getOwnedProducts().addAll((Collection<? extends Product>)newValue);
        return;
      case DataPackage.ITEM_ROOT__OWNED_ITEM_PKGS:
        getOwnedItemPkgs().clear();
        getOwnedItemPkgs().addAll((Collection<? extends ItemPkg>)newValue);
        return;
      case DataPackage.ITEM_ROOT__OWNED_ITEMS:
        getOwnedItems().clear();
        getOwnedItems().addAll((Collection<? extends ChildItem>)newValue);
        return;
      case DataPackage.ITEM_ROOT__OWNED_SCREEN_PKGS:
        getOwnedScreenPkgs().clear();
        getOwnedScreenPkgs().addAll((Collection<? extends ScreenPkg>)newValue);
        return;
      case DataPackage.ITEM_ROOT__OWNED_SCREENS:
        getOwnedScreens().clear();
        getOwnedScreens().addAll((Collection<? extends Screen>)newValue);
        return;
      case DataPackage.ITEM_ROOT__OWNED_TYPE_PKGS:
        getOwnedTypePkgs().clear();
        getOwnedTypePkgs().addAll((Collection<? extends ItemTypePkg>)newValue);
        return;
      case DataPackage.ITEM_ROOT__OWNED_TYPES:
        getOwnedTypes().clear();
        getOwnedTypes().addAll((Collection<? extends ItemType>)newValue);
        return;
      case DataPackage.ITEM_ROOT__DB_NAME:
        setDbName((String)newValue);
        return;
      case DataPackage.ITEM_ROOT__OWNED_TABLES:
        getOwnedTables().clear();
        getOwnedTables().addAll((Collection<? extends DTable>)newValue);
        return;
      case DataPackage.ITEM_ROOT__OWNED_APPLICATIONS:
        getOwnedApplications().clear();
        getOwnedApplications().addAll((Collection<? extends Application>)newValue);
        return;
      case DataPackage.ITEM_ROOT__OWNED_SCREEN_LISTS:
        getOwnedScreenLists().clear();
        getOwnedScreenLists().addAll((Collection<? extends ScreenList>)newValue);
        return;
      case DataPackage.ITEM_ROOT__OWNED_ITEM_TYPES:
        getOwnedItemTypes().clear();
        getOwnedItemTypes().addAll((Collection<? extends ItemType>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
      case DataPackage.ITEM_ROOT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DataPackage.ITEM_ROOT__NAME_FR_FR:
        setName_frFR(NAME_FR_FR_EDEFAULT);
        return;
      case DataPackage.ITEM_ROOT__OWNED_CATEGORY_PKGS:
        getOwnedCategoryPkgs().clear();
        return;
      case DataPackage.ITEM_ROOT__OWNED_CATEGORIES:
        getOwnedCategories().clear();
        return;
      case DataPackage.ITEM_ROOT__OWNED_PRODUCT_PKGS:
        getOwnedProductPkgs().clear();
        return;
      case DataPackage.ITEM_ROOT__OWNED_PRODUCTS:
        getOwnedProducts().clear();
        return;
      case DataPackage.ITEM_ROOT__OWNED_ITEM_PKGS:
        getOwnedItemPkgs().clear();
        return;
      case DataPackage.ITEM_ROOT__OWNED_ITEMS:
        getOwnedItems().clear();
        return;
      case DataPackage.ITEM_ROOT__OWNED_SCREEN_PKGS:
        getOwnedScreenPkgs().clear();
        return;
      case DataPackage.ITEM_ROOT__OWNED_SCREENS:
        getOwnedScreens().clear();
        return;
      case DataPackage.ITEM_ROOT__OWNED_TYPE_PKGS:
        getOwnedTypePkgs().clear();
        return;
      case DataPackage.ITEM_ROOT__OWNED_TYPES:
        getOwnedTypes().clear();
        return;
      case DataPackage.ITEM_ROOT__DB_NAME:
        setDbName(DB_NAME_EDEFAULT);
        return;
      case DataPackage.ITEM_ROOT__OWNED_TABLES:
        getOwnedTables().clear();
        return;
      case DataPackage.ITEM_ROOT__OWNED_APPLICATIONS:
        getOwnedApplications().clear();
        return;
      case DataPackage.ITEM_ROOT__OWNED_SCREEN_LISTS:
        getOwnedScreenLists().clear();
        return;
      case DataPackage.ITEM_ROOT__OWNED_ITEM_TYPES:
        getOwnedItemTypes().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case DataPackage.ITEM_ROOT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DataPackage.ITEM_ROOT__NAME_FR_FR:
        return NAME_FR_FR_EDEFAULT == null ? name_frFR != null : !NAME_FR_FR_EDEFAULT.equals(name_frFR);
      case DataPackage.ITEM_ROOT__OWNED_CATEGORY_PKGS:
        return ownedCategoryPkgs != null && !ownedCategoryPkgs.isEmpty();
      case DataPackage.ITEM_ROOT__OWNED_CATEGORIES:
        return ownedCategories != null && !ownedCategories.isEmpty();
      case DataPackage.ITEM_ROOT__OWNED_PRODUCT_PKGS:
        return ownedProductPkgs != null && !ownedProductPkgs.isEmpty();
      case DataPackage.ITEM_ROOT__OWNED_PRODUCTS:
        return ownedProducts != null && !ownedProducts.isEmpty();
      case DataPackage.ITEM_ROOT__OWNED_ITEM_PKGS:
        return ownedItemPkgs != null && !ownedItemPkgs.isEmpty();
      case DataPackage.ITEM_ROOT__OWNED_ITEMS:
        return ownedItems != null && !ownedItems.isEmpty();
      case DataPackage.ITEM_ROOT__OWNED_SCREEN_PKGS:
        return ownedScreenPkgs != null && !ownedScreenPkgs.isEmpty();
      case DataPackage.ITEM_ROOT__OWNED_SCREENS:
        return ownedScreens != null && !ownedScreens.isEmpty();
      case DataPackage.ITEM_ROOT__OWNED_TYPE_PKGS:
        return ownedTypePkgs != null && !ownedTypePkgs.isEmpty();
      case DataPackage.ITEM_ROOT__OWNED_TYPES:
        return ownedTypes != null && !ownedTypes.isEmpty();
      case DataPackage.ITEM_ROOT__DB_NAME:
        return DB_NAME_EDEFAULT == null ? dbName != null : !DB_NAME_EDEFAULT.equals(dbName);
      case DataPackage.ITEM_ROOT__OWNED_TABLES:
        return ownedTables != null && !ownedTables.isEmpty();
      case DataPackage.ITEM_ROOT__OWNED_APPLICATIONS:
        return ownedApplications != null && !ownedApplications.isEmpty();
      case DataPackage.ITEM_ROOT__OWNED_SCREEN_LISTS:
        return ownedScreenLists != null && !ownedScreenLists.isEmpty();
      case DataPackage.ITEM_ROOT__OWNED_ITEM_TYPES:
        return ownedItemTypes != null && !ownedItemTypes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
    if (baseClass == NamedItem.class) {
      switch (derivedFeatureID) {
        case DataPackage.ITEM_ROOT__NAME: return DataPackage.NAMED_ITEM__NAME;
        case DataPackage.ITEM_ROOT__NAME_FR_FR: return DataPackage.NAMED_ITEM__NAME_FR_FR;
        default: return -1;
      }
    }
    if (baseClass == CategoryPkg.class) {
      switch (derivedFeatureID) {
        case DataPackage.ITEM_ROOT__OWNED_CATEGORY_PKGS: return DataPackage.CATEGORY_PKG__OWNED_CATEGORY_PKGS;
        case DataPackage.ITEM_ROOT__OWNED_CATEGORIES: return DataPackage.CATEGORY_PKG__OWNED_CATEGORIES;
        default: return -1;
      }
    }
    if (baseClass == ProductPkg.class) {
      switch (derivedFeatureID) {
        case DataPackage.ITEM_ROOT__OWNED_PRODUCT_PKGS: return DataPackage.PRODUCT_PKG__OWNED_PRODUCT_PKGS;
        case DataPackage.ITEM_ROOT__OWNED_PRODUCTS: return DataPackage.PRODUCT_PKG__OWNED_PRODUCTS;
        default: return -1;
      }
    }
    if (baseClass == ItemPkg.class) {
      switch (derivedFeatureID) {
        case DataPackage.ITEM_ROOT__OWNED_ITEM_PKGS: return DataPackage.ITEM_PKG__OWNED_ITEM_PKGS;
        case DataPackage.ITEM_ROOT__OWNED_ITEMS: return DataPackage.ITEM_PKG__OWNED_ITEMS;
        default: return -1;
      }
    }
    if (baseClass == ScreenPkg.class) {
      switch (derivedFeatureID) {
        case DataPackage.ITEM_ROOT__OWNED_SCREEN_PKGS: return DataPackage.SCREEN_PKG__OWNED_SCREEN_PKGS;
        case DataPackage.ITEM_ROOT__OWNED_SCREENS: return DataPackage.SCREEN_PKG__OWNED_SCREENS;
        default: return -1;
      }
    }
    if (baseClass == ItemTypePkg.class) {
      switch (derivedFeatureID) {
        case DataPackage.ITEM_ROOT__OWNED_TYPE_PKGS: return DataPackage.ITEM_TYPE_PKG__OWNED_TYPE_PKGS;
        case DataPackage.ITEM_ROOT__OWNED_TYPES: return DataPackage.ITEM_TYPE_PKG__OWNED_TYPES;
        default: return -1;
      }
    }
    if (baseClass == DNamedElement.class) {
      switch (derivedFeatureID) {
        case DataPackage.ITEM_ROOT__DB_NAME: return TablePackage.DNAMED_ELEMENT__DB_NAME;
        default: return -1;
      }
    }
    if (baseClass == DTablePkg.class) {
      switch (derivedFeatureID) {
        case DataPackage.ITEM_ROOT__OWNED_TABLES: return TablePackage.DTABLE_PKG__OWNED_TABLES;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
    if (baseClass == NamedItem.class) {
      switch (baseFeatureID) {
        case DataPackage.NAMED_ITEM__NAME: return DataPackage.ITEM_ROOT__NAME;
        case DataPackage.NAMED_ITEM__NAME_FR_FR: return DataPackage.ITEM_ROOT__NAME_FR_FR;
        default: return -1;
      }
    }
    if (baseClass == CategoryPkg.class) {
      switch (baseFeatureID) {
        case DataPackage.CATEGORY_PKG__OWNED_CATEGORY_PKGS: return DataPackage.ITEM_ROOT__OWNED_CATEGORY_PKGS;
        case DataPackage.CATEGORY_PKG__OWNED_CATEGORIES: return DataPackage.ITEM_ROOT__OWNED_CATEGORIES;
        default: return -1;
      }
    }
    if (baseClass == ProductPkg.class) {
      switch (baseFeatureID) {
        case DataPackage.PRODUCT_PKG__OWNED_PRODUCT_PKGS: return DataPackage.ITEM_ROOT__OWNED_PRODUCT_PKGS;
        case DataPackage.PRODUCT_PKG__OWNED_PRODUCTS: return DataPackage.ITEM_ROOT__OWNED_PRODUCTS;
        default: return -1;
      }
    }
    if (baseClass == ItemPkg.class) {
      switch (baseFeatureID) {
        case DataPackage.ITEM_PKG__OWNED_ITEM_PKGS: return DataPackage.ITEM_ROOT__OWNED_ITEM_PKGS;
        case DataPackage.ITEM_PKG__OWNED_ITEMS: return DataPackage.ITEM_ROOT__OWNED_ITEMS;
        default: return -1;
      }
    }
    if (baseClass == ScreenPkg.class) {
      switch (baseFeatureID) {
        case DataPackage.SCREEN_PKG__OWNED_SCREEN_PKGS: return DataPackage.ITEM_ROOT__OWNED_SCREEN_PKGS;
        case DataPackage.SCREEN_PKG__OWNED_SCREENS: return DataPackage.ITEM_ROOT__OWNED_SCREENS;
        default: return -1;
      }
    }
    if (baseClass == ItemTypePkg.class) {
      switch (baseFeatureID) {
        case DataPackage.ITEM_TYPE_PKG__OWNED_TYPE_PKGS: return DataPackage.ITEM_ROOT__OWNED_TYPE_PKGS;
        case DataPackage.ITEM_TYPE_PKG__OWNED_TYPES: return DataPackage.ITEM_ROOT__OWNED_TYPES;
        default: return -1;
      }
    }
    if (baseClass == DNamedElement.class) {
      switch (baseFeatureID) {
        case TablePackage.DNAMED_ELEMENT__DB_NAME: return DataPackage.ITEM_ROOT__DB_NAME;
        default: return -1;
      }
    }
    if (baseClass == DTablePkg.class) {
      switch (baseFeatureID) {
        case TablePackage.DTABLE_PKG__OWNED_TABLES: return DataPackage.ITEM_ROOT__OWNED_TABLES;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", name_frFR: ");
    result.append(name_frFR);
    result.append(", dbName: ");
    result.append(dbName);
    result.append(')');
    return result.toString();
  }

} //ItemRootImpl
