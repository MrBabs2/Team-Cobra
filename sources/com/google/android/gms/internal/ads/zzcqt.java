package com.google.android.gms.internal.ads;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class zzcqt {

    /* renamed from: a */
    private String f20821a;

    public static class zza {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f20822a;

        /* renamed from: a */
        public final zza mo28780a(String str) {
            this.f20822a = str;
            return this;
        }
    }

    private zzcqt(zza zza2) {
        this.f20821a = zza2.f20822a;
    }

    /* renamed from: a */
    public final Set<String> mo28777a() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.f20821a.toLowerCase(Locale.ROOT));
        return hashSet;
    }

    /* renamed from: b */
    public final String mo28778b() {
        return this.f20821a.toLowerCase(Locale.ROOT);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo28779c() {
        /*
            r6 = this;
            java.lang.String r0 = r6.f20821a
            int r1 = r0.hashCode()
            r2 = 0
            r3 = 2
            r4 = 3
            r5 = 1
            switch(r1) {
                case -1999289321: goto L_0x002c;
                case -1372958932: goto L_0x0022;
                case 543046670: goto L_0x0018;
                case 1951953708: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0036
        L_0x000e:
            java.lang.String r1 = "BANNER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 0
            goto L_0x0037
        L_0x0018:
            java.lang.String r1 = "REWARDED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 3
            goto L_0x0037
        L_0x0022:
            java.lang.String r1 = "INTERSTITIAL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 1
            goto L_0x0037
        L_0x002c:
            java.lang.String r1 = "NATIVE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 2
            goto L_0x0037
        L_0x0036:
            r0 = -1
        L_0x0037:
            if (r0 == 0) goto L_0x0045
            if (r0 == r5) goto L_0x0044
            if (r0 == r3) goto L_0x0042
            if (r0 == r4) goto L_0x0040
            return r2
        L_0x0040:
            r0 = 7
            return r0
        L_0x0042:
            r0 = 6
            return r0
        L_0x0044:
            return r4
        L_0x0045:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcqt.mo28779c():int");
    }
}
