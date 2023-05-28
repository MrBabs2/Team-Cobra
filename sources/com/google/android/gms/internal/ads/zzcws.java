package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.concurrent.ScheduledExecutorService;

public final class zzcws implements zzdti<zzcwq> {

    /* renamed from: a */
    private final zzdtu<zzamg> f21079a;

    /* renamed from: b */
    private final zzdtu<ScheduledExecutorService> f21080b;

    /* renamed from: c */
    private final zzdtu<Boolean> f21081c;

    /* renamed from: d */
    private final zzdtu<ApplicationInfo> f21082d;

    public zzcws(zzdtu<zzamg> zzdtu, zzdtu<ScheduledExecutorService> zzdtu2, zzdtu<Boolean> zzdtu3, zzdtu<ApplicationInfo> zzdtu4) {
        this.f21079a = zzdtu;
        this.f21080b = zzdtu2;
        this.f21081c = zzdtu3;
        this.f21082d = zzdtu4;
    }

    public final /* synthetic */ Object get() {
        return new zzcwq(this.f21079a.get(), this.f21080b.get(), this.f21081c.get().booleanValue(), this.f21082d.get());
    }
}
