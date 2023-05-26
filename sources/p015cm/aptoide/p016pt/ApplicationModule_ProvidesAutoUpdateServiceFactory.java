package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.autoupdate.Service;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;
import retrofit2.Retrofit;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAutoUpdateServiceFactory */
public final class ApplicationModule_ProvidesAutoUpdateServiceFactory implements C10824b<Service> {
    private final ApplicationModule module;
    private final Provider<Retrofit> retrofitProvider;

    public ApplicationModule_ProvidesAutoUpdateServiceFactory(ApplicationModule applicationModule, Provider<Retrofit> provider) {
        this.module = applicationModule;
        this.retrofitProvider = provider;
    }

    public static ApplicationModule_ProvidesAutoUpdateServiceFactory create(ApplicationModule applicationModule, Provider<Retrofit> provider) {
        return new ApplicationModule_ProvidesAutoUpdateServiceFactory(applicationModule, provider);
    }

    public static Service providesAutoUpdateService(ApplicationModule applicationModule, Retrofit retrofit) {
        Service providesAutoUpdateService = applicationModule.providesAutoUpdateService(retrofit);
        C10825c.m36718a(providesAutoUpdateService, "Cannot return null from a non-@Nullable @Provides method");
        return providesAutoUpdateService;
    }

    public Service get() {
        return providesAutoUpdateService(this.module, this.retrofitProvider.get());
    }
}
