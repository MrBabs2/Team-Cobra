package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.C0834i;
import androidx.work.impl.C0868h;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.impl.utils.C0936d;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    static final String f3006a = C0834i.m3721a("ConstrntProxyUpdtRecvr");

    /* renamed from: androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver$a */
    class C0840a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Intent f3007f;

        /* renamed from: g */
        final /* synthetic */ Context f3008g;

        /* renamed from: h */
        final /* synthetic */ BroadcastReceiver.PendingResult f3009h;

        C0840a(ConstraintProxyUpdateReceiver constraintProxyUpdateReceiver, Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f3007f = intent;
            this.f3008g = context;
            this.f3009h = pendingResult;
        }

        public void run() {
            try {
                boolean booleanExtra = this.f3007f.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f3007f.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f3007f.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f3007f.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                C0834i.m3720a().mo4726a(ConstraintProxyUpdateReceiver.f3006a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", new Object[]{Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)}), new Throwable[0]);
                C0936d.m4074a(this.f3008g, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                C0936d.m4074a(this.f3008g, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                C0936d.m4074a(this.f3008g, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                C0936d.m4074a(this.f3008g, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f3009h.finish();
            }
        }
    }

    /* renamed from: a */
    public static Intent m3759a(Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
        return intent;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            C0834i.m3720a().mo4726a(f3006a, String.format("Ignoring unknown action %s", new Object[]{action}), new Throwable[0]);
        } else {
            C0868h.m3846a(context).mo4809g().mo4961a(new C0840a(this, intent, context, goAsync()));
        }
    }
}
