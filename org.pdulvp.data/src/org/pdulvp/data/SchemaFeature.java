/**
 */
package org.pdulvp.data;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.pdulvp.data.table.DTable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.SchemaFeature#getTable <em>Table</em>}</li>
 *   <li>{@link org.pdulvp.data.SchemaFeature#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.data.DataPackage#getSchemaFeature()
 * @model
 * @generated
 */
public interface SchemaFeature extends EObject {
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
   * @see org.pdulvp.data.DataPackage#getSchemaFeature_Table()
   * @model
   * @generated
   */
  DTable getTable();

  /**
   * Sets the value of the '{@link org.pdulvp.data.SchemaFeature#getTable <em>Table</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Table</em>' reference.
   * @see #getTable()
   * @generated
   */
  void setTable(DTable value);

  /**
   * Returns the value of the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' reference.
   * @see #setFeature(EStructuralFeature)
   * @see org.pdulvp.data.DataPackage#getSchemaFeature_Feature()
   * @model
   * @generated
   */
  EStructuralFeature getFeature();

  /**
   * Sets the value of the '{@link org.pdulvp.data.SchemaFeature#getFeature <em>Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature</em>' reference.
   * @see #getFeature()
   * @generated
   */
  void setFeature(EStructuralFeature value);

} // SchemaFeature
