package p015cm.aptoide.p016pt.account;

import android.accounts.AccountManager;
import java.util.List;
import p015cm.aptoide.accountmanager.Account;
import p015cm.aptoide.accountmanager.AccountFactory;
import p015cm.aptoide.accountmanager.AccountPersistence;
import p015cm.aptoide.accountmanager.Store;
import p015cm.aptoide.p016pt.networking.Authentication;
import p015cm.aptoide.p016pt.networking.AuthenticationPersistence;
import p123rx.C5328b;
import p123rx.C5373h;
import p123rx.Single;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.account.AndroidAccountManagerPersistence */
public class AndroidAccountManagerPersistence implements AccountPersistence {
    public static final String ACCOUNT_ACCESS_CONFIRMED = "access_confirmed";
    public static final String ACCOUNT_ACCESS_LEVEL = "access";
    public static final String ACCOUNT_ADULT_CONTENT_ENABLED = "aptoide_account_manager_mature_switch";
    public static final String ACCOUNT_AVATAR_URL = "useravatar";
    public static final String ACCOUNT_ID = "userId";
    public static final String ACCOUNT_NICKNAME = "username";
    private static final String ACCOUNT_PRIVACY_POLICY = "account_privacy_policy";
    public static final String ACCOUNT_STORE_AVATAR_URL = "storeAvatar";
    private static final String ACCOUNT_STORE_DOWNLOAD_COUNT = "account_store_download_count";
    private static final String ACCOUNT_STORE_ID = "account_store_id";
    public static final String ACCOUNT_STORE_NAME = "userRepo";
    private static final String ACCOUNT_STORE_PASSWORD = "account_store_password";
    private static final String ACCOUNT_STORE_THEME = "account_store_theme";
    private static final String ACCOUNT_STORE_USERNAME = "account_store_username";
    private static final String ACCOUNT_TERMS_AND_CONDITIONS = "account_terms_and_conditions";
    private Account accountCache;
    private final AccountFactory accountFactory;
    private final AccountManager androidAccountManager;
    private final AndroidAccountProvider androidAccountProvider;
    private final AuthenticationPersistence authenticationPersistence;
    private final C5373h scheduler;
    private final DatabaseStoreDataPersist storePersist;

    public AndroidAccountManagerPersistence(AccountManager accountManager, DatabaseStoreDataPersist databaseStoreDataPersist, AccountFactory accountFactory2, AndroidAccountProvider androidAccountProvider2, AuthenticationPersistence authenticationPersistence2, C5373h hVar) {
        this.androidAccountManager = accountManager;
        this.storePersist = databaseStoreDataPersist;
        this.accountFactory = accountFactory2;
        this.androidAccountProvider = androidAccountProvider2;
        this.authenticationPersistence = authenticationPersistence2;
        this.scheduler = hVar;
    }

