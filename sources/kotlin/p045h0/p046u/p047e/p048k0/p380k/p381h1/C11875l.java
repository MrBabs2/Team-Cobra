package kotlin.p045h0.p046u.p047e.p048k0.p380k.p381h1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11827c0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11828c1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11834e1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11835f;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11839g;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11966v;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11908g;

/* renamed from: kotlin.h0.u.e.k0.k.h1.l */
/* compiled from: NewKotlinTypeChecker.kt */
public final class C11875l implements C11868g {

    /* renamed from: b */
    public static final C11875l f31589b = new C11875l();

    private C11875l() {
    }

    /* renamed from: a */
    public boolean mo38535a(C11824b0 b0Var, C11824b0 b0Var2) {
        C10202j.m34178b(b0Var, "a");
        C10202j.m34178b(b0Var2, "b");
        return mo38543a(new C11859a(false, false, 2, (DefaultConstructorMarker) null), b0Var.mo38439x0(), b0Var2.mo38439x0());
    }

    /* renamed from: b */
    public boolean mo38536b(C11824b0 b0Var, C11824b0 b0Var2) {
        C10202j.m34178b(b0Var, "subtype");
        C10202j.m34178b(b0Var2, "supertype");
        return mo38544b(new C11859a(true, false, 2, (DefaultConstructorMarker) null), b0Var.mo38439x0(), b0Var2.mo38439x0());
    }

    /* renamed from: a */
    public final boolean mo38543a(C11859a aVar, C11834e1 e1Var, C11834e1 e1Var2) {
        C10202j.m34178b(aVar, "$this$equalTypes");
        C10202j.m34178b(e1Var, "a");
        C10202j.m34178b(e1Var2, "b");
        return C11835f.f31539b.mo38451a((C11839g) aVar, (C11908g) e1Var, (C11908g) e1Var2);
    }

