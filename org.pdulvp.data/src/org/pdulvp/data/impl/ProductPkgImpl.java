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
import org.pdulvp.data.AbstractItem;
import org.pdulvp.data.DataPackage;
import org.pdulvp.data.Product;
import org.pdulvp.data.ProductPkg;
import org.pdulvp.data.Timestamp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Pkg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.impl.ProductPkgImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ProductPkgImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ProductPkgImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ProductPkgImpl#getOwnedProductPkgs <em>Owned Product Pkgs</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ProductPkgImpl#getOwnedProducts <em>Owned Products</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductPkgImpl extends NamedItemImpl implements ProductPkg {
  /**
   * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimestamp()
   * @generated
   * @ordered
   */
  protected static final String TIMESTAMP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimestamp()
   * @generated
   * @ordered
   */
  protected String timestamp = TIMESTAMP_EDEFAULT;

  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTag()
   * @generated
   * @ordered
   */
  protected static final String TAG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTag()
   * @generated
   * @ordered
   */
  protected String tag = TAG_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProductPkgImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return DataPackage.Literals.PRODUCT_PKG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTimestamp() {
    return timestamp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTimestamp(String newTimestamp) {
    String oldTimestamp = timestamp;
    timestamp = newTimestamp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.PRODUCT_PKG__TIMESTAMP, oldTimestamp, timestamp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId() {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId) {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.PRODUCT_PKG__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTag() {
    return tag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTag(String newTag) {
    String oldTag = tag;
    tag = newTag;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.PRODUCT_PKG__TAG, oldTag, tag));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProductPkg> getOwnedProductPkgs() {
    if (ownedProductPkgs == null) {
      ownedProductPkgs = new EObjectContainmentEList<ProductPkg>(ProductPkg.class, this, DataPackage.PRODUCT_PKG__OWNED_PRODUCT_PKGS);
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
      ownedProducts = new EObjectContainmentEList<Product>(Product.class, this, DataPackage.PRODUCT_PKG__OWNED_PRODUCTS);
    }
    return ownedProducts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case DataPackage.PRODUCT_PKG__OWNED_PRODUCT_PKGS:
        return ((InternalEList<?>)getOwnedProductPkgs()).basicRemove(otherEnd, msgs);
      case DataPackage.PRODUCT_PKG__OWNED_PRODUCTS:
        return ((InternalEList<?>)getOwnedProducts()).basicRemove(otherEnd, msgs);
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
      case DataPackage.PRODUCT_PKG__TIMESTAMP:
        return getTimestamp();
      case DataPackage.PRODUCT_PKG__ID:
        return getId();
      case DataPackage.PRODUCT_PKG__TAG:
        return getTag();
      case DataPackage.PRODUCT_PKG__OWNED_PRODUCT_PKGS:
        return getOwnedProductPkgs();
      case DataPackage.PRODUCT_PKG__OWNED_PRODUCTS:
        return getOwnedProducts();
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
      case DataPackage.PRODUCT_PKG__TIMESTAMP:
        setTimestamp((String)newValue);
        return;
      case DataPackage.PRODUCT_PKG__ID:
        setId((String)newValue);
        return;
      case DataPackage.PRODUCT_PKG__TAG:
        setTag((String)newValue);
        return;
      case DataPackage.PRODUCT_PKG__OWNED_PRODUCT_PKGS:
        getOwnedProductPkgs().clear();
        getOwnedProductPkgs().addAll((Collection<? extends ProductPkg>)newValue);
        return;
      case DataPackage.PRODUCT_PKG__OWNED_PRODUCTS:
        getOwnedProducts().clear();
        getOwnedProducts().addAll((Collection<? extends Product>)newValue);
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
      case DataPackage.PRODUCT_PKG__TIMESTAMP:
        setTimestamp(TIMESTAMP_EDEFAULT);
        return;
      case DataPackage.PRODUCT_PKG__ID:
        setId(ID_EDEFAULT);
        return;
      case DataPackage.PRODUCT_PKG__TAG:
        setTag(TAG_EDEFAULT);
        return;
      case DataPackage.PRODUCT_PKG__OWNED_PRODUCT_PKGS:
        getOwnedProductPkgs().clear();
        return;
      case DataPackage.PRODUCT_PKG__OWNED_PRODUCTS:
        getOwnedProducts().clear();
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
      case DataPackage.PRODUCT_PKG__TIMESTAMP:
        return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
      case DataPackage.PRODUCT_PKG__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case DataPackage.PRODUCT_PKG__TAG:
        return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
      case DataPackage.PRODUCT_PKG__OWNED_PRODUCT_PKGS:
        return ownedProductPkgs != null && !ownedProductPkgs.isEmpty();
      case DataPackage.PRODUCT_PKG__OWNED_PRODUCTS:
        return ownedProducts != null && !ownedProducts.isEmpty();
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
    if (baseClass == Timestamp.class) {
      switch (derivedFeatureID) {
        case DataPackage.PRODUCT_PKG__TIMESTAMP: return DataPackage.TIMESTAMP__TIMESTAMP;
        default: return -1;
      }
    }
    if (baseClass == AbstractItem.class) {
      switch (derivedFeatureID) {
        case DataPackage.PRODUCT_PKG__ID: return DataPackage.ABSTRACT_ITEM__ID;
        case DataPackage.PRODUCT_PKG__TAG: return DataPackage.ABSTRACT_ITEM__TAG;
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
    if (baseClass == Timestamp.class) {
      switch (baseFeatureID) {
        case DataPackage.TIMESTAMP__TIMESTAMP: return DataPackage.PRODUCT_PKG__TIMESTAMP;
        default: return -1;
      }
    }
    if (baseClass == AbstractItem.class) {
      switch (baseFeatureID) {
        case DataPackage.ABSTRACT_ITEM__ID: return DataPackage.PRODUCT_PKG__ID;
        case DataPackage.ABSTRACT_ITEM__TAG: return DataPackage.PRODUCT_PKG__TAG;
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
    result.append(" (timestamp: ");
    result.append(timestamp);
    result.append(", id: ");
    result.append(id);
    result.append(", tag: ");
    result.append(tag);
    result.append(')');
    return result.toString();
  }

} //ProductPkgImpl
