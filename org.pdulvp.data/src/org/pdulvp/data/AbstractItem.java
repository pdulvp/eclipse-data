/**
 */
package org.pdulvp.data;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.AbstractItem#getId <em>Id</em>}</li>
 *   <li>{@link org.pdulvp.data.AbstractItem#getTag <em>Tag</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.data.DataPackage#getAbstractItem()
 * @model abstract="true"
 * @generated
 */
public interface AbstractItem extends Timestamp {
	/**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.pdulvp.data.DataPackage#getAbstractItem_Id()
   * @model id="true"
   *        annotation="database db_id='id'"
   * @generated
   */
	String getId();

	/**
   * Sets the value of the '{@link org.pdulvp.data.AbstractItem#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
	void setId(String value);

	/**
   * Returns the value of the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Tag</em>' attribute.
   * @see #setTag(String)
   * @see org.pdulvp.data.DataPackage#getAbstractItem_Tag()
   * @model annotation="database db_id='tag'"
   * @generated
   */
	String getTag();

	/**
   * Sets the value of the '{@link org.pdulvp.data.AbstractItem#getTag <em>Tag</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tag</em>' attribute.
   * @see #getTag()
   * @generated
   */
	void setTag(String value);

} // AbstractItem
