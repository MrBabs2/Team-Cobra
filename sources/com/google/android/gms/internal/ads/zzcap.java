package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

public final class zzcap implements zzdti<zzcan> {

    /* renamed from: a */
    private final zzdtu<zzayu> f19863a;

    /* renamed from: b */
    private final zzdtu<Clock> f19864b;

    /* renamed from: c */
    private final zzdtu<Executor> f19865c;

    public zzcap(zzdtu<zzayu> zzdtu, zzdtu<Clock> zzdtu2, zzdtu<Executor> zzdtu3) {
        this.f19863a = zzdtu;
        this.f19864b = zzdtu2;
        this.f19865c = zzdtu3;
    }

    public final /* synthetic */ Object get() {
        return new zzcan(this.f19863a.get(), this.f19864b.get(), this.f19865c.get());
    }
}
