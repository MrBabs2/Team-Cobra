package p015cm.aptoide.p016pt;

import com.facebook.p032t.C4728g;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideAppEventsLoggerFactory */
public final class ApplicationModule_ProvideAppEventsLoggerFactory implements C10824b<C4728g> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideAppEventsLoggerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideAppEventsLoggerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideAppEventsLoggerFactory(applicationModule);
    }

    public static C4728g provideAppEventsLogger(ApplicationModule applicationModule) {
        C4728g provideAppEventsLogger = applicationModule.provideAppEventsLogger();
        C10825c.m36718a(provideAppEventsLogger, "Cannot return null from a non-@Nullable @Provides method");
        return provideAppEventsLogger;
    }

    public C4728g get() {
        return provideAppEventsLogger(this.module);
    }
}
