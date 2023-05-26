package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.app.aptoideinstall.AptoideInstallManager;
import p015cm.aptoide.p016pt.app.aptoideinstall.AptoideInstallRepository;
import p015cm.aptoide.p016pt.install.AptoideInstalledAppsRepository;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAptoideInstallManagerFactory */
public final class ApplicationModule_ProvidesAptoideInstallManagerFactory implements C10824b<AptoideInstallManager> {
    private final Provider<AptoideInstallRepository> aptoideInstallRepositoryProvider;
    private final Provider<AptoideInstalledAppsRepository> aptoideInstalledAppsRepositoryProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAptoideInstallManagerFactory(ApplicationModule applicationModule, Provider<AptoideInstalledAppsRepository> provider, Provider<AptoideInstallRepository> provider2) {
        this.module = applicationModule;
        this.aptoideInstalledAppsRepositoryProvider = provider;
        this.aptoideInstallRepositoryProvider = provider2;
    }

    public static ApplicationModule_ProvidesAptoideInstallManagerFactory create(ApplicationModule applicationModule, Provider<AptoideInstalledAppsRepository> provider, Provider<AptoideInstallRepository> provider2) {
        return new ApplicationModule_ProvidesAptoideInstallManagerFactory(applicationModule, provider, provider2);
    }

    public static AptoideInstallManager providesAptoideInstallManager(ApplicationModule applicationModule, AptoideInstalledAppsRepository aptoideInstalledAppsRepository, AptoideInstallRepository aptoideInstallRepository) {
        AptoideInstallManager providesAptoideInstallManager = applicationModule.providesAptoideInstallManager(aptoideInstalledAppsRepository, aptoideInstallRepository);
        C10825c.m36718a(providesAptoideInstallManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesAptoideInstallManager;
    }

    public AptoideInstallManager get() {
        return providesAptoideInstallManager(this.module, this.aptoideInstalledAppsRepositoryProvider.get(), this.aptoideInstallRepositoryProvider.get());
    }
}
