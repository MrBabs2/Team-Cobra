package androidx.work.impl.p009k.p011f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.work.C0834i;
import androidx.work.impl.utils.p014k.C0956a;

/* renamed from: androidx.work.impl.k.f.a */
/* compiled from: BatteryChargingTracker */
public class C0887a extends C0889c<Boolean> {

    /* renamed from: i */
    private static final String f3165i = C0834i.m3721a("BatteryChrgTracker");

    public C0887a(Context context, C0956a aVar) {
        super(context, aVar);
    }

    /* renamed from: d */
    public IntentFilter mo4850d() {
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            intentFilter.addAction("android.os.action.DISCHARGING");
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        return intentFilter;
    }

    /* renamed from: a */
    public Boolean m3938a() {
        Intent registerReceiver = this.f3172b.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return Boolean.valueOf(m3936a(registerReceiver));
        }
        C0834i.m3720a().mo4727b(f3165i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }

    /* renamed from: a */
    public void mo4849a(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            C0834i.m3720a().mo4726a(f3165i, String.format("Received %s", new Object[]{action}), new Throwable[0]);
            char c = 65535;
            switch (action.hashCode()) {
                case -1886648615:
                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                        c = 3;
                        break;
                    }
                    break;
                case -54942926:
                    if (action.equals("android.os.action.DISCHARGING")) {
                        c = 1;
                        break;
                    }
                    break;
                case 948344062:
                    if (action.equals("android.os.action.CHARGING")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1019184907:
                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                mo4855a(true);
            } else if (c == 1) {
                mo4855a(false);
            } else if (c == 2) {
                mo4855a(true);
            } else if (c == 3) {
                mo4855a(false);
            }
        }
    }

    /* renamed from: a */
    private boolean m3936a(Intent intent) {
        if (Build.VERSION.SDK_INT >= 23) {
            int intExtra = intent.getIntExtra("status", -1);
            if (intExtra == 2 || intExtra == 5) {
                return true;
            }
        } else if (intent.getIntExtra("plugged", 0) != 0) {
            return true;
        }
        return false;
    }
}
