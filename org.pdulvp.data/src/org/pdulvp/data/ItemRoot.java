/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pdulvp.data;

import org.eclipse.emf.common.util.EList;
import org.pdulvp.data.table.DTablePkg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.ItemRoot#getOwnedApplications <em>Owned Applications</em>}</li>
 *   <li>{@link org.pdulvp.data.ItemRoot#getOwnedScreenLists <em>Owned Screen Lists</em>}</li>
 *   <li>{@link org.pdulvp.data.ItemRoot#getOwnedItemTypes <em>Owned Item Types</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.data.DataPackage#getItemRoot()
 * @model
 * @generated
 */
public interface ItemRoot extends AbstractItem, CategoryPkg, ProductPkg, ItemPkg, ScreenPkg, ItemTypePkg, DTablePkg {
	/**
   * Returns the value of the '<em><b>Owned Applications</b></em>' containment reference list.
   * The list contents are of type {@link org.pdulvp.data.Application}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Applications</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Applications</em>' containment reference list.
   * @see org.pdulvp.data.DataPackage#getItemRoot_OwnedApplications()
   * @model containment="true"
   * @generated
   */
  EList<Application> getOwnedApplications();

  /**
   * Returns the value of the '<em><b>Owned Screen Lists</b></em>' containment reference list.
   * The list contents are of type {@link org.pdulvp.data.ScreenList}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Screen Lists</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Screen Lists</em>' containment reference list.
   * @see org.pdulvp.data.DataPackage#getItemRoot_OwnedScreenLists()
   * @model containment="true"
   * @generated
   */
	EList<ScreenList> getOwnedScreenLists();

	/**
   * Returns the value of the '<em><b>Owned Item Types</b></em>' containment reference list.
   * The list contents are of type {@link org.pdulvp.data.ItemType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Item Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Item Types</em>' containment reference list.
   * @see org.pdulvp.data.DataPackage#getItemRoot_OwnedItemTypes()
   * @model containment="true"
   * @generated
   */
	EList<ItemType> getOwnedItemTypes();

} // ItemRoot
