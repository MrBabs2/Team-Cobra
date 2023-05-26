package p015cm.aptoide.p016pt;

import android.content.SharedPreferences;
import javax.inject.Provider;
import p015cm.aptoide.p016pt.preferences.Preferences;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideDefaultPreferencesFactory */
public final class ApplicationModule_ProvideDefaultPreferencesFactory implements C10824b<Preferences> {
    private final ApplicationModule module;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public ApplicationModule_ProvideDefaultPreferencesFactory(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        this.module = applicationModule;
        this.sharedPreferencesProvider = provider;
    }

    public static ApplicationModule_ProvideDefaultPreferencesFactory create(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        return new ApplicationModule_ProvideDefaultPreferencesFactory(applicationModule, provider);
    }

    public static Preferences provideDefaultPreferences(ApplicationModule applicationModule, SharedPreferences sharedPreferences) {
        Preferences provideDefaultPreferences = applicationModule.provideDefaultPreferences(sharedPreferences);
        C10825c.m36718a(provideDefaultPreferences, "Cannot return null from a non-@Nullable @Provides method");
        return provideDefaultPreferences;
    }

    public Preferences get() {
        return provideDefaultPreferences(this.module, this.sharedPreferencesProvider.get());
    }
}
