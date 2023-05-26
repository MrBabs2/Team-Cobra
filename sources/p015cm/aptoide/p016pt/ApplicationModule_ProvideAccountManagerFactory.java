package p015cm.aptoide.p016pt;

import android.accounts.AccountManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideAccountManagerFactory */
public final class ApplicationModule_ProvideAccountManagerFactory implements C10824b<AccountManager> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideAccountManagerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideAccountManagerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideAccountManagerFactory(applicationModule);
    }

    public static AccountManager provideAccountManager(ApplicationModule applicationModule) {
        AccountManager provideAccountManager = applicationModule.provideAccountManager();
        C10825c.m36718a(provideAccountManager, "Cannot return null from a non-@Nullable @Provides method");
        return provideAccountManager;
    }

    public AccountManager get() {
        return provideAccountManager(this.module);
    }
}
