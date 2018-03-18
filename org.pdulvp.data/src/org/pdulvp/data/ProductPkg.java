/**
 */
package org.pdulvp.data;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Pkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.ProductPkg#getOwnedProductPkgs <em>Owned Product Pkgs</em>}</li>
 *   <li>{@link org.pdulvp.data.ProductPkg#getOwnedProducts <em>Owned Products</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.data.DataPackage#getProductPkg()
 * @model
 * @generated
 */
public interface ProductPkg extends NamedItem, AbstractItem {
  /**
   * Returns the value of the '<em><b>Owned Product Pkgs</b></em>' containment reference list.
   * The list contents are of type {@link org.pdulvp.data.ProductPkg}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Product Pkgs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Product Pkgs</em>' containment reference list.
   * @see org.pdulvp.data.DataPackage#getProductPkg_OwnedProductPkgs()
   * @model containment="true"
   * @generated
   */
  EList<ProductPkg> getOwnedProductPkgs();

  /**
   * Returns the value of the '<em><b>Owned Products</b></em>' containment reference list.
   * The list contents are of type {@link org.pdulvp.data.Product}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Products</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Products</em>' containment reference list.
   * @see org.pdulvp.data.DataPackage#getProductPkg_OwnedProducts()
   * @model containment="true"
   * @generated
   */
  EList<Product> getOwnedProducts();

} // ProductPkg
