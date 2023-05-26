package p015cm.aptoide.p016pt;

import p015cm.aptoide.p016pt.account.OAuthModeProvider;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideOAuthModeProviderFactory */
public final class ApplicationModule_ProvideOAuthModeProviderFactory implements C10824b<OAuthModeProvider> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideOAuthModeProviderFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideOAuthModeProviderFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideOAuthModeProviderFactory(applicationModule);
    }

    public static OAuthModeProvider provideOAuthModeProvider(ApplicationModule applicationModule) {
        OAuthModeProvider provideOAuthModeProvider = applicationModule.provideOAuthModeProvider();
        C10825c.m36718a(provideOAuthModeProvider, "Cannot return null from a non-@Nullable @Provides method");
        return provideOAuthModeProvider;
    }

    public OAuthModeProvider get() {
        return provideOAuthModeProvider(this.module);
    }
}
