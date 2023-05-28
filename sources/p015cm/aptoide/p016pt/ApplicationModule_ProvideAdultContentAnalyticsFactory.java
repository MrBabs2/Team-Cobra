package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.account.AdultContentAnalytics;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideAdultContentAnalyticsFactory */
public final class ApplicationModule_ProvideAdultContentAnalyticsFactory implements C10824b<AdultContentAnalytics> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final ApplicationModule module;
    private final Provider<NavigationTracker> navigationTrackerProvider;

    public ApplicationModule_ProvideAdultContentAnalyticsFactory(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2) {
        this.module = applicationModule;
        this.analyticsManagerProvider = provider;
        this.navigationTrackerProvider = provider2;
    }

    public static ApplicationModule_ProvideAdultContentAnalyticsFactory create(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2) {
        return new ApplicationModule_ProvideAdultContentAnalyticsFactory(applicationModule, provider, provider2);
    }

    public static AdultContentAnalytics provideAdultContentAnalytics(ApplicationModule applicationModule, AnalyticsManager analyticsManager, NavigationTracker navigationTracker) {
        AdultContentAnalytics provideAdultContentAnalytics = applicationModule.provideAdultContentAnalytics(analyticsManager, navigationTracker);
        C10825c.m36718a(provideAdultContentAnalytics, "Cannot return null from a non-@Nullable @Provides method");
        return provideAdultContentAnalytics;
    }

    public AdultContentAnalytics get() {
        return provideAdultContentAnalytics(this.module, this.analyticsManagerProvider.get(), this.navigationTrackerProvider.get());
    }
}
