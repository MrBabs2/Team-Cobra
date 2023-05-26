package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;

/* renamed from: com.google.android.gms.internal.ads.ad */
final /* synthetic */ class C7281ad implements zzbsr {

    /* renamed from: f */
    private final Context f14472f;

    /* renamed from: g */
    private final zzbai f14473g;

    /* renamed from: h */
    private final zzcxm f14474h;

    /* renamed from: i */
    private final zzcxv f14475i;

    C7281ad(Context context, zzbai zzbai, zzcxm zzcxm, zzcxv zzcxv) {
        this.f14472f = context;
        this.f14473g = zzbai;
        this.f14474h = zzcxm;
        this.f14475i = zzcxv;
    }

    public final void onAdLoaded() {
        zzk.zzlq().mo27848b(this.f14472f, this.f14473g.f18742f, this.f14474h.f21142z.toString(), this.f14475i.f21169f);
    }
}
