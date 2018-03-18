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
import org.pdulvp.data.Screen;
import org.pdulvp.data.ScreenPkg;
import org.pdulvp.data.Timestamp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Screen Pkg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.impl.ScreenPkgImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ScreenPkgImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ScreenPkgImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ScreenPkgImpl#getOwnedScreenPkgs <em>Owned Screen Pkgs</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ScreenPkgImpl#getOwnedScreens <em>Owned Screens</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScreenPkgImpl extends NamedItemImpl implements ScreenPkg {
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScreenPkgImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return DataPackage.Literals.SCREEN_PKG;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.SCREEN_PKG__TIMESTAMP, oldTimestamp, timestamp));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.SCREEN_PKG__ID, oldId, id));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.SCREEN_PKG__TAG, oldTag, tag));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ScreenPkg> getOwnedScreenPkgs() {
    if (ownedScreenPkgs == null) {
      ownedScreenPkgs = new EObjectContainmentEList<ScreenPkg>(ScreenPkg.class, this, DataPackage.SCREEN_PKG__OWNED_SCREEN_PKGS);
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
      ownedScreens = new EObjectContainmentEList<Screen>(Screen.class, this, DataPackage.SCREEN_PKG__OWNED_SCREENS);
    }
    return ownedScreens;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case DataPackage.SCREEN_PKG__OWNED_SCREEN_PKGS:
        return ((InternalEList<?>)getOwnedScreenPkgs()).basicRemove(otherEnd, msgs);
      case DataPackage.SCREEN_PKG__OWNED_SCREENS:
        return ((InternalEList<?>)getOwnedScreens()).basicRemove(otherEnd, msgs);
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
      case DataPackage.SCREEN_PKG__TIMESTAMP:
        return getTimestamp();
      case DataPackage.SCREEN_PKG__ID:
        return getId();
      case DataPackage.SCREEN_PKG__TAG:
        return getTag();
      case DataPackage.SCREEN_PKG__OWNED_SCREEN_PKGS:
        return getOwnedScreenPkgs();
      case DataPackage.SCREEN_PKG__OWNED_SCREENS:
        return getOwnedScreens();
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
      case DataPackage.SCREEN_PKG__TIMESTAMP:
        setTimestamp((String)newValue);
        return;
      case DataPackage.SCREEN_PKG__ID:
        setId((String)newValue);
        return;
      case DataPackage.SCREEN_PKG__TAG:
        setTag((String)newValue);
        return;
      case DataPackage.SCREEN_PKG__OWNED_SCREEN_PKGS:
        getOwnedScreenPkgs().clear();
        getOwnedScreenPkgs().addAll((Collection<? extends ScreenPkg>)newValue);
        return;
      case DataPackage.SCREEN_PKG__OWNED_SCREENS:
        getOwnedScreens().clear();
        getOwnedScreens().addAll((Collection<? extends Screen>)newValue);
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
      case DataPackage.SCREEN_PKG__TIMESTAMP:
        setTimestamp(TIMESTAMP_EDEFAULT);
        return;
      case DataPackage.SCREEN_PKG__ID:
        setId(ID_EDEFAULT);
        return;
      case DataPackage.SCREEN_PKG__TAG:
        setTag(TAG_EDEFAULT);
        return;
      case DataPackage.SCREEN_PKG__OWNED_SCREEN_PKGS:
        getOwnedScreenPkgs().clear();
        return;
      case DataPackage.SCREEN_PKG__OWNED_SCREENS:
        getOwnedScreens().clear();
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
      case DataPackage.SCREEN_PKG__TIMESTAMP:
        return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
      case DataPackage.SCREEN_PKG__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case DataPackage.SCREEN_PKG__TAG:
        return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
      case DataPackage.SCREEN_PKG__OWNED_SCREEN_PKGS:
        return ownedScreenPkgs != null && !ownedScreenPkgs.isEmpty();
      case DataPackage.SCREEN_PKG__OWNED_SCREENS:
        return ownedScreens != null && !ownedScreens.isEmpty();
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
        case DataPackage.SCREEN_PKG__TIMESTAMP: return DataPackage.TIMESTAMP__TIMESTAMP;
        default: return -1;
      }
    }
    if (baseClass == AbstractItem.class) {
      switch (derivedFeatureID) {
        case DataPackage.SCREEN_PKG__ID: return DataPackage.ABSTRACT_ITEM__ID;
        case DataPackage.SCREEN_PKG__TAG: return DataPackage.ABSTRACT_ITEM__TAG;
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
        case DataPackage.TIMESTAMP__TIMESTAMP: return DataPackage.SCREEN_PKG__TIMESTAMP;
        default: return -1;
      }
    }
    if (baseClass == AbstractItem.class) {
      switch (baseFeatureID) {
        case DataPackage.ABSTRACT_ITEM__ID: return DataPackage.SCREEN_PKG__ID;
        case DataPackage.ABSTRACT_ITEM__TAG: return DataPackage.SCREEN_PKG__TAG;
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

} //ScreenPkgImpl
