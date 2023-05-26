package p015cm.aptoide.p016pt;

import android.content.SharedPreferences;
import javax.inject.Provider;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesApichainBdsBaseHostFactory */
public final class ApplicationModule_ProvidesApichainBdsBaseHostFactory implements C10824b<String> {
    private final ApplicationModule module;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public ApplicationModule_ProvidesApichainBdsBaseHostFactory(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        this.module = applicationModule;
        this.sharedPreferencesProvider = provider;
    }

    public static ApplicationModule_ProvidesApichainBdsBaseHostFactory create(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        return new ApplicationModule_ProvidesApichainBdsBaseHostFactory(applicationModule, provider);
    }

    public static String providesApichainBdsBaseHost(ApplicationModule applicationModule, SharedPreferences sharedPreferences) {
        String providesApichainBdsBaseHost = applicationModule.providesApichainBdsBaseHost(sharedPreferences);
        C10825c.m36718a(providesApichainBdsBaseHost, "Cannot return null from a non-@Nullable @Provides method");
        return providesApichainBdsBaseHost;
    }

    public String get() {
        return providesApichainBdsBaseHost(this.module, this.sharedPreferencesProvider.get());
    }
}
