package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0;

import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.h0.u.e.k0.c.a.d0.h */
/* compiled from: signatureEnhancement.kt */
public final class C9555h {

    /* renamed from: a */
    private final C9554g f26408a;

    /* renamed from: b */
    private final boolean f26409b;

    public C9555h(C9554g gVar, boolean z) {
        C10202j.m34178b(gVar, "qualifier");
        this.f26408a = gVar;
        this.f26409b = z;
    }

    /* renamed from: a */
    public static /* synthetic */ C9555h m30903a(C9555h hVar, C9554g gVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            gVar = hVar.f26408a;
        }
        if ((i & 2) != 0) {
            z = hVar.f26409b;
        }
        return hVar.mo34097a(gVar, z);
    }

    /* renamed from: a */
    public final C9554g mo34096a() {
        return this.f26408a;
    }

    /* renamed from: a */
    public final C9555h mo34097a(C9554g gVar, boolean z) {
        C10202j.m34178b(gVar, "qualifier");
        return new C9555h(gVar, z);
    }

    /* renamed from: b */
    public final boolean mo34098b() {
        return this.f26409b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9555h) {
                C9555h hVar = (C9555h) obj;
                if (C10202j.m34176a((Object) this.f26408a, (Object) hVar.f26408a)) {
                    if (this.f26409b == hVar.f26409b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C9554g gVar = this.f26408a;
        int hashCode = (gVar != null ? gVar.hashCode() : 0) * 31;
        boolean z = this.f26409b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f26408a + ", isForWarningOnly=" + this.f26409b + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9555h(C9554g gVar, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, (i & 2) != 0 ? false : z);
    }
}
