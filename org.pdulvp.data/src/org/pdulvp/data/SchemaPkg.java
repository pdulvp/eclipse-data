/**
 */
package org.pdulvp.data;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema Pkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.SchemaPkg#getOwnedSchemas <em>Owned Schemas</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.data.DataPackage#getSchemaPkg()
 * @model
 * @generated
 */
public interface SchemaPkg extends AbstractItem, NamedItem {
  /**
   * Returns the value of the '<em><b>Owned Schemas</b></em>' containment reference list.
   * The list contents are of type {@link org.pdulvp.data.Schema}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Schemas</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Schemas</em>' containment reference list.
   * @see org.pdulvp.data.DataPackage#getSchemaPkg_OwnedSchemas()
   * @model containment="true"
   * @generated
   */
  EList<Schema> getOwnedSchemas();

} // SchemaPkg
