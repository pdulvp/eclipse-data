/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pdulvp.data;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Screen List Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.ScreenListGroup#getChecksum <em>Checksum</em>}</li>
 *   <li>{@link org.pdulvp.data.ScreenListGroup#getCategory <em>Category</em>}</li>
 *   <li>{@link org.pdulvp.data.ScreenListGroup#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.data.DataPackage#getScreenListGroup()
 * @model
 * @generated
 */
public interface ScreenListGroup extends NamedItem, AbstractItem {
	/**
   * Returns the value of the '<em><b>Items</b></em>' reference list.
   * The list contents are of type {@link org.pdulvp.data.AbstractItem}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' reference list.
   * @see org.pdulvp.data.DataPackage#getScreenListGroup_Items()
   * @model
   * @generated
   */
	EList<AbstractItem> getItems();

	/**
   * Returns the value of the '<em><b>Checksum</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checksum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Checksum</em>' attribute.
   * @see #setChecksum(String)
   * @see org.pdulvp.data.DataPackage#getScreenListGroup_Checksum()
   * @model
   * @generated
   */
	String getChecksum();

	/**
   * Sets the value of the '{@link org.pdulvp.data.ScreenListGroup#getChecksum <em>Checksum</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Checksum</em>' attribute.
   * @see #getChecksum()
   * @generated
   */
	void setChecksum(String value);

	/**
   * Returns the value of the '<em><b>Category</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Category</em>' reference.
   * @see #setCategory(Category)
   * @see org.pdulvp.data.DataPackage#getScreenListGroup_Category()
   * @model
   * @generated
   */
	Category getCategory();

	/**
   * Sets the value of the '{@link org.pdulvp.data.ScreenListGroup#getCategory <em>Category</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Category</em>' reference.
   * @see #getCategory()
   * @generated
   */
	void setCategory(Category value);

} // ScreenListGroup
