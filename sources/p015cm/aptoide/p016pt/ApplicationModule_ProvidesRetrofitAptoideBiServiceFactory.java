package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.analytics.implementation.AptoideBiEventService;
import p015cm.aptoide.analytics.implementation.network.RetrofitAptoideBiService;
import p015cm.aptoide.p016pt.analytics.analytics.AnalyticsBodyInterceptorV7;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesRetrofitAptoideBiServiceFactory */
public final class ApplicationModule_ProvidesRetrofitAptoideBiServiceFactory implements C10824b<AptoideBiEventService> {
    private final Provider<AnalyticsBodyInterceptorV7> bodyInterceptorProvider;
    private final ApplicationModule module;
    private final Provider<RetrofitAptoideBiService.ServiceV7> serviceV7Provider;

    public ApplicationModule_ProvidesRetrofitAptoideBiServiceFactory(ApplicationModule applicationModule, Provider<RetrofitAptoideBiService.ServiceV7> provider, Provider<AnalyticsBodyInterceptorV7> provider2) {
        this.module = applicationModule;
        this.serviceV7Provider = provider;
        this.bodyInterceptorProvider = provider2;
    }

    public static ApplicationModule_ProvidesRetrofitAptoideBiServiceFactory create(ApplicationModule applicationModule, Provider<RetrofitAptoideBiService.ServiceV7> provider, Provider<AnalyticsBodyInterceptorV7> provider2) {
        return new ApplicationModule_ProvidesRetrofitAptoideBiServiceFactory(applicationModule, provider, provider2);
    }

    public static AptoideBiEventService providesRetrofitAptoideBiService(ApplicationModule applicationModule, RetrofitAptoideBiService.ServiceV7 serviceV7, AnalyticsBodyInterceptorV7 analyticsBodyInterceptorV7) {
        AptoideBiEventService providesRetrofitAptoideBiService = applicationModule.providesRetrofitAptoideBiService(serviceV7, analyticsBodyInterceptorV7);
        C10825c.m36718a(providesRetrofitAptoideBiService, "Cannot return null from a non-@Nullable @Provides method");
        return providesRetrofitAptoideBiService;
    }

    public AptoideBiEventService get() {
        return providesRetrofitAptoideBiService(this.module, this.serviceV7Provider.get(), this.bodyInterceptorProvider.get());
    }
}
