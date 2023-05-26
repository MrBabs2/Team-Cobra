package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.account.AccountAnalytics;
import p015cm.aptoide.p016pt.account.view.UriToPathResolver;
import p015cm.aptoide.p016pt.account.view.user.CreateUserErrorMapper;
import p015cm.aptoide.p016pt.account.view.user.ManageUserNavigator;
import p015cm.aptoide.p016pt.account.view.user.ManageUserPresenter;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvideManageUserPresenterFactory */
public final class FragmentModule_ProvideManageUserPresenterFactory implements C10824b<ManageUserPresenter> {
    private final Provider<AccountAnalytics> accountAnalyticsProvider;
    private final Provider<AptoideAccountManager> accountManagerProvider;
    private final Provider<CreateUserErrorMapper> errorMapperProvider;
    private final Provider<ManageUserNavigator> manageUserNavigatorProvider;
    private final FragmentModule module;
    private final Provider<UriToPathResolver> uriToPathResolverProvider;

    public FragmentModule_ProvideManageUserPresenterFactory(FragmentModule fragmentModule, Provider<AptoideAccountManager> provider, Provider<CreateUserErrorMapper> provider2, Provider<ManageUserNavigator> provider3, Provider<UriToPathResolver> provider4, Provider<AccountAnalytics> provider5) {
        this.module = fragmentModule;
        this.accountManagerProvider = provider;
        this.errorMapperProvider = provider2;
        this.manageUserNavigatorProvider = provider3;
        this.uriToPathResolverProvider = provider4;
        this.accountAnalyticsProvider = provider5;
    }

    public static FragmentModule_ProvideManageUserPresenterFactory create(FragmentModule fragmentModule, Provider<AptoideAccountManager> provider, Provider<CreateUserErrorMapper> provider2, Provider<ManageUserNavigator> provider3, Provider<UriToPathResolver> provider4, Provider<AccountAnalytics> provider5) {
        return new FragmentModule_ProvideManageUserPresenterFactory(fragmentModule, provider, provider2, provider3, provider4, provider5);
    }

    public static ManageUserPresenter provideManageUserPresenter(FragmentModule fragmentModule, AptoideAccountManager aptoideAccountManager, CreateUserErrorMapper createUserErrorMapper, ManageUserNavigator manageUserNavigator, UriToPathResolver uriToPathResolver, AccountAnalytics accountAnalytics) {
        ManageUserPresenter provideManageUserPresenter = fragmentModule.provideManageUserPresenter(aptoideAccountManager, createUserErrorMapper, manageUserNavigator, uriToPathResolver, accountAnalytics);
        C10825c.m36718a(provideManageUserPresenter, "Cannot return null from a non-@Nullable @Provides method");
        return provideManageUserPresenter;
    }

    public ManageUserPresenter get() {
        return provideManageUserPresenter(this.module, this.accountManagerProvider.get(), this.errorMapperProvider.get(), this.manageUserNavigatorProvider.get(), this.uriToPathResolverProvider.get(), this.accountAnalyticsProvider.get());
    }
}
