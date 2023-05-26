package kotlin.reflect.jvm.internal.impl.descriptors.p261d1;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p253o.C10071a;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10095g;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10096h;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10107m;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11814f;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11817i;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11827c0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11838f1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11849h;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11953s0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11958u;
import kotlin.p215c0.p216c.C9102a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10364o;
import kotlin.reflect.jvm.internal.impl.descriptors.C10370q0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.e */
/* compiled from: AbstractTypeParameterDescriptor */
public abstract class C10290e extends C10311k implements C10375s0 {

    /* renamed from: j */
    private final C11838f1 f27974j;

    /* renamed from: k */
    private final boolean f27975k;

    /* renamed from: l */
    private final int f27976l;

    /* renamed from: m */
    private final C11814f<C11953s0> f27977m;

    /* renamed from: n */
    private final C11814f<C11901j0> f27978n;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.e$a */
    /* compiled from: AbstractTypeParameterDescriptor */
    class C10291a implements C9102a<C11953s0> {

        /* renamed from: f */
        final /* synthetic */ C11817i f27979f;

        /* renamed from: g */
        final /* synthetic */ C10370q0 f27980g;

        C10291a(C11817i iVar, C10370q0 q0Var) {
            this.f27979f = iVar;
            this.f27980g = q0Var;
        }

        public C11953s0 invoke() {
            return new C10294c(C10290e.this, this.f27979f, this.f27980g);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.e$b */
    /* compiled from: AbstractTypeParameterDescriptor */
    class C10292b implements C9102a<C11901j0> {

        /* renamed from: f */
        final /* synthetic */ C11817i f27982f;

        /* renamed from: g */
        final /* synthetic */ C9939f f27983g;

        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.e$b$a */
        /* compiled from: AbstractTypeParameterDescriptor */
        class C10293a implements C9102a<C10096h> {
            C10293a() {
            }

            public C10096h invoke() {
                return C10107m.m34030a("Scope for type parameter " + C10292b.this.f27983g.mo35021a(), (Collection<? extends C11824b0>) C10290e.this.getUpperBounds());
            }
        }

        C10292b(C11817i iVar, C9939f fVar) {
            this.f27982f = iVar;
            this.f27983g = fVar;
        }

        public C11901j0 invoke() {
            return C11827c0.m38949a(C10249g.f27910c.mo35429a(), C10290e.this.mo33766h(), Collections.emptyList(), false, new C10095g(this.f27982f.mo38401a(new C10293a())));
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.e$c */
    /* compiled from: AbstractTypeParameterDescriptor */
    private class C10294c extends C11849h {

        /* renamed from: b */
        private final C10370q0 f27986b;

        /* renamed from: c */
        final /* synthetic */ C10290e f27987c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10294c(C10290e eVar, C11817i iVar, C10370q0 q0Var) {
            super(iVar);
            if (iVar != null) {
                this.f27987c = eVar;
                this.f27986b = q0Var;
                return;
            }
            m34446a(0);
            throw null;
        }

        /* renamed from: a */
        private static /* synthetic */ void m34446a(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 1 || i == 2 || i == 3 || i == 4 || i == 5) ? 2 : 3)];
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i == 2) {
                objArr[1] = "getParameters";
            } else if (i == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i != 5) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "getSupertypeLoopChecker";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            throw ((i == 1 || i == 2 || i == 3 || i == 4 || i == 5) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        /* renamed from: b */
        public C10349h mo33781b() {
            C10290e eVar = this.f27987c;
            if (eVar != null) {
                return eVar;
            }
            m34446a(3);
            throw null;
        }

        /* renamed from: c */
        public boolean mo33782c() {
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public Collection<C11824b0> mo33783e() {
            List<C11824b0> r = this.f27987c.mo33989r();
            if (r != null) {
                return r;
            }
            m34446a(1);
            throw null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public C11824b0 mo35467f() {
            return C11958u.m39559c("Cyclic upper bounds");
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public C10370q0 mo33784g() {
            C10370q0 q0Var = this.f27986b;
            if (q0Var != null) {
                return q0Var;
            }
            m34446a(5);
            throw null;
        }

        public List<C10375s0> getParameters() {
            List<C10375s0> emptyList = Collections.emptyList();
            if (emptyList != null) {
                return emptyList;
            }
            m34446a(2);
            throw null;
        }

        /* renamed from: l */
        public C9333g mo35232l() {
            C9333g b = C10071a.m33892b((C10359m) this.f27987c);
            if (b != null) {
                return b;
            }
            m34446a(4);
            throw null;
        }

        public String toString() {
            return this.f27987c.getName().toString();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo35466b(C11824b0 b0Var) {
            if (b0Var != null) {
                this.f27987c.mo33988a(b0Var);
            } else {
                m34446a(6);
                throw null;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C10290e(C11817i iVar, C10359m mVar, C10249g gVar, C9939f fVar, C11838f1 f1Var, boolean z, int i, C10362n0 n0Var, C10370q0 q0Var) {
        super(mVar, gVar, fVar, n0Var);
        if (iVar == null) {
            m34432a(0);
            throw null;
        } else if (mVar == null) {
            m34432a(1);
            throw null;
        } else if (gVar == null) {
            m34432a(2);
            throw null;
        } else if (fVar == null) {
            m34432a(3);
            throw null;
        } else if (f1Var == null) {
            m34432a(4);
            throw null;
        } else if (n0Var == null) {
            m34432a(5);
            throw null;
        } else if (q0Var != null) {
            this.f27974j = f1Var;
            this.f27975k = z;
            this.f27976l = i;
            this.f27977m = iVar.mo38401a(new C10291a(iVar, q0Var));
            this.f27978n = iVar.mo38401a(new C10292b(iVar, fVar));
        } else {
            m34432a(6);
            throw null;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m34432a(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: G */
    public C11838f1 mo35439G() {
        C11838f1 f1Var = this.f27974j;
        if (f1Var != null) {
            return f1Var;
        }
        m34432a(7);
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo33988a(C11824b0 b0Var);

    /* renamed from: d0 */
    public boolean mo35441d0() {
        return false;
    }

    /* renamed from: e */
    public int mo35442e() {
        return this.f27976l;
    }

    public List<C11824b0> getUpperBounds() {
        List<C11824b0> a = ((C10294c) mo33766h()).mo35229a();
        if (a != null) {
            return a;
        }
        m34432a(8);
        throw null;
    }

    /* renamed from: h */
    public final C11953s0 mo33766h() {
        C11953s0 s0Var = (C11953s0) this.f27977m.invoke();
        if (s0Var != null) {
            return s0Var;
        }
        m34432a(9);
        throw null;
    }

    /* renamed from: o */
    public C11901j0 mo35445o() {
        C11901j0 j0Var = (C11901j0) this.f27978n.invoke();
        if (j0Var != null) {
            return j0Var;
        }
        m34432a(10);
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract List<C11824b0> mo33989r();

    /* renamed from: z */
    public boolean mo35447z() {
        return this.f27975k;
    }

    /* renamed from: a */
    public C10375s0 m34438a() {
        C10375s0 s0Var = (C10375s0) super.mo35404a();
        if (s0Var != null) {
            return s0Var;
        }
        m34432a(11);
        throw null;
    }

    /* renamed from: a */
    public <R, D> R mo35440a(C10364o<R, D> oVar, D d) {
        return oVar.mo35127a((C10375s0) this, d);
    }
}
