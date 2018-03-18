/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pdulvp.data;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.Category#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.pdulvp.data.Category#isInapp <em>Inapp</em>}</li>
 *   <li>{@link org.pdulvp.data.Category#getInappDescription <em>Inapp Description</em>}</li>
 *   <li>{@link org.pdulvp.data.Category#getInappTitle <em>Inapp Title</em>}</li>
 *   <li>{@link org.pdulvp.data.Category#getPrice <em>Price</em>}</li>
 *   <li>{@link org.pdulvp.data.Category#getParent <em>Parent</em>}</li>
 *   <li>{@link org.pdulvp.data.Category#getOwnedCategories <em>Owned Categories</em>}</li>
 *   <li>{@link org.pdulvp.data.Category#getScreens <em>Screens</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.data.DataPackage#getCategory()
 * @model annotation="database db_table='categories'"
 * @generated
 */
public interface Category extends NamedItem, AbstractItem, ItemPkg {
	/**
   * Returns the value of the '<em><b>Owned Categories</b></em>' containment reference list.
   * The list contents are of type {@link org.pdulvp.data.Category}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Categories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Categories</em>' containment reference list.
   * @see org.pdulvp.data.DataPackage#getCategory_OwnedCategories()
   * @model containment="true"
   * @generated
   */
	EList<Category> getOwnedCategories();

	/**
   * Returns the value of the '<em><b>Screens</b></em>' reference list.
   * The list contents are of type {@link org.pdulvp.data.Screen}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Screens</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Screens</em>' reference list.
   * @see org.pdulvp.data.DataPackage#getCategory_Screens()
   * @model annotation="database db_table='categoriesScreens'"
   * @generated
   */
	EList<Screen> getScreens();

	/**
   * Returns the value of the '<em><b>Visible</b></em>' attribute.
   * The default value is <code>"true"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Visible</em>' attribute.
   * @see #setVisible(boolean)
   * @see org.pdulvp.data.DataPackage#getCategory_Visible()
   * @model default="true"
   *        annotation="database db_id='visible'"
   * @generated
   */
	boolean isVisible();

	/**
   * Sets the value of the '{@link org.pdulvp.data.Category#isVisible <em>Visible</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visible</em>' attribute.
   * @see #isVisible()
   * @generated
   */
	void setVisible(boolean value);

	/**
   * Returns the value of the '<em><b>Inapp</b></em>' attribute.
   * The default value is <code>"true"</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inapp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Inapp</em>' attribute.
   * @see #setInapp(boolean)
   * @see org.pdulvp.data.DataPackage#getCategory_Inapp()
   * @model default="true"
   * @generated
   */
	boolean isInapp();

	/**
   * Sets the value of the '{@link org.pdulvp.data.Category#isInapp <em>Inapp</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inapp</em>' attribute.
   * @see #isInapp()
   * @generated
   */
	void setInapp(boolean value);

	/**
   * Returns the value of the '<em><b>Inapp Description</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inapp Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Inapp Description</em>' attribute.
   * @see #setInappDescription(String)
   * @see org.pdulvp.data.DataPackage#getCategory_InappDescription()
   * @model
   * @generated
   */
	String getInappDescription();

	/**
   * Sets the value of the '{@link org.pdulvp.data.Category#getInappDescription <em>Inapp Description</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inapp Description</em>' attribute.
   * @see #getInappDescription()
   * @generated
   */
	void setInappDescription(String value);

	/**
   * Returns the value of the '<em><b>Inapp Title</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inapp Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Inapp Title</em>' attribute.
   * @see #setInappTitle(String)
   * @see org.pdulvp.data.DataPackage#getCategory_InappTitle()
   * @model
   * @generated
   */
	String getInappTitle();

	/**
   * Sets the value of the '{@link org.pdulvp.data.Category#getInappTitle <em>Inapp Title</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inapp Title</em>' attribute.
   * @see #getInappTitle()
   * @generated
   */
	void setInappTitle(String value);

	/**
   * Returns the value of the '<em><b>Price</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Price</em>' attribute.
   * @see #setPrice(float)
   * @see org.pdulvp.data.DataPackage#getCategory_Price()
   * @model
   * @generated
   */
	float getPrice();

	/**
   * Sets the value of the '{@link org.pdulvp.data.Category#getPrice <em>Price</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Price</em>' attribute.
   * @see #getPrice()
   * @generated
   */
	void setPrice(float value);

	/**
   * Returns the value of the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' reference.
   * @see #setParent(Category)
   * @see org.pdulvp.data.DataPackage#getCategory_Parent()
   * @model annotation="database db_id='parentId'"
   * @generated
   */
	Category getParent();

	/**
   * Sets the value of the '{@link org.pdulvp.data.Category#getParent <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' reference.
   * @see #getParent()
   * @generated
   */
	void setParent(Category value);

} // Category
