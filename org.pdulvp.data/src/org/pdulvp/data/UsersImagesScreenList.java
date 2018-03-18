/**
 */
package org.pdulvp.data;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Users Images Screen List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pdulvp.data.UsersImagesScreenList#getUser <em>User</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pdulvp.data.DataPackage#getUsersImagesScreenList()
 * @model annotation="database db_table='userScreensLists'"
 * @generated
 */
public interface UsersImagesScreenList extends ScreenList {
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
	 * @see org.pdulvp.data.DataPackage#getUsersImagesScreenList_User()
	 * @model annotation="database db_id='userId'"
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link org.pdulvp.data.UsersImagesScreenList#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

} // UsersImagesScreenList
