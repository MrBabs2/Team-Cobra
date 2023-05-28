package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.app.migration.AppcMigrationManager;
import p015cm.aptoide.p016pt.download.view.DownloadStatusManager;
import p015cm.aptoide.p016pt.install.InstallManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesDownloadStatusManagerFactory */
public final class ApplicationModule_ProvidesDownloadStatusManagerFactory implements C10824b<DownloadStatusManager> {
    private final Provider<AppcMigrationManager> appcMigrationManagerProvider;
    private final Provider<InstallManager> installManagerProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesDownloadStatusManagerFactory(ApplicationModule applicationModule, Provider<InstallManager> provider, Provider<AppcMigrationManager> provider2) {
        this.module = applicationModule;
        this.installManagerProvider = provider;
        this.appcMigrationManagerProvider = provider2;
    }

    public static ApplicationModule_ProvidesDownloadStatusManagerFactory create(ApplicationModule applicationModule, Provider<InstallManager> provider, Provider<AppcMigrationManager> provider2) {
        return new ApplicationModule_ProvidesDownloadStatusManagerFactory(applicationModule, provider, provider2);
    }

    public static DownloadStatusManager providesDownloadStatusManager(ApplicationModule applicationModule, InstallManager installManager, AppcMigrationManager appcMigrationManager) {
        DownloadStatusManager providesDownloadStatusManager = applicationModule.providesDownloadStatusManager(installManager, appcMigrationManager);
        C10825c.m36718a(providesDownloadStatusManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesDownloadStatusManager;
    }

    public DownloadStatusManager get() {
        return providesDownloadStatusManager(this.module, this.installManagerProvider.get(), this.appcMigrationManagerProvider.get());
    }
}
