package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.bonus.BonusAppcRemoteService;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;
import retrofit2.Retrofit;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesBonusAppcServiceApiFactory */
public final class ApplicationModule_ProvidesBonusAppcServiceApiFactory implements C10824b<BonusAppcRemoteService.ServiceApi> {
    private final ApplicationModule module;
    private final Provider<Retrofit> retrofitProvider;

    public ApplicationModule_ProvidesBonusAppcServiceApiFactory(ApplicationModule applicationModule, Provider<Retrofit> provider) {
        this.module = applicationModule;
        this.retrofitProvider = provider;
    }

    public static ApplicationModule_ProvidesBonusAppcServiceApiFactory create(ApplicationModule applicationModule, Provider<Retrofit> provider) {
        return new ApplicationModule_ProvidesBonusAppcServiceApiFactory(applicationModule, provider);
    }

    public static BonusAppcRemoteService.ServiceApi providesBonusAppcServiceApi(ApplicationModule applicationModule, Retrofit retrofit) {
        BonusAppcRemoteService.ServiceApi providesBonusAppcServiceApi = applicationModule.providesBonusAppcServiceApi(retrofit);
        C10825c.m36718a(providesBonusAppcServiceApi, "Cannot return null from a non-@Nullable @Provides method");
        return providesBonusAppcServiceApi;
    }

    public BonusAppcRemoteService.ServiceApi get() {
        return providesBonusAppcServiceApi(this.module, this.retrofitProvider.get());
    }
}
