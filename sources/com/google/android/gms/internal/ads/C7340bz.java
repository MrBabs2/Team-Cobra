package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* renamed from: com.google.android.gms.internal.ads.bz */
final class C7340bz {

    /* renamed from: a */
    private boolean f14685a;

    /* renamed from: b */
    private long f14686b;

    /* renamed from: c */
    private long f14687c;

    C7340bz() {
    }

    /* renamed from: a */
    public final void mo25754a() {
        if (!this.f14685a) {
            this.f14685a = true;
            this.f14687c = m16701b(this.f14686b);
        }
    }

    /* renamed from: b */
    public final void mo25756b() {
        if (this.f14685a) {
            this.f14686b = m16701b(this.f14687c);
            this.f14685a = false;
        }
    }

    /* renamed from: c */
    public final long mo25757c() {
        return this.f14685a ? m16701b(this.f14687c) : this.f14686b;
    }

    /* renamed from: b */
    private static long m16701b(long j) {
        return (SystemClock.elapsedRealtime() * 1000) - j;
    }

    /* renamed from: a */
    public final void mo25755a(long j) {
        this.f14686b = j;
        this.f14687c = m16701b(j);
    }
}
