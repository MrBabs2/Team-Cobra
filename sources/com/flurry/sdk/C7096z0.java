package com.flurry.sdk;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.flurry.sdk.z0 */
public final class C7096z0<K, V> {

    /* renamed from: a */
    public final Map<K, List<V>> f13364a = new HashMap();

    /* renamed from: b */
    private int f13365b;

    /* renamed from: a */
    public final List<V> mo23742a(K k, boolean z) {
        ArrayList arrayList;
        List<V> list = this.f13364a.get(k);
        if (!z || list != null) {
            return list;
        }
        if (this.f13365b > 0) {
            arrayList = new ArrayList(this.f13365b);
        } else {
            arrayList = new ArrayList();
        }
        ArrayList arrayList2 = arrayList;
        this.f13364a.put(k, arrayList2);
        return arrayList2;
    }

    /* renamed from: a */
    public final void mo23743a(K k, V v) {
        if (k != null) {
            mo23742a(k, true).add(v);
        }
    }

    /* renamed from: a */
    public final Collection<Map.Entry<K, V>> mo23741a() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : this.f13364a.entrySet()) {
            for (Object simpleImmutableEntry : (List) next.getValue()) {
                arrayList.add(new AbstractMap.SimpleImmutableEntry(next.getKey(), simpleImmutableEntry));
            }
        }
        return arrayList;
    }
}
