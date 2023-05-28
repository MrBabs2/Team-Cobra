package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

public final class zzczh {

    /* renamed from: a */
    private final E f21236a;

    /* renamed from: b */
    private final List<zzbbh<?>> f21237b;

    /* renamed from: c */
    private final /* synthetic */ zzczf f21238c;

    private zzczh(zzczf zzczf, E e, List<zzbbh<?>> list) {
        this.f21238c = zzczf;
        this.f21236a = e;
        this.f21237b = list;
    }

    /* renamed from: a */
    public final <O> zzczl<O> mo28852a(Callable<O> callable) {
        zzbbc<V> b = zzbar.m20551b(this.f21237b);
        zzbbh<C> a = b.mo27900a(C7442eq.f15164f, zzbbm.f18749b);
        zzczf zzczf = this.f21238c;
        return new zzczl(zzczf, this.f21236a, (String) null, a, this.f21237b, b.mo27900a(callable, zzczf.f21233a), (C7405dq) null);
    }
}
