package com.google.android.gms.internal.measurement;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.n2 */
final class C8323n2 implements Comparable<C8323n2>, Map.Entry<K, V> {

    /* renamed from: f */
    private final K f23304f;

    /* renamed from: g */
    private V f23305g;

    /* renamed from: h */
    private final /* synthetic */ C8288g2 f23306h;

    C8323n2(C8288g2 g2Var, Map.Entry<K, V> entry) {
        this(g2Var, (Comparable) entry.getKey(), entry.getValue());
    }

    /* renamed from: a */
    private static boolean m26104a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((C8323n2) obj).getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m26104a(this.f23304f, entry.getKey()) && m26104a(this.f23305g, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f23304f;
    }

    public final V getValue() {
        return this.f23305g;
    }

    public final int hashCode() {
        K k = this.f23304f;
        int i = 0;
        int hashCode = k == null ? 0 : k.hashCode();
        V v = this.f23305g;
        if (v != null) {
            i = v.hashCode();
        }
        return hashCode ^ i;
    }

    public final V setValue(V v) {
        this.f23306h.m26000f();
        V v2 = this.f23305g;
        this.f23305g = v;
        return v2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f23304f);
        String valueOf2 = String.valueOf(this.f23305g);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    C8323n2(C8288g2 g2Var, K k, V v) {
        this.f23306h = g2Var;
        this.f23304f = k;
        this.f23305g = v;
    }
}
