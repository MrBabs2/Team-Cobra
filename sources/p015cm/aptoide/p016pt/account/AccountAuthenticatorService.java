package p015cm.aptoide.p016pt.account;

import android.accounts.AccountManager;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.account.view.LoginActivity;
import p015cm.aptoide.p016pt.crashreports.CrashReport;

/* renamed from: cm.aptoide.pt.account.AccountAuthenticatorService */
public class AccountAuthenticatorService extends Service {
    public IBinder onBind(Intent intent) {
        return new AccountAuthenticator(this, ((AptoideApplication) getApplicationContext()).getAccountManager(), CrashReport.getInstance(), AccountManager.get(getApplicationContext()), new Intent(getApplicationContext(), LoginActivity.class)).getIBinder();
    }
}
