package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

public final class zzbob implements zzdti<zzcva<zzcrd>> {

    /* renamed from: a */
    private final zzdtu<zzcre> f19272a;

    /* renamed from: b */
    private final zzdtu<ScheduledExecutorService> f19273b;

    public zzbob(zzdtu<zzcre> zzdtu, zzdtu<ScheduledExecutorService> zzdtu2) {
        this.f19272a = zzdtu;
        this.f19273b = zzdtu2;
    }

    public final /* synthetic */ Object get() {
        zzctz zzctz = new zzctz(this.f19272a.get(), 0, this.f19273b.get());
        zzdto.m24236a(zzctz, "Cannot return null from a non-@Nullable @Provides method");
        return zzctz;
    }
}
