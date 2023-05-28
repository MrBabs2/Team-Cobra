package p015cm.aptoide.p016pt;

import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideMarketNameFactory */
public final class ApplicationModule_ProvideMarketNameFactory implements C10824b<String> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideMarketNameFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideMarketNameFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideMarketNameFactory(applicationModule);
    }

    public static String provideMarketName(ApplicationModule applicationModule) {
        String provideMarketName = applicationModule.provideMarketName();
        C10825c.m36718a(provideMarketName, "Cannot return null from a non-@Nullable @Provides method");
        return provideMarketName;
    }

    public String get() {
        return provideMarketName(this.module);
    }
}
