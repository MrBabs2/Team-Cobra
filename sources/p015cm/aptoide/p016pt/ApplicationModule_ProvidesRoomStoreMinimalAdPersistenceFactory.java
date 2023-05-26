package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.database.RoomStoredMinimalAdPersistence;
import p015cm.aptoide.p016pt.database.room.AptoideDatabase;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesRoomStoreMinimalAdPersistenceFactory */
public final class ApplicationModule_ProvidesRoomStoreMinimalAdPersistenceFactory implements C10824b<RoomStoredMinimalAdPersistence> {
    private final Provider<AptoideDatabase> databaseProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesRoomStoreMinimalAdPersistenceFactory(ApplicationModule applicationModule, Provider<AptoideDatabase> provider) {
        this.module = applicationModule;
        this.databaseProvider = provider;
    }

    public static ApplicationModule_ProvidesRoomStoreMinimalAdPersistenceFactory create(ApplicationModule applicationModule, Provider<AptoideDatabase> provider) {
        return new ApplicationModule_ProvidesRoomStoreMinimalAdPersistenceFactory(applicationModule, provider);
    }

    public static RoomStoredMinimalAdPersistence providesRoomStoreMinimalAdPersistence(ApplicationModule applicationModule, AptoideDatabase aptoideDatabase) {
        RoomStoredMinimalAdPersistence providesRoomStoreMinimalAdPersistence = applicationModule.providesRoomStoreMinimalAdPersistence(aptoideDatabase);
        C10825c.m36718a(providesRoomStoreMinimalAdPersistence, "Cannot return null from a non-@Nullable @Provides method");
        return providesRoomStoreMinimalAdPersistence;
    }

    public RoomStoredMinimalAdPersistence get() {
        return providesRoomStoreMinimalAdPersistence(this.module, this.databaseProvider.get());
    }
}
