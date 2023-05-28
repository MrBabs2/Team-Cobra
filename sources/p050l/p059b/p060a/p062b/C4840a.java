package p050l.p059b.p060a.p062b;

import java.util.HashMap;
import java.util.Map;
import p050l.p059b.p060a.p062b.C4841b;

/* renamed from: l.b.a.b.a */
/* compiled from: FastSafeIterableMap */
public class C4840a<K, V> extends C4841b<K, V> {

    /* renamed from: j */
    private HashMap<K, C4841b.C4844c<K, V>> f8291j = new HashMap<>();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C4841b.C4844c<K, V> mo16846a(K k) {
        return this.f8291j.get(k);
    }

    /* renamed from: b */
    public V mo16847b(K k, V v) {
        C4841b.C4844c a = mo16846a(k);
        if (a != null) {
            return a.f8297g;
        }
        this.f8291j.put(k, mo16852a(k, v));
        return null;
    }

    public boolean contains(K k) {
        return this.f8291j.containsKey(k);
    }

    public V remove(K k) {
        V remove = super.remove(k);
        this.f8291j.remove(k);
        return remove;
    }

    /* renamed from: b */
    public Map.Entry<K, V> mo16848b(K k) {
        if (contains(k)) {
            return this.f8291j.get(k).f8299i;
        }
        return null;
    }
}
