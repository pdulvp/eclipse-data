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
import org.pdulvp.data.ChildItem;
import org.pdulvp.data.DataPackage;
import org.pdulvp.data.ItemPkg;
import org.pdulvp.data.Timestamp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Pkg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.impl.ItemPkgImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ItemPkgImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ItemPkgImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ItemPkgImpl#getOwnedItemPkgs <em>Owned Item Pkgs</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ItemPkgImpl#getOwnedItems <em>Owned Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemPkgImpl extends NamedItemImpl implements ItemPkg {
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
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ItemPkgImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return DataPackage.Literals.ITEM_PKG;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.ITEM_PKG__TIMESTAMP, oldTimestamp, timestamp));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.ITEM_PKG__ID, oldId, id));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.ITEM_PKG__TAG, oldTag, tag));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ChildItem> getOwnedItems() {
    if (ownedItems == null) {
      ownedItems = new EObjectContainmentEList<ChildItem>(ChildItem.class, this, DataPackage.ITEM_PKG__OWNED_ITEMS);
    }
    return ownedItems;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ItemPkg> getOwnedItemPkgs() {
    if (ownedItemPkgs == null) {
      ownedItemPkgs = new EObjectContainmentEList<ItemPkg>(ItemPkg.class, this, DataPackage.ITEM_PKG__OWNED_ITEM_PKGS);
    }
    return ownedItemPkgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case DataPackage.ITEM_PKG__OWNED_ITEM_PKGS:
        return ((InternalEList<?>)getOwnedItemPkgs()).basicRemove(otherEnd, msgs);
      case DataPackage.ITEM_PKG__OWNED_ITEMS:
        return ((InternalEList<?>)getOwnedItems()).basicRemove(otherEnd, msgs);
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
      case DataPackage.ITEM_PKG__TIMESTAMP:
        return getTimestamp();
      case DataPackage.ITEM_PKG__ID:
        return getId();
      case DataPackage.ITEM_PKG__TAG:
        return getTag();
      case DataPackage.ITEM_PKG__OWNED_ITEM_PKGS:
        return getOwnedItemPkgs();
      case DataPackage.ITEM_PKG__OWNED_ITEMS:
        return getOwnedItems();
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
      case DataPackage.ITEM_PKG__TIMESTAMP:
        setTimestamp((String)newValue);
        return;
      case DataPackage.ITEM_PKG__ID:
        setId((String)newValue);
        return;
      case DataPackage.ITEM_PKG__TAG:
        setTag((String)newValue);
        return;
      case DataPackage.ITEM_PKG__OWNED_ITEM_PKGS:
        getOwnedItemPkgs().clear();
        getOwnedItemPkgs().addAll((Collection<? extends ItemPkg>)newValue);
        return;
      case DataPackage.ITEM_PKG__OWNED_ITEMS:
        getOwnedItems().clear();
        getOwnedItems().addAll((Collection<? extends ChildItem>)newValue);
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
      case DataPackage.ITEM_PKG__TIMESTAMP:
        setTimestamp(TIMESTAMP_EDEFAULT);
        return;
      case DataPackage.ITEM_PKG__ID:
        setId(ID_EDEFAULT);
        return;
      case DataPackage.ITEM_PKG__TAG:
        setTag(TAG_EDEFAULT);
        return;
      case DataPackage.ITEM_PKG__OWNED_ITEM_PKGS:
        getOwnedItemPkgs().clear();
        return;
      case DataPackage.ITEM_PKG__OWNED_ITEMS:
        getOwnedItems().clear();
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
      case DataPackage.ITEM_PKG__TIMESTAMP:
        return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
      case DataPackage.ITEM_PKG__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case DataPackage.ITEM_PKG__TAG:
        return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
      case DataPackage.ITEM_PKG__OWNED_ITEM_PKGS:
        return ownedItemPkgs != null && !ownedItemPkgs.isEmpty();
      case DataPackage.ITEM_PKG__OWNED_ITEMS:
        return ownedItems != null && !ownedItems.isEmpty();
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
        case DataPackage.ITEM_PKG__TIMESTAMP: return DataPackage.TIMESTAMP__TIMESTAMP;
        default: return -1;
      }
    }
    if (baseClass == AbstractItem.class) {
      switch (derivedFeatureID) {
        case DataPackage.ITEM_PKG__ID: return DataPackage.ABSTRACT_ITEM__ID;
        case DataPackage.ITEM_PKG__TAG: return DataPackage.ABSTRACT_ITEM__TAG;
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
        case DataPackage.TIMESTAMP__TIMESTAMP: return DataPackage.ITEM_PKG__TIMESTAMP;
        default: return -1;
      }
    }
    if (baseClass == AbstractItem.class) {
      switch (baseFeatureID) {
        case DataPackage.ABSTRACT_ITEM__ID: return DataPackage.ITEM_PKG__ID;
        case DataPackage.ABSTRACT_ITEM__TAG: return DataPackage.ITEM_PKG__TAG;
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

} //ItemPkgImpl
