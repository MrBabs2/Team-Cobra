package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.preferences.LocalPersistenceAdultContent;
import p015cm.aptoide.p016pt.preferences.Preferences;
import p015cm.aptoide.p016pt.preferences.SecurePreferences;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.FlavourApplicationModule_ProvideLocalAdultContentFactory */
public final class FlavourApplicationModule_ProvideLocalAdultContentFactory implements C10824b<LocalPersistenceAdultContent> {
    private final FlavourApplicationModule module;
    private final Provider<Preferences> preferencesProvider;
    private final Provider<SecurePreferences> securePreferencesProvider;

    public FlavourApplicationModule_ProvideLocalAdultContentFactory(FlavourApplicationModule flavourApplicationModule, Provider<Preferences> provider, Provider<SecurePreferences> provider2) {
        this.module = flavourApplicationModule;
        this.preferencesProvider = provider;
        this.securePreferencesProvider = provider2;
    }

    public static FlavourApplicationModule_ProvideLocalAdultContentFactory create(FlavourApplicationModule flavourApplicationModule, Provider<Preferences> provider, Provider<SecurePreferences> provider2) {
        return new FlavourApplicationModule_ProvideLocalAdultContentFactory(flavourApplicationModule, provider, provider2);
    }

    public static LocalPersistenceAdultContent provideLocalAdultContent(FlavourApplicationModule flavourApplicationModule, Preferences preferences, SecurePreferences securePreferences) {
        LocalPersistenceAdultContent provideLocalAdultContent = flavourApplicationModule.provideLocalAdultContent(preferences, securePreferences);
        C10825c.m36718a(provideLocalAdultContent, "Cannot return null from a non-@Nullable @Provides method");
        return provideLocalAdultContent;
    }

    public LocalPersistenceAdultContent get() {
        return provideLocalAdultContent(this.module, this.preferencesProvider.get(), this.securePreferencesProvider.get());
    }
}
