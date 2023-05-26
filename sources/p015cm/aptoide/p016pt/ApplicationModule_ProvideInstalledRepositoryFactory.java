package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.database.RoomInstalledPersistence;
import p015cm.aptoide.p016pt.install.AptoideInstalledAppsRepository;
import p015cm.aptoide.p016pt.utils.FileUtils;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideInstalledRepositoryFactory */
public final class ApplicationModule_ProvideInstalledRepositoryFactory implements C10824b<AptoideInstalledAppsRepository> {
    private final Provider<FileUtils> fileUtilsProvider;
    private final ApplicationModule module;
    private final Provider<RoomInstalledPersistence> roomInstalledPersistenceProvider;

    public ApplicationModule_ProvideInstalledRepositoryFactory(ApplicationModule applicationModule, Provider<RoomInstalledPersistence> provider, Provider<FileUtils> provider2) {
        this.module = applicationModule;
        this.roomInstalledPersistenceProvider = provider;
        this.fileUtilsProvider = provider2;
    }

    public static ApplicationModule_ProvideInstalledRepositoryFactory create(ApplicationModule applicationModule, Provider<RoomInstalledPersistence> provider, Provider<FileUtils> provider2) {
        return new ApplicationModule_ProvideInstalledRepositoryFactory(applicationModule, provider, provider2);
    }

    public static AptoideInstalledAppsRepository provideInstalledRepository(ApplicationModule applicationModule, RoomInstalledPersistence roomInstalledPersistence, FileUtils fileUtils) {
        AptoideInstalledAppsRepository provideInstalledRepository = applicationModule.provideInstalledRepository(roomInstalledPersistence, fileUtils);
        C10825c.m36718a(provideInstalledRepository, "Cannot return null from a non-@Nullable @Provides method");
        return provideInstalledRepository;
    }

    public AptoideInstalledAppsRepository get() {
        return provideInstalledRepository(this.module, this.roomInstalledPersistenceProvider.get(), this.fileUtilsProvider.get());
    }
}
