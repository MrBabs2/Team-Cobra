package com.google.android.gms.internal.measurement;

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

/* renamed from: com.google.android.gms.internal.measurement.g2 */
class C8288g2<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: f */
    private final int f23254f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public List<C8323n2> f23255g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Map<K, V> f23256h;

    /* renamed from: i */
    private boolean f23257i;

    /* renamed from: j */
    private volatile C8331p2 f23258j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Map<K, V> f23259k;

    /* renamed from: l */
    private volatile C8303j2 f23260l;

    private C8288g2(int i) {
        this.f23254f = i;
        this.f23255g = Collections.emptyList();
        this.f23256h = Collections.emptyMap();
        this.f23259k = Collections.emptyMap();
    }

    /* renamed from: b */
    static <FieldDescriptorType extends zzuh<FieldDescriptorType>> C8288g2<FieldDescriptorType, Object> m25995b(int i) {
        return new C8293h2(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m26000f() {
        if (this.f23257i) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: g */
    private final SortedMap<K, V> m26001g() {
        m26000f();
        if (this.f23256h.isEmpty() && !(this.f23256h instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f23256h = treeMap;
            this.f23259k = treeMap.descendingMap();
        }
        return (SortedMap) this.f23256h;
    }

    /* renamed from: a */
    public final boolean mo30116a() {
        return this.f23257i;
    }

    /* renamed from: c */
    public final int mo30118c() {
        return this.f23255g.size();
    }

    public void clear() {
        m26000f();
        if (!this.f23255g.isEmpty()) {
            this.f23255g.clear();
        }
        if (!this.f23256h.isEmpty()) {
            this.f23256h.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m25992a(comparable) >= 0 || this.f23256h.containsKey(comparable);
    }

    /* renamed from: d */
    public final Iterable<Map.Entry<K, V>> mo30121d() {
        if (this.f23256h.isEmpty()) {
            return C8308k2.m26034a();
        }
        return this.f23256h.entrySet();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final Set<Map.Entry<K, V>> mo30122e() {
        if (this.f23260l == null) {
            this.f23260l = new C8303j2(this, (C8293h2) null);
        }
        return this.f23260l;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f23258j == null) {
            this.f23258j = new C8331p2(this, (C8293h2) null);
        }
        return this.f23258j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8288g2)) {
            return super.equals(obj);
        }
        C8288g2 g2Var = (C8288g2) obj;
        int size = size();
        if (size != g2Var.size()) {
            return false;
        }
        int c = mo30118c();
        if (c != g2Var.mo30118c()) {
            return entrySet().equals(g2Var.entrySet());
        }
        for (int i = 0; i < c; i++) {
            if (!mo30115a(i).equals(g2Var.mo30115a(i))) {
                return false;
            }
        }
        if (c != size) {
            return this.f23256h.equals(g2Var.f23256h);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = m25992a(comparable);
        if (a >= 0) {
            return this.f23255g.get(a).getValue();
        }
        return this.f23256h.get(comparable);
    }

    public int hashCode() {
        int c = mo30118c();
        int i = 0;
        for (int i2 = 0; i2 < c; i2++) {
            i += this.f23255g.get(i2).hashCode();
        }
        return this.f23256h.size() > 0 ? i + this.f23256h.hashCode() : i;
    }

    public V remove(Object obj) {
        m26000f();
        Comparable comparable = (Comparable) obj;
        int a = m25992a(comparable);
        if (a >= 0) {
            return m25997c(a);
        }
        if (this.f23256h.isEmpty()) {
            return null;
        }
        return this.f23256h.remove(comparable);
    }

    public int size() {
        return this.f23255g.size() + this.f23256h.size();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final V m25997c(int i) {
        m26000f();
        V value = this.f23255g.remove(i).getValue();
        if (!this.f23256h.isEmpty()) {
            Iterator it = m26001g().entrySet().iterator();
            this.f23255g.add(new C8323n2(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* renamed from: a */
    public final Map.Entry<K, V> mo30115a(int i) {
        return this.f23255g.get(i);
    }

    /* renamed from: b */
    public void mo30117b() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f23257i) {
            if (this.f23256h.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f23256h);
            }
            this.f23256h = map;
            if (this.f23259k.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f23259k);
            }
            this.f23259k = map2;
            this.f23257i = true;
        }
    }

    /* renamed from: a */
    public final V put(K k, V v) {
        m26000f();
        int a = m25992a(k);
        if (a >= 0) {
            return this.f23255g.get(a).setValue(v);
        }
        m26000f();
        if (this.f23255g.isEmpty() && !(this.f23255g instanceof ArrayList)) {
            this.f23255g = new ArrayList(this.f23254f);
        }
        int i = -(a + 1);
        if (i >= this.f23254f) {
            return m26001g().put(k, v);
        }
        int size = this.f23255g.size();
        int i2 = this.f23254f;
        if (size == i2) {
            C8323n2 remove = this.f23255g.remove(i2 - 1);
            m26001g().put((Comparable) remove.getKey(), remove.getValue());
        }
        this.f23255g.add(i, new C8323n2(this, k, v));
        return null;
    }

    /* synthetic */ C8288g2(int i, C8293h2 h2Var) {
        this(i);
    }

    /* renamed from: a */
    private final int m25992a(K k) {
        int size = this.f23255g.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.f23255g.get(size).getKey());
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
            int compareTo2 = k.compareTo((Comparable) this.f23255g.get(i2).getKey());
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
