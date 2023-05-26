package p015cm.aptoide.p016pt;

import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideExtraIDFactory */
public final class ApplicationModule_ProvideExtraIDFactory implements C10824b<String> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideExtraIDFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideExtraIDFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideExtraIDFactory(applicationModule);
    }

    public static String provideExtraID(ApplicationModule applicationModule) {
        String provideExtraID = applicationModule.provideExtraID();
        C10825c.m36718a(provideExtraID, "Cannot return null from a non-@Nullable @Provides method");
        return provideExtraID;
    }

    public String get() {
        return provideExtraID(this.module);
    }
}
