package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0;

import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;

/* renamed from: kotlin.h0.u.e.k0.c.a.d0.p */
/* compiled from: signatureEnhancement.kt */
final class C9605p {

    /* renamed from: a */
    private final C11824b0 f26484a;

    /* renamed from: b */
    private final C9550d f26485b;

    public C9605p(C11824b0 b0Var, C9550d dVar) {
        C10202j.m34178b(b0Var, "type");
        this.f26484a = b0Var;
        this.f26485b = dVar;
    }

    /* renamed from: a */
    public final C11824b0 mo34158a() {
        return this.f26484a;
    }

    /* renamed from: b */
    public final C9550d mo34159b() {
        return this.f26485b;
    }

    /* renamed from: c */
    public final C11824b0 mo34160c() {
        return this.f26484a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9605p)) {
            return false;
        }
        C9605p pVar = (C9605p) obj;
        return C10202j.m34176a((Object) this.f26484a, (Object) pVar.f26484a) && C10202j.m34176a((Object) this.f26485b, (Object) pVar.f26485b);
    }

    public int hashCode() {
        C11824b0 b0Var = this.f26484a;
        int i = 0;
        int hashCode = (b0Var != null ? b0Var.hashCode() : 0) * 31;
        C9550d dVar = this.f26485b;
        if (dVar != null) {
            i = dVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "TypeAndDefaultQualifiers(type=" + this.f26484a + ", defaultQualifiers=" + this.f26485b + ")";
    }
}
