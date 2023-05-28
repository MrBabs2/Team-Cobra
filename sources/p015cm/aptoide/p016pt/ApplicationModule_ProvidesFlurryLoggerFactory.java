package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsLogger;
import p015cm.aptoide.analytics.implementation.loggers.FlurryEventLogger;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesFlurryLoggerFactory */
public final class ApplicationModule_ProvidesFlurryLoggerFactory implements C10824b<FlurryEventLogger> {
    private final Provider<AnalyticsLogger> loggerProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesFlurryLoggerFactory(ApplicationModule applicationModule, Provider<AnalyticsLogger> provider) {
        this.module = applicationModule;
        this.loggerProvider = provider;
    }

    public static ApplicationModule_ProvidesFlurryLoggerFactory create(ApplicationModule applicationModule, Provider<AnalyticsLogger> provider) {
        return new ApplicationModule_ProvidesFlurryLoggerFactory(applicationModule, provider);
    }

    public static FlurryEventLogger providesFlurryLogger(ApplicationModule applicationModule, AnalyticsLogger analyticsLogger) {
        FlurryEventLogger providesFlurryLogger = applicationModule.providesFlurryLogger(analyticsLogger);
        C10825c.m36718a(providesFlurryLogger, "Cannot return null from a non-@Nullable @Provides method");
        return providesFlurryLogger;
    }

    public FlurryEventLogger get() {
        return providesFlurryLogger(this.module, this.loggerProvider.get());
    }
}
