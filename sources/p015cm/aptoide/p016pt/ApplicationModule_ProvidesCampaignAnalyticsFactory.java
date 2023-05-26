package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.p016pt.app.CampaignAnalytics;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesCampaignAnalyticsFactory */
public final class ApplicationModule_ProvidesCampaignAnalyticsFactory implements C10824b<CampaignAnalytics> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesCampaignAnalyticsFactory(ApplicationModule applicationModule, Provider<AnalyticsManager> provider) {
        this.module = applicationModule;
        this.analyticsManagerProvider = provider;
    }

    public static ApplicationModule_ProvidesCampaignAnalyticsFactory create(ApplicationModule applicationModule, Provider<AnalyticsManager> provider) {
        return new ApplicationModule_ProvidesCampaignAnalyticsFactory(applicationModule, provider);
    }

    public static CampaignAnalytics providesCampaignAnalytics(ApplicationModule applicationModule, AnalyticsManager analyticsManager) {
        CampaignAnalytics providesCampaignAnalytics = applicationModule.providesCampaignAnalytics(analyticsManager);
        C10825c.m36718a(providesCampaignAnalytics, "Cannot return null from a non-@Nullable @Provides method");
        return providesCampaignAnalytics;
    }

    public CampaignAnalytics get() {
        return providesCampaignAnalytics(this.module, this.analyticsManagerProvider.get());
    }
}
