package com.google.android.gms.internal.ads;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.ads.qw */
class C7895qw<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: f */
    private final int f16682f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public List<C8154xw> f16683g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Map<K, V> f16684h;

    /* renamed from: i */
    private boolean f16685i;

    /* renamed from: j */
    private volatile C8228zw f16686j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Map<K, V> f16687k;

    /* renamed from: l */
    private volatile C8006tw f16688l;

    private C7895qw(int i) {
        this.f16682f = i;
        this.f16683g = Collections.emptyList();
        this.f16684h = Collections.emptyMap();
        this.f16687k = Collections.emptyMap();
    }

    /* renamed from: b */
    static <FieldDescriptorType extends zzdnu<FieldDescriptorType>> C7895qw<FieldDescriptorType, Object> m18057b(int i) {
        return new C7932rw(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m18062f() {
        if (this.f16685i) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: g */
    private final SortedMap<K, V> m18063g() {
        m18062f();
        if (this.f16684h.isEmpty() && !(this.f16684h instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f16684h = treeMap;
            this.f16687k = treeMap.descendingMap();
        }
        return (SortedMap) this.f16684h;
    }

    /* renamed from: a */
    public final boolean mo26481a() {
        return this.f16685i;
    }

    /* renamed from: c */
    public final int mo26483c() {
        return this.f16683g.size();
    }

    public void clear() {
        m18062f();
        if (!this.f16683g.isEmpty()) {
            this.f16683g.clear();
        }
        if (!this.f16684h.isEmpty()) {
            this.f16684h.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m18054a(comparable) >= 0 || this.f16684h.containsKey(comparable);
    }

    /* renamed from: d */
    public final Iterable<Map.Entry<K, V>> mo26486d() {
        if (this.f16684h.isEmpty()) {
            return C8043uw.m18298a();
        }
        return this.f16684h.entrySet();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final Set<Map.Entry<K, V>> mo26487e() {
        if (this.f16688l == null) {
            this.f16688l = new C8006tw(this, (C7932rw) null);
        }
        return this.f16688l;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f16686j == null) {
            this.f16686j = new C8228zw(this, (C7932rw) null);
        }
        return this.f16686j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7895qw)) {
            return super.equals(obj);
        }
        C7895qw qwVar = (C7895qw) obj;
        int size = size();
        if (size != qwVar.size()) {
            return false;
        }
        int c = mo26483c();
        if (c != qwVar.mo26483c()) {
            return entrySet().equals(qwVar.entrySet());
        }
        for (int i = 0; i < c; i++) {
            if (!mo26480a(i).equals(qwVar.mo26480a(i))) {
                return false;
            }
        }
        if (c != size) {
            return this.f16684h.equals(qwVar.f16684h);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = m18054a(comparable);
        if (a >= 0) {
            return this.f16683g.get(a).getValue();
        }
        return this.f16684h.get(comparable);
    }

    public int hashCode() {
        int c = mo26483c();
        int i = 0;
        for (int i2 = 0; i2 < c; i2++) {
            i += this.f16683g.get(i2).hashCode();
        }
        return this.f16684h.size() > 0 ? i + this.f16684h.hashCode() : i;
    }

    public V remove(Object obj) {
        m18062f();
        Comparable comparable = (Comparable) obj;
        int a = m18054a(comparable);
        if (a >= 0) {
            return m18059c(a);
        }
        if (this.f16684h.isEmpty()) {
            return null;
        }
        return this.f16684h.remove(comparable);
    }

    public int size() {
        return this.f16683g.size() + this.f16684h.size();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final V m18059c(int i) {
        m18062f();
        V value = this.f16683g.remove(i).getValue();
        if (!this.f16684h.isEmpty()) {
            Iterator it = m18063g().entrySet().iterator();
            this.f16683g.add(new C8154xw(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* renamed from: a */
    public final Map.Entry<K, V> mo26480a(int i) {
        return this.f16683g.get(i);
    }

    /* renamed from: b */
    public void mo26482b() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f16685i) {
            if (this.f16684h.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f16684h);
            }
            this.f16684h = map;
            if (this.f16687k.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f16687k);
            }
            this.f16687k = map2;
            this.f16685i = true;
        }
    }

    /* renamed from: a */
    public final V put(K k, V v) {
        m18062f();
        int a = m18054a(k);
        if (a >= 0) {
            return this.f16683g.get(a).setValue(v);
        }
        m18062f();
        if (this.f16683g.isEmpty() && !(this.f16683g instanceof ArrayList)) {
            this.f16683g = new ArrayList(this.f16682f);
        }
        int i = -(a + 1);
        if (i >= this.f16682f) {
            return m18063g().put(k, v);
        }
        int size = this.f16683g.size();
        int i2 = this.f16682f;
        if (size == i2) {
            C8154xw remove = this.f16683g.remove(i2 - 1);
            m18063g().put((Comparable) remove.getKey(), remove.getValue());
        }
        this.f16683g.add(i, new C8154xw(this, k, v));
        return null;
    }

    /* synthetic */ C7895qw(int i, C7932rw rwVar) {
        this(i);
    }

    /* renamed from: a */
    private final int m18054a(K k) {
        int size = this.f16683g.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.f16683g.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo((Comparable) this.f16683g.get(i2).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }
}
