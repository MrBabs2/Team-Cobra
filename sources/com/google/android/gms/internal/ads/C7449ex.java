package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.ex */
abstract class C7449ex<T, B> {
    C7449ex() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract B mo25884a();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo25885a(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo25886a(B b, int i, int i2);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo25887a(B b, int i, long j);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo25888a(B b, int i, zzdmr zzdmr);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo25889a(B b, int i, T t);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo25890a(T t, C8118wx wxVar) throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo25891a(Object obj, T t);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract boolean mo25892a(C7747mw mwVar);

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f A[LOOP:0: B:16:0x002f->B:19:0x003c, LOOP_START] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo25893a(B r7, com.google.android.gms.internal.ads.C7747mw r8) throws java.io.IOException {
        /*
            r6 = this;
            int r0 = r8.getTag()
            int r1 = r0 >>> 3
            r0 = r0 & 7
            r2 = 1
            if (r0 == 0) goto L_0x0061
            if (r0 == r2) goto L_0x0059
            r3 = 2
            if (r0 == r3) goto L_0x0051
            r3 = 4
            r4 = 3
            if (r0 == r4) goto L_0x0028
            if (r0 == r3) goto L_0x0026
            r3 = 5
            if (r0 != r3) goto L_0x0021
            int r8 = r8.mo26280j()
            r6.mo25886a(r7, (int) r1, (int) r8)
            return r2
        L_0x0021:
            com.google.android.gms.internal.ads.zzdol r7 = com.google.android.gms.internal.ads.zzdok.m24052f()
            throw r7
        L_0x0026:
            r7 = 0
            return r7
        L_0x0028:
            java.lang.Object r0 = r6.mo25884a()
            int r4 = r1 << 3
            r3 = r3 | r4
        L_0x002f:
            int r4 = r8.mo26276h()
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x003e
            boolean r4 = r6.mo25893a(r0, (com.google.android.gms.internal.ads.C7747mw) r8)
            if (r4 != 0) goto L_0x002f
        L_0x003e:
            int r8 = r8.getTag()
            if (r3 != r8) goto L_0x004c
            java.lang.Object r8 = r6.mo25894b(r0)
            r6.mo25889a(r7, (int) r1, r8)
            return r2
        L_0x004c:
            com.google.android.gms.internal.ads.zzdok r7 = com.google.android.gms.internal.ads.zzdok.m24051e()
            throw r7
        L_0x0051:
            com.google.android.gms.internal.ads.zzdmr r8 = r8.mo26284l()
            r6.mo25888a(r7, (int) r1, (com.google.android.gms.internal.ads.zzdmr) r8)
            return r2
        L_0x0059:
            long r3 = r8.mo26271f()
            r6.mo25895b(r7, r1, r3)
            return r2
        L_0x0061:
            long r3 = r8.mo26269e()
            r6.mo25887a(r7, (int) r1, (long) r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7449ex.mo25893a(java.lang.Object, com.google.android.gms.internal.ads.mw):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract T mo25894b(B b);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo25895b(B b, int i, long j);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo25896b(T t, C8118wx wxVar) throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo25897b(Object obj, B b);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract int mo25898c(T t);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract T mo25899c(T t, T t2);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract T mo25900d(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract B mo25901e(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract int mo25902f(T t);
}
