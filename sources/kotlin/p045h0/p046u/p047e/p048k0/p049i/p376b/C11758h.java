package kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b;

import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9775f;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9868a;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9875c;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;

/* renamed from: kotlin.h0.u.e.k0.i.b.h */
/* compiled from: ClassData.kt */
public final class C11758h {

    /* renamed from: a */
    private final C9875c f31414a;

    /* renamed from: b */
    private final C9775f f31415b;

    /* renamed from: c */
    private final C9868a f31416c;

    /* renamed from: d */
    private final C10362n0 f31417d;

    public C11758h(C9875c cVar, C9775f fVar, C9868a aVar, C10362n0 n0Var) {
        C10202j.m34178b(cVar, "nameResolver");
        C10202j.m34178b(fVar, "classProto");
        C10202j.m34178b(aVar, "metadataVersion");
        C10202j.m34178b(n0Var, "sourceElement");
        this.f31414a = cVar;
        this.f31415b = fVar;
        this.f31416c = aVar;
        this.f31417d = n0Var;
    }

    /* renamed from: a */
    public final C9875c mo38335a() {
        return this.f31414a;
    }

    /* renamed from: b */
    public final C9775f mo38336b() {
        return this.f31415b;
    }

    /* renamed from: c */
    public final C9868a mo38337c() {
        return this.f31416c;
    }

    /* renamed from: d */
    public final C10362n0 mo38338d() {
        return this.f31417d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11758h)) {
            return false;
        }
        C11758h hVar = (C11758h) obj;
        return C10202j.m34176a((Object) this.f31414a, (Object) hVar.f31414a) && C10202j.m34176a((Object) this.f31415b, (Object) hVar.f31415b) && C10202j.m34176a((Object) this.f31416c, (Object) hVar.f31416c) && C10202j.m34176a((Object) this.f31417d, (Object) hVar.f31417d);
    }

    public int hashCode() {
        C9875c cVar = this.f31414a;
        int i = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        C9775f fVar = this.f31415b;
        int hashCode2 = (hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
        C9868a aVar = this.f31416c;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        C10362n0 n0Var = this.f31417d;
        if (n0Var != null) {
            i = n0Var.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "ClassData(nameResolver=" + this.f31414a + ", classProto=" + this.f31415b + ", metadataVersion=" + this.f31416c + ", sourceElement=" + this.f31417d + ")";
    }
}
