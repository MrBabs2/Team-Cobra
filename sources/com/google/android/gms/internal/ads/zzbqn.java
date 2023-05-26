package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzb;

public final class zzbqn implements zzdti<zzb> {

    /* renamed from: a */
    private final zzdtu<Context> f19413a;

    /* renamed from: b */
    private final zzdtu<zzavb> f19414b;

    private zzbqn(zzbqm zzbqm, zzdtu<Context> zzdtu, zzdtu<zzavb> zzdtu2) {
        this.f19413a = zzdtu;
        this.f19414b = zzdtu2;
    }

    /* renamed from: a */
    public static zzbqn m21802a(zzbqm zzbqm, zzdtu<Context> zzdtu, zzdtu<zzavb> zzdtu2) {
        return new zzbqn(zzbqm, zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        zzb zzb = new zzb(this.f19413a.get(), this.f19414b.get(), (zzark) null);
        zzdto.m24236a(zzb, "Cannot return null from a non-@Nullable @Provides method");
        return zzb;
    }
}
