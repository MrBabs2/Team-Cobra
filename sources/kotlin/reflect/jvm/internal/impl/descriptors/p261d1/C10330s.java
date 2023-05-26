package kotlin.reflect.jvm.internal.impl.descriptors.p261d1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10096h;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10105l;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11795b;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11821a1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11827c0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11838f1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11900j;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11945p;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11953s0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11965u0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11972x0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11978z0;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10237a1;
import kotlin.reflect.jvm.internal.impl.descriptors.C10238b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10273d;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10345f;
import kotlin.reflect.jvm.internal.impl.descriptors.C10358l0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10364o;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10388w;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.s */
/* compiled from: LazySubstitutingClassDescriptor */
public class C10330s implements C10342e {

    /* renamed from: f */
    private final C10342e f28099f;

    /* renamed from: g */
    private final C11978z0 f28100g;

    /* renamed from: h */
    private C11978z0 f28101h;

    /* renamed from: i */
    private List<C10375s0> f28102i;

    /* renamed from: j */
    private List<C10375s0> f28103j;

    /* renamed from: k */
    private C11953s0 f28104k;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.s$a */
    /* compiled from: LazySubstitutingClassDescriptor */
    class C10331a implements C9113l<C10375s0, Boolean> {
        C10331a(C10330s sVar) {
        }

        /* renamed from: a */
        public Boolean invoke(C10375s0 s0Var) {
            return Boolean.valueOf(!s0Var.mo35441d0());
        }
    }

    public C10330s(C10342e eVar, C11978z0 z0Var) {
        this.f28099f = eVar;
        this.f28100g = z0Var;
    }

