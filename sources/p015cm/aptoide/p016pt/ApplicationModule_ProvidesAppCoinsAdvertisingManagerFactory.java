package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.app.AppCoinsAdvertisingManager;
import p015cm.aptoide.p016pt.app.AppCoinsService;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAppCoinsAdvertisingManagerFactory */
public final class ApplicationModule_ProvidesAppCoinsAdvertisingManagerFactory implements C10824b<AppCoinsAdvertisingManager> {
    private final Provider<AppCoinsService> appCoinsServiceProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAppCoinsAdvertisingManagerFactory(ApplicationModule applicationModule, Provider<AppCoinsService> provider) {
        this.module = applicationModule;
        this.appCoinsServiceProvider = provider;
    }

    public static ApplicationModule_ProvidesAppCoinsAdvertisingManagerFactory create(ApplicationModule applicationModule, Provider<AppCoinsService> provider) {
        return new ApplicationModule_ProvidesAppCoinsAdvertisingManagerFactory(applicationModule, provider);
    }

    public static AppCoinsAdvertisingManager providesAppCoinsAdvertisingManager(ApplicationModule applicationModule, AppCoinsService appCoinsService) {
        AppCoinsAdvertisingManager providesAppCoinsAdvertisingManager = applicationModule.providesAppCoinsAdvertisingManager(appCoinsService);
        C10825c.m36718a(providesAppCoinsAdvertisingManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesAppCoinsAdvertisingManager;
    }

    public AppCoinsAdvertisingManager get() {
        return providesAppCoinsAdvertisingManager(this.module, this.appCoinsServiceProvider.get());
    }
}
