/**
 */
package org.pdulvp.data.table;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DKey</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.table.DKey#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.data.table.TablePackage#getDKey()
 * @model
 * @generated
 */
public interface DKey extends DNamedElement {
  /**
   * Returns the value of the '<em><b>Features</b></em>' reference list.
   * The list contents are of type {@link org.pdulvp.data.table.DFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' reference list.
   * @see org.pdulvp.data.table.TablePackage#getDKey_Features()
   * @model
   * @generated
   */
  EList<DFeature> getFeatures();

} // DKey
