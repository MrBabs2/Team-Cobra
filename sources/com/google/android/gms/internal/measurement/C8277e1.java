package com.google.android.gms.internal.measurement;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.e1 */
final class C8277e1<K> implements Map.Entry<K, Object> {

    /* renamed from: f */
    private Map.Entry<K, zzuy> f23236f;

    private C8277e1(Map.Entry<K, zzuy> entry) {
        this.f23236f = entry;
    }

    /* renamed from: a */
    public final zzuy mo30102a() {
        return this.f23236f.getValue();
    }

    public final K getKey() {
        return this.f23236f.getKey();
    }

    public final Object getValue() {
        if (this.f23236f.getValue() == null) {
            return null;
        }
        zzuy.m26691c();
        throw null;
    }

    public final Object setValue(Object obj) {
        if (obj instanceof zzvv) {
            return this.f23236f.getValue().mo30444a((zzvv) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
