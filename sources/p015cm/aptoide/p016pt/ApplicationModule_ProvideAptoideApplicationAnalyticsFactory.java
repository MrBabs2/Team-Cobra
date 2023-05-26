package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideAptoideApplicationAnalyticsFactory */
public final class ApplicationModule_ProvideAptoideApplicationAnalyticsFactory implements C10824b<AptoideApplicationAnalytics> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvideAptoideApplicationAnalyticsFactory(ApplicationModule applicationModule, Provider<AnalyticsManager> provider) {
        this.module = applicationModule;
        this.analyticsManagerProvider = provider;
    }

    public static ApplicationModule_ProvideAptoideApplicationAnalyticsFactory create(ApplicationModule applicationModule, Provider<AnalyticsManager> provider) {
        return new ApplicationModule_ProvideAptoideApplicationAnalyticsFactory(applicationModule, provider);
    }

    public static AptoideApplicationAnalytics provideAptoideApplicationAnalytics(ApplicationModule applicationModule, AnalyticsManager analyticsManager) {
        AptoideApplicationAnalytics provideAptoideApplicationAnalytics = applicationModule.provideAptoideApplicationAnalytics(analyticsManager);
        C10825c.m36718a(provideAptoideApplicationAnalytics, "Cannot return null from a non-@Nullable @Provides method");
        return provideAptoideApplicationAnalytics;
    }

    public AptoideApplicationAnalytics get() {
        return provideAptoideApplicationAnalytics(this.module, this.analyticsManagerProvider.get());
    }
}
