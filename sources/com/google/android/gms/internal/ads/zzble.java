package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;

public final class zzble implements zzdti<zzdan> {

    /* renamed from: a */
    private final zzdtu<Context> f19128a;

    public zzble(zzdtu<Context> zzdtu) {
        this.f19128a = zzdtu;
    }

    public final /* synthetic */ Object get() {
        zzdan zzdan = new zzdan(this.f19128a.get(), zzk.zzlu().mo27864b());
        zzdto.m24236a(zzdan, "Cannot return null from a non-@Nullable @Provides method");
        return zzdan;
    }
}
