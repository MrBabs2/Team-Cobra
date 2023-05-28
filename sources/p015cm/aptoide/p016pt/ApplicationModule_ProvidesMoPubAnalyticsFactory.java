package p015cm.aptoide.p016pt;

import p015cm.aptoide.p016pt.ads.MoPubAnalytics;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesMoPubAnalyticsFactory */
public final class ApplicationModule_ProvidesMoPubAnalyticsFactory implements C10824b<MoPubAnalytics> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesMoPubAnalyticsFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesMoPubAnalyticsFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesMoPubAnalyticsFactory(applicationModule);
    }

    public static MoPubAnalytics providesMoPubAnalytics(ApplicationModule applicationModule) {
        MoPubAnalytics providesMoPubAnalytics = applicationModule.providesMoPubAnalytics();
        C10825c.m36718a(providesMoPubAnalytics, "Cannot return null from a non-@Nullable @Provides method");
        return providesMoPubAnalytics;
    }

    public MoPubAnalytics get() {
        return providesMoPubAnalytics(this.module);
    }
}
