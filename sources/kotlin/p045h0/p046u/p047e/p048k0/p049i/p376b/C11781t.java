package kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b;

import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9868a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;

/* renamed from: kotlin.h0.u.e.k0.i.b.t */
/* compiled from: IncompatibleVersionErrorData.kt */
public final class C11781t<T extends C9868a> {

    /* renamed from: a */
    private final T f31466a;

    /* renamed from: b */
    private final T f31467b;

    /* renamed from: c */
    private final String f31468c;

    /* renamed from: d */
    private final C9933a f31469d;

    public C11781t(T t, T t2, String str, C9933a aVar) {
        C10202j.m34178b(t, "actualVersion");
        C10202j.m34178b(t2, "expectedVersion");
        C10202j.m34178b(str, "filePath");
        C10202j.m34178b(aVar, "classId");
        this.f31466a = t;
        this.f31467b = t2;
        this.f31468c = str;
        this.f31469d = aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11781t)) {
            return false;
        }
        C11781t tVar = (C11781t) obj;
        return C10202j.m34176a((Object) this.f31466a, (Object) tVar.f31466a) && C10202j.m34176a((Object) this.f31467b, (Object) tVar.f31467b) && C10202j.m34176a((Object) this.f31468c, (Object) tVar.f31468c) && C10202j.m34176a((Object) this.f31469d, (Object) tVar.f31469d);
    }

    public int hashCode() {
        T t = this.f31466a;
        int i = 0;
        int hashCode = (t != null ? t.hashCode() : 0) * 31;
        T t2 = this.f31467b;
        int hashCode2 = (hashCode + (t2 != null ? t2.hashCode() : 0)) * 31;
        String str = this.f31468c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        C9933a aVar = this.f31469d;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f31466a + ", expectedVersion=" + this.f31467b + ", filePath=" + this.f31468c + ", classId=" + this.f31469d + ")";
    }
}