    /* renamed from: b */
    public final boolean mo38544b(C11859a aVar, C11834e1 e1Var, C11834e1 e1Var2) {
        C10202j.m34178b(aVar, "$this$isSubtypeOf");
        C10202j.m34178b(e1Var, "subType");
        C10202j.m34178b(e1Var2, "superType");
        return C11835f.f31539b.mo38453b((C11839g) aVar, (C11908g) e1Var, (C11908g) e1Var2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        r1 = r1.getType();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0 mo38542a(kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0 r12) {
        /*
            r11 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.C10202j.m34178b(r12, r0)
            kotlin.h0.u.e.k0.k.s0 r0 = r12.mo35227v0()
            boolean r1 = r0 instanceof kotlin.p045h0.p046u.p047e.p048k0.p248h.p249l.p250a.C10025c
            r2 = 1
            r3 = 10
            r4 = 0
            r5 = 0
            if (r1 == 0) goto L_0x0087
            kotlin.h0.u.e.k0.h.l.a.c r0 = (kotlin.p045h0.p046u.p047e.p048k0.p248h.p249l.p250a.C10025c) r0
            kotlin.h0.u.e.k0.k.u0 r1 = r0.mo35228d()
            kotlin.h0.u.e.k0.k.f1 r6 = r1.mo38596a()
            kotlin.h0.u.e.k0.k.f1 r7 = kotlin.p045h0.p046u.p047e.p048k0.p380k.C11838f1.IN_VARIANCE
            if (r6 != r7) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r2 = 0
        L_0x0022:
            if (r2 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r1 = r4
        L_0x0026:
            if (r1 == 0) goto L_0x0034
            kotlin.h0.u.e.k0.k.b0 r1 = r1.getType()
            if (r1 == 0) goto L_0x0034
            kotlin.h0.u.e.k0.k.e1 r1 = r1.mo38439x0()
            r8 = r1
            goto L_0x0035
        L_0x0034:
            r8 = r4
        L_0x0035:
            kotlin.h0.u.e.k0.k.h1.j r1 = r0.mo35231e()
            if (r1 != 0) goto L_0x006c
            kotlin.h0.u.e.k0.k.u0 r1 = r0.mo35228d()
            java.util.Collection r2 = r0.mo35229a()
            java.util.ArrayList r5 = new java.util.ArrayList
            int r3 = kotlin.p262y.C10531p.m35750a(r2, (int) r3)
            r5.<init>(r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x0050:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0064
            java.lang.Object r3 = r2.next()
            kotlin.h0.u.e.k0.k.b0 r3 = (kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r3
            kotlin.h0.u.e.k0.k.e1 r3 = r3.mo38439x0()
            r5.add(r3)
            goto L_0x0050
        L_0x0064:
            kotlin.h0.u.e.k0.k.h1.j r2 = new kotlin.h0.u.e.k0.k.h1.j
            r2.<init>(r1, r5)
            r0.mo35230a(r2)
        L_0x006c:
            kotlin.h0.u.e.k0.k.h1.i r1 = new kotlin.h0.u.e.k0.k.h1.i
            kotlin.h0.u.e.k0.k.j1.b r6 = kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11903b.FOR_SUBTYPING
            kotlin.h0.u.e.k0.k.h1.j r7 = r0.mo35231e()
            if (r7 == 0) goto L_0x0083
            kotlin.reflect.jvm.internal.impl.descriptors.b1.g r9 = r12.getAnnotations()
            boolean r10 = r12.mo34094w0()
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            return r1
        L_0x0083:
            kotlin.jvm.internal.C10202j.m34172a()
            throw r4
        L_0x0087:
            boolean r1 = r0 instanceof kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10055q
            if (r1 == 0) goto L_0x00cc
            kotlin.h0.u.e.k0.h.m.q r0 = (kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10055q) r0
            java.util.Collection r0 = r0.mo35229a()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = kotlin.p262y.C10531p.m35750a(r0, (int) r3)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x009e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00b6
            java.lang.Object r2 = r0.next()
            kotlin.h0.u.e.k0.k.b0 r2 = (kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r2
            boolean r3 = r12.mo34094w0()
            kotlin.h0.u.e.k0.k.b0 r2 = kotlin.p045h0.p046u.p047e.p048k0.p380k.C11821a1.m38903a((kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r2, (boolean) r3)
            r1.add(r2)
            goto L_0x009e
        L_0x00b6:
            kotlin.h0.u.e.k0.k.a0 r0 = new kotlin.h0.u.e.k0.k.a0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.b1.g r1 = r12.getAnnotations()
            java.util.List r2 = kotlin.p262y.C10529o.m35736a()
            kotlin.h0.u.e.k0.h.q.h r12 = r12.mo34008m()
            kotlin.h0.u.e.k0.k.j0 r12 = kotlin.p045h0.p046u.p047e.p048k0.p380k.C11827c0.m38949a(r1, r0, r2, r5, r12)
            return r12
        L_0x00cc:
            boolean r1 = r0 instanceof kotlin.p045h0.p046u.p047e.p048k0.p380k.C11819a0
            if (r1 == 0) goto L_0x011a
            boolean r1 = r12.mo34094w0()
            if (r1 == 0) goto L_0x011a
            kotlin.h0.u.e.k0.k.a0 r0 = (kotlin.p045h0.p046u.p047e.p048k0.p380k.C11819a0) r0
            java.util.Collection r1 = r0.mo35229a()
            java.util.ArrayList r6 = new java.util.ArrayList
            int r3 = kotlin.p262y.C10531p.m35750a(r1, (int) r3)
            r6.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
            r3 = 0
        L_0x00ea:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x00ff
            java.lang.Object r3 = r1.next()
            kotlin.h0.u.e.k0.k.b0 r3 = (kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r3
            kotlin.h0.u.e.k0.k.b0 r3 = kotlin.p045h0.p046u.p047e.p048k0.p380k.p384k1.C11924a.m39421e(r3)
            r6.add(r3)
            r3 = 1
            goto L_0x00ea
        L_0x00ff:
            if (r3 != 0) goto L_0x0102
            goto L_0x0107
        L_0x0102:
            kotlin.h0.u.e.k0.k.a0 r4 = new kotlin.h0.u.e.k0.k.a0
            r4.<init>(r6)
        L_0x0107:
            if (r4 == 0) goto L_0x010a
            r0 = r4
        L_0x010a:
            kotlin.reflect.jvm.internal.impl.descriptors.b1.g r12 = r12.getAnnotations()
            java.util.List r1 = kotlin.p262y.C10529o.m35736a()
            kotlin.h0.u.e.k0.h.q.h r2 = r0.mo38429e()
            kotlin.h0.u.e.k0.k.j0 r12 = kotlin.p045h0.p046u.p047e.p048k0.p380k.C11827c0.m38949a(r12, r0, r1, r5, r2)
        L_0x011a:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p048k0.p380k.p381h1.C11875l.mo38542a(kotlin.h0.u.e.k0.k.j0):kotlin.h0.u.e.k0.k.j0");
    }

    /* renamed from: a */
    public final C11834e1 mo38541a(C11834e1 e1Var) {
        C11834e1 e1Var2;
        C10202j.m34178b(e1Var, "type");
        if (e1Var instanceof C11901j0) {
            e1Var2 = mo38542a((C11901j0) e1Var);
        } else if (e1Var instanceof C11966v) {
            C11966v vVar = (C11966v) e1Var;
            C11901j0 a = mo38542a(vVar.mo38609z0());
            C11901j0 a2 = mo38542a(vVar.mo38607A0());
            if (a == vVar.mo38609z0() && a2 == vVar.mo38607A0()) {
                e1Var2 = e1Var;
            } else {
                e1Var2 = C11827c0.m38946a(a, a2);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return C11828c1.m38952a(e1Var2, e1Var);
    }
}
