package p015cm.aptoide.p016pt;

import android.content.SharedPreferences;
import javax.inject.Provider;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesBaseSecondaryHostFactory */
public final class ApplicationModule_ProvidesBaseSecondaryHostFactory implements C10824b<String> {
    private final ApplicationModule module;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public ApplicationModule_ProvidesBaseSecondaryHostFactory(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        this.module = applicationModule;
        this.sharedPreferencesProvider = provider;
    }

    public static ApplicationModule_ProvidesBaseSecondaryHostFactory create(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        return new ApplicationModule_ProvidesBaseSecondaryHostFactory(applicationModule, provider);
    }

    public static String providesBaseSecondaryHost(ApplicationModule applicationModule, SharedPreferences sharedPreferences) {
        String providesBaseSecondaryHost = applicationModule.providesBaseSecondaryHost(sharedPreferences);
        C10825c.m36718a(providesBaseSecondaryHost, "Cannot return null from a non-@Nullable @Provides method");
        return providesBaseSecondaryHost;
    }

    public String get() {
        return providesBaseSecondaryHost(this.module, this.sharedPreferencesProvider.get());
    }
}
