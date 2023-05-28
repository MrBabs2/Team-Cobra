package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.concurrent.Executor;

public final class zzcam implements zzdti<zzbuz<VideoController.VideoLifecycleCallbacks>> {

    /* renamed from: a */
    private final zzdtu<zzccw> f19859a;

    /* renamed from: b */
    private final zzdtu<Executor> f19860b;

    public zzcam(zzcag zzcag, zzdtu<zzccw> zzdtu, zzdtu<Executor> zzdtu2) {
        this.f19859a = zzdtu;
        this.f19860b = zzdtu2;
    }

    public final /* synthetic */ Object get() {
        zzbuz zzbuz = new zzbuz(this.f19859a.get(), this.f19860b.get());
        zzdto.m24236a(zzbuz, "Cannot return null from a non-@Nullable @Provides method");
        return zzbuz;
    }
}
