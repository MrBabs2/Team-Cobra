package p015cm.aptoide.p016pt;

import android.content.res.Resources;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideResourcesFactory */
public final class ApplicationModule_ProvideResourcesFactory implements C10824b<Resources> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideResourcesFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideResourcesFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideResourcesFactory(applicationModule);
    }

    public static Resources provideResources(ApplicationModule applicationModule) {
        Resources provideResources = applicationModule.provideResources();
        C10825c.m36718a(provideResources, "Cannot return null from a non-@Nullable @Provides method");
        return provideResources;
    }

    public Resources get() {
        return provideResources(this.module);
    }
}
