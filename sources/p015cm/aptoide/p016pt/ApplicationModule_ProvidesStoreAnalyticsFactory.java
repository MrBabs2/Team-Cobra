package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.store.StoreAnalytics;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesStoreAnalyticsFactory */
public final class ApplicationModule_ProvidesStoreAnalyticsFactory implements C10824b<StoreAnalytics> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final ApplicationModule module;
    private final Provider<NavigationTracker> navigationTrackerProvider;

    public ApplicationModule_ProvidesStoreAnalyticsFactory(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2) {
        this.module = applicationModule;
        this.analyticsManagerProvider = provider;
        this.navigationTrackerProvider = provider2;
    }

    public static ApplicationModule_ProvidesStoreAnalyticsFactory create(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2) {
        return new ApplicationModule_ProvidesStoreAnalyticsFactory(applicationModule, provider, provider2);
    }

    public static StoreAnalytics providesStoreAnalytics(ApplicationModule applicationModule, AnalyticsManager analyticsManager, NavigationTracker navigationTracker) {
        StoreAnalytics providesStoreAnalytics = applicationModule.providesStoreAnalytics(analyticsManager, navigationTracker);
        C10825c.m36718a(providesStoreAnalytics, "Cannot return null from a non-@Nullable @Provides method");
        return providesStoreAnalytics;
    }

    public StoreAnalytics get() {
        return providesStoreAnalytics(this.module, this.analyticsManagerProvider.get(), this.navigationTrackerProvider.get());
    }
}
