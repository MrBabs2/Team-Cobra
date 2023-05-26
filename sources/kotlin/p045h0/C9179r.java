package kotlin.p045h0;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, mo16641d2 = {"Lkotlin/reflect/KTypeProjection;", "", "variance", "Lkotlin/reflect/KVariance;", "type", "Lkotlin/reflect/KType;", "(Lkotlin/reflect/KVariance;Lkotlin/reflect/KType;)V", "getType", "()Lkotlin/reflect/KType;", "getVariance", "()Lkotlin/reflect/KVariance;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "kotlin-stdlib"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: kotlin.h0.r */
/* compiled from: KType.kt */
public final class C9179r {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C9179r f25694c = new C9179r((C9181s) null, (C9177p) null);

    /* renamed from: d */
    public static final C9180a f25695d = new C9180a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C9181s f25696a;

    /* renamed from: b */
    private final C9177p f25697b;

    /* renamed from: kotlin.h0.r$a */
    /* compiled from: KType.kt */
    public static final class C9180a {
        private C9180a() {
        }

        /* renamed from: a */
        public final C9179r mo33533a() {
            return C9179r.f25694c;
        }

        /* renamed from: b */
        public final C9179r mo33535b(C9177p pVar) {
            C10202j.m34178b(pVar, "type");
            return new C9179r(C9181s.OUT, pVar);
        }

        /* renamed from: c */
        public final C9179r mo33536c(C9177p pVar) {
            C10202j.m34178b(pVar, "type");
            return new C9179r(C9181s.INVARIANT, pVar);
        }

        public /* synthetic */ C9180a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C9179r mo33534a(C9177p pVar) {
            C10202j.m34178b(pVar, "type");
            return new C9179r(C9181s.IN, pVar);
        }
    }

    public C9179r(C9181s sVar, C9177p pVar) {
        this.f25696a = sVar;
        this.f25697b = pVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9179r)) {
            return false;
        }
        C9179r rVar = (C9179r) obj;
        return C10202j.m34176a((Object) this.f25696a, (Object) rVar.f25696a) && C10202j.m34176a((Object) this.f25697b, (Object) rVar.f25697b);
    }

    public int hashCode() {
        C9181s sVar = this.f25696a;
        int i = 0;
        int hashCode = (sVar != null ? sVar.hashCode() : 0) * 31;
        C9177p pVar = this.f25697b;
        if (pVar != null) {
            i = pVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "KTypeProjection(variance=" + this.f25696a + ", type=" + this.f25697b + ")";
    }
}
