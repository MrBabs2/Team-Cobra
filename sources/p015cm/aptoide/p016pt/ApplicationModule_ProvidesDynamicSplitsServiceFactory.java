package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.aab.DynamicSplitsMapper;
import p015cm.aptoide.p016pt.aab.DynamicSplitsRemoteService;
import p015cm.aptoide.p016pt.aab.DynamicSplitsService;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesDynamicSplitsServiceFactory */
public final class ApplicationModule_ProvidesDynamicSplitsServiceFactory implements C10824b<DynamicSplitsService> {
    private final Provider<DynamicSplitsRemoteService.DynamicSplitsApi> dynamicSplitsApiProvider;
    private final Provider<DynamicSplitsMapper> dynamicSplitsMapperProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesDynamicSplitsServiceFactory(ApplicationModule applicationModule, Provider<DynamicSplitsRemoteService.DynamicSplitsApi> provider, Provider<DynamicSplitsMapper> provider2) {
        this.module = applicationModule;
        this.dynamicSplitsApiProvider = provider;
        this.dynamicSplitsMapperProvider = provider2;
    }

    public static ApplicationModule_ProvidesDynamicSplitsServiceFactory create(ApplicationModule applicationModule, Provider<DynamicSplitsRemoteService.DynamicSplitsApi> provider, Provider<DynamicSplitsMapper> provider2) {
        return new ApplicationModule_ProvidesDynamicSplitsServiceFactory(applicationModule, provider, provider2);
    }

    public static DynamicSplitsService providesDynamicSplitsService(ApplicationModule applicationModule, DynamicSplitsRemoteService.DynamicSplitsApi dynamicSplitsApi, DynamicSplitsMapper dynamicSplitsMapper) {
        DynamicSplitsService providesDynamicSplitsService = applicationModule.providesDynamicSplitsService(dynamicSplitsApi, dynamicSplitsMapper);
        C10825c.m36718a(providesDynamicSplitsService, "Cannot return null from a non-@Nullable @Provides method");
        return providesDynamicSplitsService;
    }

    public DynamicSplitsService get() {
        return providesDynamicSplitsService(this.module, this.dynamicSplitsApiProvider.get(), this.dynamicSplitsMapperProvider.get());
    }
}
