package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.ads.AdsUserPropertyManager;
import p015cm.aptoide.p016pt.ads.MoPubAdsManager;
import p015cm.aptoide.p016pt.ads.MoPubAnalytics;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.install.AptoideInstalledAppsRepository;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesMoPubAdsServiceFactory */
public final class ApplicationModule_ProvidesMoPubAdsServiceFactory implements C10824b<AdsUserPropertyManager> {
    private final Provider<AptoideInstalledAppsRepository> aptoideInstalledAppsRepositoryProvider;
    private final Provider<CrashReport> crashReportProvider;
    private final Provider<MoPubAdsManager> moPubAdsManagerProvider;
    private final Provider<MoPubAnalytics> moPubAnalyticsProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesMoPubAdsServiceFactory(ApplicationModule applicationModule, Provider<MoPubAdsManager> provider, Provider<AptoideInstalledAppsRepository> provider2, Provider<MoPubAnalytics> provider3, Provider<CrashReport> provider4) {
        this.module = applicationModule;
        this.moPubAdsManagerProvider = provider;
        this.aptoideInstalledAppsRepositoryProvider = provider2;
        this.moPubAnalyticsProvider = provider3;
        this.crashReportProvider = provider4;
    }

    public static ApplicationModule_ProvidesMoPubAdsServiceFactory create(ApplicationModule applicationModule, Provider<MoPubAdsManager> provider, Provider<AptoideInstalledAppsRepository> provider2, Provider<MoPubAnalytics> provider3, Provider<CrashReport> provider4) {
        return new ApplicationModule_ProvidesMoPubAdsServiceFactory(applicationModule, provider, provider2, provider3, provider4);
    }

    public static AdsUserPropertyManager providesMoPubAdsService(ApplicationModule applicationModule, MoPubAdsManager moPubAdsManager, AptoideInstalledAppsRepository aptoideInstalledAppsRepository, MoPubAnalytics moPubAnalytics, CrashReport crashReport) {
        AdsUserPropertyManager providesMoPubAdsService = applicationModule.providesMoPubAdsService(moPubAdsManager, aptoideInstalledAppsRepository, moPubAnalytics, crashReport);
        C10825c.m36718a(providesMoPubAdsService, "Cannot return null from a non-@Nullable @Provides method");
        return providesMoPubAdsService;
    }

    public AdsUserPropertyManager get() {
        return providesMoPubAdsService(this.module, this.moPubAdsManagerProvider.get(), this.aptoideInstalledAppsRepositoryProvider.get(), this.moPubAnalyticsProvider.get(), this.crashReportProvider.get());
    }
}
