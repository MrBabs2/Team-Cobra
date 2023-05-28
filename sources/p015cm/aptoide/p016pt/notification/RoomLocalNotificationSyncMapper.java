package p015cm.aptoide.p016pt.notification;

import p015cm.aptoide.p016pt.database.room.RoomLocalNotificationSync;
import p015cm.aptoide.p016pt.notification.sync.LocalNotificationSync;

/* renamed from: cm.aptoide.pt.notification.RoomLocalNotificationSyncMapper */
public class RoomLocalNotificationSyncMapper {
    public RoomLocalNotificationSync map(LocalNotificationSync localNotificationSync) {
        return new RoomLocalNotificationSync(localNotificationSync.getId(), localNotificationSync.getTitle(), localNotificationSync.getBody(), localNotificationSync.getImage(), localNotificationSync.getActionString(), localNotificationSync.getNavigationUrl(), localNotificationSync.getTrigger(), localNotificationSync.getId(), localNotificationSync.getType());
    }

    public LocalNotificationSync map(RoomLocalNotificationSync roomLocalNotificationSync, NotificationProvider notificationProvider) {
        return new LocalNotificationSync(notificationProvider, false, false, 0, roomLocalNotificationSync.getTrigger(), roomLocalNotificationSync.getTitle(), roomLocalNotificationSync.getBody(), roomLocalNotificationSync.getImage(), roomLocalNotificationSync.getActionStringRes(), roomLocalNotificationSync.getNavigationUrl(), roomLocalNotificationSync.getId(), roomLocalNotificationSync.getType());
    }
}
