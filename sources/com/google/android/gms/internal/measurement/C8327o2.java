package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.o2 */
final class C8327o2 implements Iterator<Map.Entry<K, V>> {

    /* renamed from: f */
    private int f23312f;

    /* renamed from: g */
    private boolean f23313g;

    /* renamed from: h */
    private Iterator<Map.Entry<K, V>> f23314h;

    /* renamed from: i */
    private final /* synthetic */ C8288g2 f23315i;

    private C8327o2(C8288g2 g2Var) {
        this.f23315i = g2Var;
        this.f23312f = -1;
    }

    /* renamed from: a */
    private final Iterator<Map.Entry<K, V>> m26107a() {
        if (this.f23314h == null) {
            this.f23314h = this.f23315i.f23256h.entrySet().iterator();
        }
        return this.f23314h;
    }

    public final boolean hasNext() {
        if (this.f23312f + 1 < this.f23315i.f23255g.size() || (!this.f23315i.f23256h.isEmpty() && m26107a().hasNext())) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Object next() {
        this.f23313g = true;
        int i = this.f23312f + 1;
        this.f23312f = i;
        if (i < this.f23315i.f23255g.size()) {
            return (Map.Entry) this.f23315i.f23255g.get(this.f23312f);
        }
        return (Map.Entry) m26107a().next();
    }

    public final void remove() {
        if (this.f23313g) {
            this.f23313g = false;
            this.f23315i.m26000f();
            if (this.f23312f < this.f23315i.f23255g.size()) {
                C8288g2 g2Var = this.f23315i;
                int i = this.f23312f;
                this.f23312f = i - 1;
                Object unused = g2Var.m25997c(i);
                return;
            }
            m26107a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    /* synthetic */ C8327o2(C8288g2 g2Var, C8293h2 h2Var) {
        this(g2Var);
    }
}
