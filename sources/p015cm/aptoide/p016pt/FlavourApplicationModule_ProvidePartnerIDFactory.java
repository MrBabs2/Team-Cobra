package p015cm.aptoide.p016pt;

import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.FlavourApplicationModule_ProvidePartnerIDFactory */
public final class FlavourApplicationModule_ProvidePartnerIDFactory implements C10824b<String> {
    private final FlavourApplicationModule module;

    public FlavourApplicationModule_ProvidePartnerIDFactory(FlavourApplicationModule flavourApplicationModule) {
        this.module = flavourApplicationModule;
    }

    public static FlavourApplicationModule_ProvidePartnerIDFactory create(FlavourApplicationModule flavourApplicationModule) {
        return new FlavourApplicationModule_ProvidePartnerIDFactory(flavourApplicationModule);
    }

    public static String providePartnerID(FlavourApplicationModule flavourApplicationModule) {
        String providePartnerID = flavourApplicationModule.providePartnerID();
        C10825c.m36718a(providePartnerID, "Cannot return null from a non-@Nullable @Provides method");
        return providePartnerID;
    }

    public String get() {
        return providePartnerID(this.module);
    }
}
