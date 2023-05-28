package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.p016pt.account.view.AccountNavigator;
import p015cm.aptoide.p016pt.analytics.FirstLaunchAnalytics;
import p015cm.aptoide.p016pt.analytics.view.AnalyticsActivity_MembersInjector;
import p015cm.aptoide.p016pt.navigator.ActivityResultNavigator_MembersInjector;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.view.ThemedActivityView_MembersInjector */
public final class ThemedActivityView_MembersInjector implements C10822a<ThemedActivityView> {
    private final Provider<AccountNavigator> accountNavigatorProvider;
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<FirstLaunchAnalytics> firstLaunchAnalyticsProvider;
    private final Provider<String> marketNameProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public ThemedActivityView_MembersInjector(Provider<ThemeManager> provider, Provider<AccountNavigator> provider2, Provider<String> provider3, Provider<AnalyticsManager> provider4, Provider<FirstLaunchAnalytics> provider5) {
        this.themeManagerProvider = provider;
        this.accountNavigatorProvider = provider2;
        this.marketNameProvider = provider3;
        this.analyticsManagerProvider = provider4;
        this.firstLaunchAnalyticsProvider = provider5;
    }

    public static C10822a<ThemedActivityView> create(Provider<ThemeManager> provider, Provider<AccountNavigator> provider2, Provider<String> provider3, Provider<AnalyticsManager> provider4, Provider<FirstLaunchAnalytics> provider5) {
        return new ThemedActivityView_MembersInjector(provider, provider2, provider3, provider4, provider5);
    }

    public static void injectThemeManager(ThemedActivityView themedActivityView, ThemeManager themeManager) {
        themedActivityView.themeManager = themeManager;
    }

    public void injectMembers(ThemedActivityView themedActivityView) {
        ActivityResultNavigator_MembersInjector.injectThemeManager(themedActivityView, this.themeManagerProvider.get());
        ActivityResultNavigator_MembersInjector.injectAccountNavigator(themedActivityView, this.accountNavigatorProvider.get());
        ActivityResultNavigator_MembersInjector.injectMarketName(themedActivityView, this.marketNameProvider.get());
        AnalyticsActivity_MembersInjector.injectAnalyticsManager(themedActivityView, this.analyticsManagerProvider.get());
        AnalyticsActivity_MembersInjector.injectFirstLaunchAnalytics(themedActivityView, this.firstLaunchAnalyticsProvider.get());
        injectThemeManager(themedActivityView, this.themeManagerProvider.get());
    }
}
