package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.home.AppComingSoonRegistrationManager;
import p015cm.aptoide.p016pt.home.AppComingSoonRegistrationPersistence;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAppComingSoonPreferencesManagerFactory */
public final class ApplicationModule_ProvidesAppComingSoonPreferencesManagerFactory implements C10824b<AppComingSoonRegistrationManager> {
    private final Provider<AppComingSoonRegistrationPersistence> appComingSoonRegistrationPersistenceProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAppComingSoonPreferencesManagerFactory(ApplicationModule applicationModule, Provider<AppComingSoonRegistrationPersistence> provider) {
        this.module = applicationModule;
        this.appComingSoonRegistrationPersistenceProvider = provider;
    }

    public static ApplicationModule_ProvidesAppComingSoonPreferencesManagerFactory create(ApplicationModule applicationModule, Provider<AppComingSoonRegistrationPersistence> provider) {
        return new ApplicationModule_ProvidesAppComingSoonPreferencesManagerFactory(applicationModule, provider);
    }

    public static AppComingSoonRegistrationManager providesAppComingSoonPreferencesManager(ApplicationModule applicationModule, AppComingSoonRegistrationPersistence appComingSoonRegistrationPersistence) {
        AppComingSoonRegistrationManager providesAppComingSoonPreferencesManager = applicationModule.providesAppComingSoonPreferencesManager(appComingSoonRegistrationPersistence);
        C10825c.m36718a(providesAppComingSoonPreferencesManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesAppComingSoonPreferencesManager;
    }

    public AppComingSoonRegistrationManager get() {
        return providesAppComingSoonPreferencesManager(this.module, this.appComingSoonRegistrationPersistenceProvider.get());
    }
}
