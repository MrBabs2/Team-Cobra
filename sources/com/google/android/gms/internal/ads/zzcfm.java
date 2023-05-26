package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Set;

public final class zzcfm implements zzdti<zzcfk> {

    /* renamed from: a */
    private final zzdtu<zzcfi> f20114a;

    /* renamed from: b */
    private final zzdtu<Set<C7581ii>> f20115b;

    /* renamed from: c */
    private final zzdtu<Clock> f20116c;

    private zzcfm(zzdtu<zzcfi> zzdtu, zzdtu<Set<C7581ii>> zzdtu2, zzdtu<Clock> zzdtu3) {
        this.f20114a = zzdtu;
        this.f20115b = zzdtu2;
        this.f20116c = zzdtu3;
    }

    /* renamed from: a */
    public static zzcfm m22476a(zzdtu<zzcfi> zzdtu, zzdtu<Set<C7581ii>> zzdtu2, zzdtu<Clock> zzdtu3) {
        return new zzcfm(zzdtu, zzdtu2, zzdtu3);
    }

    public final /* synthetic */ Object get() {
        return new zzcfk(this.f20114a.get(), this.f20115b.get(), this.f20116c.get());
    }
}
