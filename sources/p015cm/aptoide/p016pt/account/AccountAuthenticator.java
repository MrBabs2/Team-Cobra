package p015cm.aptoide.p016pt.account;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.AccountManager;
import android.accounts.NetworkErrorException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.logger.Logger;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.account.AccountAuthenticator */
class AccountAuthenticator extends AbstractAccountAuthenticator {
    private static final String ARG_ACCOUNT_TYPE = "ACCOUNT_TYPE";
    private static final String ARG_AUTH_TYPE = "AUTH_TYPE";
    private static final String ARG_IS_ADDING_NEW_ACCOUNT = "IS_ADDING_ACCOUNT";
    private static final String ARG_OPTIONS_BUNDLE = "BE";
    private static final String AUTHTOKEN_TYPE_FULL_ACCESS = "Full access";
    private static final String AUTHTOKEN_TYPE_FULL_ACCESS_LABEL = "Full access to an Aptoide account";
    private static final String AUTHTOKEN_TYPE_READ_ONLY = "Read only";
    private static final String AUTHTOKEN_TYPE_READ_ONLY_LABEL = "Read only access to an Aptoide account";
    private static final String INVALID_AUTH_TOKEN_TYPE = "invalid authTokenType";
    private static final String TAG = AccountAuthenticator.class.getSimpleName();
    private final AptoideAccountManager accountManager;
    private final AccountManager androidAccountManager;
    private final CrashReport crashReport;
    private final Intent loginActivityBaseIntent;

    AccountAuthenticator(Context context, AptoideAccountManager aptoideAccountManager, CrashReport crashReport2, AccountManager accountManager2, Intent intent) {
        super(context);
        this.accountManager = aptoideAccountManager;
        this.crashReport = crashReport2;
        this.androidAccountManager = accountManager2;
        this.loginActivityBaseIntent = intent;
    }

    private Intent createAuthActivityIntent(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, Bundle bundle) {
        this.loginActivityBaseIntent.putExtra(ARG_ACCOUNT_TYPE, str);
        this.loginActivityBaseIntent.putExtra(ARG_AUTH_TYPE, str2);
        this.loginActivityBaseIntent.putExtra(ARG_IS_ADDING_NEW_ACCOUNT, true);
        this.loginActivityBaseIntent.putExtra(ARG_OPTIONS_BUNDLE, bundle);
        this.loginActivityBaseIntent.putExtra("accountAuthenticatorResponse", accountAuthenticatorResponse);
        return this.loginActivityBaseIntent;
    }

    private Bundle createAuthActivityIntentBundle(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String[] strArr, String str2, String str3, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("intent", createAuthActivityIntent(accountAuthenticatorResponse, str, str2, bundle));
        return bundle2;
    }

    /* renamed from: a */
    public /* synthetic */ void mo6215a(Throwable th) {
        this.crashReport.log(th);
    }

    public Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) throws NetworkErrorException {
        Logger instance = Logger.getInstance();
        String str3 = TAG;
        instance.mo12985v(str3, "Adding account: type=" + str);
        return createAuthActivityIntentBundle(accountAuthenticatorResponse, str, strArr, str2, (String) null, bundle);
    }

    public Bundle confirmCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, Bundle bundle) throws NetworkErrorException {
        return null;
    }

    public Bundle editProperties(AccountAuthenticatorResponse accountAuthenticatorResponse, String str) {
        return null;
    }

    public Bundle getAccountRemovalAllowed(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account) throws NetworkErrorException {
        Bundle accountRemovalAllowed = super.getAccountRemovalAllowed(accountAuthenticatorResponse, account);
        if (accountRemovalAllowed != null && accountRemovalAllowed.containsKey("booleanResult") && !accountRemovalAllowed.containsKey("intent") && accountRemovalAllowed.getBoolean("booleanResult")) {
            this.accountManager.logout().mo18590a((C5378b<? super Throwable>) new C1109a(this)).mo18598b().mo18609d();
        }
        return accountRemovalAllowed;
    }

    public Bundle getAuthToken(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) throws NetworkErrorException {
        if (!str.equals(AUTHTOKEN_TYPE_FULL_ACCESS)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("errorMessage", INVALID_AUTH_TOKEN_TYPE);
            return bundle2;
        }
        String peekAuthToken = this.androidAccountManager.peekAuthToken(account, str);
        Logger instance = Logger.getInstance();
        String str2 = TAG;
        instance.mo12985v(str2, "peekAuthToken returned - " + account + " " + peekAuthToken);
        Bundle bundle3 = new Bundle();
        bundle3.putString("authAccount", account.name);
        bundle3.putString("accountType", account.type);
        bundle3.putString("authtoken", peekAuthToken);
        Logger instance2 = Logger.getInstance();
        String str3 = TAG;
        instance2.mo12985v(str3, "getAuthToken returning - " + account + " " + peekAuthToken);
        return bundle3;
    }

    public String getAuthTokenLabel(String str) {
        if (AUTHTOKEN_TYPE_FULL_ACCESS.equals(str)) {
            return AUTHTOKEN_TYPE_FULL_ACCESS_LABEL;
        }
        if (AUTHTOKEN_TYPE_READ_ONLY.equals(str)) {
            return AUTHTOKEN_TYPE_READ_ONLY_LABEL;
        }
        return str + " (Label)";
    }

    public Bundle hasFeatures(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String[] strArr) throws NetworkErrorException {
        Bundle bundle = new Bundle();
        bundle.putBoolean("booleanResult", false);
        return bundle;
    }

    public Bundle updateCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) throws NetworkErrorException {
        return null;
    }
}
