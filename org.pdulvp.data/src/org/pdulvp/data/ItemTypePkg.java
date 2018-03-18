/**
 */
package org.pdulvp.data;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Type Pkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.ItemTypePkg#getOwnedTypePkgs <em>Owned Type Pkgs</em>}</li>
 *   <li>{@link org.pdulvp.data.ItemTypePkg#getOwnedTypes <em>Owned Types</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.data.DataPackage#getItemTypePkg()
 * @model
 * @generated
 */
public interface ItemTypePkg extends NamedItem, AbstractItem {
  /**
   * Returns the value of the '<em><b>Owned Type Pkgs</b></em>' containment reference list.
   * The list contents are of type {@link org.pdulvp.data.ItemTypePkg}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Type Pkgs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Type Pkgs</em>' containment reference list.
   * @see org.pdulvp.data.DataPackage#getItemTypePkg_OwnedTypePkgs()
   * @model containment="true"
   * @generated
   */
  EList<ItemTypePkg> getOwnedTypePkgs();

  /**
   * Returns the value of the '<em><b>Owned Types</b></em>' containment reference list.
   * The list contents are of type {@link org.pdulvp.data.ItemType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Types</em>' containment reference list.
   * @see org.pdulvp.data.DataPackage#getItemTypePkg_OwnedTypes()
   * @model containment="true"
   * @generated
   */
  EList<ItemType> getOwnedTypes();

} // ItemTypePkg
