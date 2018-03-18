/**
 */
package org.pdulvp.data.table;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DKey Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.table.DKeyValue#getTable <em>Table</em>}</li>
 *   <li>{@link org.pdulvp.data.table.DKeyValue#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.pdulvp.data.table.DKeyValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.data.table.TablePackage#getDKeyValue()
 * @model
 * @generated
 */
public interface DKeyValue extends DNamedElement {
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
   * @see org.pdulvp.data.table.TablePackage#getDKeyValue_Table()
   * @model
   * @generated
   */
	DTable getTable();

	/**
   * Sets the value of the '{@link org.pdulvp.data.table.DKeyValue#getTable <em>Table</em>}' reference.
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
   * @see #setFeature(DFeature)
   * @see org.pdulvp.data.table.TablePackage#getDKeyValue_Feature()
   * @model
   * @generated
   */
  DFeature getFeature();

  /**
   * Sets the value of the '{@link org.pdulvp.data.table.DKeyValue#getFeature <em>Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature</em>' reference.
   * @see #getFeature()
   * @generated
   */
  void setFeature(DFeature value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.pdulvp.data.table.TablePackage#getDKeyValue_Value()
   * @model
   * @generated
   */
  String getValue();

		/**
   * Sets the value of the '{@link org.pdulvp.data.table.DKeyValue#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
	void setValue(String value);

} // DKeyValue
