package p015cm.aptoide.p016pt.notification;

/* renamed from: cm.aptoide.pt.notification.NotificationSyncScheduler */
public interface NotificationSyncScheduler {
    void forceSync();

    void removeSchedules();

    void schedule();

    void setEnabled(boolean z);
}
