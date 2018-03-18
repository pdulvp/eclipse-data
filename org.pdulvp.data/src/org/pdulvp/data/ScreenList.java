/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pdulvp.data;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Screen List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.ScreenList#getCategory <em>Category</em>}</li>
 *   <li>{@link org.pdulvp.data.ScreenList#getScreen <em>Screen</em>}</li>
 *   <li>{@link org.pdulvp.data.ScreenList#getIconData <em>Icon Data</em>}</li>
 *   <li>{@link org.pdulvp.data.ScreenList#getStyle <em>Style</em>}</li>
 *   <li>{@link org.pdulvp.data.ScreenList#getPacks <em>Packs</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.data.DataPackage#getScreenList()
 * @model annotation="database pagination='10' db_table='screensLists' description='This is the SQL-View used for all screens per category'"
 * @generated
 */
public interface ScreenList extends AbstractItem {
	/**
   * Returns the value of the '<em><b>Category</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Category</em>' reference.
   * @see #setCategory(Category)
   * @see org.pdulvp.data.DataPackage#getScreenList_Category()
   * @model annotation="database db_id='categoryId'"
   * @generated
   */
	Category getCategory();

	/**
   * Sets the value of the '{@link org.pdulvp.data.ScreenList#getCategory <em>Category</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Category</em>' reference.
   * @see #getCategory()
   * @generated
   */
	void setCategory(Category value);

	/**
   * Returns the value of the '<em><b>Screen</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Screen</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Screen</em>' reference.
   * @see #setScreen(Screen)
   * @see org.pdulvp.data.DataPackage#getScreenList_Screen()
   * @model annotation="database db_id='screenId'"
   * @generated
   */
	Screen getScreen();

	/**
   * Sets the value of the '{@link org.pdulvp.data.ScreenList#getScreen <em>Screen</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Screen</em>' reference.
   * @see #getScreen()
   * @generated
   */
	void setScreen(Screen value);

	/**
   * Returns the value of the '<em><b>Icon Data</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Icon Data</em>' attribute.
   * @see #setIconData(String)
   * @see org.pdulvp.data.DataPackage#getScreenList_IconData()
   * @model annotation="database db_id='iconData' external='true' edit='false'"
   * @generated
   */
	String getIconData();

	/**
   * Sets the value of the '{@link org.pdulvp.data.ScreenList#getIconData <em>Icon Data</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Icon Data</em>' attribute.
   * @see #getIconData()
   * @generated
   */
	void setIconData(String value);

	/**
   * Returns the value of the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Style</em>' attribute.
   * @see org.pdulvp.data.DataPackage#getScreenList_Style()
   * @model changeable="false" derived="true"
   *        annotation="database db_id='style' edit='false'"
   * @generated
   */
	String getStyle();

	/**
   * Returns the value of the '<em><b>Packs</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Packs</em>' attribute.
   * @see org.pdulvp.data.DataPackage#getScreenList_Packs()
   * @model changeable="false" derived="true"
   *        annotation="database db_id='packs' external='true' edit='false'"
   * @generated
   */
	String getPacks();

} // ScreenList
