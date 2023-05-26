package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.account.AndroidAccountProvider;
import p015cm.aptoide.p016pt.networking.AuthenticationPersistence;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideAuthenticationPersistenceFactory */
public final class ApplicationModule_ProvideAuthenticationPersistenceFactory implements C10824b<AuthenticationPersistence> {
    private final Provider<AndroidAccountProvider> androidAccountProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvideAuthenticationPersistenceFactory(ApplicationModule applicationModule, Provider<AndroidAccountProvider> provider) {
        this.module = applicationModule;
        this.androidAccountProvider = provider;
    }

    public static ApplicationModule_ProvideAuthenticationPersistenceFactory create(ApplicationModule applicationModule, Provider<AndroidAccountProvider> provider) {
        return new ApplicationModule_ProvideAuthenticationPersistenceFactory(applicationModule, provider);
    }

    public static AuthenticationPersistence provideAuthenticationPersistence(ApplicationModule applicationModule, AndroidAccountProvider androidAccountProvider2) {
        AuthenticationPersistence provideAuthenticationPersistence = applicationModule.provideAuthenticationPersistence(androidAccountProvider2);
        C10825c.m36718a(provideAuthenticationPersistence, "Cannot return null from a non-@Nullable @Provides method");
        return provideAuthenticationPersistence;
    }

    public AuthenticationPersistence get() {
        return provideAuthenticationPersistence(this.module, this.androidAccountProvider.get());
    }
}
