package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcuz;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzctz<S extends zzcuz> implements zzcva<S> {

    /* renamed from: a */
    private final zzcva<S> f20951a;

    /* renamed from: b */
    private final long f20952b;

    /* renamed from: c */
    private final ScheduledExecutorService f20953c;

    public zzctz(zzcva<S> zzcva, long j, ScheduledExecutorService scheduledExecutorService) {
        this.f20951a = zzcva;
        this.f20952b = j;
        this.f20953c = scheduledExecutorService;
    }

    /* renamed from: a */
    public final zzbbh<S> mo25785a() {
        zzbbh a = this.f20951a.mo25785a();
        long j = this.f20952b;
        if (j > 0) {
            a = zzbar.m20541a(a, j, TimeUnit.MILLISECONDS, this.f20953c);
        }
        return zzbar.m20544a(a, Throwable.class, C7887qo.f16671a, zzbbm.f18749b);
    }
}
