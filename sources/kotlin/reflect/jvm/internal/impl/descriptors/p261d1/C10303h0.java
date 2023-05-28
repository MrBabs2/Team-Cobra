package kotlin.reflect.jvm.internal.impl.descriptors.p261d1;

import java.util.ArrayList;
import java.util.List;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C9999c;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p253o.C10071a;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11795b;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11830d0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11838f1;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10370q0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.h0 */
/* compiled from: TypeParameterDescriptorImpl */
public class C10303h0 extends C10290e {

    /* renamed from: o */
    private final C9113l<C11824b0, Void> f28007o;

    /* renamed from: p */
    private final List<C11824b0> f28008p;

    /* renamed from: q */
    private boolean f28009q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C10303h0(C10359m mVar, C10249g gVar, boolean z, C11838f1 f1Var, C9939f fVar, int i, C10362n0 n0Var, C9113l<C11824b0, Void> lVar, C10370q0 q0Var) {
        super(C11795b.f31497e, mVar, gVar, fVar, f1Var, z, i, n0Var, q0Var);
        if (mVar == null) {
            m34537a(16);
            throw null;
        } else if (gVar == null) {
            m34537a(17);
            throw null;
        } else if (f1Var == null) {
            m34537a(18);
            throw null;
        } else if (fVar == null) {
            m34537a(19);
            throw null;
        } else if (n0Var == null) {
            m34537a(20);
            throw null;
        } else if (q0Var != null) {
            this.f28008p = new ArrayList(1);
            this.f28009q = false;
            this.f28007o = lVar;
        } else {
            m34537a(21);
            throw null;
        }
    }

    /* renamed from: C */
    private void m34532C() {
        if (!this.f28009q) {
            throw new IllegalStateException("Type parameter descriptor is not initialized: " + m34539q0());
        }
    }

    /* renamed from: K */
    private void m34533K() {
        if (this.f28009q) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + m34539q0());
        }
    }

    /* renamed from: a */
    public static C10375s0 m34536a(C10359m mVar, C10249g gVar, boolean z, C11838f1 f1Var, C9939f fVar, int i) {
        if (mVar == null) {
            m34537a(0);
            throw null;
        } else if (gVar == null) {
            m34537a(1);
            throw null;
        } else if (f1Var == null) {
            m34537a(2);
            throw null;
        } else if (fVar != null) {
            C10303h0 a = m34534a(mVar, gVar, z, f1Var, fVar, i, C10362n0.f28175a);
            a.mo35480b(C10071a.m33892b(mVar).mo33717m());
            a.mo35479B();
            if (a != null) {
                return a;
            }
            m34537a(4);
            throw null;
        } else {
            m34537a(3);
            throw null;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m34537a(int i) {
        String str = (i == 4 || i == 24) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 4 || i == 24) ? 2 : 3)];
        switch (i) {
            case 1:
            case 6:
            case 11:
            case 17:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
            case 12:
            case 18:
                objArr[0] = "variance";
                break;
            case 3:
            case 8:
            case 13:
            case 19:
                objArr[0] = "name";
                break;
            case 4:
            case 24:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 9:
            case 14:
            case 20:
                objArr[0] = "source";
                break;
            case 15:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 21:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 22:
                objArr[0] = "bound";
                break;
            case 23:
                objArr[0] = "type";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 4) {
            objArr[1] = "createWithDefaultBound";
        } else if (i != 24) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i) {
            case 4:
            case 24:
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createForFurtherModification";
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "<init>";
                break;
            case 22:
                objArr[2] = "addUpperBound";
                break;
            case 23:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 4 || i == 24) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: c */
    private void m34538c(C11824b0 b0Var) {
        if (!C11830d0.m38958a(b0Var)) {
            this.f28008p.add(b0Var);
        }
    }

    /* renamed from: q0 */
    private String m34539q0() {
        return getName() + " declared in " + C9999c.m33680e(mo33762b());
    }

    /* renamed from: B */
    public void mo35479B() {
        m34533K();
        this.f28009q = true;
    }

    /* renamed from: b */
    public void mo35480b(C11824b0 b0Var) {
        if (b0Var != null) {
            m34533K();
            m34538c(b0Var);
            return;
        }
        m34537a(22);
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public List<C11824b0> mo33989r() {
        m34532C();
        List<C11824b0> list = this.f28008p;
        if (list != null) {
            return list;
        }
        m34537a(24);
        throw null;
    }

    /* renamed from: a */
    public static C10303h0 m34534a(C10359m mVar, C10249g gVar, boolean z, C11838f1 f1Var, C9939f fVar, int i, C10362n0 n0Var) {
        if (mVar == null) {
            m34537a(5);
            throw null;
        } else if (gVar == null) {
            m34537a(6);
            throw null;
        } else if (f1Var == null) {
            m34537a(7);
            throw null;
        } else if (fVar == null) {
            m34537a(8);
            throw null;
        } else if (n0Var != null) {
            return m34535a(mVar, gVar, z, f1Var, fVar, i, n0Var, (C9113l<C11824b0, Void>) null, C10370q0.C10371a.f28177a);
        } else {
            m34537a(9);
            throw null;
        }
    }

    /* renamed from: a */
    public static C10303h0 m34535a(C10359m mVar, C10249g gVar, boolean z, C11838f1 f1Var, C9939f fVar, int i, C10362n0 n0Var, C9113l<C11824b0, Void> lVar, C10370q0 q0Var) {
        if (mVar == null) {
            m34537a(10);
            throw null;
        } else if (gVar == null) {
            m34537a(11);
            throw null;
        } else if (f1Var == null) {
            m34537a(12);
            throw null;
        } else if (fVar == null) {
            m34537a(13);
            throw null;
        } else if (n0Var == null) {
            m34537a(14);
            throw null;
        } else if (q0Var != null) {
            return new C10303h0(mVar, gVar, z, f1Var, fVar, i, n0Var, lVar, q0Var);
        } else {
            m34537a(15);
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo33988a(C11824b0 b0Var) {
        if (b0Var != null) {
            C9113l<C11824b0, Void> lVar = this.f28007o;
            if (lVar != null) {
                lVar.invoke(b0Var);
                return;
            }
            return;
        }
        m34537a(23);
        throw null;
    }
}
