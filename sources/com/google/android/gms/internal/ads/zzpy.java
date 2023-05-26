package com.google.android.gms.internal.ads;

public final class zzpy implements zzqx {

    /* renamed from: f */
    private final zzqx[] f22517f;

    public zzpy(zzqx[] zzqxArr) {
        this.f22517f = zzqxArr;
    }

    /* renamed from: a */
    public final long mo25999a() {
        long j = Long.MAX_VALUE;
        for (zzqx a : this.f22517f) {
            long a2 = a.mo25999a();
            if (a2 != Long.MIN_VALUE) {
                j = Math.min(j, a2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* renamed from: a */
    public final boolean mo26004a(long j) {
        boolean z;
        boolean z2 = false;
        do {
            long a = mo25999a();
            if (a == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (zzqx zzqx : this.f22517f) {
                if (zzqx.mo25999a() == a) {
                    z |= zzqx.mo26004a(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }
}
