package kotlin.p045h0.p046u.p047e.p048k0.p380k;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.h0.u.e.k0.k.m0 */
/* compiled from: SpecialTypes.kt */
public final class C11938m0 {
    /* renamed from: a */
    public static final C11818a m39468a(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, "$this$getAbbreviatedType");
        C11834e1 x0 = b0Var.mo38439x0();
        if (!(x0 instanceof C11818a)) {
            x0 = null;
        }
        return (C11818a) x0;
    }

    /* renamed from: b */
    public static final C11901j0 m39472b(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, "$this$getAbbreviation");
        C11818a a = m39468a(b0Var);
        if (a != null) {
            return a.mo38428z0();
        }
        return null;
    }

    /* renamed from: c */
    public static final boolean m39473c(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, "$this$isDefinitelyNotNullType");
        return b0Var.mo38439x0() instanceof C11925l;
    }

    /* renamed from: d */
    private static final C11901j0 m39474d(C11824b0 b0Var) {
        C11819a0 a;
        C11953s0 v0 = b0Var.mo35227v0();
        if (!(v0 instanceof C11819a0)) {
            v0 = null;
        }
        C11819a0 a0Var = (C11819a0) v0;
        if (a0Var == null || (a = m39467a(a0Var)) == null) {
            return null;
        }
        return C11827c0.m38949a(b0Var.getAnnotations(), a, C10529o.m35736a(), false, a.mo38429e());
    }

    /* renamed from: a */
    public static final C11901j0 m39471a(C11901j0 j0Var, C11901j0 j0Var2) {
        C10202j.m34178b(j0Var, "$this$withAbbreviation");
        C10202j.m34178b(j0Var2, "abbreviatedType");
        if (C11830d0.m38958a(j0Var)) {
            return j0Var;
        }
        return new C11818a(j0Var, j0Var2);
    }

    /* renamed from: a */
    public static final C11901j0 m39470a(C11901j0 j0Var) {
        C10202j.m34178b(j0Var, "$this$makeSimpleTypeDefinitelyNotNullOrNotNull");
        C11901j0 a = C11925l.f31626g.mo38576a(j0Var);
        if (a == null) {
            a = m39474d(j0Var);
        }
        return a != null ? a : j0Var.mo34007a(false);
    }

    /* renamed from: a */
    public static final C11834e1 m39469a(C11834e1 e1Var) {
        C10202j.m34178b(e1Var, "$this$makeDefinitelyNotNullOrNotNull");
        C11834e1 a = C11925l.f31626g.mo38576a(e1Var);
        if (a == null) {
            a = m39474d(e1Var);
        }
        return a != null ? a : e1Var.mo34007a(false);
    }

    /* renamed from: a */
    private static final C11819a0 m39467a(C11819a0 a0Var) {
        Collection<C11824b0> a = a0Var.mo35229a();
        ArrayList arrayList = new ArrayList(C10531p.m35750a(a, 10));
        boolean z = false;
        for (C11824b0 next : a) {
            if (C11821a1.m38916g(next)) {
                z = true;
                next = m39469a(next.mo38439x0());
            }
            arrayList.add(next);
        }
        if (!z) {
            return null;
        }
        return new C11819a0(arrayList);
    }
}
