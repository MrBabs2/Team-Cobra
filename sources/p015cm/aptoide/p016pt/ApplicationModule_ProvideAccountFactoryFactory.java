package p015cm.aptoide.p016pt;

import p015cm.aptoide.accountmanager.AccountFactory;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideAccountFactoryFactory */
public final class ApplicationModule_ProvideAccountFactoryFactory implements C10824b<AccountFactory> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideAccountFactoryFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideAccountFactoryFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideAccountFactoryFactory(applicationModule);
    }

    public static AccountFactory provideAccountFactory(ApplicationModule applicationModule) {
        AccountFactory provideAccountFactory = applicationModule.provideAccountFactory();
        C10825c.m36718a(provideAccountFactory, "Cannot return null from a non-@Nullable @Provides method");
        return provideAccountFactory;
    }

    public AccountFactory get() {
        return provideAccountFactory(this.module);
    }
}
