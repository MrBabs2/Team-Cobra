package p015cm.aptoide.p016pt;

import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesGmsStatusValueProviderFactory */
public final class ApplicationModule_ProvidesGmsStatusValueProviderFactory implements C10824b<GmsStatusValueProvider> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesGmsStatusValueProviderFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesGmsStatusValueProviderFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesGmsStatusValueProviderFactory(applicationModule);
    }

    public static GmsStatusValueProvider providesGmsStatusValueProvider(ApplicationModule applicationModule) {
        GmsStatusValueProvider providesGmsStatusValueProvider = applicationModule.providesGmsStatusValueProvider();
        C10825c.m36718a(providesGmsStatusValueProvider, "Cannot return null from a non-@Nullable @Provides method");
        return providesGmsStatusValueProvider;
    }

    public GmsStatusValueProvider get() {
        return providesGmsStatusValueProvider(this.module);
    }
}
