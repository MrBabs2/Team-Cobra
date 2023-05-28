package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.xw */
final class C8154xw implements Comparable<C8154xw>, Map.Entry<K, V> {

    /* renamed from: f */
    private final K f17207f;

    /* renamed from: g */
    private V f17208g;

    /* renamed from: h */
    private final /* synthetic */ C7895qw f17209h;

    C8154xw(C7895qw qwVar, Map.Entry<K, V> entry) {
        this(qwVar, (Comparable) entry.getKey(), entry.getValue());
    }

    /* renamed from: a */
    private static boolean m18475a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((C8154xw) obj).getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m18475a(this.f17207f, entry.getKey()) && m18475a(this.f17208g, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f17207f;
    }

    public final V getValue() {
        return this.f17208g;
    }

    public final int hashCode() {
        K k = this.f17207f;
        int i = 0;
        int hashCode = k == null ? 0 : k.hashCode();
        V v = this.f17208g;
        if (v != null) {
            i = v.hashCode();
        }
        return hashCode ^ i;
    }

    public final V setValue(V v) {
        this.f17209h.m18062f();
        V v2 = this.f17208g;
        this.f17208g = v;
        return v2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f17207f);
        String valueOf2 = String.valueOf(this.f17208g);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    C8154xw(C7895qw qwVar, K k, V v) {
        this.f17209h = qwVar;
        this.f17207f = k;
        this.f17208g = v;
    }
}
