package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.p016pt.ads.MoPubAdsManager;
import p015cm.aptoide.p016pt.app.AppNavigator;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.home.more.appcoins.EarnAppcListAnalytics;
import p015cm.aptoide.p016pt.home.more.appcoins.EarnAppcListConfiguration;
import p015cm.aptoide.p016pt.home.more.appcoins.EarnAppcListManager;
import p015cm.aptoide.p016pt.home.more.appcoins.EarnAppcListPresenter;
import p015cm.aptoide.p016pt.home.more.appcoins.EarnAppcNavigator;
import p015cm.aptoide.p016pt.repository.request.RewardAppCoinsAppsRepository;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvideEarnAppCoinsListPresenterFactory */
public final class FragmentModule_ProvideEarnAppCoinsListPresenterFactory implements C10824b<EarnAppcListPresenter> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<AppNavigator> appNavigatorProvider;
    private final Provider<CrashReport> crashReportProvider;
    private final Provider<EarnAppcListAnalytics> earnAppcListAnalyticsProvider;
    private final Provider<EarnAppcListConfiguration> earnAppcListConfigurationProvider;
    private final Provider<EarnAppcListManager> earnAppcListManagerProvider;
    private final Provider<EarnAppcNavigator> earnAppcNavigatorProvider;
    private final Provider<MoPubAdsManager> moPubAdsManagerProvider;
    private final FragmentModule module;
    private final Provider<RewardAppCoinsAppsRepository> rewardAppCoinsAppsRepositoryProvider;

    public FragmentModule_ProvideEarnAppCoinsListPresenterFactory(FragmentModule fragmentModule, Provider<CrashReport> provider, Provider<RewardAppCoinsAppsRepository> provider2, Provider<AnalyticsManager> provider3, Provider<AppNavigator> provider4, Provider<EarnAppcListConfiguration> provider5, Provider<EarnAppcListManager> provider6, Provider<MoPubAdsManager> provider7, Provider<EarnAppcListAnalytics> provider8, Provider<EarnAppcNavigator> provider9) {
        this.module = fragmentModule;
        this.crashReportProvider = provider;
        this.rewardAppCoinsAppsRepositoryProvider = provider2;
        this.analyticsManagerProvider = provider3;
        this.appNavigatorProvider = provider4;
        this.earnAppcListConfigurationProvider = provider5;
        this.earnAppcListManagerProvider = provider6;
        this.moPubAdsManagerProvider = provider7;
        this.earnAppcListAnalyticsProvider = provider8;
        this.earnAppcNavigatorProvider = provider9;
    }

    public static FragmentModule_ProvideEarnAppCoinsListPresenterFactory create(FragmentModule fragmentModule, Provider<CrashReport> provider, Provider<RewardAppCoinsAppsRepository> provider2, Provider<AnalyticsManager> provider3, Provider<AppNavigator> provider4, Provider<EarnAppcListConfiguration> provider5, Provider<EarnAppcListManager> provider6, Provider<MoPubAdsManager> provider7, Provider<EarnAppcListAnalytics> provider8, Provider<EarnAppcNavigator> provider9) {
        return new FragmentModule_ProvideEarnAppCoinsListPresenterFactory(fragmentModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static EarnAppcListPresenter provideEarnAppCoinsListPresenter(FragmentModule fragmentModule, CrashReport crashReport, RewardAppCoinsAppsRepository rewardAppCoinsAppsRepository, AnalyticsManager analyticsManager, AppNavigator appNavigator, EarnAppcListConfiguration earnAppcListConfiguration, EarnAppcListManager earnAppcListManager, MoPubAdsManager moPubAdsManager, EarnAppcListAnalytics earnAppcListAnalytics, EarnAppcNavigator earnAppcNavigator) {
        EarnAppcListPresenter provideEarnAppCoinsListPresenter = fragmentModule.provideEarnAppCoinsListPresenter(crashReport, rewardAppCoinsAppsRepository, analyticsManager, appNavigator, earnAppcListConfiguration, earnAppcListManager, moPubAdsManager, earnAppcListAnalytics, earnAppcNavigator);
        C10825c.m36718a(provideEarnAppCoinsListPresenter, "Cannot return null from a non-@Nullable @Provides method");
        return provideEarnAppCoinsListPresenter;
    }

    public EarnAppcListPresenter get() {
        return provideEarnAppCoinsListPresenter(this.module, this.crashReportProvider.get(), this.rewardAppCoinsAppsRepositoryProvider.get(), this.analyticsManagerProvider.get(), this.appNavigatorProvider.get(), this.earnAppcListConfigurationProvider.get(), this.earnAppcListManagerProvider.get(), this.moPubAdsManagerProvider.get(), this.earnAppcListAnalyticsProvider.get(), this.earnAppcNavigatorProvider.get());
    }
}
