package kotlin.p045h0.p046u.p047e.p048k0.p223a.p224n;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C10485x;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11838f1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11978z0;
import kotlin.p045h0.p046u.p047e.p048k0.p386l.C12006j;
import kotlin.p262y.C10494b0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10238b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10358l0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10382u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10386v0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10388w;
import kotlin.reflect.jvm.internal.impl.descriptors.C10397z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;
import kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10289d0;
import kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10305i0;
import kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10322p;

/* renamed from: kotlin.h0.u.e.k0.a.n.f */
/* compiled from: FunctionInvokeDescriptor.kt */
public final class C9361f extends C10289d0 {

    /* renamed from: I */
    public static final C9362a f26047I = new C9362a((DefaultConstructorMarker) null);

    /* renamed from: kotlin.h0.u.e.k0.a.n.f$a */
    /* compiled from: FunctionInvokeDescriptor.kt */
    public static final class C9362a {
        private C9362a() {
        }

        /* renamed from: a */
        public final C9361f mo33796a(C9352b bVar, boolean z) {
            C10202j.m34178b(bVar, "functionClass");
            List<C10375s0> s = bVar.mo33776s();
            C9361f fVar = new C9361f(bVar, (C9361f) null, C10238b.C10239a.DECLARATION, z, (DefaultConstructorMarker) null);
            C10358l0 t0 = bVar.mo35452t0();
            List a = C10529o.m35736a();
            ArrayList arrayList = new ArrayList();
            for (T next : s) {
                if (!(((C10375s0) next).mo35439G() == C11838f1.IN_VARIANCE)) {
                    break;
                }
                arrayList.add(next);
            }
            Iterable<C10494b0> r = C10539w.m35819r(arrayList);
            ArrayList arrayList2 = new ArrayList(C10531p.m35750a(r, 10));
            for (C10494b0 b0Var : r) {
                arrayList2.add(C9361f.f26047I.m30340a(fVar, b0Var.mo35960c(), (C10375s0) b0Var.mo35961d()));
            }
            fVar.m34423a((C10358l0) null, t0, (List<? extends C10375s0>) a, (List<C10386v0>) arrayList2, (C11824b0) ((C10375s0) C10539w.m35805g(s)).mo35445o(), C10388w.ABSTRACT, C10397z0.f28192e);
            fVar.mo34225e(true);
            return fVar;
        }

