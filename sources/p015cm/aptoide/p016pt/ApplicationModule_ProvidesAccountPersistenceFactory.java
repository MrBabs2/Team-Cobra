package p015cm.aptoide.p016pt;

import android.accounts.AccountManager;
import javax.inject.Provider;
import p015cm.aptoide.accountmanager.AccountFactory;
import p015cm.aptoide.accountmanager.AccountPersistence;
import p015cm.aptoide.p016pt.account.AndroidAccountProvider;
import p015cm.aptoide.p016pt.account.DatabaseStoreDataPersist;
import p015cm.aptoide.p016pt.networking.AuthenticationPersistence;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAccountPersistenceFactory */
public final class ApplicationModule_ProvidesAccountPersistenceFactory implements C10824b<AccountPersistence> {
    private final Provider<AccountFactory> accountFactoryProvider;
    private final Provider<AccountManager> accountManagerProvider;
    private final Provider<AndroidAccountProvider> androidAccountProvider;
    private final Provider<AuthenticationPersistence> authenticationPersistenceProvider;
    private final Provider<DatabaseStoreDataPersist> databaseStoreDataPersistProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAccountPersistenceFactory(ApplicationModule applicationModule, Provider<AccountManager> provider, Provider<DatabaseStoreDataPersist> provider2, Provider<AccountFactory> provider3, Provider<AndroidAccountProvider> provider4, Provider<AuthenticationPersistence> provider5) {
        this.module = applicationModule;
        this.accountManagerProvider = provider;
        this.databaseStoreDataPersistProvider = provider2;
        this.accountFactoryProvider = provider3;
        this.androidAccountProvider = provider4;
        this.authenticationPersistenceProvider = provider5;
    }

    public static ApplicationModule_ProvidesAccountPersistenceFactory create(ApplicationModule applicationModule, Provider<AccountManager> provider, Provider<DatabaseStoreDataPersist> provider2, Provider<AccountFactory> provider3, Provider<AndroidAccountProvider> provider4, Provider<AuthenticationPersistence> provider5) {
        return new ApplicationModule_ProvidesAccountPersistenceFactory(applicationModule, provider, provider2, provider3, provider4, provider5);
    }

    public static AccountPersistence providesAccountPersistence(ApplicationModule applicationModule, AccountManager accountManager, DatabaseStoreDataPersist databaseStoreDataPersist, AccountFactory accountFactory, AndroidAccountProvider androidAccountProvider2, AuthenticationPersistence authenticationPersistence) {
        AccountPersistence providesAccountPersistence = applicationModule.providesAccountPersistence(accountManager, databaseStoreDataPersist, accountFactory, androidAccountProvider2, authenticationPersistence);
        C10825c.m36718a(providesAccountPersistence, "Cannot return null from a non-@Nullable @Provides method");
        return providesAccountPersistence;
    }

    public AccountPersistence get() {
        return providesAccountPersistence(this.module, this.accountManagerProvider.get(), this.databaseStoreDataPersistProvider.get(), this.accountFactoryProvider.get(), this.androidAccountProvider.get(), this.authenticationPersistenceProvider.get());
    }
}
