package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.app.aptoideinstall.AptoideInstallRepository;
import p015cm.aptoide.p016pt.install.AptoideInstallPersistence;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAptoideInstallRepositoryFactory */
public final class ApplicationModule_ProvidesAptoideInstallRepositoryFactory implements C10824b<AptoideInstallRepository> {
    private final Provider<AptoideInstallPersistence> aptoideInstallPersistenceProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAptoideInstallRepositoryFactory(ApplicationModule applicationModule, Provider<AptoideInstallPersistence> provider) {
        this.module = applicationModule;
        this.aptoideInstallPersistenceProvider = provider;
    }

    public static ApplicationModule_ProvidesAptoideInstallRepositoryFactory create(ApplicationModule applicationModule, Provider<AptoideInstallPersistence> provider) {
        return new ApplicationModule_ProvidesAptoideInstallRepositoryFactory(applicationModule, provider);
    }

    public static AptoideInstallRepository providesAptoideInstallRepository(ApplicationModule applicationModule, AptoideInstallPersistence aptoideInstallPersistence) {
        AptoideInstallRepository providesAptoideInstallRepository = applicationModule.providesAptoideInstallRepository(aptoideInstallPersistence);
        C10825c.m36718a(providesAptoideInstallRepository, "Cannot return null from a non-@Nullable @Provides method");
        return providesAptoideInstallRepository;
    }

    public AptoideInstallRepository get() {
        return providesAptoideInstallRepository(this.module, this.aptoideInstallPersistenceProvider.get());
    }
}
