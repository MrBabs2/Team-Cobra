package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;

@zzard
public final class zzbez implements zzll {

    /* renamed from: a */
    private final zzrz f18901a;

    /* renamed from: b */
    private long f18902b;

    /* renamed from: c */
    private long f18903c;

    /* renamed from: d */
    private long f18904d;

    /* renamed from: e */
    private long f18905e;

    /* renamed from: f */
    private int f18906f;

    /* renamed from: g */
    private boolean f18907g;

    zzbez() {
        this(15000, 30000, 2500, 5000);
    }

    /* renamed from: a */
    public final void mo28020a() {
        m20755a(false);
    }

    /* renamed from: b */
    public final zzrt mo28025b() {
        return this.f18901a;
    }

    /* renamed from: c */
    public final void mo28027c() {
        m20755a(true);
    }

    /* renamed from: d */
    public final void mo28029d() {
        m20755a(true);
    }

    private zzbez(int i, int i2, long j, long j2) {
        this.f18901a = new zzrz(true, 65536);
        this.f18902b = 15000000;
        this.f18903c = 30000000;
        this.f18904d = 2500000;
        this.f18905e = 5000000;
    }

    /* renamed from: a */
    public final void mo28022a(zzlo[] zzloArr, zzrb zzrb, zzro zzro) {
        this.f18906f = 0;
        for (int i = 0; i < zzloArr.length; i++) {
            if (zzro.mo29690a(i) != null) {
                this.f18906f += zzsy.m25290b(zzloArr[i].mo29450o());
            }
        }
        this.f18901a.mo29705a(this.f18906f);
    }

    /* renamed from: b */
    public final synchronized void mo28026b(int i) {
        this.f18905e = ((long) i) * 1000;
    }

    /* renamed from: c */
    public final synchronized void mo28028c(int i) {
        this.f18902b = ((long) i) * 1000;
    }

    /* renamed from: d */
    public final synchronized void mo28030d(int i) {
        this.f18903c = ((long) i) * 1000;
    }

    /* renamed from: a */
    public final synchronized boolean mo28024a(long j, boolean z) {
        boolean z2;
        long j2 = z ? this.f18905e : this.f18904d;
        if (j2 <= 0 || j >= j2) {
            z2 = true;
        } else {
            z2 = false;
        }
        return z2;
    }

    /* renamed from: a */
    public final synchronized boolean mo28023a(long j) {
        boolean z;
        char c;
        z = false;
        if (j > this.f18903c) {
            c = 0;
        } else {
            c = j < this.f18902b ? (char) 2 : 1;
        }
        boolean z2 = this.f18901a.mo29707e() >= this.f18906f;
        if (c == 2 || (c == 1 && this.f18907g && !z2)) {
            z = true;
        }
        this.f18907g = z;
        return z;
    }

    /* renamed from: a */
    public final synchronized void mo28021a(int i) {
        this.f18904d = ((long) i) * 1000;
    }

    @VisibleForTesting
    /* renamed from: a */
    private final void m20755a(boolean z) {
        this.f18906f = 0;
        this.f18907g = false;
        if (z) {
            this.f18901a.mo29706d();
        }
    }
}
