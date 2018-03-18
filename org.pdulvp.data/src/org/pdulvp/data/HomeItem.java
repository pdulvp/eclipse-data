/**
 */
package org.pdulvp.data;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Home Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.HomeItem#getApplication <em>Application</em>}</li>
 *   <li>{@link org.pdulvp.data.HomeItem#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.data.DataPackage#getHomeItem()
 * @model annotation="database db_table='homes'"
 * @generated
 */
public interface HomeItem extends AbstractItem {
  /**
   * Returns the value of the '<em><b>Application</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Application</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Application</em>' reference.
   * @see #setApplication(Application)
   * @see org.pdulvp.data.DataPackage#getHomeItem_Application()
   * @model annotation="database db_id='applicationId'"
   * @generated
   */
  Application getApplication();

  /**
   * Sets the value of the '{@link org.pdulvp.data.HomeItem#getApplication <em>Application</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Application</em>' reference.
   * @see #getApplication()
   * @generated
   */
  void setApplication(Application value);

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
   * @see org.pdulvp.data.DataPackage#getHomeItem_Category()
   * @model annotation="database db_id='categoryId'"
   * @generated
   */
  Category getCategory();

  /**
   * Sets the value of the '{@link org.pdulvp.data.HomeItem#getCategory <em>Category</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Category</em>' reference.
   * @see #getCategory()
   * @generated
   */
  void setCategory(Category value);

} // HomeItem
