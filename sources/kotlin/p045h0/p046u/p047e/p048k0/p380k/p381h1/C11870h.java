package kotlin.p045h0.p046u.p047e.p048k0.p380k.p381h1;

import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11953s0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p381h1.C11868g;

/* renamed from: kotlin.h0.u.e.k0.k.h1.h */
/* compiled from: KotlinTypeCheckerImpl */
public class C11870h implements C11868g {

    /* renamed from: b */
    private final C11881r f31580b;

    /* renamed from: kotlin.h0.u.e.k0.k.h1.h$a */
    /* compiled from: KotlinTypeCheckerImpl */
    static class C11871a extends C11880q {

        /* renamed from: a */
        final /* synthetic */ C11868g.C11869a f31581a;

        C11871a(C11868g.C11869a aVar) {
            this.f31581a = aVar;
        }

        /* renamed from: a */
        private static /* synthetic */ void m39169a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "constructor1";
            } else {
                objArr[0] = "constructor2";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/KotlinTypeCheckerImpl$1";
            objArr[2] = "assertEqualTypeConstructors";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public boolean mo38537a(C11953s0 s0Var, C11953s0 s0Var2) {
            if (s0Var == null) {
                m39169a(0);
                throw null;
            } else if (s0Var2 != null) {
                return s0Var.equals(s0Var2) || this.f31581a.mo35203a(s0Var, s0Var2);
            } else {
                m39169a(1);
                throw null;
            }
        }
    }

    protected C11870h(C11881r rVar) {
        if (rVar != null) {
            this.f31580b = rVar;
        } else {
            m39166a(1);
            throw null;
        }
    }

    /* renamed from: a */
    public static C11868g m39165a(C11868g.C11869a aVar) {
        if (aVar != null) {
            return new C11870h(new C11881r(new C11871a(aVar)));
        }
        m39166a(0);
        throw null;
    }

    /* renamed from: a */
    private static /* synthetic */ void m39166a(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "procedure";
        } else if (i == 2) {
            objArr[0] = "subtype";
        } else if (i == 3) {
            objArr[0] = "supertype";
        } else if (i == 4) {
            objArr[0] = "a";
        } else if (i != 5) {
            objArr[0] = "equalityAxioms";
        } else {
            objArr[0] = "b";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/KotlinTypeCheckerImpl";
        if (i == 1) {
            objArr[2] = "<init>";
        } else if (i == 2 || i == 3) {
            objArr[2] = "isSubtypeOf";
        } else if (i == 4 || i == 5) {
            objArr[2] = "equalTypes";
        } else {
            objArr[2] = "withAxioms";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: b */
    public boolean mo38536b(C11824b0 b0Var, C11824b0 b0Var2) {
        if (b0Var == null) {
            m39166a(2);
            throw null;
        } else if (b0Var2 != null) {
            return this.f31580b.mo38556c(b0Var, b0Var2);
        } else {
            m39166a(3);
            throw null;
        }
    }

    /* renamed from: a */
    public boolean mo38535a(C11824b0 b0Var, C11824b0 b0Var2) {
        if (b0Var == null) {
            m39166a(4);
            throw null;
        } else if (b0Var2 != null) {
            return this.f31580b.mo38554a(b0Var, b0Var2);
        } else {
            m39166a(5);
            throw null;
        }
    }
}
