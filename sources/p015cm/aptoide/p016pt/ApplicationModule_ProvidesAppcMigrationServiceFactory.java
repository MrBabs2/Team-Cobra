package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.app.migration.AppcMigrationPersistence;
import p015cm.aptoide.p016pt.app.migration.AppcMigrationRepository;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAppcMigrationServiceFactory */
public final class ApplicationModule_ProvidesAppcMigrationServiceFactory implements C10824b<AppcMigrationRepository> {
    private final Provider<AppcMigrationPersistence> appcMigrationPersistenceProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAppcMigrationServiceFactory(ApplicationModule applicationModule, Provider<AppcMigrationPersistence> provider) {
        this.module = applicationModule;
        this.appcMigrationPersistenceProvider = provider;
    }

    public static ApplicationModule_ProvidesAppcMigrationServiceFactory create(ApplicationModule applicationModule, Provider<AppcMigrationPersistence> provider) {
        return new ApplicationModule_ProvidesAppcMigrationServiceFactory(applicationModule, provider);
    }

    public static AppcMigrationRepository providesAppcMigrationService(ApplicationModule applicationModule, AppcMigrationPersistence appcMigrationPersistence) {
        AppcMigrationRepository providesAppcMigrationService = applicationModule.providesAppcMigrationService(appcMigrationPersistence);
        C10825c.m36718a(providesAppcMigrationService, "Cannot return null from a non-@Nullable @Provides method");
        return providesAppcMigrationService;
    }

    public AppcMigrationRepository get() {
        return providesAppcMigrationService(this.module, this.appcMigrationPersistenceProvider.get());
    }
}
