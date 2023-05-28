package kotlin.p045h0.p046u.p047e.p048k0.p245e;

/* renamed from: kotlin.h0.u.e.k0.e.h */
/* compiled from: SpecialNames */
public class C9941h {

    /* renamed from: a */
    public static final C9939f f27438a = C9939f.m33304d("<no name provided>");

    /* renamed from: b */
    public static final C9939f f27439b = C9939f.m33302b("Companion");

    /* renamed from: c */
    public static final C9939f f27440c = C9939f.m33302b("no_name_in_PSI_3d19d79d_1ba9_4cd0_b7f5_b46aa3cd5d40");

    static {
        C9939f.m33304d("<root package>");
        C9939f.m33304d("<anonymous>");
    }

    /* renamed from: a */
    private static /* synthetic */ void m33310a(int i) {
        String str = i != 1 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i != 1 ? 2 : 3)];
        if (i != 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/SpecialNames";
        } else {
            objArr[0] = "name";
        }
        if (i != 1) {
            objArr[1] = "safeIdentifier";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/SpecialNames";
        }
        if (i == 1) {
            objArr[2] = "isSafeIdentifier";
        }
        String format = String.format(str, objArr);
        throw (i != 1 ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: a */
    public static boolean m33311a(C9939f fVar) {
        if (fVar != null) {
            return !fVar.mo35021a().isEmpty() && !fVar.mo35024e();
        }
        m33310a(1);
        throw null;
    }

    /* renamed from: b */
    public static C9939f m33312b(C9939f fVar) {
        if (fVar == null || fVar.mo35024e()) {
            fVar = f27440c;
        }
        if (fVar != null) {
            return fVar;
        }
        m33310a(0);
        throw null;
    }
}
