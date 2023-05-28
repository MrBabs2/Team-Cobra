package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;

public final class zzdts<T> {

    /* renamed from: a */
    private final List<zzdtu<T>> f21763a;

    /* renamed from: b */
    private final List<zzdtu<Collection<T>>> f21764b;

    private zzdts(int i, int i2) {
        this.f21763a = zzdtf.m24224a(i);
        this.f21764b = zzdtf.m24224a(i2);
    }

    /* renamed from: a */
    public final zzdts<T> mo29233a(zzdtu<? extends T> zzdtu) {
        this.f21763a.add(zzdtu);
        return this;
    }

    /* renamed from: b */
    public final zzdts<T> mo29234b(zzdtu<? extends Collection<? extends T>> zzdtu) {
        this.f21764b.add(zzdtu);
        return this;
    }

    /* renamed from: a */
    public final zzdtq<T> mo29232a() {
        return new zzdtq<>(this.f21763a, this.f21764b);
    }
}
