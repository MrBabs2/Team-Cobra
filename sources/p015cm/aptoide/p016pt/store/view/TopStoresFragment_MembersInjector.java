package p015cm.aptoide.p016pt.store.view;

import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.store.view.TopStoresFragment_MembersInjector */
public final class TopStoresFragment_MembersInjector implements C10822a<TopStoresFragment> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<NavigationTracker> navigationTrackerProvider;

    public TopStoresFragment_MembersInjector(Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2) {
        this.analyticsManagerProvider = provider;
        this.navigationTrackerProvider = provider2;
    }

    public static C10822a<TopStoresFragment> create(Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2) {
        return new TopStoresFragment_MembersInjector(provider, provider2);
    }

    public static void injectAnalyticsManager(TopStoresFragment topStoresFragment, AnalyticsManager analyticsManager) {
        topStoresFragment.analyticsManager = analyticsManager;
    }

    public static void injectNavigationTracker(TopStoresFragment topStoresFragment, NavigationTracker navigationTracker) {
        topStoresFragment.navigationTracker = navigationTracker;
    }

    public void injectMembers(TopStoresFragment topStoresFragment) {
        injectAnalyticsManager(topStoresFragment, this.analyticsManagerProvider.get());
        injectNavigationTracker(topStoresFragment, this.navigationTrackerProvider.get());
    }
}
