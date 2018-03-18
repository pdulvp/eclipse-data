/**
 */
package org.pdulvp.data;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Home Screen List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.HomeScreenList#getApplication <em>Application</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.data.DataPackage#getHomeScreenList()
 * @model annotation="database db_table='homeScreensLists' description='This is the SQL-View used for the home.json' pagination='10'"
 * @generated
 */
public interface HomeScreenList extends ScreenList {

  /**
   * Returns the value of the '<em><b>Application</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Application</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Application</em>' reference.
   * @see #setApplication(Application)
   * @see org.pdulvp.data.DataPackage#getHomeScreenList_Application()
   * @model annotation="database db_id='applicationTag'"
   * @generated
   */
  Application getApplication();

  /**
   * Sets the value of the '{@link org.pdulvp.data.HomeScreenList#getApplication <em>Application</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Application</em>' reference.
   * @see #getApplication()
   * @generated
   */
  void setApplication(Application value);
} // HomeScreenList
