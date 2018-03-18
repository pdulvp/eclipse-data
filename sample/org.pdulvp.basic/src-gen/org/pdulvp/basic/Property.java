/**
 */
package org.pdulvp.basic;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.basic.Property#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.basic.basicPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends AbstractItem {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(org.pdulvp.basic.Class)
	 * @see org.pdulvp.basic.basicPackage#getProperty_Type()
	 * @model
	 * @generated
	 */
	org.pdulvp.basic.Class getType();

	/**
	 * Sets the value of the '{@link org.pdulvp.basic.Property#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(org.pdulvp.basic.Class value);

} // Property
