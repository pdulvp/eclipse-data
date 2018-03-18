/**
 */
package org.pdulvp.data;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.ImageItem#getSourcePath <em>Source Path</em>}</li>
 *   <li>{@link org.pdulvp.data.ImageItem#getDateCreated <em>Date Created</em>}</li>
 *   <li>{@link org.pdulvp.data.ImageItem#getStyle <em>Style</em>}</li>
 *   <li>{@link org.pdulvp.data.ImageItem#getGImageDataPath <em>GImage Data Path</em>}</li>
 *   <li>{@link org.pdulvp.data.ImageItem#getGIconDataPath <em>GIcon Data Path</em>}</li>
 *   <li>{@link org.pdulvp.data.ImageItem#getGIcon16Path <em>GIcon16 Path</em>}</li>
 *   <li>{@link org.pdulvp.data.ImageItem#getGType <em>GType</em>}</li>
 *   <li>{@link org.pdulvp.data.ImageItem#getIconData <em>Icon Data</em>}</li>
 *   <li>{@link org.pdulvp.data.ImageItem#getImageData <em>Image Data</em>}</li>
 *   <li>{@link org.pdulvp.data.ImageItem#getPacks <em>Packs</em>}</li>
 *   <li>{@link org.pdulvp.data.ImageItem#getRank <em>Rank</em>}</li>
 *   <li>{@link org.pdulvp.data.ImageItem#getMetadatas <em>Metadatas</em>}</li>
 *   <li>{@link org.pdulvp.data.ImageItem#getExternalPath <em>External Path</em>}</li>
 *   <li>{@link org.pdulvp.data.ImageItem#getProducts <em>Products</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.data.DataPackage#getImageItem()
 * @model abstract="true"
 * @generated
 */
public interface ImageItem extends ChildItem {
  /**
   * Returns the value of the '<em><b>Packs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Packs</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Packs</em>' attribute.
   * @see org.pdulvp.data.DataPackage#getImageItem_Packs()
   * @model changeable="false" derived="true"
   *        annotation="database db_id='packs' external='true'"
   * @generated
   */
  String getPacks();

  /**
   * Returns the value of the '<em><b>Products</b></em>' reference list.
   * The list contents are of type {@link org.pdulvp.data.Product}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Products</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Products</em>' reference list.
   * @see org.pdulvp.data.DataPackage#getImageItem_Products()
   * @model annotation="database db_table='itemsProducts'"
   * @generated
   */
  EList<Product> getProducts();

  /**
   * Returns the value of the '<em><b>Source Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Path</em>' attribute.
   * @see #setSourcePath(String)
   * @see org.pdulvp.data.DataPackage#getImageItem_SourcePath()
   * @model
   * @generated
   */
  String getSourcePath();

  /**
   * Sets the value of the '{@link org.pdulvp.data.ImageItem#getSourcePath <em>Source Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Path</em>' attribute.
   * @see #getSourcePath()
   * @generated
   */
  void setSourcePath(String value);

  /**
   * Returns the value of the '<em><b>Date Created</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Date Created</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Date Created</em>' attribute.
   * @see #setDateCreated(String)
   * @see org.pdulvp.data.DataPackage#getImageItem_DateCreated()
   * @model
   * @generated
   */
  String getDateCreated();

  /**
   * Sets the value of the '{@link org.pdulvp.data.ImageItem#getDateCreated <em>Date Created</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Date Created</em>' attribute.
   * @see #getDateCreated()
   * @generated
   */
  void setDateCreated(String value);

  /**
   * Returns the value of the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Style</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Style</em>' attribute.
   * @see #setStyle(String)
   * @see org.pdulvp.data.DataPackage#getImageItem_Style()
   * @model annotation="database db_id='style'"
   * @generated
   */
  String getStyle();

  /**
   * Sets the value of the '{@link org.pdulvp.data.ImageItem#getStyle <em>Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Style</em>' attribute.
   * @see #getStyle()
   * @generated
   */
  void setStyle(String value);

  /**
   * Returns the value of the '<em><b>GImage Data Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>GImage Data Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>GImage Data Path</em>' attribute.
   * @see #setGImageDataPath(String)
   * @see org.pdulvp.data.DataPackage#getImageItem_GImageDataPath()
   * @model
   * @generated
   */
  String getGImageDataPath();

  /**
   * Sets the value of the '{@link org.pdulvp.data.ImageItem#getGImageDataPath <em>GImage Data Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>GImage Data Path</em>' attribute.
   * @see #getGImageDataPath()
   * @generated
   */
  void setGImageDataPath(String value);

  /**
   * Returns the value of the '<em><b>GIcon Data Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>GIcon Data Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>GIcon Data Path</em>' attribute.
   * @see #setGIconDataPath(String)
   * @see org.pdulvp.data.DataPackage#getImageItem_GIconDataPath()
   * @model
   * @generated
   */
  String getGIconDataPath();

  /**
   * Sets the value of the '{@link org.pdulvp.data.ImageItem#getGIconDataPath <em>GIcon Data Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>GIcon Data Path</em>' attribute.
   * @see #getGIconDataPath()
   * @generated
   */
  void setGIconDataPath(String value);

  /**
   * Returns the value of the '<em><b>GIcon16 Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>GIcon16 Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>GIcon16 Path</em>' attribute.
   * @see #setGIcon16Path(String)
   * @see org.pdulvp.data.DataPackage#getImageItem_GIcon16Path()
   * @model
   * @generated
   */
  String getGIcon16Path();

  /**
   * Sets the value of the '{@link org.pdulvp.data.ImageItem#getGIcon16Path <em>GIcon16 Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>GIcon16 Path</em>' attribute.
   * @see #getGIcon16Path()
   * @generated
   */
  void setGIcon16Path(String value);

  /**
   * Returns the value of the '<em><b>GType</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>GType</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>GType</em>' reference.
   * @see #setGType(ItemType)
   * @see org.pdulvp.data.DataPackage#getImageItem_GType()
   * @model
   * @generated
   */
  ItemType getGType();

  /**
   * Sets the value of the '{@link org.pdulvp.data.ImageItem#getGType <em>GType</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>GType</em>' reference.
   * @see #getGType()
   * @generated
   */
  void setGType(ItemType value);

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
   * @see org.pdulvp.data.DataPackage#getImageItem_IconData()
   * @model annotation="database db_id='iconData' external='true'"
   * @generated
   */
  String getIconData();

  /**
   * Sets the value of the '{@link org.pdulvp.data.ImageItem#getIconData <em>Icon Data</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Icon Data</em>' attribute.
   * @see #getIconData()
   * @generated
   */
  void setIconData(String value);

  /**
   * Returns the value of the '<em><b>Image Data</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Image Data</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Image Data</em>' attribute.
   * @see #setImageData(String)
   * @see org.pdulvp.data.DataPackage#getImageItem_ImageData()
   * @model annotation="database db_id='imageData' external='true'"
   * @generated
   */
  String getImageData();

  /**
   * Sets the value of the '{@link org.pdulvp.data.ImageItem#getImageData <em>Image Data</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Image Data</em>' attribute.
   * @see #getImageData()
   * @generated
   */
  void setImageData(String value);

  /**
   * Returns the value of the '<em><b>Rank</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rank</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rank</em>' attribute.
   * @see #setRank(int)
   * @see org.pdulvp.data.DataPackage#getImageItem_Rank()
   * @model annotation="database db_id='rank'"
   * @generated
   */
  int getRank();

  /**
   * Sets the value of the '{@link org.pdulvp.data.ImageItem#getRank <em>Rank</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rank</em>' attribute.
   * @see #getRank()
   * @generated
   */
  void setRank(int value);

  /**
   * Returns the value of the '<em><b>Metadatas</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metadatas</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metadatas</em>' containment reference.
   * @see #setMetadatas(Metadatas)
   * @see org.pdulvp.data.DataPackage#getImageItem_Metadatas()
   * @model containment="true"
   *        annotation="database db_id='metadatas' external='true'"
   * @generated
   */
  Metadatas getMetadatas();

  /**
   * Sets the value of the '{@link org.pdulvp.data.ImageItem#getMetadatas <em>Metadatas</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Metadatas</em>' containment reference.
   * @see #getMetadatas()
   * @generated
   */
  void setMetadatas(Metadatas value);

  /**
   * Returns the value of the '<em><b>External Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>External Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>External Path</em>' attribute.
   * @see #setExternalPath(String)
   * @see org.pdulvp.data.DataPackage#getImageItem_ExternalPath()
   * @model
   * @generated
   */
  String getExternalPath();

  /**
   * Sets the value of the '{@link org.pdulvp.data.ImageItem#getExternalPath <em>External Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>External Path</em>' attribute.
   * @see #getExternalPath()
   * @generated
   */
  void setExternalPath(String value);

} // ImageItem
