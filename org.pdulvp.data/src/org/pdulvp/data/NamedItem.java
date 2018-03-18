/**
 */
package org.pdulvp.data;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.NamedItem#getName <em>Name</em>}</li>
 *   <li>{@link org.pdulvp.data.NamedItem#getName_frFR <em>Name fr FR</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.data.DataPackage#getNamedItem()
 * @model abstract="true"
 * @generated
 */
public interface NamedItem extends EObject {
	/**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.pdulvp.data.DataPackage#getNamedItem_Name()
   * @model annotation="database db_id='name'"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.pdulvp.data.NamedItem#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

	/**
   * Returns the value of the '<em><b>Name fr FR</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name fr FR</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Name fr FR</em>' attribute.
   * @see #setName_frFR(String)
   * @see org.pdulvp.data.DataPackage#getNamedItem_Name_frFR()
   * @model annotation="database db_id='namefrFR'"
   * @generated
   */
	String getName_frFR();

	/**
   * Sets the value of the '{@link org.pdulvp.data.NamedItem#getName_frFR <em>Name fr FR</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name fr FR</em>' attribute.
   * @see #getName_frFR()
   * @generated
   */
	void setName_frFR(String value);

} // NamedItem
