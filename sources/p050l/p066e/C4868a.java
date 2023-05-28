package p050l.p066e;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: l.e.a */
/* compiled from: ArrayMap */
public class C4868a<K, V> extends C4881g<K, V> implements Map<K, V> {

    /* renamed from: m */
    C4875f<K, V> f8336m;

    /* renamed from: l.e.a$a */
    /* compiled from: ArrayMap */
    class C4869a extends C4875f<K, V> {
        C4869a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo16907a(int i, int i2) {
            return C4868a.this.f8385g[(i << 1) + i2];
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public int mo16912b(Object obj) {
            return C4868a.this.mo17023c(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo16914c() {
            return C4868a.this.f8386h;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo16906a(Object obj) {
            return C4868a.this.mo17021b(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Map<K, V> mo16913b() {
            return C4868a.this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo16911a(K k, V v) {
            C4868a.this.put(k, v);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public V mo16908a(int i, V v) {
            return C4868a.this.mo17018a(i, v);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo16910a(int i) {
            C4868a.this.mo17024c(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo16909a() {
            C4868a.this.clear();
        }
    }

    public C4868a() {
    }

    /* renamed from: b */
    private C4875f<K, V> m8158b() {
        if (this.f8336m == null) {
            this.f8336m = new C4869a();
        }
        return this.f8336m;
    }

    /* renamed from: a */
    public boolean mo16901a(Collection<?> collection) {
        return C4875f.m8214c(this, collection);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return m8158b().mo16957d();
    }

    public Set<K> keySet() {
        return m8158b().mo16958e();
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo17019a(this.f8386h + map.size());
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public Collection<V> values() {
        return m8158b().mo16959f();
    }

    public C4868a(int i) {
        super(i);
    }

    public C4868a(C4881g gVar) {
        super(gVar);
    }
}
