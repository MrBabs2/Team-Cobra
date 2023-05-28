package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.database.RoomEventMapper;
import p015cm.aptoide.p016pt.database.RoomEventPersistence;
import p015cm.aptoide.p016pt.database.room.AptoideDatabase;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesRoomEventPersistenceFactory */
public final class ApplicationModule_ProvidesRoomEventPersistenceFactory implements C10824b<RoomEventPersistence> {
    private final Provider<AptoideDatabase> aptoideDatabaseProvider;
    private final ApplicationModule module;
    private final Provider<RoomEventMapper> roomEventMapperProvider;

    public ApplicationModule_ProvidesRoomEventPersistenceFactory(ApplicationModule applicationModule, Provider<AptoideDatabase> provider, Provider<RoomEventMapper> provider2) {
        this.module = applicationModule;
        this.aptoideDatabaseProvider = provider;
        this.roomEventMapperProvider = provider2;
    }

    public static ApplicationModule_ProvidesRoomEventPersistenceFactory create(ApplicationModule applicationModule, Provider<AptoideDatabase> provider, Provider<RoomEventMapper> provider2) {
        return new ApplicationModule_ProvidesRoomEventPersistenceFactory(applicationModule, provider, provider2);
    }

    public static RoomEventPersistence providesRoomEventPersistence(ApplicationModule applicationModule, AptoideDatabase aptoideDatabase, RoomEventMapper roomEventMapper) {
        RoomEventPersistence providesRoomEventPersistence = applicationModule.providesRoomEventPersistence(aptoideDatabase, roomEventMapper);
        C10825c.m36718a(providesRoomEventPersistence, "Cannot return null from a non-@Nullable @Provides method");
        return providesRoomEventPersistence;
    }

    public RoomEventPersistence get() {
        return providesRoomEventPersistence(this.module, this.aptoideDatabaseProvider.get(), this.roomEventMapperProvider.get());
    }
}
