/**
 */
package org.pdulvp.data.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.pdulvp.data.CategoryView;
import org.pdulvp.data.DataPackage;
import org.pdulvp.data.Screen;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.impl.CategoryViewImpl#getScreensIds <em>Screens Ids</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.CategoryViewImpl#getScreensNames <em>Screens Names</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CategoryViewImpl extends CategoryImpl implements CategoryView {
	/**
   * The cached value of the '{@link #getScreensIds() <em>Screens Ids</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getScreensIds()
   * @generated
   * @ordered
   */
	protected Screen screensIds;

	/**
   * The cached value of the '{@link #getScreensNames() <em>Screens Names</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getScreensNames()
   * @generated
   * @ordered
   */
	protected Screen screensNames;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected CategoryViewImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return DataPackage.Literals.CATEGORY_VIEW;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Screen getScreensIds() {
    if (screensIds != null && screensIds.eIsProxy()) {
      InternalEObject oldScreensIds = (InternalEObject)screensIds;
      screensIds = (Screen)eResolveProxy(oldScreensIds);
      if (screensIds != oldScreensIds) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.CATEGORY_VIEW__SCREENS_IDS, oldScreensIds, screensIds));
      }
    }
    return screensIds;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Screen basicGetScreensIds() {
    return screensIds;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setScreensIds(Screen newScreensIds) {
    Screen oldScreensIds = screensIds;
    screensIds = newScreensIds;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.CATEGORY_VIEW__SCREENS_IDS, oldScreensIds, screensIds));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Screen getScreensNames() {
    if (screensNames != null && screensNames.eIsProxy()) {
      InternalEObject oldScreensNames = (InternalEObject)screensNames;
      screensNames = (Screen)eResolveProxy(oldScreensNames);
      if (screensNames != oldScreensNames) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.CATEGORY_VIEW__SCREENS_NAMES, oldScreensNames, screensNames));
      }
    }
    return screensNames;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Screen basicGetScreensNames() {
    return screensNames;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setScreensNames(Screen newScreensNames) {
    Screen oldScreensNames = screensNames;
    screensNames = newScreensNames;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.CATEGORY_VIEW__SCREENS_NAMES, oldScreensNames, screensNames));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case DataPackage.CATEGORY_VIEW__SCREENS_IDS:
        if (resolve) return getScreensIds();
        return basicGetScreensIds();
      case DataPackage.CATEGORY_VIEW__SCREENS_NAMES:
        if (resolve) return getScreensNames();
        return basicGetScreensNames();
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
      case DataPackage.CATEGORY_VIEW__SCREENS_IDS:
        setScreensIds((Screen)newValue);
        return;
      case DataPackage.CATEGORY_VIEW__SCREENS_NAMES:
        setScreensNames((Screen)newValue);
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
      case DataPackage.CATEGORY_VIEW__SCREENS_IDS:
        setScreensIds((Screen)null);
        return;
      case DataPackage.CATEGORY_VIEW__SCREENS_NAMES:
        setScreensNames((Screen)null);
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
      case DataPackage.CATEGORY_VIEW__SCREENS_IDS:
        return screensIds != null;
      case DataPackage.CATEGORY_VIEW__SCREENS_NAMES:
        return screensNames != null;
    }
    return super.eIsSet(featureID);
  }

} //CategoryViewImpl
