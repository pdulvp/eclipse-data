/**
 */
package org.pdulvp.data;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metadatas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.Metadatas#getAuthor_name <em>Author name</em>}</li>
 *   <li>{@link org.pdulvp.data.Metadatas#getAuthor_email <em>Author email</em>}</li>
 *   <li>{@link org.pdulvp.data.Metadatas#getLicence <em>Licence</em>}</li>
 *   <li>{@link org.pdulvp.data.Metadatas#getCategory_name <em>Category name</em>}</li>
 *   <li>{@link org.pdulvp.data.Metadatas#getVersion <em>Version</em>}</li>
 *   <li>{@link org.pdulvp.data.Metadatas#getDownload <em>Download</em>}</li>
 *   <li>{@link org.pdulvp.data.Metadatas#getRate <em>Rate</em>}</li>
 *   <li>{@link org.pdulvp.data.Metadatas#getNews <em>News</em>}</li>
 *   <li>{@link org.pdulvp.data.Metadatas#getDate <em>Date</em>}</li>
 *   <li>{@link org.pdulvp.data.Metadatas#getSize <em>Size</em>}</li>
 *   <li>{@link org.pdulvp.data.Metadatas#getPrice <em>Price</em>}</li>
 *   <li>{@link org.pdulvp.data.Metadatas#getSource <em>Source</em>}</li>
 *   <li>{@link org.pdulvp.data.Metadatas#getName <em>Name</em>}</li>
 *   <li>{@link org.pdulvp.data.Metadatas#getName_frFR <em>Name fr FR</em>}</li>
 *   <li>{@link org.pdulvp.data.Metadatas#getDescription <em>Description</em>}</li>
 *   <li>{@link org.pdulvp.data.Metadatas#getDescription_frFR <em>Description fr FR</em>}</li>
 *   <li>{@link org.pdulvp.data.Metadatas#getShortDescription <em>Short Description</em>}</li>
 *   <li>{@link org.pdulvp.data.Metadatas#getMapsUri <em>Maps Uri</em>}</li>
 *   <li>{@link org.pdulvp.data.Metadatas#getImage_mainUri <em>Image main Uri</em>}</li>
 *   <li>{@link org.pdulvp.data.Metadatas#getImage_preview2Uri <em>Image preview2 Uri</em>}</li>
 *   <li>{@link org.pdulvp.data.Metadatas#getSiteUri <em>Site Uri</em>}</li>
 *   <li>{@link org.pdulvp.data.Metadatas#getTripAdvisorUri <em>Trip Advisor Uri</em>}</li>
 *   <li>{@link org.pdulvp.data.Metadatas#getChart <em>Chart</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.data.DataPackage#getMetadatas()
 * @model annotation="database external='true'"
 * @generated
 */
public interface Metadatas extends EObject {
	/**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.pdulvp.data.DataPackage#getMetadatas_Description()
   * @model annotation="database db_id='meta_description' external='true'"
   * @generated
   */
	String getDescription();

	/**
   * Sets the value of the '{@link org.pdulvp.data.Metadatas#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
	void setDescription(String value);

	/**
   * Returns the value of the '<em><b>Description fr FR</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description fr FR</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Description fr FR</em>' attribute.
   * @see #setDescription_frFR(String)
   * @see org.pdulvp.data.DataPackage#getMetadatas_Description_frFR()
   * @model annotation="database db_id='meta_descriptionfrFR' external='true'"
   * @generated
   */
	String getDescription_frFR();

	/**
   * Sets the value of the '{@link org.pdulvp.data.Metadatas#getDescription_frFR <em>Description fr FR</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description fr FR</em>' attribute.
   * @see #getDescription_frFR()
   * @generated
   */
	void setDescription_frFR(String value);

	/**
   * Returns the value of the '<em><b>Short Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Short Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Short Description</em>' attribute.
   * @see #setShortDescription(String)
   * @see org.pdulvp.data.DataPackage#getMetadatas_ShortDescription()
   * @model annotation="database db_id='meta_description' external='true'"
   * @generated
   */
  String getShortDescription();

  /**
   * Sets the value of the '{@link org.pdulvp.data.Metadatas#getShortDescription <em>Short Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Short Description</em>' attribute.
   * @see #getShortDescription()
   * @generated
   */
  void setShortDescription(String value);

  /**
   * Returns the value of the '<em><b>Maps Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Maps Uri</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Maps Uri</em>' attribute.
   * @see #setMapsUri(String)
   * @see org.pdulvp.data.DataPackage#getMetadatas_MapsUri()
   * @model annotation="database db_id='meta_mapsUri' external='true'"
   * @generated
   */
  String getMapsUri();

  /**
   * Sets the value of the '{@link org.pdulvp.data.Metadatas#getMapsUri <em>Maps Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Maps Uri</em>' attribute.
   * @see #getMapsUri()
   * @generated
   */
  void setMapsUri(String value);

  /**
   * Returns the value of the '<em><b>Image main Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Image main Uri</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Image main Uri</em>' attribute.
   * @see #setImage_mainUri(String)
   * @see org.pdulvp.data.DataPackage#getMetadatas_Image_mainUri()
   * @model annotation="database db_id='meta_image_mainUri' external='true'"
   * @generated
   */
  String getImage_mainUri();

  /**
   * Sets the value of the '{@link org.pdulvp.data.Metadatas#getImage_mainUri <em>Image main Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Image main Uri</em>' attribute.
   * @see #getImage_mainUri()
   * @generated
   */
  void setImage_mainUri(String value);

  /**
   * Returns the value of the '<em><b>Image preview2 Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Image preview2 Uri</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Image preview2 Uri</em>' attribute.
   * @see #setImage_preview2Uri(String)
   * @see org.pdulvp.data.DataPackage#getMetadatas_Image_preview2Uri()
   * @model annotation="database db_id='meta_image_preview2Uri' external='true'"
   * @generated
   */
  String getImage_preview2Uri();

  /**
   * Sets the value of the '{@link org.pdulvp.data.Metadatas#getImage_preview2Uri <em>Image preview2 Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Image preview2 Uri</em>' attribute.
   * @see #getImage_preview2Uri()
   * @generated
   */
  void setImage_preview2Uri(String value);

  /**
   * Returns the value of the '<em><b>Site Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Site Uri</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Site Uri</em>' attribute.
   * @see #setSiteUri(String)
   * @see org.pdulvp.data.DataPackage#getMetadatas_SiteUri()
   * @model annotation="database db_id='meta_siteUri' external='true'"
   * @generated
   */
  String getSiteUri();

  /**
   * Sets the value of the '{@link org.pdulvp.data.Metadatas#getSiteUri <em>Site Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Site Uri</em>' attribute.
   * @see #getSiteUri()
   * @generated
   */
  void setSiteUri(String value);

  /**
   * Returns the value of the '<em><b>Trip Advisor Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trip Advisor Uri</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trip Advisor Uri</em>' attribute.
   * @see #setTripAdvisorUri(String)
   * @see org.pdulvp.data.DataPackage#getMetadatas_TripAdvisorUri()
   * @model annotation="database db_id='meta_tripAdvisorUri' external='true'"
   * @generated
   */
  String getTripAdvisorUri();

  /**
   * Sets the value of the '{@link org.pdulvp.data.Metadatas#getTripAdvisorUri <em>Trip Advisor Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trip Advisor Uri</em>' attribute.
   * @see #getTripAdvisorUri()
   * @generated
   */
  void setTripAdvisorUri(String value);

  /**
   * Returns the value of the '<em><b>Chart</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Chart</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Chart</em>' attribute.
   * @see #setChart(String)
   * @see org.pdulvp.data.DataPackage#getMetadatas_Chart()
   * @model annotation="database db_id='meta_chart' external='true'"
   * @generated
   */
  String getChart();

  /**
   * Sets the value of the '{@link org.pdulvp.data.Metadatas#getChart <em>Chart</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Chart</em>' attribute.
   * @see #getChart()
   * @generated
   */
  void setChart(String value);

  /**
   * Returns the value of the '<em><b>Author name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Author name</em>' attribute.
   * @see #setAuthor_name(String)
   * @see org.pdulvp.data.DataPackage#getMetadatas_Author_name()
   * @model annotation="database db_id='meta_author_name' external='true'"
   * @generated
   */
	String getAuthor_name();

	/**
   * Sets the value of the '{@link org.pdulvp.data.Metadatas#getAuthor_name <em>Author name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Author name</em>' attribute.
   * @see #getAuthor_name()
   * @generated
   */
	void setAuthor_name(String value);

	/**
   * Returns the value of the '<em><b>Author email</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Author email</em>' attribute.
   * @see #setAuthor_email(String)
   * @see org.pdulvp.data.DataPackage#getMetadatas_Author_email()
   * @model annotation="database db_id='meta_author_email' external='true'"
   * @generated
   */
	String getAuthor_email();

	/**
   * Sets the value of the '{@link org.pdulvp.data.Metadatas#getAuthor_email <em>Author email</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Author email</em>' attribute.
   * @see #getAuthor_email()
   * @generated
   */
	void setAuthor_email(String value);

	/**
   * Returns the value of the '<em><b>Licence</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Licence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Licence</em>' attribute.
   * @see #setLicence(String)
   * @see org.pdulvp.data.DataPackage#getMetadatas_Licence()
   * @model annotation="database db_id='meta_licence' external='true'"
   * @generated
   */
	String getLicence();

	/**
   * Sets the value of the '{@link org.pdulvp.data.Metadatas#getLicence <em>Licence</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Licence</em>' attribute.
   * @see #getLicence()
   * @generated
   */
	void setLicence(String value);

	/**
   * Returns the value of the '<em><b>Category name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Category name</em>' attribute.
   * @see #setCategory_name(String)
   * @see org.pdulvp.data.DataPackage#getMetadatas_Category_name()
   * @model annotation="database db_id='meta_category_name' external='true'"
   * @generated
   */
	String getCategory_name();

	/**
   * Sets the value of the '{@link org.pdulvp.data.Metadatas#getCategory_name <em>Category name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Category name</em>' attribute.
   * @see #getCategory_name()
   * @generated
   */
	void setCategory_name(String value);

	/**
   * Returns the value of the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' attribute.
   * @see #setVersion(String)
   * @see org.pdulvp.data.DataPackage#getMetadatas_Version()
   * @model annotation="database db_id='meta_version' external='true'"
   * @generated
   */
	String getVersion();

	/**
   * Sets the value of the '{@link org.pdulvp.data.Metadatas#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
	void setVersion(String value);

	/**
   * Returns the value of the '<em><b>Download</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Download</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Download</em>' attribute.
   * @see #setDownload(String)
   * @see org.pdulvp.data.DataPackage#getMetadatas_Download()
   * @model annotation="database db_id='meta_download' external='true'"
   * @generated
   */
	String getDownload();

	/**
   * Sets the value of the '{@link org.pdulvp.data.Metadatas#getDownload <em>Download</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Download</em>' attribute.
   * @see #getDownload()
   * @generated
   */
	void setDownload(String value);

	/**
   * Returns the value of the '<em><b>Rate</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Rate</em>' attribute.
   * @see #setRate(String)
   * @see org.pdulvp.data.DataPackage#getMetadatas_Rate()
   * @model annotation="database db_id='meta_rate' external='true'"
   * @generated
   */
	String getRate();

	/**
   * Sets the value of the '{@link org.pdulvp.data.Metadatas#getRate <em>Rate</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rate</em>' attribute.
   * @see #getRate()
   * @generated
   */
	void setRate(String value);

	/**
   * Returns the value of the '<em><b>News</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>News</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>News</em>' attribute.
   * @see #setNews(String)
   * @see org.pdulvp.data.DataPackage#getMetadatas_News()
   * @model annotation="database db_id='meta_news' external='true'"
   * @generated
   */
	String getNews();

	/**
   * Sets the value of the '{@link org.pdulvp.data.Metadatas#getNews <em>News</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>News</em>' attribute.
   * @see #getNews()
   * @generated
   */
	void setNews(String value);

	/**
   * Returns the value of the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Date</em>' attribute.
   * @see #setDate(String)
   * @see org.pdulvp.data.DataPackage#getMetadatas_Date()
   * @model annotation="database db_id='meta_date' external='true'"
   * @generated
   */
	String getDate();

	/**
   * Sets the value of the '{@link org.pdulvp.data.Metadatas#getDate <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Date</em>' attribute.
   * @see #getDate()
   * @generated
   */
	void setDate(String value);

	/**
   * Returns the value of the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' attribute.
   * @see #setSize(String)
   * @see org.pdulvp.data.DataPackage#getMetadatas_Size()
   * @model annotation="database db_id='meta_size' external='true'"
   * @generated
   */
	String getSize();

	/**
   * Sets the value of the '{@link org.pdulvp.data.Metadatas#getSize <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' attribute.
   * @see #getSize()
   * @generated
   */
	void setSize(String value);

	/**
   * Returns the value of the '<em><b>Price</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Price</em>' attribute.
   * @see #setPrice(String)
   * @see org.pdulvp.data.DataPackage#getMetadatas_Price()
   * @model annotation="database db_id='meta_price' external='true'"
   * @generated
   */
	String getPrice();

	/**
   * Sets the value of the '{@link org.pdulvp.data.Metadatas#getPrice <em>Price</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Price</em>' attribute.
   * @see #getPrice()
   * @generated
   */
	void setPrice(String value);

	/**
   * Returns the value of the '<em><b>Source</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' attribute.
   * @see #setSource(String)
   * @see org.pdulvp.data.DataPackage#getMetadatas_Source()
   * @model annotation="database db_id='meta_source' external='true'"
   * @generated
   */
	String getSource();

	/**
   * Sets the value of the '{@link org.pdulvp.data.Metadatas#getSource <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' attribute.
   * @see #getSource()
   * @generated
   */
	void setSource(String value);

	/**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.pdulvp.data.DataPackage#getMetadatas_Name()
   * @model annotation="database db_id='meta_name' external='true'"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.pdulvp.data.Metadatas#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

	/**
   * Returns the value of the '<em><b>Name fr FR</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name fr FR</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Name fr FR</em>' attribute.
   * @see #setName_frFR(String)
   * @see org.pdulvp.data.DataPackage#getMetadatas_Name_frFR()
   * @model annotation="database db_id='meta_namefrFR' external='true'"
   * @generated
   */
	String getName_frFR();

	/**
   * Sets the value of the '{@link org.pdulvp.data.Metadatas#getName_frFR <em>Name fr FR</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name fr FR</em>' attribute.
   * @see #getName_frFR()
   * @generated
   */
	void setName_frFR(String value);

} // Metadatas
