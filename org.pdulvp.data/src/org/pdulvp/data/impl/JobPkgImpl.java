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
import org.pdulvp.data.Job;
import org.pdulvp.data.JobPkg;
import org.pdulvp.data.NamedItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job Pkg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.impl.JobPkgImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.JobPkgImpl#getName_frFR <em>Name fr FR</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.JobPkgImpl#getOwnedJobs <em>Owned Jobs</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.JobPkgImpl#getOwnedJobPkgs <em>Owned Job Pkgs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobPkgImpl extends AbstractItemImpl implements JobPkg {
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JobPkgImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return DataPackage.Literals.JOB_PKG;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.JOB_PKG__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.JOB_PKG__NAME_FR_FR, oldName_frFR, name_frFR));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Job> getOwnedJobs() {
    if (ownedJobs == null) {
      ownedJobs = new EObjectContainmentEList<Job>(Job.class, this, DataPackage.JOB_PKG__OWNED_JOBS);
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
      ownedJobPkgs = new EObjectContainmentEList<JobPkg>(JobPkg.class, this, DataPackage.JOB_PKG__OWNED_JOB_PKGS);
    }
    return ownedJobPkgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case DataPackage.JOB_PKG__OWNED_JOBS:
        return ((InternalEList<?>)getOwnedJobs()).basicRemove(otherEnd, msgs);
      case DataPackage.JOB_PKG__OWNED_JOB_PKGS:
        return ((InternalEList<?>)getOwnedJobPkgs()).basicRemove(otherEnd, msgs);
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
      case DataPackage.JOB_PKG__NAME:
        return getName();
      case DataPackage.JOB_PKG__NAME_FR_FR:
        return getName_frFR();
      case DataPackage.JOB_PKG__OWNED_JOBS:
        return getOwnedJobs();
      case DataPackage.JOB_PKG__OWNED_JOB_PKGS:
        return getOwnedJobPkgs();
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
      case DataPackage.JOB_PKG__NAME:
        setName((String)newValue);
        return;
      case DataPackage.JOB_PKG__NAME_FR_FR:
        setName_frFR((String)newValue);
        return;
      case DataPackage.JOB_PKG__OWNED_JOBS:
        getOwnedJobs().clear();
        getOwnedJobs().addAll((Collection<? extends Job>)newValue);
        return;
      case DataPackage.JOB_PKG__OWNED_JOB_PKGS:
        getOwnedJobPkgs().clear();
        getOwnedJobPkgs().addAll((Collection<? extends JobPkg>)newValue);
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
      case DataPackage.JOB_PKG__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DataPackage.JOB_PKG__NAME_FR_FR:
        setName_frFR(NAME_FR_FR_EDEFAULT);
        return;
      case DataPackage.JOB_PKG__OWNED_JOBS:
        getOwnedJobs().clear();
        return;
      case DataPackage.JOB_PKG__OWNED_JOB_PKGS:
        getOwnedJobPkgs().clear();
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
      case DataPackage.JOB_PKG__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DataPackage.JOB_PKG__NAME_FR_FR:
        return NAME_FR_FR_EDEFAULT == null ? name_frFR != null : !NAME_FR_FR_EDEFAULT.equals(name_frFR);
      case DataPackage.JOB_PKG__OWNED_JOBS:
        return ownedJobs != null && !ownedJobs.isEmpty();
      case DataPackage.JOB_PKG__OWNED_JOB_PKGS:
        return ownedJobPkgs != null && !ownedJobPkgs.isEmpty();
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
        case DataPackage.JOB_PKG__NAME: return DataPackage.NAMED_ITEM__NAME;
        case DataPackage.JOB_PKG__NAME_FR_FR: return DataPackage.NAMED_ITEM__NAME_FR_FR;
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
        case DataPackage.NAMED_ITEM__NAME: return DataPackage.JOB_PKG__NAME;
        case DataPackage.NAMED_ITEM__NAME_FR_FR: return DataPackage.JOB_PKG__NAME_FR_FR;
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

} //JobPkgImpl
