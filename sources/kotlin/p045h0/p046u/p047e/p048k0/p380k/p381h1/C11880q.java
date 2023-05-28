package kotlin.p045h0.p046u.p047e.p048k0.p380k.p381h1;

import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11953s0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11965u0;

/* renamed from: kotlin.h0.u.e.k0.k.h1.q */
/* compiled from: TypeCheckerProcedureCallbacksImpl */
class C11880q implements C11884s {
    C11880q() {
    }

    /* renamed from: a */
    private static /* synthetic */ void m39246a(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 5:
            case 10:
                objArr[0] = "subtype";
                break;
            case 6:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
            default:
                objArr[0] = "a";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case 10:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: a */
    public boolean mo38550a(C11824b0 b0Var, C11824b0 b0Var2) {
        if (b0Var == null) {
            m39246a(10);
            throw null;
        } else if (b0Var2 != null) {
            return false;
        } else {
            m39246a(11);
            throw null;
        }
    }

    /* renamed from: a */
    public boolean mo38552a(C11824b0 b0Var, C11965u0 u0Var) {
        if (b0Var == null) {
            m39246a(8);
            throw null;
        } else if (u0Var != null) {
            return false;
        } else {
            m39246a(9);
            throw null;
        }
    }

    /* renamed from: a */
    public boolean mo38537a(C11953s0 s0Var, C11953s0 s0Var2) {
        if (s0Var == null) {
            m39246a(3);
            throw null;
        } else if (s0Var2 != null) {
            return s0Var.equals(s0Var2);
        } else {
            m39246a(4);
            throw null;
        }
    }

    /* renamed from: b */
    public boolean mo38553b(C11824b0 b0Var, C11824b0 b0Var2, C11881r rVar) {
        if (b0Var == null) {
            m39246a(0);
            throw null;
        } else if (b0Var2 == null) {
            m39246a(1);
            throw null;
        } else if (rVar != null) {
            return rVar.mo38554a(b0Var, b0Var2);
        } else {
            m39246a(2);
            throw null;
        }
    }

    /* renamed from: a */
    public boolean mo38551a(C11824b0 b0Var, C11824b0 b0Var2, C11881r rVar) {
        if (b0Var == null) {
            m39246a(5);
            throw null;
        } else if (b0Var2 == null) {
            m39246a(6);
            throw null;
        } else if (rVar != null) {
            return rVar.mo38556c(b0Var, b0Var2);
        } else {
            m39246a(7);
            throw null;
        }
    }
}
