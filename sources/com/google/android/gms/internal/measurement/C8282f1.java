package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.f1 */
final class C8282f1<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: f */
    private Iterator<Map.Entry<K, Object>> f23241f;

    public C8282f1(Iterator<Map.Entry<K, Object>> it) {
        this.f23241f = it;
    }

    public final boolean hasNext() {
        return this.f23241f.hasNext();
    }

    public final /* synthetic */ Object next() {
        Map.Entry next = this.f23241f.next();
        return next.getValue() instanceof zzuy ? new C8277e1(next) : next;
    }

    public final void remove() {
        this.f23241f.remove();
    }
}
