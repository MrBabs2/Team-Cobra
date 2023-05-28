package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.zw */
class C8228zw extends AbstractSet<Map.Entry<K, V>> {

    /* renamed from: f */
    private final /* synthetic */ C7895qw f17668f;

    private C8228zw(C7895qw qwVar) {
        this.f17668f = qwVar;
    }

    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f17668f.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.f17668f.clear();
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f17668f.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new C8191yw(this.f17668f, (C7932rw) null);
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f17668f.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.f17668f.size();
    }

    /* synthetic */ C8228zw(C7895qw qwVar, C7932rw rwVar) {
        this(qwVar);
    }
}
