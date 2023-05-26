package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.account.view.AccountNavigator;
import p015cm.aptoide.p016pt.app.AppViewAnalytics;
import p015cm.aptoide.p016pt.app.AppViewManager;
import p015cm.aptoide.p016pt.app.CampaignAnalytics;
import p015cm.aptoide.p016pt.app.view.AppViewNavigator;
import p015cm.aptoide.p016pt.app.view.AppViewPresenter;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.promotions.PromotionsNavigator;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesAppViewPresenterFactory */
public final class FragmentModule_ProvidesAppViewPresenterFactory implements C10824b<AppViewPresenter> {
    private final Provider<AptoideAccountManager> accountManagerProvider;
    private final Provider<AccountNavigator> accountNavigatorProvider;
    private final Provider<AppViewAnalytics> analyticsProvider;
    private final Provider<AppViewManager> appViewManagerProvider;
    private final Provider<AppViewNavigator> appViewNavigatorProvider;
    private final Provider<CampaignAnalytics> campaignAnalyticsProvider;
    private final Provider<CrashReport> crashReportProvider;
    private final FragmentModule module;
    private final Provider<PromotionsNavigator> promotionsNavigatorProvider;

    public FragmentModule_ProvidesAppViewPresenterFactory(FragmentModule fragmentModule, Provider<AccountNavigator> provider, Provider<AppViewAnalytics> provider2, Provider<CampaignAnalytics> provider3, Provider<AppViewNavigator> provider4, Provider<AppViewManager> provider5, Provider<AptoideAccountManager> provider6, Provider<CrashReport> provider7, Provider<PromotionsNavigator> provider8) {
        this.module = fragmentModule;
        this.accountNavigatorProvider = provider;
        this.analyticsProvider = provider2;
        this.campaignAnalyticsProvider = provider3;
        this.appViewNavigatorProvider = provider4;
        this.appViewManagerProvider = provider5;
        this.accountManagerProvider = provider6;
        this.crashReportProvider = provider7;
        this.promotionsNavigatorProvider = provider8;
    }

    public static FragmentModule_ProvidesAppViewPresenterFactory create(FragmentModule fragmentModule, Provider<AccountNavigator> provider, Provider<AppViewAnalytics> provider2, Provider<CampaignAnalytics> provider3, Provider<AppViewNavigator> provider4, Provider<AppViewManager> provider5, Provider<AptoideAccountManager> provider6, Provider<CrashReport> provider7, Provider<PromotionsNavigator> provider8) {
        return new FragmentModule_ProvidesAppViewPresenterFactory(fragmentModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static AppViewPresenter providesAppViewPresenter(FragmentModule fragmentModule, AccountNavigator accountNavigator, AppViewAnalytics appViewAnalytics, CampaignAnalytics campaignAnalytics, AppViewNavigator appViewNavigator, AppViewManager appViewManager, AptoideAccountManager aptoideAccountManager, CrashReport crashReport, PromotionsNavigator promotionsNavigator) {
        AppViewPresenter providesAppViewPresenter = fragmentModule.providesAppViewPresenter(accountNavigator, appViewAnalytics, campaignAnalytics, appViewNavigator, appViewManager, aptoideAccountManager, crashReport, promotionsNavigator);
        C10825c.m36718a(providesAppViewPresenter, "Cannot return null from a non-@Nullable @Provides method");
        return providesAppViewPresenter;
    }

    public AppViewPresenter get() {
        return providesAppViewPresenter(this.module, this.accountNavigatorProvider.get(), this.analyticsProvider.get(), this.campaignAnalyticsProvider.get(), this.appViewNavigatorProvider.get(), this.appViewManagerProvider.get(), this.accountManagerProvider.get(), this.crashReportProvider.get(), this.promotionsNavigatorProvider.get());
    }
}
