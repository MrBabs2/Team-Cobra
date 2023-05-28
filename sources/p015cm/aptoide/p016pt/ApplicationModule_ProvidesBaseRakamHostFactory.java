package p015cm.aptoide.p016pt;

import android.content.SharedPreferences;
import javax.inject.Provider;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesBaseRakamHostFactory */
public final class ApplicationModule_ProvidesBaseRakamHostFactory implements C10824b<String> {
    private final ApplicationModule module;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public ApplicationModule_ProvidesBaseRakamHostFactory(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        this.module = applicationModule;
        this.sharedPreferencesProvider = provider;
    }

    public static ApplicationModule_ProvidesBaseRakamHostFactory create(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        return new ApplicationModule_ProvidesBaseRakamHostFactory(applicationModule, provider);
    }

    public static String providesBaseRakamHost(ApplicationModule applicationModule, SharedPreferences sharedPreferences) {
        String providesBaseRakamHost = applicationModule.providesBaseRakamHost(sharedPreferences);
        C10825c.m36718a(providesBaseRakamHost, "Cannot return null from a non-@Nullable @Provides method");
        return providesBaseRakamHost;
    }

    public String get() {
        return providesBaseRakamHost(this.module, this.sharedPreferencesProvider.get());
    }
}
