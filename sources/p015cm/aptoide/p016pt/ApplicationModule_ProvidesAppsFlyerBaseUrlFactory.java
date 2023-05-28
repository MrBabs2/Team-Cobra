package p015cm.aptoide.p016pt;

import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAppsFlyerBaseUrlFactory */
public final class ApplicationModule_ProvidesAppsFlyerBaseUrlFactory implements C10824b<String> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAppsFlyerBaseUrlFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesAppsFlyerBaseUrlFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesAppsFlyerBaseUrlFactory(applicationModule);
    }

    public static String providesAppsFlyerBaseUrl(ApplicationModule applicationModule) {
        String providesAppsFlyerBaseUrl = applicationModule.providesAppsFlyerBaseUrl();
        C10825c.m36718a(providesAppsFlyerBaseUrl, "Cannot return null from a non-@Nullable @Provides method");
        return providesAppsFlyerBaseUrl;
    }

    public String get() {
        return providesAppsFlyerBaseUrl(this.module);
    }
}
