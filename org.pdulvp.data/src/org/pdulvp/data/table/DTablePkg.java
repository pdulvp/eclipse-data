/**
 */
package org.pdulvp.data.table;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DTable Pkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.table.DTablePkg#getOwnedTables <em>Owned Tables</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.data.table.TablePackage#getDTablePkg()
 * @model
 * @generated
 */
public interface DTablePkg extends DNamedElement {
  /**
   * Returns the value of the '<em><b>Owned Tables</b></em>' containment reference list.
   * The list contents are of type {@link org.pdulvp.data.table.DTable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Tables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Tables</em>' containment reference list.
   * @see org.pdulvp.data.table.TablePackage#getDTablePkg_OwnedTables()
   * @model containment="true"
   * @generated
   */
  EList<DTable> getOwnedTables();

} // DTablePkg
