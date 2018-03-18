/**
 */
package org.pdulvp.data.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.pdulvp.data.Item;

/**
 * This is the item provider adapter for a {@link org.pdulvp.data.Item} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ItemItemProvider extends ImageItemItemProvider {
	/**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ItemItemProvider(AdapterFactory adapterFactory) {
    super(adapterFactory);
  }

	/**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
    if (itemPropertyDescriptors == null) {
      super.getPropertyDescriptors(object);

    }
    return itemPropertyDescriptors;
  }

	/**
	 * This returns Item.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		Object a = getResourceLocator().getImage("full/obj16/Item");
		/*Item image = (Item) object;
		if (image.getGIcon16Path() != null) {
			String path = image.getGIcon16Path().replace("\\", "/");

			try {
				ImageDescriptor overlayImage = ImageDescriptor.createFromURL(new URL("platform:/resource/" + path));
				return overlayImage(object, overlayImage.createImage());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}*/
		// List<Object> img = new ArrayList<Object>();
		// img.add(i);
		// if (c.isInapp()) {
		// Image baseImage = ImageDescriptor.createFromURL((URL)
		// i).createImage();
		// ImageDescriptor overlayImage = ImageDescriptor.createFromURL((URL)
		// EMFEditPlugin.INSTANCE.getImage("full/ovr16/ControlledObject"));
		//
		// DecorationOverlayIcon icon = new DecorationOverlayIcon(baseImage,
		// overlayImage, IDecoration.BOTTOM_LEFT);
		// i = icon.createImage();
		//
		// //img.add(EMFEditPlugin.INSTANCE.getImage(key))
		// }
		// return i;

		return overlayImage(object, getResourceLocator().getImage("full/obj16/Item"));
	}

	@Override
	protected Object overlayImage(Object object, Object image) {
		Object i = super.overlayImage(object, image);
		/*Item c = (Item) object;

		org.eclipse.swt.graphics.Image baseImage = null;
		if (i instanceof URL) {
			baseImage = ImageDescriptor.createFromURL((URL) i).createImage();
		} else {
			baseImage = (org.eclipse.swt.graphics.Image) image;
		}
		Category free = CategoryExt.getCategoryFree(c);
		Category monthly = CategoryExt.getCategoryMonthly01(c);

		if (c.getCategories().contains(free) && c.getCategories().contains(monthly)) {

			ImageDescriptor overlayImage = ImageDescriptor.createFromURL((URL) getResourceLocator().getImage("full/obj16/coins-red"));

			DecorationOverlayIcon icon = new DecorationOverlayIcon(baseImage, overlayImage, IDecoration.BOTTOM_RIGHT);
			i = icon.createImage();
		} else if (c.getCategories().contains(free)) {

			ImageDescriptor overlayImage = ImageDescriptor.createFromURL((URL) getResourceLocator().getImage("full/obj16/coins-green"));

			DecorationOverlayIcon icon = new DecorationOverlayIcon(baseImage, overlayImage, IDecoration.BOTTOM_RIGHT);
			i = icon.createImage();
		} else if (c.getCategories().contains(monthly)) {

			ImageDescriptor overlayImage = ImageDescriptor.createFromURL((URL) getResourceLocator().getImage("full/obj16/coins-blue"));

			DecorationOverlayIcon icon = new DecorationOverlayIcon(baseImage, overlayImage, IDecoration.BOTTOM_RIGHT);
			i = icon.createImage();

		} else if (!c.getCategories().isEmpty()) {

			ImageDescriptor overlayImage = ImageDescriptor.createFromURL((URL) getResourceLocator().getImage("full/obj16/coins"));

			DecorationOverlayIcon icon = new DecorationOverlayIcon(baseImage, overlayImage, IDecoration.BOTTOM_RIGHT);
			i = icon.createImage();

			// img.add(EMFEditPlugin.INSTANCE.getImage(key))
		}*/
		return i;

	}

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected boolean shouldComposeCreationImage() {
    return true;
  }

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = ((Item) object).getSourcePath();
		return (label == null) || (label.length() == 0) ? getString("_UI_Item_type") : getString("_UI_Item_type") + " " + label;
	}

	/**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void notifyChanged(Notification notification) {
    updateChildren(notification);
    super.notifyChanged(notification);
  }

	/**
   * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
   * that can be created under this object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
    super.collectNewChildDescriptors(newChildDescriptors, object);
  }

}
