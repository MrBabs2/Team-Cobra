package p015cm.aptoide.p016pt;

import p015cm.aptoide.p016pt.download.OemidProvider;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesOemidProviderFactory */
public final class ApplicationModule_ProvidesOemidProviderFactory implements C10824b<OemidProvider> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesOemidProviderFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesOemidProviderFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesOemidProviderFactory(applicationModule);
    }

    public static OemidProvider providesOemidProvider(ApplicationModule applicationModule) {
        OemidProvider providesOemidProvider = applicationModule.providesOemidProvider();
        C10825c.m36718a(providesOemidProvider, "Cannot return null from a non-@Nullable @Provides method");
        return providesOemidProvider;
    }

    public OemidProvider get() {
        return providesOemidProvider(this.module);
    }
}
