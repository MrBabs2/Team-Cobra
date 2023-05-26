package p015cm.aptoide.p016pt.install;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.install.RootInstallNotificationEventReceiver */
public class RootInstallNotificationEventReceiver extends BroadcastReceiver {
    public static final String ROOT_INSTALL_DISMISS_ACTION = "cm.aptoide.pt.ROOT_INSTALL_DISMISS_ACTION";
    public static final String ROOT_INSTALL_RETRY_ACTION = "cm.aptoide.pt.ROOT_INSTALL_RETRY_ACTION";
    private static final String TAG = RootInstallNotificationEventReceiver.class.getSimpleName();
    private CrashReport crashReport;
    private InstallManager installManager;

    /* renamed from: a */
    static /* synthetic */ void m6456a() {
    }

    /* renamed from: b */
    static /* synthetic */ void m6457b() {
    }

    /* renamed from: a */
    public /* synthetic */ void mo12822a(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: b */
    public /* synthetic */ void mo12823b(Throwable th) {
        this.crashReport.log(th);
    }

    public void onReceive(Context context, Intent intent) {
        this.installManager = ((AptoideApplication) context.getApplicationContext()).getInstallManager();
        this.crashReport = CrashReport.getInstance();
        if (intent != null && intent.getAction() != null) {
            String action = intent.getAction();
            char c = 65535;
            int hashCode = action.hashCode();
            if (hashCode != 47707700) {
                if (hashCode == 294214294 && action.equals(ROOT_INSTALL_RETRY_ACTION)) {
                    c = 0;
                }
            } else if (action.equals(ROOT_INSTALL_DISMISS_ACTION)) {
                c = 1;
            }
            if (c == 0) {
                this.installManager.retryTimedOutInstallations().mo18594a((C5377a) C3262c3.f6190f, (C5378b<? super Throwable>) new C3257b3(this));
            } else if (c != 1) {
                return;
            }
            this.installManager.cleanTimedOutInstalls().mo18594a((C5377a) C3252a3.f6179f, (C5378b<? super Throwable>) new C3418z2(this));
        }
    }
}
