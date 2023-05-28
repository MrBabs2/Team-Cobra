package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.app.AppViewAnalytics;
import p015cm.aptoide.p016pt.download.DownloadAnalytics;
import p015cm.aptoide.p016pt.install.InstallAnalytics;
import p015cm.aptoide.p016pt.store.StoreAnalytics;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAppViewAnalyticsFactory */
public final class ApplicationModule_ProvidesAppViewAnalyticsFactory implements C10824b<AppViewAnalytics> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<DownloadAnalytics> downloadAnalyticsProvider;
    private final Provider<InstallAnalytics> installAnalyticsProvider;
    private final ApplicationModule module;
    private final Provider<NavigationTracker> navigationTrackerProvider;
    private final Provider<StoreAnalytics> storeAnalyticsProvider;

    public ApplicationModule_ProvidesAppViewAnalyticsFactory(ApplicationModule applicationModule, Provider<DownloadAnalytics> provider, Provider<AnalyticsManager> provider2, Provider<NavigationTracker> provider3, Provider<StoreAnalytics> provider4, Provider<InstallAnalytics> provider5) {
        this.module = applicationModule;
        this.downloadAnalyticsProvider = provider;
        this.analyticsManagerProvider = provider2;
        this.navigationTrackerProvider = provider3;
        this.storeAnalyticsProvider = provider4;
        this.installAnalyticsProvider = provider5;
    }

    public static ApplicationModule_ProvidesAppViewAnalyticsFactory create(ApplicationModule applicationModule, Provider<DownloadAnalytics> provider, Provider<AnalyticsManager> provider2, Provider<NavigationTracker> provider3, Provider<StoreAnalytics> provider4, Provider<InstallAnalytics> provider5) {
        return new ApplicationModule_ProvidesAppViewAnalyticsFactory(applicationModule, provider, provider2, provider3, provider4, provider5);
    }

    public static AppViewAnalytics providesAppViewAnalytics(ApplicationModule applicationModule, DownloadAnalytics downloadAnalytics, AnalyticsManager analyticsManager, NavigationTracker navigationTracker, StoreAnalytics storeAnalytics, InstallAnalytics installAnalytics) {
        AppViewAnalytics providesAppViewAnalytics = applicationModule.providesAppViewAnalytics(downloadAnalytics, analyticsManager, navigationTracker, storeAnalytics, installAnalytics);
        C10825c.m36718a(providesAppViewAnalytics, "Cannot return null from a non-@Nullable @Provides method");
        return providesAppViewAnalytics;
    }

    public AppViewAnalytics get() {
        return providesAppViewAnalytics(this.module, this.downloadAnalyticsProvider.get(), this.analyticsManagerProvider.get(), this.navigationTrackerProvider.get(), this.storeAnalyticsProvider.get(), this.installAnalyticsProvider.get());
    }
}
