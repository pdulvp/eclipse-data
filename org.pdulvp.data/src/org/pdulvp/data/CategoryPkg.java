/**
 */
package org.pdulvp.data;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category Pkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.CategoryPkg#getOwnedCategoryPkgs <em>Owned Category Pkgs</em>}</li>
 *   <li>{@link org.pdulvp.data.CategoryPkg#getOwnedCategories <em>Owned Categories</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.data.DataPackage#getCategoryPkg()
 * @model
 * @generated
 */
public interface CategoryPkg extends NamedItem, AbstractItem {
  /**
   * Returns the value of the '<em><b>Owned Category Pkgs</b></em>' containment reference list.
   * The list contents are of type {@link org.pdulvp.data.CategoryPkg}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Category Pkgs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Category Pkgs</em>' containment reference list.
   * @see org.pdulvp.data.DataPackage#getCategoryPkg_OwnedCategoryPkgs()
   * @model containment="true"
   * @generated
   */
  EList<CategoryPkg> getOwnedCategoryPkgs();

  /**
   * Returns the value of the '<em><b>Owned Categories</b></em>' containment reference list.
   * The list contents are of type {@link org.pdulvp.data.Category}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Categories</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Categories</em>' containment reference list.
   * @see org.pdulvp.data.DataPackage#getCategoryPkg_OwnedCategories()
   * @model containment="true"
   * @generated
   */
  EList<Category> getOwnedCategories();

} // CategoryPkg
