package kotlin.p045h0.p046u.p047e.p048k0.p380k.p381h1;

import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import java.util.List;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p253o.C10071a;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11821a1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11830d0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11838f1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11951r0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11953s0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11965u0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11975y;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;

/* renamed from: kotlin.h0.u.e.k0.k.h1.r */
/* compiled from: TypeCheckingProcedure */
public class C11881r {

    /* renamed from: a */
    private final C11884s f31595a;

    /* renamed from: kotlin.h0.u.e.k0.k.h1.r$a */
    /* compiled from: TypeCheckingProcedure */
    static /* synthetic */ class C11882a {

        /* renamed from: a */
        static final /* synthetic */ int[] f31596a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                kotlin.h0.u.e.k0.k.f1[] r0 = kotlin.p045h0.p046u.p047e.p048k0.p380k.C11838f1.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31596a = r0
                kotlin.h0.u.e.k0.k.f1 r1 = kotlin.p045h0.p046u.p047e.p048k0.p380k.C11838f1.INVARIANT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31596a     // Catch:{ NoSuchFieldError -> 0x001d }
                kotlin.h0.u.e.k0.k.f1 r1 = kotlin.p045h0.p046u.p047e.p048k0.p380k.C11838f1.IN_VARIANCE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31596a     // Catch:{ NoSuchFieldError -> 0x0028 }
                kotlin.h0.u.e.k0.k.f1 r1 = kotlin.p045h0.p046u.p047e.p048k0.p380k.C11838f1.OUT_VARIANCE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p048k0.p380k.p381h1.C11881r.C11882a.<clinit>():void");
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.k.h1.r$b */
    /* compiled from: TypeCheckingProcedure */
    public enum C11883b {
        IN,
        OUT,
        INV,
        STAR;

        /* renamed from: a */
        public static C11883b m39264a(C11838f1 f1Var) {
            if (f1Var != null) {
                int i = C11882a.f31596a[f1Var.ordinal()];
                if (i == 1) {
                    C11883b bVar = INV;
                    if (bVar != null) {
                        return bVar;
                    }
                    m39265a(1);
                    throw null;
                } else if (i == 2) {
                    C11883b bVar2 = IN;
                    if (bVar2 != null) {
                        return bVar2;
                    }
                    m39265a(2);
                    throw null;
                } else if (i == 3) {
                    C11883b bVar3 = OUT;
                    if (bVar3 != null) {
                        return bVar3;
                    }
                    m39265a(3);
                    throw null;
                } else {
                    throw new IllegalStateException("Unknown variance");
                }
            } else {
                m39265a(0);
                throw null;
            }
        }
    }

    public C11881r(C11884s sVar) {
        this.f31595a = sVar;
    }

    /* renamed from: a */
    public static C11824b0 m39252a(C11824b0 b0Var, C11824b0 b0Var2, C11884s sVar) {
        if (b0Var == null) {
            m39254a(2);
            throw null;
        } else if (b0Var2 == null) {
            m39254a(3);
            throw null;
        } else if (sVar != null) {
            return C11894u.m39287a(b0Var, b0Var2, sVar);
        } else {
            m39254a(4);
            throw null;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m39254a(int i) {
        String str = (i == 7 || i == 10) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 7 || i == 10) ? 2 : 3)];
        switch (i) {
            case 1:
            case 3:
            case 16:
            case 18:
                objArr[0] = "supertype";
                break;
            case 4:
                objArr[0] = "typeCheckingProcedureCallbacks";
                break;
            case 5:
            case 8:
            case 21:
                objArr[0] = MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD;
                break;
            case 6:
            case 9:
                objArr[0] = "argument";
                break;
            case 7:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
                break;
            case 11:
                objArr[0] = "type1";
                break;
            case 12:
                objArr[0] = "type2";
                break;
            case 13:
                objArr[0] = "typeParameter";
                break;
            case 14:
                objArr[0] = "typeArgument";
                break;
            case 19:
                objArr[0] = "subtypeArgumentProjection";
                break;
            case 20:
                objArr[0] = "supertypeArgumentProjection";
                break;
            default:
                objArr[0] = "subtype";
                break;
        }
        if (i == 7) {
            objArr[1] = "getOutType";
        } else if (i != 10) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
        } else {
            objArr[1] = "getInType";
        }
        switch (i) {
            case 5:
            case 6:
                objArr[2] = "getOutType";
                break;
            case 7:
            case 10:
                break;
            case 8:
            case 9:
                objArr[2] = "getInType";
                break;
            case 11:
            case 12:
                objArr[2] = "equalTypes";
                break;
            case 13:
            case 14:
                objArr[2] = "getEffectiveProjectionKind";
                break;
            case 15:
            case 16:
                objArr[2] = "isSubtypeOf";
                break;
            case 17:
            case 18:
                objArr[2] = "checkSubtypeForTheSameConstructor";
                break;
            case 19:
            case 20:
            case 21:
                objArr[2] = "capture";
                break;
            default:
                objArr[2] = "findCorrespondingSupertype";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 7 || i == 10) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    private static C11824b0 m39256b(C10375s0 s0Var, C11965u0 u0Var) {
        if (s0Var == null) {
            m39254a(8);
            throw null;
        } else if (u0Var != null) {
            C11824b0 t = u0Var.mo38596a() == C11838f1.OUT_VARIANCE || s0Var.mo35439G() == C11838f1.OUT_VARIANCE ? C10071a.m33892b((C10359m) s0Var).mo33724t() : u0Var.getType();
            if (t != null) {
                return t;
            }
            m39254a(10);
            throw null;
        } else {
            m39254a(9);
            throw null;
        }
    }

