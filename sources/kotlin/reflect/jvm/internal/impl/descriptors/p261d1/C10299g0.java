package kotlin.reflect.jvm.internal.impl.descriptors.p261d1;

import java.util.List;
import kotlin.C10485x;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.jvm.internal.C10211s;
import kotlin.jvm.internal.C10212t;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C9997b;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11817i;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11838f1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11938m0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11975y;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11978z0;
import kotlin.p215c0.p216c.C9102a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10230a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10237a1;
import kotlin.reflect.jvm.internal.impl.descriptors.C10238b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10273d;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10358l0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10373r0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10382u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10386v0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10388w;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.g0 */
/* compiled from: TypeAliasConstructorDescriptor.kt */
public final class C10299g0 extends C10322p implements C10297f0 {

    /* renamed from: L */
    public static final C10300a f27995L = new C10300a((DefaultConstructorMarker) null);

    /* renamed from: I */
    private C10273d f27996I;

    /* renamed from: J */
    private final C11817i f27997J;

    /* renamed from: K */
    private final C10373r0 f27998K;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.g0$a */
    /* compiled from: TypeAliasConstructorDescriptor.kt */
    public static final class C10300a {
        private C10300a() {
        }

        public /* synthetic */ C10300a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final C11978z0 m34513a(C10373r0 r0Var) {
            if (r0Var.mo35608n() == null) {
                return null;
            }
            return C11978z0.m39662a((C11824b0) r0Var.mo35606Q());
        }

