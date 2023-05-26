package kotlin.p045h0.p046u.p047e.p048k0.p380k;

import kotlin.C10485x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p247g.C9949c;
import kotlin.p045h0.p046u.p047e.p048k0.p247g.C9977i;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p381h1.C11868g;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p384k1.C11924a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.h0.u.e.k0.k.w */
/* compiled from: flexibleTypes.kt */
public final class C11968w extends C11966v implements C11922k {

    /* renamed from: i */
    public static boolean f31674i;

    /* renamed from: h */
    private boolean f31675h;

    /* renamed from: kotlin.h0.u.e.k0.k.w$a */
    /* compiled from: flexibleTypes.kt */
    public static final class C11969a {
        private C11969a() {
        }

        public /* synthetic */ C11969a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C11969a((DefaultConstructorMarker) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11968w(C11901j0 j0Var, C11901j0 j0Var2) {
        super(j0Var, j0Var2);
        C10202j.m34178b(j0Var, "lowerBound");
        C10202j.m34178b(j0Var2, "upperBound");
    }

    /* renamed from: B0 */
    private final void m39616B0() {
        if (f31674i && !this.f31675h) {
            this.f31675h = true;
            boolean z = !C11975y.m39644b(mo38609z0());
            if (!C10485x.f28360a || z) {
                boolean z2 = !C11975y.m39644b(mo38607A0());
                if (!C10485x.f28360a || z2) {
                    boolean a = true ^ C10202j.m34176a((Object) mo38609z0(), (Object) mo38607A0());
                    if (!C10485x.f28360a || a) {
                        boolean b = C11868g.f31579a.mo38536b(mo38609z0(), mo38607A0());
                        if (C10485x.f28360a && !b) {
                            throw new AssertionError("Lower bound " + mo38609z0() + " of a flexible type must be a subtype of the upper bound " + mo38607A0());
                        }
                        return;
                    }
                    throw new AssertionError("Lower and upper bounds are equal: " + mo38609z0() + " == " + mo38607A0());
                }
                throw new AssertionError("Upper bound of a flexible type can not be flexible: " + mo38607A0());
            }
            throw new AssertionError("Lower bound of a flexible type can not be flexible: " + mo38609z0());
        }
    }

    /* renamed from: B */
    public boolean mo34092B() {
        return (mo38609z0().mo35227v0().mo33781b() instanceof C10375s0) && C10202j.m34176a((Object) mo38609z0().mo35227v0(), (Object) mo38607A0().mo35227v0());
    }

    /* renamed from: a */
    public C11824b0 mo34093a(C11824b0 b0Var) {
        C11834e1 e1Var;
        C10202j.m34178b(b0Var, "replacement");
        C11834e1 x0 = b0Var.mo38439x0();
        if (x0 instanceof C11966v) {
            e1Var = x0;
        } else if (x0 instanceof C11901j0) {
            C11901j0 j0Var = (C11901j0) x0;
            e1Var = C11827c0.m38946a(j0Var, j0Var.mo34007a(true));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return C11828c1.m38952a(e1Var, x0);
    }

    /* renamed from: y0 */
    public C11901j0 mo34009y0() {
        m39616B0();
        return mo38609z0();
    }

    /* renamed from: a */
    public C11834e1 mo34006a(C10249g gVar) {
        C10202j.m34178b(gVar, "newAnnotations");
        return C11827c0.m38946a(mo38609z0().mo34006a(gVar), mo38607A0().mo34006a(gVar));
    }

    /* renamed from: a */
    public String mo34005a(C9949c cVar, C9977i iVar) {
        C10202j.m34178b(cVar, "renderer");
        C10202j.m34178b(iVar, "options");
        if (!iVar.mo35092c()) {
            return cVar.mo35031a(cVar.mo35034a((C11824b0) mo38609z0()), cVar.mo35034a((C11824b0) mo38607A0()), C11924a.m39418b(this));
        }
        return '(' + cVar.mo35034a((C11824b0) mo38609z0()) + ".." + cVar.mo35034a((C11824b0) mo38607A0()) + ')';
    }

    /* renamed from: a */
    public C11834e1 mo34007a(boolean z) {
        return C11827c0.m38946a(mo38609z0().mo34007a(z), mo38607A0().mo34007a(z));
    }
}
