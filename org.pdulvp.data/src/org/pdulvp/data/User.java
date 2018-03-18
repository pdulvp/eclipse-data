/**
 */
package org.pdulvp.data;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.User#getMail <em>Mail</em>}</li>
 *   <li>{@link org.pdulvp.data.User#getPassword <em>Password</em>}</li>
 *   <li>{@link org.pdulvp.data.User#getFavouriteCategories <em>Favourite Categories</em>}</li>
 *   <li>{@link org.pdulvp.data.User#getFavouriteItems <em>Favourite Items</em>}</li>
 *   <li>{@link org.pdulvp.data.User#getClickedItems <em>Clicked Items</em>}</li>
 *   <li>{@link org.pdulvp.data.User#getWidgetedItems <em>Widgeted Items</em>}</li>
 *   <li>{@link org.pdulvp.data.User#getGcm <em>Gcm</em>}</li>
 *   <li>{@link org.pdulvp.data.User#getIdentifiers <em>Identifiers</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.data.DataPackage#getUser()
 * @model annotation="database db_table='users'"
 * @generated
 */
public interface User extends AbstractItem {
	/**
   * Returns the value of the '<em><b>Mail</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Mail</em>' attribute.
   * @see #setMail(String)
   * @see org.pdulvp.data.DataPackage#getUser_Mail()
   * @model annotation="database db_id='mail'"
   * @generated
   */
	String getMail();

	/**
   * Sets the value of the '{@link org.pdulvp.data.User#getMail <em>Mail</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mail</em>' attribute.
   * @see #getMail()
   * @generated
   */
	void setMail(String value);

	/**
   * Returns the value of the '<em><b>Password</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Password</em>' attribute.
   * @see #setPassword(String)
   * @see org.pdulvp.data.DataPackage#getUser_Password()
   * @model annotation="database db_id='password'"
   * @generated
   */
	String getPassword();

	/**
   * Sets the value of the '{@link org.pdulvp.data.User#getPassword <em>Password</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Password</em>' attribute.
   * @see #getPassword()
   * @generated
   */
	void setPassword(String value);

	/**
   * Returns the value of the '<em><b>Favourite Categories</b></em>' reference list.
   * The list contents are of type {@link org.pdulvp.data.Category}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Favourite Categories</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Favourite Categories</em>' reference list.
   * @see org.pdulvp.data.DataPackage#getUser_FavouriteCategories()
   * @model annotation="database db_table='favouriteCategories'"
   * @generated
   */
	EList<Category> getFavouriteCategories();

	/**
   * Returns the value of the '<em><b>Favourite Items</b></em>' reference list.
   * The list contents are of type {@link org.pdulvp.data.ImageItem}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Favourite Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Favourite Items</em>' reference list.
   * @see org.pdulvp.data.DataPackage#getUser_FavouriteItems()
   * @model annotation="database db_table='favouriteItems'"
   * @generated
   */
	EList<ImageItem> getFavouriteItems();

	/**
   * Returns the value of the '<em><b>Clicked Items</b></em>' reference list.
   * The list contents are of type {@link org.pdulvp.data.ImageItem}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clicked Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Clicked Items</em>' reference list.
   * @see org.pdulvp.data.DataPackage#getUser_ClickedItems()
   * @model annotation="database db_table='usersClickedItems'"
   * @generated
   */
	EList<ImageItem> getClickedItems();

	/**
   * Returns the value of the '<em><b>Widgeted Items</b></em>' reference list.
   * The list contents are of type {@link org.pdulvp.data.ImageItem}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widgeted Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Widgeted Items</em>' reference list.
   * @see org.pdulvp.data.DataPackage#getUser_WidgetedItems()
   * @model annotation="database db_table='usersWidgetedItems'"
   * @generated
   */
	EList<ImageItem> getWidgetedItems();

	/**
   * Returns the value of the '<em><b>Gcm</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gcm</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Gcm</em>' attribute list.
   * @see org.pdulvp.data.DataPackage#getUser_Gcm()
   * @model annotation="database db_table='usersGcm' db_id='usersGcm'"
   * @generated
   */
	EList<String> getGcm();

	/**
   * Returns the value of the '<em><b>Identifiers</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifiers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Identifiers</em>' attribute.
   * @see #setIdentifiers(String)
   * @see org.pdulvp.data.DataPackage#getUser_Identifiers()
   * @model annotation="database db_id='identifiers'"
   * @generated
   */
	String getIdentifiers();

	/**
   * Sets the value of the '{@link org.pdulvp.data.User#getIdentifiers <em>Identifiers</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifiers</em>' attribute.
   * @see #getIdentifiers()
   * @generated
   */
	void setIdentifiers(String value);

} // User
