package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.app.appsflyer.AppsFlyerService;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;
import retrofit2.Retrofit;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAppsFlyerServiceFactory */
public final class ApplicationModule_ProvidesAppsFlyerServiceFactory implements C10824b<AppsFlyerService> {
    private final ApplicationModule module;
    private final Provider<Retrofit> retrofitProvider;

    public ApplicationModule_ProvidesAppsFlyerServiceFactory(ApplicationModule applicationModule, Provider<Retrofit> provider) {
        this.module = applicationModule;
        this.retrofitProvider = provider;
    }

    public static ApplicationModule_ProvidesAppsFlyerServiceFactory create(ApplicationModule applicationModule, Provider<Retrofit> provider) {
        return new ApplicationModule_ProvidesAppsFlyerServiceFactory(applicationModule, provider);
    }

    public static AppsFlyerService providesAppsFlyerService(ApplicationModule applicationModule, Retrofit retrofit) {
        AppsFlyerService providesAppsFlyerService = applicationModule.providesAppsFlyerService(retrofit);
        C10825c.m36718a(providesAppsFlyerService, "Cannot return null from a non-@Nullable @Provides method");
        return providesAppsFlyerService;
    }

    public AppsFlyerService get() {
        return providesAppsFlyerService(this.module, this.retrofitProvider.get());
    }
}
