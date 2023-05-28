package kotlin.p045h0.p046u.p047e.p048k0.p223a.p224n;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C10483v;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9345j;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C9999c;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10096h;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11817i;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11823b;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11827c0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11838f1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11953s0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11965u0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11970w0;
import kotlin.p215c0.p216c.C9117p;
import kotlin.p220g0.C9146c;
import kotlin.p262y.C10507e0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10237a1;
import kotlin.reflect.jvm.internal.impl.descriptors.C10240b0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10273d;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10345f;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10370q0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10376t;
import kotlin.reflect.jvm.internal.impl.descriptors.C10388w;
import kotlin.reflect.jvm.internal.impl.descriptors.C10393y;
import kotlin.reflect.jvm.internal.impl.descriptors.C10397z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;
import kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10277a;
import kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10303h0;

/* renamed from: kotlin.h0.u.e.k0.a.n.b */
/* compiled from: FunctionClassDescriptor.kt */
public final class C9352b extends C10277a {
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final C9933a f26025q = new C9933a(C9333g.f25902f, C9939f.m33302b("Function"));
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static final C9933a f26026r = new C9933a(C9345j.m30271a(), C9939f.m33302b("KFunction"));

    /* renamed from: j */
    private final C9355c f26027j = new C9355c();

    /* renamed from: k */
    private final C9360e f26028k = new C9360e(this.f26030m, this);
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final List<C10375s0> f26029l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C11817i f26030m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C10240b0 f26031n;

    /* renamed from: o */
    private final C9356d f26032o;

    /* renamed from: p */
    private final int f26033p;

    /* renamed from: kotlin.h0.u.e.k0.a.n.b$a */
    /* compiled from: FunctionClassDescriptor.kt */
    static final class C9353a extends C10203k implements C9117p<C11838f1, String, C10483v> {

        /* renamed from: f */
        final /* synthetic */ C9352b f26034f;

        /* renamed from: g */
        final /* synthetic */ ArrayList f26035g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9353a(C9352b bVar, ArrayList arrayList) {
            super(2);
            this.f26034f = bVar;
            this.f26035g = arrayList;
        }

