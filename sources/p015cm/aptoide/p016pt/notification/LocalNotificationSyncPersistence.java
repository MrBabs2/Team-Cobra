package p015cm.aptoide.p016pt.notification;

import p015cm.aptoide.p016pt.notification.sync.LocalNotificationSync;
import p015cm.aptoide.p016pt.sync.Sync;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.notification.LocalNotificationSyncPersistence */
public interface LocalNotificationSyncPersistence {
    C5368e<Sync> get(String str);

    void remove(String str);

    void save(LocalNotificationSync localNotificationSync);
}
