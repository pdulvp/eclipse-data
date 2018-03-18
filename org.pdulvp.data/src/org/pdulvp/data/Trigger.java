/**
 */
package org.pdulvp.data;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.Trigger#getSchedule <em>Schedule</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.data.DataPackage#getTrigger()
 * @model
 * @generated
 */
public interface Trigger extends AbstractItem, NamedItem {
  /**
   * Returns the value of the '<em><b>Schedule</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Schedule</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Schedule</em>' attribute.
   * @see #setSchedule(String)
   * @see org.pdulvp.data.DataPackage#getTrigger_Schedule()
   * @model
   * @generated
   */
  String getSchedule();

  /**
   * Sets the value of the '{@link org.pdulvp.data.Trigger#getSchedule <em>Schedule</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Schedule</em>' attribute.
   * @see #getSchedule()
   * @generated
   */
  void setSchedule(String value);

} // Trigger
