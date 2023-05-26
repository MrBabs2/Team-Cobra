package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzcrr implements zzdti<zzcrp> {

    /* renamed from: a */
    private final zzdtu<zzcsk<zzcvf>> f20865a;

    /* renamed from: b */
    private final zzdtu<zzcxv> f20866b;

    /* renamed from: c */
    private final zzdtu<Context> f20867c;

    /* renamed from: d */
    private final zzdtu<zzawm> f20868d;

    private zzcrr(zzdtu<zzcsk<zzcvf>> zzdtu, zzdtu<zzcxv> zzdtu2, zzdtu<Context> zzdtu3, zzdtu<zzawm> zzdtu4) {
        this.f20865a = zzdtu;
        this.f20866b = zzdtu2;
        this.f20867c = zzdtu3;
        this.f20868d = zzdtu4;
    }

    /* renamed from: a */
    public static zzcrr m22941a(zzdtu<zzcsk<zzcvf>> zzdtu, zzdtu<zzcxv> zzdtu2, zzdtu<Context> zzdtu3, zzdtu<zzawm> zzdtu4) {
        return new zzcrr(zzdtu, zzdtu2, zzdtu3, zzdtu4);
    }

    public final /* synthetic */ Object get() {
        return new zzcrp(this.f20865a.get(), this.f20866b.get(), this.f20867c.get(), this.f20868d.get());
    }
}
