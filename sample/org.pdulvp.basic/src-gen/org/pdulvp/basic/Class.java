/**
 */
package org.pdulvp.basic;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.basic.Class#getOwnedProperties <em>Owned Properties</em>}</li>
 *   <li>{@link org.pdulvp.basic.Class#getImplements <em>Implements</em>}</li>
 *   <li>{@link org.pdulvp.basic.Class#getExtend <em>Extend</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.basic.basicPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends AbstractItem {
	/**
	 * Returns the value of the '<em><b>Owned Properties</b></em>' reference list.
	 * The list contents are of type {@link org.pdulvp.basic.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Properties</em>' reference list.
	 * @see org.pdulvp.basic.basicPackage#getClass_OwnedProperties()
	 * @model
	 * @generated
	 */
	EList<Property> getOwnedProperties();

	/**
	 * Returns the value of the '<em><b>Implements</b></em>' reference list.
	 * The list contents are of type {@link org.pdulvp.basic.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' reference list.
	 * @see org.pdulvp.basic.basicPackage#getClass_Implements()
	 * @model
	 * @generated
	 */
	EList<Interface> getImplements();

	/**
	 * Returns the value of the '<em><b>Extend</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extend</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extend</em>' reference.
	 * @see #setExtend(Class)
	 * @see org.pdulvp.basic.basicPackage#getClass_Extend()
	 * @model
	 * @generated
	 */
	Class getExtend();

	/**
	 * Sets the value of the '{@link org.pdulvp.basic.Class#getExtend <em>Extend</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extend</em>' reference.
	 * @see #getExtend()
	 * @generated
	 */
	void setExtend(Class value);

} // Class