    private Store createStore(android.accounts.Account account) {
        return new Store(Long.valueOf(this.androidAccountManager.getUserData(account, ACCOUNT_STORE_DOWNLOAD_COUNT)).longValue(), this.androidAccountManager.getUserData(account, ACCOUNT_STORE_AVATAR_URL), Long.valueOf(this.androidAccountManager.getUserData(account, ACCOUNT_STORE_ID)).longValue(), this.androidAccountManager.getUserData(account, ACCOUNT_STORE_NAME), this.androidAccountManager.getUserData(account, ACCOUNT_STORE_THEME), this.androidAccountManager.getUserData(account, ACCOUNT_STORE_USERNAME), this.androidAccountManager.getUserData(account, ACCOUNT_STORE_PASSWORD), true);
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo6242a(Account account, android.accounts.Account account2) {
        this.androidAccountManager.setUserData(account2, ACCOUNT_ID, account.getId());
        this.androidAccountManager.setUserData(account2, "username", account.getNickname());
        this.androidAccountManager.setUserData(account2, ACCOUNT_AVATAR_URL, account.getAvatar());
        this.androidAccountManager.setUserData(account2, ACCOUNT_ADULT_CONTENT_ENABLED, String.valueOf(account.isAdultContentEnabled()));
        this.androidAccountManager.setUserData(account2, ACCOUNT_ACCESS_LEVEL, account.getAccess().name());
        this.androidAccountManager.setUserData(account2, ACCOUNT_ACCESS_CONFIRMED, String.valueOf(account.isAccessConfirmed()));
        this.androidAccountManager.setUserData(account2, ACCOUNT_STORE_NAME, account.getStore().getName());
        this.androidAccountManager.setUserData(account2, ACCOUNT_STORE_AVATAR_URL, account.getStore().getAvatar());
        this.androidAccountManager.setUserData(account2, ACCOUNT_STORE_DOWNLOAD_COUNT, String.valueOf(account.getStore().getDownloadCount()));
        this.androidAccountManager.setUserData(account2, ACCOUNT_STORE_ID, String.valueOf(account.getStore().getId()));
        this.androidAccountManager.setUserData(account2, ACCOUNT_STORE_THEME, account.getStore().getTheme());
        this.androidAccountManager.setUserData(account2, ACCOUNT_STORE_USERNAME, account.getStore().getUsername());
        this.androidAccountManager.setUserData(account2, ACCOUNT_STORE_PASSWORD, account.getStore().getPassword());
        this.androidAccountManager.setUserData(account2, ACCOUNT_TERMS_AND_CONDITIONS, String.valueOf(account.acceptedTermsAndConditions()));
        this.androidAccountManager.setUserData(account2, ACCOUNT_PRIVACY_POLICY, String.valueOf(account.acceptedPrivacyPolicy()));
        return this.storePersist.persist(account.getSubscribedStores()).mo18589a((C5377a) new C1110a0(this, account));
    }

    public Single<Account> getAccount() {
        Account account = this.accountCache;
        if (account != null) {
            return Single.m10119a(account);
        }
        return this.androidAccountProvider.getAndroidAccount().mo18559a(new C1112b0(this));
    }

    public C5328b removeAccount() {
        return this.androidAccountProvider.removeAndroidAccount().mo18589a((C5377a) new C1116d0(this));
    }

    public C5328b saveAccount(Account account) {
        return this.androidAccountProvider.getAndroidAccount().mo18566b(new C1120f0(this, account)).mo18600b(this.scheduler);
    }

    /* renamed from: a */
    public /* synthetic */ void mo6244a(Account account) {
        this.accountCache = account;
    }

    /* renamed from: a */
    public /* synthetic */ Single mo6239a(android.accounts.Account account) {
        return this.storePersist.get().mo18558a((C5378b<Throwable>) C1118e0.f3537f).mo18559a(new C1114c0(this, this.androidAccountManager.getUserData(account, ACCOUNT_ACCESS_LEVEL), account, this.androidAccountManager.getUserData(account, ACCOUNT_PRIVACY_POLICY) != null ? Boolean.valueOf(this.androidAccountManager.getUserData(account, ACCOUNT_PRIVACY_POLICY)).booleanValue() : false, this.androidAccountManager.getUserData(account, ACCOUNT_TERMS_AND_CONDITIONS) != null ? Boolean.valueOf(this.androidAccountManager.getUserData(account, ACCOUNT_TERMS_AND_CONDITIONS)).booleanValue() : false));
    }

    /* renamed from: a */
    public /* synthetic */ Single mo6240a(String str, android.accounts.Account account, boolean z, boolean z2, List list) {
        return this.authenticationPersistence.getAuthentication().mo18559a(new C1122g0(this, str, list, account, z, z2));
    }

    /* renamed from: a */
    public /* synthetic */ Single mo6241a(String str, List list, android.accounts.Account account, boolean z, boolean z2, Authentication authentication) {
        android.accounts.Account account2 = account;
        if (!authentication.isAuthenticated()) {
            return Single.m10120a((Throwable) new IllegalStateException("Account not authenticated"));
        }
        return Single.m10119a(this.accountFactory.createAccount(str, list, this.androidAccountManager.getUserData(account2, ACCOUNT_ID), account2.name, this.androidAccountManager.getUserData(account2, "username"), this.androidAccountManager.getUserData(account2, ACCOUNT_AVATAR_URL), createStore(account2), Boolean.valueOf(this.androidAccountManager.getUserData(account2, ACCOUNT_ADULT_CONTENT_ENABLED)).booleanValue(), Boolean.valueOf(this.androidAccountManager.getUserData(account2, ACCOUNT_ACCESS_CONFIRMED)).booleanValue(), z, z2));
    }

    /* renamed from: a */
    public /* synthetic */ void mo6243a() {
        this.accountCache = null;
    }
}
