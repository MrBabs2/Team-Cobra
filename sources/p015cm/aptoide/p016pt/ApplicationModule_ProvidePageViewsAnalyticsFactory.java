package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.PageViewsAnalytics;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidePageViewsAnalyticsFactory */
public final class ApplicationModule_ProvidePageViewsAnalyticsFactory implements C10824b<PageViewsAnalytics> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidePageViewsAnalyticsFactory(ApplicationModule applicationModule, Provider<AnalyticsManager> provider) {
        this.module = applicationModule;
        this.analyticsManagerProvider = provider;
    }

    public static ApplicationModule_ProvidePageViewsAnalyticsFactory create(ApplicationModule applicationModule, Provider<AnalyticsManager> provider) {
        return new ApplicationModule_ProvidePageViewsAnalyticsFactory(applicationModule, provider);
    }

    public static PageViewsAnalytics providePageViewsAnalytics(ApplicationModule applicationModule, AnalyticsManager analyticsManager) {
        PageViewsAnalytics providePageViewsAnalytics = applicationModule.providePageViewsAnalytics(analyticsManager);
        C10825c.m36718a(providePageViewsAnalytics, "Cannot return null from a non-@Nullable @Provides method");
        return providePageViewsAnalytics;
    }

    public PageViewsAnalytics get() {
        return providePageViewsAnalytics(this.module, this.analyticsManagerProvider.get());
    }
}
