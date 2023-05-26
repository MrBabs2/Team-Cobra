package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p015cm.aptoide.analytics.implementation.loggers.HttpKnockEventLogger;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesknockEventLoggerFactory */
public final class ApplicationModule_ProvidesknockEventLoggerFactory implements C10824b<HttpKnockEventLogger> {
    private final Provider<OkHttpClient> clientProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesknockEventLoggerFactory(ApplicationModule applicationModule, Provider<OkHttpClient> provider) {
        this.module = applicationModule;
        this.clientProvider = provider;
    }

    public static ApplicationModule_ProvidesknockEventLoggerFactory create(ApplicationModule applicationModule, Provider<OkHttpClient> provider) {
        return new ApplicationModule_ProvidesknockEventLoggerFactory(applicationModule, provider);
    }

    public static HttpKnockEventLogger providesknockEventLogger(ApplicationModule applicationModule, OkHttpClient okHttpClient) {
        HttpKnockEventLogger providesknockEventLogger = applicationModule.providesknockEventLogger(okHttpClient);
        C10825c.m36718a(providesknockEventLogger, "Cannot return null from a non-@Nullable @Provides method");
        return providesknockEventLogger;
    }

    public HttpKnockEventLogger get() {
        return providesknockEventLogger(this.module, this.clientProvider.get());
    }
}
