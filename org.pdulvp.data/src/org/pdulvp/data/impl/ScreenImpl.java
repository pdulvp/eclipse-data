/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pdulvp.data.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.pdulvp.data.AbstractItem;
import org.pdulvp.data.DataPackage;
import org.pdulvp.data.Screen;
import org.pdulvp.data.Timestamp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Screen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.impl.ScreenImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ScreenImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ScreenImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ScreenImpl#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ScreenImpl#getFiltering <em>Filtering</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScreenImpl extends NamedItemImpl implements Screen {
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
   * The default value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getOrdering()
   * @generated
   * @ordered
   */
	protected static final String ORDERING_EDEFAULT = null;
	/**
   * The cached value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getOrdering()
   * @generated
   * @ordered
   */
	protected String ordering = ORDERING_EDEFAULT;

	/**
   * The default value of the '{@link #getFiltering() <em>Filtering</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFiltering()
   * @generated
   * @ordered
   */
	protected static final String FILTERING_EDEFAULT = null;
	/**
   * The cached value of the '{@link #getFiltering() <em>Filtering</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFiltering()
   * @generated
   * @ordered
   */
	protected String filtering = FILTERING_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ScreenImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return DataPackage.Literals.SCREEN;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.SCREEN__TIMESTAMP, oldTimestamp, timestamp));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.SCREEN__ID, oldId, id));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.SCREEN__TAG, oldTag, tag));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getOrdering() {
    return ordering;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setOrdering(String newOrdering) {
    String oldOrdering = ordering;
    ordering = newOrdering;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.SCREEN__ORDERING, oldOrdering, ordering));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getFiltering() {
    return filtering;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFiltering(String newFiltering) {
    String oldFiltering = filtering;
    filtering = newFiltering;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.SCREEN__FILTERING, oldFiltering, filtering));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case DataPackage.SCREEN__TIMESTAMP:
        return getTimestamp();
      case DataPackage.SCREEN__ID:
        return getId();
      case DataPackage.SCREEN__TAG:
        return getTag();
      case DataPackage.SCREEN__ORDERING:
        return getOrdering();
      case DataPackage.SCREEN__FILTERING:
        return getFiltering();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case DataPackage.SCREEN__TIMESTAMP:
        setTimestamp((String)newValue);
        return;
      case DataPackage.SCREEN__ID:
        setId((String)newValue);
        return;
      case DataPackage.SCREEN__TAG:
        setTag((String)newValue);
        return;
      case DataPackage.SCREEN__ORDERING:
        setOrdering((String)newValue);
        return;
      case DataPackage.SCREEN__FILTERING:
        setFiltering((String)newValue);
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
      case DataPackage.SCREEN__TIMESTAMP:
        setTimestamp(TIMESTAMP_EDEFAULT);
        return;
      case DataPackage.SCREEN__ID:
        setId(ID_EDEFAULT);
        return;
      case DataPackage.SCREEN__TAG:
        setTag(TAG_EDEFAULT);
        return;
      case DataPackage.SCREEN__ORDERING:
        setOrdering(ORDERING_EDEFAULT);
        return;
      case DataPackage.SCREEN__FILTERING:
        setFiltering(FILTERING_EDEFAULT);
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
      case DataPackage.SCREEN__TIMESTAMP:
        return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
      case DataPackage.SCREEN__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case DataPackage.SCREEN__TAG:
        return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
      case DataPackage.SCREEN__ORDERING:
        return ORDERING_EDEFAULT == null ? ordering != null : !ORDERING_EDEFAULT.equals(ordering);
      case DataPackage.SCREEN__FILTERING:
        return FILTERING_EDEFAULT == null ? filtering != null : !FILTERING_EDEFAULT.equals(filtering);
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
        case DataPackage.SCREEN__TIMESTAMP: return DataPackage.TIMESTAMP__TIMESTAMP;
        default: return -1;
      }
    }
    if (baseClass == AbstractItem.class) {
      switch (derivedFeatureID) {
        case DataPackage.SCREEN__ID: return DataPackage.ABSTRACT_ITEM__ID;
        case DataPackage.SCREEN__TAG: return DataPackage.ABSTRACT_ITEM__TAG;
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
        case DataPackage.TIMESTAMP__TIMESTAMP: return DataPackage.SCREEN__TIMESTAMP;
        default: return -1;
      }
    }
    if (baseClass == AbstractItem.class) {
      switch (baseFeatureID) {
        case DataPackage.ABSTRACT_ITEM__ID: return DataPackage.SCREEN__ID;
        case DataPackage.ABSTRACT_ITEM__TAG: return DataPackage.SCREEN__TAG;
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
    result.append(", ordering: ");
    result.append(ordering);
    result.append(", filtering: ");
    result.append(filtering);
    result.append(')');
    return result.toString();
  }

} //ScreenImpl
