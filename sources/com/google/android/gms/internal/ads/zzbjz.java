package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzbjz implements zzdti<zzasl> {

    /* renamed from: a */
    private final zzdtu<Context> f19068a;

    public zzbjz(zzdtu<Context> zzdtu) {
        this.f19068a = zzdtu;
    }

    public final /* synthetic */ Object get() {
        Context context = this.f19068a.get();
        zzasj zzasj = new zzasj(context, new zzaso(context).mo27603a());
        zzdto.m24236a(zzasj, "Cannot return null from a non-@Nullable @Provides method");
        return zzasj;
    }
}
