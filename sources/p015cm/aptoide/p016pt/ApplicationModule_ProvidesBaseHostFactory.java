package p015cm.aptoide.p016pt;

import android.content.SharedPreferences;
import javax.inject.Provider;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesBaseHostFactory */
public final class ApplicationModule_ProvidesBaseHostFactory implements C10824b<String> {
    private final ApplicationModule module;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public ApplicationModule_ProvidesBaseHostFactory(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        this.module = applicationModule;
        this.sharedPreferencesProvider = provider;
    }

    public static ApplicationModule_ProvidesBaseHostFactory create(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        return new ApplicationModule_ProvidesBaseHostFactory(applicationModule, provider);
    }

    public static String providesBaseHost(ApplicationModule applicationModule, SharedPreferences sharedPreferences) {
        String providesBaseHost = applicationModule.providesBaseHost(sharedPreferences);
        C10825c.m36718a(providesBaseHost, "Cannot return null from a non-@Nullable @Provides method");
        return providesBaseHost;
    }

    public String get() {
        return providesBaseHost(this.module, this.sharedPreferencesProvider.get());
    }
}
