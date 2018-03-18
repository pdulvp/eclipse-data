/**
 */
package org.pdulvp.data;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Styled Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.StyledItem#getStyle <em>Style</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.data.DataPackage#getStyledItem()
 * @model abstract="true"
 * @generated
 */
public interface StyledItem extends AbstractItem {
	/**
   * Returns the value of the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Style</em>' attribute.
   * @see #setStyle(String)
   * @see org.pdulvp.data.DataPackage#getStyledItem_Style()
   * @model annotation="database db_id='style'"
   * @generated
   */
	String getStyle();

	/**
   * Sets the value of the '{@link org.pdulvp.data.StyledItem#getStyle <em>Style</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Style</em>' attribute.
   * @see #getStyle()
   * @generated
   */
	void setStyle(String value);

} // StyledItem
