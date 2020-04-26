/**
 */
package org.pdulvp.basic;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.basic.Package#getOwnedClasses <em>Owned Classes</em>}</li>
 *   <li>{@link org.pdulvp.basic.Package#getOwnedInterfaces <em>Owned Interfaces</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.basic.basicPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends AbstractItem {
	/**
	 * Returns the value of the '<em><b>Owned Classes</b></em>' reference list.
	 * The list contents are of type {@link org.pdulvp.basic.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Classes</em>' reference list.
	 * @see org.pdulvp.basic.basicPackage#getPackage_OwnedClasses()
	 * @model
	 * @generated
	 */
	EList<org.pdulvp.basic.Class> getOwnedClasses();

	/**
	 * Returns the value of the '<em><b>Owned Interfaces</b></em>' reference list.
	 * The list contents are of type {@link org.pdulvp.basic.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Interfaces</em>' reference list.
	 * @see org.pdulvp.basic.basicPackage#getPackage_OwnedInterfaces()
	 * @model
	 * @generated
	 */
	EList<Interface> getOwnedInterfaces();

} // Package
