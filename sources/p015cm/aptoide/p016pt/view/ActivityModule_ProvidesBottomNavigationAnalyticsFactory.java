package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationAnalytics;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.ActivityModule_ProvidesBottomNavigationAnalyticsFactory */
public final class ActivityModule_ProvidesBottomNavigationAnalyticsFactory implements C10824b<BottomNavigationAnalytics> {
    private final Provider<AnalyticsManager> managerProvider;
    private final ActivityModule module;
    private final Provider<NavigationTracker> trackerProvider;

    public ActivityModule_ProvidesBottomNavigationAnalyticsFactory(ActivityModule activityModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2) {
        this.module = activityModule;
        this.managerProvider = provider;
        this.trackerProvider = provider2;
    }

    public static ActivityModule_ProvidesBottomNavigationAnalyticsFactory create(ActivityModule activityModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2) {
        return new ActivityModule_ProvidesBottomNavigationAnalyticsFactory(activityModule, provider, provider2);
    }

    public static BottomNavigationAnalytics providesBottomNavigationAnalytics(ActivityModule activityModule, AnalyticsManager analyticsManager, NavigationTracker navigationTracker) {
        BottomNavigationAnalytics providesBottomNavigationAnalytics = activityModule.providesBottomNavigationAnalytics(analyticsManager, navigationTracker);
        C10825c.m36718a(providesBottomNavigationAnalytics, "Cannot return null from a non-@Nullable @Provides method");
        return providesBottomNavigationAnalytics;
    }

    public BottomNavigationAnalytics get() {
        return providesBottomNavigationAnalytics(this.module, this.managerProvider.get(), this.trackerProvider.get());
    }
}
