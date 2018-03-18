/**
 */
package org.pdulvp.data.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.pdulvp.data.Application;
import org.pdulvp.data.DataPackage;
import org.pdulvp.data.HomeScreenList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Home Screen List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.impl.HomeScreenListImpl#getApplication <em>Application</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HomeScreenListImpl extends ScreenListImpl implements HomeScreenList {
	/**
   * The cached value of the '{@link #getApplication() <em>Application</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getApplication()
   * @generated
   * @ordered
   */
  protected Application application;
  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected HomeScreenListImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return DataPackage.Literals.HOME_SCREEN_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Application getApplication() {
    if (application != null && application.eIsProxy()) {
      InternalEObject oldApplication = (InternalEObject)application;
      application = (Application)eResolveProxy(oldApplication);
      if (application != oldApplication) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.HOME_SCREEN_LIST__APPLICATION, oldApplication, application));
      }
    }
    return application;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Application basicGetApplication() {
    return application;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setApplication(Application newApplication) {
    Application oldApplication = application;
    application = newApplication;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.HOME_SCREEN_LIST__APPLICATION, oldApplication, application));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case DataPackage.HOME_SCREEN_LIST__APPLICATION:
        if (resolve) return getApplication();
        return basicGetApplication();
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
      case DataPackage.HOME_SCREEN_LIST__APPLICATION:
        setApplication((Application)newValue);
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
      case DataPackage.HOME_SCREEN_LIST__APPLICATION:
        setApplication((Application)null);
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
      case DataPackage.HOME_SCREEN_LIST__APPLICATION:
        return application != null;
    }
    return super.eIsSet(featureID);
  }

} //HomeScreenListImpl
