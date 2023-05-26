package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideInvalidRefreshTokenLogoutManagerFactory */
public final class ApplicationModule_ProvideInvalidRefreshTokenLogoutManagerFactory implements C10824b<InvalidRefreshTokenLogoutManager> {
    private final Provider<AptoideAccountManager> aptoideAccountManagerProvider;
    private final ApplicationModule module;
    private final Provider<TokenInvalidator> refreshTokenInvalidatorProvider;

    public ApplicationModule_ProvideInvalidRefreshTokenLogoutManagerFactory(ApplicationModule applicationModule, Provider<AptoideAccountManager> provider, Provider<TokenInvalidator> provider2) {
        this.module = applicationModule;
        this.aptoideAccountManagerProvider = provider;
        this.refreshTokenInvalidatorProvider = provider2;
    }

    public static ApplicationModule_ProvideInvalidRefreshTokenLogoutManagerFactory create(ApplicationModule applicationModule, Provider<AptoideAccountManager> provider, Provider<TokenInvalidator> provider2) {
        return new ApplicationModule_ProvideInvalidRefreshTokenLogoutManagerFactory(applicationModule, provider, provider2);
    }

    public static InvalidRefreshTokenLogoutManager provideInvalidRefreshTokenLogoutManager(ApplicationModule applicationModule, AptoideAccountManager aptoideAccountManager, TokenInvalidator tokenInvalidator) {
        InvalidRefreshTokenLogoutManager provideInvalidRefreshTokenLogoutManager = applicationModule.provideInvalidRefreshTokenLogoutManager(aptoideAccountManager, tokenInvalidator);
        C10825c.m36718a(provideInvalidRefreshTokenLogoutManager, "Cannot return null from a non-@Nullable @Provides method");
        return provideInvalidRefreshTokenLogoutManager;
    }

    public InvalidRefreshTokenLogoutManager get() {
        return provideInvalidRefreshTokenLogoutManager(this.module, this.aptoideAccountManagerProvider.get(), this.refreshTokenInvalidatorProvider.get());
    }
}
