package p015cm.aptoide.p016pt;

import p015cm.aptoide.analytics.implementation.utils.AnalyticsEventParametersNormalizer;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAnalyticsNormalizerFactory */
public final class ApplicationModule_ProvidesAnalyticsNormalizerFactory implements C10824b<AnalyticsEventParametersNormalizer> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAnalyticsNormalizerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesAnalyticsNormalizerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesAnalyticsNormalizerFactory(applicationModule);
    }

    public static AnalyticsEventParametersNormalizer providesAnalyticsNormalizer(ApplicationModule applicationModule) {
        AnalyticsEventParametersNormalizer providesAnalyticsNormalizer = applicationModule.providesAnalyticsNormalizer();
        C10825c.m36718a(providesAnalyticsNormalizer, "Cannot return null from a non-@Nullable @Provides method");
        return providesAnalyticsNormalizer;
    }

    public AnalyticsEventParametersNormalizer get() {
        return providesAnalyticsNormalizer(this.module);
    }
}
