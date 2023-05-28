package p015cm.aptoide.p016pt.view;

import android.content.res.Resources;
import android.view.WindowManager;
import javax.inject.Provider;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.AppCoinsManager;
import p015cm.aptoide.p016pt.aab.DynamicSplitsManager;
import p015cm.aptoide.p016pt.ads.MoPubAdsManager;
import p015cm.aptoide.p016pt.app.AdsManager;
import p015cm.aptoide.p016pt.app.AppViewAnalytics;
import p015cm.aptoide.p016pt.app.AppViewManager;
import p015cm.aptoide.p016pt.app.AppViewModelManager;
import p015cm.aptoide.p016pt.app.DownloadStateParser;
import p015cm.aptoide.p016pt.app.FlagManager;
import p015cm.aptoide.p016pt.app.ReviewsManager;
import p015cm.aptoide.p016pt.app.appsflyer.AppsFlyerManager;
import p015cm.aptoide.p016pt.app.migration.AppcMigrationManager;
import p015cm.aptoide.p016pt.download.DownloadFactory;
import p015cm.aptoide.p016pt.download.SplitAnalyticsMapper;
import p015cm.aptoide.p016pt.install.InstallAnalytics;
import p015cm.aptoide.p016pt.install.InstallManager;
import p015cm.aptoide.p016pt.notification.AppcPromotionNotificationStringProvider;
import p015cm.aptoide.p016pt.notification.NotificationAnalytics;
import p015cm.aptoide.p016pt.notification.sync.LocalNotificationSyncManager;
import p015cm.aptoide.p016pt.promotions.PromotionsManager;
import p015cm.aptoide.p016pt.store.StoreUtilsProxy;
import p015cm.aptoide.p016pt.view.app.AppCenter;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesAppViewManagerFactory */
public final class FragmentModule_ProvidesAppViewManagerFactory implements C10824b<AppViewManager> {
    private final Provider<AdsManager> adsManagerProvider;
    private final Provider<AppCenter> appCenterProvider;
    private final Provider<AppCoinsManager> appCoinsManagerProvider;
    private final Provider<AppViewAnalytics> appViewAnalyticsProvider;
    private final Provider<AppViewModelManager> appViewModelManagerProvider;
    private final Provider<AppcMigrationManager> appcMigrationManagerProvider;
    private final Provider<AppcPromotionNotificationStringProvider> appcPromotionNotificationStringProvider;
    private final Provider<AppsFlyerManager> appsFlyerManagerProvider;
    private final Provider<AptoideAccountManager> aptoideAccountManagerProvider;
    private final Provider<DownloadFactory> downloadFactoryProvider;
    private final Provider<DownloadStateParser> downloadStateParserProvider;
    private final Provider<DynamicSplitsManager> dynamicSplitsManagerProvider;
    private final Provider<FlagManager> flagManagerProvider;
    private final Provider<InstallAnalytics> installAnalyticsProvider;
    private final Provider<InstallManager> installManagerProvider;
    private final Provider<LocalNotificationSyncManager> localNotificationSyncManagerProvider;
    private final Provider<String> marketNameProvider;
    private final Provider<MoPubAdsManager> moPubAdsManagerProvider;
    private final FragmentModule module;
    private final Provider<NotificationAnalytics> notificationAnalyticsProvider;
    private final Provider<PromotionsManager> promotionsManagerProvider;
    private final Provider<Resources> resourcesProvider;
    private final Provider<ReviewsManager> reviewsManagerProvider;
    private final Provider<SplitAnalyticsMapper> splitAnalyticsMapperProvider;
    private final Provider<StoreUtilsProxy> storeUtilsProxyProvider;
    private final Provider<WindowManager> windowManagerProvider;

    public FragmentModule_ProvidesAppViewManagerFactory(FragmentModule fragmentModule, Provider<AppViewModelManager> provider, Provider<InstallManager> provider2, Provider<DownloadFactory> provider3, Provider<AppCenter> provider4, Provider<ReviewsManager> provider5, Provider<AdsManager> provider6, Provider<FlagManager> provider7, Provider<StoreUtilsProxy> provider8, Provider<AptoideAccountManager> provider9, Provider<DownloadStateParser> provider10, Provider<AppViewAnalytics> provider11, Provider<NotificationAnalytics> provider12, Provider<InstallAnalytics> provider13, Provider<Resources> provider14, Provider<WindowManager> provider15, Provider<String> provider16, Provider<AppCoinsManager> provider17, Provider<MoPubAdsManager> provider18, Provider<PromotionsManager> provider19, Provider<AppcMigrationManager> provider20, Provider<LocalNotificationSyncManager> provider21, Provider<AppcPromotionNotificationStringProvider> provider22, Provider<DynamicSplitsManager> provider23, Provider<SplitAnalyticsMapper> provider24, Provider<AppsFlyerManager> provider25) {
        this.module = fragmentModule;
        this.appViewModelManagerProvider = provider;
        this.installManagerProvider = provider2;
        this.downloadFactoryProvider = provider3;
        this.appCenterProvider = provider4;
        this.reviewsManagerProvider = provider5;
        this.adsManagerProvider = provider6;
        this.flagManagerProvider = provider7;
        this.storeUtilsProxyProvider = provider8;
        this.aptoideAccountManagerProvider = provider9;
        this.downloadStateParserProvider = provider10;
        this.appViewAnalyticsProvider = provider11;
        this.notificationAnalyticsProvider = provider12;
        this.installAnalyticsProvider = provider13;
        this.resourcesProvider = provider14;
        this.windowManagerProvider = provider15;
        this.marketNameProvider = provider16;
        this.appCoinsManagerProvider = provider17;
        this.moPubAdsManagerProvider = provider18;
        this.promotionsManagerProvider = provider19;
        this.appcMigrationManagerProvider = provider20;
        this.localNotificationSyncManagerProvider = provider21;
        this.appcPromotionNotificationStringProvider = provider22;
        this.dynamicSplitsManagerProvider = provider23;
        this.splitAnalyticsMapperProvider = provider24;
        this.appsFlyerManagerProvider = provider25;
    }

