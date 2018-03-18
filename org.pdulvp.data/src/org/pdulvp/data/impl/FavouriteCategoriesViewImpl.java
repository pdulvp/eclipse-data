/**
 */
package org.pdulvp.data.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.pdulvp.data.DataPackage;
import org.pdulvp.data.FavouriteCategoriesView;
import org.pdulvp.data.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Favourite Categories View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.impl.FavouriteCategoriesViewImpl#getUser <em>User</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FavouriteCategoriesViewImpl extends ScreenListImpl implements FavouriteCategoriesView {
	/**
   * The cached value of the '{@link #getUser() <em>User</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getUser()
   * @generated
   * @ordered
   */
	protected User user;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected FavouriteCategoriesViewImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return DataPackage.Literals.FAVOURITE_CATEGORIES_VIEW;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public User getUser() {
    if (user != null && user.eIsProxy()) {
      InternalEObject oldUser = (InternalEObject)user;
      user = (User)eResolveProxy(oldUser);
      if (user != oldUser) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.FAVOURITE_CATEGORIES_VIEW__USER, oldUser, user));
      }
    }
    return user;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public User basicGetUser() {
    return user;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setUser(User newUser) {
    User oldUser = user;
    user = newUser;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.FAVOURITE_CATEGORIES_VIEW__USER, oldUser, user));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case DataPackage.FAVOURITE_CATEGORIES_VIEW__USER:
        if (resolve) return getUser();
        return basicGetUser();
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
      case DataPackage.FAVOURITE_CATEGORIES_VIEW__USER:
        setUser((User)newValue);
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
      case DataPackage.FAVOURITE_CATEGORIES_VIEW__USER:
        setUser((User)null);
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
      case DataPackage.FAVOURITE_CATEGORIES_VIEW__USER:
        return user != null;
    }
    return super.eIsSet(featureID);
  }

} //FavouriteCategoriesViewImpl
