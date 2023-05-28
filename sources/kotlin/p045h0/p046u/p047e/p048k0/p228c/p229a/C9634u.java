package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a;

import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import p015cm.aptoide.p016pt.database.room.RoomInstalled;

/* renamed from: kotlin.h0.u.e.k0.c.a.u */
/* compiled from: specialBuiltinMembers.kt */
final class C9634u {

    /* renamed from: a */
    private final C9939f f26539a;

    /* renamed from: b */
    private final String f26540b;

    public C9634u(C9939f fVar, String str) {
        C10202j.m34178b(fVar, "name");
        C10202j.m34178b(str, RoomInstalled.SIGNATURE);
        this.f26539a = fVar;
        this.f26540b = str;
    }

    /* renamed from: a */
    public final C9939f mo34184a() {
        return this.f26539a;
    }

    /* renamed from: b */
    public final String mo34185b() {
        return this.f26540b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9634u)) {
            return false;
        }
        C9634u uVar = (C9634u) obj;
        return C10202j.m34176a((Object) this.f26539a, (Object) uVar.f26539a) && C10202j.m34176a((Object) this.f26540b, (Object) uVar.f26540b);
    }

    public int hashCode() {
        C9939f fVar = this.f26539a;
        int i = 0;
        int hashCode = (fVar != null ? fVar.hashCode() : 0) * 31;
        String str = this.f26540b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "NameAndSignature(name=" + this.f26539a + ", signature=" + this.f26540b + ")";
    }
}
