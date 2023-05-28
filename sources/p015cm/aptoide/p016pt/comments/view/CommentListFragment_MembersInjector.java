package p015cm.aptoide.p016pt.comments.view;

import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.store.StoreCredentialsProvider;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.comments.view.CommentListFragment_MembersInjector */
public final class CommentListFragment_MembersInjector implements C10822a<CommentListFragment> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<NavigationTracker> navigationTrackerProvider;
    private final Provider<StoreCredentialsProvider> storeCredentialsProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public CommentListFragment_MembersInjector(Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2, Provider<ThemeManager> provider3, Provider<StoreCredentialsProvider> provider4) {
        this.analyticsManagerProvider = provider;
        this.navigationTrackerProvider = provider2;
        this.themeManagerProvider = provider3;
        this.storeCredentialsProvider = provider4;
    }

    public static C10822a<CommentListFragment> create(Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2, Provider<ThemeManager> provider3, Provider<StoreCredentialsProvider> provider4) {
        return new CommentListFragment_MembersInjector(provider, provider2, provider3, provider4);
    }

    public static void injectAnalyticsManager(CommentListFragment commentListFragment, AnalyticsManager analyticsManager) {
        commentListFragment.analyticsManager = analyticsManager;
    }

    public static void injectNavigationTracker(CommentListFragment commentListFragment, NavigationTracker navigationTracker) {
        commentListFragment.navigationTracker = navigationTracker;
    }

    public static void injectStoreCredentialsProvider(CommentListFragment commentListFragment, StoreCredentialsProvider storeCredentialsProvider2) {
        commentListFragment.storeCredentialsProvider = storeCredentialsProvider2;
    }

    public static void injectThemeManager(CommentListFragment commentListFragment, ThemeManager themeManager) {
        commentListFragment.themeManager = themeManager;
    }

    public void injectMembers(CommentListFragment commentListFragment) {
        injectAnalyticsManager(commentListFragment, this.analyticsManagerProvider.get());
        injectNavigationTracker(commentListFragment, this.navigationTrackerProvider.get());
        injectThemeManager(commentListFragment, this.themeManagerProvider.get());
        injectStoreCredentialsProvider(commentListFragment, this.storeCredentialsProvider.get());
    }
}
