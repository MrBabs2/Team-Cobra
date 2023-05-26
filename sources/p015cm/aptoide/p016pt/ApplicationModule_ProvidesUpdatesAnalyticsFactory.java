package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.install.InstallAnalytics;
import p015cm.aptoide.p016pt.updates.UpdatesAnalytics;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesUpdatesAnalyticsFactory */
public final class ApplicationModule_ProvidesUpdatesAnalyticsFactory implements C10824b<UpdatesAnalytics> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<InstallAnalytics> installAnalyticsProvider;
    private final ApplicationModule module;
    private final Provider<NavigationTracker> navigationTrackerProvider;

    public ApplicationModule_ProvidesUpdatesAnalyticsFactory(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2, Provider<InstallAnalytics> provider3) {
        this.module = applicationModule;
        this.analyticsManagerProvider = provider;
        this.navigationTrackerProvider = provider2;
        this.installAnalyticsProvider = provider3;
    }

    public static ApplicationModule_ProvidesUpdatesAnalyticsFactory create(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2, Provider<InstallAnalytics> provider3) {
        return new ApplicationModule_ProvidesUpdatesAnalyticsFactory(applicationModule, provider, provider2, provider3);
    }

    public static UpdatesAnalytics providesUpdatesAnalytics(ApplicationModule applicationModule, AnalyticsManager analyticsManager, NavigationTracker navigationTracker, InstallAnalytics installAnalytics) {
        UpdatesAnalytics providesUpdatesAnalytics = applicationModule.providesUpdatesAnalytics(analyticsManager, navigationTracker, installAnalytics);
        C10825c.m36718a(providesUpdatesAnalytics, "Cannot return null from a non-@Nullable @Provides method");
        return providesUpdatesAnalytics;
    }

    public UpdatesAnalytics get() {
        return providesUpdatesAnalytics(this.module, this.analyticsManagerProvider.get(), this.navigationTrackerProvider.get(), this.installAnalyticsProvider.get());
    }
}
