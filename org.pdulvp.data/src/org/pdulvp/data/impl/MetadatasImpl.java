/**
 */
package org.pdulvp.data.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.pdulvp.data.DataPackage;
import org.pdulvp.data.Metadatas;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metadatas</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.impl.MetadatasImpl#getAuthor_name <em>Author name</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.MetadatasImpl#getAuthor_email <em>Author email</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.MetadatasImpl#getLicence <em>Licence</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.MetadatasImpl#getCategory_name <em>Category name</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.MetadatasImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.MetadatasImpl#getDownload <em>Download</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.MetadatasImpl#getRate <em>Rate</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.MetadatasImpl#getNews <em>News</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.MetadatasImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.MetadatasImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.MetadatasImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.MetadatasImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.MetadatasImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.MetadatasImpl#getName_frFR <em>Name fr FR</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.MetadatasImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.MetadatasImpl#getDescription_frFR <em>Description fr FR</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.MetadatasImpl#getShortDescription <em>Short Description</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.MetadatasImpl#getMapsUri <em>Maps Uri</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.MetadatasImpl#getImage_mainUri <em>Image main Uri</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.MetadatasImpl#getImage_preview2Uri <em>Image preview2 Uri</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.MetadatasImpl#getSiteUri <em>Site Uri</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.MetadatasImpl#getTripAdvisorUri <em>Trip Advisor Uri</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.MetadatasImpl#getChart <em>Chart</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetadatasImpl extends EObjectImpl implements Metadatas {
	/**
   * The default value of the '{@link #getAuthor_name() <em>Author name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAuthor_name()
   * @generated
   * @ordered
   */
	protected static final String AUTHOR_NAME_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getAuthor_name() <em>Author name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAuthor_name()
   * @generated
   * @ordered
   */
	protected String author_name = AUTHOR_NAME_EDEFAULT;

	/**
   * The default value of the '{@link #getAuthor_email() <em>Author email</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAuthor_email()
   * @generated
   * @ordered
   */
	protected static final String AUTHOR_EMAIL_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getAuthor_email() <em>Author email</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAuthor_email()
   * @generated
   * @ordered
   */
	protected String author_email = AUTHOR_EMAIL_EDEFAULT;

	/**
   * The default value of the '{@link #getLicence() <em>Licence</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getLicence()
   * @generated
   * @ordered
   */
	protected static final String LICENCE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getLicence() <em>Licence</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getLicence()
   * @generated
   * @ordered
   */
	protected String licence = LICENCE_EDEFAULT;

	/**
   * The default value of the '{@link #getCategory_name() <em>Category name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCategory_name()
   * @generated
   * @ordered
   */
	protected static final String CATEGORY_NAME_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getCategory_name() <em>Category name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCategory_name()
   * @generated
   * @ordered
   */
	protected String category_name = CATEGORY_NAME_EDEFAULT;

	/**
   * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
	protected static final String VERSION_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
	protected String version = VERSION_EDEFAULT;

	/**
   * The default value of the '{@link #getDownload() <em>Download</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDownload()
   * @generated
   * @ordered
   */
	protected static final String DOWNLOAD_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getDownload() <em>Download</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDownload()
   * @generated
   * @ordered
   */
	protected String download = DOWNLOAD_EDEFAULT;

	/**
   * The default value of the '{@link #getRate() <em>Rate</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRate()
   * @generated
   * @ordered
   */
	protected static final String RATE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getRate() <em>Rate</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRate()
   * @generated
   * @ordered
   */
	protected String rate = RATE_EDEFAULT;

	/**
   * The default value of the '{@link #getNews() <em>News</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getNews()
   * @generated
   * @ordered
   */
	protected static final String NEWS_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getNews() <em>News</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getNews()
   * @generated
   * @ordered
   */
	protected String news = NEWS_EDEFAULT;

	/**
   * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDate()
   * @generated
   * @ordered
   */
	protected static final String DATE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDate()
   * @generated
   * @ordered
   */
	protected String date = DATE_EDEFAULT;

	/**
   * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
	protected static final String SIZE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
	protected String size = SIZE_EDEFAULT;

	/**
   * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPrice()
   * @generated
   * @ordered
   */
	protected static final String PRICE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPrice()
   * @generated
   * @ordered
   */
	protected String price = PRICE_EDEFAULT;

	/**
   * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
	protected static final String SOURCE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
	protected String source = SOURCE_EDEFAULT;

	/**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
	protected static final String NAME_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
	protected String name = NAME_EDEFAULT;

	/**
   * The default value of the '{@link #getName_frFR() <em>Name fr FR</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getName_frFR()
   * @generated
   * @ordered
   */
	protected static final String NAME_FR_FR_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getName_frFR() <em>Name fr FR</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getName_frFR()
   * @generated
   * @ordered
   */
	protected String name_frFR = NAME_FR_FR_EDEFAULT;

	/**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
   * The default value of the '{@link #getDescription_frFR() <em>Description fr FR</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDescription_frFR()
   * @generated
   * @ordered
   */
	protected static final String DESCRIPTION_FR_FR_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getDescription_frFR() <em>Description fr FR</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDescription_frFR()
   * @generated
   * @ordered
   */
	protected String description_frFR = DESCRIPTION_FR_FR_EDEFAULT;

	/**
   * The default value of the '{@link #getShortDescription() <em>Short Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShortDescription()
   * @generated
   * @ordered
   */
  protected static final String SHORT_DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getShortDescription() <em>Short Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShortDescription()
   * @generated
   * @ordered
   */
  protected String shortDescription = SHORT_DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getMapsUri() <em>Maps Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMapsUri()
   * @generated
   * @ordered
   */
  protected static final String MAPS_URI_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMapsUri() <em>Maps Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMapsUri()
   * @generated
   * @ordered
   */
  protected String mapsUri = MAPS_URI_EDEFAULT;

  /**
   * The default value of the '{@link #getImage_mainUri() <em>Image main Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImage_mainUri()
   * @generated
   * @ordered
   */
  protected static final String IMAGE_MAIN_URI_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImage_mainUri() <em>Image main Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImage_mainUri()
   * @generated
   * @ordered
   */
  protected String image_mainUri = IMAGE_MAIN_URI_EDEFAULT;

  /**
   * The default value of the '{@link #getImage_preview2Uri() <em>Image preview2 Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImage_preview2Uri()
   * @generated
   * @ordered
   */
  protected static final String IMAGE_PREVIEW2_URI_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImage_preview2Uri() <em>Image preview2 Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImage_preview2Uri()
   * @generated
   * @ordered
   */
  protected String image_preview2Uri = IMAGE_PREVIEW2_URI_EDEFAULT;

  /**
   * The default value of the '{@link #getSiteUri() <em>Site Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSiteUri()
   * @generated
   * @ordered
   */
  protected static final String SITE_URI_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSiteUri() <em>Site Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSiteUri()
   * @generated
   * @ordered
   */
  protected String siteUri = SITE_URI_EDEFAULT;

  /**
   * The default value of the '{@link #getTripAdvisorUri() <em>Trip Advisor Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTripAdvisorUri()
   * @generated
   * @ordered
   */
  protected static final String TRIP_ADVISOR_URI_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTripAdvisorUri() <em>Trip Advisor Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTripAdvisorUri()
   * @generated
   * @ordered
   */
  protected String tripAdvisorUri = TRIP_ADVISOR_URI_EDEFAULT;

  /**
   * The default value of the '{@link #getChart() <em>Chart</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChart()
   * @generated
   * @ordered
   */
  protected static final String CHART_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getChart() <em>Chart</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChart()
   * @generated
   * @ordered
   */
  protected String chart = CHART_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected MetadatasImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return DataPackage.Literals.METADATAS;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getDescription() {
    return description;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDescription(String newDescription) {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.METADATAS__DESCRIPTION, oldDescription, description));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getDescription_frFR() {
    return description_frFR;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDescription_frFR(String newDescription_frFR) {
    String oldDescription_frFR = description_frFR;
    description_frFR = newDescription_frFR;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.METADATAS__DESCRIPTION_FR_FR, oldDescription_frFR, description_frFR));
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getShortDescription() {
    return shortDescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShortDescription(String newShortDescription) {
    String oldShortDescription = shortDescription;
    shortDescription = newShortDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.METADATAS__SHORT_DESCRIPTION, oldShortDescription, shortDescription));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMapsUri() {
    return mapsUri;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMapsUri(String newMapsUri) {
    String oldMapsUri = mapsUri;
    mapsUri = newMapsUri;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.METADATAS__MAPS_URI, oldMapsUri, mapsUri));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImage_mainUri() {
    return image_mainUri;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImage_mainUri(String newImage_mainUri) {
    String oldImage_mainUri = image_mainUri;
    image_mainUri = newImage_mainUri;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.METADATAS__IMAGE_MAIN_URI, oldImage_mainUri, image_mainUri));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImage_preview2Uri() {
    return image_preview2Uri;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImage_preview2Uri(String newImage_preview2Uri) {
    String oldImage_preview2Uri = image_preview2Uri;
    image_preview2Uri = newImage_preview2Uri;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.METADATAS__IMAGE_PREVIEW2_URI, oldImage_preview2Uri, image_preview2Uri));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSiteUri() {
    return siteUri;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSiteUri(String newSiteUri) {
    String oldSiteUri = siteUri;
    siteUri = newSiteUri;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.METADATAS__SITE_URI, oldSiteUri, siteUri));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTripAdvisorUri() {
    return tripAdvisorUri;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTripAdvisorUri(String newTripAdvisorUri) {
    String oldTripAdvisorUri = tripAdvisorUri;
    tripAdvisorUri = newTripAdvisorUri;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.METADATAS__TRIP_ADVISOR_URI, oldTripAdvisorUri, tripAdvisorUri));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getChart() {
    return chart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChart(String newChart) {
    String oldChart = chart;
    chart = newChart;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.METADATAS__CHART, oldChart, chart));
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getAuthor_name() {
    return author_name;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setAuthor_name(String newAuthor_name) {
    String oldAuthor_name = author_name;
    author_name = newAuthor_name;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.METADATAS__AUTHOR_NAME, oldAuthor_name, author_name));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getAuthor_email() {
    return author_email;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setAuthor_email(String newAuthor_email) {
    String oldAuthor_email = author_email;
    author_email = newAuthor_email;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.METADATAS__AUTHOR_EMAIL, oldAuthor_email, author_email));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getLicence() {
    return licence;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setLicence(String newLicence) {
    String oldLicence = licence;
    licence = newLicence;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.METADATAS__LICENCE, oldLicence, licence));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getCategory_name() {
    return category_name;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setCategory_name(String newCategory_name) {
    String oldCategory_name = category_name;
    category_name = newCategory_name;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.METADATAS__CATEGORY_NAME, oldCategory_name, category_name));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getVersion() {
    return version;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setVersion(String newVersion) {
    String oldVersion = version;
    version = newVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.METADATAS__VERSION, oldVersion, version));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getDownload() {
    return download;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDownload(String newDownload) {
    String oldDownload = download;
    download = newDownload;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.METADATAS__DOWNLOAD, oldDownload, download));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getRate() {
    return rate;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setRate(String newRate) {
    String oldRate = rate;
    rate = newRate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.METADATAS__RATE, oldRate, rate));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getNews() {
    return news;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setNews(String newNews) {
    String oldNews = news;
    news = newNews;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.METADATAS__NEWS, oldNews, news));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getDate() {
    return date;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDate(String newDate) {
    String oldDate = date;
    date = newDate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.METADATAS__DATE, oldDate, date));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getSize() {
    return size;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSize(String newSize) {
    String oldSize = size;
    size = newSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.METADATAS__SIZE, oldSize, size));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getPrice() {
    return price;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setPrice(String newPrice) {
    String oldPrice = price;
    price = newPrice;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.METADATAS__PRICE, oldPrice, price));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getSource() {
    return source;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSource(String newSource) {
    String oldSource = source;
    source = newSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.METADATAS__SOURCE, oldSource, source));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getName() {
    return name;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.METADATAS__NAME, oldName, name));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getName_frFR() {
    return name_frFR;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setName_frFR(String newName_frFR) {
    String oldName_frFR = name_frFR;
    name_frFR = newName_frFR;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.METADATAS__NAME_FR_FR, oldName_frFR, name_frFR));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case DataPackage.METADATAS__AUTHOR_NAME:
        return getAuthor_name();
      case DataPackage.METADATAS__AUTHOR_EMAIL:
        return getAuthor_email();
      case DataPackage.METADATAS__LICENCE:
        return getLicence();
      case DataPackage.METADATAS__CATEGORY_NAME:
        return getCategory_name();
      case DataPackage.METADATAS__VERSION:
        return getVersion();
      case DataPackage.METADATAS__DOWNLOAD:
        return getDownload();
      case DataPackage.METADATAS__RATE:
        return getRate();
      case DataPackage.METADATAS__NEWS:
        return getNews();
      case DataPackage.METADATAS__DATE:
        return getDate();
      case DataPackage.METADATAS__SIZE:
        return getSize();
      case DataPackage.METADATAS__PRICE:
        return getPrice();
      case DataPackage.METADATAS__SOURCE:
        return getSource();
      case DataPackage.METADATAS__NAME:
        return getName();
      case DataPackage.METADATAS__NAME_FR_FR:
        return getName_frFR();
      case DataPackage.METADATAS__DESCRIPTION:
        return getDescription();
      case DataPackage.METADATAS__DESCRIPTION_FR_FR:
        return getDescription_frFR();
      case DataPackage.METADATAS__SHORT_DESCRIPTION:
        return getShortDescription();
      case DataPackage.METADATAS__MAPS_URI:
        return getMapsUri();
      case DataPackage.METADATAS__IMAGE_MAIN_URI:
        return getImage_mainUri();
      case DataPackage.METADATAS__IMAGE_PREVIEW2_URI:
        return getImage_preview2Uri();
      case DataPackage.METADATAS__SITE_URI:
        return getSiteUri();
      case DataPackage.METADATAS__TRIP_ADVISOR_URI:
        return getTripAdvisorUri();
      case DataPackage.METADATAS__CHART:
        return getChart();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case DataPackage.METADATAS__AUTHOR_NAME:
        setAuthor_name((String)newValue);
        return;
      case DataPackage.METADATAS__AUTHOR_EMAIL:
        setAuthor_email((String)newValue);
        return;
      case DataPackage.METADATAS__LICENCE:
        setLicence((String)newValue);
        return;
      case DataPackage.METADATAS__CATEGORY_NAME:
        setCategory_name((String)newValue);
        return;
      case DataPackage.METADATAS__VERSION:
        setVersion((String)newValue);
        return;
      case DataPackage.METADATAS__DOWNLOAD:
        setDownload((String)newValue);
        return;
      case DataPackage.METADATAS__RATE:
        setRate((String)newValue);
        return;
      case DataPackage.METADATAS__NEWS:
        setNews((String)newValue);
        return;
      case DataPackage.METADATAS__DATE:
        setDate((String)newValue);
        return;
      case DataPackage.METADATAS__SIZE:
        setSize((String)newValue);
        return;
      case DataPackage.METADATAS__PRICE:
        setPrice((String)newValue);
        return;
      case DataPackage.METADATAS__SOURCE:
        setSource((String)newValue);
        return;
      case DataPackage.METADATAS__NAME:
        setName((String)newValue);
        return;
      case DataPackage.METADATAS__NAME_FR_FR:
        setName_frFR((String)newValue);
        return;
      case DataPackage.METADATAS__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case DataPackage.METADATAS__DESCRIPTION_FR_FR:
        setDescription_frFR((String)newValue);
        return;
      case DataPackage.METADATAS__SHORT_DESCRIPTION:
        setShortDescription((String)newValue);
        return;
      case DataPackage.METADATAS__MAPS_URI:
        setMapsUri((String)newValue);
        return;
      case DataPackage.METADATAS__IMAGE_MAIN_URI:
        setImage_mainUri((String)newValue);
        return;
      case DataPackage.METADATAS__IMAGE_PREVIEW2_URI:
        setImage_preview2Uri((String)newValue);
        return;
      case DataPackage.METADATAS__SITE_URI:
        setSiteUri((String)newValue);
        return;
      case DataPackage.METADATAS__TRIP_ADVISOR_URI:
        setTripAdvisorUri((String)newValue);
        return;
      case DataPackage.METADATAS__CHART:
        setChart((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eUnset(int featureID) {
    switch (featureID) {
      case DataPackage.METADATAS__AUTHOR_NAME:
        setAuthor_name(AUTHOR_NAME_EDEFAULT);
        return;
      case DataPackage.METADATAS__AUTHOR_EMAIL:
        setAuthor_email(AUTHOR_EMAIL_EDEFAULT);
        return;
      case DataPackage.METADATAS__LICENCE:
        setLicence(LICENCE_EDEFAULT);
        return;
      case DataPackage.METADATAS__CATEGORY_NAME:
        setCategory_name(CATEGORY_NAME_EDEFAULT);
        return;
      case DataPackage.METADATAS__VERSION:
        setVersion(VERSION_EDEFAULT);
        return;
      case DataPackage.METADATAS__DOWNLOAD:
        setDownload(DOWNLOAD_EDEFAULT);
        return;
      case DataPackage.METADATAS__RATE:
        setRate(RATE_EDEFAULT);
        return;
      case DataPackage.METADATAS__NEWS:
        setNews(NEWS_EDEFAULT);
        return;
      case DataPackage.METADATAS__DATE:
        setDate(DATE_EDEFAULT);
        return;
      case DataPackage.METADATAS__SIZE:
        setSize(SIZE_EDEFAULT);
        return;
      case DataPackage.METADATAS__PRICE:
        setPrice(PRICE_EDEFAULT);
        return;
      case DataPackage.METADATAS__SOURCE:
        setSource(SOURCE_EDEFAULT);
        return;
      case DataPackage.METADATAS__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DataPackage.METADATAS__NAME_FR_FR:
        setName_frFR(NAME_FR_FR_EDEFAULT);
        return;
      case DataPackage.METADATAS__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case DataPackage.METADATAS__DESCRIPTION_FR_FR:
        setDescription_frFR(DESCRIPTION_FR_FR_EDEFAULT);
        return;
      case DataPackage.METADATAS__SHORT_DESCRIPTION:
        setShortDescription(SHORT_DESCRIPTION_EDEFAULT);
        return;
      case DataPackage.METADATAS__MAPS_URI:
        setMapsUri(MAPS_URI_EDEFAULT);
        return;
      case DataPackage.METADATAS__IMAGE_MAIN_URI:
        setImage_mainUri(IMAGE_MAIN_URI_EDEFAULT);
        return;
      case DataPackage.METADATAS__IMAGE_PREVIEW2_URI:
        setImage_preview2Uri(IMAGE_PREVIEW2_URI_EDEFAULT);
        return;
      case DataPackage.METADATAS__SITE_URI:
        setSiteUri(SITE_URI_EDEFAULT);
        return;
      case DataPackage.METADATAS__TRIP_ADVISOR_URI:
        setTripAdvisorUri(TRIP_ADVISOR_URI_EDEFAULT);
        return;
      case DataPackage.METADATAS__CHART:
        setChart(CHART_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean eIsSet(int featureID) {
    switch (featureID) {
      case DataPackage.METADATAS__AUTHOR_NAME:
        return AUTHOR_NAME_EDEFAULT == null ? author_name != null : !AUTHOR_NAME_EDEFAULT.equals(author_name);
      case DataPackage.METADATAS__AUTHOR_EMAIL:
        return AUTHOR_EMAIL_EDEFAULT == null ? author_email != null : !AUTHOR_EMAIL_EDEFAULT.equals(author_email);
      case DataPackage.METADATAS__LICENCE:
        return LICENCE_EDEFAULT == null ? licence != null : !LICENCE_EDEFAULT.equals(licence);
      case DataPackage.METADATAS__CATEGORY_NAME:
        return CATEGORY_NAME_EDEFAULT == null ? category_name != null : !CATEGORY_NAME_EDEFAULT.equals(category_name);
      case DataPackage.METADATAS__VERSION:
        return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
      case DataPackage.METADATAS__DOWNLOAD:
        return DOWNLOAD_EDEFAULT == null ? download != null : !DOWNLOAD_EDEFAULT.equals(download);
      case DataPackage.METADATAS__RATE:
        return RATE_EDEFAULT == null ? rate != null : !RATE_EDEFAULT.equals(rate);
      case DataPackage.METADATAS__NEWS:
        return NEWS_EDEFAULT == null ? news != null : !NEWS_EDEFAULT.equals(news);
      case DataPackage.METADATAS__DATE:
        return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
      case DataPackage.METADATAS__SIZE:
        return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
      case DataPackage.METADATAS__PRICE:
        return PRICE_EDEFAULT == null ? price != null : !PRICE_EDEFAULT.equals(price);
      case DataPackage.METADATAS__SOURCE:
        return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
      case DataPackage.METADATAS__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DataPackage.METADATAS__NAME_FR_FR:
        return NAME_FR_FR_EDEFAULT == null ? name_frFR != null : !NAME_FR_FR_EDEFAULT.equals(name_frFR);
      case DataPackage.METADATAS__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case DataPackage.METADATAS__DESCRIPTION_FR_FR:
        return DESCRIPTION_FR_FR_EDEFAULT == null ? description_frFR != null : !DESCRIPTION_FR_FR_EDEFAULT.equals(description_frFR);
      case DataPackage.METADATAS__SHORT_DESCRIPTION:
        return SHORT_DESCRIPTION_EDEFAULT == null ? shortDescription != null : !SHORT_DESCRIPTION_EDEFAULT.equals(shortDescription);
      case DataPackage.METADATAS__MAPS_URI:
        return MAPS_URI_EDEFAULT == null ? mapsUri != null : !MAPS_URI_EDEFAULT.equals(mapsUri);
      case DataPackage.METADATAS__IMAGE_MAIN_URI:
        return IMAGE_MAIN_URI_EDEFAULT == null ? image_mainUri != null : !IMAGE_MAIN_URI_EDEFAULT.equals(image_mainUri);
      case DataPackage.METADATAS__IMAGE_PREVIEW2_URI:
        return IMAGE_PREVIEW2_URI_EDEFAULT == null ? image_preview2Uri != null : !IMAGE_PREVIEW2_URI_EDEFAULT.equals(image_preview2Uri);
      case DataPackage.METADATAS__SITE_URI:
        return SITE_URI_EDEFAULT == null ? siteUri != null : !SITE_URI_EDEFAULT.equals(siteUri);
      case DataPackage.METADATAS__TRIP_ADVISOR_URI:
        return TRIP_ADVISOR_URI_EDEFAULT == null ? tripAdvisorUri != null : !TRIP_ADVISOR_URI_EDEFAULT.equals(tripAdvisorUri);
      case DataPackage.METADATAS__CHART:
        return CHART_EDEFAULT == null ? chart != null : !CHART_EDEFAULT.equals(chart);
    }
    return super.eIsSet(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (author_name: ");
    result.append(author_name);
    result.append(", author_email: ");
    result.append(author_email);
    result.append(", licence: ");
    result.append(licence);
    result.append(", category_name: ");
    result.append(category_name);
    result.append(", version: ");
    result.append(version);
    result.append(", download: ");
    result.append(download);
    result.append(", rate: ");
    result.append(rate);
    result.append(", news: ");
    result.append(news);
    result.append(", date: ");
    result.append(date);
    result.append(", size: ");
    result.append(size);
    result.append(", price: ");
    result.append(price);
    result.append(", source: ");
    result.append(source);
    result.append(", name: ");
    result.append(name);
    result.append(", name_frFR: ");
    result.append(name_frFR);
    result.append(", description: ");
    result.append(description);
    result.append(", description_frFR: ");
    result.append(description_frFR);
    result.append(", shortDescription: ");
    result.append(shortDescription);
    result.append(", mapsUri: ");
    result.append(mapsUri);
    result.append(", image_mainUri: ");
    result.append(image_mainUri);
    result.append(", image_preview2Uri: ");
    result.append(image_preview2Uri);
    result.append(", siteUri: ");
    result.append(siteUri);
    result.append(", tripAdvisorUri: ");
    result.append(tripAdvisorUri);
    result.append(", chart: ");
    result.append(chart);
    result.append(')');
    return result.toString();
  }

} //MetadatasImpl
