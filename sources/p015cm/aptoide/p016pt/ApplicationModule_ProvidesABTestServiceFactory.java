package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.abtesting.ABTestService;
import p015cm.aptoide.p016pt.abtesting.ABTestServiceProvider;
import p015cm.aptoide.p016pt.networking.IdsRepository;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesABTestServiceFactory */
public final class ApplicationModule_ProvidesABTestServiceFactory implements C10824b<ABTestService> {
    private final Provider<ABTestServiceProvider> abTestServiceProvider;
    private final Provider<IdsRepository> idsRepositoryProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesABTestServiceFactory(ApplicationModule applicationModule, Provider<ABTestServiceProvider> provider, Provider<IdsRepository> provider2) {
        this.module = applicationModule;
        this.abTestServiceProvider = provider;
        this.idsRepositoryProvider = provider2;
    }

    public static ApplicationModule_ProvidesABTestServiceFactory create(ApplicationModule applicationModule, Provider<ABTestServiceProvider> provider, Provider<IdsRepository> provider2) {
        return new ApplicationModule_ProvidesABTestServiceFactory(applicationModule, provider, provider2);
    }

    public static ABTestService providesABTestService(ApplicationModule applicationModule, ABTestServiceProvider aBTestServiceProvider, IdsRepository idsRepository) {
        ABTestService providesABTestService = applicationModule.providesABTestService(aBTestServiceProvider, idsRepository);
        C10825c.m36718a(providesABTestService, "Cannot return null from a non-@Nullable @Provides method");
        return providesABTestService;
    }

    public ABTestService get() {
        return providesABTestService(this.module, this.abTestServiceProvider.get(), this.idsRepositoryProvider.get());
    }
}
