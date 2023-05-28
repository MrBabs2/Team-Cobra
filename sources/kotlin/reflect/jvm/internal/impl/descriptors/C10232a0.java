package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p253o.C10071a;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10096h;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11811c;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11817i;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11838f1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11900j;
import kotlin.p215c0.p216c.C9113l;
import kotlin.p220g0.C9146c;
import kotlin.p262y.C10507e0;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;
import kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10298g;
import kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10303h0;
import kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10314m;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.a0 */
/* compiled from: NotFoundClasses.kt */
public final class C10232a0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C11811c<C9934b, C10240b0> f27871a;

    /* renamed from: b */
    private final C11811c<C10233a, C10342e> f27872b = this.f27873c.mo38399a(new C10235c(this));
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C11817i f27873c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C10393y f27874d;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.a0$a */
    /* compiled from: NotFoundClasses.kt */
    private static final class C10233a {

        /* renamed from: a */
        private final C9933a f27875a;

        /* renamed from: b */
        private final List<Integer> f27876b;

        public C10233a(C9933a aVar, List<Integer> list) {
            C10202j.m34178b(aVar, "classId");
            C10202j.m34178b(list, "typeParametersCount");
            this.f27875a = aVar;
            this.f27876b = list;
        }

        /* renamed from: a */
        public final C9933a mo35411a() {
            return this.f27875a;
        }

        /* renamed from: b */
        public final List<Integer> mo35412b() {
            return this.f27876b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10233a)) {
                return false;
            }
            C10233a aVar = (C10233a) obj;
            return C10202j.m34176a((Object) this.f27875a, (Object) aVar.f27875a) && C10202j.m34176a((Object) this.f27876b, (Object) aVar.f27876b);
        }

        public int hashCode() {
            C9933a aVar = this.f27875a;
            int i = 0;
            int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
            List<Integer> list = this.f27876b;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "ClassRequest(classId=" + this.f27875a + ", typeParametersCount=" + this.f27876b + ")";
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.a0$b */
    /* compiled from: NotFoundClasses.kt */
    public static final class C10234b extends C10298g {

        /* renamed from: m */
        private final List<C10375s0> f27877m;

        /* renamed from: n */
        private final C11900j f27878n;

        /* renamed from: o */
        private final boolean f27879o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10234b(C11817i iVar, C10359m mVar, C9939f fVar, boolean z, int i) {
            super(iVar, mVar, fVar, C10362n0.f28175a, false);
            C10202j.m34178b(iVar, "storageManager");
            C10202j.m34178b(mVar, "container");
            C10202j.m34178b(fVar, "name");
            this.f27879o = z;
            C9146c d = C9150f.m29854d(0, i);
            ArrayList arrayList = new ArrayList(C10531p.m35750a(d, 10));
            Iterator it = d.iterator();
            while (it.hasNext()) {
                int a = ((C10507e0) it).mo33492a();
                C10249g a2 = C10249g.f27910c.mo35429a();
                C11838f1 f1Var = C11838f1.INVARIANT;
                StringBuilder sb = new StringBuilder();
                sb.append('T');
                sb.append(a);
                arrayList.add(C10303h0.m34536a(this, a2, false, f1Var, C9939f.m33302b(sb.toString()), a));
            }
            this.f27877m = arrayList;
            this.f27878n = new C11900j(this, arrayList, C10528n0.m35731a(C10071a.m33897e(this).mo35561l().mo33707c()), iVar);
        }

        /* renamed from: E */
        public Collection<C10342e> mo33757E() {
            return C10529o.m35736a();
        }

        /* renamed from: F */
        public boolean mo33758F() {
            return false;
        }

        /* renamed from: L */
        public C10273d mo33759L() {
            return null;
        }

        /* renamed from: O */
        public C10342e mo33761O() {
            return null;
        }

        /* renamed from: g */
        public C10345f mo33763g() {
            return C10345f.CLASS;
        }

        public C10249g getAnnotations() {
            return C10249g.f27910c.mo35429a();
        }

        public C10237a1 getVisibility() {
            C10237a1 a1Var = C10397z0.f28192e;
            C10202j.m34174a((Object) a1Var, "Visibilities.PUBLIC");
            return a1Var;
        }

        /* renamed from: i */
        public C10388w mo33767i() {
            return C10388w.FINAL;
        }

        public boolean isInline() {
            return false;
        }

        /* renamed from: j */
        public Collection<C10273d> mo33769j() {
            return C10530o0.m35747a();
        }

        /* renamed from: k */
        public boolean mo33770k() {
            return this.f27879o;
        }

        /* renamed from: o0 */
        public boolean mo33772o0() {
            return false;
        }

        /* renamed from: r0 */
        public boolean mo33775r0() {
            return false;
        }

        /* renamed from: s */
        public List<C10375s0> mo33776s() {
            return this.f27877m;
        }

        public String toString() {
            return "class " + getName() + " (not found)";
        }

        /* renamed from: u */
        public boolean mo33778u() {
            return false;
        }

        /* renamed from: v */
        public boolean mo33779v() {
            return false;
        }

        /* renamed from: M */
        public C10096h.C10099b m34238M() {
            return C10096h.C10099b.f27722b;
        }

        /* renamed from: h */
        public C11900j m34242h() {
            return this.f27878n;
        }

        /* renamed from: n0 */
        public C10096h.C10099b m34247n0() {
            return C10096h.C10099b.f27722b;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.a0$c */
    /* compiled from: NotFoundClasses.kt */
    static final class C10235c extends C10203k implements C9113l<C10233a, C10234b> {

        /* renamed from: f */
        final /* synthetic */ C10232a0 f27880f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10235c(C10232a0 a0Var) {
            super(1);
            this.f27880f = a0Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0029, code lost:
            if (r1 != null) goto L_0x0041;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final kotlin.reflect.jvm.internal.impl.descriptors.C10232a0.C10234b invoke(kotlin.reflect.jvm.internal.impl.descriptors.C10232a0.C10233a r9) {
            /*
                r8 = this;
                java.lang.String r0 = "<name for destructuring parameter 0>"
                kotlin.jvm.internal.C10202j.m34178b(r9, r0)
                kotlin.h0.u.e.k0.e.a r0 = r9.mo35411a()
                java.util.List r9 = r9.mo35412b()
                boolean r1 = r0.mo34990g()
                if (r1 != 0) goto L_0x006c
                kotlin.h0.u.e.k0.e.a r1 = r0.mo34985c()
                if (r1 == 0) goto L_0x002c
                kotlin.reflect.jvm.internal.impl.descriptors.a0 r2 = r8.f27880f
                java.lang.String r3 = "outerClassId"
                kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r1, (java.lang.String) r3)
                r3 = 1
                java.util.List r3 = kotlin.p262y.C10539w.m35780b(r9, (int) r3)
                kotlin.reflect.jvm.internal.impl.descriptors.e r1 = r2.mo35410a(r1, r3)
                if (r1 == 0) goto L_0x002c
                goto L_0x0041
            L_0x002c:
                kotlin.reflect.jvm.internal.impl.descriptors.a0 r1 = r8.f27880f
                kotlin.h0.u.e.k0.j.c r1 = r1.f27871a
                kotlin.h0.u.e.k0.e.b r2 = r0.mo34986d()
                java.lang.String r3 = "classId.packageFqName"
                kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r2, (java.lang.String) r3)
                java.lang.Object r1 = r1.invoke(r2)
                kotlin.reflect.jvm.internal.impl.descriptors.g r1 = (kotlin.reflect.jvm.internal.impl.descriptors.C10347g) r1
            L_0x0041:
                r4 = r1
                boolean r6 = r0.mo34991h()
                kotlin.reflect.jvm.internal.impl.descriptors.a0$b r1 = new kotlin.reflect.jvm.internal.impl.descriptors.a0$b
                kotlin.reflect.jvm.internal.impl.descriptors.a0 r2 = r8.f27880f
                kotlin.h0.u.e.k0.j.i r3 = r2.f27873c
                kotlin.h0.u.e.k0.e.f r5 = r0.mo34989f()
                java.lang.String r0 = "classId.shortClassName"
                kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r5, (java.lang.String) r0)
                java.lang.Object r9 = kotlin.p262y.C10539w.m35803f(r9)
                java.lang.Integer r9 = (java.lang.Integer) r9
                if (r9 == 0) goto L_0x0065
                int r9 = r9.intValue()
                r7 = r9
                goto L_0x0067
            L_0x0065:
                r9 = 0
                r7 = 0
            L_0x0067:
                r2 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                return r1
            L_0x006c:
                java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unresolved local class: "
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.C10232a0.C10235c.invoke(kotlin.reflect.jvm.internal.impl.descriptors.a0$a):kotlin.reflect.jvm.internal.impl.descriptors.a0$b");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.a0$d */
    /* compiled from: NotFoundClasses.kt */
    static final class C10236d extends C10203k implements C9113l<C9934b, C10314m> {

        /* renamed from: f */
        final /* synthetic */ C10232a0 f27881f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10236d(C10232a0 a0Var) {
            super(1);
            this.f27881f = a0Var;
        }

        /* renamed from: a */
        public final C10314m invoke(C9934b bVar) {
            C10202j.m34178b(bVar, "fqName");
            return new C10314m(this.f27881f.f27874d, bVar);
        }
    }

    public C10232a0(C11817i iVar, C10393y yVar) {
        C10202j.m34178b(iVar, "storageManager");
        C10202j.m34178b(yVar, "module");
        this.f27873c = iVar;
        this.f27874d = yVar;
        this.f27871a = iVar.mo38399a(new C10236d(this));
    }

    /* renamed from: a */
    public final C10342e mo35410a(C9933a aVar, List<Integer> list) {
        C10202j.m34178b(aVar, "classId");
        C10202j.m34178b(list, "typeParametersCount");
        return this.f27872b.invoke(new C10233a(aVar, list));
    }
}
