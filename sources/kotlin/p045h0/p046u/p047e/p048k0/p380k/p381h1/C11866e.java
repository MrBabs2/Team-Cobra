package kotlin.p045h0.p046u.p047e.p048k0.p380k.p381h1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11838f1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11921r;

/* renamed from: kotlin.h0.u.e.k0.k.h1.e */
/* compiled from: ClassicTypeSystemContext.kt */
public final class C11866e {
    /* renamed from: a */
    public static final C11921r m39160a(C11838f1 f1Var) {
        C10202j.m34178b(f1Var, "$this$convertVariance");
        int i = C11865d.f31578a[f1Var.ordinal()];
        if (i == 1) {
            return C11921r.INV;
        }
        if (i == 2) {
            return C11921r.IN;
        }
        if (i == 3) {
            return C11921r.OUT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
