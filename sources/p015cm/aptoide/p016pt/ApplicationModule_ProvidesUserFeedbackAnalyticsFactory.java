package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesUserFeedbackAnalyticsFactory */
public final class ApplicationModule_ProvidesUserFeedbackAnalyticsFactory implements C10824b<UserFeedbackAnalytics> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final ApplicationModule module;
    private final Provider<NavigationTracker> navigationTrackerProvider;

    public ApplicationModule_ProvidesUserFeedbackAnalyticsFactory(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2) {
        this.module = applicationModule;
        this.analyticsManagerProvider = provider;
        this.navigationTrackerProvider = provider2;
    }

    public static ApplicationModule_ProvidesUserFeedbackAnalyticsFactory create(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2) {
        return new ApplicationModule_ProvidesUserFeedbackAnalyticsFactory(applicationModule, provider, provider2);
    }

    public static UserFeedbackAnalytics providesUserFeedbackAnalytics(ApplicationModule applicationModule, AnalyticsManager analyticsManager, NavigationTracker navigationTracker) {
        UserFeedbackAnalytics providesUserFeedbackAnalytics = applicationModule.providesUserFeedbackAnalytics(analyticsManager, navigationTracker);
        C10825c.m36718a(providesUserFeedbackAnalytics, "Cannot return null from a non-@Nullable @Provides method");
        return providesUserFeedbackAnalytics;
    }

    public UserFeedbackAnalytics get() {
        return providesUserFeedbackAnalytics(this.module, this.analyticsManagerProvider.get(), this.navigationTrackerProvider.get());
    }
}
