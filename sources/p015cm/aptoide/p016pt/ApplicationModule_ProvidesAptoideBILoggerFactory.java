package p015cm.aptoide.p016pt;

import android.content.SharedPreferences;
import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsLogger;
import p015cm.aptoide.analytics.implementation.AptoideBiEventService;
import p015cm.aptoide.analytics.implementation.EventsPersistence;
import p015cm.aptoide.analytics.implementation.loggers.AptoideBiEventLogger;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAptoideBILoggerFactory */
public final class ApplicationModule_ProvidesAptoideBILoggerFactory implements C10824b<AptoideBiEventLogger> {
    private final Provider<AnalyticsLogger> debugLoggerProvider;
    private final ApplicationModule module;
    private final Provider<EventsPersistence> persistenceProvider;
    private final Provider<SharedPreferences> preferencesProvider;
    private final Provider<AptoideBiEventService> serviceProvider;

    public ApplicationModule_ProvidesAptoideBILoggerFactory(ApplicationModule applicationModule, Provider<EventsPersistence> provider, Provider<AptoideBiEventService> provider2, Provider<SharedPreferences> provider3, Provider<AnalyticsLogger> provider4) {
        this.module = applicationModule;
        this.persistenceProvider = provider;
        this.serviceProvider = provider2;
        this.preferencesProvider = provider3;
        this.debugLoggerProvider = provider4;
    }

    public static ApplicationModule_ProvidesAptoideBILoggerFactory create(ApplicationModule applicationModule, Provider<EventsPersistence> provider, Provider<AptoideBiEventService> provider2, Provider<SharedPreferences> provider3, Provider<AnalyticsLogger> provider4) {
        return new ApplicationModule_ProvidesAptoideBILoggerFactory(applicationModule, provider, provider2, provider3, provider4);
    }

    public static AptoideBiEventLogger providesAptoideBILogger(ApplicationModule applicationModule, EventsPersistence eventsPersistence, AptoideBiEventService aptoideBiEventService, SharedPreferences sharedPreferences, AnalyticsLogger analyticsLogger) {
        AptoideBiEventLogger providesAptoideBILogger = applicationModule.providesAptoideBILogger(eventsPersistence, aptoideBiEventService, sharedPreferences, analyticsLogger);
        C10825c.m36718a(providesAptoideBILogger, "Cannot return null from a non-@Nullable @Provides method");
        return providesAptoideBILogger;
    }

    public AptoideBiEventLogger get() {
        return providesAptoideBILogger(this.module, this.persistenceProvider.get(), this.serviceProvider.get(), this.preferencesProvider.get(), this.debugLoggerProvider.get());
    }
}
