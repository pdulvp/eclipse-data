/**
 */
package org.pdulvp.data;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Favourite Categories View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.FavouriteCategoriesView#getUser <em>User</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.data.DataPackage#getFavouriteCategoriesView()
 * @model annotation="database db_table='favouriteCategoriesView'"
 * @generated
 */
public interface FavouriteCategoriesView extends ScreenList {
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
   * @see org.pdulvp.data.DataPackage#getFavouriteCategoriesView_User()
   * @model annotation="database db_id='userId' toJSON='false'"
   * @generated
   */
	User getUser();

	/**
   * Sets the value of the '{@link org.pdulvp.data.FavouriteCategoriesView#getUser <em>User</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>User</em>' reference.
   * @see #getUser()
   * @generated
   */
	void setUser(User value);

} // FavouriteCategoriesView
