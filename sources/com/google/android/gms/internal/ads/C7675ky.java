package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ky */
final class C7675ky implements Iterator<E> {

    /* renamed from: f */
    private int f16027f = 0;

    /* renamed from: g */
    private final /* synthetic */ zzdta f16028g;

    C7675ky(zzdta zzdta) {
        this.f16028g = zzdta;
    }

    public final boolean hasNext() {
        return this.f16027f < this.f16028g.f21738f.size() || this.f16028g.f21739g.hasNext();
    }

    public final E next() {
        while (this.f16027f >= this.f16028g.f21738f.size()) {
            zzdta zzdta = this.f16028g;
            zzdta.f21738f.add(zzdta.f21739g.next());
        }
        List<E> list = this.f16028g.f21738f;
        int i = this.f16027f;
        this.f16027f = i + 1;
        return list.get(i);
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
