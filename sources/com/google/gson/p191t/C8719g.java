package com.google.gson.p191t;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: com.google.gson.t.g */
/* compiled from: LinkedTreeMap */
public final class C8719g<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: m */
    private static final Comparator<Comparable> f24823m = new C8720a();

    /* renamed from: f */
    Comparator<? super K> f24824f;

    /* renamed from: g */
    C8726e<K, V> f24825g;

    /* renamed from: h */
    int f24826h;

    /* renamed from: i */
    int f24827i;

    /* renamed from: j */
    final C8726e<K, V> f24828j;

    /* renamed from: k */
    private C8719g<K, V>.C0980b f24829k;

    /* renamed from: l */
    private C8719g<K, V>.C0981c f24830l;

    /* renamed from: com.google.gson.t.g$a */
    /* compiled from: LinkedTreeMap */
    static class C8720a implements Comparator<Comparable> {
        C8720a() {
        }

        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* renamed from: com.google.gson.t.g$b */
    /* compiled from: LinkedTreeMap */
    class C8721b extends AbstractSet<Map.Entry<K, V>> {

        /* renamed from: com.google.gson.t.g$b$a */
        /* compiled from: LinkedTreeMap */
        class C8722a extends C8719g<K, V>.C4753d<Map.Entry<K, V>> {
            C8722a(C8721b bVar) {
                super();
            }

            public Map.Entry<K, V> next() {
                return mo32456a();
            }
        }

        C8721b() {
        }

        public void clear() {
            C8719g.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && C8719g.this.mo32430a((Map.Entry<?, ?>) (Map.Entry) obj) != null;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C8722a(this);
        }

        public boolean remove(Object obj) {
            C8726e a;
            if (!(obj instanceof Map.Entry) || (a = C8719g.this.mo32430a((Map.Entry<?, ?>) (Map.Entry) obj)) == null) {
                return false;
            }
            C8719g.this.mo32431a(a, true);
            return true;
        }

        public int size() {
            return C8719g.this.f24826h;
        }
    }

    /* renamed from: com.google.gson.t.g$c */
    /* compiled from: LinkedTreeMap */
    final class C8723c extends AbstractSet<K> {

        /* renamed from: com.google.gson.t.g$c$a */
        /* compiled from: LinkedTreeMap */
        class C8724a extends C8719g<K, V>.C4753d<K> {
            C8724a(C8723c cVar) {
                super();
            }

            public K next() {
                return mo32456a().f24842k;
            }
        }

        C8723c() {
        }

        public void clear() {
            C8719g.this.clear();
        }

        public boolean contains(Object obj) {
            return C8719g.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new C8724a(this);
        }

        public boolean remove(Object obj) {
            return C8719g.this.mo32433c(obj) != null;
        }

        public int size() {
            return C8719g.this.f24826h;
        }
    }

    /* renamed from: com.google.gson.t.g$d */
    /* compiled from: LinkedTreeMap */
    private abstract class C8725d<T> implements Iterator<T> {

        /* renamed from: f */
        C8726e<K, V> f24833f;

        /* renamed from: g */
        C8726e<K, V> f24834g = null;

        /* renamed from: h */
        int f24835h;

        C8725d() {
            C8719g gVar = C8719g.this;
            this.f24833f = gVar.f24828j.f24840i;
            this.f24835h = gVar.f24827i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C8726e<K, V> mo32456a() {
            C8726e<K, V> eVar = this.f24833f;
            C8719g gVar = C8719g.this;
            if (eVar == gVar.f24828j) {
                throw new NoSuchElementException();
            } else if (gVar.f24827i == this.f24835h) {
                this.f24833f = eVar.f24840i;
                this.f24834g = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f24833f != C8719g.this.f24828j;
        }

        public final void remove() {
            C8726e<K, V> eVar = this.f24834g;
            if (eVar != null) {
                C8719g.this.mo32431a(eVar, true);
                this.f24834g = null;
                this.f24835h = C8719g.this.f24827i;
                return;
            }
            throw new IllegalStateException();
        }
    }

    static {
        Class<C8719g> cls = C8719g.class;
    }

    public C8719g() {
        this(f24823m);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C8726e<K, V> mo32429a(K k, boolean z) {
        int i;
        C8726e<K, V> eVar;
        Comparator<? super K> comparator = this.f24824f;
        C8726e<K, V> eVar2 = this.f24825g;
        if (eVar2 != null) {
            Comparable comparable = comparator == f24823m ? (Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(eVar2.f24842k);
                } else {
                    i = comparator.compare(k, eVar2.f24842k);
                }
                if (i == 0) {
                    return eVar2;
                }
                C8726e<K, V> eVar3 = i < 0 ? eVar2.f24838g : eVar2.f24839h;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        C8726e<K, V> eVar4 = this.f24828j;
        if (eVar2 != null) {
            eVar = new C8726e<>(eVar2, k, eVar4, eVar4.f24841j);
            if (i < 0) {
                eVar2.f24838g = eVar;
            } else {
                eVar2.f24839h = eVar;
            }
            m28491b(eVar2, true);
        } else if (comparator != f24823m || (k instanceof Comparable)) {
            eVar = new C8726e<>(eVar2, k, eVar4, eVar4.f24841j);
            this.f24825g = eVar;
        } else {
            throw new ClassCastException(k.getClass().getName() + " is not Comparable");
        }
        this.f24826h++;
        this.f24827i++;
        return eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C8726e<K, V> mo32432b(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return mo32429a(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C8726e<K, V> mo32433c(Object obj) {
        C8726e<K, V> b = mo32432b(obj);
        if (b != null) {
            mo32431a(b, true);
        }
        return b;
    }

    public void clear() {
        this.f24825g = null;
        this.f24826h = 0;
        this.f24827i++;
        C8726e<K, V> eVar = this.f24828j;
        eVar.f24841j = eVar;
        eVar.f24840i = eVar;
    }

    public boolean containsKey(Object obj) {
        return mo32432b(obj) != null;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        C8719g<K, V>.C0980b bVar = this.f24829k;
        if (bVar != null) {
            return bVar;
        }
        C8719g<K, V>.C0980b bVar2 = new C8721b();
        this.f24829k = bVar2;
        return bVar2;
    }

    public V get(Object obj) {
        C8726e b = mo32432b(obj);
        if (b != null) {
            return b.f24843l;
        }
        return null;
    }

    public Set<K> keySet() {
        C8719g<K, V>.C0981c cVar = this.f24830l;
        if (cVar != null) {
            return cVar;
        }
        C8719g<K, V>.C0981c cVar2 = new C8723c();
        this.f24830l = cVar2;
        return cVar2;
    }

    public V put(K k, V v) {
        if (k != null) {
            C8726e a = mo32429a(k, true);
            V v2 = a.f24843l;
            a.f24843l = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    public V remove(Object obj) {
        C8726e c = mo32433c(obj);
        if (c != null) {
            return c.f24843l;
        }
        return null;
    }

    public int size() {
        return this.f24826h;
    }

    public C8719g(Comparator<? super K> comparator) {
        this.f24826h = 0;
        this.f24827i = 0;
        this.f24828j = new C8726e<>();
        this.f24824f = comparator == null ? f24823m : comparator;
    }

    /* renamed from: b */
    private void m28491b(C8726e<K, V> eVar, boolean z) {
        while (eVar != null) {
            C8726e<K, V> eVar2 = eVar.f24838g;
            C8726e<K, V> eVar3 = eVar.f24839h;
            int i = 0;
            int i2 = eVar2 != null ? eVar2.f24844m : 0;
            int i3 = eVar3 != null ? eVar3.f24844m : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                C8726e<K, V> eVar4 = eVar3.f24838g;
                C8726e<K, V> eVar5 = eVar3.f24839h;
                int i5 = eVar5 != null ? eVar5.f24844m : 0;
                if (eVar4 != null) {
                    i = eVar4.f24844m;
                }
                int i6 = i - i5;
                if (i6 == -1 || (i6 == 0 && !z)) {
                    m28487a(eVar);
                } else {
                    m28490b(eVar3);
                    m28487a(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                C8726e<K, V> eVar6 = eVar2.f24838g;
                C8726e<K, V> eVar7 = eVar2.f24839h;
                int i7 = eVar7 != null ? eVar7.f24844m : 0;
                if (eVar6 != null) {
                    i = eVar6.f24844m;
                }
                int i8 = i - i7;
                if (i8 == 1 || (i8 == 0 && !z)) {
                    m28490b(eVar);
                } else {
                    m28487a(eVar2);
                    m28490b(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                eVar.f24844m = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.f24844m = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.f24837f;
        }
    }

    /* renamed from: com.google.gson.t.g$e */
    /* compiled from: LinkedTreeMap */
    static final class C8726e<K, V> implements Map.Entry<K, V> {

        /* renamed from: f */
        C8726e<K, V> f24837f;

        /* renamed from: g */
        C8726e<K, V> f24838g;

        /* renamed from: h */
        C8726e<K, V> f24839h;

        /* renamed from: i */
        C8726e<K, V> f24840i;

        /* renamed from: j */
        C8726e<K, V> f24841j;

        /* renamed from: k */
        final K f24842k;

        /* renamed from: l */
        V f24843l;

        /* renamed from: m */
        int f24844m;

        C8726e() {
            this.f24842k = null;
            this.f24841j = this;
            this.f24840i = this;
        }

        /* renamed from: a */
        public C8726e<K, V> mo32459a() {
            C8726e<K, V> eVar = this;
            for (C8726e<K, V> eVar2 = this.f24838g; eVar2 != null; eVar2 = eVar2.f24838g) {
                eVar = eVar2;
            }
            return eVar;
        }

        /* renamed from: b */
        public C8726e<K, V> mo32460b() {
            C8726e<K, V> eVar = this;
            for (C8726e<K, V> eVar2 = this.f24839h; eVar2 != null; eVar2 = eVar2.f24839h) {
                eVar = eVar2;
            }
            return eVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x0032
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                K r0 = r3.f24842k
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x0032
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0032
            L_0x001c:
                V r0 = r3.f24843l
                if (r0 != 0) goto L_0x0027
                java.lang.Object r4 = r4.getValue()
                if (r4 != 0) goto L_0x0032
                goto L_0x0031
            L_0x0027:
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x0032
            L_0x0031:
                r1 = 1
            L_0x0032:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.p191t.C8719g.C8726e.equals(java.lang.Object):boolean");
        }

        public K getKey() {
            return this.f24842k;
        }

        public V getValue() {
            return this.f24843l;
        }

        public int hashCode() {
            K k = this.f24842k;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f24843l;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            V v2 = this.f24843l;
            this.f24843l = v;
            return v2;
        }

        public String toString() {
            return this.f24842k + "=" + this.f24843l;
        }

        C8726e(C8726e<K, V> eVar, K k, C8726e<K, V> eVar2, C8726e<K, V> eVar3) {
            this.f24837f = eVar;
            this.f24842k = k;
            this.f24844m = 1;
            this.f24840i = eVar2;
            this.f24841j = eVar3;
            eVar3.f24840i = this;
            eVar2.f24841j = this;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C8726e<K, V> mo32430a(Map.Entry<?, ?> entry) {
        C8726e<K, V> b = mo32432b((Object) entry.getKey());
        if (b != null && m28489a((Object) b.f24843l, (Object) entry.getValue())) {
            return b;
        }
        return null;
    }

    /* renamed from: a */
    private boolean m28489a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32431a(C8726e<K, V> eVar, boolean z) {
        int i;
        if (z) {
            C8726e<K, V> eVar2 = eVar.f24841j;
            eVar2.f24840i = eVar.f24840i;
            eVar.f24840i.f24841j = eVar2;
        }
        C8726e<K, V> eVar3 = eVar.f24838g;
        C8726e<K, V> eVar4 = eVar.f24839h;
        C8726e<K, V> eVar5 = eVar.f24837f;
        int i2 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                m28488a(eVar, eVar3);
                eVar.f24838g = null;
            } else if (eVar4 != null) {
                m28488a(eVar, eVar4);
                eVar.f24839h = null;
            } else {
                m28488a(eVar, (C8726e<K, V>) null);
            }
            m28491b(eVar5, false);
            this.f24826h--;
            this.f24827i++;
            return;
        }
        C8726e<K, V> b = eVar3.f24844m > eVar4.f24844m ? eVar3.mo32460b() : eVar4.mo32459a();
        mo32431a(b, false);
        C8726e<K, V> eVar6 = eVar.f24838g;
        if (eVar6 != null) {
            i = eVar6.f24844m;
            b.f24838g = eVar6;
            eVar6.f24837f = b;
            eVar.f24838g = null;
        } else {
            i = 0;
        }
        C8726e<K, V> eVar7 = eVar.f24839h;
        if (eVar7 != null) {
            i2 = eVar7.f24844m;
            b.f24839h = eVar7;
            eVar7.f24837f = b;
            eVar.f24839h = null;
        }
        b.f24844m = Math.max(i, i2) + 1;
        m28488a(eVar, b);
    }

    /* renamed from: b */
    private void m28490b(C8726e<K, V> eVar) {
        C8726e<K, V> eVar2 = eVar.f24838g;
        C8726e<K, V> eVar3 = eVar.f24839h;
        C8726e<K, V> eVar4 = eVar2.f24838g;
        C8726e<K, V> eVar5 = eVar2.f24839h;
        eVar.f24838g = eVar5;
        if (eVar5 != null) {
            eVar5.f24837f = eVar;
        }
        m28488a(eVar, eVar2);
        eVar2.f24839h = eVar;
        eVar.f24837f = eVar2;
        int i = 0;
        int max = Math.max(eVar3 != null ? eVar3.f24844m : 0, eVar5 != null ? eVar5.f24844m : 0) + 1;
        eVar.f24844m = max;
        if (eVar4 != null) {
            i = eVar4.f24844m;
        }
        eVar2.f24844m = Math.max(max, i) + 1;
    }

    /* renamed from: a */
    private void m28488a(C8726e<K, V> eVar, C8726e<K, V> eVar2) {
        C8726e<K, V> eVar3 = eVar.f24837f;
        eVar.f24837f = null;
        if (eVar2 != null) {
            eVar2.f24837f = eVar3;
        }
        if (eVar3 == null) {
            this.f24825g = eVar2;
        } else if (eVar3.f24838g == eVar) {
            eVar3.f24838g = eVar2;
        } else {
            eVar3.f24839h = eVar2;
        }
    }

    /* renamed from: a */
    private void m28487a(C8726e<K, V> eVar) {
        C8726e<K, V> eVar2 = eVar.f24838g;
        C8726e<K, V> eVar3 = eVar.f24839h;
        C8726e<K, V> eVar4 = eVar3.f24838g;
        C8726e<K, V> eVar5 = eVar3.f24839h;
        eVar.f24839h = eVar4;
        if (eVar4 != null) {
            eVar4.f24837f = eVar;
        }
        m28488a(eVar, eVar3);
        eVar3.f24838g = eVar;
        eVar.f24837f = eVar3;
        int i = 0;
        int max = Math.max(eVar2 != null ? eVar2.f24844m : 0, eVar4 != null ? eVar4.f24844m : 0) + 1;
        eVar.f24844m = max;
        if (eVar5 != null) {
            i = eVar5.f24844m;
        }
        eVar3.f24844m = Math.max(max, i) + 1;
    }
}
