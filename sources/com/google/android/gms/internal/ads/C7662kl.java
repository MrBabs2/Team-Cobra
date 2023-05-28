package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.kl */
final /* synthetic */ class C7662kl implements Callable {

    /* renamed from: f */
    private final zzclx f16006f;

    /* renamed from: g */
    private final zzbbh f16007g;

    /* renamed from: h */
    private final zzbbh f16008h;

    /* renamed from: i */
    private final zzcxu f16009i;

    /* renamed from: j */
    private final zzcxm f16010j;

    /* renamed from: k */
    private final JSONObject f16011k;

    C7662kl(zzclx zzclx, zzbbh zzbbh, zzbbh zzbbh2, zzcxu zzcxu, zzcxm zzcxm, JSONObject jSONObject) {
        this.f16006f = zzclx;
        this.f16007g = zzbbh;
        this.f16008h = zzbbh2;
        this.f16009i = zzcxu;
        this.f16010j = zzcxm;
        this.f16011k = jSONObject;
    }

    public final Object call() {
        return this.f16006f.mo28739a(this.f16007g, this.f16008h, this.f16009i, this.f16010j, this.f16011k);
    }
}
