package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class zzchu implements zzdti<zzchq> {

    /* renamed from: a */
    private final zzdtu<Context> f20219a;

    /* renamed from: b */
    private final zzdtu<zzbai> f20220b;

    /* renamed from: c */
    private final zzdtu<zzcxv> f20221c;

    /* renamed from: d */
    private final zzdtu<Executor> f20222d;

    private zzchu(zzdtu<Context> zzdtu, zzdtu<zzbai> zzdtu2, zzdtu<zzcxv> zzdtu3, zzdtu<Executor> zzdtu4) {
        this.f20219a = zzdtu;
        this.f20220b = zzdtu2;
        this.f20221c = zzdtu3;
        this.f20222d = zzdtu4;
    }

    /* renamed from: a */
    public static zzchu m22555a(zzdtu<Context> zzdtu, zzdtu<zzbai> zzdtu2, zzdtu<zzcxv> zzdtu3, zzdtu<Executor> zzdtu4) {
        return new zzchu(zzdtu, zzdtu2, zzdtu3, zzdtu4);
    }

    public final /* synthetic */ Object get() {
        return new zzchq(this.f20219a.get(), this.f20220b.get(), this.f20221c.get(), this.f20222d.get());
    }
}
