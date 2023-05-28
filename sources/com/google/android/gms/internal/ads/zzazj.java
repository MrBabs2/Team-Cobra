package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;

@zzard
public final class zzazj {

    /* renamed from: a */
    private long f18707a;

    /* renamed from: b */
    private long f18708b = Long.MIN_VALUE;

    /* renamed from: c */
    private final Object f18709c = new Object();

    public zzazj(long j) {
        this.f18707a = j;
    }

    /* renamed from: a */
    public final boolean mo27867a() {
        synchronized (this.f18709c) {
            long c = zzk.zzln().mo25499c();
            if (this.f18708b + this.f18707a > c) {
                return false;
            }
            this.f18708b = c;
            return true;
        }
    }

    /* renamed from: a */
    public final void mo27866a(long j) {
        synchronized (this.f18709c) {
            this.f18707a = j;
        }
    }
}
