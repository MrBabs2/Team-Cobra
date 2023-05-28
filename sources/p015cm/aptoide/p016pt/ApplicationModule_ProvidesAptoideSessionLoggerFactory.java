package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.analytics.SessionLogger;
import p015cm.aptoide.analytics.implementation.loggers.AptoideBiEventLogger;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAptoideSessionLoggerFactory */
public final class ApplicationModule_ProvidesAptoideSessionLoggerFactory implements C10824b<SessionLogger> {
    private final Provider<AptoideBiEventLogger> aptoideBiEventLoggerProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAptoideSessionLoggerFactory(ApplicationModule applicationModule, Provider<AptoideBiEventLogger> provider) {
        this.module = applicationModule;
        this.aptoideBiEventLoggerProvider = provider;
    }

    public static ApplicationModule_ProvidesAptoideSessionLoggerFactory create(ApplicationModule applicationModule, Provider<AptoideBiEventLogger> provider) {
        return new ApplicationModule_ProvidesAptoideSessionLoggerFactory(applicationModule, provider);
    }

    public static SessionLogger providesAptoideSessionLogger(ApplicationModule applicationModule, AptoideBiEventLogger aptoideBiEventLogger) {
        SessionLogger providesAptoideSessionLogger = applicationModule.providesAptoideSessionLogger(aptoideBiEventLogger);
        C10825c.m36718a(providesAptoideSessionLogger, "Cannot return null from a non-@Nullable @Provides method");
        return providesAptoideSessionLogger;
    }

    public SessionLogger get() {
        return providesAptoideSessionLogger(this.module, this.aptoideBiEventLoggerProvider.get());
    }
}
