package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.p2 */
class C8331p2 extends AbstractSet<Map.Entry<K, V>> {

    /* renamed from: f */
    private final /* synthetic */ C8288g2 f23319f;

    private C8331p2(C8288g2 g2Var) {
        this.f23319f = g2Var;
    }

    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f23319f.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.f23319f.clear();
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f23319f.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new C8327o2(this.f23319f, (C8293h2) null);
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f23319f.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.f23319f.size();
    }

    /* synthetic */ C8331p2(C8288g2 g2Var, C8293h2 h2Var) {
        this(g2Var);
    }
}
