package p015cm.aptoide.p016pt;

import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideHomePromotionsIdFactory */
public final class ApplicationModule_ProvideHomePromotionsIdFactory implements C10824b<String> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideHomePromotionsIdFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideHomePromotionsIdFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideHomePromotionsIdFactory(applicationModule);
    }

    public static String provideHomePromotionsId(ApplicationModule applicationModule) {
        String provideHomePromotionsId = applicationModule.provideHomePromotionsId();
        C10825c.m36718a(provideHomePromotionsId, "Cannot return null from a non-@Nullable @Provides method");
        return provideHomePromotionsId;
    }

    public String get() {
        return provideHomePromotionsId(this.module);
    }
}
