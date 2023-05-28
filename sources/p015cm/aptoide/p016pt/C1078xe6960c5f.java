package p015cm.aptoide.p016pt;

import android.content.SharedPreferences;
import javax.inject.Provider;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilitySettingsProvider;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAppBundlesVisibilitySettingsProviderFactory */
public final class C1078xe6960c5f implements C10824b<AppBundlesVisibilitySettingsProvider> {
    private final ApplicationModule module;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public C1078xe6960c5f(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        this.module = applicationModule;
        this.sharedPreferencesProvider = provider;
    }

    public static C1078xe6960c5f create(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        return new C1078xe6960c5f(applicationModule, provider);
    }

    public static AppBundlesVisibilitySettingsProvider providesAppBundlesVisibilitySettingsProvider(ApplicationModule applicationModule, SharedPreferences sharedPreferences) {
        AppBundlesVisibilitySettingsProvider providesAppBundlesVisibilitySettingsProvider = applicationModule.providesAppBundlesVisibilitySettingsProvider(sharedPreferences);
        C10825c.m36718a(providesAppBundlesVisibilitySettingsProvider, "Cannot return null from a non-@Nullable @Provides method");
        return providesAppBundlesVisibilitySettingsProvider;
    }

    public AppBundlesVisibilitySettingsProvider get() {
        return providesAppBundlesVisibilitySettingsProvider(this.module, this.sharedPreferencesProvider.get());
    }
}
