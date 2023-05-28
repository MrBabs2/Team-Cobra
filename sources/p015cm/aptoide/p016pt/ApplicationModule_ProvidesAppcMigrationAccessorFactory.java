package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.app.migration.AppcMigrationPersistence;
import p015cm.aptoide.p016pt.database.room.AptoideDatabase;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAppcMigrationAccessorFactory */
public final class ApplicationModule_ProvidesAppcMigrationAccessorFactory implements C10824b<AppcMigrationPersistence> {
    private final Provider<AptoideDatabase> databaseProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAppcMigrationAccessorFactory(ApplicationModule applicationModule, Provider<AptoideDatabase> provider) {
        this.module = applicationModule;
        this.databaseProvider = provider;
    }

    public static ApplicationModule_ProvidesAppcMigrationAccessorFactory create(ApplicationModule applicationModule, Provider<AptoideDatabase> provider) {
        return new ApplicationModule_ProvidesAppcMigrationAccessorFactory(applicationModule, provider);
    }

    public static AppcMigrationPersistence providesAppcMigrationAccessor(ApplicationModule applicationModule, AptoideDatabase aptoideDatabase) {
        AppcMigrationPersistence providesAppcMigrationAccessor = applicationModule.providesAppcMigrationAccessor(aptoideDatabase);
        C10825c.m36718a(providesAppcMigrationAccessor, "Cannot return null from a non-@Nullable @Provides method");
        return providesAppcMigrationAccessor;
    }

    public AppcMigrationPersistence get() {
        return providesAppcMigrationAccessor(this.module, this.databaseProvider.get());
    }
}
