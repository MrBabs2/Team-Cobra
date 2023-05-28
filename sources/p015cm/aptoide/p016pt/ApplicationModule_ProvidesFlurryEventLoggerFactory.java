package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.analytics.EventLogger;
import p015cm.aptoide.analytics.implementation.loggers.FlurryEventLogger;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesFlurryEventLoggerFactory */
public final class ApplicationModule_ProvidesFlurryEventLoggerFactory implements C10824b<EventLogger> {
    private final Provider<FlurryEventLogger> eventLoggerProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesFlurryEventLoggerFactory(ApplicationModule applicationModule, Provider<FlurryEventLogger> provider) {
        this.module = applicationModule;
        this.eventLoggerProvider = provider;
    }

    public static ApplicationModule_ProvidesFlurryEventLoggerFactory create(ApplicationModule applicationModule, Provider<FlurryEventLogger> provider) {
        return new ApplicationModule_ProvidesFlurryEventLoggerFactory(applicationModule, provider);
    }

    public static EventLogger providesFlurryEventLogger(ApplicationModule applicationModule, FlurryEventLogger flurryEventLogger) {
        EventLogger providesFlurryEventLogger = applicationModule.providesFlurryEventLogger(flurryEventLogger);
        C10825c.m36718a(providesFlurryEventLogger, "Cannot return null from a non-@Nullable @Provides method");
        return providesFlurryEventLogger;
    }

    public EventLogger get() {
        return providesFlurryEventLogger(this.module, this.eventLoggerProvider.get());
    }
}
