package com.google.android.gms.internal.ads;

import java.util.Map;

public final class zzblr implements zzdti<zzblq> {

    /* renamed from: a */
    private final zzdtu<Map<String, zzbls>> f19138a;

    private zzblr(zzdtu<Map<String, zzbls>> zzdtu) {
        this.f19138a = zzdtu;
    }

    /* renamed from: a */
    public static zzblr m21335a(zzdtu<Map<String, zzbls>> zzdtu) {
        return new zzblr(zzdtu);
    }

    public final /* synthetic */ Object get() {
        return new zzblq(this.f19138a.get());
    }
}
