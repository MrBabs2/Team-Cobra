package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.op */
final /* synthetic */ class C7814op implements Callable {

    /* renamed from: f */
    private final zzbbh f16508f;

    /* renamed from: g */
    private final zzbbh f16509g;

    C7814op(zzbbh zzbbh, zzbbh zzbbh2) {
        this.f16508f = zzbbh;
        this.f16509g = zzbbh2;
    }

    public final Object call() {
        return new zzcwi((String) this.f16508f.get(), (String) this.f16509g.get());
    }
}
