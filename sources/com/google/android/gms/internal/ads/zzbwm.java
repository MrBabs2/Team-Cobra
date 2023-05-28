package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

public final class zzbwm implements zzdti<Set<zzbuz<zzbuu>>> {

    /* renamed from: a */
    private final zzdtu<zzbxe> f19549a;

    private zzbwm(zzdtu<zzbxe> zzdtu) {
        this.f19549a = zzdtu;
    }

    /* renamed from: a */
    public static zzbwm m21980a(zzdtu<zzbxe> zzdtu) {
        return new zzbwm(zzdtu);
    }

    public final /* synthetic */ Object get() {
        Set singleton = Collections.singleton(zzbuz.m21935a(this.f19549a.get(), zzbbm.f18749b));
        zzdto.m24236a(singleton, "Cannot return null from a non-@Nullable @Provides method");
        return singleton;
    }
}
