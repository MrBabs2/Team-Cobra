package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.database.room.AptoideDatabase;
import p015cm.aptoide.p016pt.install.AptoideInstallPersistence;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAptoideInstallPersistenceFactory */
public final class ApplicationModule_ProvidesAptoideInstallPersistenceFactory implements C10824b<AptoideInstallPersistence> {
    private final Provider<AptoideDatabase> databaseProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAptoideInstallPersistenceFactory(ApplicationModule applicationModule, Provider<AptoideDatabase> provider) {
        this.module = applicationModule;
        this.databaseProvider = provider;
    }

    public static ApplicationModule_ProvidesAptoideInstallPersistenceFactory create(ApplicationModule applicationModule, Provider<AptoideDatabase> provider) {
        return new ApplicationModule_ProvidesAptoideInstallPersistenceFactory(applicationModule, provider);
    }

    public static AptoideInstallPersistence providesAptoideInstallPersistence(ApplicationModule applicationModule, AptoideDatabase aptoideDatabase) {
        AptoideInstallPersistence providesAptoideInstallPersistence = applicationModule.providesAptoideInstallPersistence(aptoideDatabase);
        C10825c.m36718a(providesAptoideInstallPersistence, "Cannot return null from a non-@Nullable @Provides method");
        return providesAptoideInstallPersistence;
    }

    public AptoideInstallPersistence get() {
        return providesAptoideInstallPersistence(this.module, this.databaseProvider.get());
    }
}
