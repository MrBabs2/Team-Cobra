package kotlin.p045h0.p046u.p047e.p048k0.p380k.p381h1;

import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p045h0.p046u.p047e.p048k0.p247g.C9949c;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11953s0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p385l1.C11930c;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;

/* renamed from: kotlin.h0.u.e.k0.k.h1.u */
/* compiled from: utils.kt */
public final class C11894u {

    /* renamed from: kotlin.h0.u.e.k0.k.h1.u$a */
    /* compiled from: utils.kt */
    static final class C11895a extends C10203k implements C9113l<String, StringBuilder> {

        /* renamed from: f */
        final /* synthetic */ StringBuilder f31609f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11895a(StringBuilder sb) {
            super(1);
            this.f31609f = sb;
        }

        /* renamed from: a */
        public final StringBuilder invoke(String str) {
            C10202j.m34178b(str, "$this$unaryPlus");
            StringBuilder sb = this.f31609f;
            sb.append(str);
            C10202j.m34174a((Object) sb, "append(value)");
            StringBuilder unused = C12126r.m40031a(sb);
            return sb;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0 m39287a(kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0 r9, kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0 r10, kotlin.p045h0.p046u.p047e.p048k0.p380k.p381h1.C11884s r11) {
        /*
            java.lang.String r0 = "subtype"
            kotlin.jvm.internal.C10202j.m34178b(r9, r0)
            java.lang.String r0 = "supertype"
            kotlin.jvm.internal.C10202j.m34178b(r10, r0)
            java.lang.String r0 = "typeCheckingProcedureCallbacks"
            kotlin.jvm.internal.C10202j.m34178b(r11, r0)
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            kotlin.h0.u.e.k0.k.h1.p r1 = new kotlin.h0.u.e.k0.k.h1.p
            r2 = 0
            r1.<init>(r9, r2)
            r0.add(r1)
            kotlin.h0.u.e.k0.k.s0 r9 = r10.mo35227v0()
        L_0x0021:
            boolean r10 = r0.isEmpty()
            if (r10 != 0) goto L_0x012b
            java.lang.Object r10 = r0.poll()
            kotlin.h0.u.e.k0.k.h1.p r10 = (kotlin.p045h0.p046u.p047e.p048k0.p380k.p381h1.C11879p) r10
            kotlin.h0.u.e.k0.k.b0 r1 = r10.mo38549b()
            kotlin.h0.u.e.k0.k.s0 r3 = r1.mo35227v0()
            boolean r4 = r11.mo38537a((kotlin.p045h0.p046u.p047e.p048k0.p380k.C11953s0) r3, (kotlin.p045h0.p046u.p047e.p048k0.p380k.C11953s0) r9)
            if (r4 == 0) goto L_0x0109
            boolean r0 = r1.mo34094w0()
            kotlin.h0.u.e.k0.k.h1.p r10 = r10.mo38548a()
        L_0x0043:
            if (r10 == 0) goto L_0x00bd
            kotlin.h0.u.e.k0.k.b0 r3 = r10.mo38549b()
            java.util.List r4 = r3.mo35226u0()
            boolean r5 = r4 instanceof java.util.Collection
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x005b
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x005b
        L_0x0059:
            r4 = 0
            goto L_0x0079
        L_0x005b:
            java.util.Iterator r4 = r4.iterator()
        L_0x005f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0059
            java.lang.Object r5 = r4.next()
            kotlin.h0.u.e.k0.k.u0 r5 = (kotlin.p045h0.p046u.p047e.p048k0.p380k.C11965u0) r5
            kotlin.h0.u.e.k0.k.f1 r5 = r5.mo38596a()
            kotlin.h0.u.e.k0.k.f1 r8 = kotlin.p045h0.p046u.p047e.p048k0.p380k.C11838f1.INVARIANT
            if (r5 == r8) goto L_0x0075
            r5 = 1
            goto L_0x0076
        L_0x0075:
            r5 = 0
        L_0x0076:
            if (r5 == 0) goto L_0x005f
            r4 = 1
        L_0x0079:
            java.lang.String r5 = "TypeConstructorSubstitut…uted, Variance.INVARIANT)"
            if (r4 == 0) goto L_0x0099
            kotlin.h0.u.e.k0.k.t0$a r4 = kotlin.p045h0.p046u.p047e.p048k0.p380k.C11955t0.f31657b
            kotlin.h0.u.e.k0.k.x0 r4 = r4.mo38601a(r3)
            kotlin.h0.u.e.k0.k.x0 r4 = kotlin.p045h0.p046u.p047e.p048k0.p248h.p249l.p250a.C10026d.m33799a(r4, r7, r6, r2)
            kotlin.h0.u.e.k0.k.z0 r4 = r4.mo38613c()
            kotlin.h0.u.e.k0.k.f1 r8 = kotlin.p045h0.p046u.p047e.p048k0.p380k.C11838f1.INVARIANT
            kotlin.h0.u.e.k0.k.b0 r1 = r4.mo38617a((kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r1, (kotlin.p045h0.p046u.p047e.p048k0.p380k.C11838f1) r8)
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r1, (java.lang.String) r5)
            kotlin.h0.u.e.k0.k.b0 r1 = m39286a((kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r1)
            goto L_0x00ac
        L_0x0099:
            kotlin.h0.u.e.k0.k.t0$a r4 = kotlin.p045h0.p046u.p047e.p048k0.p380k.C11955t0.f31657b
            kotlin.h0.u.e.k0.k.x0 r4 = r4.mo38601a(r3)
            kotlin.h0.u.e.k0.k.z0 r4 = r4.mo38613c()
            kotlin.h0.u.e.k0.k.f1 r8 = kotlin.p045h0.p046u.p047e.p048k0.p380k.C11838f1.INVARIANT
            kotlin.h0.u.e.k0.k.b0 r1 = r4.mo38617a((kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r1, (kotlin.p045h0.p046u.p047e.p048k0.p380k.C11838f1) r8)
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r1, (java.lang.String) r5)
        L_0x00ac:
            if (r0 != 0) goto L_0x00b7
            boolean r0 = r3.mo34094w0()
            if (r0 == 0) goto L_0x00b5
            goto L_0x00b7
        L_0x00b5:
            r0 = 0
            goto L_0x00b8
        L_0x00b7:
            r0 = 1
        L_0x00b8:
            kotlin.h0.u.e.k0.k.h1.p r10 = r10.mo38548a()
            goto L_0x0043
        L_0x00bd:
            kotlin.h0.u.e.k0.k.s0 r10 = r1.mo35227v0()
            boolean r2 = r11.mo38537a((kotlin.p045h0.p046u.p047e.p048k0.p380k.C11953s0) r10, (kotlin.p045h0.p046u.p047e.p048k0.p380k.C11953s0) r9)
            if (r2 == 0) goto L_0x00cc
            kotlin.h0.u.e.k0.k.b0 r9 = kotlin.p045h0.p046u.p047e.p048k0.p380k.C11821a1.m38903a((kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r1, (boolean) r0)
            return r9
        L_0x00cc:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Type constructors should be equals!\n"
            r1.append(r2)
            java.lang.String r2 = "substitutedSuperType: "
            r1.append(r2)
            java.lang.String r2 = m39285a((kotlin.p045h0.p046u.p047e.p048k0.p380k.C11953s0) r10)
            r1.append(r2)
            java.lang.String r2 = ", \n\n"
            r1.append(r2)
            java.lang.String r2 = "supertype: "
            r1.append(r2)
            java.lang.String r2 = m39285a((kotlin.p045h0.p046u.p047e.p048k0.p380k.C11953s0) r9)
            r1.append(r2)
            java.lang.String r2 = " \n"
            r1.append(r2)
            boolean r9 = r11.mo38537a((kotlin.p045h0.p046u.p047e.p048k0.p380k.C11953s0) r10, (kotlin.p045h0.p046u.p047e.p048k0.p380k.C11953s0) r9)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
        L_0x0109:
            java.util.Collection r1 = r3.mo35229a()
            java.util.Iterator r1 = r1.iterator()
        L_0x0111:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0021
            java.lang.Object r3 = r1.next()
            kotlin.h0.u.e.k0.k.b0 r3 = (kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r3
            kotlin.h0.u.e.k0.k.h1.p r4 = new kotlin.h0.u.e.k0.k.h1.p
            java.lang.String r5 = "immediateSupertype"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r3, (java.lang.String) r5)
            r4.<init>(r3, r10)
            r0.add(r4)
            goto L_0x0111
        L_0x012b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p048k0.p380k.p381h1.C11894u.m39287a(kotlin.h0.u.e.k0.k.b0, kotlin.h0.u.e.k0.k.b0, kotlin.h0.u.e.k0.k.h1.s):kotlin.h0.u.e.k0.k.b0");
    }

    /* renamed from: a */
    private static final C11824b0 m39286a(C11824b0 b0Var) {
        return C11930c.m39447a(b0Var).mo38580d();
    }

    /* renamed from: a */
    private static final String m39285a(C11953s0 s0Var) {
        StringBuilder sb = new StringBuilder();
        C11895a aVar = new C11895a(sb);
        aVar.invoke("type: " + s0Var);
        aVar.invoke("hashCode: " + s0Var.hashCode());
        aVar.invoke("javaClass: " + s0Var.getClass().getCanonicalName());
        for (C10359m b = s0Var.mo33781b(); b != null; b = b.mo33762b()) {
            aVar.invoke("fqName: " + C9949c.f27453a.mo35037a(b));
            aVar.invoke("javaClass: " + b.getClass().getCanonicalName());
        }
        String sb2 = sb.toString();
        C10202j.m34174a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
