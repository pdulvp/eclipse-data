/**
 */
package org.pdulvp.data.table;

import org.eclipse.emf.ecore.EStructuralFeature;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DFeature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.table.DFeature#getJsonName <em>Json Name</em>}</li>
 *   <li>{@link org.pdulvp.data.table.DFeature#isEditable <em>Editable</em>}</li>
 *   <li>{@link org.pdulvp.data.table.DFeature#isExternal <em>External</em>}</li>
 *   <li>{@link org.pdulvp.data.table.DFeature#isExportJson <em>Export Json</em>}</li>
 *   <li>{@link org.pdulvp.data.table.DFeature#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.pdulvp.data.table.DFeature#isMany <em>Many</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.data.table.TablePackage#getDFeature()
 * @model
 * @generated
 */
public interface DFeature extends DNamedElement {

  /**
   * Returns the value of the '<em><b>Json Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Json Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Json Name</em>' attribute.
   * @see #setJsonName(String)
   * @see org.pdulvp.data.table.TablePackage#getDFeature_JsonName()
   * @model annotation="database db_id='name'"
   * @generated
   */
  String getJsonName();

  /**
   * Sets the value of the '{@link org.pdulvp.data.table.DFeature#getJsonName <em>Json Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Json Name</em>' attribute.
   * @see #getJsonName()
   * @generated
   */
  void setJsonName(String value);

  /**
   * Returns the value of the '<em><b>Editable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Editable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Editable</em>' attribute.
   * @see #setEditable(boolean)
   * @see org.pdulvp.data.table.TablePackage#getDFeature_Editable()
   * @model
   * @generated
   */
  boolean isEditable();

  /**
   * Sets the value of the '{@link org.pdulvp.data.table.DFeature#isEditable <em>Editable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Editable</em>' attribute.
   * @see #isEditable()
   * @generated
   */
  void setEditable(boolean value);

  /**
   * Returns the value of the '<em><b>External</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>External</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>External</em>' attribute.
   * @see #setExternal(boolean)
   * @see org.pdulvp.data.table.TablePackage#getDFeature_External()
   * @model default="false"
   * @generated
   */
  boolean isExternal();

  /**
   * Sets the value of the '{@link org.pdulvp.data.table.DFeature#isExternal <em>External</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>External</em>' attribute.
   * @see #isExternal()
   * @generated
   */
  void setExternal(boolean value);

  /**
   * Returns the value of the '<em><b>Export Json</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Export Json</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Export Json</em>' attribute.
   * @see #setExportJson(boolean)
   * @see org.pdulvp.data.table.TablePackage#getDFeature_ExportJson()
   * @model
   * @generated
   */
  boolean isExportJson();

  /**
   * Sets the value of the '{@link org.pdulvp.data.table.DFeature#isExportJson <em>Export Json</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Export Json</em>' attribute.
   * @see #isExportJson()
   * @generated
   */
  void setExportJson(boolean value);

  /**
   * Returns the value of the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' reference.
   * @see #setFeature(EStructuralFeature)
   * @see org.pdulvp.data.table.TablePackage#getDFeature_Feature()
   * @model
   * @generated
   */
  EStructuralFeature getFeature();

  /**
   * Sets the value of the '{@link org.pdulvp.data.table.DFeature#getFeature <em>Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature</em>' reference.
   * @see #getFeature()
   * @generated
   */
  void setFeature(EStructuralFeature value);

		/**
   * Returns the value of the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Many</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Many</em>' attribute.
   * @see #setMany(boolean)
   * @see org.pdulvp.data.table.TablePackage#getDFeature_Many()
   * @model
   * @generated
   */
	boolean isMany();

		/**
   * Sets the value of the '{@link org.pdulvp.data.table.DFeature#isMany <em>Many</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Many</em>' attribute.
   * @see #isMany()
   * @generated
   */
	void setMany(boolean value);
} // DFeature