    /* renamed from: a */
    private static /* synthetic */ void m34754a(int i) {
        String str = (i == 2 || i == 4 || i == 14) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[((i == 2 || i == 4 || i == 14) ? 3 : 2)];
        if (i == 2) {
            objArr[0] = "typeArguments";
        } else if (i == 4) {
            objArr[0] = "typeSubstitution";
        } else if (i != 14) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
        } else {
            objArr[0] = "substitutor";
        }
        switch (i) {
            case 2:
            case 4:
            case 14:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                break;
            case 3:
            case 5:
                objArr[1] = "getMemberScope";
                break;
            case 6:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 7:
                objArr[1] = "getStaticScope";
                break;
            case 8:
                objArr[1] = "getDefaultType";
                break;
            case 9:
                objArr[1] = "getConstructors";
                break;
            case 10:
                objArr[1] = "getAnnotations";
                break;
            case 11:
                objArr[1] = "getName";
                break;
            case 12:
                objArr[1] = "getOriginal";
                break;
            case 13:
                objArr[1] = "getContainingDeclaration";
                break;
            case 15:
                objArr[1] = "substitute";
                break;
            case 16:
                objArr[1] = "getKind";
                break;
            case 17:
                objArr[1] = "getModality";
                break;
            case 18:
                objArr[1] = "getVisibility";
                break;
            case 19:
                objArr[1] = "getUnsubstitutedInnerClassesScope";
                break;
            case 20:
                objArr[1] = "getSource";
                break;
            case 21:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 22:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "getTypeConstructor";
                break;
        }
        if (i == 2 || i == 4) {
            objArr[2] = "getMemberScope";
        } else if (i == 14) {
            objArr[2] = "substitute";
        }
        String format = String.format(str, objArr);
        throw ((i == 2 || i == 4 || i == 14) ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    /* renamed from: r */
    private C11978z0 m34755r() {
        if (this.f28101h == null) {
            if (this.f28100g.mo38622b()) {
                this.f28101h = this.f28100g;
            } else {
                List<C10375s0> parameters = this.f28099f.mo33766h().getParameters();
                this.f28102i = new ArrayList(parameters.size());
                this.f28101h = C11945p.m39492a(parameters, this.f28100g.mo38619a(), this, this.f28102i);
                this.f28103j = C10539w.m35788c(this.f28102i, new C10331a(this));
            }
        }
        return this.f28101h;
    }

    /* renamed from: E */
    public Collection<C10342e> mo33757E() {
        Collection<C10342e> E = this.f28099f.mo33757E();
        if (E != null) {
            return E;
        }
        m34754a(22);
        throw null;
    }

    /* renamed from: F */
    public boolean mo33758F() {
        return this.f28099f.mo33758F();
    }

    /* renamed from: L */
    public C10273d mo33759L() {
        return this.f28099f.mo33759L();
    }

    /* renamed from: M */
    public C10096h mo33760M() {
        C10096h M = this.f28099f.mo33760M();
        if (M != null) {
            return M;
        }
        m34754a(7);
        throw null;
    }

    /* renamed from: O */
    public C10342e mo33761O() {
        return this.f28099f.mo33761O();
    }

    /* renamed from: b */
    public C10359m mo33762b() {
        C10359m b = this.f28099f.mo33762b();
        if (b != null) {
            return b;
        }
        m34754a(13);
        throw null;
    }

    /* renamed from: g */
    public C10345f mo33763g() {
        C10345f g = this.f28099f.mo33763g();
        if (g != null) {
            return g;
        }
        m34754a(16);
        throw null;
    }

    public C10249g getAnnotations() {
        C10249g annotations = this.f28099f.getAnnotations();
        if (annotations != null) {
            return annotations;
        }
        m34754a(10);
        throw null;
    }

    public C9939f getName() {
        C9939f name = this.f28099f.getName();
        if (name != null) {
            return name;
        }
        m34754a(11);
        throw null;
    }

    public C10237a1 getVisibility() {
        C10237a1 visibility = this.f28099f.getVisibility();
        if (visibility != null) {
            return visibility;
        }
        m34754a(18);
        throw null;
    }

    /* renamed from: h */
    public C11953s0 mo33766h() {
        C11953s0 h = this.f28099f.mo33766h();
        if (!this.f28100g.mo38622b()) {
            if (this.f28104k == null) {
                C11978z0 r = m34755r();
                Collection<C11824b0> a = h.mo35229a();
                ArrayList arrayList = new ArrayList(a.size());
                for (C11824b0 b : a) {
                    arrayList.add(r.mo38620b(b, C11838f1.INVARIANT));
                }
                this.f28104k = new C11900j(this, this.f28102i, arrayList, C11795b.f31497e);
            }
            C11953s0 s0Var = this.f28104k;
            if (s0Var != null) {
                return s0Var;
            }
            m34754a(1);
            throw null;
        } else if (h != null) {
            return h;
        } else {
            m34754a(0);
            throw null;
        }
    }

    /* renamed from: i */
    public C10388w mo33767i() {
        C10388w i = this.f28099f.mo33767i();
        if (i != null) {
            return i;
        }
        m34754a(17);
        throw null;
    }

    public boolean isInline() {
        return this.f28099f.isInline();
    }

    /* renamed from: j */
    public Collection<C10273d> mo33769j() {
        Collection<C10273d> j = this.f28099f.mo33769j();
        ArrayList arrayList = new ArrayList(j.size());
        for (C10273d next : j) {
            arrayList.add(((C10273d) next.mo35465q().mo35524a((C10238b) next.mo35404a()).mo35527a(next.mo33767i()).mo35521a(next.getVisibility()).mo35522a(next.mo35423g()).mo35528a(false).mo35529a()).mo35448a(m34755r()));
        }
        return arrayList;
    }

    /* renamed from: k */
    public boolean mo33770k() {
        return this.f28099f.mo33770k();
    }

    /* renamed from: k0 */
    public C10096h mo33928k0() {
        C10096h k0 = this.f28099f.mo33928k0();
        if (k0 != null) {
            return k0;
        }
        m34754a(19);
        throw null;
    }

    /* renamed from: n0 */
    public C10096h mo33771n0() {
        C10096h n0 = this.f28099f.mo33771n0();
        if (!this.f28100g.mo38622b()) {
            return new C10105l(n0, m34755r());
        }
        if (n0 != null) {
            return n0;
        }
        m34754a(6);
        throw null;
    }

    /* renamed from: o */
    public C11901j0 mo35445o() {
        C11901j0 a = C11827c0.m38950a(getAnnotations(), (C10342e) this, (List<? extends C11965u0>) C11821a1.m38901a(mo33766h().getParameters()));
        if (a != null) {
            return a;
        }
        m34754a(8);
        throw null;
    }

    /* renamed from: o0 */
    public boolean mo33772o0() {
        return this.f28099f.mo33772o0();
    }

    /* renamed from: p */
    public C10362n0 mo33773p() {
        C10362n0 n0Var = C10362n0.f28175a;
        if (n0Var != null) {
            return n0Var;
        }
        m34754a(20);
        throw null;
    }

    /* renamed from: r0 */
    public boolean mo33775r0() {
        return this.f28099f.mo33775r0();
    }

    /* renamed from: s */
    public List<C10375s0> mo33776s() {
        m34755r();
        List<C10375s0> list = this.f28103j;
        if (list != null) {
            return list;
        }
        m34754a(21);
        throw null;
    }

    /* renamed from: t0 */
    public C10358l0 mo35452t0() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: u */
    public boolean mo33778u() {
        return this.f28099f.mo33778u();
    }

    /* renamed from: v */
    public boolean mo33779v() {
        return this.f28099f.mo33779v();
    }

    /* renamed from: a */
    public C10096h mo35451a(C11972x0 x0Var) {
        if (x0Var != null) {
            C10096h a = this.f28099f.mo35451a(x0Var);
            if (!this.f28100g.mo38622b()) {
                return new C10105l(a, m34755r());
            }
            if (a != null) {
                return a;
            }
            m34754a(5);
            throw null;
        }
        m34754a(4);
        throw null;
    }

    /* renamed from: a */
    public C10342e m34766a() {
        C10342e a = this.f28099f.mo35404a();
        if (a != null) {
            return a;
        }
        m34754a(12);
        throw null;
    }

    /* renamed from: a */
    public C10342e m34767a(C11978z0 z0Var) {
        if (z0Var == null) {
            m34754a(14);
            throw null;
        } else if (z0Var.mo38622b()) {
            return this;
        } else {
            return new C10330s(this, C11978z0.m39664a(z0Var.mo38619a(), m34755r().mo38619a()));
        }
    }

    /* renamed from: a */
    public <R, D> R mo35440a(C10364o<R, D> oVar, D d) {
        return oVar.mo35122a((C10342e) this, d);
    }
}
