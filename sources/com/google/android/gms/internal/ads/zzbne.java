package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

public final class zzbne implements zzdti<zzbtb> {

    /* renamed from: a */
    private final zzdtu<ScheduledExecutorService> f19228a;

    /* renamed from: b */
    private final zzdtu<Clock> f19229b;

    public zzbne(zzdtu<ScheduledExecutorService> zzdtu, zzdtu<Clock> zzdtu2) {
        this.f19228a = zzdtu;
        this.f19229b = zzdtu2;
    }

    /* renamed from: a */
    public static zzbtb m21390a(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        zzbtb zzbtb = new zzbtb(scheduledExecutorService, clock);
        zzdto.m24236a(zzbtb, "Cannot return null from a non-@Nullable @Provides method");
        return zzbtb;
    }

    public final /* synthetic */ Object get() {
        return m21390a(this.f19228a.get(), this.f19229b.get());
    }
}
