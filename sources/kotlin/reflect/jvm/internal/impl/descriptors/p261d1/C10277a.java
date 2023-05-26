package kotlin.reflect.jvm.internal.impl.descriptors.p261d1;

import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10094f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10096h;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10105l;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11814f;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11817i;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11821a1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11972x0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11978z0;
import kotlin.p215c0.p216c.C9102a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10358l0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10364o;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.a */
/* compiled from: AbstractClassDescriptor */
public abstract class C10277a implements C10342e {

    /* renamed from: f */
    private final C9939f f27955f;

    /* renamed from: g */
    protected final C11814f<C11901j0> f27956g;

    /* renamed from: h */
    private final C11814f<C10096h> f27957h;

    /* renamed from: i */
    private final C11814f<C10358l0> f27958i;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.a$a */
    /* compiled from: AbstractClassDescriptor */
    class C10278a implements C9102a<C11901j0> {
        C10278a() {
        }

        public C11901j0 invoke() {
            C10277a aVar = C10277a.this;
            return C11821a1.m38904a((C10349h) aVar, aVar.mo33771n0());
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.a$b */
    /* compiled from: AbstractClassDescriptor */
    class C10279b implements C9102a<C10096h> {
        C10279b() {
        }

        public C10096h invoke() {
            return new C10094f(C10277a.this.mo33771n0());
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.a$c */
    /* compiled from: AbstractClassDescriptor */
    class C10280c implements C9102a<C10358l0> {
        C10280c() {
        }

        public C10358l0 invoke() {
            return new C10326q(C10277a.this);
        }
    }

    public C10277a(C11817i iVar, C9939f fVar) {
        if (iVar == null) {
            m34340a(0);
            throw null;
        } else if (fVar != null) {
            this.f27955f = fVar;
            this.f27956g = iVar.mo38401a(new C10278a());
            this.f27957h = iVar.mo38401a(new C10279b());
            this.f27958i = iVar.mo38401a(new C10280c());
        } else {
            m34340a(1);
            throw null;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m34340a(int i) {
        String str = (i == 2 || i == 3 || i == 4 || i == 5 || i == 7 || i == 9 || i == 11 || i == 12) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 2 || i == 3 || i == 4 || i == 5 || i == 7 || i == 9 || i == 11 || i == 12) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 9:
            case 11:
            case 12:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 6:
                objArr[0] = "typeArguments";
                break;
            case 8:
                objArr[0] = "typeSubstitution";
                break;
            case 10:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i == 7 || i == 9) {
            objArr[1] = "getMemberScope";
        } else if (i == 11) {
            objArr[1] = "substitute";
        } else if (i != 12) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 9:
            case 11:
            case 12:
                break;
            case 6:
            case 8:
                objArr[2] = "getMemberScope";
                break;
            case 10:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 2 || i == 3 || i == 4 || i == 5 || i == 7 || i == 9 || i == 11 || i == 12) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: a */
    public C10342e mo35404a() {
        return this;
    }

    public C9939f getName() {
        C9939f fVar = this.f27955f;
        if (fVar != null) {
            return fVar;
        }
        m34340a(2);
        throw null;
    }

    /* renamed from: k0 */
    public C10096h mo33928k0() {
        C10096h hVar = (C10096h) this.f27957h.invoke();
        if (hVar != null) {
            return hVar;
        }
        m34340a(4);
        throw null;
    }

    /* renamed from: o */
    public C11901j0 mo35445o() {
        C11901j0 j0Var = (C11901j0) this.f27956g.invoke();
        if (j0Var != null) {
            return j0Var;
        }
        m34340a(12);
        throw null;
    }

    /* renamed from: t0 */
    public C10358l0 mo35452t0() {
        C10358l0 l0Var = (C10358l0) this.f27958i.invoke();
        if (l0Var != null) {
            return l0Var;
        }
        m34340a(5);
        throw null;
    }

    /* renamed from: a */
    public C10096h mo35451a(C11972x0 x0Var) {
        if (x0Var == null) {
            m34340a(8);
            throw null;
        } else if (x0Var.mo34004d()) {
            C10096h n0 = mo33771n0();
            if (n0 != null) {
                return n0;
            }
            m34340a(9);
            throw null;
        } else {
            return new C10105l(mo33771n0(), C11978z0.m39663a(x0Var));
        }
    }

    /* renamed from: a */
    public C10342e m34347a(C11978z0 z0Var) {
        if (z0Var == null) {
            m34340a(10);
            throw null;
        } else if (z0Var.mo38622b()) {
            return this;
        } else {
            return new C10330s(this, z0Var);
        }
    }

    /* renamed from: a */
    public <R, D> R mo35440a(C10364o<R, D> oVar, D d) {
        return oVar.mo35122a((C10342e) this, d);
    }
}
