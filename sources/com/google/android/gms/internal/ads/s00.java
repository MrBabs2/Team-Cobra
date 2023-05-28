package com.google.android.gms.internal.ads;

import android.util.Log;

final class s00 {

    /* renamed from: a */
    public final zzqj f16796a;

    /* renamed from: b */
    public final Object f16797b;

    /* renamed from: c */
    public final int f16798c;

    /* renamed from: d */
    public final zzqw[] f16799d;

    /* renamed from: e */
    private final boolean[] f16800e;

    /* renamed from: f */
    public final long f16801f;

    /* renamed from: g */
    public int f16802g;

    /* renamed from: h */
    public long f16803h;

    /* renamed from: i */
    public boolean f16804i;

    /* renamed from: j */
    public boolean f16805j;

    /* renamed from: k */
    public boolean f16806k;

    /* renamed from: l */
    public s00 f16807l;

    /* renamed from: m */
    public zzrr f16808m;

    /* renamed from: n */
    private final zzlo[] f16809n;

    /* renamed from: o */
    private final zzlp[] f16810o;

    /* renamed from: p */
    private final zzrp f16811p;

    /* renamed from: q */
    private final zzll f16812q;

    /* renamed from: r */
    private final zzql f16813r;

    /* renamed from: s */
    private zzrr f16814s;

    public s00(zzlo[] zzloArr, zzlp[] zzlpArr, long j, zzrp zzrp, zzll zzll, zzql zzql, Object obj, int i, int i2, boolean z, long j2) {
        this.f16809n = zzloArr;
        this.f16810o = zzlpArr;
        this.f16801f = j;
        this.f16811p = zzrp;
        this.f16812q = zzll;
        this.f16813r = zzql;
        zzsk.m25214a(obj);
        this.f16797b = obj;
        this.f16798c = i;
        this.f16802g = i2;
        this.f16804i = z;
        this.f16803h = j2;
        this.f16799d = new zzqw[zzloArr.length];
        this.f16800e = new boolean[zzloArr.length];
        this.f16796a = zzql.mo29632a(i2, zzll.mo28025b());
    }

    /* renamed from: a */
    public final void mo26534a(int i, boolean z) {
        this.f16802g = i;
        this.f16804i = z;
    }

    /* renamed from: b */
    public final long mo26535b() {
        return this.f16801f - this.f16803h;
    }

    /* renamed from: c */
    public final boolean mo26536c() {
        if (this.f16805j) {
            return !this.f16806k || this.f16796a.mo26005b() == Long.MIN_VALUE;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo26537d() throws com.google.android.gms.internal.ads.zzku {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzrp r0 = r6.f16811p
            com.google.android.gms.internal.ads.zzlp[] r1 = r6.f16810o
            com.google.android.gms.internal.ads.zzqj r2 = r6.f16796a
            com.google.android.gms.internal.ads.zzrb r2 = r2.mo26010f()
            com.google.android.gms.internal.ads.zzrr r0 = r0.mo29687a(r1, r2)
            com.google.android.gms.internal.ads.zzrr r1 = r6.f16814s
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0016
        L_0x0014:
            r1 = 0
            goto L_0x0028
        L_0x0016:
            r4 = 0
        L_0x0017:
            com.google.android.gms.internal.ads.zzro r5 = r0.f22601b
            int r5 = r5.f22596a
            if (r4 >= r5) goto L_0x0027
            boolean r5 = r0.mo29696a(r1, r4)
            if (r5 != 0) goto L_0x0024
            goto L_0x0014
        L_0x0024:
            int r4 = r4 + 1
            goto L_0x0017
        L_0x0027:
            r1 = 1
        L_0x0028:
            if (r1 == 0) goto L_0x002b
            return r3
        L_0x002b:
            r6.f16808m = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.s00.mo26537d():boolean");
    }

    /* renamed from: a */
    public final long mo26531a(long j, boolean z) {
        return mo26532a(j, false, new boolean[this.f16809n.length]);
    }

    /* renamed from: a */
    public final long mo26532a(long j, boolean z, boolean[] zArr) {
        zzro zzro = this.f16808m.f22601b;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= zzro.f22596a) {
                break;
            }
            boolean[] zArr2 = this.f16800e;
            if (z || !this.f16808m.mo29696a(this.f16814s, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        long a = this.f16796a.mo26000a(zzro.mo29691a(), this.f16800e, this.f16799d, zArr, j);
        this.f16814s = this.f16808m;
        this.f16806k = false;
        int i2 = 0;
        while (true) {
            zzqw[] zzqwArr = this.f16799d;
            if (i2 < zzqwArr.length) {
                if (zzqwArr[i2] != null) {
                    zzsk.m25218b(zzro.mo29690a(i2) != null);
                    this.f16806k = true;
                } else {
                    zzsk.m25218b(zzro.mo29690a(i2) == null);
                }
                i2++;
            } else {
                this.f16812q.mo28022a(this.f16809n, this.f16808m.f22600a, zzro);
                return a;
            }
        }
    }

    /* renamed from: a */
    public final void mo26533a() {
        try {
            this.f16813r.mo29635a(this.f16796a);
        } catch (RuntimeException e) {
            Log.e("ExoPlayerImplInternal", "Period release failed.", e);
        }
    }
}
