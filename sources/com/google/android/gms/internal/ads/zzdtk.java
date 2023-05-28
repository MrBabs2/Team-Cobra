package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public final class zzdtk<K, V> implements zzdti<Map<K, V>> {

    /* renamed from: a */
    private final Map<K, zzdtu<V>> f21758a;

    static {
        zzdtj.m24231a(Collections.emptyMap());
    }

    private zzdtk(Map<K, zzdtu<V>> map) {
        this.f21758a = Collections.unmodifiableMap(map);
    }

    /* renamed from: a */
    public static <K, V> zzdtm<K, V> m24232a(int i) {
        return new zzdtm<>(i);
    }

    public final /* synthetic */ Object get() {
        LinkedHashMap c = zzdtf.m24226c(this.f21758a.size());
        for (Map.Entry next : this.f21758a.entrySet()) {
            c.put(next.getKey(), ((zzdtu) next.getValue()).get());
        }
        return Collections.unmodifiableMap(c);
    }
}
