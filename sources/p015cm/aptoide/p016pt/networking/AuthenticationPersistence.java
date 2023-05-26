package p015cm.aptoide.p016pt.networking;

import android.accounts.Account;
import android.accounts.AccountManager;
import p015cm.aptoide.p016pt.account.AndroidAccountProvider;
import p123rx.C5328b;
import p123rx.Single;

/* renamed from: cm.aptoide.pt.networking.AuthenticationPersistence */
public class AuthenticationPersistence {
    public static final String ACCOUNT_ACCESS_TOKEN = "access_token";
    public static final String ACCOUNT_REFRESH_TOKEN = "refresh_token";
    public static final String ACCOUNT_TYPE = "aptoide_account_manager_login_mode";
    private final AccountManager androidAccountManager;
    private final AndroidAccountProvider androidAccountProvider;

    public AuthenticationPersistence(AndroidAccountProvider androidAccountProvider2, AccountManager accountManager) {
        this.androidAccountProvider = androidAccountProvider2;
        this.androidAccountManager = accountManager;
    }

    /* renamed from: a */
    public /* synthetic */ Authentication mo13040a(Account account) {
        return new Authentication(account.name, this.androidAccountManager.getUserData(account, ACCOUNT_REFRESH_TOKEN), this.androidAccountManager.getUserData(account, "access_token"), this.androidAccountManager.getPassword(account), this.androidAccountManager.getUserData(account, ACCOUNT_TYPE));
    }

    public C5328b createAuthentication(String str, String str2, String str3, String str4, String str5) {
        return this.androidAccountProvider.createAndroidAccount(str).mo18564b(new C3431b(this, str3, str4, str2, str5)).mo18565b();
    }

    public Single<Authentication> getAuthentication() {
        return this.androidAccountProvider.getAndroidAccount().mo18569d(new C3433d(this)).mo18571f(C3430a.f6400f);
    }

    public C5328b removeAuthentication() {
        return this.androidAccountProvider.removeAndroidAccount();
    }

    public C5328b updateAuthentication(String str) {
        return this.androidAccountProvider.getAndroidAccount().mo18564b(new C3432c(this, str)).mo18565b();
    }

    /* renamed from: a */
    static /* synthetic */ Authentication m6525a(Throwable th) {
        return new Authentication("", "", "", "", "");
    }

    /* renamed from: a */
    public /* synthetic */ void mo13041a(String str, Account account) {
        this.androidAccountManager.setUserData(account, "access_token", str);
    }

    /* renamed from: a */
    public /* synthetic */ void mo13042a(String str, String str2, String str3, String str4, Account account) {
        this.androidAccountManager.setUserData(account, ACCOUNT_REFRESH_TOKEN, str);
        this.androidAccountManager.setUserData(account, "access_token", str2);
        this.androidAccountManager.setPassword(account, str3);
        this.androidAccountManager.setUserData(account, ACCOUNT_TYPE, str4);
    }
}
