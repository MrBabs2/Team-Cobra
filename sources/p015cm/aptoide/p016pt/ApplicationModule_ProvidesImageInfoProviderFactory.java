package p015cm.aptoide.p016pt;

import p015cm.aptoide.p016pt.account.view.ImageInfoProvider;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesImageInfoProviderFactory */
public final class ApplicationModule_ProvidesImageInfoProviderFactory implements C10824b<ImageInfoProvider> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesImageInfoProviderFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesImageInfoProviderFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesImageInfoProviderFactory(applicationModule);
    }

    public static ImageInfoProvider providesImageInfoProvider(ApplicationModule applicationModule) {
        ImageInfoProvider providesImageInfoProvider = applicationModule.providesImageInfoProvider();
        C10825c.m36718a(providesImageInfoProvider, "Cannot return null from a non-@Nullable @Provides method");
        return providesImageInfoProvider;
    }

    public ImageInfoProvider get() {
        return providesImageInfoProvider(this.module);
    }
}
