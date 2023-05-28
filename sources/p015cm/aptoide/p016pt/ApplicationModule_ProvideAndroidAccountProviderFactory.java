package p015cm.aptoide.p016pt;

import android.accounts.AccountManager;
import javax.inject.Provider;
import p015cm.aptoide.p016pt.account.AndroidAccountProvider;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideAndroidAccountProviderFactory */
public final class ApplicationModule_ProvideAndroidAccountProviderFactory implements C10824b<AndroidAccountProvider> {
    private final Provider<AccountManager> accountManagerProvider;
    private final Provider<String> accountTypeProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvideAndroidAccountProviderFactory(ApplicationModule applicationModule, Provider<AccountManager> provider, Provider<String> provider2) {
        this.module = applicationModule;
        this.accountManagerProvider = provider;
        this.accountTypeProvider = provider2;
    }

    public static ApplicationModule_ProvideAndroidAccountProviderFactory create(ApplicationModule applicationModule, Provider<AccountManager> provider, Provider<String> provider2) {
        return new ApplicationModule_ProvideAndroidAccountProviderFactory(applicationModule, provider, provider2);
    }

    public static AndroidAccountProvider provideAndroidAccountProvider(ApplicationModule applicationModule, AccountManager accountManager, String str) {
        AndroidAccountProvider provideAndroidAccountProvider = applicationModule.provideAndroidAccountProvider(accountManager, str);
        C10825c.m36718a(provideAndroidAccountProvider, "Cannot return null from a non-@Nullable @Provides method");
        return provideAndroidAccountProvider;
    }

    public AndroidAccountProvider get() {
        return provideAndroidAccountProvider(this.module, this.accountManagerProvider.get(), this.accountTypeProvider.get());
    }
}
