package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.qj */
final /* synthetic */ class C7882qj implements Callable {

    /* renamed from: f */
    private final zzbbh f16664f;

    /* renamed from: g */
    private final zzbbh f16665g;

    /* renamed from: h */
    private final zzbbh f16666h;

    C7882qj(zzbbh zzbbh, zzbbh zzbbh2, zzbbh zzbbh3) {
        this.f16664f = zzbbh;
        this.f16665g = zzbbh2;
        this.f16666h = zzbbh3;
    }

    public final Object call() {
        return new zzcir((zzciw) this.f16664f.get(), (JSONObject) this.f16665g.get(), (zzasd) this.f16666h.get());
    }
}
