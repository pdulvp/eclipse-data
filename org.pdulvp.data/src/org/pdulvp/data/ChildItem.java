/**
 */
package org.pdulvp.data;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Child Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.ChildItem#getCategories <em>Categories</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.data.DataPackage#getChildItem()
 * @model abstract="true"
 * @generated
 */
public interface ChildItem extends AbstractItem {

  /**
   * Returns the value of the '<em><b>Categories</b></em>' reference list.
   * The list contents are of type {@link org.pdulvp.data.Category}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Categories</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Categories</em>' reference list.
   * @see org.pdulvp.data.DataPackage#getChildItem_Categories()
   * @model annotation="database db_table='itemsCategories'"
   * @generated
   */
  EList<Category> getCategories();
} // ChildItem
