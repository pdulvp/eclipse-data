/**
 */
package org.pdulvp.data;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Home</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.Home#getOwnedHomes <em>Owned Homes</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.data.DataPackage#getHome()
 * @model
 * @generated
 */
public interface Home extends AbstractItem {
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
   * @see org.pdulvp.data.DataPackage#getHome_OwnedHomes()
   * @model containment="true"
   * @generated
   */
  EList<HomeItem> getOwnedHomes();

} // Home
