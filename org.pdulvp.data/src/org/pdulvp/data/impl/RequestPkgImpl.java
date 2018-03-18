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
import org.pdulvp.data.DataPackage;
import org.pdulvp.data.NamedItem;
import org.pdulvp.data.Request;
import org.pdulvp.data.RequestPkg;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request Pkg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.impl.RequestPkgImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.RequestPkgImpl#getName_frFR <em>Name fr FR</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.RequestPkgImpl#getOwnedRequests <em>Owned Requests</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.RequestPkgImpl#getOwnedRequestPkgs <em>Owned Request Pkgs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequestPkgImpl extends AbstractItemImpl implements RequestPkg {
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RequestPkgImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return DataPackage.Literals.REQUEST_PKG;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.REQUEST_PKG__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.REQUEST_PKG__NAME_FR_FR, oldName_frFR, name_frFR));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Request> getOwnedRequests() {
    if (ownedRequests == null) {
      ownedRequests = new EObjectContainmentEList<Request>(Request.class, this, DataPackage.REQUEST_PKG__OWNED_REQUESTS);
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
      ownedRequestPkgs = new EObjectContainmentEList<RequestPkg>(RequestPkg.class, this, DataPackage.REQUEST_PKG__OWNED_REQUEST_PKGS);
    }
    return ownedRequestPkgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case DataPackage.REQUEST_PKG__OWNED_REQUESTS:
        return ((InternalEList<?>)getOwnedRequests()).basicRemove(otherEnd, msgs);
      case DataPackage.REQUEST_PKG__OWNED_REQUEST_PKGS:
        return ((InternalEList<?>)getOwnedRequestPkgs()).basicRemove(otherEnd, msgs);
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
      case DataPackage.REQUEST_PKG__NAME:
        return getName();
      case DataPackage.REQUEST_PKG__NAME_FR_FR:
        return getName_frFR();
      case DataPackage.REQUEST_PKG__OWNED_REQUESTS:
        return getOwnedRequests();
      case DataPackage.REQUEST_PKG__OWNED_REQUEST_PKGS:
        return getOwnedRequestPkgs();
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
      case DataPackage.REQUEST_PKG__NAME:
        setName((String)newValue);
        return;
      case DataPackage.REQUEST_PKG__NAME_FR_FR:
        setName_frFR((String)newValue);
        return;
      case DataPackage.REQUEST_PKG__OWNED_REQUESTS:
        getOwnedRequests().clear();
        getOwnedRequests().addAll((Collection<? extends Request>)newValue);
        return;
      case DataPackage.REQUEST_PKG__OWNED_REQUEST_PKGS:
        getOwnedRequestPkgs().clear();
        getOwnedRequestPkgs().addAll((Collection<? extends RequestPkg>)newValue);
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
      case DataPackage.REQUEST_PKG__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DataPackage.REQUEST_PKG__NAME_FR_FR:
        setName_frFR(NAME_FR_FR_EDEFAULT);
        return;
      case DataPackage.REQUEST_PKG__OWNED_REQUESTS:
        getOwnedRequests().clear();
        return;
      case DataPackage.REQUEST_PKG__OWNED_REQUEST_PKGS:
        getOwnedRequestPkgs().clear();
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
      case DataPackage.REQUEST_PKG__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DataPackage.REQUEST_PKG__NAME_FR_FR:
        return NAME_FR_FR_EDEFAULT == null ? name_frFR != null : !NAME_FR_FR_EDEFAULT.equals(name_frFR);
      case DataPackage.REQUEST_PKG__OWNED_REQUESTS:
        return ownedRequests != null && !ownedRequests.isEmpty();
      case DataPackage.REQUEST_PKG__OWNED_REQUEST_PKGS:
        return ownedRequestPkgs != null && !ownedRequestPkgs.isEmpty();
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
        case DataPackage.REQUEST_PKG__NAME: return DataPackage.NAMED_ITEM__NAME;
        case DataPackage.REQUEST_PKG__NAME_FR_FR: return DataPackage.NAMED_ITEM__NAME_FR_FR;
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
        case DataPackage.NAMED_ITEM__NAME: return DataPackage.REQUEST_PKG__NAME;
        case DataPackage.NAMED_ITEM__NAME_FR_FR: return DataPackage.REQUEST_PKG__NAME_FR_FR;
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
    result.append(')');
    return result.toString();
  }

} //RequestPkgImpl
