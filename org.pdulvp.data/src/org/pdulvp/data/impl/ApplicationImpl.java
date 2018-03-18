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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.pdulvp.data.Application;
import org.pdulvp.data.Category;
import org.pdulvp.data.CategoryPkg;
import org.pdulvp.data.ChildItem;
import org.pdulvp.data.DataPackage;
import org.pdulvp.data.HomeItem;
import org.pdulvp.data.ItemPkg;
import org.pdulvp.data.Job;
import org.pdulvp.data.JobPkg;
import org.pdulvp.data.NamedItem;
import org.pdulvp.data.Request;
import org.pdulvp.data.RequestPkg;
import org.pdulvp.data.Schema;
import org.pdulvp.data.SchemaPkg;
import org.pdulvp.data.Screen;
import org.pdulvp.data.ScreenPkg;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.impl.ApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ApplicationImpl#getName_frFR <em>Name fr FR</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ApplicationImpl#getOwnedCategoryPkgs <em>Owned Category Pkgs</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ApplicationImpl#getOwnedCategories <em>Owned Categories</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ApplicationImpl#getOwnedItemPkgs <em>Owned Item Pkgs</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ApplicationImpl#getOwnedItems <em>Owned Items</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ApplicationImpl#getOwnedScreenPkgs <em>Owned Screen Pkgs</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ApplicationImpl#getOwnedScreens <em>Owned Screens</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ApplicationImpl#getOwnedJobs <em>Owned Jobs</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ApplicationImpl#getOwnedJobPkgs <em>Owned Job Pkgs</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ApplicationImpl#getOwnedRequests <em>Owned Requests</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ApplicationImpl#getOwnedRequestPkgs <em>Owned Request Pkgs</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ApplicationImpl#getOwnedSchemas <em>Owned Schemas</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ApplicationImpl#getOwnedHomes <em>Owned Homes</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ApplicationImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ApplicationImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ApplicationImpl#getServerUrl <em>Server Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationImpl extends AbstractItemImpl implements Application {
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
   * The cached value of the '{@link #getOwnedJobs() <em>Owned Jobs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedJobs()
   * @generated
   * @ordered
   */
  protected EList<Job> ownedJobs;

  /**
   * The cached value of the '{@link #getOwnedJobPkgs() <em>Owned Job Pkgs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedJobPkgs()
   * @generated
   * @ordered
   */
  protected EList<JobPkg> ownedJobPkgs;

  /**
   * The cached value of the '{@link #getOwnedRequests() <em>Owned Requests</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedRequests()
   * @generated
   * @ordered
   */
  protected EList<Request> ownedRequests;

  /**
   * The cached value of the '{@link #getOwnedRequestPkgs() <em>Owned Request Pkgs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedRequestPkgs()
   * @generated
   * @ordered
   */
  protected EList<RequestPkg> ownedRequestPkgs;

  /**
   * The cached value of the '{@link #getOwnedSchemas() <em>Owned Schemas</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedSchemas()
   * @generated
   * @ordered
   */
  protected EList<Schema> ownedSchemas;

  /**
   * The cached value of the '{@link #getOwnedHomes() <em>Owned Homes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedHomes()
   * @generated
   * @ordered
   */
  protected EList<HomeItem> ownedHomes;

  /**
   * The cached value of the '{@link #getCategory() <em>Category</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCategory()
   * @generated
   * @ordered
   */
  protected Category category;

  /**
   * The cached value of the '{@link #getSchema() <em>Schema</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSchema()
   * @generated
   * @ordered
   */
  protected Schema schema;

  /**
   * The default value of the '{@link #getServerUrl() <em>Server Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServerUrl()
   * @generated
   * @ordered
   */
  protected static final String SERVER_URL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getServerUrl() <em>Server Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServerUrl()
   * @generated
   * @ordered
   */
  protected String serverUrl = SERVER_URL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApplicationImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return DataPackage.Literals.APPLICATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.APPLICATION__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.APPLICATION__NAME_FR_FR, oldName_frFR, name_frFR));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CategoryPkg> getOwnedCategoryPkgs() {
    if (ownedCategoryPkgs == null) {
      ownedCategoryPkgs = new EObjectContainmentEList<CategoryPkg>(CategoryPkg.class, this, DataPackage.APPLICATION__OWNED_CATEGORY_PKGS);
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
      ownedCategories = new EObjectContainmentEList<Category>(Category.class, this, DataPackage.APPLICATION__OWNED_CATEGORIES);
    }
    return ownedCategories;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ItemPkg> getOwnedItemPkgs() {
    if (ownedItemPkgs == null) {
      ownedItemPkgs = new EObjectContainmentEList<ItemPkg>(ItemPkg.class, this, DataPackage.APPLICATION__OWNED_ITEM_PKGS);
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
      ownedItems = new EObjectContainmentEList<ChildItem>(ChildItem.class, this, DataPackage.APPLICATION__OWNED_ITEMS);
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
      ownedScreenPkgs = new EObjectContainmentEList<ScreenPkg>(ScreenPkg.class, this, DataPackage.APPLICATION__OWNED_SCREEN_PKGS);
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
      ownedScreens = new EObjectContainmentEList<Screen>(Screen.class, this, DataPackage.APPLICATION__OWNED_SCREENS);
    }
    return ownedScreens;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Job> getOwnedJobs() {
    if (ownedJobs == null) {
      ownedJobs = new EObjectContainmentEList<Job>(Job.class, this, DataPackage.APPLICATION__OWNED_JOBS);
    }
    return ownedJobs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<JobPkg> getOwnedJobPkgs() {
    if (ownedJobPkgs == null) {
      ownedJobPkgs = new EObjectContainmentEList<JobPkg>(JobPkg.class, this, DataPackage.APPLICATION__OWNED_JOB_PKGS);
    }
    return ownedJobPkgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Request> getOwnedRequests() {
    if (ownedRequests == null) {
      ownedRequests = new EObjectContainmentEList<Request>(Request.class, this, DataPackage.APPLICATION__OWNED_REQUESTS);
    }
    return ownedRequests;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RequestPkg> getOwnedRequestPkgs() {
    if (ownedRequestPkgs == null) {
      ownedRequestPkgs = new EObjectContainmentEList<RequestPkg>(RequestPkg.class, this, DataPackage.APPLICATION__OWNED_REQUEST_PKGS);
    }
    return ownedRequestPkgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HomeItem> getOwnedHomes() {
    if (ownedHomes == null) {
      ownedHomes = new EObjectContainmentEList<HomeItem>(HomeItem.class, this, DataPackage.APPLICATION__OWNED_HOMES);
    }
    return ownedHomes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Category getCategory() {
    if (category != null && category.eIsProxy()) {
      InternalEObject oldCategory = (InternalEObject)category;
      category = (Category)eResolveProxy(oldCategory);
      if (category != oldCategory) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.APPLICATION__CATEGORY, oldCategory, category));
      }
    }
    return category;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Category basicGetCategory() {
    return category;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCategory(Category newCategory) {
    Category oldCategory = category;
    category = newCategory;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.APPLICATION__CATEGORY, oldCategory, category));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Schema getSchema() {
    if (schema != null && schema.eIsProxy()) {
      InternalEObject oldSchema = (InternalEObject)schema;
      schema = (Schema)eResolveProxy(oldSchema);
      if (schema != oldSchema) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.APPLICATION__SCHEMA, oldSchema, schema));
      }
    }
    return schema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Schema basicGetSchema() {
    return schema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSchema(Schema newSchema) {
    Schema oldSchema = schema;
    schema = newSchema;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.APPLICATION__SCHEMA, oldSchema, schema));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getServerUrl() {
    return serverUrl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setServerUrl(String newServerUrl) {
    String oldServerUrl = serverUrl;
    serverUrl = newServerUrl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.APPLICATION__SERVER_URL, oldServerUrl, serverUrl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Schema> getOwnedSchemas() {
    if (ownedSchemas == null) {
      ownedSchemas = new EObjectContainmentEList<Schema>(Schema.class, this, DataPackage.APPLICATION__OWNED_SCHEMAS);
    }
    return ownedSchemas;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case DataPackage.APPLICATION__OWNED_CATEGORY_PKGS:
        return ((InternalEList<?>)getOwnedCategoryPkgs()).basicRemove(otherEnd, msgs);
      case DataPackage.APPLICATION__OWNED_CATEGORIES:
        return ((InternalEList<?>)getOwnedCategories()).basicRemove(otherEnd, msgs);
      case DataPackage.APPLICATION__OWNED_ITEM_PKGS:
        return ((InternalEList<?>)getOwnedItemPkgs()).basicRemove(otherEnd, msgs);
      case DataPackage.APPLICATION__OWNED_ITEMS:
        return ((InternalEList<?>)getOwnedItems()).basicRemove(otherEnd, msgs);
      case DataPackage.APPLICATION__OWNED_SCREEN_PKGS:
        return ((InternalEList<?>)getOwnedScreenPkgs()).basicRemove(otherEnd, msgs);
      case DataPackage.APPLICATION__OWNED_SCREENS:
        return ((InternalEList<?>)getOwnedScreens()).basicRemove(otherEnd, msgs);
      case DataPackage.APPLICATION__OWNED_JOBS:
        return ((InternalEList<?>)getOwnedJobs()).basicRemove(otherEnd, msgs);
      case DataPackage.APPLICATION__OWNED_JOB_PKGS:
        return ((InternalEList<?>)getOwnedJobPkgs()).basicRemove(otherEnd, msgs);
      case DataPackage.APPLICATION__OWNED_REQUESTS:
        return ((InternalEList<?>)getOwnedRequests()).basicRemove(otherEnd, msgs);
      case DataPackage.APPLICATION__OWNED_REQUEST_PKGS:
        return ((InternalEList<?>)getOwnedRequestPkgs()).basicRemove(otherEnd, msgs);
      case DataPackage.APPLICATION__OWNED_SCHEMAS:
        return ((InternalEList<?>)getOwnedSchemas()).basicRemove(otherEnd, msgs);
      case DataPackage.APPLICATION__OWNED_HOMES:
        return ((InternalEList<?>)getOwnedHomes()).basicRemove(otherEnd, msgs);
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
      case DataPackage.APPLICATION__NAME:
        return getName();
      case DataPackage.APPLICATION__NAME_FR_FR:
        return getName_frFR();
      case DataPackage.APPLICATION__OWNED_CATEGORY_PKGS:
        return getOwnedCategoryPkgs();
      case DataPackage.APPLICATION__OWNED_CATEGORIES:
        return getOwnedCategories();
      case DataPackage.APPLICATION__OWNED_ITEM_PKGS:
        return getOwnedItemPkgs();
      case DataPackage.APPLICATION__OWNED_ITEMS:
        return getOwnedItems();
      case DataPackage.APPLICATION__OWNED_SCREEN_PKGS:
        return getOwnedScreenPkgs();
      case DataPackage.APPLICATION__OWNED_SCREENS:
        return getOwnedScreens();
      case DataPackage.APPLICATION__OWNED_JOBS:
        return getOwnedJobs();
      case DataPackage.APPLICATION__OWNED_JOB_PKGS:
        return getOwnedJobPkgs();
      case DataPackage.APPLICATION__OWNED_REQUESTS:
        return getOwnedRequests();
      case DataPackage.APPLICATION__OWNED_REQUEST_PKGS:
        return getOwnedRequestPkgs();
      case DataPackage.APPLICATION__OWNED_SCHEMAS:
        return getOwnedSchemas();
      case DataPackage.APPLICATION__OWNED_HOMES:
        return getOwnedHomes();
      case DataPackage.APPLICATION__CATEGORY:
        if (resolve) return getCategory();
        return basicGetCategory();
      case DataPackage.APPLICATION__SCHEMA:
        if (resolve) return getSchema();
        return basicGetSchema();
      case DataPackage.APPLICATION__SERVER_URL:
        return getServerUrl();
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
      case DataPackage.APPLICATION__NAME:
        setName((String)newValue);
        return;
      case DataPackage.APPLICATION__NAME_FR_FR:
        setName_frFR((String)newValue);
        return;
      case DataPackage.APPLICATION__OWNED_CATEGORY_PKGS:
        getOwnedCategoryPkgs().clear();
        getOwnedCategoryPkgs().addAll((Collection<? extends CategoryPkg>)newValue);
        return;
      case DataPackage.APPLICATION__OWNED_CATEGORIES:
        getOwnedCategories().clear();
        getOwnedCategories().addAll((Collection<? extends Category>)newValue);
        return;
      case DataPackage.APPLICATION__OWNED_ITEM_PKGS:
        getOwnedItemPkgs().clear();
        getOwnedItemPkgs().addAll((Collection<? extends ItemPkg>)newValue);
        return;
      case DataPackage.APPLICATION__OWNED_ITEMS:
        getOwnedItems().clear();
        getOwnedItems().addAll((Collection<? extends ChildItem>)newValue);
        return;
      case DataPackage.APPLICATION__OWNED_SCREEN_PKGS:
        getOwnedScreenPkgs().clear();
        getOwnedScreenPkgs().addAll((Collection<? extends ScreenPkg>)newValue);
        return;
      case DataPackage.APPLICATION__OWNED_SCREENS:
        getOwnedScreens().clear();
        getOwnedScreens().addAll((Collection<? extends Screen>)newValue);
        return;
      case DataPackage.APPLICATION__OWNED_JOBS:
        getOwnedJobs().clear();
        getOwnedJobs().addAll((Collection<? extends Job>)newValue);
        return;
      case DataPackage.APPLICATION__OWNED_JOB_PKGS:
        getOwnedJobPkgs().clear();
        getOwnedJobPkgs().addAll((Collection<? extends JobPkg>)newValue);
        return;
      case DataPackage.APPLICATION__OWNED_REQUESTS:
        getOwnedRequests().clear();
        getOwnedRequests().addAll((Collection<? extends Request>)newValue);
        return;
      case DataPackage.APPLICATION__OWNED_REQUEST_PKGS:
        getOwnedRequestPkgs().clear();
        getOwnedRequestPkgs().addAll((Collection<? extends RequestPkg>)newValue);
        return;
      case DataPackage.APPLICATION__OWNED_SCHEMAS:
        getOwnedSchemas().clear();
        getOwnedSchemas().addAll((Collection<? extends Schema>)newValue);
        return;
      case DataPackage.APPLICATION__OWNED_HOMES:
        getOwnedHomes().clear();
        getOwnedHomes().addAll((Collection<? extends HomeItem>)newValue);
        return;
      case DataPackage.APPLICATION__CATEGORY:
        setCategory((Category)newValue);
        return;
      case DataPackage.APPLICATION__SCHEMA:
        setSchema((Schema)newValue);
        return;
      case DataPackage.APPLICATION__SERVER_URL:
        setServerUrl((String)newValue);
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
      case DataPackage.APPLICATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DataPackage.APPLICATION__NAME_FR_FR:
        setName_frFR(NAME_FR_FR_EDEFAULT);
        return;
      case DataPackage.APPLICATION__OWNED_CATEGORY_PKGS:
        getOwnedCategoryPkgs().clear();
        return;
      case DataPackage.APPLICATION__OWNED_CATEGORIES:
        getOwnedCategories().clear();
        return;
      case DataPackage.APPLICATION__OWNED_ITEM_PKGS:
        getOwnedItemPkgs().clear();
        return;
      case DataPackage.APPLICATION__OWNED_ITEMS:
        getOwnedItems().clear();
        return;
      case DataPackage.APPLICATION__OWNED_SCREEN_PKGS:
        getOwnedScreenPkgs().clear();
        return;
      case DataPackage.APPLICATION__OWNED_SCREENS:
        getOwnedScreens().clear();
        return;
      case DataPackage.APPLICATION__OWNED_JOBS:
        getOwnedJobs().clear();
        return;
      case DataPackage.APPLICATION__OWNED_JOB_PKGS:
        getOwnedJobPkgs().clear();
        return;
      case DataPackage.APPLICATION__OWNED_REQUESTS:
        getOwnedRequests().clear();
        return;
      case DataPackage.APPLICATION__OWNED_REQUEST_PKGS:
        getOwnedRequestPkgs().clear();
        return;
      case DataPackage.APPLICATION__OWNED_SCHEMAS:
        getOwnedSchemas().clear();
        return;
      case DataPackage.APPLICATION__OWNED_HOMES:
        getOwnedHomes().clear();
        return;
      case DataPackage.APPLICATION__CATEGORY:
        setCategory((Category)null);
        return;
      case DataPackage.APPLICATION__SCHEMA:
        setSchema((Schema)null);
        return;
      case DataPackage.APPLICATION__SERVER_URL:
        setServerUrl(SERVER_URL_EDEFAULT);
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
      case DataPackage.APPLICATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DataPackage.APPLICATION__NAME_FR_FR:
        return NAME_FR_FR_EDEFAULT == null ? name_frFR != null : !NAME_FR_FR_EDEFAULT.equals(name_frFR);
      case DataPackage.APPLICATION__OWNED_CATEGORY_PKGS:
        return ownedCategoryPkgs != null && !ownedCategoryPkgs.isEmpty();
      case DataPackage.APPLICATION__OWNED_CATEGORIES:
        return ownedCategories != null && !ownedCategories.isEmpty();
      case DataPackage.APPLICATION__OWNED_ITEM_PKGS:
        return ownedItemPkgs != null && !ownedItemPkgs.isEmpty();
      case DataPackage.APPLICATION__OWNED_ITEMS:
        return ownedItems != null && !ownedItems.isEmpty();
      case DataPackage.APPLICATION__OWNED_SCREEN_PKGS:
        return ownedScreenPkgs != null && !ownedScreenPkgs.isEmpty();
      case DataPackage.APPLICATION__OWNED_SCREENS:
        return ownedScreens != null && !ownedScreens.isEmpty();
      case DataPackage.APPLICATION__OWNED_JOBS:
        return ownedJobs != null && !ownedJobs.isEmpty();
      case DataPackage.APPLICATION__OWNED_JOB_PKGS:
        return ownedJobPkgs != null && !ownedJobPkgs.isEmpty();
      case DataPackage.APPLICATION__OWNED_REQUESTS:
        return ownedRequests != null && !ownedRequests.isEmpty();
      case DataPackage.APPLICATION__OWNED_REQUEST_PKGS:
        return ownedRequestPkgs != null && !ownedRequestPkgs.isEmpty();
      case DataPackage.APPLICATION__OWNED_SCHEMAS:
        return ownedSchemas != null && !ownedSchemas.isEmpty();
      case DataPackage.APPLICATION__OWNED_HOMES:
        return ownedHomes != null && !ownedHomes.isEmpty();
      case DataPackage.APPLICATION__CATEGORY:
        return category != null;
      case DataPackage.APPLICATION__SCHEMA:
        return schema != null;
      case DataPackage.APPLICATION__SERVER_URL:
        return SERVER_URL_EDEFAULT == null ? serverUrl != null : !SERVER_URL_EDEFAULT.equals(serverUrl);
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
        case DataPackage.APPLICATION__NAME: return DataPackage.NAMED_ITEM__NAME;
        case DataPackage.APPLICATION__NAME_FR_FR: return DataPackage.NAMED_ITEM__NAME_FR_FR;
        default: return -1;
      }
    }
    if (baseClass == CategoryPkg.class) {
      switch (derivedFeatureID) {
        case DataPackage.APPLICATION__OWNED_CATEGORY_PKGS: return DataPackage.CATEGORY_PKG__OWNED_CATEGORY_PKGS;
        case DataPackage.APPLICATION__OWNED_CATEGORIES: return DataPackage.CATEGORY_PKG__OWNED_CATEGORIES;
        default: return -1;
      }
    }
    if (baseClass == ItemPkg.class) {
      switch (derivedFeatureID) {
        case DataPackage.APPLICATION__OWNED_ITEM_PKGS: return DataPackage.ITEM_PKG__OWNED_ITEM_PKGS;
        case DataPackage.APPLICATION__OWNED_ITEMS: return DataPackage.ITEM_PKG__OWNED_ITEMS;
        default: return -1;
      }
    }
    if (baseClass == ScreenPkg.class) {
      switch (derivedFeatureID) {
        case DataPackage.APPLICATION__OWNED_SCREEN_PKGS: return DataPackage.SCREEN_PKG__OWNED_SCREEN_PKGS;
        case DataPackage.APPLICATION__OWNED_SCREENS: return DataPackage.SCREEN_PKG__OWNED_SCREENS;
        default: return -1;
      }
    }
    if (baseClass == JobPkg.class) {
      switch (derivedFeatureID) {
        case DataPackage.APPLICATION__OWNED_JOBS: return DataPackage.JOB_PKG__OWNED_JOBS;
        case DataPackage.APPLICATION__OWNED_JOB_PKGS: return DataPackage.JOB_PKG__OWNED_JOB_PKGS;
        default: return -1;
      }
    }
    if (baseClass == RequestPkg.class) {
      switch (derivedFeatureID) {
        case DataPackage.APPLICATION__OWNED_REQUESTS: return DataPackage.REQUEST_PKG__OWNED_REQUESTS;
        case DataPackage.APPLICATION__OWNED_REQUEST_PKGS: return DataPackage.REQUEST_PKG__OWNED_REQUEST_PKGS;
        default: return -1;
      }
    }
    if (baseClass == SchemaPkg.class) {
      switch (derivedFeatureID) {
        case DataPackage.APPLICATION__OWNED_SCHEMAS: return DataPackage.SCHEMA_PKG__OWNED_SCHEMAS;
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
        case DataPackage.NAMED_ITEM__NAME: return DataPackage.APPLICATION__NAME;
        case DataPackage.NAMED_ITEM__NAME_FR_FR: return DataPackage.APPLICATION__NAME_FR_FR;
        default: return -1;
      }
    }
    if (baseClass == CategoryPkg.class) {
      switch (baseFeatureID) {
        case DataPackage.CATEGORY_PKG__OWNED_CATEGORY_PKGS: return DataPackage.APPLICATION__OWNED_CATEGORY_PKGS;
        case DataPackage.CATEGORY_PKG__OWNED_CATEGORIES: return DataPackage.APPLICATION__OWNED_CATEGORIES;
        default: return -1;
      }
    }
    if (baseClass == ItemPkg.class) {
      switch (baseFeatureID) {
        case DataPackage.ITEM_PKG__OWNED_ITEM_PKGS: return DataPackage.APPLICATION__OWNED_ITEM_PKGS;
        case DataPackage.ITEM_PKG__OWNED_ITEMS: return DataPackage.APPLICATION__OWNED_ITEMS;
        default: return -1;
      }
    }
    if (baseClass == ScreenPkg.class) {
      switch (baseFeatureID) {
        case DataPackage.SCREEN_PKG__OWNED_SCREEN_PKGS: return DataPackage.APPLICATION__OWNED_SCREEN_PKGS;
        case DataPackage.SCREEN_PKG__OWNED_SCREENS: return DataPackage.APPLICATION__OWNED_SCREENS;
        default: return -1;
      }
    }
    if (baseClass == JobPkg.class) {
      switch (baseFeatureID) {
        case DataPackage.JOB_PKG__OWNED_JOBS: return DataPackage.APPLICATION__OWNED_JOBS;
        case DataPackage.JOB_PKG__OWNED_JOB_PKGS: return DataPackage.APPLICATION__OWNED_JOB_PKGS;
        default: return -1;
      }
    }
    if (baseClass == RequestPkg.class) {
      switch (baseFeatureID) {
        case DataPackage.REQUEST_PKG__OWNED_REQUESTS: return DataPackage.APPLICATION__OWNED_REQUESTS;
        case DataPackage.REQUEST_PKG__OWNED_REQUEST_PKGS: return DataPackage.APPLICATION__OWNED_REQUEST_PKGS;
        default: return -1;
      }
    }
    if (baseClass == SchemaPkg.class) {
      switch (baseFeatureID) {
        case DataPackage.SCHEMA_PKG__OWNED_SCHEMAS: return DataPackage.APPLICATION__OWNED_SCHEMAS;
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
    result.append(", serverUrl: ");
    result.append(serverUrl);
    result.append(')');
    return result.toString();
  }

} //ApplicationImpl
