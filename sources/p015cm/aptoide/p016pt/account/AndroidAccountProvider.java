package p015cm.aptoide.p016pt.account;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import p123rx.C5328b;
import p123rx.C5373h;
import p123rx.Single;

/* renamed from: cm.aptoide.pt.account.AndroidAccountProvider */
public class AndroidAccountProvider {
    private final String accountType;
    private final AccountManager androidAccountManager;
    private final C5373h scheduler;

    public AndroidAccountProvider(AccountManager accountManager, String str, C5373h hVar) {
        this.androidAccountManager = accountManager;
        this.accountType = str;
        this.scheduler = hVar;
    }

    /* renamed from: a */
    public /* synthetic */ Single mo6245a() throws Exception {
        Account[] accountsByType = this.androidAccountManager.getAccountsByType(this.accountType);
        if (accountsByType.length == 0) {
            return Single.m10120a((Throwable) new IllegalStateException("No account found."));
        }
        return Single.m10119a(accountsByType[0]);
    }

    public Single<Account> createAndroidAccount(String str) {
        Account account = new Account(str, this.accountType);
        try {
            this.androidAccountManager.addAccountExplicitly(account, (String) null, (Bundle) null);
            return Single.m10119a(account);
        } catch (SecurityException e) {
            return Single.m10120a((Throwable) e);
        }
    }

    public Single<Account> getAndroidAccount() {
        return Single.m10121a(new C1124h0(this)).mo18556a(this.scheduler);
    }

    public C5328b removeAndroidAccount() {
        return getAndroidAccount().mo18564b(new C1126i0(this)).mo18565b().mo18598b();
    }

    /* renamed from: a */
    public /* synthetic */ void mo6246a(Account account) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.androidAccountManager.removeAccountExplicitly(account);
        } else {
            this.androidAccountManager.removeAccount(account, (AccountManagerCallback) null, (Handler) null);
        }
    }
}
