package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.sw */
final class C7969sw implements Iterator<Map.Entry<K, V>> {

    /* renamed from: f */
    private int f16867f;

    /* renamed from: g */
    private Iterator<Map.Entry<K, V>> f16868g;

    /* renamed from: h */
    private final /* synthetic */ C7895qw f16869h;

    private C7969sw(C7895qw qwVar) {
        this.f16869h = qwVar;
        this.f16867f = this.f16869h.f16683g.size();
    }

    /* renamed from: a */
    private final Iterator<Map.Entry<K, V>> m18182a() {
        if (this.f16868g == null) {
            this.f16868g = this.f16869h.f16687k.entrySet().iterator();
        }
        return this.f16868g;
    }

    public final boolean hasNext() {
        int i = this.f16867f;
        return (i > 0 && i <= this.f16869h.f16683g.size()) || m18182a().hasNext();
    }

    public final /* synthetic */ Object next() {
        if (m18182a().hasNext()) {
            return (Map.Entry) m18182a().next();
        }
        List b = this.f16869h.f16683g;
        int i = this.f16867f - 1;
        this.f16867f = i;
        return (Map.Entry) b.get(i);
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ C7969sw(C7895qw qwVar, C7932rw rwVar) {
        this(qwVar);
    }
}
