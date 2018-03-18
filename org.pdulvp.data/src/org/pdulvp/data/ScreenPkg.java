/**
 */
package org.pdulvp.data;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Screen Pkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.ScreenPkg#getOwnedScreenPkgs <em>Owned Screen Pkgs</em>}</li>
 *   <li>{@link org.pdulvp.data.ScreenPkg#getOwnedScreens <em>Owned Screens</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.data.DataPackage#getScreenPkg()
 * @model
 * @generated
 */
public interface ScreenPkg extends NamedItem, AbstractItem {
  /**
   * Returns the value of the '<em><b>Owned Screen Pkgs</b></em>' containment reference list.
   * The list contents are of type {@link org.pdulvp.data.ScreenPkg}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Screen Pkgs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Screen Pkgs</em>' containment reference list.
   * @see org.pdulvp.data.DataPackage#getScreenPkg_OwnedScreenPkgs()
   * @model containment="true"
   * @generated
   */
  EList<ScreenPkg> getOwnedScreenPkgs();

  /**
   * Returns the value of the '<em><b>Owned Screens</b></em>' containment reference list.
   * The list contents are of type {@link org.pdulvp.data.Screen}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Screens</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Screens</em>' containment reference list.
   * @see org.pdulvp.data.DataPackage#getScreenPkg_OwnedScreens()
   * @model containment="true"
   * @generated
   */
  EList<Screen> getOwnedScreens();

} // ScreenPkg
