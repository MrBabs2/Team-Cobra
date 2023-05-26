package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.home.bundles.BundleDataSource;
import p015cm.aptoide.p016pt.home.bundles.BundlesRepository;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesBundleRepositoryFactory */
public final class ApplicationModule_ProvidesBundleRepositoryFactory implements C10824b<BundlesRepository> {
    private final ApplicationModule module;
    private final Provider<BundleDataSource> remoteBundleDataSourceProvider;

    public ApplicationModule_ProvidesBundleRepositoryFactory(ApplicationModule applicationModule, Provider<BundleDataSource> provider) {
        this.module = applicationModule;
        this.remoteBundleDataSourceProvider = provider;
    }

    public static ApplicationModule_ProvidesBundleRepositoryFactory create(ApplicationModule applicationModule, Provider<BundleDataSource> provider) {
        return new ApplicationModule_ProvidesBundleRepositoryFactory(applicationModule, provider);
    }

    public static BundlesRepository providesBundleRepository(ApplicationModule applicationModule, BundleDataSource bundleDataSource) {
        BundlesRepository providesBundleRepository = applicationModule.providesBundleRepository(bundleDataSource);
        C10825c.m36718a(providesBundleRepository, "Cannot return null from a non-@Nullable @Provides method");
        return providesBundleRepository;
    }

    public BundlesRepository get() {
        return providesBundleRepository(this.module, this.remoteBundleDataSourceProvider.get());
    }
}
