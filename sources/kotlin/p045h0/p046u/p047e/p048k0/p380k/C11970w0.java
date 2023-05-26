package kotlin.p045h0.p046u.p047e.p048k0.p380k;

/* renamed from: kotlin.h0.u.e.k0.k.w0 */
/* compiled from: TypeProjectionImpl */
public class C11970w0 extends C11967v0 {

    /* renamed from: a */
    private final C11838f1 f31676a;

    /* renamed from: b */
    private final C11824b0 f31677b;

    public C11970w0(C11838f1 f1Var, C11824b0 b0Var) {
        if (f1Var == null) {
            m39623a(0);
            throw null;
        } else if (b0Var != null) {
            this.f31676a = f1Var;
            this.f31677b = b0Var;
        } else {
            m39623a(1);
            throw null;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m39623a(int i) {
        String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 3 || i == 4) ? 2 : 3)];
        if (i == 1 || i == 2) {
            objArr[0] = "type";
        } else if (i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[0] = "projection";
        }
        if (i == 3) {
            objArr[1] = "getProjectionKind";
        } else if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (!(i == 3 || i == 4)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 3 || i == 4) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: a */
    public C11838f1 mo38596a() {
        C11838f1 f1Var = this.f31676a;
        if (f1Var != null) {
            return f1Var;
        }
        m39623a(3);
        throw null;
    }

    /* renamed from: b */
    public boolean mo38597b() {
        return false;
    }

    public C11824b0 getType() {
        C11824b0 b0Var = this.f31677b;
        if (b0Var != null) {
            return b0Var;
        }
        m39623a(4);
        throw null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C11970w0(C11824b0 b0Var) {
        this(C11838f1.INVARIANT, b0Var);
        if (b0Var != null) {
        } else {
            m39623a(2);
            throw null;
        }
    }
}
