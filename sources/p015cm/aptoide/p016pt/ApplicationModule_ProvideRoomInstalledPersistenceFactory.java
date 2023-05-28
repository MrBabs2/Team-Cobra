package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.database.RoomInstallationMapper;
import p015cm.aptoide.p016pt.database.RoomInstallationPersistence;
import p015cm.aptoide.p016pt.database.RoomInstalledPersistence;
import p015cm.aptoide.p016pt.database.room.AptoideDatabase;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideRoomInstalledPersistenceFactory */
public final class ApplicationModule_ProvideRoomInstalledPersistenceFactory implements C10824b<RoomInstalledPersistence> {
    private final Provider<AptoideDatabase> databaseProvider;
    private final ApplicationModule module;
    private final Provider<RoomInstallationMapper> roomInstallationMapperProvider;
    private final Provider<RoomInstallationPersistence> roomInstallationPersistenceProvider;

    public ApplicationModule_ProvideRoomInstalledPersistenceFactory(ApplicationModule applicationModule, Provider<AptoideDatabase> provider, Provider<RoomInstallationPersistence> provider2, Provider<RoomInstallationMapper> provider3) {
        this.module = applicationModule;
        this.databaseProvider = provider;
        this.roomInstallationPersistenceProvider = provider2;
        this.roomInstallationMapperProvider = provider3;
    }

    public static ApplicationModule_ProvideRoomInstalledPersistenceFactory create(ApplicationModule applicationModule, Provider<AptoideDatabase> provider, Provider<RoomInstallationPersistence> provider2, Provider<RoomInstallationMapper> provider3) {
        return new ApplicationModule_ProvideRoomInstalledPersistenceFactory(applicationModule, provider, provider2, provider3);
    }

    public static RoomInstalledPersistence provideRoomInstalledPersistence(ApplicationModule applicationModule, AptoideDatabase aptoideDatabase, RoomInstallationPersistence roomInstallationPersistence, RoomInstallationMapper roomInstallationMapper) {
        RoomInstalledPersistence provideRoomInstalledPersistence = applicationModule.provideRoomInstalledPersistence(aptoideDatabase, roomInstallationPersistence, roomInstallationMapper);
        C10825c.m36718a(provideRoomInstalledPersistence, "Cannot return null from a non-@Nullable @Provides method");
        return provideRoomInstalledPersistence;
    }

    public RoomInstalledPersistence get() {
        return provideRoomInstalledPersistence(this.module, this.databaseProvider.get(), this.roomInstallationPersistenceProvider.get(), this.roomInstallationMapperProvider.get());
    }
}
