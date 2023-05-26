package p015cm.aptoide.p016pt;

import android.content.SharedPreferences;
import javax.inject.Provider;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideSearchBaseUrlFactory */
public final class ApplicationModule_ProvideSearchBaseUrlFactory implements C10824b<String> {
    private final ApplicationModule module;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public ApplicationModule_ProvideSearchBaseUrlFactory(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        this.module = applicationModule;
        this.sharedPreferencesProvider = provider;
    }

    public static ApplicationModule_ProvideSearchBaseUrlFactory create(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        return new ApplicationModule_ProvideSearchBaseUrlFactory(applicationModule, provider);
    }

    public static String provideSearchBaseUrl(ApplicationModule applicationModule, SharedPreferences sharedPreferences) {
        String provideSearchBaseUrl = applicationModule.provideSearchBaseUrl(sharedPreferences);
        C10825c.m36718a(provideSearchBaseUrl, "Cannot return null from a non-@Nullable @Provides method");
        return provideSearchBaseUrl;
    }

    public String get() {
        return provideSearchBaseUrl(this.module, this.sharedPreferencesProvider.get());
    }
}
