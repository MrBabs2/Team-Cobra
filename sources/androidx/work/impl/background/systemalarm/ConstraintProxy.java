package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.C0825c;
import androidx.work.C0834i;
import androidx.work.C0961j;
import androidx.work.impl.p012l.C0911j;
import java.util.List;

abstract class ConstraintProxy extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f3005a = C0834i.m3721a("ConstraintProxy");

    public static class BatteryChargingProxy extends ConstraintProxy {
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
    }

    public static class NetworkStateProxy extends ConstraintProxy {
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
    }

    ConstraintProxy() {
    }

    /* renamed from: a */
    static void m3758a(Context context, List<C0911j> list) {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        for (C0911j jVar : list) {
            C0825c cVar = jVar.f3213j;
            z |= cVar.mo4698f();
            z2 |= cVar.mo4699g();
            z3 |= cVar.mo4702i();
            z4 |= cVar.mo4689b() != C0961j.NOT_REQUIRED;
            if (z && z2 && z3 && z4) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.m3759a(context, z, z2, z3, z4));
    }

    public void onReceive(Context context, Intent intent) {
        C0834i.m3720a().mo4726a(f3005a, String.format("onReceive : %s", new Object[]{intent}), new Throwable[0]);
        context.startService(C0842b.m3766a(context));
    }
}
