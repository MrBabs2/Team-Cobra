package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.view.app.AppCenter;
import p015cm.aptoide.p016pt.view.app.AppCenterRepository;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAppCenterFactory */
public final class ApplicationModule_ProvidesAppCenterFactory implements C10824b<AppCenter> {
    private final Provider<AppCenterRepository> appCenterRepositoryProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAppCenterFactory(ApplicationModule applicationModule, Provider<AppCenterRepository> provider) {
        this.module = applicationModule;
        this.appCenterRepositoryProvider = provider;
    }

    public static ApplicationModule_ProvidesAppCenterFactory create(ApplicationModule applicationModule, Provider<AppCenterRepository> provider) {
        return new ApplicationModule_ProvidesAppCenterFactory(applicationModule, provider);
    }

    public static AppCenter providesAppCenter(ApplicationModule applicationModule, AppCenterRepository appCenterRepository) {
        AppCenter providesAppCenter = applicationModule.providesAppCenter(appCenterRepository);
        C10825c.m36718a(providesAppCenter, "Cannot return null from a non-@Nullable @Provides method");
        return providesAppCenter;
    }

    public AppCenter get() {
        return providesAppCenter(this.module, this.appCenterRepositoryProvider.get());
    }
}
