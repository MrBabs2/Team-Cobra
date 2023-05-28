package p050l.p066e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: l.e.f */
/* compiled from: MapCollections */
abstract class C4875f<K, V> {

    /* renamed from: a */
    C4875f<K, V>.C0980b f8365a;

    /* renamed from: b */
    C4875f<K, V>.C0981c f8366b;

    /* renamed from: c */
    C4875f<K, V>.C4754e f8367c;

    /* renamed from: l.e.f$a */
    /* compiled from: MapCollections */
    final class C4876a<T> implements Iterator<T> {

        /* renamed from: f */
        final int f8368f;

        /* renamed from: g */
        int f8369g;

        /* renamed from: h */
        int f8370h;

        /* renamed from: i */
        boolean f8371i = false;

        C4876a(int i) {
            this.f8368f = i;
            this.f8369g = C4875f.this.mo16914c();
        }

        public boolean hasNext() {
            return this.f8370h < this.f8369g;
        }

        public T next() {
            if (hasNext()) {
                T a = C4875f.this.mo16907a(this.f8370h, this.f8368f);
                this.f8370h++;
                this.f8371i = true;
                return a;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f8371i) {
                int i = this.f8370h - 1;
                this.f8370h = i;
                this.f8369g--;
                this.f8371i = false;
                C4875f.this.mo16910a(i);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: l.e.f$b */
    /* compiled from: MapCollections */
    final class C4877b implements Set<Map.Entry<K, V>> {
        C4877b() {
        }

        /* renamed from: a */
        public boolean mo16963a(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            mo16963a((Map.Entry) obj);
            throw null;
        }

        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int c = C4875f.this.mo16914c();
            for (Map.Entry entry : collection) {
                C4875f.this.mo16911a(entry.getKey(), entry.getValue());
            }
            return c != C4875f.this.mo16914c();
        }

        public void clear() {
            C4875f.this.mo16909a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int a = C4875f.this.mo16906a(entry.getKey());
            if (a < 0) {
                return false;
            }
            return C4872c.m8189a(C4875f.this.mo16907a(a, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return C4875f.m8212a(this, obj);
        }

        public int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            for (int c = C4875f.this.mo16914c() - 1; c >= 0; c--) {
                Object a = C4875f.this.mo16907a(c, 0);
                Object a2 = C4875f.this.mo16907a(c, 1);
                if (a == null) {
                    i = 0;
                } else {
                    i = a.hashCode();
                }
                if (a2 == null) {
                    i2 = 0;
                } else {
                    i2 = a2.hashCode();
                }
                i3 += i ^ i2;
            }
            return i3;
        }

        public boolean isEmpty() {
            return C4875f.this.mo16914c() == 0;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C4879d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return C4875f.this.mo16914c();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: l.e.f$c */
    /* compiled from: MapCollections */
    final class C4878c implements Set<K> {
        C4878c() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C4875f.this.mo16909a();
        }

        public boolean contains(Object obj) {
            return C4875f.this.mo16906a(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return C4875f.m8211a(C4875f.this.mo16913b(), collection);
        }

        public boolean equals(Object obj) {
            return C4875f.m8212a(this, obj);
        }

        public int hashCode() {
            int i;
            int i2 = 0;
            for (int c = C4875f.this.mo16914c() - 1; c >= 0; c--) {
                Object a = C4875f.this.mo16907a(c, 0);
                if (a == null) {
                    i = 0;
                } else {
                    i = a.hashCode();
                }
                i2 += i;
            }
            return i2;
        }

        public boolean isEmpty() {
            return C4875f.this.mo16914c() == 0;
        }

        public Iterator<K> iterator() {
            return new C4876a(0);
        }

        public boolean remove(Object obj) {
            int a = C4875f.this.mo16906a(obj);
            if (a < 0) {
                return false;
            }
            C4875f.this.mo16910a(a);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return C4875f.m8213b(C4875f.this.mo16913b(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return C4875f.m8214c(C4875f.this.mo16913b(), collection);
        }

        public int size() {
            return C4875f.this.mo16914c();
        }

        public Object[] toArray() {
            return C4875f.this.mo16956b(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return C4875f.this.mo16955a(tArr, 0);
        }
    }

    /* renamed from: l.e.f$d */
    /* compiled from: MapCollections */
    final class C4879d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: f */
        int f8375f;

        /* renamed from: g */
        int f8376g;

        /* renamed from: h */
        boolean f8377h = false;

        C4879d() {
            this.f8375f = C4875f.this.mo16914c() - 1;
            this.f8376g = -1;
        }

        public boolean equals(Object obj) {
            if (!this.f8377h) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                if (!C4872c.m8189a(entry.getKey(), C4875f.this.mo16907a(this.f8376g, 0)) || !C4872c.m8189a(entry.getValue(), C4875f.this.mo16907a(this.f8376g, 1))) {
                    return false;
                }
                return true;
            }
        }

        public K getKey() {
            if (this.f8377h) {
                return C4875f.this.mo16907a(this.f8376g, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f8377h) {
                return C4875f.this.mo16907a(this.f8376g, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f8376g < this.f8375f;
        }

        public int hashCode() {
            int i;
            if (this.f8377h) {
                int i2 = 0;
                Object a = C4875f.this.mo16907a(this.f8376g, 0);
                Object a2 = C4875f.this.mo16907a(this.f8376g, 1);
                if (a == null) {
                    i = 0;
                } else {
                    i = a.hashCode();
                }
                if (a2 != null) {
                    i2 = a2.hashCode();
                }
                return i ^ i2;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public void remove() {
            if (this.f8377h) {
                C4875f.this.mo16910a(this.f8376g);
                this.f8376g--;
                this.f8375f--;
                this.f8377h = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v) {
            if (this.f8377h) {
                return C4875f.this.mo16908a(this.f8376g, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }

        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.f8376g++;
                this.f8377h = true;
                return this;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: l.e.f$e */
    /* compiled from: MapCollections */
    final class C4880e implements Collection<V> {
        C4880e() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C4875f.this.mo16909a();
        }

        public boolean contains(Object obj) {
            return C4875f.this.mo16912b(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return C4875f.this.mo16914c() == 0;
        }

        public Iterator<V> iterator() {
            return new C4876a(1);
        }

        public boolean remove(Object obj) {
            int b = C4875f.this.mo16912b(obj);
            if (b < 0) {
                return false;
            }
            C4875f.this.mo16910a(b);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int c = C4875f.this.mo16914c();
            int i = 0;
            boolean z = false;
            while (i < c) {
                if (collection.contains(C4875f.this.mo16907a(i, 1))) {
                    C4875f.this.mo16910a(i);
                    i--;
                    c--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int c = C4875f.this.mo16914c();
            int i = 0;
            boolean z = false;
            while (i < c) {
                if (!collection.contains(C4875f.this.mo16907a(i, 1))) {
                    C4875f.this.mo16910a(i);
                    i--;
                    c--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return C4875f.this.mo16914c();
        }

        public Object[] toArray() {
            return C4875f.this.mo16956b(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return C4875f.this.mo16955a(tArr, 1);
        }
    }

    C4875f() {
    }

    /* renamed from: a */
    public static <K, V> boolean m8211a(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static <K, V> boolean m8213b(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    /* renamed from: c */
    public static <K, V> boolean m8214c(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo16906a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo16907a(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract V mo16908a(int i, V v);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo16909a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo16910a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo16911a(K k, V v);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo16912b(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Map<K, V> mo16913b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo16914c();

    /* renamed from: d */
    public Set<Map.Entry<K, V>> mo16957d() {
        if (this.f8365a == null) {
            this.f8365a = new C4877b();
        }
        return this.f8365a;
    }

    /* renamed from: e */
    public Set<K> mo16958e() {
        if (this.f8366b == null) {
            this.f8366b = new C4878c();
        }
        return this.f8366b;
    }

    /* renamed from: f */
    public Collection<V> mo16959f() {
        if (this.f8367c == null) {
            this.f8367c = new C4880e();
        }
        return this.f8367c;
    }

    /* renamed from: a */
    public <T> T[] mo16955a(T[] tArr, int i) {
        int c = mo16914c();
        if (tArr.length < c) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), c);
        }
        for (int i2 = 0; i2 < c; i2++) {
            tArr[i2] = mo16907a(i2, i);
        }
        if (tArr.length > c) {
            tArr[c] = null;
        }
        return tArr;
    }

    /* renamed from: b */
    public Object[] mo16956b(int i) {
        int c = mo16914c();
        Object[] objArr = new Object[c];
        for (int i2 = 0; i2 < c; i2++) {
            objArr[i2] = mo16907a(i2, i);
        }
        return objArr;
    }

    /* renamed from: a */
    public static <T> boolean m8212a(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}
