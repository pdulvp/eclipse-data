/**
 */
package org.pdulvp.data;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OAuth Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.OAuthToken#getTokenId <em>Token Id</em>}</li>
 *   <li>{@link org.pdulvp.data.OAuthToken#getDeviceId <em>Device Id</em>}</li>
 *   <li>{@link org.pdulvp.data.OAuthToken#getUser <em>User</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.data.DataPackage#getOAuthToken()
 * @model annotation="database db_table='tokens'"
 * @generated
 */
public interface OAuthToken extends Timestamp {
	/**
   * Returns the value of the '<em><b>Token Id</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Token Id</em>' attribute.
   * @see #setTokenId(String)
   * @see org.pdulvp.data.DataPackage#getOAuthToken_TokenId()
   * @model id="true"
   *        annotation="database db_id='tokenId'"
   * @generated
   */
	String getTokenId();

	/**
   * Sets the value of the '{@link org.pdulvp.data.OAuthToken#getTokenId <em>Token Id</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Token Id</em>' attribute.
   * @see #getTokenId()
   * @generated
   */
	void setTokenId(String value);

	/**
   * Returns the value of the '<em><b>User</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>User</em>' reference.
   * @see #setUser(User)
   * @see org.pdulvp.data.DataPackage#getOAuthToken_User()
   * @model annotation="database db_id='userId'"
   * @generated
   */
	User getUser();

	/**
   * Sets the value of the '{@link org.pdulvp.data.OAuthToken#getUser <em>User</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>User</em>' reference.
   * @see #getUser()
   * @generated
   */
	void setUser(User value);

	/**
   * Returns the value of the '<em><b>Device Id</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Device Id</em>' attribute.
   * @see #setDeviceId(String)
   * @see org.pdulvp.data.DataPackage#getOAuthToken_DeviceId()
   * @model annotation="database db_id='deviceId'"
   * @generated
   */
	String getDeviceId();

	/**
   * Sets the value of the '{@link org.pdulvp.data.OAuthToken#getDeviceId <em>Device Id</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Device Id</em>' attribute.
   * @see #getDeviceId()
   * @generated
   */
	void setDeviceId(String value);

} // OAuthToken
