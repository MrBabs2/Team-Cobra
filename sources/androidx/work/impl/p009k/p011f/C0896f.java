package androidx.work.impl.p009k.p011f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.C0834i;
import androidx.work.impl.utils.p014k.C0956a;

/* renamed from: androidx.work.impl.k.f.f */
/* compiled from: StorageNotLowTracker */
public class C0896f extends C0889c<Boolean> {

    /* renamed from: i */
    private static final String f3184i = C0834i.m3721a("StorageNotLowTracker");

    public C0896f(Context context, C0956a aVar) {
        super(context, aVar);
    }

    /* renamed from: d */
    public IntentFilter mo4850d() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    /* renamed from: a */
    public Boolean m3963a() {
        Intent registerReceiver = this.f3172b.registerReceiver((BroadcastReceiver) null, mo4850d());
        if (!(registerReceiver == null || registerReceiver.getAction() == null)) {
            String action = registerReceiver.getAction();
            char c = 65535;
            int hashCode = action.hashCode();
            if (hashCode != -1181163412) {
                if (hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    c = 0;
                }
            } else if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                c = 1;
            }
            if (c != 0) {
                if (c != 1) {
                    return null;
                }
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public void mo4849a(Context context, Intent intent) {
        if (intent.getAction() != null) {
            C0834i.m3720a().mo4726a(f3184i, String.format("Received %s", new Object[]{intent.getAction()}), new Throwable[0]);
            String action = intent.getAction();
            char c = 65535;
            int hashCode = action.hashCode();
            if (hashCode != -1181163412) {
                if (hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    c = 0;
                }
            } else if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                c = 1;
            }
            if (c == 0) {
                mo4855a(true);
            } else if (c == 1) {
                mo4855a(false);
            }
        }
    }
}
