package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.notification.NotificationProvider;
import p015cm.aptoide.p016pt.notification.sync.LocalNotificationSyncManager;
import p015cm.aptoide.p016pt.sync.SyncScheduler;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesLocalNotificationSyncManagerFactory */
public final class ApplicationModule_ProvidesLocalNotificationSyncManagerFactory implements C10824b<LocalNotificationSyncManager> {
    private final ApplicationModule module;
    private final Provider<NotificationProvider> providerProvider;
    private final Provider<SyncScheduler> syncSchedulerProvider;

    public ApplicationModule_ProvidesLocalNotificationSyncManagerFactory(ApplicationModule applicationModule, Provider<SyncScheduler> provider, Provider<NotificationProvider> provider2) {
        this.module = applicationModule;
        this.syncSchedulerProvider = provider;
        this.providerProvider = provider2;
    }

    public static ApplicationModule_ProvidesLocalNotificationSyncManagerFactory create(ApplicationModule applicationModule, Provider<SyncScheduler> provider, Provider<NotificationProvider> provider2) {
        return new ApplicationModule_ProvidesLocalNotificationSyncManagerFactory(applicationModule, provider, provider2);
    }

    public static LocalNotificationSyncManager providesLocalNotificationSyncManager(ApplicationModule applicationModule, SyncScheduler syncScheduler, NotificationProvider notificationProvider) {
        LocalNotificationSyncManager providesLocalNotificationSyncManager = applicationModule.providesLocalNotificationSyncManager(syncScheduler, notificationProvider);
        C10825c.m36718a(providesLocalNotificationSyncManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesLocalNotificationSyncManager;
    }

    public LocalNotificationSyncManager get() {
        return providesLocalNotificationSyncManager(this.module, this.syncSchedulerProvider.get(), this.providerProvider.get());
    }
}
