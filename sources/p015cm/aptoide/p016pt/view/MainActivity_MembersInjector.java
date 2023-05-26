package p015cm.aptoide.p016pt.view;

import android.content.res.Resources;
import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.p016pt.account.view.AccountNavigator;
import p015cm.aptoide.p016pt.analytics.FirstLaunchAnalytics;
import p015cm.aptoide.p016pt.analytics.view.AnalyticsActivity_MembersInjector;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationActivity_MembersInjector;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationMapper;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationNavigator;
import p015cm.aptoide.p016pt.navigator.ActivityResultNavigator_MembersInjector;
import p015cm.aptoide.p016pt.presenter.Presenter;
import p015cm.aptoide.p016pt.themes.ThemeAnalytics;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.util.MarketResourceFormatter;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.view.MainActivity_MembersInjector */
public final class MainActivity_MembersInjector implements C10822a<MainActivity> {
    private final Provider<AccountNavigator> accountNavigatorProvider;
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<BottomNavigationMapper> bottomNavigationMapperProvider;
    private final Provider<BottomNavigationNavigator> bottomNavigationNavigatorProvider;
    private final Provider<DeepLinkManager> deepLinkManagerProvider;
    private final Provider<FirstLaunchAnalytics> firstLaunchAnalyticsProvider;
    private final Provider<String> marketNameProvider;
    private final Provider<MarketResourceFormatter> marketResourceFormatterProvider;
    private final Provider<Presenter> presenterProvider;
    private final Provider<Resources> resourcesProvider;
    private final Provider<ThemeAnalytics> themeAnalyticsProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public MainActivity_MembersInjector(Provider<ThemeManager> provider, Provider<AccountNavigator> provider2, Provider<String> provider3, Provider<AnalyticsManager> provider4, Provider<FirstLaunchAnalytics> provider5, Provider<BottomNavigationMapper> provider6, Provider<BottomNavigationNavigator> provider7, Provider<Presenter> provider8, Provider<Resources> provider9, Provider<MarketResourceFormatter> provider10, Provider<ThemeAnalytics> provider11, Provider<DeepLinkManager> provider12) {
        this.themeManagerProvider = provider;
        this.accountNavigatorProvider = provider2;
        this.marketNameProvider = provider3;
        this.analyticsManagerProvider = provider4;
        this.firstLaunchAnalyticsProvider = provider5;
        this.bottomNavigationMapperProvider = provider6;
        this.bottomNavigationNavigatorProvider = provider7;
        this.presenterProvider = provider8;
        this.resourcesProvider = provider9;
        this.marketResourceFormatterProvider = provider10;
        this.themeAnalyticsProvider = provider11;
        this.deepLinkManagerProvider = provider12;
    }

    public static C10822a<MainActivity> create(Provider<ThemeManager> provider, Provider<AccountNavigator> provider2, Provider<String> provider3, Provider<AnalyticsManager> provider4, Provider<FirstLaunchAnalytics> provider5, Provider<BottomNavigationMapper> provider6, Provider<BottomNavigationNavigator> provider7, Provider<Presenter> provider8, Provider<Resources> provider9, Provider<MarketResourceFormatter> provider10, Provider<ThemeAnalytics> provider11, Provider<DeepLinkManager> provider12) {
        return new MainActivity_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    public static void injectDeepLinkManager(MainActivity mainActivity, DeepLinkManager deepLinkManager) {
        mainActivity.deepLinkManager = deepLinkManager;
    }

    public static void injectMarketResourceFormatter(MainActivity mainActivity, MarketResourceFormatter marketResourceFormatter) {
        mainActivity.marketResourceFormatter = marketResourceFormatter;
    }

    public static void injectPresenter(MainActivity mainActivity, Presenter presenter) {
        mainActivity.presenter = presenter;
    }

    public static void injectResources(MainActivity mainActivity, Resources resources) {
        mainActivity.resources = resources;
    }

    public static void injectThemeAnalytics(MainActivity mainActivity, ThemeAnalytics themeAnalytics) {
        mainActivity.themeAnalytics = themeAnalytics;
    }

    public void injectMembers(MainActivity mainActivity) {
        ActivityResultNavigator_MembersInjector.injectThemeManager(mainActivity, this.themeManagerProvider.get());
        ActivityResultNavigator_MembersInjector.injectAccountNavigator(mainActivity, this.accountNavigatorProvider.get());
        ActivityResultNavigator_MembersInjector.injectMarketName(mainActivity, this.marketNameProvider.get());
        AnalyticsActivity_MembersInjector.injectAnalyticsManager(mainActivity, this.analyticsManagerProvider.get());
        AnalyticsActivity_MembersInjector.injectFirstLaunchAnalytics(mainActivity, this.firstLaunchAnalyticsProvider.get());
        ThemedActivityView_MembersInjector.injectThemeManager(mainActivity, this.themeManagerProvider.get());
        BottomNavigationActivity_MembersInjector.injectBottomNavigationMapper(mainActivity, this.bottomNavigationMapperProvider.get());
        BottomNavigationActivity_MembersInjector.injectBottomNavigationNavigator(mainActivity, this.bottomNavigationNavigatorProvider.get());
        injectPresenter(mainActivity, this.presenterProvider.get());
        injectResources(mainActivity, this.resourcesProvider.get());
        injectMarketResourceFormatter(mainActivity, this.marketResourceFormatterProvider.get());
        injectThemeAnalytics(mainActivity, this.themeAnalyticsProvider.get());
        injectDeepLinkManager(mainActivity, this.deepLinkManagerProvider.get());
    }
}
