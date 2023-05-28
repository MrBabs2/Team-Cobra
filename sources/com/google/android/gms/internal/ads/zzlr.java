package com.google.android.gms.internal.ads;

public abstract class zzlr {

    /* renamed from: a */
    public static final zzlr f22212a = new v00();

    /* renamed from: a */
    public abstract int mo26674a(Object obj);

    /* renamed from: a */
    public abstract zzlt mo26675a(int i, zzlt zzlt, boolean z);

    /* renamed from: a */
    public abstract zzlu mo26676a(int i, zzlu zzlu, boolean z, long j);

    /* renamed from: a */
    public final boolean mo29488a() {
        return mo26677b() == 0;
    }

    /* renamed from: b */
    public abstract int mo26677b();

    /* renamed from: c */
    public abstract int mo26678c();

    /* renamed from: a */
    public final zzlu mo29487a(int i, zzlu zzlu, boolean z) {
        return mo26676a(i, zzlu, false, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        if ((mo26677b() - 1) == 0) goto L_0x0020;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo29486a(int r3, com.google.android.gms.internal.ads.zzlt r4, com.google.android.gms.internal.ads.zzlu r5, int r6) {
        /*
            r2 = this;
            r0 = 0
            r2.mo26675a((int) r3, (com.google.android.gms.internal.ads.zzlt) r4, (boolean) r0)
            r2.mo29487a((int) r0, (com.google.android.gms.internal.ads.zzlu) r5, (boolean) r0)
            r4 = 1
            if (r3 != 0) goto L_0x0031
            r3 = -1
            if (r6 == 0) goto L_0x0022
            if (r6 == r4) goto L_0x0020
            r1 = 2
            if (r6 != r1) goto L_0x001a
            int r6 = r2.mo26677b()
            int r6 = r6 - r4
            if (r6 != 0) goto L_0x002a
            goto L_0x0020
        L_0x001a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L_0x0020:
            r4 = 0
            goto L_0x002a
        L_0x0022:
            int r6 = r2.mo26677b()
            int r6 = r6 - r4
            if (r6 != 0) goto L_0x002a
            r4 = -1
        L_0x002a:
            if (r4 != r3) goto L_0x002d
            return r3
        L_0x002d:
            r2.mo29487a((int) r4, (com.google.android.gms.internal.ads.zzlu) r5, (boolean) r0)
            return r0
        L_0x0031:
            int r3 = r3 + r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlr.mo29486a(int, com.google.android.gms.internal.ads.zzlt, com.google.android.gms.internal.ads.zzlu, int):int");
    }
}
