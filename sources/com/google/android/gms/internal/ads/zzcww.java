package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

public final class zzcww implements zzdti<zzcwu> {

    /* renamed from: a */
    private final zzdtu<zzaqm> f21087a;

    /* renamed from: b */
    private final zzdtu<ScheduledExecutorService> f21088b;

    /* renamed from: c */
    private final zzdtu<Context> f21089c;

    public zzcww(zzdtu<zzaqm> zzdtu, zzdtu<ScheduledExecutorService> zzdtu2, zzdtu<Context> zzdtu3) {
        this.f21087a = zzdtu;
        this.f21088b = zzdtu2;
        this.f21089c = zzdtu3;
    }

    public final /* synthetic */ Object get() {
        return new zzcwu(this.f21087a.get(), this.f21088b.get(), this.f21089c.get());
    }
}
