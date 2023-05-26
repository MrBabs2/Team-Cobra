package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.appview.PreferencesPersister;
import p015cm.aptoide.p016pt.home.EskillsPreferencesManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesEskillPreferencesManagerFactory */
public final class ApplicationModule_ProvidesEskillPreferencesManagerFactory implements C10824b<EskillsPreferencesManager> {
    private final ApplicationModule module;
    private final Provider<PreferencesPersister> persisterProvider;

    public ApplicationModule_ProvidesEskillPreferencesManagerFactory(ApplicationModule applicationModule, Provider<PreferencesPersister> provider) {
        this.module = applicationModule;
        this.persisterProvider = provider;
    }

    public static ApplicationModule_ProvidesEskillPreferencesManagerFactory create(ApplicationModule applicationModule, Provider<PreferencesPersister> provider) {
        return new ApplicationModule_ProvidesEskillPreferencesManagerFactory(applicationModule, provider);
    }

    public static EskillsPreferencesManager providesEskillPreferencesManager(ApplicationModule applicationModule, PreferencesPersister preferencesPersister) {
        EskillsPreferencesManager providesEskillPreferencesManager = applicationModule.providesEskillPreferencesManager(preferencesPersister);
        C10825c.m36718a(providesEskillPreferencesManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesEskillPreferencesManager;
    }

    public EskillsPreferencesManager get() {
        return providesEskillPreferencesManager(this.module, this.persisterProvider.get());
    }
}
