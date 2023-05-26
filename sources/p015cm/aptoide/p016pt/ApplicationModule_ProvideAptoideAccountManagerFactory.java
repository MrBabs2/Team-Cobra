package p015cm.aptoide.p016pt;

import com.google.android.gms.common.api.GoogleApiClient;
import java.util.List;
import javax.inject.Provider;
import p015cm.aptoide.accountmanager.AccountPersistence;
import p015cm.aptoide.accountmanager.AccountService;
import p015cm.aptoide.accountmanager.AdultContent;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.account.LoginPreferences;
import p015cm.aptoide.p016pt.account.view.store.StoreManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideAptoideAccountManagerFactory */
public final class ApplicationModule_ProvideAptoideAccountManagerFactory implements C10824b<AptoideAccountManager> {
    private final Provider<AccountPersistence> accountPersistenceProvider;
    private final Provider<AccountService> accountServiceProvider;
    private final Provider<AdultContent> adultContentProvider;
    private final Provider<List<String>> facebookPermissionsProvider;
    private final Provider<GoogleApiClient> googleApiClientProvider;
    private final Provider<LoginPreferences> loginPreferencesProvider;
    private final ApplicationModule module;
    private final Provider<StoreManager> storeManagerProvider;

    public ApplicationModule_ProvideAptoideAccountManagerFactory(ApplicationModule applicationModule, Provider<AdultContent> provider, Provider<GoogleApiClient> provider2, Provider<StoreManager> provider3, Provider<AccountService> provider4, Provider<LoginPreferences> provider5, Provider<AccountPersistence> provider6, Provider<List<String>> provider7) {
        this.module = applicationModule;
        this.adultContentProvider = provider;
        this.googleApiClientProvider = provider2;
        this.storeManagerProvider = provider3;
        this.accountServiceProvider = provider4;
        this.loginPreferencesProvider = provider5;
        this.accountPersistenceProvider = provider6;
        this.facebookPermissionsProvider = provider7;
    }

    public static ApplicationModule_ProvideAptoideAccountManagerFactory create(ApplicationModule applicationModule, Provider<AdultContent> provider, Provider<GoogleApiClient> provider2, Provider<StoreManager> provider3, Provider<AccountService> provider4, Provider<LoginPreferences> provider5, Provider<AccountPersistence> provider6, Provider<List<String>> provider7) {
        return new ApplicationModule_ProvideAptoideAccountManagerFactory(applicationModule, provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static AptoideAccountManager provideAptoideAccountManager(ApplicationModule applicationModule, AdultContent adultContent, GoogleApiClient googleApiClient, StoreManager storeManager, AccountService accountService, LoginPreferences loginPreferences, AccountPersistence accountPersistence, List<String> list) {
        AptoideAccountManager provideAptoideAccountManager = applicationModule.provideAptoideAccountManager(adultContent, googleApiClient, storeManager, accountService, loginPreferences, accountPersistence, list);
        C10825c.m36718a(provideAptoideAccountManager, "Cannot return null from a non-@Nullable @Provides method");
        return provideAptoideAccountManager;
    }

    public AptoideAccountManager get() {
        return provideAptoideAccountManager(this.module, this.adultContentProvider.get(), this.googleApiClientProvider.get(), this.storeManagerProvider.get(), this.accountServiceProvider.get(), this.loginPreferencesProvider.get(), this.accountPersistenceProvider.get(), this.facebookPermissionsProvider.get());
    }
}