        public /* synthetic */ C9362a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final C10386v0 m30340a(C9361f fVar, int i, C10375s0 s0Var) {
            String str;
            String a = s0Var.getName().mo35021a();
            C10202j.m34174a((Object) a, "typeParameter.name.asString()");
            int hashCode = a.hashCode();
            if (hashCode != 69) {
                if (hashCode == 84 && a.equals("T")) {
                    str = "instance";
                    C10249g a2 = C10249g.f27910c.mo35429a();
                    C9939f b = C9939f.m33302b(str);
                    C10202j.m34174a((Object) b, "Name.identifier(name)");
                    C11901j0 o = s0Var.mo35445o();
                    C10202j.m34174a((Object) o, "typeParameter.defaultType");
                    C10362n0 n0Var = C10362n0.f28175a;
                    C10202j.m34174a((Object) n0Var, "SourceElement.NO_SOURCE");
                    return new C10305i0(fVar, (C10386v0) null, i, a2, b, o, false, false, false, (C11824b0) null, n0Var);
                }
            } else if (a.equals("E")) {
                str = "receiver";
                C10249g a22 = C10249g.f27910c.mo35429a();
                C9939f b2 = C9939f.m33302b(str);
                C10202j.m34174a((Object) b2, "Name.identifier(name)");
                C11901j0 o2 = s0Var.mo35445o();
                C10202j.m34174a((Object) o2, "typeParameter.defaultType");
                C10362n0 n0Var2 = C10362n0.f28175a;
                C10202j.m34174a((Object) n0Var2, "SourceElement.NO_SOURCE");
                return new C10305i0(fVar, (C10386v0) null, i, a22, b2, o2, false, false, false, (C11824b0) null, n0Var2);
            }
            if (a != null) {
                str = a.toLowerCase();
                C10202j.m34174a((Object) str, "(this as java.lang.String).toLowerCase()");
                C10249g a222 = C10249g.f27910c.mo35429a();
                C9939f b22 = C9939f.m33302b(str);
                C10202j.m34174a((Object) b22, "Name.identifier(name)");
                C11901j0 o22 = s0Var.mo35445o();
                C10202j.m34174a((Object) o22, "typeParameter.defaultType");
                C10362n0 n0Var22 = C10362n0.f28175a;
                C10202j.m34174a((Object) n0Var22, "SourceElement.NO_SOURCE");
                return new C10305i0(fVar, (C10386v0) null, i, a222, b22, o22, false, false, false, (C11824b0) null, n0Var22);
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
    }

    public /* synthetic */ C9361f(C10359m mVar, C9361f fVar, C10238b.C10239a aVar, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(mVar, fVar, aVar, z);
    }

    /* renamed from: I */
    public boolean mo33792I() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public kotlin.reflect.jvm.internal.impl.descriptors.C10382u mo33794a(kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10322p.C10325c r8) {
        /*
            r7 = this;
            java.lang.String r0 = "configuration"
            kotlin.jvm.internal.C10202j.m34178b(r8, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.u r8 = super.mo33794a((kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10322p.C10325c) r8)
            kotlin.h0.u.e.k0.a.n.f r8 = (kotlin.p045h0.p046u.p047e.p048k0.p223a.p224n.C9361f) r8
            if (r8 == 0) goto L_0x0089
            java.util.List r0 = r8.mo35407f()
            java.lang.String r1 = "substituted.valueParameters"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r0, (java.lang.String) r1)
            boolean r2 = r0 instanceof java.util.Collection
            r3 = 0
            java.lang.String r4 = "it.type"
            java.lang.String r5 = "it"
            r6 = 1
            if (r2 == 0) goto L_0x0028
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x0028
        L_0x0026:
            r3 = 1
            goto L_0x004d
        L_0x0028:
            java.util.Iterator r0 = r0.iterator()
        L_0x002c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0026
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.v0 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.C10386v0) r2
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r2, (java.lang.String) r5)
            kotlin.h0.u.e.k0.k.b0 r2 = r2.getType()
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r2, (java.lang.String) r4)
            kotlin.h0.u.e.k0.e.f r2 = kotlin.p045h0.p046u.p047e.p048k0.p223a.C9332f.m30151a((kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r2)
            if (r2 == 0) goto L_0x004a
            r2 = 1
            goto L_0x004b
        L_0x004a:
            r2 = 0
        L_0x004b:
            if (r2 == 0) goto L_0x002c
        L_0x004d:
            if (r3 == 0) goto L_0x0050
            return r8
        L_0x0050:
            java.util.List r0 = r8.mo35407f()
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r0, (java.lang.String) r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.p262y.C10531p.m35750a(r0, (int) r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x0066:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0084
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.v0 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.C10386v0) r2
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r2, (java.lang.String) r5)
            kotlin.h0.u.e.k0.k.b0 r2 = r2.getType()
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r2, (java.lang.String) r4)
            kotlin.h0.u.e.k0.e.f r2 = kotlin.p045h0.p046u.p047e.p048k0.p223a.C9332f.m30151a((kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r2)
            r1.add(r2)
            goto L_0x0066
        L_0x0084:
            kotlin.reflect.jvm.internal.impl.descriptors.u r8 = r8.m30335a((java.util.List<kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f>) r1)
            return r8
        L_0x0089:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p048k0.p223a.p224n.C9361f.mo33794a(kotlin.reflect.jvm.internal.impl.descriptors.d1.p$c):kotlin.reflect.jvm.internal.impl.descriptors.u");
    }

    public boolean isInline() {
        return false;
    }

    /* renamed from: u */
    public boolean mo33778u() {
        return false;
    }

    private C9361f(C10359m mVar, C9361f fVar, C10238b.C10239a aVar, boolean z) {
        super(mVar, fVar, C10249g.f27910c.mo35429a(), C12006j.f31730g, aVar, C10362n0.f28175a);
        mo35510h(true);
        mo35511i(z);
        mo34224d(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C10322p mo33793a(C10359m mVar, C10382u uVar, C10238b.C10239a aVar, C9939f fVar, C10249g gVar, C10362n0 n0Var) {
        C10202j.m34178b(mVar, "newOwner");
        C10202j.m34178b(aVar, "kind");
        C10202j.m34178b(gVar, "annotations");
        C10202j.m34178b(n0Var, "source");
        return new C9361f(mVar, (C9361f) uVar, aVar, isSuspend());
    }

    /* renamed from: a */
    private final C10382u m30335a(List<C9939f> list) {
        boolean z;
        C9939f fVar;
        int size = mo35407f().size() - list.size();
        boolean z2 = false;
        boolean z3 = size == 0 || size == 1;
        if (!C10485x.f28360a || z3) {
            List<C10386v0> f = mo35407f();
            C10202j.m34174a((Object) f, "valueParameters");
            ArrayList arrayList = new ArrayList(C10531p.m35750a(f, 10));
            for (C10386v0 v0Var : f) {
                C10202j.m34174a((Object) v0Var, "it");
                C9939f name = v0Var.getName();
                C10202j.m34174a((Object) name, "it.name");
                int e = v0Var.mo35487e();
                int i = e - size;
                if (i >= 0 && (fVar = list.get(i)) != null) {
                    name = fVar;
                }
                arrayList.add(v0Var.mo35485a(this, name, e));
            }
            C10322p.C10325c b = mo35505b(C11978z0.f31684b);
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C9939f) it.next()) == null) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            z2 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            b.mo35533b(z2);
            b.mo35517a((List<C10386v0>) arrayList);
            b.mo35524a((C10238b) m34429a());
            C10202j.m34174a((Object) b, "newCopyBuilder(TypeSubst…   .setOriginal(original)");
            C10382u a = super.mo33794a(b);
            if (a != null) {
                return a;
            }
            C10202j.m34172a();
            throw null;
        }
        throw new AssertionError("Assertion failed");
    }
}
