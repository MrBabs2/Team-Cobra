package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.home.HomeAnalytics;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesHomeAnalyticsFactory */
public final class FragmentModule_ProvidesHomeAnalyticsFactory implements C10824b<HomeAnalytics> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final FragmentModule module;
    private final Provider<NavigationTracker> navigationTrackerProvider;

    public FragmentModule_ProvidesHomeAnalyticsFactory(FragmentModule fragmentModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2) {
        this.module = fragmentModule;
        this.analyticsManagerProvider = provider;
        this.navigationTrackerProvider = provider2;
    }

    public static FragmentModule_ProvidesHomeAnalyticsFactory create(FragmentModule fragmentModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2) {
        return new FragmentModule_ProvidesHomeAnalyticsFactory(fragmentModule, provider, provider2);
    }

    public static HomeAnalytics providesHomeAnalytics(FragmentModule fragmentModule, AnalyticsManager analyticsManager, NavigationTracker navigationTracker) {
        HomeAnalytics providesHomeAnalytics = fragmentModule.providesHomeAnalytics(analyticsManager, navigationTracker);
        C10825c.m36718a(providesHomeAnalytics, "Cannot return null from a non-@Nullable @Provides method");
        return providesHomeAnalytics;
    }

    public HomeAnalytics get() {
        return providesHomeAnalytics(this.module, this.analyticsManagerProvider.get(), this.navigationTrackerProvider.get());
    }
}
