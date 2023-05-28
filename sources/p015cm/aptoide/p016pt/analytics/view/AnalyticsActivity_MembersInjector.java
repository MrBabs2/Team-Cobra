package p015cm.aptoide.p016pt.analytics.view;

import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.p016pt.account.view.AccountNavigator;
import p015cm.aptoide.p016pt.analytics.FirstLaunchAnalytics;
import p015cm.aptoide.p016pt.navigator.ActivityResultNavigator_MembersInjector;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.analytics.view.AnalyticsActivity_MembersInjector */
public final class AnalyticsActivity_MembersInjector implements C10822a<AnalyticsActivity> {
    private final Provider<AccountNavigator> accountNavigatorProvider;
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<FirstLaunchAnalytics> firstLaunchAnalyticsProvider;
    private final Provider<String> marketNameProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public AnalyticsActivity_MembersInjector(Provider<ThemeManager> provider, Provider<AccountNavigator> provider2, Provider<String> provider3, Provider<AnalyticsManager> provider4, Provider<FirstLaunchAnalytics> provider5) {
        this.themeManagerProvider = provider;
        this.accountNavigatorProvider = provider2;
        this.marketNameProvider = provider3;
        this.analyticsManagerProvider = provider4;
        this.firstLaunchAnalyticsProvider = provider5;
    }

    public static C10822a<AnalyticsActivity> create(Provider<ThemeManager> provider, Provider<AccountNavigator> provider2, Provider<String> provider3, Provider<AnalyticsManager> provider4, Provider<FirstLaunchAnalytics> provider5) {
        return new AnalyticsActivity_MembersInjector(provider, provider2, provider3, provider4, provider5);
    }

    public static void injectAnalyticsManager(AnalyticsActivity analyticsActivity, AnalyticsManager analyticsManager) {
        analyticsActivity.analyticsManager = analyticsManager;
    }

    public static void injectFirstLaunchAnalytics(AnalyticsActivity analyticsActivity, FirstLaunchAnalytics firstLaunchAnalytics) {
        analyticsActivity.firstLaunchAnalytics = firstLaunchAnalytics;
    }

    public void injectMembers(AnalyticsActivity analyticsActivity) {
        ActivityResultNavigator_MembersInjector.injectThemeManager(analyticsActivity, this.themeManagerProvider.get());
        ActivityResultNavigator_MembersInjector.injectAccountNavigator(analyticsActivity, this.accountNavigatorProvider.get());
        ActivityResultNavigator_MembersInjector.injectMarketName(analyticsActivity, this.marketNameProvider.get());
        injectAnalyticsManager(analyticsActivity, this.analyticsManagerProvider.get());
        injectFirstLaunchAnalytics(analyticsActivity, this.firstLaunchAnalyticsProvider.get());
    }
}
