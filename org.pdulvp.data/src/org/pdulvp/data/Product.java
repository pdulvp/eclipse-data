/**
 */
package org.pdulvp.data;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.Product#getOwnedProducts <em>Owned Products</em>}</li>
 *   <li>{@link org.pdulvp.data.Product#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.data.DataPackage#getProduct()
 * @model annotation="database db_table='products'"
 * @generated
 */
public interface Product extends NamedItem, AbstractItem {

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
   * @see org.pdulvp.data.DataPackage#getProduct_OwnedProducts()
   * @model containment="true"
   * @generated
   */
  EList<Product> getOwnedProducts();

  /**
   * Returns the value of the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' reference.
   * @see #setParent(Product)
   * @see org.pdulvp.data.DataPackage#getProduct_Parent()
   * @model annotation="database db_id='parentId'"
   * @generated
   */
  Product getParent();

  /**
   * Sets the value of the '{@link org.pdulvp.data.Product#getParent <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' reference.
   * @see #getParent()
   * @generated
   */
  void setParent(Product value);
} // Product