        /* renamed from: a */
        public final void mo33780a(C11838f1 f1Var, String str) {
            C10202j.m34178b(f1Var, "variance");
            C10202j.m34178b(str, "name");
            this.f26035g.add(C10303h0.m34536a(this.f26034f, C10249g.f27910c.mo35429a(), false, f1Var, C9939f.m33302b(str), this.f26035g.size()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo33780a((C11838f1) obj, (String) obj2);
            return C10483v.f28357a;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.a.n.b$b */
    /* compiled from: FunctionClassDescriptor.kt */
    public static final class C9354b {
        private C9354b() {
        }

        public /* synthetic */ C9354b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.a.n.b$d */
    /* compiled from: FunctionClassDescriptor.kt */
    public enum C9356d {
        Function(r2, "Function"),
        SuspendFunction(r2, "SuspendFunction"),
        KFunction(C9345j.m30271a(), "KFunction"),
        KSuspendFunction(C9345j.m30271a(), "KSuspendFunction");
        

        /* renamed from: m */
        public static final C9357a f26042m = null;

        /* renamed from: f */
        private final C9934b f26043f;

        /* renamed from: g */
        private final String f26044g;

        /* renamed from: kotlin.h0.u.e.k0.a.n.b$d$a */
        /* compiled from: FunctionClassDescriptor.kt */
        public static final class C9357a {
            private C9357a() {
            }

            /* renamed from: a */
            public final C9356d mo33790a(C9934b bVar, String str) {
                C10202j.m34178b(bVar, "packageFqName");
                C10202j.m34178b(str, "className");
                for (C9356d dVar : C9356d.values()) {
                    if (C10202j.m34176a((Object) dVar.mo33789d(), (Object) bVar) && C12130v.m40056c(str, dVar.mo33787a(), false, 2, (Object) null)) {
                        return dVar;
                    }
                }
                return null;
            }

            public /* synthetic */ C9357a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            f26042m = new C9357a((DefaultConstructorMarker) null);
        }

        private C9356d(C9934b bVar, String str) {
            this.f26043f = bVar;
            this.f26044g = str;
        }

        /* renamed from: a */
        public final String mo33787a() {
            return this.f26044g;
        }

        /* renamed from: d */
        public final C9934b mo33789d() {
            return this.f26043f;
        }

        /* renamed from: a */
        public final C9939f mo33788a(int i) {
            C9939f b = C9939f.m33302b(this.f26044g + i);
            C10202j.m34174a((Object) b, "Name.identifier(\"$classNamePrefix$arity\")");
            return b;
        }
    }

    static {
        new C9354b((DefaultConstructorMarker) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9352b(C11817i iVar, C10240b0 b0Var, C9356d dVar, int i) {
        super(iVar, dVar.mo33788a(i));
        C10202j.m34178b(iVar, "storageManager");
        C10202j.m34178b(b0Var, "containingDeclaration");
        C10202j.m34178b(dVar, "functionKind");
        this.f26030m = iVar;
        this.f26031n = b0Var;
        this.f26032o = dVar;
        this.f26033p = i;
        ArrayList arrayList = new ArrayList();
        C9353a aVar = new C9353a(this, arrayList);
        C9146c cVar = new C9146c(1, this.f26033p);
        ArrayList arrayList2 = new ArrayList(C10531p.m35750a(cVar, 10));
        Iterator it = cVar.iterator();
        while (it.hasNext()) {
            int a = ((C10507e0) it).mo33492a();
            C11838f1 f1Var = C11838f1.IN_VARIANCE;
            StringBuilder sb = new StringBuilder();
            sb.append('P');
            sb.append(a);
            aVar.mo33780a(f1Var, sb.toString());
            arrayList2.add(C10483v.f28357a);
        }
        aVar.mo33780a(C11838f1.OUT_VARIANCE, "R");
        this.f26029l = C10539w.m35815n(arrayList);
    }

    /* renamed from: B */
    public final C9356d mo33756B() {
        return this.f26032o;
    }

    /* renamed from: F */
    public boolean mo33758F() {
        return false;
    }

    /* renamed from: L */
    public Void mo33759L() {
        return null;
    }

    /* renamed from: O */
    public Void mo33761O() {
        return null;
    }

    /* renamed from: g */
    public C10345f mo33763g() {
        return C10345f.INTERFACE;
    }

    public C10249g getAnnotations() {
        return C10249g.f27910c.mo35429a();
    }

    public C10237a1 getVisibility() {
        C10237a1 a1Var = C10397z0.f28192e;
        C10202j.m34174a((Object) a1Var, "Visibilities.PUBLIC");
        return a1Var;
    }

    /* renamed from: h */
    public C11953s0 mo33766h() {
        return this.f26027j;
    }

    /* renamed from: i */
    public C10388w mo33767i() {
        return C10388w.ABSTRACT;
    }

    public boolean isInline() {
        return false;
    }

    /* renamed from: k */
    public boolean mo33770k() {
        return false;
    }

    /* renamed from: o0 */
    public boolean mo33772o0() {
        return false;
    }

    /* renamed from: p */
    public C10362n0 mo33773p() {
        C10362n0 n0Var = C10362n0.f28175a;
        C10202j.m34174a((Object) n0Var, "SourceElement.NO_SOURCE");
        return n0Var;
    }

    /* renamed from: r */
    public final int mo33774r() {
        return this.f26033p;
    }

    /* renamed from: r0 */
    public boolean mo33775r0() {
        return false;
    }

    /* renamed from: s */
    public List<C10375s0> mo33776s() {
        return this.f26029l;
    }

    public String toString() {
        String a = getName().mo35021a();
        C10202j.m34174a((Object) a, "name.asString()");
        return a;
    }

    /* renamed from: u */
    public boolean mo33778u() {
        return false;
    }

    /* renamed from: v */
    public boolean mo33779v() {
        return false;
    }

    /* renamed from: kotlin.h0.u.e.k0.a.n.b$c */
    /* compiled from: FunctionClassDescriptor.kt */
    private final class C9355c extends C11823b {
        public C9355c() {
            super(C9352b.this.f26030m);
        }

        /* renamed from: c */
        public boolean mo33782c() {
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public Collection<C11824b0> mo33783e() {
            List<C9933a> list;
            int i = C9358c.f26045a[C9352b.this.mo33756B().ordinal()];
            if (i == 1) {
                list = C10527n.m35729a(C9352b.f26025q);
            } else if (i == 2) {
                list = C10529o.m35741b((T[]) new C9933a[]{C9352b.f26026r, new C9933a(C9333g.f25902f, C9356d.Function.mo33788a(C9352b.this.mo33774r()))});
            } else if (i == 3) {
                list = C10527n.m35729a(C9352b.f26025q);
            } else if (i == 4) {
                list = C10529o.m35741b((T[]) new C9933a[]{C9352b.f26026r, new C9933a(C9999c.f27579c, C9356d.SuspendFunction.mo33788a(C9352b.this.mo33774r()))});
            } else {
                throw new NoWhenBranchMatchedException();
            }
            C10393y b = C9352b.this.f26031n.mo33762b();
            ArrayList arrayList = new ArrayList(C10531p.m35750a(list, 10));
            for (C9933a aVar : list) {
                C10342e a = C10376t.m35016a(b, aVar);
                if (a != null) {
                    List<C10375s0> parameters = getParameters();
                    C11953s0 h = a.mo33766h();
                    C10202j.m34174a((Object) h, "descriptor.typeConstructor");
                    List<T> e = C10539w.m35801e(parameters, h.getParameters().size());
                    ArrayList arrayList2 = new ArrayList(C10531p.m35750a(e, 10));
                    for (T o : e) {
                        arrayList2.add(new C11970w0(o.mo35445o()));
                    }
                    arrayList.add(C11827c0.m38950a(C10249g.f27910c.mo35429a(), a, (List<? extends C11965u0>) arrayList2));
                } else {
                    throw new IllegalStateException(("Built-in class " + aVar + " not found").toString());
                }
            }
            return C10539w.m35815n(arrayList);
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public C10370q0 mo33784g() {
            return C10370q0.C10371a.f28177a;
        }

        public List<C10375s0> getParameters() {
            return C9352b.this.f26029l;
        }

        public String toString() {
            return m30326b().toString();
        }

        /* renamed from: b */
        public C9352b m30326b() {
            return C9352b.this;
        }
    }

    /* renamed from: E */
    public List<C10342e> m30298E() {
        return C10529o.m35736a();
    }

    /* renamed from: M */
    public C10096h.C10099b m30303M() {
        return C10096h.C10099b.f27722b;
    }

    /* renamed from: j */
    public List<C10273d> m30312j() {
        return C10529o.m35736a();
    }

    /* renamed from: n0 */
    public C9360e m30315n0() {
        return this.f26028k;
    }

    /* renamed from: b */
    public C10240b0 m30307b() {
        return this.f26031n;
    }
}
