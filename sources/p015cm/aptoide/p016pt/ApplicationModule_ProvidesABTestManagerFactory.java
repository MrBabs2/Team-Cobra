package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.abtesting.ABTestCenterRepository;
import p015cm.aptoide.p016pt.abtesting.ABTestManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesABTestManagerFactory */
public final class ApplicationModule_ProvidesABTestManagerFactory implements C10824b<ABTestManager> {
    private final Provider<ABTestCenterRepository> abTestCenterRepositoryProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesABTestManagerFactory(ApplicationModule applicationModule, Provider<ABTestCenterRepository> provider) {
        this.module = applicationModule;
        this.abTestCenterRepositoryProvider = provider;
    }

    public static ApplicationModule_ProvidesABTestManagerFactory create(ApplicationModule applicationModule, Provider<ABTestCenterRepository> provider) {
        return new ApplicationModule_ProvidesABTestManagerFactory(applicationModule, provider);
    }

    public static ABTestManager providesABTestManager(ApplicationModule applicationModule, ABTestCenterRepository aBTestCenterRepository) {
        ABTestManager providesABTestManager = applicationModule.providesABTestManager(aBTestCenterRepository);
        C10825c.m36718a(providesABTestManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesABTestManager;
    }

    public ABTestManager get() {
        return providesABTestManager(this.module, this.abTestCenterRepositoryProvider.get());
    }
}
