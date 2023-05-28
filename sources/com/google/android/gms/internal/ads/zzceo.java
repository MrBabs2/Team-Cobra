package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

public final class zzceo implements zzdti<Set<zzbuz<zzczz>>> {

    /* renamed from: a */
    private final zzdtu<Executor> f20072a;

    /* renamed from: b */
    private final zzdtu<zzcex> f20073b;

    private zzceo(zzdtu<Executor> zzdtu, zzdtu<zzcex> zzdtu2) {
        this.f20072a = zzdtu;
        this.f20073b = zzdtu2;
    }

    /* renamed from: a */
    public static zzceo m22443a(zzdtu<Executor> zzdtu, zzdtu<zzcex> zzdtu2) {
        return new zzceo(zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        Set set;
        Executor executor = this.f20072a.get();
        zzcex zzcex = this.f20073b.get();
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17952p2)).booleanValue()) {
            set = Collections.singleton(new zzbuz(zzcex, executor));
        } else {
            set = Collections.emptySet();
        }
        zzdto.m24236a(set, "Cannot return null from a non-@Nullable @Provides method");
        return set;
    }
}
