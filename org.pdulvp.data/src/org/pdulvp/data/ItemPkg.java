/**
 */
package org.pdulvp.data;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Pkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.ItemPkg#getOwnedItemPkgs <em>Owned Item Pkgs</em>}</li>
 *   <li>{@link org.pdulvp.data.ItemPkg#getOwnedItems <em>Owned Items</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.data.DataPackage#getItemPkg()
 * @model
 * @generated
 */
public interface ItemPkg extends NamedItem, AbstractItem {
	/**
   * Returns the value of the '<em><b>Owned Items</b></em>' containment reference list.
   * The list contents are of type {@link org.pdulvp.data.ChildItem}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Items</em>' containment reference list.
   * @see org.pdulvp.data.DataPackage#getItemPkg_OwnedItems()
   * @model containment="true"
   * @generated
   */
	EList<ChildItem> getOwnedItems();

	/**
   * Returns the value of the '<em><b>Owned Item Pkgs</b></em>' containment reference list.
   * The list contents are of type {@link org.pdulvp.data.ItemPkg}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Item Pkgs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Item Pkgs</em>' containment reference list.
   * @see org.pdulvp.data.DataPackage#getItemPkg_OwnedItemPkgs()
   * @model containment="true"
   * @generated
   */
	EList<ItemPkg> getOwnedItemPkgs();

} // ItemPkg
