package p015cm.aptoide.p016pt;

import android.content.SharedPreferences;
import javax.inject.Provider;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesBaseWebservicesHostFactory */
public final class ApplicationModule_ProvidesBaseWebservicesHostFactory implements C10824b<String> {
    private final ApplicationModule module;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public ApplicationModule_ProvidesBaseWebservicesHostFactory(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        this.module = applicationModule;
        this.sharedPreferencesProvider = provider;
    }

    public static ApplicationModule_ProvidesBaseWebservicesHostFactory create(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        return new ApplicationModule_ProvidesBaseWebservicesHostFactory(applicationModule, provider);
    }

    public static String providesBaseWebservicesHost(ApplicationModule applicationModule, SharedPreferences sharedPreferences) {
        String providesBaseWebservicesHost = applicationModule.providesBaseWebservicesHost(sharedPreferences);
        C10825c.m36718a(providesBaseWebservicesHost, "Cannot return null from a non-@Nullable @Provides method");
        return providesBaseWebservicesHost;
    }

    public String get() {
        return providesBaseWebservicesHost(this.module, this.sharedPreferencesProvider.get());
    }
}
