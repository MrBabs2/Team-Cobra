package kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.p244g;

import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.h0.u.e.k0.d.y0.g.e */
/* compiled from: JvmMemberSignature.kt */
public abstract class C9920e {

    /* renamed from: kotlin.h0.u.e.k0.d.y0.g.e$a */
    /* compiled from: JvmMemberSignature.kt */
    public static final class C9921a extends C9920e {

        /* renamed from: a */
        private final String f27376a;

        /* renamed from: b */
        private final String f27377b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9921a(String str, String str2) {
            super((DefaultConstructorMarker) null);
            C10202j.m34178b(str, "name");
            C10202j.m34178b(str2, "desc");
            this.f27376a = str;
            this.f27377b = str2;
        }

        /* renamed from: a */
        public String mo34924a() {
            return mo34926c() + ':' + mo34925b();
        }

        /* renamed from: b */
        public String mo34925b() {
            return this.f27377b;
        }

        /* renamed from: c */
        public String mo34926c() {
            return this.f27376a;
        }

        /* renamed from: d */
        public final String mo34928d() {
            return mo34926c();
        }

        /* renamed from: e */
        public final String mo34929e() {
            return mo34925b();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9921a)) {
                return false;
            }
            C9921a aVar = (C9921a) obj;
            return C10202j.m34176a((Object) mo34926c(), (Object) aVar.mo34926c()) && C10202j.m34176a((Object) mo34925b(), (Object) aVar.mo34925b());
        }

        public int hashCode() {
            String c = mo34926c();
            int i = 0;
            int hashCode = (c != null ? c.hashCode() : 0) * 31;
            String b = mo34925b();
            if (b != null) {
                i = b.hashCode();
            }
            return hashCode + i;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.d.y0.g.e$b */
    /* compiled from: JvmMemberSignature.kt */
    public static final class C9922b extends C9920e {

        /* renamed from: a */
        private final String f27378a;

        /* renamed from: b */
        private final String f27379b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9922b(String str, String str2) {
            super((DefaultConstructorMarker) null);
            C10202j.m34178b(str, "name");
            C10202j.m34178b(str2, "desc");
            this.f27378a = str;
            this.f27379b = str2;
        }

        /* renamed from: a */
        public String mo34924a() {
            return mo34926c() + mo34925b();
        }

        /* renamed from: b */
        public String mo34925b() {
            return this.f27379b;
        }

        /* renamed from: c */
        public String mo34926c() {
            return this.f27378a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9922b)) {
                return false;
            }
            C9922b bVar = (C9922b) obj;
            return C10202j.m34176a((Object) mo34926c(), (Object) bVar.mo34926c()) && C10202j.m34176a((Object) mo34925b(), (Object) bVar.mo34925b());
        }

        public int hashCode() {
            String c = mo34926c();
            int i = 0;
            int hashCode = (c != null ? c.hashCode() : 0) * 31;
            String b = mo34925b();
            if (b != null) {
                i = b.hashCode();
            }
            return hashCode + i;
        }
    }

    private C9920e() {
    }

    /* renamed from: a */
    public abstract String mo34924a();

    /* renamed from: b */
    public abstract String mo34925b();

    /* renamed from: c */
    public abstract String mo34926c();

    public final String toString() {
        return mo34924a();
    }

    public /* synthetic */ C9920e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
