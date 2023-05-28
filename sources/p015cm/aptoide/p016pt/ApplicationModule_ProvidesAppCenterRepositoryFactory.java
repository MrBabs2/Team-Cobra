package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.view.app.AppCenterRepository;
import p015cm.aptoide.p016pt.view.app.AppService;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAppCenterRepositoryFactory */
public final class ApplicationModule_ProvidesAppCenterRepositoryFactory implements C10824b<AppCenterRepository> {
    private final Provider<AppService> appServiceProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAppCenterRepositoryFactory(ApplicationModule applicationModule, Provider<AppService> provider) {
        this.module = applicationModule;
        this.appServiceProvider = provider;
    }

    public static ApplicationModule_ProvidesAppCenterRepositoryFactory create(ApplicationModule applicationModule, Provider<AppService> provider) {
        return new ApplicationModule_ProvidesAppCenterRepositoryFactory(applicationModule, provider);
    }

    public static AppCenterRepository providesAppCenterRepository(ApplicationModule applicationModule, AppService appService) {
        AppCenterRepository providesAppCenterRepository = applicationModule.providesAppCenterRepository(appService);
        C10825c.m36718a(providesAppCenterRepository, "Cannot return null from a non-@Nullable @Provides method");
        return providesAppCenterRepository;
    }

    public AppCenterRepository get() {
        return providesAppCenterRepository(this.module, this.appServiceProvider.get());
    }
}
