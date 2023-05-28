package p015cm.aptoide.p016pt.reviews;

import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.store.StoreCredentialsProvider;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.reviews.LatestReviewsFragment_MembersInjector */
public final class LatestReviewsFragment_MembersInjector implements C10822a<LatestReviewsFragment> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<NavigationTracker> navigationTrackerProvider;
    private final Provider<StoreCredentialsProvider> storeCredentialsProvider;

    public LatestReviewsFragment_MembersInjector(Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2, Provider<StoreCredentialsProvider> provider3) {
        this.analyticsManagerProvider = provider;
        this.navigationTrackerProvider = provider2;
        this.storeCredentialsProvider = provider3;
    }

    public static C10822a<LatestReviewsFragment> create(Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2, Provider<StoreCredentialsProvider> provider3) {
        return new LatestReviewsFragment_MembersInjector(provider, provider2, provider3);
    }

    public static void injectAnalyticsManager(LatestReviewsFragment latestReviewsFragment, AnalyticsManager analyticsManager) {
        latestReviewsFragment.analyticsManager = analyticsManager;
    }

    public static void injectNavigationTracker(LatestReviewsFragment latestReviewsFragment, NavigationTracker navigationTracker) {
        latestReviewsFragment.navigationTracker = navigationTracker;
    }

    public static void injectStoreCredentialsProvider(LatestReviewsFragment latestReviewsFragment, StoreCredentialsProvider storeCredentialsProvider2) {
        latestReviewsFragment.storeCredentialsProvider = storeCredentialsProvider2;
    }

    public void injectMembers(LatestReviewsFragment latestReviewsFragment) {
        injectAnalyticsManager(latestReviewsFragment, this.analyticsManagerProvider.get());
        injectNavigationTracker(latestReviewsFragment, this.navigationTrackerProvider.get());
        injectStoreCredentialsProvider(latestReviewsFragment, this.storeCredentialsProvider.get());
    }
}
