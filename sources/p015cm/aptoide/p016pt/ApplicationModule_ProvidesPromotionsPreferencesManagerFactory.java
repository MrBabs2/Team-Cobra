package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.appview.PreferencesPersister;
import p015cm.aptoide.p016pt.promotions.PromotionsPreferencesManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesPromotionsPreferencesManagerFactory */
public final class ApplicationModule_ProvidesPromotionsPreferencesManagerFactory implements C10824b<PromotionsPreferencesManager> {
    private final ApplicationModule module;
    private final Provider<PreferencesPersister> persisterProvider;

    public ApplicationModule_ProvidesPromotionsPreferencesManagerFactory(ApplicationModule applicationModule, Provider<PreferencesPersister> provider) {
        this.module = applicationModule;
        this.persisterProvider = provider;
    }

    public static ApplicationModule_ProvidesPromotionsPreferencesManagerFactory create(ApplicationModule applicationModule, Provider<PreferencesPersister> provider) {
        return new ApplicationModule_ProvidesPromotionsPreferencesManagerFactory(applicationModule, provider);
    }

    public static PromotionsPreferencesManager providesPromotionsPreferencesManager(ApplicationModule applicationModule, PreferencesPersister preferencesPersister) {
        PromotionsPreferencesManager providesPromotionsPreferencesManager = applicationModule.providesPromotionsPreferencesManager(preferencesPersister);
        C10825c.m36718a(providesPromotionsPreferencesManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesPromotionsPreferencesManager;
    }

    public PromotionsPreferencesManager get() {
        return providesPromotionsPreferencesManager(this.module, this.persisterProvider.get());
    }
}
