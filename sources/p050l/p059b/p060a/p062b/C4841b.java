package p050l.p059b.p060a.p062b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: l.b.a.b.b */
/* compiled from: SafeIterableMap */
public class C4841b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: f */
    C4844c<K, V> f8292f;

    /* renamed from: g */
    private C4844c<K, V> f8293g;

    /* renamed from: h */
    private WeakHashMap<C4847f<K, V>, Boolean> f8294h = new WeakHashMap<>();

    /* renamed from: i */
    private int f8295i = 0;

    /* renamed from: l.b.a.b.b$a */
    /* compiled from: SafeIterableMap */
    static class C4842a<K, V> extends C4846e<K, V> {
        C4842a(C4844c<K, V> cVar, C4844c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C4844c<K, V> mo16861b(C4844c<K, V> cVar) {
            return cVar.f8299i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C4844c<K, V> mo16862c(C4844c<K, V> cVar) {
            return cVar.f8298h;
        }
    }

    /* renamed from: l.b.a.b.b$b */
    /* compiled from: SafeIterableMap */
    private static class C4843b<K, V> extends C4846e<K, V> {
        C4843b(C4844c<K, V> cVar, C4844c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C4844c<K, V> mo16861b(C4844c<K, V> cVar) {
            return cVar.f8298h;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C4844c<K, V> mo16862c(C4844c<K, V> cVar) {
            return cVar.f8299i;
        }
    }

    /* renamed from: l.b.a.b.b$c */
    /* compiled from: SafeIterableMap */
    static class C4844c<K, V> implements Map.Entry<K, V> {

        /* renamed from: f */
        final K f8296f;

        /* renamed from: g */
        final V f8297g;

        /* renamed from: h */
        C4844c<K, V> f8298h;

        /* renamed from: i */
        C4844c<K, V> f8299i;

        C4844c(K k, V v) {
            this.f8296f = k;
            this.f8297g = v;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C4844c)) {
                return false;
            }
            C4844c cVar = (C4844c) obj;
            if (!this.f8296f.equals(cVar.f8296f) || !this.f8297g.equals(cVar.f8297g)) {
                return false;
            }
            return true;
        }

        public K getKey() {
            return this.f8296f;
        }

        public V getValue() {
            return this.f8297g;
        }

        public int hashCode() {
            return this.f8296f.hashCode() ^ this.f8297g.hashCode();
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f8296f + "=" + this.f8297g;
        }
    }

    /* renamed from: l.b.a.b.b$d */
    /* compiled from: SafeIterableMap */
    private class C4845d implements Iterator<Map.Entry<K, V>>, C4847f<K, V> {

        /* renamed from: f */
        private C4844c<K, V> f8300f;

        /* renamed from: g */
        private boolean f8301g = true;

        C4845d() {
        }

        /* renamed from: a */
        public void mo16869a(C4844c<K, V> cVar) {
            C4844c<K, V> cVar2 = this.f8300f;
            if (cVar == cVar2) {
                C4844c<K, V> cVar3 = cVar2.f8299i;
                this.f8300f = cVar3;
                this.f8301g = cVar3 == null;
            }
        }

        public boolean hasNext() {
            if (!this.f8301g) {
                C4844c<K, V> cVar = this.f8300f;
                if (cVar == null || cVar.f8298h == null) {
                    return false;
                }
                return true;
            } else if (C4841b.this.f8292f != null) {
                return true;
            } else {
                return false;
            }
        }

        public Map.Entry<K, V> next() {
            if (this.f8301g) {
                this.f8301g = false;
                this.f8300f = C4841b.this.f8292f;
            } else {
                C4844c<K, V> cVar = this.f8300f;
                this.f8300f = cVar != null ? cVar.f8298h : null;
            }
            return this.f8300f;
        }
    }

    /* renamed from: l.b.a.b.b$e */
    /* compiled from: SafeIterableMap */
    private static abstract class C4846e<K, V> implements Iterator<Map.Entry<K, V>>, C4847f<K, V> {

        /* renamed from: f */
        C4844c<K, V> f8303f;

        /* renamed from: g */
        C4844c<K, V> f8304g;

        C4846e(C4844c<K, V> cVar, C4844c<K, V> cVar2) {
            this.f8303f = cVar2;
            this.f8304g = cVar;
        }

        /* renamed from: a */
        public void mo16869a(C4844c<K, V> cVar) {
            if (this.f8303f == cVar && cVar == this.f8304g) {
                this.f8304g = null;
                this.f8303f = null;
            }
            C4844c<K, V> cVar2 = this.f8303f;
            if (cVar2 == cVar) {
                this.f8303f = mo16861b(cVar2);
            }
            if (this.f8304g == cVar) {
                this.f8304g = m8125a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract C4844c<K, V> mo16861b(C4844c<K, V> cVar);

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract C4844c<K, V> mo16862c(C4844c<K, V> cVar);

        public boolean hasNext() {
            return this.f8304g != null;
        }

        public Map.Entry<K, V> next() {
            C4844c<K, V> cVar = this.f8304g;
            this.f8304g = m8125a();
            return cVar;
        }

        /* renamed from: a */
        private C4844c<K, V> m8125a() {
            C4844c<K, V> cVar = this.f8304g;
            C4844c<K, V> cVar2 = this.f8303f;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo16862c(cVar);
        }
    }

    /* renamed from: l.b.a.b.b$f */
    /* compiled from: SafeIterableMap */
    interface C4847f<K, V> {
        /* renamed from: a */
        void mo16869a(C4844c<K, V> cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C4844c<K, V> mo16846a(K k) {
        C4844c<K, V> cVar = this.f8292f;
        while (cVar != null && !cVar.f8296f.equals(k)) {
            cVar = cVar.f8298h;
        }
        return cVar;
    }

    /* renamed from: b */
    public V mo16847b(K k, V v) {
        C4844c a = mo16846a(k);
        if (a != null) {
            return a.f8297g;
        }
        mo16852a(k, v);
        return null;
    }

    /* renamed from: c */
    public Map.Entry<K, V> mo16854c() {
        return this.f8293g;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C4843b bVar = new C4843b(this.f8293g, this.f8292f);
        this.f8294h.put(bVar, false);
        return bVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4841b)) {
            return false;
        }
        C4841b bVar = (C4841b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Map.Entry) it.next()).hashCode();
        }
        return i;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        C4842a aVar = new C4842a(this.f8292f, this.f8293g);
        this.f8294h.put(aVar, false);
        return aVar;
    }

    public V remove(K k) {
        C4844c a = mo16846a(k);
        if (a == null) {
            return null;
        }
        this.f8295i--;
        if (!this.f8294h.isEmpty()) {
            for (C4847f<K, V> a2 : this.f8294h.keySet()) {
                a2.mo16869a(a);
            }
        }
        C4844c<K, V> cVar = a.f8299i;
        if (cVar != null) {
            cVar.f8298h = a.f8298h;
        } else {
            this.f8292f = a.f8298h;
        }
        C4844c<K, V> cVar2 = a.f8298h;
        if (cVar2 != null) {
            cVar2.f8299i = a.f8299i;
        } else {
            this.f8293g = a.f8299i;
        }
        a.f8298h = null;
        a.f8299i = null;
        return a.f8297g;
    }

    public int size() {
        return this.f8295i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C4844c<K, V> mo16852a(K k, V v) {
        C4844c<K, V> cVar = new C4844c<>(k, v);
        this.f8295i++;
        C4844c<K, V> cVar2 = this.f8293g;
        if (cVar2 == null) {
            this.f8292f = cVar;
            this.f8293g = cVar;
            return cVar;
        }
        cVar2.f8298h = cVar;
        cVar.f8299i = cVar2;
        this.f8293g = cVar;
        return cVar;
    }

    /* renamed from: b */
    public C4841b<K, V>.C4753d mo16853b() {
        C4841b<K, V>.C4753d dVar = new C4845d();
        this.f8294h.put(dVar, false);
        return dVar;
    }

    /* renamed from: a */
    public Map.Entry<K, V> mo16851a() {
        return this.f8292f;
    }
}
