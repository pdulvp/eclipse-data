/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pdulvp.data;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Screen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.Screen#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link org.pdulvp.data.Screen#getFiltering <em>Filtering</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.data.DataPackage#getScreen()
 * @model annotation="database db_table='screens'"
 * @generated
 */
public interface Screen extends NamedItem, AbstractItem {

	/**
   * Returns the value of the '<em><b>Ordering</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordering</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Ordering</em>' attribute.
   * @see #setOrdering(String)
   * @see org.pdulvp.data.DataPackage#getScreen_Ordering()
   * @model annotation="database db_id='ordering'"
   * @generated
   */
	String getOrdering();

	/**
   * Sets the value of the '{@link org.pdulvp.data.Screen#getOrdering <em>Ordering</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ordering</em>' attribute.
   * @see #getOrdering()
   * @generated
   */
	void setOrdering(String value);

	/**
   * Returns the value of the '<em><b>Filtering</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filtering</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Filtering</em>' attribute.
   * @see #setFiltering(String)
   * @see org.pdulvp.data.DataPackage#getScreen_Filtering()
   * @model annotation="database db_id='filtering'"
   * @generated
   */
	String getFiltering();

	/**
   * Sets the value of the '{@link org.pdulvp.data.Screen#getFiltering <em>Filtering</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filtering</em>' attribute.
   * @see #getFiltering()
   * @generated
   */
	void setFiltering(String value);

} // Screen
