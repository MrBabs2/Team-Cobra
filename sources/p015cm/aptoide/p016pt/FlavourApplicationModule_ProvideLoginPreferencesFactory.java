package p015cm.aptoide.p016pt;

import p015cm.aptoide.p016pt.account.LoginPreferences;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.FlavourApplicationModule_ProvideLoginPreferencesFactory */
public final class FlavourApplicationModule_ProvideLoginPreferencesFactory implements C10824b<LoginPreferences> {
    private final FlavourApplicationModule module;

    public FlavourApplicationModule_ProvideLoginPreferencesFactory(FlavourApplicationModule flavourApplicationModule) {
        this.module = flavourApplicationModule;
    }

    public static FlavourApplicationModule_ProvideLoginPreferencesFactory create(FlavourApplicationModule flavourApplicationModule) {
        return new FlavourApplicationModule_ProvideLoginPreferencesFactory(flavourApplicationModule);
    }

    public static LoginPreferences provideLoginPreferences(FlavourApplicationModule flavourApplicationModule) {
        LoginPreferences provideLoginPreferences = flavourApplicationModule.provideLoginPreferences();
        C10825c.m36718a(provideLoginPreferences, "Cannot return null from a non-@Nullable @Provides method");
        return provideLoginPreferences;
    }

    public LoginPreferences get() {
        return provideLoginPreferences(this.module);
    }
}
