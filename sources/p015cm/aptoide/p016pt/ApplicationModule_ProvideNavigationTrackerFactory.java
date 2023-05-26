package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsLogger;
import p015cm.aptoide.analytics.implementation.PageViewsAnalytics;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideNavigationTrackerFactory */
public final class ApplicationModule_ProvideNavigationTrackerFactory implements C10824b<NavigationTracker> {
    private final Provider<AnalyticsLogger> loggerProvider;
    private final ApplicationModule module;
    private final Provider<PageViewsAnalytics> pageViewsAnalyticsProvider;

    public ApplicationModule_ProvideNavigationTrackerFactory(ApplicationModule applicationModule, Provider<PageViewsAnalytics> provider, Provider<AnalyticsLogger> provider2) {
        this.module = applicationModule;
        this.pageViewsAnalyticsProvider = provider;
        this.loggerProvider = provider2;
    }

    public static ApplicationModule_ProvideNavigationTrackerFactory create(ApplicationModule applicationModule, Provider<PageViewsAnalytics> provider, Provider<AnalyticsLogger> provider2) {
        return new ApplicationModule_ProvideNavigationTrackerFactory(applicationModule, provider, provider2);
    }

    public static NavigationTracker provideNavigationTracker(ApplicationModule applicationModule, PageViewsAnalytics pageViewsAnalytics, AnalyticsLogger analyticsLogger) {
        NavigationTracker provideNavigationTracker = applicationModule.provideNavigationTracker(pageViewsAnalytics, analyticsLogger);
        C10825c.m36718a(provideNavigationTracker, "Cannot return null from a non-@Nullable @Provides method");
        return provideNavigationTracker;
    }

    public NavigationTracker get() {
        return provideNavigationTracker(this.module, this.pageViewsAnalyticsProvider.get(), this.loggerProvider.get());
    }
}
