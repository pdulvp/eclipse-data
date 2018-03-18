/**
 */
package org.pdulvp.data.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.pdulvp.data.DataPackage;
import org.pdulvp.data.OAuthToken;
import org.pdulvp.data.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OAuth Token</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.impl.OAuthTokenImpl#getTokenId <em>Token Id</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.OAuthTokenImpl#getDeviceId <em>Device Id</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.OAuthTokenImpl#getUser <em>User</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OAuthTokenImpl extends TimestampImpl implements OAuthToken {
	/**
   * The default value of the '{@link #getTokenId() <em>Token Id</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTokenId()
   * @generated
   * @ordered
   */
	protected static final String TOKEN_ID_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getTokenId() <em>Token Id</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTokenId()
   * @generated
   * @ordered
   */
	protected String tokenId = TOKEN_ID_EDEFAULT;

	/**
   * The default value of the '{@link #getDeviceId() <em>Device Id</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDeviceId()
   * @generated
   * @ordered
   */
	protected static final String DEVICE_ID_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getDeviceId() <em>Device Id</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDeviceId()
   * @generated
   * @ordered
   */
	protected String deviceId = DEVICE_ID_EDEFAULT;

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
	protected OAuthTokenImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return DataPackage.Literals.OAUTH_TOKEN;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getTokenId() {
    return tokenId;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTokenId(String newTokenId) {
    String oldTokenId = tokenId;
    tokenId = newTokenId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.OAUTH_TOKEN__TOKEN_ID, oldTokenId, tokenId));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.OAUTH_TOKEN__USER, oldUser, user));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.OAUTH_TOKEN__USER, oldUser, user));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getDeviceId() {
    return deviceId;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDeviceId(String newDeviceId) {
    String oldDeviceId = deviceId;
    deviceId = newDeviceId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.OAUTH_TOKEN__DEVICE_ID, oldDeviceId, deviceId));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case DataPackage.OAUTH_TOKEN__TOKEN_ID:
        return getTokenId();
      case DataPackage.OAUTH_TOKEN__DEVICE_ID:
        return getDeviceId();
      case DataPackage.OAUTH_TOKEN__USER:
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
      case DataPackage.OAUTH_TOKEN__TOKEN_ID:
        setTokenId((String)newValue);
        return;
      case DataPackage.OAUTH_TOKEN__DEVICE_ID:
        setDeviceId((String)newValue);
        return;
      case DataPackage.OAUTH_TOKEN__USER:
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
      case DataPackage.OAUTH_TOKEN__TOKEN_ID:
        setTokenId(TOKEN_ID_EDEFAULT);
        return;
      case DataPackage.OAUTH_TOKEN__DEVICE_ID:
        setDeviceId(DEVICE_ID_EDEFAULT);
        return;
      case DataPackage.OAUTH_TOKEN__USER:
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
      case DataPackage.OAUTH_TOKEN__TOKEN_ID:
        return TOKEN_ID_EDEFAULT == null ? tokenId != null : !TOKEN_ID_EDEFAULT.equals(tokenId);
      case DataPackage.OAUTH_TOKEN__DEVICE_ID:
        return DEVICE_ID_EDEFAULT == null ? deviceId != null : !DEVICE_ID_EDEFAULT.equals(deviceId);
      case DataPackage.OAUTH_TOKEN__USER:
        return user != null;
    }
    return super.eIsSet(featureID);
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
    result.append(" (tokenId: ");
    result.append(tokenId);
    result.append(", deviceId: ");
    result.append(deviceId);
    result.append(')');
    return result.toString();
  }

} //OAuthTokenImpl
