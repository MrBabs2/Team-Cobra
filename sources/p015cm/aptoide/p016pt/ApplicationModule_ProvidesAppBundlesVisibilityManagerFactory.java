package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilityManager;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilitySettingsProvider;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAppBundlesVisibilityManagerFactory */
public final class ApplicationModule_ProvidesAppBundlesVisibilityManagerFactory implements C10824b<AppBundlesVisibilityManager> {
    private final Provider<AppBundlesVisibilitySettingsProvider> appBundlesVisibilitySettingsProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAppBundlesVisibilityManagerFactory(ApplicationModule applicationModule, Provider<AppBundlesVisibilitySettingsProvider> provider) {
        this.module = applicationModule;
        this.appBundlesVisibilitySettingsProvider = provider;
    }

    public static ApplicationModule_ProvidesAppBundlesVisibilityManagerFactory create(ApplicationModule applicationModule, Provider<AppBundlesVisibilitySettingsProvider> provider) {
        return new ApplicationModule_ProvidesAppBundlesVisibilityManagerFactory(applicationModule, provider);
    }

    public static AppBundlesVisibilityManager providesAppBundlesVisibilityManager(ApplicationModule applicationModule, AppBundlesVisibilitySettingsProvider appBundlesVisibilitySettingsProvider2) {
        AppBundlesVisibilityManager providesAppBundlesVisibilityManager = applicationModule.providesAppBundlesVisibilityManager(appBundlesVisibilitySettingsProvider2);
        C10825c.m36718a(providesAppBundlesVisibilityManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesAppBundlesVisibilityManager;
    }

    public AppBundlesVisibilityManager get() {
        return providesAppBundlesVisibilityManager(this.module, this.appBundlesVisibilitySettingsProvider.get());
    }
}
