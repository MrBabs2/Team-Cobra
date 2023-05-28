package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAppShortcutsAnalyticsFactory */
public final class ApplicationModule_ProvidesAppShortcutsAnalyticsFactory implements C10824b<AppShortcutsAnalytics> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final ApplicationModule module;
    private final Provider<NavigationTracker> navigationTrackerProvider;

    public ApplicationModule_ProvidesAppShortcutsAnalyticsFactory(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2) {
        this.module = applicationModule;
        this.analyticsManagerProvider = provider;
        this.navigationTrackerProvider = provider2;
    }

    public static ApplicationModule_ProvidesAppShortcutsAnalyticsFactory create(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2) {
        return new ApplicationModule_ProvidesAppShortcutsAnalyticsFactory(applicationModule, provider, provider2);
    }

    public static AppShortcutsAnalytics providesAppShortcutsAnalytics(ApplicationModule applicationModule, AnalyticsManager analyticsManager, NavigationTracker navigationTracker) {
        AppShortcutsAnalytics providesAppShortcutsAnalytics = applicationModule.providesAppShortcutsAnalytics(analyticsManager, navigationTracker);
        C10825c.m36718a(providesAppShortcutsAnalytics, "Cannot return null from a non-@Nullable @Provides method");
        return providesAppShortcutsAnalytics;
    }

    public AppShortcutsAnalytics get() {
        return providesAppShortcutsAnalytics(this.module, this.analyticsManagerProvider.get(), this.navigationTrackerProvider.get());
    }
}
