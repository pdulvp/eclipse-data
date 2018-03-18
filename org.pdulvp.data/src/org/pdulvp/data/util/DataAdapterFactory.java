/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pdulvp.data.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.pdulvp.data.*;
import org.pdulvp.data.table.DNamedElement;
import org.pdulvp.data.table.DTablePkg;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.pdulvp.data.DataPackage
 * @generated
 */
public class DataAdapterFactory extends AdapterFactoryImpl {
	/**
   * The cached model package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static DataPackage modelPackage;

	/**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DataAdapterFactory() {
    if (modelPackage == null) {
      modelPackage = DataPackage.eINSTANCE;
    }
  }

	/**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
	@Override
	public boolean isFactoryForType(Object object) {
    if (object == modelPackage) {
      return true;
    }
    if (object instanceof EObject) {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

	/**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected DataSwitch<Adapter> modelSwitch =
		new DataSwitch<Adapter>() {
      @Override
      public Adapter caseItemRoot(ItemRoot object) {
        return createItemRootAdapter();
      }
      @Override
      public Adapter caseItemPkg(ItemPkg object) {
        return createItemPkgAdapter();
      }
      @Override
      public Adapter caseChildItem(ChildItem object) {
        return createChildItemAdapter();
      }
      @Override
      public Adapter caseScreenPkg(ScreenPkg object) {
        return createScreenPkgAdapter();
      }
      @Override
      public Adapter caseCategoryPkg(CategoryPkg object) {
        return createCategoryPkgAdapter();
      }
      @Override
      public Adapter caseItemTypePkg(ItemTypePkg object) {
        return createItemTypePkgAdapter();
      }
      @Override
      public Adapter caseTimestamp(Timestamp object) {
        return createTimestampAdapter();
      }
      @Override
      public Adapter caseAbstractItem(AbstractItem object) {
        return createAbstractItemAdapter();
      }
      @Override
      public Adapter caseNamedItem(NamedItem object) {
        return createNamedItemAdapter();
      }
      @Override
      public Adapter caseCategory(Category object) {
        return createCategoryAdapter();
      }
      @Override
      public Adapter caseItem(Item object) {
        return createItemAdapter();
      }
      @Override
      public Adapter caseImageItem(ImageItem object) {
        return createImageItemAdapter();
      }
      @Override
      public Adapter caseHomeItem(HomeItem object) {
        return createHomeItemAdapter();
      }
      @Override
      public Adapter caseScreen(Screen object) {
        return createScreenAdapter();
      }
      @Override
      public Adapter caseUser(User object) {
        return createUserAdapter();
      }
      @Override
      public Adapter caseScreenList(ScreenList object) {
        return createScreenListAdapter();
      }
      @Override
      public Adapter caseHomeScreenList(HomeScreenList object) {
        return createHomeScreenListAdapter();
      }
      @Override
      public Adapter caseCategoryView(CategoryView object) {
        return createCategoryViewAdapter();
      }
      @Override
      public Adapter caseFavouriteItemsView(FavouriteItemsView object) {
        return createFavouriteItemsViewAdapter();
      }
      @Override
      public Adapter caseFavouriteCategoriesView(FavouriteCategoriesView object) {
        return createFavouriteCategoriesViewAdapter();
      }
      @Override
      public Adapter caseItemType(ItemType object) {
        return createItemTypeAdapter();
      }
      @Override
      public Adapter caseMetadatas(Metadatas object) {
        return createMetadatasAdapter();
      }
      @Override
      public Adapter caseProductPkg(ProductPkg object) {
        return createProductPkgAdapter();
      }
      @Override
      public Adapter caseProduct(Product object) {
        return createProductAdapter();
      }
      @Override
      public Adapter caseItemProduct(ItemProduct object) {
        return createItemProductAdapter();
      }
      @Override
      public Adapter caseOAuthToken(OAuthToken object) {
        return createOAuthTokenAdapter();
      }
      @Override
      public Adapter caseApplication(Application object) {
        return createApplicationAdapter();
      }
      @Override
      public Adapter caseSchemaPkg(SchemaPkg object) {
        return createSchemaPkgAdapter();
      }
      @Override
      public Adapter caseSchema(Schema object) {
        return createSchemaAdapter();
      }
      @Override
      public Adapter caseSchemaClass(SchemaClass object) {
        return createSchemaClassAdapter();
      }
      @Override
      public Adapter caseSchemaFeature(SchemaFeature object) {
        return createSchemaFeatureAdapter();
      }
      @Override
      public Adapter caseRequestPkg(RequestPkg object) {
        return createRequestPkgAdapter();
      }
      @Override
      public Adapter caseRequest(Request object) {
        return createRequestAdapter();
      }
      @Override
      public Adapter caseJobPkg(JobPkg object) {
        return createJobPkgAdapter();
      }
      @Override
      public Adapter caseJob(Job object) {
        return createJobAdapter();
      }
      @Override
      public Adapter caseTrigger(Trigger object) {
        return createTriggerAdapter();
      }
      @Override
      public Adapter caseDNamedElement(DNamedElement object) {
        return createDNamedElementAdapter();
      }
      @Override
      public Adapter caseDTablePkg(DTablePkg object) {
        return createDTablePkgAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object) {
        return createEObjectAdapter();
      }
    };

	/**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
	@Override
	public Adapter createAdapter(Notifier target) {
    return modelSwitch.doSwitch((EObject)target);
  }


	/**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.NamedItem <em>Named Item</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.NamedItem
   * @generated
   */
	public Adapter createNamedItemAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.Category <em>Category</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.Category
   * @generated
   */
	public Adapter createCategoryAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.ImageItem <em>Image Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.ImageItem
   * @generated
   */
  public Adapter createImageItemAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.Item <em>Item</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.Item
   * @generated
   */
	public Adapter createItemAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.ItemRoot <em>Item Root</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.ItemRoot
   * @generated
   */
	public Adapter createItemRootAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.ItemPkg <em>Item Pkg</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.ItemPkg
   * @generated
   */
	public Adapter createItemPkgAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.ChildItem <em>Child Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.ChildItem
   * @generated
   */
  public Adapter createChildItemAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.ScreenPkg <em>Screen Pkg</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.ScreenPkg
   * @generated
   */
  public Adapter createScreenPkgAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.CategoryPkg <em>Category Pkg</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.CategoryPkg
   * @generated
   */
  public Adapter createCategoryPkgAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.ProductPkg <em>Product Pkg</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.ProductPkg
   * @generated
   */
  public Adapter createProductPkgAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.ItemTypePkg <em>Item Type Pkg</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.ItemTypePkg
   * @generated
   */
  public Adapter createItemTypePkgAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.Timestamp <em>Timestamp</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.Timestamp
   * @generated
   */
	public Adapter createTimestampAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.AbstractItem <em>Abstract Item</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.AbstractItem
   * @generated
   */
	public Adapter createAbstractItemAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.Screen <em>Screen</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.Screen
   * @generated
   */
	public Adapter createScreenAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.ScreenList <em>Screen List</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.ScreenList
   * @generated
   */
	public Adapter createScreenListAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.User <em>User</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.User
   * @generated
   */
	public Adapter createUserAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.OAuthToken <em>OAuth Token</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.OAuthToken
   * @generated
   */
	public Adapter createOAuthTokenAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.ItemType <em>Item Type</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.ItemType
   * @generated
   */
	public Adapter createItemTypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.Metadatas <em>Metadatas</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.Metadatas
   * @generated
   */
	public Adapter createMetadatasAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.HomeItem <em>Home Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.HomeItem
   * @generated
   */
  public Adapter createHomeItemAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.Application <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.Application
   * @generated
   */
  public Adapter createApplicationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.SchemaPkg <em>Schema Pkg</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.SchemaPkg
   * @generated
   */
  public Adapter createSchemaPkgAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.Product <em>Product</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.Product
   * @generated
   */
  public Adapter createProductAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.Schema <em>Schema</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.Schema
   * @generated
   */
  public Adapter createSchemaAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.SchemaClass <em>Schema Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.SchemaClass
   * @generated
   */
  public Adapter createSchemaClassAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.SchemaFeature <em>Schema Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.SchemaFeature
   * @generated
   */
  public Adapter createSchemaFeatureAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.RequestPkg <em>Request Pkg</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.RequestPkg
   * @generated
   */
  public Adapter createRequestPkgAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.Request <em>Request</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.Request
   * @generated
   */
  public Adapter createRequestAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.JobPkg <em>Job Pkg</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.JobPkg
   * @generated
   */
  public Adapter createJobPkgAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.Job <em>Job</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.Job
   * @generated
   */
  public Adapter createJobAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.Trigger <em>Trigger</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.Trigger
   * @generated
   */
  public Adapter createTriggerAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.ItemProduct <em>Item Product</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.ItemProduct
   * @generated
   */
  public Adapter createItemProductAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.table.DNamedElement <em>DNamed Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.table.DNamedElement
   * @generated
   */
  public Adapter createDNamedElementAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.table.DTablePkg <em>DTable Pkg</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.table.DTablePkg
   * @generated
   */
  public Adapter createDTablePkgAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.CategoryView <em>Category View</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.CategoryView
   * @generated
   */
	public Adapter createCategoryViewAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.HomeScreenList <em>Home Screen List</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.HomeScreenList
   * @generated
   */
	public Adapter createHomeScreenListAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.FavouriteItemsView <em>Favourite Items View</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.FavouriteItemsView
   * @generated
   */
	public Adapter createFavouriteItemsViewAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.pdulvp.data.FavouriteCategoriesView <em>Favourite Categories View</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.data.FavouriteCategoriesView
   * @generated
   */
	public Adapter createFavouriteCategoriesViewAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
	public Adapter createEObjectAdapter() {
    return null;
  }

} //DataAdapterFactory
