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
import org.pdulvp.data.ItemType;
import org.pdulvp.data.ItemTypePkg;
import org.pdulvp.data.Timestamp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Type Pkg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.impl.ItemTypePkgImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ItemTypePkgImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ItemTypePkgImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ItemTypePkgImpl#getOwnedTypePkgs <em>Owned Type Pkgs</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ItemTypePkgImpl#getOwnedTypes <em>Owned Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemTypePkgImpl extends NamedItemImpl implements ItemTypePkg {
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ItemTypePkgImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return DataPackage.Literals.ITEM_TYPE_PKG;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.ITEM_TYPE_PKG__TIMESTAMP, oldTimestamp, timestamp));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.ITEM_TYPE_PKG__ID, oldId, id));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.ITEM_TYPE_PKG__TAG, oldTag, tag));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ItemTypePkg> getOwnedTypePkgs() {
    if (ownedTypePkgs == null) {
      ownedTypePkgs = new EObjectContainmentEList<ItemTypePkg>(ItemTypePkg.class, this, DataPackage.ITEM_TYPE_PKG__OWNED_TYPE_PKGS);
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
      ownedTypes = new EObjectContainmentEList<ItemType>(ItemType.class, this, DataPackage.ITEM_TYPE_PKG__OWNED_TYPES);
    }
    return ownedTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case DataPackage.ITEM_TYPE_PKG__OWNED_TYPE_PKGS:
        return ((InternalEList<?>)getOwnedTypePkgs()).basicRemove(otherEnd, msgs);
      case DataPackage.ITEM_TYPE_PKG__OWNED_TYPES:
        return ((InternalEList<?>)getOwnedTypes()).basicRemove(otherEnd, msgs);
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
      case DataPackage.ITEM_TYPE_PKG__TIMESTAMP:
        return getTimestamp();
      case DataPackage.ITEM_TYPE_PKG__ID:
        return getId();
      case DataPackage.ITEM_TYPE_PKG__TAG:
        return getTag();
      case DataPackage.ITEM_TYPE_PKG__OWNED_TYPE_PKGS:
        return getOwnedTypePkgs();
      case DataPackage.ITEM_TYPE_PKG__OWNED_TYPES:
        return getOwnedTypes();
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
      case DataPackage.ITEM_TYPE_PKG__TIMESTAMP:
        setTimestamp((String)newValue);
        return;
      case DataPackage.ITEM_TYPE_PKG__ID:
        setId((String)newValue);
        return;
      case DataPackage.ITEM_TYPE_PKG__TAG:
        setTag((String)newValue);
        return;
      case DataPackage.ITEM_TYPE_PKG__OWNED_TYPE_PKGS:
        getOwnedTypePkgs().clear();
        getOwnedTypePkgs().addAll((Collection<? extends ItemTypePkg>)newValue);
        return;
      case DataPackage.ITEM_TYPE_PKG__OWNED_TYPES:
        getOwnedTypes().clear();
        getOwnedTypes().addAll((Collection<? extends ItemType>)newValue);
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
      case DataPackage.ITEM_TYPE_PKG__TIMESTAMP:
        setTimestamp(TIMESTAMP_EDEFAULT);
        return;
      case DataPackage.ITEM_TYPE_PKG__ID:
        setId(ID_EDEFAULT);
        return;
      case DataPackage.ITEM_TYPE_PKG__TAG:
        setTag(TAG_EDEFAULT);
        return;
      case DataPackage.ITEM_TYPE_PKG__OWNED_TYPE_PKGS:
        getOwnedTypePkgs().clear();
        return;
      case DataPackage.ITEM_TYPE_PKG__OWNED_TYPES:
        getOwnedTypes().clear();
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
      case DataPackage.ITEM_TYPE_PKG__TIMESTAMP:
        return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
      case DataPackage.ITEM_TYPE_PKG__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case DataPackage.ITEM_TYPE_PKG__TAG:
        return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
      case DataPackage.ITEM_TYPE_PKG__OWNED_TYPE_PKGS:
        return ownedTypePkgs != null && !ownedTypePkgs.isEmpty();
      case DataPackage.ITEM_TYPE_PKG__OWNED_TYPES:
        return ownedTypes != null && !ownedTypes.isEmpty();
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
        case DataPackage.ITEM_TYPE_PKG__TIMESTAMP: return DataPackage.TIMESTAMP__TIMESTAMP;
        default: return -1;
      }
    }
    if (baseClass == AbstractItem.class) {
      switch (derivedFeatureID) {
        case DataPackage.ITEM_TYPE_PKG__ID: return DataPackage.ABSTRACT_ITEM__ID;
        case DataPackage.ITEM_TYPE_PKG__TAG: return DataPackage.ABSTRACT_ITEM__TAG;
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
        case DataPackage.TIMESTAMP__TIMESTAMP: return DataPackage.ITEM_TYPE_PKG__TIMESTAMP;
        default: return -1;
      }
    }
    if (baseClass == AbstractItem.class) {
      switch (baseFeatureID) {
        case DataPackage.ABSTRACT_ITEM__ID: return DataPackage.ITEM_TYPE_PKG__ID;
        case DataPackage.ABSTRACT_ITEM__TAG: return DataPackage.ITEM_TYPE_PKG__TAG;
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

} //ItemTypePkgImpl
