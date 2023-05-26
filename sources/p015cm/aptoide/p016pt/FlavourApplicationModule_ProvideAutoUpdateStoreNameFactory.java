package p015cm.aptoide.p016pt;

import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.FlavourApplicationModule_ProvideAutoUpdateStoreNameFactory */
public final class FlavourApplicationModule_ProvideAutoUpdateStoreNameFactory implements C10824b<String> {
    private final FlavourApplicationModule module;

    public FlavourApplicationModule_ProvideAutoUpdateStoreNameFactory(FlavourApplicationModule flavourApplicationModule) {
        this.module = flavourApplicationModule;
    }

    public static FlavourApplicationModule_ProvideAutoUpdateStoreNameFactory create(FlavourApplicationModule flavourApplicationModule) {
        return new FlavourApplicationModule_ProvideAutoUpdateStoreNameFactory(flavourApplicationModule);
    }

    public static String provideAutoUpdateStoreName(FlavourApplicationModule flavourApplicationModule) {
        String provideAutoUpdateStoreName = flavourApplicationModule.provideAutoUpdateStoreName();
        C10825c.m36718a(provideAutoUpdateStoreName, "Cannot return null from a non-@Nullable @Provides method");
        return provideAutoUpdateStoreName;
    }

    public String get() {
        return provideAutoUpdateStoreName(this.module);
    }
}
