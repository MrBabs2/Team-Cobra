package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0;

import java.util.Collection;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.C9405a;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9555h;

/* renamed from: kotlin.h0.u.e.k0.c.a.a0.k */
/* compiled from: context.kt */
public final class C9426k {

    /* renamed from: a */
    private final C9555h f26202a;

    /* renamed from: b */
    private final Collection<C9405a.C9406a> f26203b;

    public C9426k(C9555h hVar, Collection<? extends C9405a.C9406a> collection) {
        C10202j.m34178b(hVar, "nullabilityQualifier");
        C10202j.m34178b(collection, "qualifierApplicabilityTypes");
        this.f26202a = hVar;
        this.f26203b = collection;
    }

    /* renamed from: a */
    public final C9555h mo33902a() {
        return this.f26202a;
    }

    /* renamed from: b */
    public final Collection<C9405a.C9406a> mo33903b() {
        return this.f26203b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9426k)) {
            return false;
        }
        C9426k kVar = (C9426k) obj;
        return C10202j.m34176a((Object) this.f26202a, (Object) kVar.f26202a) && C10202j.m34176a((Object) this.f26203b, (Object) kVar.f26203b);
    }

    public int hashCode() {
        C9555h hVar = this.f26202a;
        int i = 0;
        int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        Collection<C9405a.C9406a> collection = this.f26203b;
        if (collection != null) {
            i = collection.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "NullabilityQualifierWithApplicability(nullabilityQualifier=" + this.f26202a + ", qualifierApplicabilityTypes=" + this.f26203b + ")";
    }
}
