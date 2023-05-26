package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzcuz;
import java.util.concurrent.atomic.AtomicReference;

public final class zzcsk<S extends zzcuz> implements zzcva<S> {

    /* renamed from: a */
    private final AtomicReference<C7292ao<S>> f20902a = new AtomicReference<>();

    /* renamed from: b */
    private final Clock f20903b;

    /* renamed from: c */
    private final zzcva<S> f20904c;

    /* renamed from: d */
    private final long f20905d;

    public zzcsk(zzcva<S> zzcva, long j, Clock clock) {
        this.f20903b = clock;
        this.f20904c = zzcva;
        this.f20905d = j;
    }

    /* renamed from: a */
    public final zzbbh<S> mo25785a() {
        C7292ao aoVar = this.f20902a.get();
        if (aoVar == null || aoVar.mo25601a()) {
            aoVar = new C7292ao(this.f20904c.mo25785a(), this.f20905d, this.f20903b);
            this.f20902a.set(aoVar);
        }
        return aoVar.f14493a;
    }
}
