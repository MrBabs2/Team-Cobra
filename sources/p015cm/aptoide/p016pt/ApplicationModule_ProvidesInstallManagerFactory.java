package p015cm.aptoide.p016pt;

import android.content.SharedPreferences;
import javax.inject.Provider;
import p015cm.aptoide.p016pt.app.aptoideinstall.AptoideInstallManager;
import p015cm.aptoide.p016pt.downloadmanager.AptoideDownloadManager;
import p015cm.aptoide.p016pt.downloadmanager.DownloadsRepository;
import p015cm.aptoide.p016pt.file.FileManager;
import p015cm.aptoide.p016pt.install.AptoideInstalledAppsRepository;
import p015cm.aptoide.p016pt.install.ForegroundManager;
import p015cm.aptoide.p016pt.install.InstallAppSizeValidator;
import p015cm.aptoide.p016pt.install.InstallManager;
import p015cm.aptoide.p016pt.install.Installer;
import p015cm.aptoide.p016pt.install.PackageInstallerManager;
import p015cm.aptoide.p016pt.root.RootAvailabilityManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesInstallManagerFactory */
public final class ApplicationModule_ProvidesInstallManagerFactory implements C10824b<InstallManager> {
    private final Provider<AptoideDownloadManager> aptoideDownloadManagerProvider;
    private final Provider<AptoideInstallManager> aptoideInstallManagerProvider;
    private final Provider<AptoideInstalledAppsRepository> aptoideInstalledAppsRepositoryProvider;
    private final Provider<Installer> defaultInstallerProvider;
    private final Provider<SharedPreferences> defaultSharedPreferencesProvider;
    private final Provider<DownloadsRepository> downloadsRepositoryProvider;
    private final Provider<FileManager> fileManagerProvider;
    private final Provider<ForegroundManager> foregroundManagerProvider;
    private final Provider<InstallAppSizeValidator> installAppSizeValidatorProvider;
    private final ApplicationModule module;
    private final Provider<PackageInstallerManager> packageInstallerManagerProvider;
    private final Provider<RootAvailabilityManager> rootAvailabilityManagerProvider;
    private final Provider<SharedPreferences> secureSharedPreferencesProvider;

    public ApplicationModule_ProvidesInstallManagerFactory(ApplicationModule applicationModule, Provider<AptoideDownloadManager> provider, Provider<Installer> provider2, Provider<RootAvailabilityManager> provider3, Provider<SharedPreferences> provider4, Provider<SharedPreferences> provider5, Provider<DownloadsRepository> provider6, Provider<AptoideInstalledAppsRepository> provider7, Provider<PackageInstallerManager> provider8, Provider<ForegroundManager> provider9, Provider<AptoideInstallManager> provider10, Provider<InstallAppSizeValidator> provider11, Provider<FileManager> provider12) {
        this.module = applicationModule;
        this.aptoideDownloadManagerProvider = provider;
        this.defaultInstallerProvider = provider2;
        this.rootAvailabilityManagerProvider = provider3;
        this.defaultSharedPreferencesProvider = provider4;
        this.secureSharedPreferencesProvider = provider5;
        this.downloadsRepositoryProvider = provider6;
        this.aptoideInstalledAppsRepositoryProvider = provider7;
        this.packageInstallerManagerProvider = provider8;
        this.foregroundManagerProvider = provider9;
        this.aptoideInstallManagerProvider = provider10;
        this.installAppSizeValidatorProvider = provider11;
        this.fileManagerProvider = provider12;
    }

    public static ApplicationModule_ProvidesInstallManagerFactory create(ApplicationModule applicationModule, Provider<AptoideDownloadManager> provider, Provider<Installer> provider2, Provider<RootAvailabilityManager> provider3, Provider<SharedPreferences> provider4, Provider<SharedPreferences> provider5, Provider<DownloadsRepository> provider6, Provider<AptoideInstalledAppsRepository> provider7, Provider<PackageInstallerManager> provider8, Provider<ForegroundManager> provider9, Provider<AptoideInstallManager> provider10, Provider<InstallAppSizeValidator> provider11, Provider<FileManager> provider12) {
        return new ApplicationModule_ProvidesInstallManagerFactory(applicationModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    public static InstallManager providesInstallManager(ApplicationModule applicationModule, AptoideDownloadManager aptoideDownloadManager, Installer installer, RootAvailabilityManager rootAvailabilityManager, SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, DownloadsRepository downloadsRepository, AptoideInstalledAppsRepository aptoideInstalledAppsRepository, PackageInstallerManager packageInstallerManager, ForegroundManager foregroundManager, AptoideInstallManager aptoideInstallManager, InstallAppSizeValidator installAppSizeValidator, FileManager fileManager) {
        InstallManager providesInstallManager = applicationModule.providesInstallManager(aptoideDownloadManager, installer, rootAvailabilityManager, sharedPreferences, sharedPreferences2, downloadsRepository, aptoideInstalledAppsRepository, packageInstallerManager, foregroundManager, aptoideInstallManager, installAppSizeValidator, fileManager);
        C10825c.m36718a(providesInstallManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesInstallManager;
    }

    public InstallManager get() {
        return providesInstallManager(this.module, this.aptoideDownloadManagerProvider.get(), this.defaultInstallerProvider.get(), this.rootAvailabilityManagerProvider.get(), this.defaultSharedPreferencesProvider.get(), this.secureSharedPreferencesProvider.get(), this.downloadsRepositoryProvider.get(), this.aptoideInstalledAppsRepositoryProvider.get(), this.packageInstallerManagerProvider.get(), this.foregroundManagerProvider.get(), this.aptoideInstallManagerProvider.get(), this.installAppSizeValidatorProvider.get(), this.fileManagerProvider.get());
    }
}
