package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.app.appsflyer.AppsFlyerRepository;
import p015cm.aptoide.p016pt.app.appsflyer.AppsFlyerService;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAppsFlyerRepositoryFactory */
public final class ApplicationModule_ProvidesAppsFlyerRepositoryFactory implements C10824b<AppsFlyerRepository> {
    private final Provider<AppsFlyerService> appsFlyerServiceProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAppsFlyerRepositoryFactory(ApplicationModule applicationModule, Provider<AppsFlyerService> provider) {
        this.module = applicationModule;
        this.appsFlyerServiceProvider = provider;
    }

    public static ApplicationModule_ProvidesAppsFlyerRepositoryFactory create(ApplicationModule applicationModule, Provider<AppsFlyerService> provider) {
        return new ApplicationModule_ProvidesAppsFlyerRepositoryFactory(applicationModule, provider);
    }

    public static AppsFlyerRepository providesAppsFlyerRepository(ApplicationModule applicationModule, AppsFlyerService appsFlyerService) {
        AppsFlyerRepository providesAppsFlyerRepository = applicationModule.providesAppsFlyerRepository(appsFlyerService);
        C10825c.m36718a(providesAppsFlyerRepository, "Cannot return null from a non-@Nullable @Provides method");
        return providesAppsFlyerRepository;
    }

    public AppsFlyerRepository get() {
        return providesAppsFlyerRepository(this.module, this.appsFlyerServiceProvider.get());
    }
}
