/**
 */
package org.pdulvp.data.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.pdulvp.data.Category;
import org.pdulvp.data.DataPackage;
import org.pdulvp.data.ImageItem;
import org.pdulvp.data.ItemType;
import org.pdulvp.data.Metadatas;
import org.pdulvp.data.Product;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.data.impl.ImageItemImpl#getSourcePath <em>Source Path</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ImageItemImpl#getDateCreated <em>Date Created</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ImageItemImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ImageItemImpl#getGImageDataPath <em>GImage Data Path</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ImageItemImpl#getGIconDataPath <em>GIcon Data Path</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ImageItemImpl#getGIcon16Path <em>GIcon16 Path</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ImageItemImpl#getGType <em>GType</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ImageItemImpl#getIconData <em>Icon Data</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ImageItemImpl#getImageData <em>Image Data</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ImageItemImpl#getPacks <em>Packs</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ImageItemImpl#getRank <em>Rank</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ImageItemImpl#getMetadatas <em>Metadatas</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ImageItemImpl#getExternalPath <em>External Path</em>}</li>
 *   <li>{@link org.pdulvp.data.impl.ImageItemImpl#getProducts <em>Products</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ImageItemImpl extends ChildItemImpl implements ImageItem {
  /**
   * The default value of the '{@link #getSourcePath() <em>Source Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourcePath()
   * @generated
   * @ordered
   */
  protected static final String SOURCE_PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSourcePath() <em>Source Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourcePath()
   * @generated
   * @ordered
   */
  protected String sourcePath = SOURCE_PATH_EDEFAULT;

  /**
   * The default value of the '{@link #getDateCreated() <em>Date Created</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDateCreated()
   * @generated
   * @ordered
   */
  protected static final String DATE_CREATED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDateCreated() <em>Date Created</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDateCreated()
   * @generated
   * @ordered
   */
  protected String dateCreated = DATE_CREATED_EDEFAULT;

  /**
   * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyle()
   * @generated
   * @ordered
   */
  protected static final String STYLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyle()
   * @generated
   * @ordered
   */
  protected String style = STYLE_EDEFAULT;

  /**
   * The default value of the '{@link #getGImageDataPath() <em>GImage Data Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGImageDataPath()
   * @generated
   * @ordered
   */
  protected static final String GIMAGE_DATA_PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGImageDataPath() <em>GImage Data Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGImageDataPath()
   * @generated
   * @ordered
   */
  protected String gImageDataPath = GIMAGE_DATA_PATH_EDEFAULT;

  /**
   * The default value of the '{@link #getGIconDataPath() <em>GIcon Data Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGIconDataPath()
   * @generated
   * @ordered
   */
  protected static final String GICON_DATA_PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGIconDataPath() <em>GIcon Data Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGIconDataPath()
   * @generated
   * @ordered
   */
  protected String gIconDataPath = GICON_DATA_PATH_EDEFAULT;

  /**
   * The default value of the '{@link #getGIcon16Path() <em>GIcon16 Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGIcon16Path()
   * @generated
   * @ordered
   */
  protected static final String GICON16_PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGIcon16Path() <em>GIcon16 Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGIcon16Path()
   * @generated
   * @ordered
   */
  protected String gIcon16Path = GICON16_PATH_EDEFAULT;

  /**
   * The cached value of the '{@link #getGType() <em>GType</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGType()
   * @generated
   * @ordered
   */
  protected ItemType gType;

  /**
   * The default value of the '{@link #getIconData() <em>Icon Data</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIconData()
   * @generated
   * @ordered
   */
  protected static final String ICON_DATA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIconData() <em>Icon Data</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIconData()
   * @generated
   * @ordered
   */
  protected String iconData = ICON_DATA_EDEFAULT;

  /**
   * The default value of the '{@link #getImageData() <em>Image Data</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImageData()
   * @generated
   * @ordered
   */
  protected static final String IMAGE_DATA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImageData() <em>Image Data</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImageData()
   * @generated
   * @ordered
   */
  protected String imageData = IMAGE_DATA_EDEFAULT;

  /**
   * The default value of the '{@link #getPacks() <em>Packs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPacks()
   * @generated
   * @ordered
   */
  protected static final String PACKS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPacks() <em>Packs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPacks()
   * @generated
   * @ordered
   */
  protected String packs = PACKS_EDEFAULT;

		/**
   * The default value of the '{@link #getRank() <em>Rank</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRank()
   * @generated
   * @ordered
   */
  protected static final int RANK_EDEFAULT = 0;

		/**
   * The cached value of the '{@link #getRank() <em>Rank</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRank()
   * @generated
   * @ordered
   */
  protected int rank = RANK_EDEFAULT;

		/**
   * The cached value of the '{@link #getMetadatas() <em>Metadatas</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetadatas()
   * @generated
   * @ordered
   */
  protected Metadatas metadatas;

		/**
   * The default value of the '{@link #getExternalPath() <em>External Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExternalPath()
   * @generated
   * @ordered
   */
  protected static final String EXTERNAL_PATH_EDEFAULT = null;

		/**
   * The cached value of the '{@link #getExternalPath() <em>External Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExternalPath()
   * @generated
   * @ordered
   */
  protected String externalPath = EXTERNAL_PATH_EDEFAULT;

		/**
   * The cached value of the '{@link #getProducts() <em>Products</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProducts()
   * @generated
   * @ordered
   */
  protected EList<Product> products;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImageItemImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return DataPackage.Literals.IMAGE_ITEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPacks() {
    return packs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Product> getProducts() {
    if (products == null) {
      products = new EObjectResolvingEList<Product>(Product.class, this, DataPackage.IMAGE_ITEM__PRODUCTS);
    }
    return products;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSourcePath() {
    return sourcePath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourcePath(String newSourcePath) {
    String oldSourcePath = sourcePath;
    sourcePath = newSourcePath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.IMAGE_ITEM__SOURCE_PATH, oldSourcePath, sourcePath));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDateCreated() {
    return dateCreated;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDateCreated(String newDateCreated) {
    String oldDateCreated = dateCreated;
    dateCreated = newDateCreated;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.IMAGE_ITEM__DATE_CREATED, oldDateCreated, dateCreated));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStyle() {
    return style;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStyle(String newStyle) {
    String oldStyle = style;
    style = newStyle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.IMAGE_ITEM__STYLE, oldStyle, style));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGImageDataPath() {
    return gImageDataPath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGImageDataPath(String newGImageDataPath) {
    String oldGImageDataPath = gImageDataPath;
    gImageDataPath = newGImageDataPath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.IMAGE_ITEM__GIMAGE_DATA_PATH, oldGImageDataPath, gImageDataPath));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGIconDataPath() {
    return gIconDataPath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGIconDataPath(String newGIconDataPath) {
    String oldGIconDataPath = gIconDataPath;
    gIconDataPath = newGIconDataPath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.IMAGE_ITEM__GICON_DATA_PATH, oldGIconDataPath, gIconDataPath));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGIcon16Path() {
    return gIcon16Path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGIcon16Path(String newGIcon16Path) {
    String oldGIcon16Path = gIcon16Path;
    gIcon16Path = newGIcon16Path;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.IMAGE_ITEM__GICON16_PATH, oldGIcon16Path, gIcon16Path));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItemType getGType() {
    if (gType != null && gType.eIsProxy()) {
      InternalEObject oldGType = (InternalEObject)gType;
      gType = (ItemType)eResolveProxy(oldGType);
      if (gType != oldGType) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.IMAGE_ITEM__GTYPE, oldGType, gType));
      }
    }
    return gType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItemType basicGetGType() {
    return gType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGType(ItemType newGType) {
    ItemType oldGType = gType;
    gType = newGType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.IMAGE_ITEM__GTYPE, oldGType, gType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIconData() {
    return iconData;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIconData(String newIconData) {
    String oldIconData = iconData;
    iconData = newIconData;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.IMAGE_ITEM__ICON_DATA, oldIconData, iconData));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImageData() {
    return imageData;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImageData(String newImageData) {
    String oldImageData = imageData;
    imageData = newImageData;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.IMAGE_ITEM__IMAGE_DATA, oldImageData, imageData));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getRank() {
    return rank;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRank(int newRank) {
    int oldRank = rank;
    rank = newRank;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.IMAGE_ITEM__RANK, oldRank, rank));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Metadatas getMetadatas() {
    return metadatas;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMetadatas(Metadatas newMetadatas, NotificationChain msgs) {
    Metadatas oldMetadatas = metadatas;
    metadatas = newMetadatas;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataPackage.IMAGE_ITEM__METADATAS, oldMetadatas, newMetadatas);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMetadatas(Metadatas newMetadatas) {
    if (newMetadatas != metadatas) {
      NotificationChain msgs = null;
      if (metadatas != null)
        msgs = ((InternalEObject)metadatas).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataPackage.IMAGE_ITEM__METADATAS, null, msgs);
      if (newMetadatas != null)
        msgs = ((InternalEObject)newMetadatas).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataPackage.IMAGE_ITEM__METADATAS, null, msgs);
      msgs = basicSetMetadatas(newMetadatas, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.IMAGE_ITEM__METADATAS, newMetadatas, newMetadatas));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExternalPath() {
    return externalPath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExternalPath(String newExternalPath) {
    String oldExternalPath = externalPath;
    externalPath = newExternalPath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.IMAGE_ITEM__EXTERNAL_PATH, oldExternalPath, externalPath));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case DataPackage.IMAGE_ITEM__METADATAS:
        return basicSetMetadatas(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case DataPackage.IMAGE_ITEM__SOURCE_PATH:
        return getSourcePath();
      case DataPackage.IMAGE_ITEM__DATE_CREATED:
        return getDateCreated();
      case DataPackage.IMAGE_ITEM__STYLE:
        return getStyle();
      case DataPackage.IMAGE_ITEM__GIMAGE_DATA_PATH:
        return getGImageDataPath();
      case DataPackage.IMAGE_ITEM__GICON_DATA_PATH:
        return getGIconDataPath();
      case DataPackage.IMAGE_ITEM__GICON16_PATH:
        return getGIcon16Path();
      case DataPackage.IMAGE_ITEM__GTYPE:
        if (resolve) return getGType();
        return basicGetGType();
      case DataPackage.IMAGE_ITEM__ICON_DATA:
        return getIconData();
      case DataPackage.IMAGE_ITEM__IMAGE_DATA:
        return getImageData();
      case DataPackage.IMAGE_ITEM__PACKS:
        return getPacks();
      case DataPackage.IMAGE_ITEM__RANK:
        return getRank();
      case DataPackage.IMAGE_ITEM__METADATAS:
        return getMetadatas();
      case DataPackage.IMAGE_ITEM__EXTERNAL_PATH:
        return getExternalPath();
      case DataPackage.IMAGE_ITEM__PRODUCTS:
        return getProducts();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case DataPackage.IMAGE_ITEM__SOURCE_PATH:
        setSourcePath((String)newValue);
        return;
      case DataPackage.IMAGE_ITEM__DATE_CREATED:
        setDateCreated((String)newValue);
        return;
      case DataPackage.IMAGE_ITEM__STYLE:
        setStyle((String)newValue);
        return;
      case DataPackage.IMAGE_ITEM__GIMAGE_DATA_PATH:
        setGImageDataPath((String)newValue);
        return;
      case DataPackage.IMAGE_ITEM__GICON_DATA_PATH:
        setGIconDataPath((String)newValue);
        return;
      case DataPackage.IMAGE_ITEM__GICON16_PATH:
        setGIcon16Path((String)newValue);
        return;
      case DataPackage.IMAGE_ITEM__GTYPE:
        setGType((ItemType)newValue);
        return;
      case DataPackage.IMAGE_ITEM__ICON_DATA:
        setIconData((String)newValue);
        return;
      case DataPackage.IMAGE_ITEM__IMAGE_DATA:
        setImageData((String)newValue);
        return;
      case DataPackage.IMAGE_ITEM__RANK:
        setRank((Integer)newValue);
        return;
      case DataPackage.IMAGE_ITEM__METADATAS:
        setMetadatas((Metadatas)newValue);
        return;
      case DataPackage.IMAGE_ITEM__EXTERNAL_PATH:
        setExternalPath((String)newValue);
        return;
      case DataPackage.IMAGE_ITEM__PRODUCTS:
        getProducts().clear();
        getProducts().addAll((Collection<? extends Product>)newValue);
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
      case DataPackage.IMAGE_ITEM__SOURCE_PATH:
        setSourcePath(SOURCE_PATH_EDEFAULT);
        return;
      case DataPackage.IMAGE_ITEM__DATE_CREATED:
        setDateCreated(DATE_CREATED_EDEFAULT);
        return;
      case DataPackage.IMAGE_ITEM__STYLE:
        setStyle(STYLE_EDEFAULT);
        return;
      case DataPackage.IMAGE_ITEM__GIMAGE_DATA_PATH:
        setGImageDataPath(GIMAGE_DATA_PATH_EDEFAULT);
        return;
      case DataPackage.IMAGE_ITEM__GICON_DATA_PATH:
        setGIconDataPath(GICON_DATA_PATH_EDEFAULT);
        return;
      case DataPackage.IMAGE_ITEM__GICON16_PATH:
        setGIcon16Path(GICON16_PATH_EDEFAULT);
        return;
      case DataPackage.IMAGE_ITEM__GTYPE:
        setGType((ItemType)null);
        return;
      case DataPackage.IMAGE_ITEM__ICON_DATA:
        setIconData(ICON_DATA_EDEFAULT);
        return;
      case DataPackage.IMAGE_ITEM__IMAGE_DATA:
        setImageData(IMAGE_DATA_EDEFAULT);
        return;
      case DataPackage.IMAGE_ITEM__RANK:
        setRank(RANK_EDEFAULT);
        return;
      case DataPackage.IMAGE_ITEM__METADATAS:
        setMetadatas((Metadatas)null);
        return;
      case DataPackage.IMAGE_ITEM__EXTERNAL_PATH:
        setExternalPath(EXTERNAL_PATH_EDEFAULT);
        return;
      case DataPackage.IMAGE_ITEM__PRODUCTS:
        getProducts().clear();
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
      case DataPackage.IMAGE_ITEM__SOURCE_PATH:
        return SOURCE_PATH_EDEFAULT == null ? sourcePath != null : !SOURCE_PATH_EDEFAULT.equals(sourcePath);
      case DataPackage.IMAGE_ITEM__DATE_CREATED:
        return DATE_CREATED_EDEFAULT == null ? dateCreated != null : !DATE_CREATED_EDEFAULT.equals(dateCreated);
      case DataPackage.IMAGE_ITEM__STYLE:
        return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
      case DataPackage.IMAGE_ITEM__GIMAGE_DATA_PATH:
        return GIMAGE_DATA_PATH_EDEFAULT == null ? gImageDataPath != null : !GIMAGE_DATA_PATH_EDEFAULT.equals(gImageDataPath);
      case DataPackage.IMAGE_ITEM__GICON_DATA_PATH:
        return GICON_DATA_PATH_EDEFAULT == null ? gIconDataPath != null : !GICON_DATA_PATH_EDEFAULT.equals(gIconDataPath);
      case DataPackage.IMAGE_ITEM__GICON16_PATH:
        return GICON16_PATH_EDEFAULT == null ? gIcon16Path != null : !GICON16_PATH_EDEFAULT.equals(gIcon16Path);
      case DataPackage.IMAGE_ITEM__GTYPE:
        return gType != null;
      case DataPackage.IMAGE_ITEM__ICON_DATA:
        return ICON_DATA_EDEFAULT == null ? iconData != null : !ICON_DATA_EDEFAULT.equals(iconData);
      case DataPackage.IMAGE_ITEM__IMAGE_DATA:
        return IMAGE_DATA_EDEFAULT == null ? imageData != null : !IMAGE_DATA_EDEFAULT.equals(imageData);
      case DataPackage.IMAGE_ITEM__PACKS:
        return PACKS_EDEFAULT == null ? packs != null : !PACKS_EDEFAULT.equals(packs);
      case DataPackage.IMAGE_ITEM__RANK:
        return rank != RANK_EDEFAULT;
      case DataPackage.IMAGE_ITEM__METADATAS:
        return metadatas != null;
      case DataPackage.IMAGE_ITEM__EXTERNAL_PATH:
        return EXTERNAL_PATH_EDEFAULT == null ? externalPath != null : !EXTERNAL_PATH_EDEFAULT.equals(externalPath);
      case DataPackage.IMAGE_ITEM__PRODUCTS:
        return products != null && !products.isEmpty();
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
    result.append(" (sourcePath: ");
    result.append(sourcePath);
    result.append(", dateCreated: ");
    result.append(dateCreated);
    result.append(", style: ");
    result.append(style);
    result.append(", gImageDataPath: ");
    result.append(gImageDataPath);
    result.append(", gIconDataPath: ");
    result.append(gIconDataPath);
    result.append(", gIcon16Path: ");
    result.append(gIcon16Path);
    result.append(", iconData: ");
    result.append(iconData);
    result.append(", imageData: ");
    result.append(imageData);
    result.append(", packs: ");
    result.append(packs);
    result.append(", rank: ");
    result.append(rank);
    result.append(", externalPath: ");
    result.append(externalPath);
    result.append(')');
    return result.toString();
  }

} //ImageItemImpl
