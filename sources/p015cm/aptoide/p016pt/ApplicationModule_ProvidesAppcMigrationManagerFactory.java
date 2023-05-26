package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.app.migration.AppcMigrationManager;
import p015cm.aptoide.p016pt.app.migration.AppcMigrationRepository;
import p015cm.aptoide.p016pt.install.AptoideInstalledAppsRepository;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAppcMigrationManagerFactory */
public final class ApplicationModule_ProvidesAppcMigrationManagerFactory implements C10824b<AppcMigrationManager> {
    private final Provider<AppcMigrationRepository> appcMigrationRepositoryProvider;
    private final ApplicationModule module;
    private final Provider<AptoideInstalledAppsRepository> repositoryProvider;

    public ApplicationModule_ProvidesAppcMigrationManagerFactory(ApplicationModule applicationModule, Provider<AptoideInstalledAppsRepository> provider, Provider<AppcMigrationRepository> provider2) {
        this.module = applicationModule;
        this.repositoryProvider = provider;
        this.appcMigrationRepositoryProvider = provider2;
    }

    public static ApplicationModule_ProvidesAppcMigrationManagerFactory create(ApplicationModule applicationModule, Provider<AptoideInstalledAppsRepository> provider, Provider<AppcMigrationRepository> provider2) {
        return new ApplicationModule_ProvidesAppcMigrationManagerFactory(applicationModule, provider, provider2);
    }

    public static AppcMigrationManager providesAppcMigrationManager(ApplicationModule applicationModule, AptoideInstalledAppsRepository aptoideInstalledAppsRepository, AppcMigrationRepository appcMigrationRepository) {
        AppcMigrationManager providesAppcMigrationManager = applicationModule.providesAppcMigrationManager(aptoideInstalledAppsRepository, appcMigrationRepository);
        C10825c.m36718a(providesAppcMigrationManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesAppcMigrationManager;
    }

    public AppcMigrationManager get() {
        return providesAppcMigrationManager(this.module, this.repositoryProvider.get(), this.appcMigrationRepositoryProvider.get());
    }
}
