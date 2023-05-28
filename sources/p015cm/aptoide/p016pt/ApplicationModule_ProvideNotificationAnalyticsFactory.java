package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.notification.NotificationAnalytics;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideNotificationAnalyticsFactory */
public final class ApplicationModule_ProvideNotificationAnalyticsFactory implements C10824b<NotificationAnalytics> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final ApplicationModule module;
    private final Provider<NavigationTracker> navigationTrackerProvider;

    public ApplicationModule_ProvideNotificationAnalyticsFactory(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2) {
        this.module = applicationModule;
        this.analyticsManagerProvider = provider;
        this.navigationTrackerProvider = provider2;
    }

    public static ApplicationModule_ProvideNotificationAnalyticsFactory create(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2) {
        return new ApplicationModule_ProvideNotificationAnalyticsFactory(applicationModule, provider, provider2);
    }

    public static NotificationAnalytics provideNotificationAnalytics(ApplicationModule applicationModule, AnalyticsManager analyticsManager, NavigationTracker navigationTracker) {
        NotificationAnalytics provideNotificationAnalytics = applicationModule.provideNotificationAnalytics(analyticsManager, navigationTracker);
        C10825c.m36718a(provideNotificationAnalytics, "Cannot return null from a non-@Nullable @Provides method");
        return provideNotificationAnalytics;
    }

    public NotificationAnalytics get() {
        return provideNotificationAnalytics(this.module, this.analyticsManagerProvider.get(), this.navigationTrackerProvider.get());
    }
}
