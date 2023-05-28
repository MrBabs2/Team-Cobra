package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.account.AccountAnalytics;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideAccountAnalyticsFactory */
public final class ApplicationModule_ProvideAccountAnalyticsFactory implements C10824b<AccountAnalytics> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final ApplicationModule module;
    private final Provider<NavigationTracker> navigationTrackerProvider;

    public ApplicationModule_ProvideAccountAnalyticsFactory(ApplicationModule applicationModule, Provider<NavigationTracker> provider, Provider<AnalyticsManager> provider2) {
        this.module = applicationModule;
        this.navigationTrackerProvider = provider;
        this.analyticsManagerProvider = provider2;
    }

    public static ApplicationModule_ProvideAccountAnalyticsFactory create(ApplicationModule applicationModule, Provider<NavigationTracker> provider, Provider<AnalyticsManager> provider2) {
        return new ApplicationModule_ProvideAccountAnalyticsFactory(applicationModule, provider, provider2);
    }

    public static AccountAnalytics provideAccountAnalytics(ApplicationModule applicationModule, NavigationTracker navigationTracker, AnalyticsManager analyticsManager) {
        AccountAnalytics provideAccountAnalytics = applicationModule.provideAccountAnalytics(navigationTracker, analyticsManager);
        C10825c.m36718a(provideAccountAnalytics, "Cannot return null from a non-@Nullable @Provides method");
        return provideAccountAnalytics;
    }

    public AccountAnalytics get() {
        return provideAccountAnalytics(this.module, this.navigationTrackerProvider.get(), this.analyticsManagerProvider.get());
    }
}
