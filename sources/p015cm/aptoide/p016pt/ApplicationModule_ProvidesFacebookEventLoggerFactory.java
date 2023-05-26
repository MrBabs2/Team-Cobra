package p015cm.aptoide.p016pt;

import com.facebook.p032t.C4728g;
import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsLogger;
import p015cm.aptoide.analytics.EventLogger;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesFacebookEventLoggerFactory */
public final class ApplicationModule_ProvidesFacebookEventLoggerFactory implements C10824b<EventLogger> {
    private final Provider<C4728g> facebookProvider;
    private final Provider<AnalyticsLogger> loggerProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesFacebookEventLoggerFactory(ApplicationModule applicationModule, Provider<C4728g> provider, Provider<AnalyticsLogger> provider2) {
        this.module = applicationModule;
        this.facebookProvider = provider;
        this.loggerProvider = provider2;
    }

    public static ApplicationModule_ProvidesFacebookEventLoggerFactory create(ApplicationModule applicationModule, Provider<C4728g> provider, Provider<AnalyticsLogger> provider2) {
        return new ApplicationModule_ProvidesFacebookEventLoggerFactory(applicationModule, provider, provider2);
    }

    public static EventLogger providesFacebookEventLogger(ApplicationModule applicationModule, C4728g gVar, AnalyticsLogger analyticsLogger) {
        EventLogger providesFacebookEventLogger = applicationModule.providesFacebookEventLogger(gVar, analyticsLogger);
        C10825c.m36718a(providesFacebookEventLogger, "Cannot return null from a non-@Nullable @Provides method");
        return providesFacebookEventLogger;
    }

    public EventLogger get() {
        return providesFacebookEventLogger(this.module, this.facebookProvider.get(), this.loggerProvider.get());
    }
}
