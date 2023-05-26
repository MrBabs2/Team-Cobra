package p015cm.aptoide.p016pt;

import android.content.SharedPreferences;
import javax.inject.Provider;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesLaunchManagerFactory */
public final class ApplicationModule_ProvidesLaunchManagerFactory implements C10824b<LaunchManager> {
    private final Provider<FirstLaunchManager> firstLaunchManagerProvider;
    private final ApplicationModule module;
    private final Provider<SharedPreferences> secureSharedPreferencesProvider;
    private final Provider<UpdateLaunchManager> updateLaunchManagerProvider;

    public ApplicationModule_ProvidesLaunchManagerFactory(ApplicationModule applicationModule, Provider<FirstLaunchManager> provider, Provider<UpdateLaunchManager> provider2, Provider<SharedPreferences> provider3) {
        this.module = applicationModule;
        this.firstLaunchManagerProvider = provider;
        this.updateLaunchManagerProvider = provider2;
        this.secureSharedPreferencesProvider = provider3;
    }

    public static ApplicationModule_ProvidesLaunchManagerFactory create(ApplicationModule applicationModule, Provider<FirstLaunchManager> provider, Provider<UpdateLaunchManager> provider2, Provider<SharedPreferences> provider3) {
        return new ApplicationModule_ProvidesLaunchManagerFactory(applicationModule, provider, provider2, provider3);
    }

    public static LaunchManager providesLaunchManager(ApplicationModule applicationModule, FirstLaunchManager firstLaunchManager, UpdateLaunchManager updateLaunchManager, SharedPreferences sharedPreferences) {
        LaunchManager providesLaunchManager = applicationModule.providesLaunchManager(firstLaunchManager, updateLaunchManager, sharedPreferences);
        C10825c.m36718a(providesLaunchManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesLaunchManager;
    }

    public LaunchManager get() {
        return providesLaunchManager(this.module, this.firstLaunchManagerProvider.get(), this.updateLaunchManagerProvider.get(), this.secureSharedPreferencesProvider.get());
    }
}
