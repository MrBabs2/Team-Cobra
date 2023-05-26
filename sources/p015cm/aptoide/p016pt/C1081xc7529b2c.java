package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.database.room.AptoideDatabase;
import p015cm.aptoide.p016pt.notification.NotificationProvider;
import p015cm.aptoide.p016pt.notification.RoomLocalNotificationSyncPersistence;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesRoomLocalNotificationSyncPersistenceFactory */
public final class C1081xc7529b2c implements C10824b<RoomLocalNotificationSyncPersistence> {
    private final Provider<AptoideDatabase> databaseProvider;
    private final ApplicationModule module;
    private final Provider<NotificationProvider> providerProvider;

    public C1081xc7529b2c(ApplicationModule applicationModule, Provider<AptoideDatabase> provider, Provider<NotificationProvider> provider2) {
        this.module = applicationModule;
        this.databaseProvider = provider;
        this.providerProvider = provider2;
    }

    public static C1081xc7529b2c create(ApplicationModule applicationModule, Provider<AptoideDatabase> provider, Provider<NotificationProvider> provider2) {
        return new C1081xc7529b2c(applicationModule, provider, provider2);
    }

    public static RoomLocalNotificationSyncPersistence providesRoomLocalNotificationSyncPersistence(ApplicationModule applicationModule, AptoideDatabase aptoideDatabase, NotificationProvider notificationProvider) {
        RoomLocalNotificationSyncPersistence providesRoomLocalNotificationSyncPersistence = applicationModule.providesRoomLocalNotificationSyncPersistence(aptoideDatabase, notificationProvider);
        C10825c.m36718a(providesRoomLocalNotificationSyncPersistence, "Cannot return null from a non-@Nullable @Provides method");
        return providesRoomLocalNotificationSyncPersistence;
    }

    public RoomLocalNotificationSyncPersistence get() {
        return providesRoomLocalNotificationSyncPersistence(this.module, this.databaseProvider.get(), this.providerProvider.get());
    }
}
