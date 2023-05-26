package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.analytics.EventLogger;
import p015cm.aptoide.analytics.implementation.loggers.AptoideBiEventLogger;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAptoideEventLoggerFactory */
public final class ApplicationModule_ProvidesAptoideEventLoggerFactory implements C10824b<EventLogger> {
    private final Provider<AptoideBiEventLogger> aptoideBiEventLoggerProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAptoideEventLoggerFactory(ApplicationModule applicationModule, Provider<AptoideBiEventLogger> provider) {
        this.module = applicationModule;
        this.aptoideBiEventLoggerProvider = provider;
    }

    public static ApplicationModule_ProvidesAptoideEventLoggerFactory create(ApplicationModule applicationModule, Provider<AptoideBiEventLogger> provider) {
        return new ApplicationModule_ProvidesAptoideEventLoggerFactory(applicationModule, provider);
    }

    public static EventLogger providesAptoideEventLogger(ApplicationModule applicationModule, AptoideBiEventLogger aptoideBiEventLogger) {
        EventLogger providesAptoideEventLogger = applicationModule.providesAptoideEventLogger(aptoideBiEventLogger);
        C10825c.m36718a(providesAptoideEventLogger, "Cannot return null from a non-@Nullable @Provides method");
        return providesAptoideEventLogger;
    }

    public EventLogger get() {
        return providesAptoideEventLogger(this.module, this.aptoideBiEventLoggerProvider.get());
    }
}
