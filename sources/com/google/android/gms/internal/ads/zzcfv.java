package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import java.util.Set;
import java.util.concurrent.Executor;

public final class zzcfv implements zzdti<Set<zzbuz<AppEventListener>>> {

    /* renamed from: a */
    private final zzdtu<zzcfz> f20130a;

    /* renamed from: b */
    private final zzdtu<Executor> f20131b;

    private zzcfv(zzcfp zzcfp, zzdtu<zzcfz> zzdtu, zzdtu<Executor> zzdtu2) {
        this.f20130a = zzdtu;
        this.f20131b = zzdtu2;
    }

    /* renamed from: a */
    public static zzcfv m22494a(zzcfp zzcfp, zzdtu<zzcfz> zzdtu, zzdtu<Executor> zzdtu2) {
        return new zzcfv(zzcfp, zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        Set<zzbuz<AppEventListener>> b = zzcfp.m22480b(this.f20130a.get(), this.f20131b.get());
        zzdto.m24236a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }
}
