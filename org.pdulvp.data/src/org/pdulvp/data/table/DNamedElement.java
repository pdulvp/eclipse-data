/**
 */
package org.pdulvp.data.table;

import org.pdulvp.data.AbstractItem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DNamed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.table.DNamedElement#getDbName <em>Db Name</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.data.table.TablePackage#getDNamedElement()
 * @model
 * @generated
 */
public interface DNamedElement extends AbstractItem {

  /**
   * Returns the value of the '<em><b>Db Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Name</em>' attribute.
   * @see #setDbName(String)
   * @see org.pdulvp.data.table.TablePackage#getDNamedElement_DbName()
   * @model annotation="database db_id='name'"
   * @generated
   */
  String getDbName();

  /**
   * Sets the value of the '{@link org.pdulvp.data.table.DNamedElement#getDbName <em>Db Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Name</em>' attribute.
   * @see #getDbName()
   * @generated
   */
  void setDbName(String value);
} // DNamedElement
