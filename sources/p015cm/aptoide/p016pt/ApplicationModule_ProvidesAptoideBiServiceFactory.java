package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.analytics.implementation.network.RetrofitAptoideBiService;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;
import retrofit2.Retrofit;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAptoideBiServiceFactory */
public final class ApplicationModule_ProvidesAptoideBiServiceFactory implements C10824b<RetrofitAptoideBiService.ServiceV7> {
    private final ApplicationModule module;
    private final Provider<Retrofit> retrofitProvider;

    public ApplicationModule_ProvidesAptoideBiServiceFactory(ApplicationModule applicationModule, Provider<Retrofit> provider) {
        this.module = applicationModule;
        this.retrofitProvider = provider;
    }

    public static ApplicationModule_ProvidesAptoideBiServiceFactory create(ApplicationModule applicationModule, Provider<Retrofit> provider) {
        return new ApplicationModule_ProvidesAptoideBiServiceFactory(applicationModule, provider);
    }

    public static RetrofitAptoideBiService.ServiceV7 providesAptoideBiService(ApplicationModule applicationModule, Retrofit retrofit) {
        RetrofitAptoideBiService.ServiceV7 providesAptoideBiService = applicationModule.providesAptoideBiService(retrofit);
        C10825c.m36718a(providesAptoideBiService, "Cannot return null from a non-@Nullable @Provides method");
        return providesAptoideBiService;
    }

    public RetrofitAptoideBiService.ServiceV7 get() {
        return providesAptoideBiService(this.module, this.retrofitProvider.get());
    }
}
