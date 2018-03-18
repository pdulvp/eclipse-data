/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pdulvp.data.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.pdulvp.data.*;
import org.pdulvp.data.table.DNamedElement;
import org.pdulvp.data.table.DTablePkg;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.pdulvp.data.DataPackage
 * @generated
 */
public class DataSwitch<T> extends Switch<T> {
	/**
   * The cached model package
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static DataPackage modelPackage;

	/**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DataSwitch() {
    if (modelPackage == null) {
      modelPackage = DataPackage.eINSTANCE;
    }
  }

	/**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
    return ePackage == modelPackage;
  }

	/**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
    switch (classifierID) {
      case DataPackage.ITEM_ROOT: {
        ItemRoot itemRoot = (ItemRoot)theEObject;
        T result = caseItemRoot(itemRoot);
        if (result == null) result = caseCategoryPkg(itemRoot);
        if (result == null) result = caseProductPkg(itemRoot);
        if (result == null) result = caseItemPkg(itemRoot);
        if (result == null) result = caseScreenPkg(itemRoot);
        if (result == null) result = caseItemTypePkg(itemRoot);
        if (result == null) result = caseDTablePkg(itemRoot);
        if (result == null) result = caseTimestamp(itemRoot);
        if (result == null) result = caseNamedItem(itemRoot);
        if (result == null) result = caseDNamedElement(itemRoot);
        if (result == null) result = caseAbstractItem(itemRoot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataPackage.ITEM_PKG: {
        ItemPkg itemPkg = (ItemPkg)theEObject;
        T result = caseItemPkg(itemPkg);
        if (result == null) result = caseNamedItem(itemPkg);
        if (result == null) result = caseAbstractItem(itemPkg);
        if (result == null) result = caseTimestamp(itemPkg);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataPackage.CHILD_ITEM: {
        ChildItem childItem = (ChildItem)theEObject;
        T result = caseChildItem(childItem);
        if (result == null) result = caseAbstractItem(childItem);
        if (result == null) result = caseTimestamp(childItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataPackage.SCREEN_PKG: {
        ScreenPkg screenPkg = (ScreenPkg)theEObject;
        T result = caseScreenPkg(screenPkg);
        if (result == null) result = caseNamedItem(screenPkg);
        if (result == null) result = caseAbstractItem(screenPkg);
        if (result == null) result = caseTimestamp(screenPkg);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataPackage.CATEGORY_PKG: {
        CategoryPkg categoryPkg = (CategoryPkg)theEObject;
        T result = caseCategoryPkg(categoryPkg);
        if (result == null) result = caseNamedItem(categoryPkg);
        if (result == null) result = caseAbstractItem(categoryPkg);
        if (result == null) result = caseTimestamp(categoryPkg);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataPackage.ITEM_TYPE_PKG: {
        ItemTypePkg itemTypePkg = (ItemTypePkg)theEObject;
        T result = caseItemTypePkg(itemTypePkg);
        if (result == null) result = caseNamedItem(itemTypePkg);
        if (result == null) result = caseAbstractItem(itemTypePkg);
        if (result == null) result = caseTimestamp(itemTypePkg);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataPackage.TIMESTAMP: {
        Timestamp timestamp = (Timestamp)theEObject;
        T result = caseTimestamp(timestamp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataPackage.ABSTRACT_ITEM: {
        AbstractItem abstractItem = (AbstractItem)theEObject;
        T result = caseAbstractItem(abstractItem);
        if (result == null) result = caseTimestamp(abstractItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataPackage.NAMED_ITEM: {
        NamedItem namedItem = (NamedItem)theEObject;
        T result = caseNamedItem(namedItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataPackage.CATEGORY: {
        Category category = (Category)theEObject;
        T result = caseCategory(category);
        if (result == null) result = caseItemPkg(category);
        if (result == null) result = caseNamedItem(category);
        if (result == null) result = caseAbstractItem(category);
        if (result == null) result = caseTimestamp(category);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataPackage.ITEM: {
        Item item = (Item)theEObject;
        T result = caseItem(item);
        if (result == null) result = caseImageItem(item);
        if (result == null) result = caseChildItem(item);
        if (result == null) result = caseAbstractItem(item);
        if (result == null) result = caseTimestamp(item);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataPackage.IMAGE_ITEM: {
        ImageItem imageItem = (ImageItem)theEObject;
        T result = caseImageItem(imageItem);
        if (result == null) result = caseChildItem(imageItem);
        if (result == null) result = caseAbstractItem(imageItem);
        if (result == null) result = caseTimestamp(imageItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataPackage.HOME_ITEM: {
        HomeItem homeItem = (HomeItem)theEObject;
        T result = caseHomeItem(homeItem);
        if (result == null) result = caseAbstractItem(homeItem);
        if (result == null) result = caseTimestamp(homeItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataPackage.SCREEN: {
        Screen screen = (Screen)theEObject;
        T result = caseScreen(screen);
        if (result == null) result = caseNamedItem(screen);
        if (result == null) result = caseAbstractItem(screen);
        if (result == null) result = caseTimestamp(screen);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataPackage.USER: {
        User user = (User)theEObject;
        T result = caseUser(user);
        if (result == null) result = caseAbstractItem(user);
        if (result == null) result = caseTimestamp(user);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataPackage.SCREEN_LIST: {
        ScreenList screenList = (ScreenList)theEObject;
        T result = caseScreenList(screenList);
        if (result == null) result = caseAbstractItem(screenList);
        if (result == null) result = caseTimestamp(screenList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataPackage.HOME_SCREEN_LIST: {
        HomeScreenList homeScreenList = (HomeScreenList)theEObject;
        T result = caseHomeScreenList(homeScreenList);
        if (result == null) result = caseScreenList(homeScreenList);
        if (result == null) result = caseAbstractItem(homeScreenList);
        if (result == null) result = caseTimestamp(homeScreenList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataPackage.CATEGORY_VIEW: {
        CategoryView categoryView = (CategoryView)theEObject;
        T result = caseCategoryView(categoryView);
        if (result == null) result = caseCategory(categoryView);
        if (result == null) result = caseItemPkg(categoryView);
        if (result == null) result = caseNamedItem(categoryView);
        if (result == null) result = caseAbstractItem(categoryView);
        if (result == null) result = caseTimestamp(categoryView);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataPackage.FAVOURITE_ITEMS_VIEW: {
        FavouriteItemsView favouriteItemsView = (FavouriteItemsView)theEObject;
        T result = caseFavouriteItemsView(favouriteItemsView);
        if (result == null) result = caseScreenList(favouriteItemsView);
        if (result == null) result = caseAbstractItem(favouriteItemsView);
        if (result == null) result = caseTimestamp(favouriteItemsView);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataPackage.FAVOURITE_CATEGORIES_VIEW: {
        FavouriteCategoriesView favouriteCategoriesView = (FavouriteCategoriesView)theEObject;
        T result = caseFavouriteCategoriesView(favouriteCategoriesView);
        if (result == null) result = caseScreenList(favouriteCategoriesView);
        if (result == null) result = caseAbstractItem(favouriteCategoriesView);
        if (result == null) result = caseTimestamp(favouriteCategoriesView);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataPackage.ITEM_TYPE: {
        ItemType itemType = (ItemType)theEObject;
        T result = caseItemType(itemType);
        if (result == null) result = caseNamedItem(itemType);
        if (result == null) result = caseAbstractItem(itemType);
        if (result == null) result = caseTimestamp(itemType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataPackage.METADATAS: {
        Metadatas metadatas = (Metadatas)theEObject;
        T result = caseMetadatas(metadatas);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataPackage.PRODUCT_PKG: {
        ProductPkg productPkg = (ProductPkg)theEObject;
        T result = caseProductPkg(productPkg);
        if (result == null) result = caseNamedItem(productPkg);
        if (result == null) result = caseAbstractItem(productPkg);
        if (result == null) result = caseTimestamp(productPkg);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataPackage.PRODUCT: {
        Product product = (Product)theEObject;
        T result = caseProduct(product);
        if (result == null) result = caseNamedItem(product);
        if (result == null) result = caseAbstractItem(product);
        if (result == null) result = caseTimestamp(product);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataPackage.ITEM_PRODUCT: {
        ItemProduct itemProduct = (ItemProduct)theEObject;
        T result = caseItemProduct(itemProduct);
        if (result == null) result = caseAbstractItem(itemProduct);
        if (result == null) result = caseTimestamp(itemProduct);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataPackage.OAUTH_TOKEN: {
        OAuthToken oAuthToken = (OAuthToken)theEObject;
        T result = caseOAuthToken(oAuthToken);
        if (result == null) result = caseTimestamp(oAuthToken);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataPackage.APPLICATION: {
        Application application = (Application)theEObject;
        T result = caseApplication(application);
        if (result == null) result = caseCategoryPkg(application);
        if (result == null) result = caseItemPkg(application);
        if (result == null) result = caseScreenPkg(application);
        if (result == null) result = caseJobPkg(application);
        if (result == null) result = caseRequestPkg(application);
        if (result == null) result = caseSchemaPkg(application);
        if (result == null) result = caseAbstractItem(application);
        if (result == null) result = caseTimestamp(application);
        if (result == null) result = caseNamedItem(application);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataPackage.SCHEMA_PKG: {
        SchemaPkg schemaPkg = (SchemaPkg)theEObject;
        T result = caseSchemaPkg(schemaPkg);
        if (result == null) result = caseAbstractItem(schemaPkg);
        if (result == null) result = caseNamedItem(schemaPkg);
        if (result == null) result = caseTimestamp(schemaPkg);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataPackage.SCHEMA: {
        Schema schema = (Schema)theEObject;
        T result = caseSchema(schema);
        if (result == null) result = caseNamedItem(schema);
        if (result == null) result = caseDTablePkg(schema);
        if (result == null) result = caseTimestamp(schema);
        if (result == null) result = caseDNamedElement(schema);
        if (result == null) result = caseAbstractItem(schema);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataPackage.SCHEMA_CLASS: {
        SchemaClass schemaClass = (SchemaClass)theEObject;
        T result = caseSchemaClass(schemaClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataPackage.SCHEMA_FEATURE: {
        SchemaFeature schemaFeature = (SchemaFeature)theEObject;
        T result = caseSchemaFeature(schemaFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataPackage.REQUEST_PKG: {
        RequestPkg requestPkg = (RequestPkg)theEObject;
        T result = caseRequestPkg(requestPkg);
        if (result == null) result = caseAbstractItem(requestPkg);
        if (result == null) result = caseNamedItem(requestPkg);
        if (result == null) result = caseTimestamp(requestPkg);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataPackage.REQUEST: {
        Request request = (Request)theEObject;
        T result = caseRequest(request);
        if (result == null) result = caseAbstractItem(request);
        if (result == null) result = caseNamedItem(request);
        if (result == null) result = caseTimestamp(request);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataPackage.JOB_PKG: {
        JobPkg jobPkg = (JobPkg)theEObject;
        T result = caseJobPkg(jobPkg);
        if (result == null) result = caseAbstractItem(jobPkg);
        if (result == null) result = caseNamedItem(jobPkg);
        if (result == null) result = caseTimestamp(jobPkg);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataPackage.JOB: {
        Job job = (Job)theEObject;
        T result = caseJob(job);
        if (result == null) result = caseAbstractItem(job);
        if (result == null) result = caseNamedItem(job);
        if (result == null) result = caseTimestamp(job);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DataPackage.TRIGGER: {
        Trigger trigger = (Trigger)theEObject;
        T result = caseTrigger(trigger);
        if (result == null) result = caseAbstractItem(trigger);
        if (result == null) result = caseNamedItem(trigger);
        if (result == null) result = caseTimestamp(trigger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Named Item</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseNamedItem(NamedItem object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Category</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Category</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCategory(Category object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Image Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Image Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImageItem(ImageItem object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseItem(Item object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Item Root</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Item Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseItemRoot(ItemRoot object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Item Pkg</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Item Pkg</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseItemPkg(ItemPkg object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Child Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Child Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChildItem(ChildItem object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Screen Pkg</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Screen Pkg</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScreenPkg(ScreenPkg object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Category Pkg</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Category Pkg</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCategoryPkg(CategoryPkg object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Product Pkg</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Product Pkg</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProductPkg(ProductPkg object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Item Type Pkg</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Item Type Pkg</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseItemTypePkg(ItemTypePkg object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Timestamp</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Timestamp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTimestamp(Timestamp object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Item</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAbstractItem(AbstractItem object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Screen</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Screen</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseScreen(Screen object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Screen List</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Screen List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseScreenList(ScreenList object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>User</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>User</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseUser(User object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>OAuth Token</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>OAuth Token</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseOAuthToken(OAuthToken object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Item Type</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Item Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseItemType(ItemType object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Metadatas</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Metadatas</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMetadatas(Metadatas object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Home Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Home Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHomeItem(HomeItem object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplication(Application object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Schema Pkg</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Schema Pkg</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSchemaPkg(SchemaPkg object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Product</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Product</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProduct(Product object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Schema</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Schema</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSchema(Schema object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Schema Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Schema Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSchemaClass(SchemaClass object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Schema Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Schema Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSchemaFeature(SchemaFeature object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Request Pkg</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Request Pkg</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequestPkg(RequestPkg object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Request</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Request</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequest(Request object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Job Pkg</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Job Pkg</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJobPkg(JobPkg object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Job</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Job</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJob(Job object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trigger</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trigger</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrigger(Trigger object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Item Product</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Item Product</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseItemProduct(ItemProduct object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DNamed Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DNamed Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDNamedElement(DNamedElement object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DTable Pkg</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DTable Pkg</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDTablePkg(DTablePkg object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Category View</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Category View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCategoryView(CategoryView object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Home Screen List</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Home Screen List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseHomeScreenList(HomeScreenList object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Favourite Items View</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Favourite Items View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFavouriteItemsView(FavouriteItemsView object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Favourite Categories View</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Favourite Categories View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFavouriteCategoriesView(FavouriteCategoriesView object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
	@Override
	public T defaultCase(EObject object) {
    return null;
  }

} //DataSwitch
