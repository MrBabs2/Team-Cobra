package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.app.appsflyer.AppsFlyerManager;
import p015cm.aptoide.p016pt.app.appsflyer.AppsFlyerRepository;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAppsFlyerManagerFactory */
public final class ApplicationModule_ProvidesAppsFlyerManagerFactory implements C10824b<AppsFlyerManager> {
    private final Provider<AppsFlyerRepository> appsFlyerRepositoryProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAppsFlyerManagerFactory(ApplicationModule applicationModule, Provider<AppsFlyerRepository> provider) {
        this.module = applicationModule;
        this.appsFlyerRepositoryProvider = provider;
    }

    public static ApplicationModule_ProvidesAppsFlyerManagerFactory create(ApplicationModule applicationModule, Provider<AppsFlyerRepository> provider) {
        return new ApplicationModule_ProvidesAppsFlyerManagerFactory(applicationModule, provider);
    }

    public static AppsFlyerManager providesAppsFlyerManager(ApplicationModule applicationModule, AppsFlyerRepository appsFlyerRepository) {
        AppsFlyerManager providesAppsFlyerManager = applicationModule.providesAppsFlyerManager(appsFlyerRepository);
        C10825c.m36718a(providesAppsFlyerManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesAppsFlyerManager;
    }

    public AppsFlyerManager get() {
        return providesAppsFlyerManager(this.module, this.appsFlyerRepositoryProvider.get());
    }
}
