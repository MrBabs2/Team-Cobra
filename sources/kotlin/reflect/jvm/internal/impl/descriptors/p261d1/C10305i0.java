package kotlin.reflect.jvm.internal.impl.descriptors.p261d1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C9134f;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.jvm.internal.C10211s;
import kotlin.jvm.internal.C10212t;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9168l;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11978z0;
import kotlin.p215c0.p216c.C9102a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10230a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10237a1;
import kotlin.reflect.jvm.internal.impl.descriptors.C10238b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10364o;
import kotlin.reflect.jvm.internal.impl.descriptors.C10386v0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10392x0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10397z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.i0 */
/* compiled from: ValueParameterDescriptorImpl.kt */
public class C10305i0 extends C10310j0 implements C10386v0 {

    /* renamed from: q */
    public static final C10306a f28011q = new C10306a((DefaultConstructorMarker) null);

    /* renamed from: k */
    private final C10386v0 f28012k;

    /* renamed from: l */
    private final int f28013l;

    /* renamed from: m */
    private final boolean f28014m;

    /* renamed from: n */
    private final boolean f28015n;

    /* renamed from: o */
    private final boolean f28016o;

    /* renamed from: p */
    private final C11824b0 f28017p;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.i0$a */
    /* compiled from: ValueParameterDescriptorImpl.kt */
    public static final class C10306a {
        private C10306a() {
        }

        /* renamed from: a */
        public final C10305i0 mo35490a(C10230a aVar, C10386v0 v0Var, int i, C10249g gVar, C9939f fVar, C11824b0 b0Var, boolean z, boolean z2, boolean z3, C11824b0 b0Var2, C10362n0 n0Var, C9102a<? extends List<? extends C10392x0>> aVar2) {
            C10230a aVar3 = aVar;
            C10202j.m34178b(aVar, "containingDeclaration");
            C10202j.m34178b(gVar, "annotations");
            C10202j.m34178b(fVar, "name");
            C10202j.m34178b(b0Var, "outType");
            C10202j.m34178b(n0Var, "source");
            if (aVar2 == null) {
                return new C10305i0(aVar, v0Var, i, gVar, fVar, b0Var, z, z2, z3, b0Var2, n0Var);
            }
            return new C10307b(aVar, v0Var, i, gVar, fVar, b0Var, z, z2, z3, b0Var2, n0Var, aVar2);
        }

        public /* synthetic */ C10306a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.i0$b */
    /* compiled from: ValueParameterDescriptorImpl.kt */
    public static final class C10307b extends C10305i0 {

        /* renamed from: s */
        static final /* synthetic */ C9168l[] f28018s = {C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a(C10307b.class), "destructuringVariables", "getDestructuringVariables()Ljava/util/List;"))};

        /* renamed from: r */
        private final C9134f f28019r;

        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.i0$b$a */
        /* compiled from: ValueParameterDescriptorImpl.kt */
        static final class C10308a extends C10203k implements C9102a<List<? extends C10392x0>> {

            /* renamed from: f */
            final /* synthetic */ C10307b f28020f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10308a(C10307b bVar) {
                super(0);
                this.f28020f = bVar;
            }

