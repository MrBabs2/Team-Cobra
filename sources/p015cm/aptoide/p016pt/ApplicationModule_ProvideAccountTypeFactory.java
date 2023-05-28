package p015cm.aptoide.p016pt;

import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideAccountTypeFactory */
public final class ApplicationModule_ProvideAccountTypeFactory implements C10824b<String> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideAccountTypeFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideAccountTypeFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideAccountTypeFactory(applicationModule);
    }

    public static String provideAccountType(ApplicationModule applicationModule) {
        String provideAccountType = applicationModule.provideAccountType();
        C10825c.m36718a(provideAccountType, "Cannot return null from a non-@Nullable @Provides method");
        return provideAccountType;
    }

    public String get() {
        return provideAccountType(this.module);
    }
}
