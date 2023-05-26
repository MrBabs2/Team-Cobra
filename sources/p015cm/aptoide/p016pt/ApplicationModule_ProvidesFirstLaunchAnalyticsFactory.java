package p015cm.aptoide.p016pt;

import com.google.android.gms.safetynet.SafetyNetClient;
import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsLogger;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.p016pt.analytics.FirstLaunchAnalytics;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesFirstLaunchAnalyticsFactory */
public final class ApplicationModule_ProvidesFirstLaunchAnalyticsFactory implements C10824b<FirstLaunchAnalytics> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<GmsStatusValueProvider> gmsStatusValueProvider;
    private final Provider<AnalyticsLogger> loggerProvider;
    private final ApplicationModule module;
    private final Provider<SafetyNetClient> safetyNetClientProvider;

    public ApplicationModule_ProvidesFirstLaunchAnalyticsFactory(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<AnalyticsLogger> provider2, Provider<SafetyNetClient> provider3, Provider<GmsStatusValueProvider> provider4) {
        this.module = applicationModule;
        this.analyticsManagerProvider = provider;
        this.loggerProvider = provider2;
        this.safetyNetClientProvider = provider3;
        this.gmsStatusValueProvider = provider4;
    }

    public static ApplicationModule_ProvidesFirstLaunchAnalyticsFactory create(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<AnalyticsLogger> provider2, Provider<SafetyNetClient> provider3, Provider<GmsStatusValueProvider> provider4) {
        return new ApplicationModule_ProvidesFirstLaunchAnalyticsFactory(applicationModule, provider, provider2, provider3, provider4);
    }

    public static FirstLaunchAnalytics providesFirstLaunchAnalytics(ApplicationModule applicationModule, AnalyticsManager analyticsManager, AnalyticsLogger analyticsLogger, SafetyNetClient safetyNetClient, GmsStatusValueProvider gmsStatusValueProvider2) {
        FirstLaunchAnalytics providesFirstLaunchAnalytics = applicationModule.providesFirstLaunchAnalytics(analyticsManager, analyticsLogger, safetyNetClient, gmsStatusValueProvider2);
        C10825c.m36718a(providesFirstLaunchAnalytics, "Cannot return null from a non-@Nullable @Provides method");
        return providesFirstLaunchAnalytics;
    }

    public FirstLaunchAnalytics get() {
        return providesFirstLaunchAnalytics(this.module, this.analyticsManagerProvider.get(), this.loggerProvider.get(), this.safetyNetClientProvider.get(), this.gmsStatusValueProvider.get());
    }
}
