package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.n */
/* compiled from: Tuples.kt */
public final class C10221n<A, B> implements Serializable {

    /* renamed from: f */
    private final A f27861f;

    /* renamed from: g */
    private final B f27862g;

    public C10221n(A a, B b) {
        this.f27861f = a;
        this.f27862g = b;
    }

    /* renamed from: a */
    public final A mo35389a() {
        return this.f27861f;
    }

    /* renamed from: b */
    public final B mo35390b() {
        return this.f27862g;
    }

    /* renamed from: c */
    public final A mo35391c() {
        return this.f27861f;
    }

    /* renamed from: d */
    public final B mo35392d() {
        return this.f27862g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10221n)) {
            return false;
        }
        C10221n nVar = (C10221n) obj;
        return C10202j.m34176a((Object) this.f27861f, (Object) nVar.f27861f) && C10202j.m34176a((Object) this.f27862g, (Object) nVar.f27862g);
    }

    public int hashCode() {
        A a = this.f27861f;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f27862g;
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return '(' + this.f27861f + ", " + this.f27862g + ')';
    }
}
