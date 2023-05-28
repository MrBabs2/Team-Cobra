package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.database.RoomExperimentMapper;
import p015cm.aptoide.p016pt.database.RoomExperimentPersistence;
import p015cm.aptoide.p016pt.database.room.AptoideDatabase;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesRoomExperimentPersistenceFactory */
public final class ApplicationModule_ProvidesRoomExperimentPersistenceFactory implements C10824b<RoomExperimentPersistence> {
    private final Provider<AptoideDatabase> databaseProvider;
    private final Provider<RoomExperimentMapper> mapperProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesRoomExperimentPersistenceFactory(ApplicationModule applicationModule, Provider<AptoideDatabase> provider, Provider<RoomExperimentMapper> provider2) {
        this.module = applicationModule;
        this.databaseProvider = provider;
        this.mapperProvider = provider2;
    }

    public static ApplicationModule_ProvidesRoomExperimentPersistenceFactory create(ApplicationModule applicationModule, Provider<AptoideDatabase> provider, Provider<RoomExperimentMapper> provider2) {
        return new ApplicationModule_ProvidesRoomExperimentPersistenceFactory(applicationModule, provider, provider2);
    }

    public static RoomExperimentPersistence providesRoomExperimentPersistence(ApplicationModule applicationModule, AptoideDatabase aptoideDatabase, RoomExperimentMapper roomExperimentMapper) {
        RoomExperimentPersistence providesRoomExperimentPersistence = applicationModule.providesRoomExperimentPersistence(aptoideDatabase, roomExperimentMapper);
        C10825c.m36718a(providesRoomExperimentPersistence, "Cannot return null from a non-@Nullable @Provides method");
        return providesRoomExperimentPersistence;
    }

    public RoomExperimentPersistence get() {
        return providesRoomExperimentPersistence(this.module, this.databaseProvider.get(), this.mapperProvider.get());
    }
}
