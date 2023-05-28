package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.kv */
final class C7672kv<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: f */
    private Iterator<Map.Entry<K, Object>> f16022f;

    public C7672kv(Iterator<Map.Entry<K, Object>> it) {
        this.f16022f = it;
    }

    public final boolean hasNext() {
        return this.f16022f.hasNext();
    }

    public final /* synthetic */ Object next() {
        Map.Entry next = this.f16022f.next();
        return next.getValue() instanceof zzdon ? new C7635jv(next) : next;
    }

    public final void remove() {
        this.f16022f.remove();
    }
}
