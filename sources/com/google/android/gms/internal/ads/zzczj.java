package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

public final class zzczj {

    /* renamed from: a */
    private final E f21239a;

    /* renamed from: b */
    private final /* synthetic */ zzczf f21240b;

    private zzczj(zzczf zzczf, E e) {
        this.f21240b = zzczf;
        this.f21239a = e;
    }

    /* renamed from: a */
    public final <O> zzczl<O> mo28853a(zzbbh<O> zzbbh) {
        return new zzczl(this.f21240b, this.f21239a, (String) null, zzczf.f21232d, Collections.emptyList(), zzbbh, (C7405dq) null);
    }

    /* renamed from: a */
    public final <O> zzczl<O> mo28855a(Callable<O> callable) {
        return m23147a(callable, this.f21240b.f21233a);
    }

    /* renamed from: a */
    private final <O> zzczl<O> m23147a(Callable<O> callable, zzbbl zzbbl) {
        return new zzczl(this.f21240b, this.f21239a, (String) null, zzczf.f21232d, Collections.emptyList(), zzbbl.mo27892a(callable), (C7405dq) null);
    }

    /* renamed from: a */
    public final zzczl<?> mo28854a(zzczd zzczd, zzbbl zzbbl) {
        return m23147a(new C7479fq(zzczd), zzbbl);
    }
}
