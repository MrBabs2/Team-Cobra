package p015cm.aptoide.p016pt;

import android.content.SharedPreferences;
import javax.inject.Provider;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesABTestingBaseHostFactory */
public final class ApplicationModule_ProvidesABTestingBaseHostFactory implements C10824b<String> {
    private final ApplicationModule module;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public ApplicationModule_ProvidesABTestingBaseHostFactory(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        this.module = applicationModule;
        this.sharedPreferencesProvider = provider;
    }

    public static ApplicationModule_ProvidesABTestingBaseHostFactory create(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        return new ApplicationModule_ProvidesABTestingBaseHostFactory(applicationModule, provider);
    }

    public static String providesABTestingBaseHost(ApplicationModule applicationModule, SharedPreferences sharedPreferences) {
        String providesABTestingBaseHost = applicationModule.providesABTestingBaseHost(sharedPreferences);
        C10825c.m36718a(providesABTestingBaseHost, "Cannot return null from a non-@Nullable @Provides method");
        return providesABTestingBaseHost;
    }

    public String get() {
        return providesABTestingBaseHost(this.module, this.sharedPreferencesProvider.get());
    }
}
