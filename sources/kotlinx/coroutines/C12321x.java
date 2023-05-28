package kotlinx.coroutines;

import kotlin.p042a0.C9065e;
import kotlin.p042a0.C9069g;
import kotlinx.coroutines.p396j2.C12263c;

/* renamed from: kotlinx.coroutines.x */
/* compiled from: CoroutineContext.kt */
public final class C12321x {

    /* renamed from: a */
    private static final boolean f32141a;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r0.equals("on") != false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r0.equals("") != false) goto L_0x0033;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.scheduler"
            java.lang.String r0 = kotlinx.coroutines.p393g2.C12231p.m40323a(r0)
            if (r0 != 0) goto L_0x0009
            goto L_0x0033
        L_0x0009:
            int r1 = r0.hashCode()
            if (r1 == 0) goto L_0x002b
            r2 = 3551(0xddf, float:4.976E-42)
            if (r1 == r2) goto L_0x0022
            r2 = 109935(0x1ad6f, float:1.54052E-40)
            if (r1 != r2) goto L_0x0037
            java.lang.String r1 = "off"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0037
            r0 = 0
            goto L_0x0034
        L_0x0022:
            java.lang.String r1 = "on"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0037
            goto L_0x0033
        L_0x002b:
            java.lang.String r1 = ""
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0037
        L_0x0033:
            r0 = 1
        L_0x0034:
            f32141a = r0
            return
        L_0x0037:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "System property 'kotlinx.coroutines.scheduler' has unrecognized value '"
            r1.append(r2)
            r1.append(r0)
            r0 = 39
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C12321x.<clinit>():void");
    }

    /* renamed from: a */
    public static final C12324y m40654a() {
        return f32141a ? C12263c.f32063m : C12292p.f32107i;
    }

    /* renamed from: a */
    public static final C9069g m40653a(C12191d0 d0Var, C9069g gVar) {
        C9069g plus = d0Var.mo38810a().plus(gVar);
        C9069g plus2 = C12248i0.m40398c() ? plus.plus(new C12179b0(C12248i0.m40397b().incrementAndGet())) : plus;
        return (plus == C12310t0.m40640a() || plus.get(C9065e.f25651b) != null) ? plus2 : plus2.plus(C12310t0.m40640a());
    }

    /* renamed from: a */
    public static final String m40652a(C9069g gVar) {
        C12179b0 b0Var;
        String str;
        if (!C12248i0.m40398c() || (b0Var = (C12179b0) gVar.get(C12179b0.f31948g)) == null) {
            return null;
        }
        C12184c0 c0Var = (C12184c0) gVar.get(C12184c0.f31954g);
        if (c0Var == null || (str = c0Var.mo38842m()) == null) {
            str = "coroutine";
        }
        return str + '#' + b0Var.mo38837m();
    }
}
