package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public final class zzcew implements zzdti<Set<zzbuz<zzczz>>> {

    /* renamed from: a */
    private final zzdtu<String> f20081a;

    /* renamed from: b */
    private final zzdtu<Context> f20082b;

    /* renamed from: c */
    private final zzdtu<Executor> f20083c;

    /* renamed from: d */
    private final zzdtu<Map<zzczs, zzcez>> f20084d;

    public zzcew(zzdtu<String> zzdtu, zzdtu<Context> zzdtu2, zzdtu<Executor> zzdtu3, zzdtu<Map<zzczs, zzcez>> zzdtu4) {
        this.f20081a = zzdtu;
        this.f20082b = zzdtu2;
        this.f20083c = zzdtu3;
        this.f20084d = zzdtu4;
    }

    public final /* synthetic */ Object get() {
        Set set;
        String str = this.f20081a.get();
        Context context = this.f20082b.get();
        Executor executor = this.f20083c.get();
        Map map = this.f20084d.get();
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17952p2)).booleanValue()) {
            zzwj zzwj = new zzwj(new zzwo(context));
            zzwj.mo29858a((zzwk) new C7544hi(str));
            set = Collections.singleton(new zzbuz(new zzcex(zzwj, map), executor));
        } else {
            set = Collections.emptySet();
        }
        zzdto.m24236a(set, "Cannot return null from a non-@Nullable @Provides method");
        return set;
    }
}
