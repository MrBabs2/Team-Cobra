package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzbrh implements zzdti<zzavb> {

    /* renamed from: a */
    private final zzdtu<Context> f19446a;

    /* renamed from: b */
    private final zzdtu<zzbai> f19447b;

    /* renamed from: c */
    private final zzdtu<zzcxm> f19448c;

    /* renamed from: d */
    private final zzdtu<zzavd> f19449d;

    private zzbrh(zzbrg zzbrg, zzdtu<Context> zzdtu, zzdtu<zzbai> zzdtu2, zzdtu<zzcxm> zzdtu3, zzdtu<zzavd> zzdtu4) {
        this.f19446a = zzdtu;
        this.f19447b = zzdtu2;
        this.f19448c = zzdtu3;
        this.f19449d = zzdtu4;
    }

    /* renamed from: a */
    public static zzbrh m21831a(zzbrg zzbrg, zzdtu<Context> zzdtu, zzdtu<zzbai> zzdtu2, zzdtu<zzcxm> zzdtu3, zzdtu<zzavd> zzdtu4) {
        return new zzbrh(zzbrg, zzdtu, zzdtu2, zzdtu3, zzdtu4);
    }

    public final /* synthetic */ Object get() {
        Context context = this.f19446a.get();
        zzbai zzbai = this.f19447b.get();
        zzcxm zzcxm = this.f19448c.get();
        zzavd zzavd = this.f19449d.get();
        if (zzcxm.f21140x != null) {
            return new zzauq(context, zzbai, zzcxm.f21140x, zzcxm.f21132p.f21153b, zzavd);
        }
        return null;
    }
}
