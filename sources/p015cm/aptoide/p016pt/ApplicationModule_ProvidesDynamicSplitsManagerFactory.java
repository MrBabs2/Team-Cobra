package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.aab.DynamicSplitsManager;
import p015cm.aptoide.p016pt.aab.DynamicSplitsService;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesDynamicSplitsManagerFactory */
public final class ApplicationModule_ProvidesDynamicSplitsManagerFactory implements C10824b<DynamicSplitsManager> {
    private final Provider<DynamicSplitsService> dynamicSplitsServiceProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesDynamicSplitsManagerFactory(ApplicationModule applicationModule, Provider<DynamicSplitsService> provider) {
        this.module = applicationModule;
        this.dynamicSplitsServiceProvider = provider;
    }

    public static ApplicationModule_ProvidesDynamicSplitsManagerFactory create(ApplicationModule applicationModule, Provider<DynamicSplitsService> provider) {
        return new ApplicationModule_ProvidesDynamicSplitsManagerFactory(applicationModule, provider);
    }

    public static DynamicSplitsManager providesDynamicSplitsManager(ApplicationModule applicationModule, DynamicSplitsService dynamicSplitsService) {
        DynamicSplitsManager providesDynamicSplitsManager = applicationModule.providesDynamicSplitsManager(dynamicSplitsService);
        C10825c.m36718a(providesDynamicSplitsManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesDynamicSplitsManager;
    }

    public DynamicSplitsManager get() {
        return providesDynamicSplitsManager(this.module, this.dynamicSplitsServiceProvider.get());
    }
}
