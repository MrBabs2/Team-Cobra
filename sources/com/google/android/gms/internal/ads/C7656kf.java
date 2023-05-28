package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;

/* renamed from: com.google.android.gms.internal.ads.kf */
final /* synthetic */ class C7656kf implements zzbsr {

    /* renamed from: f */
    private final Context f15991f;

    /* renamed from: g */
    private final zzbai f15992g;

    /* renamed from: h */
    private final zzcxm f15993h;

    /* renamed from: i */
    private final zzcxv f15994i;

    C7656kf(Context context, zzbai zzbai, zzcxm zzcxm, zzcxv zzcxv) {
        this.f15991f = context;
        this.f15992g = zzbai;
        this.f15993h = zzcxm;
        this.f15994i = zzcxv;
    }

    public final void onAdLoaded() {
        zzk.zzlq().mo27848b(this.f15991f, this.f15992g.f18742f, this.f15993h.f21142z.toString(), this.f15994i.f21169f);
    }
}
