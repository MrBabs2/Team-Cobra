package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.download.AppValidationAnalytics;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAppValidationAnalyticsFactory */
public final class ApplicationModule_ProvidesAppValidationAnalyticsFactory implements C10824b<AppValidationAnalytics> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final ApplicationModule module;
    private final Provider<NavigationTracker> navigationTrackerProvider;

    public ApplicationModule_ProvidesAppValidationAnalyticsFactory(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2) {
        this.module = applicationModule;
        this.analyticsManagerProvider = provider;
        this.navigationTrackerProvider = provider2;
    }

    public static ApplicationModule_ProvidesAppValidationAnalyticsFactory create(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2) {
        return new ApplicationModule_ProvidesAppValidationAnalyticsFactory(applicationModule, provider, provider2);
    }

    public static AppValidationAnalytics providesAppValidationAnalytics(ApplicationModule applicationModule, AnalyticsManager analyticsManager, NavigationTracker navigationTracker) {
        AppValidationAnalytics providesAppValidationAnalytics = applicationModule.providesAppValidationAnalytics(analyticsManager, navigationTracker);
        C10825c.m36718a(providesAppValidationAnalytics, "Cannot return null from a non-@Nullable @Provides method");
        return providesAppValidationAnalytics;
    }

    public AppValidationAnalytics get() {
        return providesAppValidationAnalytics(this.module, this.analyticsManagerProvider.get(), this.navigationTrackerProvider.get());
    }
}
