package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.C0834i;
import androidx.work.impl.C0868h;

public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f3010a = C0834i.m3721a("RescheduleReceiver");

    public void onReceive(Context context, Intent intent) {
        C0834i.m3720a().mo4726a(f3010a, String.format("Received intent %s", new Object[]{intent}), new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                C0868h.m3846a(context).mo4799a(goAsync());
            } catch (IllegalStateException unused) {
                C0834i.m3720a().mo4727b(f3010a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", new Throwable[0]);
            }
        } else {
            context.startService(C0842b.m3770b(context));
        }
    }
}
