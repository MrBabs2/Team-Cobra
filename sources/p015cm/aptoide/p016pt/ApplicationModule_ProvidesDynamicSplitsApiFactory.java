package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.aab.DynamicSplitsRemoteService;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;
import retrofit2.Retrofit;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesDynamicSplitsApiFactory */
public final class ApplicationModule_ProvidesDynamicSplitsApiFactory implements C10824b<DynamicSplitsRemoteService.DynamicSplitsApi> {
    private final ApplicationModule module;
    private final Provider<Retrofit> retrofitProvider;

    public ApplicationModule_ProvidesDynamicSplitsApiFactory(ApplicationModule applicationModule, Provider<Retrofit> provider) {
        this.module = applicationModule;
        this.retrofitProvider = provider;
    }

    public static ApplicationModule_ProvidesDynamicSplitsApiFactory create(ApplicationModule applicationModule, Provider<Retrofit> provider) {
        return new ApplicationModule_ProvidesDynamicSplitsApiFactory(applicationModule, provider);
    }

    public static DynamicSplitsRemoteService.DynamicSplitsApi providesDynamicSplitsApi(ApplicationModule applicationModule, Retrofit retrofit) {
        DynamicSplitsRemoteService.DynamicSplitsApi providesDynamicSplitsApi = applicationModule.providesDynamicSplitsApi(retrofit);
        C10825c.m36718a(providesDynamicSplitsApi, "Cannot return null from a non-@Nullable @Provides method");
        return providesDynamicSplitsApi;
    }

    public DynamicSplitsRemoteService.DynamicSplitsApi get() {
        return providesDynamicSplitsApi(this.module, this.retrofitProvider.get());
    }
}
