package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.i2 */
final class C8298i2 implements Iterator<Map.Entry<K, V>> {

    /* renamed from: f */
    private int f23266f;

    /* renamed from: g */
    private Iterator<Map.Entry<K, V>> f23267g;

    /* renamed from: h */
    private final /* synthetic */ C8288g2 f23268h;

    private C8298i2(C8288g2 g2Var) {
        this.f23268h = g2Var;
        this.f23266f = this.f23268h.f23255g.size();
    }

    /* renamed from: a */
    private final Iterator<Map.Entry<K, V>> m26018a() {
        if (this.f23267g == null) {
            this.f23267g = this.f23268h.f23259k.entrySet().iterator();
        }
        return this.f23267g;
    }

    public final boolean hasNext() {
        int i = this.f23266f;
        return (i > 0 && i <= this.f23268h.f23255g.size()) || m26018a().hasNext();
    }

    public final /* synthetic */ Object next() {
        if (m26018a().hasNext()) {
            return (Map.Entry) m26018a().next();
        }
        List b = this.f23268h.f23255g;
        int i = this.f23266f - 1;
        this.f23266f = i;
        return (Map.Entry) b.get(i);
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ C8298i2(C8288g2 g2Var, C8293h2 h2Var) {
        this(g2Var);
    }
}
