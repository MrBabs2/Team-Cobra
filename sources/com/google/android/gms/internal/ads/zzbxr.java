package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

public final class zzbxr implements zzdti<Set<String>> {

    /* renamed from: a */
    private final zzdtu<zzbzc> f19606a;

    public zzbxr(zzdtu<zzbzc> zzdtu) {
        this.f19606a = zzdtu;
    }

    public final /* synthetic */ Object get() {
        Set set;
        if (this.f19606a.get().mo28569d() != null) {
            set = Collections.singleton("banner");
        } else {
            set = Collections.emptySet();
        }
        zzdto.m24236a(set, "Cannot return null from a non-@Nullable @Provides method");
        return set;
    }
}
