/**
 */
package org.pdulvp.data;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paginated Screen List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.PaginatedScreenList#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.data.DataPackage#getPaginatedScreenList()
 * @model
 * @generated
 */
public interface PaginatedScreenList extends ScreenList {
	/**
   * Returns the value of the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' attribute.
   * @see #setIndex(int)
   * @see org.pdulvp.data.DataPackage#getPaginatedScreenList_Index()
   * @model
   * @generated
   */
	int getIndex();

	/**
   * Sets the value of the '{@link org.pdulvp.data.PaginatedScreenList#getIndex <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' attribute.
   * @see #getIndex()
   * @generated
   */
	void setIndex(int value);

} // PaginatedScreenList
