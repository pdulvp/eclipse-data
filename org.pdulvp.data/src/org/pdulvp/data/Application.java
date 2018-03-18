/**
 */
package org.pdulvp.data;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.Application#getOwnedHomes <em>Owned Homes</em>}</li>
 *   <li>{@link org.pdulvp.data.Application#getCategory <em>Category</em>}</li>
 *   <li>{@link org.pdulvp.data.Application#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.pdulvp.data.Application#getServerUrl <em>Server Url</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.data.DataPackage#getApplication()
 * @model annotation="database db_table='applications'"
 * @generated
 */
public interface Application extends AbstractItem, CategoryPkg, ItemPkg, ScreenPkg, JobPkg, RequestPkg, SchemaPkg {

  /**
   * Returns the value of the '<em><b>Owned Homes</b></em>' containment reference list.
   * The list contents are of type {@link org.pdulvp.data.HomeItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Homes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Homes</em>' containment reference list.
   * @see org.pdulvp.data.DataPackage#getApplication_OwnedHomes()
   * @model containment="true"
   * @generated
   */
  EList<HomeItem> getOwnedHomes();

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
   * @see org.pdulvp.data.DataPackage#getApplication_Category()
   * @model
   * @generated
   */
  Category getCategory();

  /**
   * Sets the value of the '{@link org.pdulvp.data.Application#getCategory <em>Category</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Category</em>' reference.
   * @see #getCategory()
   * @generated
   */
  void setCategory(Category value);

  /**
   * Returns the value of the '<em><b>Schema</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Schema</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Schema</em>' reference.
   * @see #setSchema(Schema)
   * @see org.pdulvp.data.DataPackage#getApplication_Schema()
   * @model
   * @generated
   */
  Schema getSchema();

  /**
   * Sets the value of the '{@link org.pdulvp.data.Application#getSchema <em>Schema</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Schema</em>' reference.
   * @see #getSchema()
   * @generated
   */
  void setSchema(Schema value);

  /**
   * Returns the value of the '<em><b>Server Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Server Url</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Server Url</em>' attribute.
   * @see #setServerUrl(String)
   * @see org.pdulvp.data.DataPackage#getApplication_ServerUrl()
   * @model
   * @generated
   */
  String getServerUrl();

  /**
   * Sets the value of the '{@link org.pdulvp.data.Application#getServerUrl <em>Server Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Server Url</em>' attribute.
   * @see #getServerUrl()
   * @generated
   */
  void setServerUrl(String value);
} // Application
