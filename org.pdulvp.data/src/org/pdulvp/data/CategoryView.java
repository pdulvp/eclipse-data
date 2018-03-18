/**
 */
package org.pdulvp.data;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.CategoryView#getScreensIds <em>Screens Ids</em>}</li>
 *   <li>{@link org.pdulvp.data.CategoryView#getScreensNames <em>Screens Names</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.data.DataPackage#getCategoryView()
 * @model annotation="database db_table='categoriesView' description='This is the SQL-View used for the categories.json'"
 * @generated
 */
public interface CategoryView extends Category {
	/**
   * Returns the value of the '<em><b>Screens Ids</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Screens Ids</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Screens Ids</em>' reference.
   * @see #setScreensIds(Screen)
   * @see org.pdulvp.data.DataPackage#getCategoryView_ScreensIds()
   * @model derived="true"
   *        annotation="database db_id='screensIds' edit='false'"
   * @generated
   */
	Screen getScreensIds();

	/**
   * Sets the value of the '{@link org.pdulvp.data.CategoryView#getScreensIds <em>Screens Ids</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Screens Ids</em>' reference.
   * @see #getScreensIds()
   * @generated
   */
	void setScreensIds(Screen value);

	/**
   * Returns the value of the '<em><b>Screens Names</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Screens Names</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Screens Names</em>' reference.
   * @see #setScreensNames(Screen)
   * @see org.pdulvp.data.DataPackage#getCategoryView_ScreensNames()
   * @model derived="true"
   *        annotation="database db_id='screensNames' edit='false'"
   * @generated
   */
	Screen getScreensNames();

	/**
   * Sets the value of the '{@link org.pdulvp.data.CategoryView#getScreensNames <em>Screens Names</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Screens Names</em>' reference.
   * @see #getScreensNames()
   * @generated
   */
	void setScreensNames(Screen value);

} // CategoryView
