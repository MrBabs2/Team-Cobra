package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;

public final class zzbvc implements zzdti<zzbva> {

    /* renamed from: a */
    private final zzdtu<Context> f19509a;

    /* renamed from: b */
    private final zzdtu<Set<zzbuz<zzue>>> f19510b;

    /* renamed from: c */
    private final zzdtu<zzcxm> f19511c;

    private zzbvc(zzdtu<Context> zzdtu, zzdtu<Set<zzbuz<zzue>>> zzdtu2, zzdtu<zzcxm> zzdtu3) {
        this.f19509a = zzdtu;
        this.f19510b = zzdtu2;
        this.f19511c = zzdtu3;
    }

    /* renamed from: a */
    public static zzbvc m21939a(zzdtu<Context> zzdtu, zzdtu<Set<zzbuz<zzue>>> zzdtu2, zzdtu<zzcxm> zzdtu3) {
        return new zzbvc(zzdtu, zzdtu2, zzdtu3);
    }

    public final /* synthetic */ Object get() {
        return new zzbva(this.f19509a.get(), this.f19510b.get(), this.f19511c.get());
    }
}
