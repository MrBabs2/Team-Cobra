package kotlin.reflect.jvm.internal.impl.descriptors.p261d1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p253o.C10071a;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10096h;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11817i;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11821a1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11830d0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11834e1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11953s0;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10237a1;
import kotlin.reflect.jvm.internal.impl.descriptors.C10273d;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10364o;
import kotlin.reflect.jvm.internal.impl.descriptors.C10367p;
import kotlin.reflect.jvm.internal.impl.descriptors.C10373r0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10388w;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;
import kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10299g0;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.d */
/* compiled from: AbstractTypeAliasDescriptor.kt */
public abstract class C10286d extends C10311k implements C10373r0 {

    /* renamed from: j */
    private List<? extends C10375s0> f27969j;

    /* renamed from: k */
    private final C10288b f27970k = new C10288b(this);

    /* renamed from: l */
    private final C10237a1 f27971l;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.d$a */
    /* compiled from: AbstractTypeAliasDescriptor.kt */
    static final class C10287a extends C10203k implements C9113l<C11834e1, Boolean> {

        /* renamed from: f */
        final /* synthetic */ C10286d f27972f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10287a(C10286d dVar) {
            super(1);
            this.f27972f = dVar;
        }

        /* renamed from: a */
        public final boolean mo35462a(C11834e1 e1Var) {
            C10202j.m34174a((Object) e1Var, "type");
            if (C11830d0.m38958a(e1Var)) {
                return false;
            }
            C10349h b = e1Var.mo35227v0().mo33781b();
            if ((b instanceof C10375s0) && (C10202j.m34176a((Object) ((C10375s0) b).mo33762b(), (Object) this.f27972f) ^ true)) {
                return true;
            }
            return false;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(mo35462a((C11834e1) obj));
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.d$b */
    /* compiled from: AbstractTypeAliasDescriptor.kt */
    public static final class C10288b implements C11953s0 {

        /* renamed from: a */
        final /* synthetic */ C10286d f27973a;

        C10288b(C10286d dVar) {
            this.f27973a = dVar;
        }

        /* renamed from: a */
        public Collection<C11824b0> mo35229a() {
            Collection<C11824b0> a = mo33781b().mo35607Y().mo35227v0().mo35229a();
            C10202j.m34174a((Object) a, "declarationDescriptor.un…pe.constructor.supertypes");
            return a;
        }

        /* renamed from: c */
        public boolean mo33782c() {
            return true;
        }

        public List<C10375s0> getParameters() {
            return this.f27973a.mo35459K();
        }

        /* renamed from: l */
        public C9333g mo35232l() {
            return C10071a.m33892b((C10359m) mo33781b());
        }

        public String toString() {
            return "[typealias " + mo33781b().getName().mo35021a() + ']';
        }

        /* renamed from: b */
        public C10373r0 m34413b() {
            return this.f27973a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10286d(C10359m mVar, C10249g gVar, C9939f fVar, C10362n0 n0Var, C10237a1 a1Var) {
        super(mVar, gVar, fVar, n0Var);
        C10202j.m34178b(mVar, "containingDeclaration");
        C10202j.m34178b(gVar, "annotations");
        C10202j.m34178b(fVar, "name");
        C10202j.m34178b(n0Var, "sourceElement");
        C10202j.m34178b(a1Var, "visibilityImpl");
        this.f27971l = a1Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public abstract C11817i mo35457B();

    /* renamed from: C */
    public final Collection<C10297f0> mo35458C() {
        C10342e n = mo35608n();
        if (n == null) {
            return C10529o.m35736a();
        }
        Collection<C10273d> j = n.mo33769j();
        C10202j.m34174a((Object) j, "classDescriptor.constructors");
        ArrayList arrayList = new ArrayList();
        for (C10273d dVar : j) {
            C10299g0.C10300a aVar = C10299g0.f27995L;
            C11817i B = mo35457B();
            C10202j.m34174a((Object) dVar, "it");
            C10297f0 a = aVar.mo35476a(B, this, dVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* renamed from: F */
    public boolean mo33758F() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public abstract List<C10375s0> mo35459K();

    public C10237a1 getVisibility() {
        return this.f27971l;
    }

    /* renamed from: h */
    public C11953s0 mo33766h() {
        return this.f27970k;
    }

    /* renamed from: i */
    public C10388w mo33767i() {
        return C10388w.FINAL;
    }

    /* renamed from: k */
    public boolean mo33770k() {
        return C11821a1.m38908a((C11824b0) mo35607Y(), (C9113l<C11834e1, Boolean>) new C10287a(this));
    }

    /* renamed from: o0 */
    public boolean mo33772o0() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final C11901j0 mo35461r() {
        C10096h hVar;
        C10342e n = mo35608n();
        if (n == null || (hVar = n.mo33771n0()) == null) {
            hVar = C10096h.C10099b.f27722b;
        }
        C11901j0 a = C11821a1.m38904a((C10349h) this, hVar);
        C10202j.m34174a((Object) a, "TypeUtils.makeUnsubstitu…ope ?: MemberScope.Empty)");
        return a;
    }

    /* renamed from: s */
    public List<C10375s0> mo33776s() {
        List<? extends C10375s0> list = this.f27969j;
        if (list != null) {
            return list;
        }
        C10202j.m34181d("declaredTypeParametersImpl");
        throw null;
    }

    public String toString() {
        return "typealias " + getName().mo35021a();
    }

    /* renamed from: u */
    public boolean mo33778u() {
        return false;
    }

    /* renamed from: a */
    public final void mo35460a(List<? extends C10375s0> list) {
        C10202j.m34178b(list, "declaredTypeParameters");
        this.f27969j = list;
    }

    /* renamed from: a */
    public <R, D> R mo35440a(C10364o<R, D> oVar, D d) {
        C10202j.m34178b(oVar, "visitor");
        return oVar.mo35126a((C10373r0) this, d);
    }

    /* renamed from: a */
    public C10373r0 m34401a() {
        C10367p a = super.mo35404a();
        if (a != null) {
            return (C10373r0) a;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor");
    }
}
