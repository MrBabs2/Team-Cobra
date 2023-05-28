package p015cm.aptoide.p016pt.bottomNavigation;

import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.p016pt.account.view.AccountNavigator;
import p015cm.aptoide.p016pt.analytics.FirstLaunchAnalytics;
import p015cm.aptoide.p016pt.analytics.view.AnalyticsActivity_MembersInjector;
import p015cm.aptoide.p016pt.navigator.ActivityResultNavigator_MembersInjector;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.view.ThemedActivityView_MembersInjector;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.bottomNavigation.BottomNavigationActivity_MembersInjector */
public final class BottomNavigationActivity_MembersInjector implements C10822a<BottomNavigationActivity> {
    private final Provider<AccountNavigator> accountNavigatorProvider;
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<BottomNavigationMapper> bottomNavigationMapperProvider;
    private final Provider<BottomNavigationNavigator> bottomNavigationNavigatorProvider;
    private final Provider<FirstLaunchAnalytics> firstLaunchAnalyticsProvider;
    private final Provider<String> marketNameProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public BottomNavigationActivity_MembersInjector(Provider<ThemeManager> provider, Provider<AccountNavigator> provider2, Provider<String> provider3, Provider<AnalyticsManager> provider4, Provider<FirstLaunchAnalytics> provider5, Provider<BottomNavigationMapper> provider6, Provider<BottomNavigationNavigator> provider7) {
        this.themeManagerProvider = provider;
        this.accountNavigatorProvider = provider2;
        this.marketNameProvider = provider3;
        this.analyticsManagerProvider = provider4;
        this.firstLaunchAnalyticsProvider = provider5;
        this.bottomNavigationMapperProvider = provider6;
        this.bottomNavigationNavigatorProvider = provider7;
    }

    public static C10822a<BottomNavigationActivity> create(Provider<ThemeManager> provider, Provider<AccountNavigator> provider2, Provider<String> provider3, Provider<AnalyticsManager> provider4, Provider<FirstLaunchAnalytics> provider5, Provider<BottomNavigationMapper> provider6, Provider<BottomNavigationNavigator> provider7) {
        return new BottomNavigationActivity_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static void injectBottomNavigationMapper(BottomNavigationActivity bottomNavigationActivity, BottomNavigationMapper bottomNavigationMapper) {
        bottomNavigationActivity.bottomNavigationMapper = bottomNavigationMapper;
    }

    public static void injectBottomNavigationNavigator(BottomNavigationActivity bottomNavigationActivity, BottomNavigationNavigator bottomNavigationNavigator) {
        bottomNavigationActivity.bottomNavigationNavigator = bottomNavigationNavigator;
    }

    public void injectMembers(BottomNavigationActivity bottomNavigationActivity) {
        ActivityResultNavigator_MembersInjector.injectThemeManager(bottomNavigationActivity, this.themeManagerProvider.get());
        ActivityResultNavigator_MembersInjector.injectAccountNavigator(bottomNavigationActivity, this.accountNavigatorProvider.get());
        ActivityResultNavigator_MembersInjector.injectMarketName(bottomNavigationActivity, this.marketNameProvider.get());
        AnalyticsActivity_MembersInjector.injectAnalyticsManager(bottomNavigationActivity, this.analyticsManagerProvider.get());
        AnalyticsActivity_MembersInjector.injectFirstLaunchAnalytics(bottomNavigationActivity, this.firstLaunchAnalyticsProvider.get());
        ThemedActivityView_MembersInjector.injectThemeManager(bottomNavigationActivity, this.themeManagerProvider.get());
        injectBottomNavigationMapper(bottomNavigationActivity, this.bottomNavigationMapperProvider.get());
        injectBottomNavigationNavigator(bottomNavigationActivity, this.bottomNavigationNavigatorProvider.get());
    }
}
