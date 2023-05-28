package p015cm.aptoide.p016pt;

import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideCachePathFactory */
public final class ApplicationModule_ProvideCachePathFactory implements C10824b<String> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideCachePathFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideCachePathFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideCachePathFactory(applicationModule);
    }

    public static String provideCachePath(ApplicationModule applicationModule) {
        String provideCachePath = applicationModule.provideCachePath();
        C10825c.m36718a(provideCachePath, "Cannot return null from a non-@Nullable @Provides method");
        return provideCachePath;
    }

    public String get() {
        return provideCachePath(this.module);
    }
}
