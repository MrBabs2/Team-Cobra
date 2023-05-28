package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationAnalytics;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationNavigator;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.search.analytics.SearchAnalytics;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.ActivityModule_ProvideBottomNavigationNavigatorFactory */
public final class ActivityModule_ProvideBottomNavigationNavigatorFactory implements C10824b<BottomNavigationNavigator> {
    private final Provider<BottomNavigationAnalytics> bottomNavigationAnalyticsProvider;
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final ActivityModule module;
    private final Provider<SearchAnalytics> searchAnalyticsProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public ActivityModule_ProvideBottomNavigationNavigatorFactory(ActivityModule activityModule, Provider<FragmentNavigator> provider, Provider<BottomNavigationAnalytics> provider2, Provider<SearchAnalytics> provider3, Provider<ThemeManager> provider4) {
        this.module = activityModule;
        this.fragmentNavigatorProvider = provider;
        this.bottomNavigationAnalyticsProvider = provider2;
        this.searchAnalyticsProvider = provider3;
        this.themeManagerProvider = provider4;
    }

    public static ActivityModule_ProvideBottomNavigationNavigatorFactory create(ActivityModule activityModule, Provider<FragmentNavigator> provider, Provider<BottomNavigationAnalytics> provider2, Provider<SearchAnalytics> provider3, Provider<ThemeManager> provider4) {
        return new ActivityModule_ProvideBottomNavigationNavigatorFactory(activityModule, provider, provider2, provider3, provider4);
    }

    public static BottomNavigationNavigator provideBottomNavigationNavigator(ActivityModule activityModule, FragmentNavigator fragmentNavigator, BottomNavigationAnalytics bottomNavigationAnalytics, SearchAnalytics searchAnalytics, ThemeManager themeManager) {
        BottomNavigationNavigator provideBottomNavigationNavigator = activityModule.provideBottomNavigationNavigator(fragmentNavigator, bottomNavigationAnalytics, searchAnalytics, themeManager);
        C10825c.m36718a(provideBottomNavigationNavigator, "Cannot return null from a non-@Nullable @Provides method");
        return provideBottomNavigationNavigator;
    }

    public BottomNavigationNavigator get() {
        return provideBottomNavigationNavigator(this.module, this.fragmentNavigatorProvider.get(), this.bottomNavigationAnalyticsProvider.get(), this.searchAnalyticsProvider.get(), this.themeManagerProvider.get());
    }
}
