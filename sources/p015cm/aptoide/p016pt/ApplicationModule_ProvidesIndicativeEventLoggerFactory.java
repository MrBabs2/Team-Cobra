package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsLogger;
import p015cm.aptoide.analytics.EventLogger;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesIndicativeEventLoggerFactory */
public final class ApplicationModule_ProvidesIndicativeEventLoggerFactory implements C10824b<EventLogger> {
    private final Provider<AnalyticsLogger> loggerProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesIndicativeEventLoggerFactory(ApplicationModule applicationModule, Provider<AnalyticsLogger> provider) {
        this.module = applicationModule;
        this.loggerProvider = provider;
    }

    public static ApplicationModule_ProvidesIndicativeEventLoggerFactory create(ApplicationModule applicationModule, Provider<AnalyticsLogger> provider) {
        return new ApplicationModule_ProvidesIndicativeEventLoggerFactory(applicationModule, provider);
    }

    public static EventLogger providesIndicativeEventLogger(ApplicationModule applicationModule, AnalyticsLogger analyticsLogger) {
        EventLogger providesIndicativeEventLogger = applicationModule.providesIndicativeEventLogger(analyticsLogger);
        C10825c.m36718a(providesIndicativeEventLogger, "Cannot return null from a non-@Nullable @Provides method");
        return providesIndicativeEventLogger;
    }

    public EventLogger get() {
        return providesIndicativeEventLogger(this.module, this.loggerProvider.get());
    }
}
