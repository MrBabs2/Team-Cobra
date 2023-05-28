package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.search.analytics.SearchAnalytics;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesSearchAnalyticsFactory */
public final class ApplicationModule_ProvidesSearchAnalyticsFactory implements C10824b<SearchAnalytics> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final ApplicationModule module;
    private final Provider<NavigationTracker> navigationTrackerProvider;

    public ApplicationModule_ProvidesSearchAnalyticsFactory(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2) {
        this.module = applicationModule;
        this.analyticsManagerProvider = provider;
        this.navigationTrackerProvider = provider2;
    }

    public static ApplicationModule_ProvidesSearchAnalyticsFactory create(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2) {
        return new ApplicationModule_ProvidesSearchAnalyticsFactory(applicationModule, provider, provider2);
    }

    public static SearchAnalytics providesSearchAnalytics(ApplicationModule applicationModule, AnalyticsManager analyticsManager, NavigationTracker navigationTracker) {
        SearchAnalytics providesSearchAnalytics = applicationModule.providesSearchAnalytics(analyticsManager, navigationTracker);
        C10825c.m36718a(providesSearchAnalytics, "Cannot return null from a non-@Nullable @Provides method");
        return providesSearchAnalytics;
    }

    public SearchAnalytics get() {
        return providesSearchAnalytics(this.module, this.analyticsManagerProvider.get(), this.navigationTrackerProvider.get());
    }
}