        /* renamed from: a */
        public final C10297f0 mo35476a(C11817i iVar, C10373r0 r0Var, C10273d dVar) {
            C10273d a;
            C10373r0 r0Var2 = r0Var;
            C10273d dVar2 = dVar;
            C10202j.m34178b(iVar, "storageManager");
            C10202j.m34178b(r0Var2, "typeAliasDescriptor");
            C10202j.m34178b(dVar2, "constructor");
            C11978z0 a2 = m34513a(r0Var2);
            C10358l0 l0Var = null;
            if (!(a2 == null || (a = dVar2.mo35448a(a2)) == null)) {
                C10249g annotations = dVar.getAnnotations();
                C10238b.C10239a g = dVar.mo35423g();
                C10202j.m34174a((Object) g, "constructor.kind");
                C10362n0 p = r0Var.mo33773p();
                C10202j.m34174a((Object) p, "typeAliasDescriptor.source");
                C10299g0 g0Var = new C10299g0(iVar, r0Var, a, (C10297f0) null, annotations, g, p, (DefaultConstructorMarker) null);
                List<C10386v0> a3 = C10322p.m34641a(g0Var, dVar.mo35407f(), a2);
                if (a3 != null) {
                    C10202j.m34174a((Object) a3, "FunctionDescriptorImpl.g…         ) ?: return null");
                    C11901j0 c = C11975y.m39645c(a.getReturnType().mo38439x0());
                    C11901j0 o = r0Var.mo35445o();
                    C10202j.m34174a((Object) o, "typeAliasDescriptor.defaultType");
                    C11901j0 a4 = C11938m0.m39471a(c, o);
                    C10358l0 X = dVar.mo35403X();
                    if (X != null) {
                        C10202j.m34174a((Object) X, "it");
                        l0Var = C9997b.m33649a((C10230a) g0Var, a2.mo38617a(X.getType(), C11838f1.INVARIANT), C10249g.f27910c.mo35429a());
                    }
                    g0Var.mo35464a(l0Var, (C10358l0) null, r0Var.mo33776s(), a3, a4, C10388w.FINAL, r0Var.getVisibility());
                    return g0Var;
                }
            }
            return null;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.g0$b */
    /* compiled from: TypeAliasConstructorDescriptor.kt */
    static final class C10301b extends C10203k implements C9102a<C10299g0> {

        /* renamed from: f */
        final /* synthetic */ C10299g0 f27999f;

        /* renamed from: g */
        final /* synthetic */ C10273d f28000g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10301b(C10299g0 g0Var, C10273d dVar) {
            super(0);
            this.f27999f = g0Var;
            this.f28000g = dVar;
        }

        public final C10299g0 invoke() {
            C11817i r = this.f27999f.mo34228r();
            C10373r0 B = this.f27999f.mo35475B();
            C10273d dVar = this.f28000g;
            C10299g0 g0Var = this.f27999f;
            C10249g annotations = dVar.getAnnotations();
            C10238b.C10239a g = this.f28000g.mo35423g();
            C10202j.m34174a((Object) g, "underlyingConstructorDescriptor.kind");
            C10362n0 p = this.f27999f.mo35475B().mo33773p();
            C10202j.m34174a((Object) p, "typeAliasDescriptor.source");
            C10299g0 g0Var2 = new C10299g0(r, B, dVar, g0Var, annotations, g, p, (DefaultConstructorMarker) null);
            C11978z0 a = C10299g0.f27995L.m34513a(this.f27999f.mo35475B());
            if (a == null) {
                return null;
            }
            C10358l0 X = this.f28000g.mo35403X();
            g0Var2.mo35464a((C10358l0) null, X != null ? X.mo35448a(a) : null, this.f27999f.mo35475B().mo33776s(), this.f27999f.mo35407f(), this.f27999f.getReturnType(), C10388w.FINAL, this.f27999f.mo35475B().getVisibility());
            return g0Var2;
        }
    }

    static {
        C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a(C10299g0.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"));
    }

    public /* synthetic */ C10299g0(C11817i iVar, C10373r0 r0Var, C10273d dVar, C10297f0 f0Var, C10249g gVar, C10238b.C10239a aVar, C10362n0 n0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar, r0Var, dVar, f0Var, gVar, aVar, n0Var);
    }

    /* renamed from: B */
    public C10373r0 mo35475B() {
        return this.f27998K;
    }

    /* renamed from: e0 */
    public C10273d mo35474e0() {
        return this.f27996I;
    }

    public C11824b0 getReturnType() {
        C11824b0 returnType = super.getReturnType();
        if (returnType != null) {
            return returnType;
        }
        C10202j.m34172a();
        throw null;
    }

    /* renamed from: r */
    public final C11817i mo34228r() {
        return this.f27997J;
    }

    /* renamed from: w */
    public boolean mo35472w() {
        return mo35474e0().mo35472w();
    }

    /* renamed from: x */
    public C10342e mo35473x() {
        C10342e x = mo35474e0().mo35473x();
        C10202j.m34174a((Object) x, "underlyingConstructorDescriptor.constructedClass");
        return x;
    }

    private C10299g0(C11817i iVar, C10373r0 r0Var, C10273d dVar, C10297f0 f0Var, C10249g gVar, C10238b.C10239a aVar, C10362n0 n0Var) {
        super(r0Var, f0Var, gVar, C9939f.m33304d("<init>"), aVar, n0Var);
        this.f27997J = iVar;
        this.f27998K = r0Var;
        mo35504a(mo35475B().mo33772o0());
        this.f27997J.mo38408c(new C10301b(this, dVar));
        this.f27996I = dVar;
    }

    /* renamed from: b */
    public C10373r0 m34507b() {
        return mo35475B();
    }

    /* renamed from: a */
    public C10297f0 m34493a() {
        C10382u a = super.m34665a();
        if (a != null) {
            return (C10297f0) a;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
    }

    /* renamed from: a */
    public C10297f0 m34503a(C11978z0 z0Var) {
        C10202j.m34178b(z0Var, "substitutor");
        C10382u a = super.mo35448a(z0Var);
        if (a != null) {
            C10299g0 g0Var = (C10299g0) a;
            C11978z0 a2 = C11978z0.m39662a(g0Var.getReturnType());
            C10202j.m34174a((Object) a2, "TypeSubstitutor.create(s…asConstructor.returnType)");
            C10273d a3 = mo35474e0().mo35404a().mo35448a(a2);
            if (a3 == null) {
                return null;
            }
            g0Var.f27996I = a3;
            return g0Var;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
    }

    /* renamed from: a */
    public C10297f0 m34495a(C10359m mVar, C10388w wVar, C10237a1 a1Var, C10238b.C10239a aVar, boolean z) {
        C10202j.m34178b(mVar, "newOwner");
        C10202j.m34178b(wVar, "modality");
        C10202j.m34178b(a1Var, "visibility");
        C10202j.m34178b(aVar, "kind");
        Object a = mo35465q().mo35526a(mVar).mo35527a(wVar).mo35521a(a1Var).mo35522a(aVar).mo35528a(z).mo35529a();
        if (a != null) {
            return (C10297f0) a;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C10299g0 m34497a(C10359m mVar, C10382u uVar, C10238b.C10239a aVar, C9939f fVar, C10249g gVar, C10362n0 n0Var) {
        C10202j.m34178b(mVar, "newOwner");
        C10202j.m34178b(aVar, "kind");
        C10202j.m34178b(gVar, "annotations");
        C10202j.m34178b(n0Var, "source");
        boolean z = false;
        boolean z2 = aVar == C10238b.C10239a.DECLARATION || aVar == C10238b.C10239a.SYNTHESIZED;
        if (!C10485x.f28360a || z2) {
            if (fVar == null) {
                z = true;
            }
            if (!C10485x.f28360a || z) {
                return new C10299g0(this.f27997J, mo35475B(), mo35474e0(), this, gVar, C10238b.C10239a.DECLARATION, n0Var);
            }
            throw new AssertionError("Renaming type alias constructor: " + this);
        }
        throw new AssertionError("Creating a type alias constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + mVar + "\nkind: " + aVar);
    }
}
