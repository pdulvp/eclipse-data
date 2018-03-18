/**
 */
package org.pdulvp.data;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Packed Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.PackedItem#getPacks <em>Packs</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.data.DataPackage#getPackedItem()
 * @model abstract="true"
 * @generated
 */
public interface PackedItem extends AbstractItem {
	/**
   * Returns the value of the '<em><b>Packs</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Packs</em>' attribute.
   * @see org.pdulvp.data.DataPackage#getPackedItem_Packs()
   * @model changeable="false" derived="true"
   *        annotation="database db_id='packs' external='true'"
   * @generated
   */
	String getPacks();

} // PackedItem
