package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.s */
/* compiled from: Tuples.kt */
public final class C10480s<A, B, C> implements Serializable {

    /* renamed from: f */
    private final A f28353f;

    /* renamed from: g */
    private final B f28354g;

    /* renamed from: h */
    private final C f28355h;

    public C10480s(A a, B b, C c) {
        this.f28353f = a;
        this.f28354g = b;
        this.f28355h = c;
    }

    /* renamed from: a */
    public final A mo35887a() {
        return this.f28353f;
    }

    /* renamed from: b */
    public final B mo35888b() {
        return this.f28354g;
    }

    /* renamed from: c */
    public final C mo35889c() {
        return this.f28355h;
    }

    /* renamed from: d */
    public final C mo35890d() {
        return this.f28355h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10480s)) {
            return false;
        }
        C10480s sVar = (C10480s) obj;
        return C10202j.m34176a((Object) this.f28353f, (Object) sVar.f28353f) && C10202j.m34176a((Object) this.f28354g, (Object) sVar.f28354g) && C10202j.m34176a((Object) this.f28355h, (Object) sVar.f28355h);
    }

    public int hashCode() {
        A a = this.f28353f;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f28354g;
        int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
        C c = this.f28355h;
        if (c != null) {
            i = c.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return '(' + this.f28353f + ", " + this.f28354g + ", " + this.f28355h + ')';
    }
}
