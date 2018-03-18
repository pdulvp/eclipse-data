/**
 */
package org.pdulvp.data;

import org.eclipse.emf.common.util.EList;
import org.pdulvp.data.table.DTablePkg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.Schema#getDbSchema <em>Db Schema</em>}</li>
 *   <li>{@link org.pdulvp.data.Schema#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.pdulvp.data.Schema#getOwnedClasses <em>Owned Classes</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.data.DataPackage#getSchema()
 * @model
 * @generated
 */
public interface Schema extends AbstractItem, NamedItem, DTablePkg {
  /**
   * Returns the value of the '<em><b>Db Schema</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Schema</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Schema</em>' attribute.
   * @see #setDbSchema(String)
   * @see org.pdulvp.data.DataPackage#getSchema_DbSchema()
   * @model
   * @generated
   */
  String getDbSchema();

  /**
   * Sets the value of the '{@link org.pdulvp.data.Schema#getDbSchema <em>Db Schema</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Schema</em>' attribute.
   * @see #getDbSchema()
   * @generated
   */
  void setDbSchema(String value);

  /**
   * Returns the value of the '<em><b>Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Namespace</em>' attribute.
   * @see #setNamespace(String)
   * @see org.pdulvp.data.DataPackage#getSchema_Namespace()
   * @model
   * @generated
   */
  String getNamespace();

  /**
   * Sets the value of the '{@link org.pdulvp.data.Schema#getNamespace <em>Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Namespace</em>' attribute.
   * @see #getNamespace()
   * @generated
   */
  void setNamespace(String value);

  /**
   * Returns the value of the '<em><b>Owned Classes</b></em>' containment reference list.
   * The list contents are of type {@link org.pdulvp.data.SchemaClass}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Classes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Classes</em>' containment reference list.
   * @see org.pdulvp.data.DataPackage#getSchema_OwnedClasses()
   * @model containment="true"
   * @generated
   */
  EList<SchemaClass> getOwnedClasses();

} // Schema
