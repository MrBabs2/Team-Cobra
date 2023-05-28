package p015cm.aptoide.p016pt;

import android.content.SharedPreferences;
import javax.inject.Provider;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesSecureSharedPreferencesFactory */
public final class ApplicationModule_ProvidesSecureSharedPreferencesFactory implements C10824b<SharedPreferences> {
    private final Provider<SharedPreferences> defaultSharedPreferencesProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesSecureSharedPreferencesFactory(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        this.module = applicationModule;
        this.defaultSharedPreferencesProvider = provider;
    }

    public static ApplicationModule_ProvidesSecureSharedPreferencesFactory create(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        return new ApplicationModule_ProvidesSecureSharedPreferencesFactory(applicationModule, provider);
    }

    public static SharedPreferences providesSecureSharedPreferences(ApplicationModule applicationModule, SharedPreferences sharedPreferences) {
        SharedPreferences providesSecureSharedPreferences = applicationModule.providesSecureSharedPreferences(sharedPreferences);
        C10825c.m36718a(providesSecureSharedPreferences, "Cannot return null from a non-@Nullable @Provides method");
        return providesSecureSharedPreferences;
    }

    public SharedPreferences get() {
        return providesSecureSharedPreferences(this.module, this.defaultSharedPreferencesProvider.get());
    }
}
