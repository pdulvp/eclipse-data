/**
 */
package org.pdulvp.data;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timestamp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.Timestamp#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.data.DataPackage#getTimestamp()
 * @model
 * @generated
 */
public interface Timestamp extends EObject {
	/**
   * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Timestamp</em>' attribute.
   * @see #setTimestamp(String)
   * @see org.pdulvp.data.DataPackage#getTimestamp_Timestamp()
   * @model annotation="database db_id='timestamp' db_type='timestamp' edit='false'"
   * @generated
   */
	String getTimestamp();

	/**
   * Sets the value of the '{@link org.pdulvp.data.Timestamp#getTimestamp <em>Timestamp</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Timestamp</em>' attribute.
   * @see #getTimestamp()
   * @generated
   */
	void setTimestamp(String value);

} // Timestamp
