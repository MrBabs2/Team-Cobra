package kotlin.p045h0.p046u.p047e.p048k0.p380k.p385l1;

import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.h0.u.e.k0.k.l1.a */
/* compiled from: CapturedTypeApproximation.kt */
public final class C11928a<T> {

    /* renamed from: a */
    private final T f31630a;

    /* renamed from: b */
    private final T f31631b;

    public C11928a(T t, T t2) {
        this.f31630a = t;
        this.f31631b = t2;
    }

    /* renamed from: a */
    public final T mo38577a() {
        return this.f31630a;
    }

    /* renamed from: b */
    public final T mo38578b() {
        return this.f31631b;
    }

    /* renamed from: c */
    public final T mo38579c() {
        return this.f31630a;
    }

    /* renamed from: d */
    public final T mo38580d() {
        return this.f31631b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11928a)) {
            return false;
        }
        C11928a aVar = (C11928a) obj;
        return C10202j.m34176a((Object) this.f31630a, (Object) aVar.f31630a) && C10202j.m34176a((Object) this.f31631b, (Object) aVar.f31631b);
    }

    public int hashCode() {
        T t = this.f31630a;
        int i = 0;
        int hashCode = (t != null ? t.hashCode() : 0) * 31;
        T t2 = this.f31631b;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "ApproximationBounds(lower=" + this.f31630a + ", upper=" + this.f31631b + ")";
    }
}
