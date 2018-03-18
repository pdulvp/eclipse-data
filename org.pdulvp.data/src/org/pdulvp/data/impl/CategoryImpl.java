/**
 * <copyright>
 * </copyright>
 *
 * $Id$
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
import org.pdulvp.data.AbstractItem;
import org.pdulvp.data.Category;
import org.pdulvp.data.ChildItem;
import org.pdulvp.data.DataPackage;
import org.pdulvp.data.ItemPkg;
import org.pdulvp.data.Screen;
import org.pdulvp.data.Timestamp;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Category</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.impl.CategoryImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.CategoryImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.CategoryImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.CategoryImpl#getOwnedItemPkgs <em>Owned Item Pkgs</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.CategoryImpl#getOwnedItems <em>Owned Items</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.CategoryImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.CategoryImpl#isInapp <em>Inapp</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.CategoryImpl#getInappDescription <em>Inapp Description</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.CategoryImpl#getInappTitle <em>Inapp Title</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.CategoryImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.CategoryImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.CategoryImpl#getOwnedCategories <em>Owned Categories</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.CategoryImpl#getScreens <em>Screens</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CategoryImpl extends NamedItemImpl implements Category {
  /**
   * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getTimestamp()
   * @generated
   * @ordered
   */
  protected static final String TIMESTAMP_EDEFAULT = null;
  /**
   * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getTimestamp()
   * @generated
   * @ordered
   */
  protected String timestamp = TIMESTAMP_EDEFAULT;
  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;
  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;
  /**
   * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getTag()
   * @generated
   * @ordered
   */
  protected static final String TAG_EDEFAULT = null;
  /**
   * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getTag()
   * @generated
   * @ordered
   */
  protected String tag = TAG_EDEFAULT;
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
   * The default value of the '{@link #isVisible() <em>Visible</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isVisible()
   * @generated
   * @ordered
   */
  protected static final boolean VISIBLE_EDEFAULT = true;
  /**
   * The cached value of the '{@link #isVisible() <em>Visible</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isVisible()
   * @generated
   * @ordered
   */
  protected boolean visible = VISIBLE_EDEFAULT;
  /**
   * The default value of the '{@link #isInapp() <em>Inapp</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #isInapp()
   * @generated
   * @ordered
   */
  protected static final boolean INAPP_EDEFAULT = true;
  /**
   * The cached value of the '{@link #isInapp() <em>Inapp</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #isInapp()
   * @generated
   * @ordered
   */
  protected boolean inapp = INAPP_EDEFAULT;
  /**
   * The default value of the '{@link #getInappDescription() <em>Inapp Description</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getInappDescription()
   * @generated
   * @ordered
   */
  protected static final String INAPP_DESCRIPTION_EDEFAULT = null;
  /**
   * The cached value of the '{@link #getInappDescription() <em>Inapp Description</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getInappDescription()
   * @generated
   * @ordered
   */
  protected String inappDescription = INAPP_DESCRIPTION_EDEFAULT;
  /**
   * The default value of the '{@link #getInappTitle() <em>Inapp Title</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getInappTitle()
   * @generated
   * @ordered
   */
  protected static final String INAPP_TITLE_EDEFAULT = null;
  /**
   * The cached value of the '{@link #getInappTitle() <em>Inapp Title</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getInappTitle()
   * @generated
   * @ordered
   */
  protected String inappTitle = INAPP_TITLE_EDEFAULT;
  /**
   * The default value of the '{@link #getPrice() <em>Price</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getPrice()
   * @generated
   * @ordered
   */
  protected static final float PRICE_EDEFAULT = 0.0F;
  /**
   * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getPrice()
   * @generated
   * @ordered
   */
  protected float price = PRICE_EDEFAULT;
  /**
   * The cached value of the '{@link #getParent() <em>Parent</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getParent()
   * @generated
   * @ordered
   */
  protected Category parent;
  /**
   * The cached value of the '{@link #getOwnedCategories() <em>Owned Categories</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getOwnedCategories()
   * @generated
   * @ordered
   */
  protected EList<Category> ownedCategories;
  /**
   * The cached value of the '{@link #getScreens() <em>Screens</em>}' reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getScreens()
   * @generated
   * @ordered
   */
  protected EList<Screen> screens;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  protected CategoryImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return DataPackage.Literals.CATEGORY;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTimestamp() {
    return timestamp;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTimestamp(String newTimestamp) {
    String oldTimestamp = timestamp;
    timestamp = newTimestamp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.CATEGORY__TIMESTAMP, oldTimestamp, timestamp));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getId() {
    return id;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setId(String newId) {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.CATEGORY__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTag() {
    return tag;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTag(String newTag) {
    String oldTag = tag;
    tag = newTag;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.CATEGORY__TAG, oldTag, tag));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ItemPkg> getOwnedItemPkgs() {
    if (ownedItemPkgs == null) {
      ownedItemPkgs = new EObjectContainmentEList<ItemPkg>(ItemPkg.class, this, DataPackage.CATEGORY__OWNED_ITEM_PKGS);
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
      ownedItems = new EObjectContainmentEList<ChildItem>(ChildItem.class, this, DataPackage.CATEGORY__OWNED_ITEMS);
    }
    return ownedItems;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Category> getOwnedCategories() {
    if (ownedCategories == null) {
      ownedCategories = new EObjectContainmentEList<Category>(Category.class, this, DataPackage.CATEGORY__OWNED_CATEGORIES);
    }
    return ownedCategories;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Screen> getScreens() {
    if (screens == null) {
      screens = new EObjectResolvingEList<Screen>(Screen.class, this, DataPackage.CATEGORY__SCREENS);
    }
    return screens;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isVisible() {
    return visible;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVisible(boolean newVisible) {
    boolean oldVisible = visible;
    visible = newVisible;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.CATEGORY__VISIBLE, oldVisible, visible));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isInapp() {
    return inapp;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInapp(boolean newInapp) {
    boolean oldInapp = inapp;
    inapp = newInapp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.CATEGORY__INAPP, oldInapp, inapp));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getInappDescription() {
    return inappDescription;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInappDescription(String newInappDescription) {
    String oldInappDescription = inappDescription;
    inappDescription = newInappDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.CATEGORY__INAPP_DESCRIPTION, oldInappDescription, inappDescription));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getInappTitle() {
    return inappTitle;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInappTitle(String newInappTitle) {
    String oldInappTitle = inappTitle;
    inappTitle = newInappTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.CATEGORY__INAPP_TITLE, oldInappTitle, inappTitle));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public float getPrice() {
    return price;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPrice(float newPrice) {
    float oldPrice = price;
    price = newPrice;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.CATEGORY__PRICE, oldPrice, price));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Category getParent() {
    if (parent != null && parent.eIsProxy()) {
      InternalEObject oldParent = (InternalEObject)parent;
      parent = (Category)eResolveProxy(oldParent);
      if (parent != oldParent) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.CATEGORY__PARENT, oldParent, parent));
      }
    }
    return parent;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Category basicGetParent() {
    return parent;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setParent(Category newParent) {
    Category oldParent = parent;
    parent = newParent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.CATEGORY__PARENT, oldParent, parent));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case DataPackage.CATEGORY__OWNED_ITEM_PKGS:
        return ((InternalEList<?>)getOwnedItemPkgs()).basicRemove(otherEnd, msgs);
      case DataPackage.CATEGORY__OWNED_ITEMS:
        return ((InternalEList<?>)getOwnedItems()).basicRemove(otherEnd, msgs);
      case DataPackage.CATEGORY__OWNED_CATEGORIES:
        return ((InternalEList<?>)getOwnedCategories()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case DataPackage.CATEGORY__TIMESTAMP:
        return getTimestamp();
      case DataPackage.CATEGORY__ID:
        return getId();
      case DataPackage.CATEGORY__TAG:
        return getTag();
      case DataPackage.CATEGORY__OWNED_ITEM_PKGS:
        return getOwnedItemPkgs();
      case DataPackage.CATEGORY__OWNED_ITEMS:
        return getOwnedItems();
      case DataPackage.CATEGORY__VISIBLE:
        return isVisible();
      case DataPackage.CATEGORY__INAPP:
        return isInapp();
      case DataPackage.CATEGORY__INAPP_DESCRIPTION:
        return getInappDescription();
      case DataPackage.CATEGORY__INAPP_TITLE:
        return getInappTitle();
      case DataPackage.CATEGORY__PRICE:
        return getPrice();
      case DataPackage.CATEGORY__PARENT:
        if (resolve) return getParent();
        return basicGetParent();
      case DataPackage.CATEGORY__OWNED_CATEGORIES:
        return getOwnedCategories();
      case DataPackage.CATEGORY__SCREENS:
        return getScreens();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case DataPackage.CATEGORY__TIMESTAMP:
        setTimestamp((String)newValue);
        return;
      case DataPackage.CATEGORY__ID:
        setId((String)newValue);
        return;
      case DataPackage.CATEGORY__TAG:
        setTag((String)newValue);
        return;
      case DataPackage.CATEGORY__OWNED_ITEM_PKGS:
        getOwnedItemPkgs().clear();
        getOwnedItemPkgs().addAll((Collection<? extends ItemPkg>)newValue);
        return;
      case DataPackage.CATEGORY__OWNED_ITEMS:
        getOwnedItems().clear();
        getOwnedItems().addAll((Collection<? extends ChildItem>)newValue);
        return;
      case DataPackage.CATEGORY__VISIBLE:
        setVisible((Boolean)newValue);
        return;
      case DataPackage.CATEGORY__INAPP:
        setInapp((Boolean)newValue);
        return;
      case DataPackage.CATEGORY__INAPP_DESCRIPTION:
        setInappDescription((String)newValue);
        return;
      case DataPackage.CATEGORY__INAPP_TITLE:
        setInappTitle((String)newValue);
        return;
      case DataPackage.CATEGORY__PRICE:
        setPrice((Float)newValue);
        return;
      case DataPackage.CATEGORY__PARENT:
        setParent((Category)newValue);
        return;
      case DataPackage.CATEGORY__OWNED_CATEGORIES:
        getOwnedCategories().clear();
        getOwnedCategories().addAll((Collection<? extends Category>)newValue);
        return;
      case DataPackage.CATEGORY__SCREENS:
        getScreens().clear();
        getScreens().addAll((Collection<? extends Screen>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
      case DataPackage.CATEGORY__TIMESTAMP:
        setTimestamp(TIMESTAMP_EDEFAULT);
        return;
      case DataPackage.CATEGORY__ID:
        setId(ID_EDEFAULT);
        return;
      case DataPackage.CATEGORY__TAG:
        setTag(TAG_EDEFAULT);
        return;
      case DataPackage.CATEGORY__OWNED_ITEM_PKGS:
        getOwnedItemPkgs().clear();
        return;
      case DataPackage.CATEGORY__OWNED_ITEMS:
        getOwnedItems().clear();
        return;
      case DataPackage.CATEGORY__VISIBLE:
        setVisible(VISIBLE_EDEFAULT);
        return;
      case DataPackage.CATEGORY__INAPP:
        setInapp(INAPP_EDEFAULT);
        return;
      case DataPackage.CATEGORY__INAPP_DESCRIPTION:
        setInappDescription(INAPP_DESCRIPTION_EDEFAULT);
        return;
      case DataPackage.CATEGORY__INAPP_TITLE:
        setInappTitle(INAPP_TITLE_EDEFAULT);
        return;
      case DataPackage.CATEGORY__PRICE:
        setPrice(PRICE_EDEFAULT);
        return;
      case DataPackage.CATEGORY__PARENT:
        setParent((Category)null);
        return;
      case DataPackage.CATEGORY__OWNED_CATEGORIES:
        getOwnedCategories().clear();
        return;
      case DataPackage.CATEGORY__SCREENS:
        getScreens().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case DataPackage.CATEGORY__TIMESTAMP:
        return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
      case DataPackage.CATEGORY__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case DataPackage.CATEGORY__TAG:
        return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
      case DataPackage.CATEGORY__OWNED_ITEM_PKGS:
        return ownedItemPkgs != null && !ownedItemPkgs.isEmpty();
      case DataPackage.CATEGORY__OWNED_ITEMS:
        return ownedItems != null && !ownedItems.isEmpty();
      case DataPackage.CATEGORY__VISIBLE:
        return visible != VISIBLE_EDEFAULT;
      case DataPackage.CATEGORY__INAPP:
        return inapp != INAPP_EDEFAULT;
      case DataPackage.CATEGORY__INAPP_DESCRIPTION:
        return INAPP_DESCRIPTION_EDEFAULT == null ? inappDescription != null : !INAPP_DESCRIPTION_EDEFAULT.equals(inappDescription);
      case DataPackage.CATEGORY__INAPP_TITLE:
        return INAPP_TITLE_EDEFAULT == null ? inappTitle != null : !INAPP_TITLE_EDEFAULT.equals(inappTitle);
      case DataPackage.CATEGORY__PRICE:
        return price != PRICE_EDEFAULT;
      case DataPackage.CATEGORY__PARENT:
        return parent != null;
      case DataPackage.CATEGORY__OWNED_CATEGORIES:
        return ownedCategories != null && !ownedCategories.isEmpty();
      case DataPackage.CATEGORY__SCREENS:
        return screens != null && !screens.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
    if (baseClass == Timestamp.class) {
      switch (derivedFeatureID) {
        case DataPackage.CATEGORY__TIMESTAMP: return DataPackage.TIMESTAMP__TIMESTAMP;
        default: return -1;
      }
    }
    if (baseClass == AbstractItem.class) {
      switch (derivedFeatureID) {
        case DataPackage.CATEGORY__ID: return DataPackage.ABSTRACT_ITEM__ID;
        case DataPackage.CATEGORY__TAG: return DataPackage.ABSTRACT_ITEM__TAG;
        default: return -1;
      }
    }
    if (baseClass == ItemPkg.class) {
      switch (derivedFeatureID) {
        case DataPackage.CATEGORY__OWNED_ITEM_PKGS: return DataPackage.ITEM_PKG__OWNED_ITEM_PKGS;
        case DataPackage.CATEGORY__OWNED_ITEMS: return DataPackage.ITEM_PKG__OWNED_ITEMS;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
    if (baseClass == Timestamp.class) {
      switch (baseFeatureID) {
        case DataPackage.TIMESTAMP__TIMESTAMP: return DataPackage.CATEGORY__TIMESTAMP;
        default: return -1;
      }
    }
    if (baseClass == AbstractItem.class) {
      switch (baseFeatureID) {
        case DataPackage.ABSTRACT_ITEM__ID: return DataPackage.CATEGORY__ID;
        case DataPackage.ABSTRACT_ITEM__TAG: return DataPackage.CATEGORY__TAG;
        default: return -1;
      }
    }
    if (baseClass == ItemPkg.class) {
      switch (baseFeatureID) {
        case DataPackage.ITEM_PKG__OWNED_ITEM_PKGS: return DataPackage.CATEGORY__OWNED_ITEM_PKGS;
        case DataPackage.ITEM_PKG__OWNED_ITEMS: return DataPackage.CATEGORY__OWNED_ITEMS;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (timestamp: ");
    result.append(timestamp);
    result.append(", id: ");
    result.append(id);
    result.append(", tag: ");
    result.append(tag);
    result.append(", visible: ");
    result.append(visible);
    result.append(", inapp: ");
    result.append(inapp);
    result.append(", inappDescription: ");
    result.append(inappDescription);
    result.append(", inappTitle: ");
    result.append(inappTitle);
    result.append(", price: ");
    result.append(price);
    result.append(')');
    return result.toString();
  }

} // CategoryImpl
