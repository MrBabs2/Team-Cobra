package p015cm.aptoide.p016pt;

import p015cm.aptoide.analytics.AnalyticsLogger;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAnalyticsDebugLoggerFactory */
public final class ApplicationModule_ProvidesAnalyticsDebugLoggerFactory implements C10824b<AnalyticsLogger> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAnalyticsDebugLoggerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesAnalyticsDebugLoggerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesAnalyticsDebugLoggerFactory(applicationModule);
    }

    public static AnalyticsLogger providesAnalyticsDebugLogger(ApplicationModule applicationModule) {
        AnalyticsLogger providesAnalyticsDebugLogger = applicationModule.providesAnalyticsDebugLogger();
        C10825c.m36718a(providesAnalyticsDebugLogger, "Cannot return null from a non-@Nullable @Provides method");
        return providesAnalyticsDebugLogger;
    }

    public AnalyticsLogger get() {
        return providesAnalyticsDebugLogger(this.module);
    }
}
