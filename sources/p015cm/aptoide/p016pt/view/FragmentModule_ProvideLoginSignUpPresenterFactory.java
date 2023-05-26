package p015cm.aptoide.p016pt.view;

import java.util.List;
import javax.inject.Provider;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.account.AccountAnalytics;
import p015cm.aptoide.p016pt.account.view.AccountErrorMapper;
import p015cm.aptoide.p016pt.account.view.AccountNavigator;
import p015cm.aptoide.p016pt.account.view.LoginSignUpCredentialsConfiguration;
import p015cm.aptoide.p016pt.presenter.LoginSignupCredentialsFlavorPresenter;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvideLoginSignUpPresenterFactory */
public final class FragmentModule_ProvideLoginSignUpPresenterFactory implements C10824b<LoginSignupCredentialsFlavorPresenter> {
    private final Provider<AccountAnalytics> accountAnalyticsProvider;
    private final Provider<AptoideAccountManager> accountManagerProvider;
    private final Provider<AccountNavigator> accountNavigatorProvider;
    private final Provider<AccountErrorMapper> errorMapperProvider;
    private final Provider<List<String>> facebookPermissionsProvider;
    private final Provider<LoginSignUpCredentialsConfiguration> loginSignUpCredentialsConfigurationProvider;
    private final FragmentModule module;

    public FragmentModule_ProvideLoginSignUpPresenterFactory(FragmentModule fragmentModule, Provider<AptoideAccountManager> provider, Provider<AccountNavigator> provider2, Provider<AccountErrorMapper> provider3, Provider<AccountAnalytics> provider4, Provider<List<String>> provider5, Provider<LoginSignUpCredentialsConfiguration> provider6) {
        this.module = fragmentModule;
        this.accountManagerProvider = provider;
        this.accountNavigatorProvider = provider2;
        this.errorMapperProvider = provider3;
        this.accountAnalyticsProvider = provider4;
        this.facebookPermissionsProvider = provider5;
        this.loginSignUpCredentialsConfigurationProvider = provider6;
    }

    public static FragmentModule_ProvideLoginSignUpPresenterFactory create(FragmentModule fragmentModule, Provider<AptoideAccountManager> provider, Provider<AccountNavigator> provider2, Provider<AccountErrorMapper> provider3, Provider<AccountAnalytics> provider4, Provider<List<String>> provider5, Provider<LoginSignUpCredentialsConfiguration> provider6) {
        return new FragmentModule_ProvideLoginSignUpPresenterFactory(fragmentModule, provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static LoginSignupCredentialsFlavorPresenter provideLoginSignUpPresenter(FragmentModule fragmentModule, AptoideAccountManager aptoideAccountManager, AccountNavigator accountNavigator, AccountErrorMapper accountErrorMapper, AccountAnalytics accountAnalytics, List<String> list, LoginSignUpCredentialsConfiguration loginSignUpCredentialsConfiguration) {
        LoginSignupCredentialsFlavorPresenter provideLoginSignUpPresenter = fragmentModule.provideLoginSignUpPresenter(aptoideAccountManager, accountNavigator, accountErrorMapper, accountAnalytics, list, loginSignUpCredentialsConfiguration);
        C10825c.m36718a(provideLoginSignUpPresenter, "Cannot return null from a non-@Nullable @Provides method");
        return provideLoginSignUpPresenter;
    }

    public LoginSignupCredentialsFlavorPresenter get() {
        return provideLoginSignUpPresenter(this.module, this.accountManagerProvider.get(), this.accountNavigatorProvider.get(), this.errorMapperProvider.get(), this.accountAnalyticsProvider.get(), this.facebookPermissionsProvider.get(), this.loginSignUpCredentialsConfigurationProvider.get());
    }
}
