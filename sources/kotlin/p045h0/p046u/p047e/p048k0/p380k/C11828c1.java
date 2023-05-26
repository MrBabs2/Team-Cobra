package kotlin.p045h0.p046u.p047e.p048k0.p380k;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.h0.u.e.k0.k.c1 */
/* compiled from: TypeWithEnhancement.kt */
public final class C11828c1 {
    /* renamed from: a */
    public static final C11824b0 m38951a(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, "$this$getEnhancement");
        if (b0Var instanceof C11825b1) {
            return ((C11825b1) b0Var).mo38440C();
        }
        return null;
    }

    /* renamed from: b */
    public static final C11824b0 m38953b(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, "$this$unwrapEnhancement");
        C11824b0 a = m38951a(b0Var);
        return a != null ? a : b0Var;
    }

    /* renamed from: a */
    public static final C11834e1 m38952a(C11834e1 e1Var, C11824b0 b0Var) {
        C10202j.m34178b(e1Var, "$this$inheritEnhancement");
        C10202j.m34178b(b0Var, "origin");
        return m38954b(e1Var, m38951a(b0Var));
    }

    /* renamed from: b */
    public static final C11834e1 m38954b(C11834e1 e1Var, C11824b0 b0Var) {
        C10202j.m34178b(e1Var, "$this$wrapEnhancement");
        if (b0Var == null) {
            return e1Var;
        }
        if (e1Var instanceof C11901j0) {
            return new C11927l0((C11901j0) e1Var, b0Var);
        }
        if (e1Var instanceof C11966v) {
            return new C11971x((C11966v) e1Var, b0Var);
        }
        throw new NoWhenBranchMatchedException();
    }
}
