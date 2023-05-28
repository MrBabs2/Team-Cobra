package p015cm.aptoide.p016pt.notification.sync;

import p015cm.aptoide.p016pt.notification.NotificationSyncScheduler;
import p015cm.aptoide.p016pt.sync.SyncScheduler;

/* renamed from: cm.aptoide.pt.notification.sync.NotificationSyncManager */
public class NotificationSyncManager implements NotificationSyncScheduler {
    private boolean enabled;
    private final NotificationSyncFactory notificationSyncFactory;
    private final SyncScheduler syncScheduler;

    public NotificationSyncManager(SyncScheduler syncScheduler2, boolean z, NotificationSyncFactory notificationSyncFactory2) {
        this.syncScheduler = syncScheduler2;
        this.enabled = z;
        this.notificationSyncFactory = notificationSyncFactory2;
    }

    public void forceSync() {
        if (this.enabled) {
            this.syncScheduler.schedule(this.notificationSyncFactory.create(NotificationSyncFactory.CAMPAIGN_NOTIFICATION_SYNC_IMMEDIATE));
        }
    }

    public void removeSchedules() {
        this.syncScheduler.cancel(NotificationSyncFactory.CAMPAIGN_NOTIFICATION_SYNC_PERIODIC);
    }

    public void schedule() {
        if (this.enabled) {
            this.syncScheduler.schedule(this.notificationSyncFactory.create(NotificationSyncFactory.CAMPAIGN_NOTIFICATION_SYNC_PERIODIC));
        }
    }

    public void setEnabled(boolean z) {
        this.enabled = z;
    }
}
