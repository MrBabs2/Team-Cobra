package p015cm.aptoide.p016pt;

import p015cm.aptoide.p016pt.install.ForegroundManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesForegroundManagerFactory */
public final class ApplicationModule_ProvidesForegroundManagerFactory implements C10824b<ForegroundManager> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesForegroundManagerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesForegroundManagerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesForegroundManagerFactory(applicationModule);
    }

    public static ForegroundManager providesForegroundManager(ApplicationModule applicationModule) {
        ForegroundManager providesForegroundManager = applicationModule.providesForegroundManager();
        C10825c.m36718a(providesForegroundManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesForegroundManager;
    }

    public ForegroundManager get() {
        return providesForegroundManager(this.module);
    }
}
