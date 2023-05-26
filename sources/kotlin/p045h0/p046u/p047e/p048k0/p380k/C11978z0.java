package kotlin.p045h0.p046u.p047e.p048k0.p380k;

import java.util.ArrayList;
import java.util.List;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p249l.p250a.C10026d;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p384k1.C11924a;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p385l1.C11930c;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10257k;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10260l;
import kotlin.reflect.jvm.internal.impl.utils.C12149c;

/* renamed from: kotlin.h0.u.e.k0.k.z0 */
/* compiled from: TypeSubstitutor */
public class C11978z0 {

    /* renamed from: b */
    public static final C11978z0 f31684b = m39663a(C11972x0.f31680a);

    /* renamed from: a */
    private final C11972x0 f31685a;

    /* renamed from: kotlin.h0.u.e.k0.k.z0$a */
    /* compiled from: TypeSubstitutor */
    static class C11979a implements C9113l<C9934b, Boolean> {
        C11979a() {
        }

        /* renamed from: a */
        private static /* synthetic */ void m39676a(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"}));
        }

        /* renamed from: a */
        public Boolean invoke(C9934b bVar) {
            if (bVar != null) {
                return Boolean.valueOf(!bVar.equals(C9333g.f25907k.f25923F));
            }
            m39676a(0);
            throw null;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.k.z0$b */
    /* compiled from: TypeSubstitutor */
    static /* synthetic */ class C11980b {

        /* renamed from: a */
        static final /* synthetic */ int[] f31686a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                kotlin.h0.u.e.k0.k.z0$d[] r0 = kotlin.p045h0.p046u.p047e.p048k0.p380k.C11978z0.C11982d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31686a = r0
                kotlin.h0.u.e.k0.k.z0$d r1 = kotlin.p045h0.p046u.p047e.p048k0.p380k.C11978z0.C11982d.OUT_IN_IN_POSITION     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31686a     // Catch:{ NoSuchFieldError -> 0x001d }
                kotlin.h0.u.e.k0.k.z0$d r1 = kotlin.p045h0.p046u.p047e.p048k0.p380k.C11978z0.C11982d.IN_IN_OUT_POSITION     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31686a     // Catch:{ NoSuchFieldError -> 0x0028 }
                kotlin.h0.u.e.k0.k.z0$d r1 = kotlin.p045h0.p046u.p047e.p048k0.p380k.C11978z0.C11982d.NO_CONFLICT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p048k0.p380k.C11978z0.C11980b.<clinit>():void");
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.k.z0$c */
    /* compiled from: TypeSubstitutor */
    private static final class C11981c extends Exception {
        public C11981c(String str) {
            super(str);
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.k.z0$d */
    /* compiled from: TypeSubstitutor */
    private enum C11982d {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    protected C11978z0(C11972x0 x0Var) {
        if (x0Var != null) {
            this.f31685a = x0Var;
        } else {
            m39666a(5);
            throw null;
        }
    }

    /* renamed from: a */
    public static C11978z0 m39663a(C11972x0 x0Var) {
        if (x0Var != null) {
            return new C11978z0(x0Var);
        }
        m39666a(0);
        throw null;
    }

    /* renamed from: a */
    private static /* synthetic */ void m39666a(int i) {
        String str;
        int i2;
        Throwable th;
        if (!(i == 6 || i == 24 || i == 27)) {
            switch (i) {
                case 9:
                case 10:
                case 11:
                    break;
                default:
                    switch (i) {
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            break;
                        default:
                            switch (i) {
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                    break;
                            }
                    }
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i == 6 || i == 24 || i == 27)) {
            switch (i) {
                case 9:
                case 10:
                case 11:
                    break;
                default:
                    switch (i) {
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            break;
                        default:
                            switch (i) {
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    i2 = 3;
                                    break;
                            }
                    }
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "first";
                break;
            case 2:
                objArr[0] = "second";
                break;
            case 3:
                objArr[0] = "substitutionContext";
                break;
            case 4:
                objArr[0] = "context";
                break;
            case 6:
            case 9:
            case 10:
            case 11:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 24:
            case 27:
            case 30:
            case 31:
            case 32:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 7:
            case 12:
                objArr[0] = "type";
                break;
            case 8:
            case 13:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case 14:
            case 15:
            case 26:
                objArr[0] = "typeProjection";
                break;
            case 16:
                objArr[0] = "originalProjection";
                break;
            case 23:
                objArr[0] = "annotations";
                break;
            case 25:
            case 28:
                objArr[0] = "typeParameterVariance";
                break;
            case 29:
                objArr[0] = "projectionKind";
                break;
            default:
                objArr[0] = "substitution";
                break;
        }
        if (i == 6) {
            objArr[1] = "getSubstitution";
        } else if (i != 24) {
            if (i != 27) {
                switch (i) {
                    case 9:
                    case 10:
                    case 11:
                        objArr[1] = "safeSubstitute";
                        break;
                    default:
                        switch (i) {
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                                objArr[1] = "unsafeSubstitute";
                                break;
                            default:
                                switch (i) {
                                    case 30:
                                    case 31:
                                    case 32:
                                        break;
                                    default:
                                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                        break;
                                }
                        }
                }
            }
            objArr[1] = "combine";
        } else {
            objArr[1] = "filterOutUnsafeVariance";
        }
        if (i != 1 && i != 2) {
            switch (i) {
                case 5:
                    objArr[2] = "<init>";
                    break;
                case 6:
                case 9:
                case 10:
                case 11:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 24:
                case 27:
                case 30:
                case 31:
                case 32:
                    break;
                case 7:
                case 8:
                    objArr[2] = "safeSubstitute";
                    break;
                case 12:
                case 13:
                case 14:
                    objArr[2] = "substitute";
                    break;
                case 15:
                    objArr[2] = "substituteWithoutApproximation";
                    break;
                case 16:
                    objArr[2] = "unsafeSubstitute";
                    break;
                case 23:
                    objArr[2] = "filterOutUnsafeVariance";
                    break;
                case 25:
                case 26:
                case 28:
                case 29:
                    objArr[2] = "combine";
                    break;
                default:
                    objArr[2] = "create";
                    break;
            }
        } else {
            objArr[2] = "createChainedSubstitutor";
        }
        String format = String.format(str, objArr);
        if (!(i == 6 || i == 24 || i == 27)) {
            switch (i) {
                case 9:
                case 10:
                case 11:
                    break;
                default:
                    switch (i) {
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            break;
                        default:
                            switch (i) {
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    th = new IllegalArgumentException(format);
                                    break;
                            }
                    }
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    /* renamed from: b */
    public boolean mo38622b() {
        return this.f31685a.mo34004d();
    }

    /* renamed from: b */
    public C11824b0 mo38620b(C11824b0 b0Var, C11838f1 f1Var) {
        if (b0Var == null) {
            m39666a(12);
            throw null;
        } else if (f1Var != null) {
            C11965u0 a = mo38618a((C11965u0) new C11970w0(f1Var, mo38619a().mo38593a(b0Var, f1Var)));
            if (a == null) {
                return null;
            }
            return a.getType();
        } else {
            m39666a(13);
            throw null;
        }
    }

    /* renamed from: a */
    public static C11978z0 m39664a(C11972x0 x0Var, C11972x0 x0Var2) {
        if (x0Var == null) {
            m39666a(1);
            throw null;
        } else if (x0Var2 != null) {
            return m39663a(C11947q.m39498a(x0Var, x0Var2));
        } else {
            m39666a(2);
            throw null;
        }
    }

    /* renamed from: a */
    public static C11978z0 m39662a(C11824b0 b0Var) {
        if (b0Var != null) {
            return m39663a(C11955t0.m39534a(b0Var.mo35227v0(), b0Var.mo35226u0()));
        }
        m39666a(4);
        throw null;
    }

    /* renamed from: b */
    public C11965u0 mo38621b(C11965u0 u0Var) {
        if (u0Var == null) {
            m39666a(15);
            throw null;
        } else if (mo38622b()) {
            return u0Var;
        } else {
            try {
                return m39668b(u0Var, 0);
            } catch (C11981c unused) {
                return null;
            }
        }
    }

    /* renamed from: a */
    public C11972x0 mo38619a() {
        C11972x0 x0Var = this.f31685a;
        if (x0Var != null) {
            return x0Var;
        }
        m39666a(6);
        throw null;
    }

    /* renamed from: b */
    private C11965u0 m39668b(C11965u0 u0Var, int i) throws C11981c {
        C11824b0 b0Var;
        if (u0Var != null) {
            m39667a(i, u0Var, this.f31685a);
            if (!u0Var.mo38597b()) {
                C11824b0 type = u0Var.getType();
                if (type instanceof C11825b1) {
                    C11825b1 b1Var = (C11825b1) type;
                    C11834e1 r = b1Var.mo38441r();
                    C11824b0 C = b1Var.mo38440C();
                    C11965u0 b = m39668b((C11965u0) new C11970w0(u0Var.mo38596a(), r), i + 1);
                    return new C11970w0(b.mo38596a(), C11828c1.m38954b(b.getType().mo38439x0(), mo38620b(C, u0Var.mo38596a())));
                } else if (!C11952s.m39520a(type) && !(type.mo38439x0() instanceof C11897i0)) {
                    C11965u0 a = this.f31685a.mo34002a(type);
                    C11838f1 a2 = u0Var.mo38596a();
                    if (a == null && C11975y.m39644b(type) && !C11951r0.m39519d(type)) {
                        C11966v a3 = C11975y.m39643a(type);
                        int i2 = i + 1;
                        C11965u0 b2 = m39668b((C11965u0) new C11970w0(a2, a3.mo38609z0()), i2);
                        C11965u0 b3 = m39668b((C11965u0) new C11970w0(a2, a3.mo38607A0()), i2);
                        C11838f1 a4 = b2.mo38596a();
                        if (b2.getType() != a3.mo38609z0() || b3.getType() != a3.mo38607A0()) {
                            return new C11970w0(a4, C11827c0.m38946a(C11976y0.m39649a(b2.getType()), C11976y0.m39649a(b3.getType())));
                        }
                        if (u0Var != null) {
                            return u0Var;
                        }
                        m39666a(19);
                        throw null;
                    } else if (C9333g.m30202n(type) || C11830d0.m38958a(type)) {
                        if (u0Var != null) {
                            return u0Var;
                        }
                        m39666a(20);
                        throw null;
                    } else if (a != null) {
                        C11982d b4 = m39669b(a2, a.mo38596a());
                        if (!C10026d.m33800a(type)) {
                            int i3 = C11980b.f31686a[b4.ordinal()];
                            if (i3 == 1) {
                                throw new C11981c("Out-projection in in-position");
                            } else if (i3 == 2) {
                                return new C11970w0(C11838f1.OUT_VARIANCE, type.mo35227v0().mo35232l().mo33725u());
                            }
                        }
                        C11922k a5 = C11951r0.m39515a(type);
                        if (!a.mo38597b()) {
                            if (a5 != null) {
                                b0Var = a5.mo34093a(a.getType());
                            } else {
                                b0Var = C11821a1.m38910b(a.getType(), type.mo34094w0());
                            }
                            if (!type.getAnnotations().isEmpty()) {
                                b0Var = C11924a.m39411a(b0Var, (C10249g) new C10257k(b0Var.getAnnotations(), m39665a(this.f31685a.mo38594a(type.getAnnotations()))));
                            }
                            if (b4 == C11982d.NO_CONFLICT) {
                                a2 = m39659a(a2, a.mo38596a());
                            }
                            return new C11970w0(a2, b0Var);
                        } else if (a != null) {
                            return a;
                        } else {
                            m39666a(21);
                            throw null;
                        }
                    } else {
                        C11965u0 a6 = m39661a(u0Var, i);
                        if (a6 != null) {
                            return a6;
                        }
                        m39666a(22);
                        throw null;
                    }
                } else if (u0Var != null) {
                    return u0Var;
                } else {
                    m39666a(18);
                    throw null;
                }
            } else if (u0Var != null) {
                return u0Var;
            } else {
                m39666a(17);
                throw null;
            }
        } else {
            m39666a(16);
            throw null;
        }
    }

    /* renamed from: a */
    public C11824b0 mo38617a(C11824b0 b0Var, C11838f1 f1Var) {
        if (b0Var == null) {
            m39666a(7);
            throw null;
        } else if (f1Var == null) {
            m39666a(8);
            throw null;
        } else if (!mo38622b()) {
            try {
                C11824b0 type = m39668b((C11965u0) new C11970w0(f1Var, b0Var), 0).getType();
                if (type != null) {
                    return type;
                }
                m39666a(10);
                throw null;
            } catch (C11981c e) {
                C11901j0 c = C11958u.m39559c(e.getMessage());
                if (c != null) {
                    return c;
                }
                m39666a(11);
                throw null;
            }
        } else if (b0Var != null) {
            return b0Var;
        } else {
            m39666a(9);
            throw null;
        }
    }

    /* renamed from: a */
    public C11965u0 mo38618a(C11965u0 u0Var) {
        if (u0Var != null) {
            C11965u0 b = mo38621b(u0Var);
            if (this.f31685a.mo38595a() || this.f31685a.mo35234b()) {
                return C11930c.m39451a(b, this.f31685a.mo35234b());
            }
            return b;
        }
        m39666a(14);
        throw null;
    }

    /* renamed from: a */
    private static C10249g m39665a(C10249g gVar) {
        if (gVar == null) {
            m39666a(23);
            throw null;
        } else if (gVar.mo33886b(C9333g.f25907k.f25923F)) {
            return new C10260l(gVar, new C11979a());
        } else {
            if (gVar != null) {
                return gVar;
            }
            m39666a(24);
            throw null;
        }
    }

    /* renamed from: a */
    private C11965u0 m39661a(C11965u0 u0Var, int i) throws C11981c {
        C11824b0 type = u0Var.getType();
        C11838f1 a = u0Var.mo38596a();
        if (type.mo35227v0().mo33781b() instanceof C10375s0) {
            return u0Var;
        }
        C11824b0 b0Var = null;
        C11901j0 b = C11938m0.m39472b(type);
        if (b != null) {
            b0Var = mo38620b((C11824b0) b, C11838f1.INVARIANT);
        }
        C11824b0 a2 = C11976y0.m39647a(type, (List<? extends C11965u0>) m39658a(type.mo35227v0().getParameters(), type.mo35226u0(), i), this.f31685a.mo38594a(type.getAnnotations()));
        if ((a2 instanceof C11901j0) && (b0Var instanceof C11901j0)) {
            a2 = C11938m0.m39471a((C11901j0) a2, (C11901j0) b0Var);
        }
        return new C11970w0(a, a2);
    }

    /* renamed from: a */
    private List<C11965u0> m39658a(List<C10375s0> list, List<C11965u0> list2, int i) throws C11981c {
        ArrayList arrayList = new ArrayList(list.size());
        boolean z = false;
        for (int i2 = 0; i2 < list.size(); i2++) {
            C10375s0 s0Var = list.get(i2);
            C11965u0 u0Var = list2.get(i2);
            C11965u0 b = m39668b(u0Var, i + 1);
            int i3 = C11980b.f31686a[m39669b(s0Var.mo35439G(), b.mo38596a()).ordinal()];
            if (i3 == 1 || i3 == 2) {
                b = C11821a1.m38905a(s0Var);
            } else if (i3 == 3 && s0Var.mo35439G() != C11838f1.INVARIANT && !b.mo38597b()) {
                b = new C11970w0(C11838f1.INVARIANT, b.getType());
            }
            if (b != u0Var) {
                z = true;
            }
            arrayList.add(b);
        }
        return !z ? list2 : arrayList;
    }

    /* renamed from: a */
    public static C11838f1 m39660a(C11838f1 f1Var, C11965u0 u0Var) {
        if (f1Var == null) {
            m39666a(25);
            throw null;
        } else if (u0Var == null) {
            m39666a(26);
            throw null;
        } else if (!u0Var.mo38597b()) {
            return m39659a(f1Var, u0Var.mo38596a());
        } else {
            C11838f1 f1Var2 = C11838f1.OUT_VARIANCE;
            if (f1Var2 != null) {
                return f1Var2;
            }
            m39666a(27);
            throw null;
        }
    }

    /* renamed from: a */
    public static C11838f1 m39659a(C11838f1 f1Var, C11838f1 f1Var2) {
        if (f1Var == null) {
            m39666a(28);
            throw null;
        } else if (f1Var2 != null) {
            C11838f1 f1Var3 = C11838f1.INVARIANT;
            if (f1Var == f1Var3) {
                if (f1Var2 != null) {
                    return f1Var2;
                }
                m39666a(30);
                throw null;
            } else if (f1Var2 == f1Var3) {
                if (f1Var != null) {
                    return f1Var;
                }
                m39666a(31);
                throw null;
            } else if (f1Var != f1Var2) {
                throw new AssertionError("Variance conflict: type parameter variance '" + f1Var + "' and " + "projection kind '" + f1Var2 + "' cannot be combined");
            } else if (f1Var2 != null) {
                return f1Var2;
            } else {
                m39666a(32);
                throw null;
            }
        } else {
            m39666a(29);
            throw null;
        }
    }

    /* renamed from: a */
    private static void m39667a(int i, C11965u0 u0Var, C11972x0 x0Var) {
        if (i > 100) {
            throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + m39657a((Object) u0Var) + "; substitution: " + m39657a((Object) x0Var));
        }
    }

    /* renamed from: a */
    private static String m39657a(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (!C12149c.m40153a(th)) {
                return "[Exception while computing toString(): " + th + "]";
            }
            throw th;
        }
    }

    /* renamed from: b */
    private static C11982d m39669b(C11838f1 f1Var, C11838f1 f1Var2) {
        if (f1Var == C11838f1.IN_VARIANCE && f1Var2 == C11838f1.OUT_VARIANCE) {
            return C11982d.OUT_IN_IN_POSITION;
        }
        if (f1Var == C11838f1.OUT_VARIANCE && f1Var2 == C11838f1.IN_VARIANCE) {
            return C11982d.IN_IN_OUT_POSITION;
        }
        return C11982d.NO_CONFLICT;
    }
}
