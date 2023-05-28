package p015cm.aptoide.p016pt;

import android.content.SharedPreferences;
import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.install.InstallAnalytics;
import p015cm.aptoide.p016pt.install.InstallerAnalytics;
import p015cm.aptoide.p016pt.root.RootAvailabilityManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesInstallerAnalyticsFactory */
public final class ApplicationModule_ProvidesInstallerAnalyticsFactory implements C10824b<InstallerAnalytics> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<InstallAnalytics> installAnalyticsProvider;
    private final ApplicationModule module;
    private final Provider<NavigationTracker> navigationTrackerProvider;
    private final Provider<RootAvailabilityManager> rootAvailabilityManagerProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public ApplicationModule_ProvidesInstallerAnalyticsFactory(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<InstallAnalytics> provider2, Provider<SharedPreferences> provider3, Provider<RootAvailabilityManager> provider4, Provider<NavigationTracker> provider5) {
        this.module = applicationModule;
        this.analyticsManagerProvider = provider;
        this.installAnalyticsProvider = provider2;
        this.sharedPreferencesProvider = provider3;
        this.rootAvailabilityManagerProvider = provider4;
        this.navigationTrackerProvider = provider5;
    }

    public static ApplicationModule_ProvidesInstallerAnalyticsFactory create(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<InstallAnalytics> provider2, Provider<SharedPreferences> provider3, Provider<RootAvailabilityManager> provider4, Provider<NavigationTracker> provider5) {
        return new ApplicationModule_ProvidesInstallerAnalyticsFactory(applicationModule, provider, provider2, provider3, provider4, provider5);
    }

    public static InstallerAnalytics providesInstallerAnalytics(ApplicationModule applicationModule, AnalyticsManager analyticsManager, InstallAnalytics installAnalytics, SharedPreferences sharedPreferences, RootAvailabilityManager rootAvailabilityManager, NavigationTracker navigationTracker) {
        InstallerAnalytics providesInstallerAnalytics = applicationModule.providesInstallerAnalytics(analyticsManager, installAnalytics, sharedPreferences, rootAvailabilityManager, navigationTracker);
        C10825c.m36718a(providesInstallerAnalytics, "Cannot return null from a non-@Nullable @Provides method");
        return providesInstallerAnalytics;
    }

    public InstallerAnalytics get() {
        return providesInstallerAnalytics(this.module, this.analyticsManagerProvider.get(), this.installAnalyticsProvider.get(), this.sharedPreferencesProvider.get(), this.rootAvailabilityManagerProvider.get(), this.navigationTrackerProvider.get());
    }
}
