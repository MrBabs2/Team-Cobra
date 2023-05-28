package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.preferences.SecurePreferences;
import p015cm.aptoide.p016pt.root.RootAvailabilityManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideRootAvailabilityManagerFactory */
public final class ApplicationModule_ProvideRootAvailabilityManagerFactory implements C10824b<RootAvailabilityManager> {
    private final ApplicationModule module;
    private final Provider<SecurePreferences> securePreferencesProvider;

    public ApplicationModule_ProvideRootAvailabilityManagerFactory(ApplicationModule applicationModule, Provider<SecurePreferences> provider) {
        this.module = applicationModule;
        this.securePreferencesProvider = provider;
    }

    public static ApplicationModule_ProvideRootAvailabilityManagerFactory create(ApplicationModule applicationModule, Provider<SecurePreferences> provider) {
        return new ApplicationModule_ProvideRootAvailabilityManagerFactory(applicationModule, provider);
    }

    public static RootAvailabilityManager provideRootAvailabilityManager(ApplicationModule applicationModule, SecurePreferences securePreferences) {
        RootAvailabilityManager provideRootAvailabilityManager = applicationModule.provideRootAvailabilityManager(securePreferences);
        C10825c.m36718a(provideRootAvailabilityManager, "Cannot return null from a non-@Nullable @Provides method");
        return provideRootAvailabilityManager;
    }

    public RootAvailabilityManager get() {
        return provideRootAvailabilityManager(this.module, this.securePreferencesProvider.get());
    }
}
