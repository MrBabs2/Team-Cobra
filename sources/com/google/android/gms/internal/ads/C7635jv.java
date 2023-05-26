package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.jv */
final class C7635jv<K> implements Map.Entry<K, Object> {

    /* renamed from: f */
    private Map.Entry<K, zzdon> f15777f;

    private C7635jv(Map.Entry<K, zzdon> entry) {
        this.f15777f = entry;
    }

    /* renamed from: a */
    public final zzdon mo26143a() {
        return this.f15777f.getValue();
    }

    public final K getKey() {
        return this.f15777f.getKey();
    }

    public final Object getValue() {
        if (this.f15777f.getValue() == null) {
            return null;
        }
        zzdon.m24057c();
        throw null;
    }

    public final Object setValue(Object obj) {
        if (obj instanceof zzdpk) {
            return this.f15777f.getValue().mo29150a((zzdpk) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
