/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pdulvp.data;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.pdulvp.data.DataPackage
 * @generated
 */
public interface DataFactory extends EFactory {
	/**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	DataFactory eINSTANCE = org.pdulvp.data.impl.DataFactoryImpl.init();

	/**
   * Returns a new object of class '<em>Category</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Category</em>'.
   * @generated
   */
	Category createCategory();

	/**
   * Returns a new object of class '<em>Item</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Item</em>'.
   * @generated
   */
	Item createItem();

	/**
   * Returns a new object of class '<em>Item Root</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Item Root</em>'.
   * @generated
   */
	ItemRoot createItemRoot();

	/**
   * Returns a new object of class '<em>Item Pkg</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Item Pkg</em>'.
   * @generated
   */
	ItemPkg createItemPkg();

	/**
   * Returns a new object of class '<em>Screen Pkg</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Screen Pkg</em>'.
   * @generated
   */
  ScreenPkg createScreenPkg();

  /**
   * Returns a new object of class '<em>Category Pkg</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Category Pkg</em>'.
   * @generated
   */
  CategoryPkg createCategoryPkg();

  /**
   * Returns a new object of class '<em>Product Pkg</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Product Pkg</em>'.
   * @generated
   */
  ProductPkg createProductPkg();

  /**
   * Returns a new object of class '<em>Item Type Pkg</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Item Type Pkg</em>'.
   * @generated
   */
  ItemTypePkg createItemTypePkg();

  /**
   * Returns a new object of class '<em>Timestamp</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Timestamp</em>'.
   * @generated
   */
	Timestamp createTimestamp();

	/**
   * Returns a new object of class '<em>Screen</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Screen</em>'.
   * @generated
   */
	Screen createScreen();

	/**
   * Returns a new object of class '<em>Screen List</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Screen List</em>'.
   * @generated
   */
	ScreenList createScreenList();

	/**
   * Returns a new object of class '<em>User</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>User</em>'.
   * @generated
   */
	User createUser();

	/**
   * Returns a new object of class '<em>OAuth Token</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>OAuth Token</em>'.
   * @generated
   */
	OAuthToken createOAuthToken();

	/**
   * Returns a new object of class '<em>Item Type</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Item Type</em>'.
   * @generated
   */
	ItemType createItemType();

	/**
   * Returns a new object of class '<em>Metadatas</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Metadatas</em>'.
   * @generated
   */
	Metadatas createMetadatas();

	/**
   * Returns a new object of class '<em>Home Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Home Item</em>'.
   * @generated
   */
  HomeItem createHomeItem();

  /**
   * Returns a new object of class '<em>Application</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Application</em>'.
   * @generated
   */
  Application createApplication();

  /**
   * Returns a new object of class '<em>Schema Pkg</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Schema Pkg</em>'.
   * @generated
   */
  SchemaPkg createSchemaPkg();

  /**
   * Returns a new object of class '<em>Product</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Product</em>'.
   * @generated
   */
  Product createProduct();

  /**
   * Returns a new object of class '<em>Schema</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Schema</em>'.
   * @generated
   */
  Schema createSchema();

  /**
   * Returns a new object of class '<em>Schema Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Schema Class</em>'.
   * @generated
   */
  SchemaClass createSchemaClass();

  /**
   * Returns a new object of class '<em>Schema Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Schema Feature</em>'.
   * @generated
   */
  SchemaFeature createSchemaFeature();

  /**
   * Returns a new object of class '<em>Request Pkg</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Request Pkg</em>'.
   * @generated
   */
  RequestPkg createRequestPkg();

  /**
   * Returns a new object of class '<em>Request</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Request</em>'.
   * @generated
   */
  Request createRequest();

  /**
   * Returns a new object of class '<em>Job Pkg</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Job Pkg</em>'.
   * @generated
   */
  JobPkg createJobPkg();

  /**
   * Returns a new object of class '<em>Job</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Job</em>'.
   * @generated
   */
  Job createJob();

  /**
   * Returns a new object of class '<em>Trigger</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Trigger</em>'.
   * @generated
   */
  Trigger createTrigger();

  /**
   * Returns a new object of class '<em>Item Product</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Item Product</em>'.
   * @generated
   */
  ItemProduct createItemProduct();

  /**
   * Returns a new object of class '<em>Category View</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Category View</em>'.
   * @generated
   */
	CategoryView createCategoryView();

	/**
   * Returns a new object of class '<em>Home Screen List</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Home Screen List</em>'.
   * @generated
   */
	HomeScreenList createHomeScreenList();

	/**
   * Returns a new object of class '<em>Favourite Items View</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Favourite Items View</em>'.
   * @generated
   */
	FavouriteItemsView createFavouriteItemsView();

	/**
   * Returns a new object of class '<em>Favourite Categories View</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Favourite Categories View</em>'.
   * @generated
   */
	FavouriteCategoriesView createFavouriteCategoriesView();

	/**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
	DataPackage getDataPackage();

} //DataFactory
