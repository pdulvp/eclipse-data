/**
 */
package org.pdulvp.data;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.pdulvp.data.table.DTable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.SchemaClass#getClazz <em>Clazz</em>}</li>
 *   <li>{@link org.pdulvp.data.SchemaClass#getTable <em>Table</em>}</li>
 *   <li>{@link org.pdulvp.data.SchemaClass#getExternalFeatures <em>External Features</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.data.DataPackage#getSchemaClass()
 * @model
 * @generated
 */
public interface SchemaClass extends EObject {
  /**
   * Returns the value of the '<em><b>Clazz</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clazz</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clazz</em>' reference.
   * @see #setClazz(EClass)
   * @see org.pdulvp.data.DataPackage#getSchemaClass_Clazz()
   * @model
   * @generated
   */
  EClass getClazz();

  /**
   * Sets the value of the '{@link org.pdulvp.data.SchemaClass#getClazz <em>Clazz</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Clazz</em>' reference.
   * @see #getClazz()
   * @generated
   */
  void setClazz(EClass value);

  /**
   * Returns the value of the '<em><b>Table</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table</em>' reference.
   * @see #setTable(DTable)
   * @see org.pdulvp.data.DataPackage#getSchemaClass_Table()
   * @model
   * @generated
   */
  DTable getTable();

  /**
   * Sets the value of the '{@link org.pdulvp.data.SchemaClass#getTable <em>Table</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Table</em>' reference.
   * @see #getTable()
   * @generated
   */
  void setTable(DTable value);

  /**
   * Returns the value of the '<em><b>External Features</b></em>' containment reference list.
   * The list contents are of type {@link org.pdulvp.data.SchemaFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>External Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>External Features</em>' containment reference list.
   * @see org.pdulvp.data.DataPackage#getSchemaClass_ExternalFeatures()
   * @model containment="true"
   * @generated
   */
  EList<SchemaFeature> getExternalFeatures();

} // SchemaClass
