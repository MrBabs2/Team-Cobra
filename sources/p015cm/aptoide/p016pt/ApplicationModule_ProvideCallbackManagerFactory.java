package p015cm.aptoide.p016pt;

import com.facebook.C6365d;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideCallbackManagerFactory */
public final class ApplicationModule_ProvideCallbackManagerFactory implements C10824b<C6365d> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideCallbackManagerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideCallbackManagerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideCallbackManagerFactory(applicationModule);
    }

    public static C6365d provideCallbackManager(ApplicationModule applicationModule) {
        C6365d provideCallbackManager = applicationModule.provideCallbackManager();
        C10825c.m36718a(provideCallbackManager, "Cannot return null from a non-@Nullable @Provides method");
        return provideCallbackManager;
    }

    public C6365d get() {
        return provideCallbackManager(this.module);
    }
}
