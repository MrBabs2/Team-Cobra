package p015cm.aptoide.p016pt;

import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.FlavourApplicationModule_ProvidesSupportEmailFactory */
public final class FlavourApplicationModule_ProvidesSupportEmailFactory implements C10824b<String> {
    private final FlavourApplicationModule module;

    public FlavourApplicationModule_ProvidesSupportEmailFactory(FlavourApplicationModule flavourApplicationModule) {
        this.module = flavourApplicationModule;
    }

    public static FlavourApplicationModule_ProvidesSupportEmailFactory create(FlavourApplicationModule flavourApplicationModule) {
        return new FlavourApplicationModule_ProvidesSupportEmailFactory(flavourApplicationModule);
    }

    public static String providesSupportEmail(FlavourApplicationModule flavourApplicationModule) {
        String providesSupportEmail = flavourApplicationModule.providesSupportEmail();
        C10825c.m36718a(providesSupportEmail, "Cannot return null from a non-@Nullable @Provides method");
        return providesSupportEmail;
    }

    public String get() {
        return providesSupportEmail(this.module);
    }
}
