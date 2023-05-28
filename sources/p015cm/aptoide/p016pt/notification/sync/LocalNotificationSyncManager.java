package p015cm.aptoide.p016pt.notification.sync;

import p015cm.aptoide.p016pt.notification.NotificationProvider;
import p015cm.aptoide.p016pt.sync.SyncScheduler;

/* renamed from: cm.aptoide.pt.notification.sync.LocalNotificationSyncManager */
public class LocalNotificationSyncManager {
    public static final long FIVE_MINUTES = 300000;
    public static final long TWO_MINUTES = 120000;
    private boolean enabled;
    private final NotificationProvider provider;
    private final SyncScheduler syncScheduler;

    public LocalNotificationSyncManager(SyncScheduler syncScheduler2, boolean z, NotificationProvider notificationProvider) {
        this.syncScheduler = syncScheduler2;
        this.enabled = z;
        this.provider = notificationProvider;
    }

    public void schedule(String str, String str2, String str3, int i, String str4, String str5, int i2, long j) {
        if (this.enabled) {
            SyncScheduler syncScheduler2 = this.syncScheduler;
            LocalNotificationSync localNotificationSync = r2;
            LocalNotificationSync localNotificationSync2 = new LocalNotificationSync(this.provider, false, true, 0, j, str, str2, str3, i, str4, str5, i2);
            syncScheduler2.schedule(localNotificationSync);
        }
    }

    public void unschedule(String str) {
        this.syncScheduler.cancel(str);
    }
}
