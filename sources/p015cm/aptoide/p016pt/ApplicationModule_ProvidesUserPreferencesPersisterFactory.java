package p015cm.aptoide.p016pt;

import android.content.SharedPreferences;
import javax.inject.Provider;
import p015cm.aptoide.p016pt.appview.PreferencesPersister;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesUserPreferencesPersisterFactory */
public final class ApplicationModule_ProvidesUserPreferencesPersisterFactory implements C10824b<PreferencesPersister> {
    private final ApplicationModule module;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public ApplicationModule_ProvidesUserPreferencesPersisterFactory(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        this.module = applicationModule;
        this.sharedPreferencesProvider = provider;
    }

    public static ApplicationModule_ProvidesUserPreferencesPersisterFactory create(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        return new ApplicationModule_ProvidesUserPreferencesPersisterFactory(applicationModule, provider);
    }

    public static PreferencesPersister providesUserPreferencesPersister(ApplicationModule applicationModule, SharedPreferences sharedPreferences) {
        PreferencesPersister providesUserPreferencesPersister = applicationModule.providesUserPreferencesPersister(sharedPreferences);
        C10825c.m36718a(providesUserPreferencesPersister, "Cannot return null from a non-@Nullable @Provides method");
        return providesUserPreferencesPersister;
    }

    public PreferencesPersister get() {
        return providesUserPreferencesPersister(this.module, this.sharedPreferencesProvider.get());
    }
}
