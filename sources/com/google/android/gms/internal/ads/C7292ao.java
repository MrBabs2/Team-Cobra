package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzcuz;

/* renamed from: com.google.android.gms.internal.ads.ao */
final class C7292ao<S extends zzcuz> {

    /* renamed from: a */
    public final zzbbh<S> f14493a;

    /* renamed from: b */
    private final long f14494b;

    /* renamed from: c */
    private final Clock f14495c;

    public C7292ao(zzbbh<S> zzbbh, long j, Clock clock) {
        this.f14493a = zzbbh;
        this.f14495c = clock;
        this.f14494b = clock.mo25499c() + j;
    }

    /* renamed from: a */
    public final boolean mo25601a() {
        return this.f14494b < this.f14495c.mo25499c();
    }
}