    public static FragmentModule_ProvidesAppViewManagerFactory create(FragmentModule fragmentModule, Provider<AppViewModelManager> provider, Provider<InstallManager> provider2, Provider<DownloadFactory> provider3, Provider<AppCenter> provider4, Provider<ReviewsManager> provider5, Provider<AdsManager> provider6, Provider<FlagManager> provider7, Provider<StoreUtilsProxy> provider8, Provider<AptoideAccountManager> provider9, Provider<DownloadStateParser> provider10, Provider<AppViewAnalytics> provider11, Provider<NotificationAnalytics> provider12, Provider<InstallAnalytics> provider13, Provider<Resources> provider14, Provider<WindowManager> provider15, Provider<String> provider16, Provider<AppCoinsManager> provider17, Provider<MoPubAdsManager> provider18, Provider<PromotionsManager> provider19, Provider<AppcMigrationManager> provider20, Provider<LocalNotificationSyncManager> provider21, Provider<AppcPromotionNotificationStringProvider> provider22, Provider<DynamicSplitsManager> provider23, Provider<SplitAnalyticsMapper> provider24, Provider<AppsFlyerManager> provider25) {
        return new FragmentModule_ProvidesAppViewManagerFactory(fragmentModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22, provider23, provider24, provider25);
    }

    public static AppViewManager providesAppViewManager(FragmentModule fragmentModule, AppViewModelManager appViewModelManager, InstallManager installManager, DownloadFactory downloadFactory, AppCenter appCenter, ReviewsManager reviewsManager, AdsManager adsManager, FlagManager flagManager, StoreUtilsProxy storeUtilsProxy, AptoideAccountManager aptoideAccountManager, DownloadStateParser downloadStateParser, AppViewAnalytics appViewAnalytics, NotificationAnalytics notificationAnalytics, InstallAnalytics installAnalytics, Resources resources, WindowManager windowManager, String str, AppCoinsManager appCoinsManager, MoPubAdsManager moPubAdsManager, PromotionsManager promotionsManager, AppcMigrationManager appcMigrationManager, LocalNotificationSyncManager localNotificationSyncManager, AppcPromotionNotificationStringProvider appcPromotionNotificationStringProvider2, DynamicSplitsManager dynamicSplitsManager, SplitAnalyticsMapper splitAnalyticsMapper, AppsFlyerManager appsFlyerManager) {
        AppViewManager providesAppViewManager = fragmentModule.providesAppViewManager(appViewModelManager, installManager, downloadFactory, appCenter, reviewsManager, adsManager, flagManager, storeUtilsProxy, aptoideAccountManager, downloadStateParser, appViewAnalytics, notificationAnalytics, installAnalytics, resources, windowManager, str, appCoinsManager, moPubAdsManager, promotionsManager, appcMigrationManager, localNotificationSyncManager, appcPromotionNotificationStringProvider2, dynamicSplitsManager, splitAnalyticsMapper, appsFlyerManager);
        C10825c.m36718a(providesAppViewManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesAppViewManager;
    }

    public AppViewManager get() {
        return providesAppViewManager(this.module, this.appViewModelManagerProvider.get(), this.installManagerProvider.get(), this.downloadFactoryProvider.get(), this.appCenterProvider.get(), this.reviewsManagerProvider.get(), this.adsManagerProvider.get(), this.flagManagerProvider.get(), this.storeUtilsProxyProvider.get(), this.aptoideAccountManagerProvider.get(), this.downloadStateParserProvider.get(), this.appViewAnalyticsProvider.get(), this.notificationAnalyticsProvider.get(), this.installAnalyticsProvider.get(), this.resourcesProvider.get(), this.windowManagerProvider.get(), this.marketNameProvider.get(), this.appCoinsManagerProvider.get(), this.moPubAdsManagerProvider.get(), this.promotionsManagerProvider.get(), this.appcMigrationManagerProvider.get(), this.localNotificationSyncManagerProvider.get(), this.appcPromotionNotificationStringProvider.get(), this.dynamicSplitsManagerProvider.get(), this.splitAnalyticsMapperProvider.get(), this.appsFlyerManagerProvider.get());
    }
}
