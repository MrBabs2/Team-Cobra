package p015cm.aptoide.p016pt;

import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAutoUpdateBaseHostFactory */
public final class ApplicationModule_ProvidesAutoUpdateBaseHostFactory implements C10824b<String> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAutoUpdateBaseHostFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesAutoUpdateBaseHostFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesAutoUpdateBaseHostFactory(applicationModule);
    }

    public static String providesAutoUpdateBaseHost(ApplicationModule applicationModule) {
        String providesAutoUpdateBaseHost = applicationModule.providesAutoUpdateBaseHost();
        C10825c.m36718a(providesAutoUpdateBaseHost, "Cannot return null from a non-@Nullable @Provides method");
        return providesAutoUpdateBaseHost;
    }

    public String get() {
        return providesAutoUpdateBaseHost(this.module);
    }
}
