package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

public final class zzbmq implements zzdti<zzbmn> {

    /* renamed from: a */
    private final zzdtu<zzaly> f19193a;

    /* renamed from: b */
    private final zzdtu<zzbml> f19194b;

    /* renamed from: c */
    private final zzdtu<Executor> f19195c;

    /* renamed from: d */
    private final zzdtu<zzbmg> f19196d;

    /* renamed from: e */
    private final zzdtu<Clock> f19197e;

    private zzbmq(zzdtu<zzaly> zzdtu, zzdtu<zzbml> zzdtu2, zzdtu<Executor> zzdtu3, zzdtu<zzbmg> zzdtu4, zzdtu<Clock> zzdtu5) {
        this.f19193a = zzdtu;
        this.f19194b = zzdtu2;
        this.f19195c = zzdtu3;
        this.f19196d = zzdtu4;
        this.f19197e = zzdtu5;
    }

    /* renamed from: a */
    public static zzbmq m21372a(zzdtu<zzaly> zzdtu, zzdtu<zzbml> zzdtu2, zzdtu<Executor> zzdtu3, zzdtu<zzbmg> zzdtu4, zzdtu<Clock> zzdtu5) {
        return new zzbmq(zzdtu, zzdtu2, zzdtu3, zzdtu4, zzdtu5);
    }

    public final /* synthetic */ Object get() {
        return new zzbmn(this.f19193a.get(), this.f19194b.get(), this.f19195c.get(), this.f19196d.get(), this.f19197e.get());
    }
}
