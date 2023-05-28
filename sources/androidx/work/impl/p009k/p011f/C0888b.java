package androidx.work.impl.p009k.p011f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.C0834i;
import androidx.work.impl.utils.p014k.C0956a;

/* renamed from: androidx.work.impl.k.f.b */
/* compiled from: BatteryNotLowTracker */
public class C0888b extends C0889c<Boolean> {

    /* renamed from: i */
    private static final String f3166i = C0834i.m3721a("BatteryNotLowTracker");

    public C0888b(Context context, C0956a aVar) {
        super(context, aVar);
    }

    /* renamed from: d */
    public IntentFilter mo4850d() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    /* renamed from: a */
    public Boolean m3942a() {
        Intent registerReceiver = this.f3172b.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            C0834i.m3720a().mo4727b(f3166i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = registerReceiver.getIntExtra("plugged", 0);
        int intExtra2 = registerReceiver.getIntExtra("status", -1);
        float intExtra3 = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
        if (intExtra != 0 || intExtra2 == 1 || intExtra3 > 0.15f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: a */
    public void mo4849a(Context context, Intent intent) {
        if (intent.getAction() != null) {
            C0834i.m3720a().mo4726a(f3166i, String.format("Received %s", new Object[]{intent.getAction()}), new Throwable[0]);
            String action = intent.getAction();
            char c = 65535;
            int hashCode = action.hashCode();
            if (hashCode != -1980154005) {
                if (hashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                    c = 1;
                }
            } else if (action.equals("android.intent.action.BATTERY_OKAY")) {
                c = 0;
            }
            if (c == 0) {
                mo4855a(true);
            } else if (c == 1) {
                mo4855a(false);
            }
        }
    }
}
