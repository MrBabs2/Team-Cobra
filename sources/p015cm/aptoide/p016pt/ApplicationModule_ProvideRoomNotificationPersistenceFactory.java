package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.database.RoomNotificationPersistence;
import p015cm.aptoide.p016pt.database.room.AptoideDatabase;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideRoomNotificationPersistenceFactory */
public final class ApplicationModule_ProvideRoomNotificationPersistenceFactory implements C10824b<RoomNotificationPersistence> {
    private final Provider<AptoideDatabase> databaseProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvideRoomNotificationPersistenceFactory(ApplicationModule applicationModule, Provider<AptoideDatabase> provider) {
        this.module = applicationModule;
        this.databaseProvider = provider;
    }

    public static ApplicationModule_ProvideRoomNotificationPersistenceFactory create(ApplicationModule applicationModule, Provider<AptoideDatabase> provider) {
        return new ApplicationModule_ProvideRoomNotificationPersistenceFactory(applicationModule, provider);
    }

    public static RoomNotificationPersistence provideRoomNotificationPersistence(ApplicationModule applicationModule, AptoideDatabase aptoideDatabase) {
        RoomNotificationPersistence provideRoomNotificationPersistence = applicationModule.provideRoomNotificationPersistence(aptoideDatabase);
        C10825c.m36718a(provideRoomNotificationPersistence, "Cannot return null from a non-@Nullable @Provides method");
        return provideRoomNotificationPersistence;
    }

    public RoomNotificationPersistence get() {
        return provideRoomNotificationPersistence(this.module, this.databaseProvider.get());
    }
}
