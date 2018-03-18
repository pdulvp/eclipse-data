/**
 */
package org.pdulvp.data;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Pkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.RequestPkg#getOwnedRequests <em>Owned Requests</em>}</li>
 *   <li>{@link org.pdulvp.data.RequestPkg#getOwnedRequestPkgs <em>Owned Request Pkgs</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.data.DataPackage#getRequestPkg()
 * @model
 * @generated
 */
public interface RequestPkg extends AbstractItem, NamedItem {
  /**
   * Returns the value of the '<em><b>Owned Requests</b></em>' containment reference list.
   * The list contents are of type {@link org.pdulvp.data.Request}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Requests</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Requests</em>' containment reference list.
   * @see org.pdulvp.data.DataPackage#getRequestPkg_OwnedRequests()
   * @model containment="true"
   * @generated
   */
  EList<Request> getOwnedRequests();

  /**
   * Returns the value of the '<em><b>Owned Request Pkgs</b></em>' containment reference list.
   * The list contents are of type {@link org.pdulvp.data.RequestPkg}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Request Pkgs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Request Pkgs</em>' containment reference list.
   * @see org.pdulvp.data.DataPackage#getRequestPkg_OwnedRequestPkgs()
   * @model containment="true"
   * @generated
   */
  EList<RequestPkg> getOwnedRequestPkgs();

} // RequestPkg
