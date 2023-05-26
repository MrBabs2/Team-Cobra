package kotlin.p262y;

import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.y.b0 */
/* compiled from: IndexedValue.kt */
public final class C10494b0<T> {

    /* renamed from: a */
    private final int f28370a;

    /* renamed from: b */
    private final T f28371b;

    public C10494b0(int i, T t) {
        this.f28370a = i;
        this.f28371b = t;
    }

    /* renamed from: a */
    public final int mo35958a() {
        return this.f28370a;
    }

    /* renamed from: b */
    public final T mo35959b() {
        return this.f28371b;
    }

    /* renamed from: c */
    public final int mo35960c() {
        return this.f28370a;
    }

    /* renamed from: d */
    public final T mo35961d() {
        return this.f28371b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10494b0)) {
            return false;
        }
        C10494b0 b0Var = (C10494b0) obj;
        return this.f28370a == b0Var.f28370a && C10202j.m34176a((Object) this.f28371b, (Object) b0Var.f28371b);
    }

    public int hashCode() {
        int i = this.f28370a * 31;
        T t = this.f28371b;
        return i + (t != null ? t.hashCode() : 0);
    }

    public String toString() {
        return "IndexedValue(index=" + this.f28370a + ", value=" + this.f28371b + ")";
    }
}
