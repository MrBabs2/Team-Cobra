package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzbnx implements zzdti<zzavf> {

    /* renamed from: a */
    private final zzdtu<Context> f19266a;

    /* renamed from: b */
    private final zzdtu<zzcxv> f19267b;

    public zzbnx(zzbnk zzbnk, zzdtu<Context> zzdtu, zzdtu<zzcxv> zzdtu2) {
        this.f19266a = zzdtu;
        this.f19267b = zzdtu2;
    }

    public final /* synthetic */ Object get() {
        zzavf zzavf = new zzavf(this.f19266a.get(), this.f19267b.get().f21169f);
        zzdto.m24236a(zzavf, "Cannot return null from a non-@Nullable @Provides method");
        return zzavf;
    }
}