    /* renamed from: c */
    private static C11824b0 m39257c(C10375s0 s0Var, C11965u0 u0Var) {
        if (s0Var == null) {
            m39254a(5);
            throw null;
        } else if (u0Var != null) {
            C11824b0 u = u0Var.mo38596a() == C11838f1.IN_VARIANCE || s0Var.mo35439G() == C11838f1.IN_VARIANCE ? C10071a.m33892b((C10359m) s0Var).mo33725u() : u0Var.getType();
            if (u != null) {
                return u;
            }
            m39254a(7);
            throw null;
        } else {
            m39254a(6);
            throw null;
        }
    }

    /* renamed from: d */
    private boolean m39258d(C11824b0 b0Var, C11824b0 b0Var2) {
        if (b0Var == null) {
            m39254a(17);
            throw null;
        } else if (b0Var2 != null) {
            C11953s0 v0 = b0Var.mo35227v0();
            List<C11965u0> u0 = b0Var.mo35226u0();
            List<C11965u0> u02 = b0Var2.mo35226u0();
            if (u0.size() != u02.size()) {
                return false;
            }
            List<C10375s0> parameters = v0.getParameters();
            int i = 0;
            while (true) {
                boolean z = true;
                if (i >= parameters.size()) {
                    return true;
                }
                C10375s0 s0Var = parameters.get(i);
                C11965u0 u0Var = u02.get(i);
                C11965u0 u0Var2 = u0.get(i);
                if (!u0Var.mo38597b() && !m39255a(u0Var2, u0Var, s0Var)) {
                    if (!C11830d0.m38958a(u0Var2.getType()) && !C11830d0.m38958a(u0Var.getType())) {
                        z = false;
                    }
                    if (z || s0Var.mo35439G() != C11838f1.INVARIANT || u0Var2.mo38596a() != C11838f1.INVARIANT || u0Var.mo38596a() != C11838f1.INVARIANT) {
                        C11824b0 c = m39257c(s0Var, u0Var);
                        if (!this.f31595a.mo38551a(m39257c(s0Var, u0Var2), c, this)) {
                            return false;
                        }
                        C11824b0 b = m39256b(s0Var, u0Var);
                        C11824b0 b2 = m39256b(s0Var, u0Var2);
                        if (u0Var.mo38596a() != C11838f1.OUT_VARIANCE && !this.f31595a.mo38551a(b, b2, this)) {
                            return false;
                        }
                    } else if (!this.f31595a.mo38553b(u0Var2.getType(), u0Var.getType(), this)) {
                        return false;
                    }
                }
                i++;
            }
        } else {
            m39254a(18);
            throw null;
        }
    }

    /* renamed from: e */
    public static C11824b0 m39259e(C11824b0 b0Var, C11824b0 b0Var2) {
        if (b0Var == null) {
            m39254a(0);
            throw null;
        } else if (b0Var2 != null) {
            return m39252a(b0Var, b0Var2, (C11884s) new C11880q());
        } else {
            m39254a(1);
            throw null;
        }
    }

