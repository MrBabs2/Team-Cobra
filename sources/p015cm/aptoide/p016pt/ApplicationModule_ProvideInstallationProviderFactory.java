package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.database.RoomStoredMinimalAdPersistence;
import p015cm.aptoide.p016pt.downloadmanager.AptoideDownloadManager;
import p015cm.aptoide.p016pt.downloadmanager.DownloadPersistence;
import p015cm.aptoide.p016pt.install.AptoideInstalledAppsRepository;
import p015cm.aptoide.p016pt.install.installer.InstallationProvider;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideInstallationProviderFactory */
public final class ApplicationModule_ProvideInstallationProviderFactory implements C10824b<InstallationProvider> {
    private final Provider<AptoideInstalledAppsRepository> aptoideInstalledAppsRepositoryProvider;
    private final Provider<AptoideDownloadManager> downloadManagerProvider;
    private final Provider<DownloadPersistence> downloadPersistenceProvider;
    private final ApplicationModule module;
    private final Provider<RoomStoredMinimalAdPersistence> roomStoredMinimalAdPersistenceProvider;

    public ApplicationModule_ProvideInstallationProviderFactory(ApplicationModule applicationModule, Provider<AptoideDownloadManager> provider, Provider<DownloadPersistence> provider2, Provider<AptoideInstalledAppsRepository> provider3, Provider<RoomStoredMinimalAdPersistence> provider4) {
        this.module = applicationModule;
        this.downloadManagerProvider = provider;
        this.downloadPersistenceProvider = provider2;
        this.aptoideInstalledAppsRepositoryProvider = provider3;
        this.roomStoredMinimalAdPersistenceProvider = provider4;
    }

    public static ApplicationModule_ProvideInstallationProviderFactory create(ApplicationModule applicationModule, Provider<AptoideDownloadManager> provider, Provider<DownloadPersistence> provider2, Provider<AptoideInstalledAppsRepository> provider3, Provider<RoomStoredMinimalAdPersistence> provider4) {
        return new ApplicationModule_ProvideInstallationProviderFactory(applicationModule, provider, provider2, provider3, provider4);
    }

    public static InstallationProvider provideInstallationProvider(ApplicationModule applicationModule, AptoideDownloadManager aptoideDownloadManager, DownloadPersistence downloadPersistence, AptoideInstalledAppsRepository aptoideInstalledAppsRepository, RoomStoredMinimalAdPersistence roomStoredMinimalAdPersistence) {
        InstallationProvider provideInstallationProvider = applicationModule.provideInstallationProvider(aptoideDownloadManager, downloadPersistence, aptoideInstalledAppsRepository, roomStoredMinimalAdPersistence);
        C10825c.m36718a(provideInstallationProvider, "Cannot return null from a non-@Nullable @Provides method");
        return provideInstallationProvider;
    }

    public InstallationProvider get() {
        return provideInstallationProvider(this.module, this.downloadManagerProvider.get(), this.downloadPersistenceProvider.get(), this.aptoideInstalledAppsRepositoryProvider.get(), this.roomStoredMinimalAdPersistenceProvider.get());
    }
}
