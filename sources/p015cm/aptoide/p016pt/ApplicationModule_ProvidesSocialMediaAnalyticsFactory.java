package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.socialmedia.SocialMediaAnalytics;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesSocialMediaAnalyticsFactory */
public final class ApplicationModule_ProvidesSocialMediaAnalyticsFactory implements C10824b<SocialMediaAnalytics> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final ApplicationModule module;
    private final Provider<NavigationTracker> navigationTrackerProvider;

    public ApplicationModule_ProvidesSocialMediaAnalyticsFactory(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2) {
        this.module = applicationModule;
        this.analyticsManagerProvider = provider;
        this.navigationTrackerProvider = provider2;
    }

    public static ApplicationModule_ProvidesSocialMediaAnalyticsFactory create(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2) {
        return new ApplicationModule_ProvidesSocialMediaAnalyticsFactory(applicationModule, provider, provider2);
    }

    public static SocialMediaAnalytics providesSocialMediaAnalytics(ApplicationModule applicationModule, AnalyticsManager analyticsManager, NavigationTracker navigationTracker) {
        SocialMediaAnalytics providesSocialMediaAnalytics = applicationModule.providesSocialMediaAnalytics(analyticsManager, navigationTracker);
        C10825c.m36718a(providesSocialMediaAnalytics, "Cannot return null from a non-@Nullable @Provides method");
        return providesSocialMediaAnalytics;
    }

    public SocialMediaAnalytics get() {
        return providesSocialMediaAnalytics(this.module, this.analyticsManagerProvider.get(), this.navigationTrackerProvider.get());
    }
}
