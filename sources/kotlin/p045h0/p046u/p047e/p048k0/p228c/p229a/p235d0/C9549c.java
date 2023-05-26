package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0;

import kotlin.jvm.internal.C10202j;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.h0.u.e.k0.c.a.d0.c */
/* compiled from: typeEnhancement.kt */
final class C9549c<T> {

    /* renamed from: a */
    private final T f26392a;

    /* renamed from: b */
    private final C10249g f26393b;

    public C9549c(T t, C10249g gVar) {
        this.f26392a = t;
        this.f26393b = gVar;
    }

    /* renamed from: a */
    public final T mo34082a() {
        return this.f26392a;
    }

    /* renamed from: b */
    public final C10249g mo34083b() {
        return this.f26393b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9549c)) {
            return false;
        }
        C9549c cVar = (C9549c) obj;
        return C10202j.m34176a((Object) this.f26392a, (Object) cVar.f26392a) && C10202j.m34176a((Object) this.f26393b, (Object) cVar.f26393b);
    }

    public int hashCode() {
        T t = this.f26392a;
        int i = 0;
        int hashCode = (t != null ? t.hashCode() : 0) * 31;
        C10249g gVar = this.f26393b;
        if (gVar != null) {
            i = gVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "EnhancementResult(result=" + this.f26392a + ", enhancementAnnotations=" + this.f26393b + ")";
    }
}
