package kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9875c;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.C9890a;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.p244g.C9920e;
import p015cm.aptoide.p016pt.database.room.RoomInstalled;

/* renamed from: kotlin.h0.u.e.k0.c.b.r */
/* compiled from: MemberSignature.kt */
public final class C9732r {

    /* renamed from: b */
    public static final C9733a f26703b = new C9733a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final String f26704a;

    /* renamed from: kotlin.h0.u.e.k0.c.b.r$a */
    /* compiled from: MemberSignature.kt */
    public static final class C9733a {
        private C9733a() {
        }

        /* renamed from: a */
        public final C9732r mo34330a(C9875c cVar, C9890a.C9895c cVar2) {
            C10202j.m34178b(cVar, "nameResolver");
            C10202j.m34178b(cVar2, RoomInstalled.SIGNATURE);
            return mo34332b(cVar.getString(cVar2.mo34879j()), cVar.getString(cVar2.mo34878i()));
        }

        /* renamed from: b */
        public final C9732r mo34332b(String str, String str2) {
            C10202j.m34178b(str, "name");
            C10202j.m34178b(str2, "desc");
            return new C9732r(str + str2, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ C9733a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C9732r mo34328a(String str, String str2) {
            C10202j.m34178b(str, "name");
            C10202j.m34178b(str2, "desc");
            return new C9732r(str + '#' + str2, (DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public final C9732r mo34331a(C9920e eVar) {
            C10202j.m34178b(eVar, RoomInstalled.SIGNATURE);
            if (eVar instanceof C9920e.C9922b) {
                return mo34332b(eVar.mo34926c(), eVar.mo34925b());
            }
            if (eVar instanceof C9920e.C9921a) {
                return mo34328a(eVar.mo34926c(), eVar.mo34925b());
            }
            throw new NoWhenBranchMatchedException();
        }

        /* renamed from: a */
        public final C9732r mo34329a(C9732r rVar, int i) {
            C10202j.m34178b(rVar, RoomInstalled.SIGNATURE);
            return new C9732r(rVar.mo34324a() + '@' + i, (DefaultConstructorMarker) null);
        }
    }

    private C9732r(String str) {
        this.f26704a = str;
    }

    /* renamed from: a */
    public final String mo34324a() {
        return this.f26704a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C9732r) && C10202j.m34176a((Object) this.f26704a, (Object) ((C9732r) obj).f26704a);
        }
        return true;
    }

    public int hashCode() {
        String str = this.f26704a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "MemberSignature(signature=" + this.f26704a + ")";
    }

    public /* synthetic */ C9732r(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
