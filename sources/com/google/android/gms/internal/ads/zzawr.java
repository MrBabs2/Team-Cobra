package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.common.util.VisibleForTesting;

@zzard
public final class zzawr {
    @VisibleForTesting

    /* renamed from: a */
    private long f18604a = -1;
    @VisibleForTesting

    /* renamed from: b */
    private long f18605b = -1;
    @VisibleForTesting

    /* renamed from: c */
    private int f18606c = -1;
    @VisibleForTesting

    /* renamed from: d */
    int f18607d = -1;
    @VisibleForTesting

    /* renamed from: e */
    private long f18608e = 0;

    /* renamed from: f */
    private final Object f18609f = new Object();
    @VisibleForTesting

    /* renamed from: g */
    private final String f18610g;

    /* renamed from: h */
    private final zzaxb f18611h;
    @VisibleForTesting

    /* renamed from: i */
    private int f18612i = 0;
    @VisibleForTesting

    /* renamed from: j */
    private int f18613j = 0;

    public zzawr(String str, zzaxb zzaxb) {
        this.f18610g = str;
        this.f18611h = zzaxb;
    }

    /* renamed from: a */
    public final void mo27748a() {
        synchronized (this.f18609f) {
            this.f18613j++;
        }
    }

    /* renamed from: b */
    public final void mo27750b() {
        synchronized (this.f18609f) {
            this.f18612i++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0076, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo27749a(com.google.android.gms.internal.ads.zzxz r11, long r12) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f18609f
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzaxb r1 = r10.f18611h     // Catch:{ all -> 0x0077 }
            long r1 = r1.mo27785h()     // Catch:{ all -> 0x0077 }
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzk.zzln()     // Catch:{ all -> 0x0077 }
            long r3 = r3.mo25498b()     // Catch:{ all -> 0x0077 }
            long r5 = r10.f18605b     // Catch:{ all -> 0x0077 }
            r7 = -1
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0040
            long r1 = r3 - r1
            com.google.android.gms.internal.ads.zzacj<java.lang.Long> r5 = com.google.android.gms.internal.ads.zzacu.f17790E0     // Catch:{ all -> 0x0077 }
            com.google.android.gms.internal.ads.zzacr r6 = com.google.android.gms.internal.ads.zzyt.m25670e()     // Catch:{ all -> 0x0077 }
            java.lang.Object r5 = r6.mo27163a(r5)     // Catch:{ all -> 0x0077 }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ all -> 0x0077 }
            long r5 = r5.longValue()     // Catch:{ all -> 0x0077 }
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0033
            r1 = -1
            r10.f18607d = r1     // Catch:{ all -> 0x0077 }
            goto L_0x003b
        L_0x0033:
            com.google.android.gms.internal.ads.zzaxb r1 = r10.f18611h     // Catch:{ all -> 0x0077 }
            int r1 = r1.mo27783f()     // Catch:{ all -> 0x0077 }
            r10.f18607d = r1     // Catch:{ all -> 0x0077 }
        L_0x003b:
            r10.f18605b = r12     // Catch:{ all -> 0x0077 }
            r10.f18604a = r12     // Catch:{ all -> 0x0077 }
            goto L_0x0042
        L_0x0040:
            r10.f18604a = r12     // Catch:{ all -> 0x0077 }
        L_0x0042:
            r12 = 1
            if (r11 == 0) goto L_0x0056
            android.os.Bundle r13 = r11.f22983h     // Catch:{ all -> 0x0077 }
            if (r13 == 0) goto L_0x0056
            android.os.Bundle r11 = r11.f22983h     // Catch:{ all -> 0x0077 }
            java.lang.String r13 = "gw"
            r1 = 2
            int r11 = r11.getInt(r13, r1)     // Catch:{ all -> 0x0077 }
            if (r11 != r12) goto L_0x0056
            monitor-exit(r0)     // Catch:{ all -> 0x0077 }
            return
        L_0x0056:
            int r11 = r10.f18606c     // Catch:{ all -> 0x0077 }
            int r11 = r11 + r12
            r10.f18606c = r11     // Catch:{ all -> 0x0077 }
            int r11 = r10.f18607d     // Catch:{ all -> 0x0077 }
            int r11 = r11 + r12
            r10.f18607d = r11     // Catch:{ all -> 0x0077 }
            if (r11 != 0) goto L_0x006c
            r11 = 0
            r10.f18608e = r11     // Catch:{ all -> 0x0077 }
            com.google.android.gms.internal.ads.zzaxb r11 = r10.f18611h     // Catch:{ all -> 0x0077 }
            r11.mo27774b((long) r3)     // Catch:{ all -> 0x0077 }
            goto L_0x0075
        L_0x006c:
            com.google.android.gms.internal.ads.zzaxb r11 = r10.f18611h     // Catch:{ all -> 0x0077 }
            long r11 = r11.mo27782e()     // Catch:{ all -> 0x0077 }
            long r3 = r3 - r11
            r10.f18608e = r3     // Catch:{ all -> 0x0077 }
        L_0x0075:
            monitor-exit(r0)     // Catch:{ all -> 0x0077 }
            return
        L_0x0077:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0077 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzawr.mo27749a(com.google.android.gms.internal.ads.zzxz, long):void");
    }

    /* renamed from: a */
    public final Bundle mo27747a(Context context, String str) {
        Bundle bundle;
        synchronized (this.f18609f) {
            bundle = new Bundle();
            bundle.putString("session_id", this.f18610g);
            bundle.putLong("basets", this.f18605b);
            bundle.putLong("currts", this.f18604a);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.f18606c);
            bundle.putInt("preqs_in_session", this.f18607d);
            bundle.putLong("time_in_session", this.f18608e);
            bundle.putInt("pclick", this.f18612i);
            bundle.putInt("pimp", this.f18613j);
            bundle.putBoolean("support_transparent_background", m20149a(context));
        }
        return bundle;
    }

    /* renamed from: a */
    private static boolean m20149a(Context context) {
        Context c = zzasq.m19919c(context);
        int identifier = c.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if (identifier == 0) {
            zzbad.m20521c("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        try {
            if (identifier == c.getPackageManager().getActivityInfo(new ComponentName(c.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                return true;
            }
            zzbad.m20521c("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            zzbad.m20523d("Fail to fetch AdActivity theme");
            zzbad.m20521c("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
    }
}
