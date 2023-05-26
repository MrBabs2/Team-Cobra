package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.pj */
final /* synthetic */ class C7845pj implements Callable {

    /* renamed from: f */
    private final zzbbh f16587f;

    /* renamed from: g */
    private final zzbbh f16588g;

    C7845pj(zzbbh zzbbh, zzbbh zzbbh2) {
        this.f16587f = zzbbh;
        this.f16588g = zzbbh2;
    }

    public final Object call() {
        return new zzciv((JSONObject) this.f16587f.get(), (zzasd) this.f16588g.get());
    }
}
