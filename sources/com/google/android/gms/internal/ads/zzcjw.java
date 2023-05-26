package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.Executor;

public final class zzcjw<DelegateT, AdapterT> implements zzcjv<AdapterT> {
    @VisibleForTesting

    /* renamed from: a */
    private final zzcjv<DelegateT> f20298a;

    /* renamed from: b */
    private final zzbam<DelegateT, AdapterT> f20299b;

    public zzcjw(zzcjv<DelegateT> zzcjv, zzbam<DelegateT, AdapterT> zzbam) {
        this.f20298a = zzcjv;
        this.f20299b = zzbam;
    }

    /* renamed from: a */
    public final zzbbh<AdapterT> mo28716a(zzcxu zzcxu, zzcxm zzcxm) {
        return zzbar.m20543a(this.f20298a.mo28716a(zzcxu, zzcxm), this.f20299b, (Executor) zzaxg.f18648a);
    }

    /* renamed from: b */
    public final boolean mo28717b(zzcxu zzcxu, zzcxm zzcxm) {
        return this.f20298a.mo28717b(zzcxu, zzcxm);
    }
}
