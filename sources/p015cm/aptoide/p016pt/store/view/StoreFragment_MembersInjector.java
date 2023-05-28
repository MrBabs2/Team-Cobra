package p015cm.aptoide.p016pt.store.view;

import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.app.AppNavigator;
import p015cm.aptoide.p016pt.store.RoomStoreRepository;
import p015cm.aptoide.p016pt.store.StoreCredentialsProvider;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.util.MarketResourceFormatter;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.store.view.StoreFragment_MembersInjector */
public final class StoreFragment_MembersInjector implements C10822a<StoreFragment> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<AppNavigator> appNavigatorProvider;
    private final Provider<String> marketNameProvider;
    private final Provider<MarketResourceFormatter> marketResourceFormatterProvider;
    private final Provider<NavigationTracker> navigationTrackerProvider;
    private final Provider<StoreCredentialsProvider> storeCredentialsProvider;
    private final Provider<RoomStoreRepository> storeRepositoryProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public StoreFragment_MembersInjector(Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2, Provider<AppNavigator> provider3, Provider<String> provider4, Provider<ThemeManager> provider5, Provider<MarketResourceFormatter> provider6, Provider<StoreCredentialsProvider> provider7, Provider<RoomStoreRepository> provider8) {
        this.analyticsManagerProvider = provider;
        this.navigationTrackerProvider = provider2;
        this.appNavigatorProvider = provider3;
        this.marketNameProvider = provider4;
        this.themeManagerProvider = provider5;
        this.marketResourceFormatterProvider = provider6;
        this.storeCredentialsProvider = provider7;
        this.storeRepositoryProvider = provider8;
    }

    public static C10822a<StoreFragment> create(Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2, Provider<AppNavigator> provider3, Provider<String> provider4, Provider<ThemeManager> provider5, Provider<MarketResourceFormatter> provider6, Provider<StoreCredentialsProvider> provider7, Provider<RoomStoreRepository> provider8) {
        return new StoreFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static void injectAnalyticsManager(StoreFragment storeFragment, AnalyticsManager analyticsManager) {
        storeFragment.analyticsManager = analyticsManager;
    }

    public static void injectAppNavigator(StoreFragment storeFragment, AppNavigator appNavigator) {
        storeFragment.appNavigator = appNavigator;
    }

    public static void injectMarketName(StoreFragment storeFragment, String str) {
        storeFragment.marketName = str;
    }

    public static void injectMarketResourceFormatter(StoreFragment storeFragment, MarketResourceFormatter marketResourceFormatter) {
        storeFragment.marketResourceFormatter = marketResourceFormatter;
    }

    public static void injectNavigationTracker(StoreFragment storeFragment, NavigationTracker navigationTracker) {
        storeFragment.navigationTracker = navigationTracker;
    }

    public static void injectStoreCredentialsProvider(StoreFragment storeFragment, StoreCredentialsProvider storeCredentialsProvider2) {
        storeFragment.storeCredentialsProvider = storeCredentialsProvider2;
    }

    public static void injectStoreRepository(StoreFragment storeFragment, RoomStoreRepository roomStoreRepository) {
        storeFragment.storeRepository = roomStoreRepository;
    }

    public static void injectThemeManager(StoreFragment storeFragment, ThemeManager themeManager) {
        storeFragment.themeManager = themeManager;
    }

    public void injectMembers(StoreFragment storeFragment) {
        injectAnalyticsManager(storeFragment, this.analyticsManagerProvider.get());
        injectNavigationTracker(storeFragment, this.navigationTrackerProvider.get());
        injectAppNavigator(storeFragment, this.appNavigatorProvider.get());
        injectMarketName(storeFragment, this.marketNameProvider.get());
        injectThemeManager(storeFragment, this.themeManagerProvider.get());
        injectMarketResourceFormatter(storeFragment, this.marketResourceFormatterProvider.get());
        injectStoreCredentialsProvider(storeFragment, this.storeCredentialsProvider.get());
        injectStoreRepository(storeFragment, this.storeRepositoryProvider.get());
    }
}
