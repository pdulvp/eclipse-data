/**
 */
package org.pdulvp.data;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.ItemProduct#getItem <em>Item</em>}</li>
 *   <li>{@link org.pdulvp.data.ItemProduct#getProduct <em>Product</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.data.DataPackage#getItemProduct()
 * @model annotation="database db_table='itemsProducts'"
 * @generated
 */
public interface ItemProduct extends AbstractItem {
  /**
   * Returns the value of the '<em><b>Item</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Item</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Item</em>' reference.
   * @see #setItem(Item)
   * @see org.pdulvp.data.DataPackage#getItemProduct_Item()
   * @model annotation="database db_id='itemId'"
   * @generated
   */
  Item getItem();

  /**
   * Sets the value of the '{@link org.pdulvp.data.ItemProduct#getItem <em>Item</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Item</em>' reference.
   * @see #getItem()
   * @generated
   */
  void setItem(Item value);

  /**
   * Returns the value of the '<em><b>Product</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Product</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Product</em>' reference.
   * @see #setProduct(Product)
   * @see org.pdulvp.data.DataPackage#getItemProduct_Product()
   * @model annotation="database db_id='productId'"
   * @generated
   */
  Product getProduct();

  /**
   * Sets the value of the '{@link org.pdulvp.data.ItemProduct#getProduct <em>Product</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Product</em>' reference.
   * @see #getProduct()
   * @generated
   */
  void setProduct(Product value);

} // ItemProduct
