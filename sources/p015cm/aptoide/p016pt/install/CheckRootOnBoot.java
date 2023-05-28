package p015cm.aptoide.p016pt.install;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5378b;
import p123rx.schedulers.Schedulers;

/* renamed from: cm.aptoide.pt.install.CheckRootOnBoot */
public class CheckRootOnBoot extends BroadcastReceiver {
    private static final String HTC_BOOT_COMPLETED = "android.intent.action.QUICKBOOT_POWERON";
    private CrashReport crashReport;

    /* renamed from: a */
    static /* synthetic */ void m6364a() {
    }

    /* renamed from: a */
    public /* synthetic */ void mo12663a(Throwable th) {
        this.crashReport.log(th);
    }

    public void onReceive(Context context, Intent intent) {
        this.crashReport = CrashReport.getInstance();
        if (intent == null) {
            return;
        }
        if (intent.getAction().equals("android.intent.action.BOOT_COMPLETED") || intent.getAction().equals("android.intent.action.REBOOT") || intent.getAction().equals(HTC_BOOT_COMPLETED)) {
            ((AptoideApplication) context.getApplicationContext()).getRootAvailabilityManager().updateRootAvailability().mo18600b(Schedulers.computation()).mo18594a((C5377a) C3352m.f6313f, (C5378b<? super Throwable>) new C3348l(this));
        }
    }
}
