package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

public final class zzbyl implements zzdti<zzbmy> {

    /* renamed from: a */
    private final zzdtu<zzty> f19673a;

    /* renamed from: b */
    private final zzdtu<Executor> f19674b;

    /* renamed from: c */
    private final zzdtu<Context> f19675c;

    /* renamed from: d */
    private final zzdtu<Clock> f19676d;

    public zzbyl(zzdtu<zzty> zzdtu, zzdtu<Executor> zzdtu2, zzdtu<Context> zzdtu3, zzdtu<Clock> zzdtu4) {
        this.f19673a = zzdtu;
        this.f19674b = zzdtu2;
        this.f19675c = zzdtu3;
        this.f19676d = zzdtu4;
    }

    public final /* synthetic */ Object get() {
        zzbmy zzbmy = new zzbmy(this.f19674b.get(), new zzbml(this.f19675c.get(), this.f19673a.get()), this.f19676d.get());
        zzdto.m24236a(zzbmy, "Cannot return null from a non-@Nullable @Provides method");
        return zzbmy;
    }
}