    /* renamed from: f */
    private boolean m39260f(C11824b0 b0Var, C11824b0 b0Var2) {
        if (C11830d0.m38958a(b0Var) || C11830d0.m38958a(b0Var2)) {
            return true;
        }
        if (!b0Var2.mo34094w0() && b0Var.mo34094w0()) {
            return false;
        }
        if (C9333g.m30203o(b0Var)) {
            return true;
        }
        C11824b0 a = m39252a(b0Var, b0Var2, this.f31595a);
        if (a == null) {
            return this.f31595a.mo38550a(b0Var, b0Var2);
        }
        if (b0Var2.mo34094w0() || !a.mo34094w0()) {
            return m39258d(a, b0Var2);
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo38554a(C11824b0 b0Var, C11824b0 b0Var2) {
        if (b0Var == null) {
            m39254a(11);
            throw null;
        } else if (b0Var2 == null) {
            m39254a(12);
            throw null;
        } else if (b0Var == b0Var2) {
            return true;
        } else {
            if (C11975y.m39644b(b0Var)) {
                if (!C11975y.m39644b(b0Var2)) {
                    return mo38555b(b0Var2, b0Var);
                }
                if (C11830d0.m38958a(b0Var) || C11830d0.m38958a(b0Var2) || !mo38556c(b0Var, b0Var2) || !mo38556c(b0Var2, b0Var)) {
                    return false;
                }
                return true;
            } else if (C11975y.m39644b(b0Var2)) {
                return mo38555b(b0Var, b0Var2);
            } else {
                if (b0Var.mo34094w0() != b0Var2.mo34094w0()) {
                    return false;
                }
                if (b0Var.mo34094w0()) {
                    return this.f31595a.mo38553b(C11821a1.m38918i(b0Var), C11821a1.m38918i(b0Var2), this);
                }
                C11953s0 v0 = b0Var.mo35227v0();
                C11953s0 v02 = b0Var2.mo35227v0();
                if (!this.f31595a.mo38537a(v0, v02)) {
                    return false;
                }
                List<C11965u0> u0 = b0Var.mo35226u0();
                List<C11965u0> u02 = b0Var2.mo35226u0();
                if (u0.size() != u02.size()) {
                    return false;
                }
                for (int i = 0; i < u0.size(); i++) {
                    C11965u0 u0Var = u0.get(i);
                    C11965u0 u0Var2 = u02.get(i);
                    if (!u0Var.mo38597b() || !u0Var2.mo38597b()) {
                        C10375s0 s0Var = v0.getParameters().get(i);
                        C10375s0 s0Var2 = v02.getParameters().get(i);
                        if (!m39255a(u0Var, u0Var2, s0Var) && (m39253a(s0Var, u0Var) != m39253a(s0Var2, u0Var2) || !this.f31595a.mo38553b(u0Var.getType(), u0Var2.getType(), this))) {
                            return false;
                        }
                    }
                }
                return true;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo38555b(C11824b0 b0Var, C11824b0 b0Var2) {
        return mo38556c((C11824b0) C11975y.m39643a(b0Var2).mo38609z0(), b0Var) && mo38556c(b0Var, (C11824b0) C11975y.m39643a(b0Var2).mo38607A0());
    }

    /* renamed from: c */
    public boolean mo38556c(C11824b0 b0Var, C11824b0 b0Var2) {
        if (b0Var == null) {
            m39254a(15);
            throw null;
        } else if (b0Var2 == null) {
            m39254a(16);
            throw null;
        } else if (C11951r0.m39516a(b0Var, b0Var2)) {
            return !b0Var.mo34094w0() || b0Var2.mo34094w0();
        } else {
            C11824b0 b = C11951r0.m39517b(b0Var);
            C11824b0 c = C11951r0.m39518c(b0Var2);
            if (b == b0Var && c == b0Var2) {
                return m39260f(b0Var, b0Var2);
            }
            return mo38556c(b, c);
        }
    }

    /* renamed from: a */
    public static C11883b m39253a(C10375s0 s0Var, C11965u0 u0Var) {
        if (s0Var == null) {
            m39254a(13);
            throw null;
        } else if (u0Var != null) {
            C11838f1 G = s0Var.mo35439G();
            C11838f1 a = u0Var.mo38596a();
            if (a == C11838f1.INVARIANT) {
                C11838f1 f1Var = a;
                a = G;
                G = f1Var;
            }
            if (G == C11838f1.IN_VARIANCE && a == C11838f1.OUT_VARIANCE) {
                return C11883b.STAR;
            }
            if (G == C11838f1.OUT_VARIANCE && a == C11838f1.IN_VARIANCE) {
                return C11883b.STAR;
            }
            return C11883b.m39264a(a);
        } else {
            m39254a(14);
            throw null;
        }
    }

    /* renamed from: a */
    private boolean m39255a(C11965u0 u0Var, C11965u0 u0Var2, C10375s0 s0Var) {
        if (u0Var == null) {
            m39254a(19);
            throw null;
        } else if (u0Var2 == null) {
            m39254a(20);
            throw null;
        } else if (s0Var == null) {
            m39254a(21);
            throw null;
        } else if (s0Var.mo35439G() == C11838f1.INVARIANT && u0Var.mo38596a() != C11838f1.INVARIANT && u0Var2.mo38596a() == C11838f1.INVARIANT) {
            return this.f31595a.mo38552a(u0Var2.getType(), u0Var);
        } else {
            return false;
        }
    }
}
