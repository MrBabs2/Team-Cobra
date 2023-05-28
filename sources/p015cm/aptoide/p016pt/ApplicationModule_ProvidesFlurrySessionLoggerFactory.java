package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.analytics.SessionLogger;
import p015cm.aptoide.analytics.implementation.loggers.FlurryEventLogger;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesFlurrySessionLoggerFactory */
public final class ApplicationModule_ProvidesFlurrySessionLoggerFactory implements C10824b<SessionLogger> {
    private final Provider<FlurryEventLogger> eventLoggerProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesFlurrySessionLoggerFactory(ApplicationModule applicationModule, Provider<FlurryEventLogger> provider) {
        this.module = applicationModule;
        this.eventLoggerProvider = provider;
    }

    public static ApplicationModule_ProvidesFlurrySessionLoggerFactory create(ApplicationModule applicationModule, Provider<FlurryEventLogger> provider) {
        return new ApplicationModule_ProvidesFlurrySessionLoggerFactory(applicationModule, provider);
    }

    public static SessionLogger providesFlurrySessionLogger(ApplicationModule applicationModule, FlurryEventLogger flurryEventLogger) {
        SessionLogger providesFlurrySessionLogger = applicationModule.providesFlurrySessionLogger(flurryEventLogger);
        C10825c.m36718a(providesFlurrySessionLogger, "Cannot return null from a non-@Nullable @Provides method");
        return providesFlurrySessionLogger;
    }

    public SessionLogger get() {
        return providesFlurrySessionLogger(this.module, this.eventLoggerProvider.get());
    }
}
