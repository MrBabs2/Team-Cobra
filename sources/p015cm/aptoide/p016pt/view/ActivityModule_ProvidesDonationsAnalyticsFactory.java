package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.app.view.donations.DonationsAnalytics;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.ActivityModule_ProvidesDonationsAnalyticsFactory */
public final class ActivityModule_ProvidesDonationsAnalyticsFactory implements C10824b<DonationsAnalytics> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final ActivityModule module;
    private final Provider<NavigationTracker> navigationTrackerProvider;

    public ActivityModule_ProvidesDonationsAnalyticsFactory(ActivityModule activityModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2) {
        this.module = activityModule;
        this.analyticsManagerProvider = provider;
        this.navigationTrackerProvider = provider2;
    }

    public static ActivityModule_ProvidesDonationsAnalyticsFactory create(ActivityModule activityModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2) {
        return new ActivityModule_ProvidesDonationsAnalyticsFactory(activityModule, provider, provider2);
    }

    public static DonationsAnalytics providesDonationsAnalytics(ActivityModule activityModule, AnalyticsManager analyticsManager, NavigationTracker navigationTracker) {
        DonationsAnalytics providesDonationsAnalytics = activityModule.providesDonationsAnalytics(analyticsManager, navigationTracker);
        C10825c.m36718a(providesDonationsAnalytics, "Cannot return null from a non-@Nullable @Provides method");
        return providesDonationsAnalytics;
    }

    public DonationsAnalytics get() {
        return providesDonationsAnalytics(this.module, this.analyticsManagerProvider.get(), this.navigationTrackerProvider.get());
    }
}
