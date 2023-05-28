package com.airbnb.lottie.p133s;

import p050l.p075h.p083k.C5004d;

/* renamed from: com.airbnb.lottie.s.h */
/* compiled from: MutablePair */
public class C5729h<T> {

    /* renamed from: a */
    T f10249a;

    /* renamed from: b */
    T f10250b;

    /* renamed from: b */
    private static boolean m11052b(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    public void mo19558a(T t, T t2) {
        this.f10249a = t;
        this.f10250b = t2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5004d)) {
            return false;
        }
        C5004d dVar = (C5004d) obj;
        if (!m11052b(dVar.f8862a, this.f10249a) || !m11052b(dVar.f8863b, this.f10250b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        T t = this.f10249a;
        int i = 0;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.f10250b;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f10249a) + " " + String.valueOf(this.f10250b) + "}";
    }
}
