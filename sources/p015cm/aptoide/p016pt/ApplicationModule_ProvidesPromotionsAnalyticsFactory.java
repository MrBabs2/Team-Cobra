package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.download.DownloadAnalytics;
import p015cm.aptoide.p016pt.install.InstallAnalytics;
import p015cm.aptoide.p016pt.promotions.PromotionsAnalytics;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesPromotionsAnalyticsFactory */
public final class ApplicationModule_ProvidesPromotionsAnalyticsFactory implements C10824b<PromotionsAnalytics> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<DownloadAnalytics> downloadAnalyticsProvider;
    private final Provider<InstallAnalytics> installAnalyticsProvider;
    private final ApplicationModule module;
    private final Provider<NavigationTracker> navigationTrackerProvider;

    public ApplicationModule_ProvidesPromotionsAnalyticsFactory(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2, Provider<DownloadAnalytics> provider3, Provider<InstallAnalytics> provider4) {
        this.module = applicationModule;
        this.analyticsManagerProvider = provider;
        this.navigationTrackerProvider = provider2;
        this.downloadAnalyticsProvider = provider3;
        this.installAnalyticsProvider = provider4;
    }

    public static ApplicationModule_ProvidesPromotionsAnalyticsFactory create(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2, Provider<DownloadAnalytics> provider3, Provider<InstallAnalytics> provider4) {
        return new ApplicationModule_ProvidesPromotionsAnalyticsFactory(applicationModule, provider, provider2, provider3, provider4);
    }

    public static PromotionsAnalytics providesPromotionsAnalytics(ApplicationModule applicationModule, AnalyticsManager analyticsManager, NavigationTracker navigationTracker, DownloadAnalytics downloadAnalytics, InstallAnalytics installAnalytics) {
        PromotionsAnalytics providesPromotionsAnalytics = applicationModule.providesPromotionsAnalytics(analyticsManager, navigationTracker, downloadAnalytics, installAnalytics);
        C10825c.m36718a(providesPromotionsAnalytics, "Cannot return null from a non-@Nullable @Provides method");
        return providesPromotionsAnalytics;
    }

    public PromotionsAnalytics get() {
        return providesPromotionsAnalytics(this.module, this.analyticsManagerProvider.get(), this.navigationTrackerProvider.get(), this.downloadAnalyticsProvider.get(), this.installAnalyticsProvider.get());
    }
}
