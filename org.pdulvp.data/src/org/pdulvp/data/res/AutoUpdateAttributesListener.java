package org.pdulvp.data.res;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
import org.eclipse.emf.transaction.RollbackException;
import org.pdulvp.data.Timestamp;
import org.pdulvp.data.helpers.DateExt;

public class AutoUpdateAttributesListener extends ResourceSetListenerImpl {

  @Override
  public boolean isPrecommitOnly() {
    return super.isPrecommitOnly();
  }

  @Override
  public Command transactionAboutToCommit(ResourceSetChangeEvent event) throws RollbackException {
    final Collection<Timestamp> images = new HashSet<Timestamp>();

    for (Notification notification : event.getNotifications()) {

      if (notification.getNotifier() instanceof Timestamp) {
        images.add((Timestamp) notification.getNotifier());

        /*
         * if (DataPackage.Literals.IMAGE_ITEM__CATEGORIES.equals(notification.getFeature())) { images.add((Item)
         * notification.getNotifier()); } else if
         * (DataPackage.Literals.IMAGE_ITEM__GICON16_PATH.equals(notification.getFeature())) { images.add((Item)
         * notification.getNotifier()); } else if
         * (DataPackage.Literals.IMAGE_ITEM__GICON_DATA_PATH.equals(notification.getFeature())) { images.add((Item)
         * notification.getNotifier()); } else if
         * (DataPackage.Literals.IMAGE_ITEM__GIMAGE_DATA_PATH.equals(notification.getFeature())) { images.add((Item)
         * notification.getNotifier()); } else if
         * (DataPackage.Literals.IMAGE_ITEM__SOURCE_PATH.equals(notification.getFeature())) { images.add((Item)
         * notification.getNotifier()); } else if
         * (DataPackage.Literals.ABSTRACT_ITEM__TAG.equals(notification.getFeature())) {
         * 
         * }
         */
      }

    }

    if (!images.isEmpty()) {

      return new RecordingCommand(event.getEditingDomain()) {
        @Override
        protected void doExecute() {
          for (Timestamp image : images) {
            image.setTimestamp(DateExt.getCurrentDate());
          }
        }
      };

    }
    return super.transactionAboutToCommit(event);
  }

}
