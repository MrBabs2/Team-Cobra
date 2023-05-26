package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.notification.RoomLocalNotificationSyncPersistence;
import p015cm.aptoide.p016pt.sync.alarm.SyncStorage;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideSyncStorageFactory */
public final class ApplicationModule_ProvideSyncStorageFactory implements C10824b<SyncStorage> {
    private final ApplicationModule module;
    private final Provider<RoomLocalNotificationSyncPersistence> persistenceProvider;

    public ApplicationModule_ProvideSyncStorageFactory(ApplicationModule applicationModule, Provider<RoomLocalNotificationSyncPersistence> provider) {
        this.module = applicationModule;
        this.persistenceProvider = provider;
    }

    public static ApplicationModule_ProvideSyncStorageFactory create(ApplicationModule applicationModule, Provider<RoomLocalNotificationSyncPersistence> provider) {
        return new ApplicationModule_ProvideSyncStorageFactory(applicationModule, provider);
    }

    public static SyncStorage provideSyncStorage(ApplicationModule applicationModule, RoomLocalNotificationSyncPersistence roomLocalNotificationSyncPersistence) {
        SyncStorage provideSyncStorage = applicationModule.provideSyncStorage(roomLocalNotificationSyncPersistence);
        C10825c.m36718a(provideSyncStorage, "Cannot return null from a non-@Nullable @Provides method");
        return provideSyncStorage;
    }

    public SyncStorage get() {
        return provideSyncStorage(this.module, this.persistenceProvider.get());
    }
}
