package p015cm.aptoide.p016pt;

import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideStoreNameFactory */
public final class ApplicationModule_ProvideStoreNameFactory implements C10824b<String> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideStoreNameFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideStoreNameFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideStoreNameFactory(applicationModule);
    }

    public static String provideStoreName(ApplicationModule applicationModule) {
        String provideStoreName = applicationModule.provideStoreName();
        C10825c.m36718a(provideStoreName, "Cannot return null from a non-@Nullable @Provides method");
        return provideStoreName;
    }

    public String get() {
        return provideStoreName(this.module);
    }
}
