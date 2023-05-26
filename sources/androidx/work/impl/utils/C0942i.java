package androidx.work.impl.utils;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.C0834i;
import java.util.HashMap;
import java.util.WeakHashMap;

/* renamed from: androidx.work.impl.utils.i */
/* compiled from: WakeLocks */
public class C0942i {

    /* renamed from: a */
    private static final String f3270a = C0834i.m3721a("WakeLocks");

    /* renamed from: b */
    private static final WeakHashMap<PowerManager.WakeLock, String> f3271b = new WeakHashMap<>();

    /* renamed from: a */
    public static PowerManager.WakeLock m4079a(Context context, String str) {
        String str2 = "WorkManager: " + str;
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, str2);
        synchronized (f3271b) {
            f3271b.put(newWakeLock, str2);
        }
        return newWakeLock;
    }

    /* renamed from: a */
    public static void m4080a() {
        HashMap hashMap = new HashMap();
        synchronized (f3271b) {
            hashMap.putAll(f3271b);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                C0834i.m3720a().mo4730e(f3270a, String.format("WakeLock held for %s", new Object[]{hashMap.get(wakeLock)}), new Throwable[0]);
            }
        }
    }
}
