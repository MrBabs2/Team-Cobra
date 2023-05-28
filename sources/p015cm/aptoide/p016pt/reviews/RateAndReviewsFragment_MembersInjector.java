package p015cm.aptoide.p016pt.reviews;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.UserFeedbackAnalytics;
import p015cm.aptoide.p016pt.app.AppNavigator;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilityManager;
import p015cm.aptoide.p016pt.install.AptoideInstalledAppsRepository;
import p015cm.aptoide.p016pt.store.StoreCredentialsProvider;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.util.MarketResourceFormatter;
import p015cm.aptoide.p016pt.view.dialog.DialogUtils;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.reviews.RateAndReviewsFragment_MembersInjector */
public final class RateAndReviewsFragment_MembersInjector implements C10822a<RateAndReviewsFragment> {
    private final Provider<AppBundlesVisibilityManager> appBundlesVisibilityManagerProvider;
    private final Provider<AppNavigator> appNavigatorProvider;
    private final Provider<AptoideInstalledAppsRepository> aptoideInstalledAppsRepositoryProvider;
    private final Provider<DialogUtils> dialogUtilsProvider;
    private final Provider<String> marketNameProvider;
    private final Provider<MarketResourceFormatter> marketResourceFormatterProvider;
    private final Provider<StoreCredentialsProvider> storeCredentialsProvider;
    private final Provider<ThemeManager> themeManagerProvider;
    private final Provider<UserFeedbackAnalytics> userFeedbackAnalyticsProvider;

    public RateAndReviewsFragment_MembersInjector(Provider<AppBundlesVisibilityManager> provider, Provider<AppNavigator> provider2, Provider<String> provider3, Provider<MarketResourceFormatter> provider4, Provider<ThemeManager> provider5, Provider<DialogUtils> provider6, Provider<AptoideInstalledAppsRepository> provider7, Provider<StoreCredentialsProvider> provider8, Provider<UserFeedbackAnalytics> provider9) {
        this.appBundlesVisibilityManagerProvider = provider;
        this.appNavigatorProvider = provider2;
        this.marketNameProvider = provider3;
        this.marketResourceFormatterProvider = provider4;
        this.themeManagerProvider = provider5;
        this.dialogUtilsProvider = provider6;
        this.aptoideInstalledAppsRepositoryProvider = provider7;
        this.storeCredentialsProvider = provider8;
        this.userFeedbackAnalyticsProvider = provider9;
    }

    public static C10822a<RateAndReviewsFragment> create(Provider<AppBundlesVisibilityManager> provider, Provider<AppNavigator> provider2, Provider<String> provider3, Provider<MarketResourceFormatter> provider4, Provider<ThemeManager> provider5, Provider<DialogUtils> provider6, Provider<AptoideInstalledAppsRepository> provider7, Provider<StoreCredentialsProvider> provider8, Provider<UserFeedbackAnalytics> provider9) {
        return new RateAndReviewsFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static void injectAppBundlesVisibilityManager(RateAndReviewsFragment rateAndReviewsFragment, AppBundlesVisibilityManager appBundlesVisibilityManager) {
        rateAndReviewsFragment.appBundlesVisibilityManager = appBundlesVisibilityManager;
    }

    public static void injectAppNavigator(RateAndReviewsFragment rateAndReviewsFragment, AppNavigator appNavigator) {
        rateAndReviewsFragment.appNavigator = appNavigator;
    }

    public static void injectAptoideInstalledAppsRepository(RateAndReviewsFragment rateAndReviewsFragment, AptoideInstalledAppsRepository aptoideInstalledAppsRepository) {
        rateAndReviewsFragment.aptoideInstalledAppsRepository = aptoideInstalledAppsRepository;
    }

    public static void injectDialogUtils(RateAndReviewsFragment rateAndReviewsFragment, DialogUtils dialogUtils) {
        rateAndReviewsFragment.dialogUtils = dialogUtils;
    }

    public static void injectMarketName(RateAndReviewsFragment rateAndReviewsFragment, String str) {
        rateAndReviewsFragment.marketName = str;
    }

    public static void injectMarketResourceFormatter(RateAndReviewsFragment rateAndReviewsFragment, MarketResourceFormatter marketResourceFormatter) {
        rateAndReviewsFragment.marketResourceFormatter = marketResourceFormatter;
    }

    public static void injectStoreCredentialsProvider(RateAndReviewsFragment rateAndReviewsFragment, StoreCredentialsProvider storeCredentialsProvider2) {
        rateAndReviewsFragment.storeCredentialsProvider = storeCredentialsProvider2;
    }

    public static void injectThemeManager(RateAndReviewsFragment rateAndReviewsFragment, ThemeManager themeManager) {
        rateAndReviewsFragment.themeManager = themeManager;
    }

    public static void injectUserFeedbackAnalytics(RateAndReviewsFragment rateAndReviewsFragment, UserFeedbackAnalytics userFeedbackAnalytics) {
        rateAndReviewsFragment.userFeedbackAnalytics = userFeedbackAnalytics;
    }

    public void injectMembers(RateAndReviewsFragment rateAndReviewsFragment) {
        injectAppBundlesVisibilityManager(rateAndReviewsFragment, this.appBundlesVisibilityManagerProvider.get());
        injectAppNavigator(rateAndReviewsFragment, this.appNavigatorProvider.get());
        injectMarketName(rateAndReviewsFragment, this.marketNameProvider.get());
        injectMarketResourceFormatter(rateAndReviewsFragment, this.marketResourceFormatterProvider.get());
        injectThemeManager(rateAndReviewsFragment, this.themeManagerProvider.get());
        injectDialogUtils(rateAndReviewsFragment, this.dialogUtilsProvider.get());
        injectAptoideInstalledAppsRepository(rateAndReviewsFragment, this.aptoideInstalledAppsRepositoryProvider.get());
        injectStoreCredentialsProvider(rateAndReviewsFragment, this.storeCredentialsProvider.get());
        injectUserFeedbackAnalytics(rateAndReviewsFragment, this.userFeedbackAnalyticsProvider.get());
    }
}