            public final List<C10392x0> invoke() {
                return this.f28020f.mo35491r();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10307b(C10230a aVar, C10386v0 v0Var, int i, C10249g gVar, C9939f fVar, C11824b0 b0Var, boolean z, boolean z2, boolean z3, C11824b0 b0Var2, C10362n0 n0Var, C9102a<? extends List<? extends C10392x0>> aVar2) {
            super(aVar, v0Var, i, gVar, fVar, b0Var, z, z2, z3, b0Var2, n0Var);
            C10202j.m34178b(aVar, "containingDeclaration");
            C10202j.m34178b(gVar, "annotations");
            C10202j.m34178b(fVar, "name");
            C10202j.m34178b(b0Var, "outType");
            C10202j.m34178b(n0Var, "source");
            C10202j.m34178b(aVar2, "destructuringVariables");
            this.f28019r = C10181i.m34134a(aVar2);
        }

        /* renamed from: a */
        public C10386v0 mo35485a(C10230a aVar, C9939f fVar, int i) {
            C10230a aVar2 = aVar;
            C10202j.m34178b(aVar2, "newOwner");
            C9939f fVar2 = fVar;
            C10202j.m34178b(fVar2, "newName");
            C10249g annotations = getAnnotations();
            C10202j.m34174a((Object) annotations, "annotations");
            C11824b0 type = getType();
            C10202j.m34174a((Object) type, "type");
            boolean h0 = mo35489h0();
            boolean V = mo35483V();
            boolean S = mo35482S();
            C11824b0 a0 = mo35486a0();
            C10362n0 n0Var = C10362n0.f28175a;
            C10202j.m34174a((Object) n0Var, "SourceElement.NO_SOURCE");
            return new C10307b(aVar2, (C10386v0) null, i, annotations, fVar2, type, h0, V, S, a0, n0Var, new C10308a(this));
        }

        /* renamed from: r */
        public final List<C10392x0> mo35491r() {
            C9134f fVar = this.f28019r;
            C9168l lVar = f28018s[0];
            return (List) fVar.getValue();
        }
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.v0] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C10305i0(kotlin.reflect.jvm.internal.impl.descriptors.C10230a r8, kotlin.reflect.jvm.internal.impl.descriptors.C10386v0 r9, int r10, kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g r11, kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f r12, kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0 r13, boolean r14, boolean r15, boolean r16, kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0 r17, kotlin.reflect.jvm.internal.impl.descriptors.C10362n0 r18) {
        /*
            r7 = this;
            r6 = r7
            java.lang.String r0 = "containingDeclaration"
            r1 = r8
            kotlin.jvm.internal.C10202j.m34178b(r8, r0)
            java.lang.String r0 = "annotations"
            r2 = r11
            kotlin.jvm.internal.C10202j.m34178b(r11, r0)
            java.lang.String r0 = "name"
            r3 = r12
            kotlin.jvm.internal.C10202j.m34178b(r12, r0)
            java.lang.String r0 = "outType"
            r4 = r13
            kotlin.jvm.internal.C10202j.m34178b(r13, r0)
            java.lang.String r0 = "source"
            r5 = r18
            kotlin.jvm.internal.C10202j.m34178b(r5, r0)
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = r10
            r6.f28013l = r0
            r0 = r14
            r6.f28014m = r0
            r0 = r15
            r6.f28015n = r0
            r0 = r16
            r6.f28016o = r0
            r0 = r17
            r6.f28017p = r0
            if (r9 == 0) goto L_0x0039
            r0 = r9
            goto L_0x003a
        L_0x0039:
            r0 = r6
        L_0x003a:
            r6.f28012k = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10305i0.<init>(kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.v0, int, kotlin.reflect.jvm.internal.impl.descriptors.b1.g, kotlin.h0.u.e.k0.e.f, kotlin.h0.u.e.k0.k.b0, boolean, boolean, boolean, kotlin.h0.u.e.k0.k.b0, kotlin.reflect.jvm.internal.impl.descriptors.n0):void");
    }

    /* renamed from: a */
    public static final C10305i0 m34546a(C10230a aVar, C10386v0 v0Var, int i, C10249g gVar, C9939f fVar, C11824b0 b0Var, boolean z, boolean z2, boolean z3, C11824b0 b0Var2, C10362n0 n0Var, C9102a<? extends List<? extends C10392x0>> aVar2) {
        return f28011q.mo35490a(aVar, v0Var, i, gVar, fVar, b0Var, z, z2, z3, b0Var2, n0Var, aVar2);
    }

    /* renamed from: R */
    public Void mo35481R() {
        return null;
    }

    /* renamed from: S */
    public boolean mo35482S() {
        return this.f28016o;
    }

    /* renamed from: V */
    public boolean mo35483V() {
        return this.f28015n;
    }

    /* renamed from: Z */
    public boolean mo35484Z() {
        return false;
    }

    /* renamed from: a0 */
    public C11824b0 mo35486a0() {
        return this.f28017p;
    }

    /* renamed from: d */
    public Collection<C10386v0> mo35406d() {
        Collection<? extends C10230a> d = m34562b().mo35406d();
        C10202j.m34174a((Object) d, "containingDeclaration.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(C10531p.m35750a(d, 10));
        for (C10230a aVar : d) {
            C10202j.m34174a((Object) aVar, "it");
            arrayList.add(aVar.mo35407f().get(mo35487e()));
        }
        return arrayList;
    }

    /* renamed from: e */
    public int mo35487e() {
        return this.f28013l;
    }

    /* renamed from: g0 */
    public boolean mo35488g0() {
        return C10386v0.C10387a.m35072a(this);
    }

    public C10237a1 getVisibility() {
        C10237a1 a1Var = C10397z0.f28193f;
        C10202j.m34174a((Object) a1Var, "Visibilities.LOCAL");
        return a1Var;
    }

    /* renamed from: h0 */
    public boolean mo35489h0() {
        if (this.f28014m) {
            C10230a b = m34562b();
            if (b != null) {
                C10238b.C10239a g = ((C10238b) b).mo35423g();
                C10202j.m34174a((Object) g, "(containingDeclaration a…bleMemberDescriptor).kind");
                if (g.mo35424a()) {
                    return true;
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor");
            }
        }
        return false;
    }

    /* renamed from: b */
    public C10230a m34562b() {
        C10359m b = super.mo33762b();
        if (b != null) {
            return (C10230a) b;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
    }

    /* renamed from: a */
    public C10386v0 m34557a() {
        C10386v0 v0Var = this.f28012k;
        return v0Var == this ? this : v0Var.mo35404a();
    }

    /* renamed from: a */
    public C10386v0 m34558a(C11978z0 z0Var) {
        C10202j.m34178b(z0Var, "substitutor");
        if (z0Var.mo38622b()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public <R, D> R mo35440a(C10364o<R, D> oVar, D d) {
        C10202j.m34178b(oVar, "visitor");
        return oVar.mo35128a((C10386v0) this, d);
    }

    /* renamed from: a */
    public C10386v0 mo35485a(C10230a aVar, C9939f fVar, int i) {
        C10202j.m34178b(aVar, "newOwner");
        C10202j.m34178b(fVar, "newName");
        C10249g annotations = getAnnotations();
        C10202j.m34174a((Object) annotations, "annotations");
        C11824b0 type = getType();
        C10202j.m34174a((Object) type, "type");
        boolean h0 = mo35489h0();
        boolean V = mo35483V();
        boolean S = mo35482S();
        C11824b0 a0 = mo35486a0();
        C10362n0 n0Var = C10362n0.f28175a;
        C10202j.m34174a((Object) n0Var, "SourceElement.NO_SOURCE");
        return new C10305i0(aVar, (C10386v0) null, i, annotations, fVar, type, h0, V, S, a0, n0Var);
    }
}
