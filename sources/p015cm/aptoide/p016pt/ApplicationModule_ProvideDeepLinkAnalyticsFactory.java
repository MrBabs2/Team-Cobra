package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideDeepLinkAnalyticsFactory */
public final class ApplicationModule_ProvideDeepLinkAnalyticsFactory implements C10824b<DeepLinkAnalytics> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final ApplicationModule module;
    private final Provider<NavigationTracker> navigationTrackerProvider;

    public ApplicationModule_ProvideDeepLinkAnalyticsFactory(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2) {
        this.module = applicationModule;
        this.analyticsManagerProvider = provider;
        this.navigationTrackerProvider = provider2;
    }

    public static ApplicationModule_ProvideDeepLinkAnalyticsFactory create(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2) {
        return new ApplicationModule_ProvideDeepLinkAnalyticsFactory(applicationModule, provider, provider2);
    }

    public static DeepLinkAnalytics provideDeepLinkAnalytics(ApplicationModule applicationModule, AnalyticsManager analyticsManager, NavigationTracker navigationTracker) {
        DeepLinkAnalytics provideDeepLinkAnalytics = applicationModule.provideDeepLinkAnalytics(analyticsManager, navigationTracker);
        C10825c.m36718a(provideDeepLinkAnalytics, "Cannot return null from a non-@Nullable @Provides method");
        return provideDeepLinkAnalytics;
    }

    public DeepLinkAnalytics get() {
        return provideDeepLinkAnalytics(this.module, this.analyticsManagerProvider.get(), this.navigationTrackerProvider.get());
    }
}
