package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.p016pt.account.view.AccountNavigator;
import p015cm.aptoide.p016pt.analytics.FirstLaunchAnalytics;
import p015cm.aptoide.p016pt.analytics.view.AnalyticsActivity_MembersInjector;
import p015cm.aptoide.p016pt.navigator.ActivityResultNavigator_MembersInjector;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.view.BackButtonActivity_MembersInjector */
public final class BackButtonActivity_MembersInjector implements C10822a<BackButtonActivity> {
    private final Provider<AccountNavigator> accountNavigatorProvider;
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<FirstLaunchAnalytics> firstLaunchAnalyticsProvider;
    private final Provider<String> marketNameProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public BackButtonActivity_MembersInjector(Provider<ThemeManager> provider, Provider<AccountNavigator> provider2, Provider<String> provider3, Provider<AnalyticsManager> provider4, Provider<FirstLaunchAnalytics> provider5) {
        this.themeManagerProvider = provider;
        this.accountNavigatorProvider = provider2;
        this.marketNameProvider = provider3;
        this.analyticsManagerProvider = provider4;
        this.firstLaunchAnalyticsProvider = provider5;
    }

    public static C10822a<BackButtonActivity> create(Provider<ThemeManager> provider, Provider<AccountNavigator> provider2, Provider<String> provider3, Provider<AnalyticsManager> provider4, Provider<FirstLaunchAnalytics> provider5) {
        return new BackButtonActivity_MembersInjector(provider, provider2, provider3, provider4, provider5);
    }

    public void injectMembers(BackButtonActivity backButtonActivity) {
        ActivityResultNavigator_MembersInjector.injectThemeManager(backButtonActivity, this.themeManagerProvider.get());
        ActivityResultNavigator_MembersInjector.injectAccountNavigator(backButtonActivity, this.accountNavigatorProvider.get());
        ActivityResultNavigator_MembersInjector.injectMarketName(backButtonActivity, this.marketNameProvider.get());
        AnalyticsActivity_MembersInjector.injectAnalyticsManager(backButtonActivity, this.analyticsManagerProvider.get());
        AnalyticsActivity_MembersInjector.injectFirstLaunchAnalytics(backButtonActivity, this.firstLaunchAnalyticsProvider.get());
        ThemedActivityView_MembersInjector.injectThemeManager(backButtonActivity, this.themeManagerProvider.get());
    }
}
