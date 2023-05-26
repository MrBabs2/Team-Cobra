package p015cm.aptoide.p016pt;

import java.util.Collection;
import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsLogger;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.EventLogger;
import p015cm.aptoide.analytics.SessionLogger;
import p015cm.aptoide.analytics.implementation.loggers.HttpKnockEventLogger;
import p015cm.aptoide.analytics.implementation.utils.AnalyticsEventParametersNormalizer;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAnalyticsManagerFactory */
public final class ApplicationModule_ProvidesAnalyticsManagerFactory implements C10824b<AnalyticsManager> {
    private final Provider<AnalyticsEventParametersNormalizer> analyticsNormalizerProvider;
    private final Provider<EventLogger> aptoideBiEventLoggerProvider;
    private final Provider<Collection<String>> aptoideEventsProvider;
    private final Provider<SessionLogger> aptoideSessionLoggerProvider;
    private final Provider<EventLogger> facebookEventLoggerProvider;
    private final Provider<Collection<String>> facebookEventsProvider;
    private final Provider<EventLogger> flurryEventLoggerProvider;
    private final Provider<Collection<String>> flurryEventsProvider;
    private final Provider<SessionLogger> flurrySessionLoggerProvider;
    private final Provider<EventLogger> indicativeEventLoggerProvider;
    private final Provider<Collection<String>> indicativeEventsProvider;
    private final Provider<HttpKnockEventLogger> knockEventLoggerProvider;
    private final Provider<AnalyticsLogger> loggerProvider;
    private final ApplicationModule module;
    private final Provider<EventLogger> rakamEventLoggerProvider;
    private final Provider<Collection<String>> rakamEventsProvider;

    public ApplicationModule_ProvidesAnalyticsManagerFactory(ApplicationModule applicationModule, Provider<EventLogger> provider, Provider<EventLogger> provider2, Provider<EventLogger> provider3, Provider<HttpKnockEventLogger> provider4, Provider<Collection<String>> provider5, Provider<Collection<String>> provider6, Provider<Collection<String>> provider7, Provider<SessionLogger> provider8, Provider<SessionLogger> provider9, Provider<AnalyticsEventParametersNormalizer> provider10, Provider<EventLogger> provider11, Provider<Collection<String>> provider12, Provider<EventLogger> provider13, Provider<Collection<String>> provider14, Provider<AnalyticsLogger> provider15) {
        this.module = applicationModule;
        this.aptoideBiEventLoggerProvider = provider;
        this.facebookEventLoggerProvider = provider2;
        this.flurryEventLoggerProvider = provider3;
        this.knockEventLoggerProvider = provider4;
        this.aptoideEventsProvider = provider5;
        this.facebookEventsProvider = provider6;
        this.flurryEventsProvider = provider7;
        this.flurrySessionLoggerProvider = provider8;
        this.aptoideSessionLoggerProvider = provider9;
        this.analyticsNormalizerProvider = provider10;
        this.rakamEventLoggerProvider = provider11;
        this.rakamEventsProvider = provider12;
        this.indicativeEventLoggerProvider = provider13;
        this.indicativeEventsProvider = provider14;
        this.loggerProvider = provider15;
    }

    public static ApplicationModule_ProvidesAnalyticsManagerFactory create(ApplicationModule applicationModule, Provider<EventLogger> provider, Provider<EventLogger> provider2, Provider<EventLogger> provider3, Provider<HttpKnockEventLogger> provider4, Provider<Collection<String>> provider5, Provider<Collection<String>> provider6, Provider<Collection<String>> provider7, Provider<SessionLogger> provider8, Provider<SessionLogger> provider9, Provider<AnalyticsEventParametersNormalizer> provider10, Provider<EventLogger> provider11, Provider<Collection<String>> provider12, Provider<EventLogger> provider13, Provider<Collection<String>> provider14, Provider<AnalyticsLogger> provider15) {
        return new ApplicationModule_ProvidesAnalyticsManagerFactory(applicationModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15);
    }

    public static AnalyticsManager providesAnalyticsManager(ApplicationModule applicationModule, EventLogger eventLogger, EventLogger eventLogger2, EventLogger eventLogger3, HttpKnockEventLogger httpKnockEventLogger, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, SessionLogger sessionLogger, SessionLogger sessionLogger2, AnalyticsEventParametersNormalizer analyticsEventParametersNormalizer, EventLogger eventLogger4, Collection<String> collection4, EventLogger eventLogger5, Collection<String> collection5, AnalyticsLogger analyticsLogger) {
        AnalyticsManager providesAnalyticsManager = applicationModule.providesAnalyticsManager(eventLogger, eventLogger2, eventLogger3, httpKnockEventLogger, collection, collection2, collection3, sessionLogger, sessionLogger2, analyticsEventParametersNormalizer, eventLogger4, collection4, eventLogger5, collection5, analyticsLogger);
        C10825c.m36718a(providesAnalyticsManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesAnalyticsManager;
    }

    public AnalyticsManager get() {
        return providesAnalyticsManager(this.module, this.aptoideBiEventLoggerProvider.get(), this.facebookEventLoggerProvider.get(), this.flurryEventLoggerProvider.get(), this.knockEventLoggerProvider.get(), this.aptoideEventsProvider.get(), this.facebookEventsProvider.get(), this.flurryEventsProvider.get(), this.flurrySessionLoggerProvider.get(), this.aptoideSessionLoggerProvider.get(), this.analyticsNormalizerProvider.get(), this.rakamEventLoggerProvider.get(), this.rakamEventsProvider.get(), this.indicativeEventLoggerProvider.get(), this.indicativeEventsProvider.get(), this.loggerProvider.get());
    }
}
