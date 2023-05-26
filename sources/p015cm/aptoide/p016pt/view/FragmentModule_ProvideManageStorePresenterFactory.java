package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.account.AccountAnalytics;
import p015cm.aptoide.p016pt.account.view.UriToPathResolver;
import p015cm.aptoide.p016pt.account.view.store.ManageStoreErrorMapper;
import p015cm.aptoide.p016pt.account.view.store.ManageStoreNavigator;
import p015cm.aptoide.p016pt.account.view.store.ManageStorePresenter;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvideManageStorePresenterFactory */
public final class FragmentModule_ProvideManageStorePresenterFactory implements C10824b<ManageStorePresenter> {
    private final Provider<AccountAnalytics> accountAnalyticsProvider;
    private final Provider<AptoideAccountManager> accountManagerProvider;
    private final Provider<ManageStoreErrorMapper> manageStoreErrorMapperProvider;
    private final Provider<ManageStoreNavigator> manageStoreNavigatorProvider;
    private final FragmentModule module;
    private final Provider<UriToPathResolver> uriToPathResolverProvider;

    public FragmentModule_ProvideManageStorePresenterFactory(FragmentModule fragmentModule, Provider<UriToPathResolver> provider, Provider<ManageStoreNavigator> provider2, Provider<ManageStoreErrorMapper> provider3, Provider<AptoideAccountManager> provider4, Provider<AccountAnalytics> provider5) {
        this.module = fragmentModule;
        this.uriToPathResolverProvider = provider;
        this.manageStoreNavigatorProvider = provider2;
        this.manageStoreErrorMapperProvider = provider3;
        this.accountManagerProvider = provider4;
        this.accountAnalyticsProvider = provider5;
    }

    public static FragmentModule_ProvideManageStorePresenterFactory create(FragmentModule fragmentModule, Provider<UriToPathResolver> provider, Provider<ManageStoreNavigator> provider2, Provider<ManageStoreErrorMapper> provider3, Provider<AptoideAccountManager> provider4, Provider<AccountAnalytics> provider5) {
        return new FragmentModule_ProvideManageStorePresenterFactory(fragmentModule, provider, provider2, provider3, provider4, provider5);
    }

    public static ManageStorePresenter provideManageStorePresenter(FragmentModule fragmentModule, UriToPathResolver uriToPathResolver, ManageStoreNavigator manageStoreNavigator, ManageStoreErrorMapper manageStoreErrorMapper, AptoideAccountManager aptoideAccountManager, AccountAnalytics accountAnalytics) {
        ManageStorePresenter provideManageStorePresenter = fragmentModule.provideManageStorePresenter(uriToPathResolver, manageStoreNavigator, manageStoreErrorMapper, aptoideAccountManager, accountAnalytics);
        C10825c.m36718a(provideManageStorePresenter, "Cannot return null from a non-@Nullable @Provides method");
        return provideManageStorePresenter;
    }

    public ManageStorePresenter get() {
        return provideManageStorePresenter(this.module, this.uriToPathResolverProvider.get(), this.manageStoreNavigatorProvider.get(), this.manageStoreErrorMapperProvider.get(), this.accountManagerProvider.get(), this.accountAnalyticsProvider.get());
    }
}
