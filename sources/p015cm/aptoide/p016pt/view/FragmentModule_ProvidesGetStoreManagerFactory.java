package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.app.view.MoreBundleManager;
import p015cm.aptoide.p016pt.home.bundles.BundlesRepository;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesGetStoreManagerFactory */
public final class FragmentModule_ProvidesGetStoreManagerFactory implements C10824b<MoreBundleManager> {
    private final Provider<BundlesRepository> bundlesRepositoryProvider;
    private final FragmentModule module;

    public FragmentModule_ProvidesGetStoreManagerFactory(FragmentModule fragmentModule, Provider<BundlesRepository> provider) {
        this.module = fragmentModule;
        this.bundlesRepositoryProvider = provider;
    }

    public static FragmentModule_ProvidesGetStoreManagerFactory create(FragmentModule fragmentModule, Provider<BundlesRepository> provider) {
        return new FragmentModule_ProvidesGetStoreManagerFactory(fragmentModule, provider);
    }

    public static MoreBundleManager providesGetStoreManager(FragmentModule fragmentModule, BundlesRepository bundlesRepository) {
        MoreBundleManager providesGetStoreManager = fragmentModule.providesGetStoreManager(bundlesRepository);
        C10825c.m36718a(providesGetStoreManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesGetStoreManager;
    }

    public MoreBundleManager get() {
        return providesGetStoreManager(this.module, this.bundlesRepositoryProvider.get());
    }
}
