package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsLogger;
import p015cm.aptoide.analytics.EventLogger;
import p015cm.aptoide.analytics.implementation.utils.MapToJsonMapper;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesRakamEventLoggerFactory */
public final class ApplicationModule_ProvidesRakamEventLoggerFactory implements C10824b<EventLogger> {
    private final Provider<AnalyticsLogger> loggerProvider;
    private final Provider<MapToJsonMapper> mapToJsonMapperProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesRakamEventLoggerFactory(ApplicationModule applicationModule, Provider<AnalyticsLogger> provider, Provider<MapToJsonMapper> provider2) {
        this.module = applicationModule;
        this.loggerProvider = provider;
        this.mapToJsonMapperProvider = provider2;
    }

    public static ApplicationModule_ProvidesRakamEventLoggerFactory create(ApplicationModule applicationModule, Provider<AnalyticsLogger> provider, Provider<MapToJsonMapper> provider2) {
        return new ApplicationModule_ProvidesRakamEventLoggerFactory(applicationModule, provider, provider2);
    }

    public static EventLogger providesRakamEventLogger(ApplicationModule applicationModule, AnalyticsLogger analyticsLogger, MapToJsonMapper mapToJsonMapper) {
        EventLogger providesRakamEventLogger = applicationModule.providesRakamEventLogger(analyticsLogger, mapToJsonMapper);
        C10825c.m36718a(providesRakamEventLogger, "Cannot return null from a non-@Nullable @Provides method");
        return providesRakamEventLogger;
    }

    public EventLogger get() {
        return providesRakamEventLogger(this.module, this.loggerProvider.get(), this.mapToJsonMapperProvider.get());
    }
}
