package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.p232o;

import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p236y.C9664l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;

/* renamed from: kotlin.h0.u.e.k0.c.a.a0.o.a */
/* compiled from: JavaTypeResolver.kt */
public final class C9491a {

    /* renamed from: a */
    private final C9664l f26329a;

    /* renamed from: b */
    private final C9492b f26330b;

    /* renamed from: c */
    private final boolean f26331c;

    /* renamed from: d */
    private final C10375s0 f26332d;

    public C9491a(C9664l lVar, C9492b bVar, boolean z, C10375s0 s0Var) {
        C10202j.m34178b(lVar, "howThisTypeIsUsed");
        C10202j.m34178b(bVar, "flexibility");
        this.f26329a = lVar;
        this.f26330b = bVar;
        this.f26331c = z;
        this.f26332d = s0Var;
    }

    /* renamed from: a */
    public static /* synthetic */ C9491a m30766a(C9491a aVar, C9664l lVar, C9492b bVar, boolean z, C10375s0 s0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = aVar.f26329a;
        }
        if ((i & 2) != 0) {
            bVar = aVar.f26330b;
        }
        if ((i & 4) != 0) {
            z = aVar.f26331c;
        }
        if ((i & 8) != 0) {
            s0Var = aVar.f26332d;
        }
        return aVar.mo33991a(lVar, bVar, z, s0Var);
    }

    /* renamed from: a */
    public final C9491a mo33991a(C9664l lVar, C9492b bVar, boolean z, C10375s0 s0Var) {
        C10202j.m34178b(lVar, "howThisTypeIsUsed");
        C10202j.m34178b(bVar, "flexibility");
        return new C9491a(lVar, bVar, z, s0Var);
    }

    /* renamed from: a */
    public final C9492b mo33992a() {
        return this.f26330b;
    }

    /* renamed from: b */
    public final C9664l mo33993b() {
        return this.f26329a;
    }

    /* renamed from: c */
    public final C10375s0 mo33994c() {
        return this.f26332d;
    }

    /* renamed from: d */
    public final boolean mo33995d() {
        return this.f26331c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9491a) {
                C9491a aVar = (C9491a) obj;
                if (C10202j.m34176a((Object) this.f26329a, (Object) aVar.f26329a) && C10202j.m34176a((Object) this.f26330b, (Object) aVar.f26330b)) {
                    if (!(this.f26331c == aVar.f26331c) || !C10202j.m34176a((Object) this.f26332d, (Object) aVar.f26332d)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C9664l lVar = this.f26329a;
        int i = 0;
        int hashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        C9492b bVar = this.f26330b;
        int hashCode2 = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
        boolean z = this.f26331c;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        C10375s0 s0Var = this.f26332d;
        if (s0Var != null) {
            i = s0Var.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f26329a + ", flexibility=" + this.f26330b + ", isForAnnotationParameter=" + this.f26331c + ", upperBoundOfTypeParameter=" + this.f26332d + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9491a(C9664l lVar, C9492b bVar, boolean z, C10375s0 s0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, (i & 2) != 0 ? C9492b.INFLEXIBLE : bVar, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : s0Var);
    }

    /* renamed from: a */
    public final C9491a mo33990a(C9492b bVar) {
        C10202j.m34178b(bVar, "flexibility");
        return m30766a(this, (C9664l) null, bVar, false, (C10375s0) null, 13, (Object) null);
    }
}
