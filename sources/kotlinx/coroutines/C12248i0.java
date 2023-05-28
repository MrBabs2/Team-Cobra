package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: kotlinx.coroutines.i0 */
/* compiled from: Debug.kt */
public final class C12248i0 {

    /* renamed from: a */
    private static final boolean f32024a = C12179b0.class.desiredAssertionStatus();

    /* renamed from: b */
    private static final boolean f32025b;

    /* renamed from: c */
    private static final boolean f32026c;

    /* renamed from: d */
    private static final AtomicLong f32027d = new AtomicLong(0);

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        if (r0.equals("auto") != false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (r0.equals("on") != false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        if (r0.equals("") != false) goto L_0x004d;
     */
    static {
        /*
            java.lang.Class<kotlinx.coroutines.b0> r0 = kotlinx.coroutines.C12179b0.class
            boolean r0 = r0.desiredAssertionStatus()
            f32024a = r0
            java.lang.String r0 = "kotlinx.coroutines.debug"
            java.lang.String r0 = kotlinx.coroutines.p393g2.C12231p.m40323a(r0)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0013
            goto L_0x002f
        L_0x0013:
            int r3 = r0.hashCode()
            if (r3 == 0) goto L_0x0045
            r4 = 3551(0xddf, float:4.976E-42)
            if (r3 == r4) goto L_0x003c
            r4 = 109935(0x1ad6f, float:1.54052E-40)
            if (r3 == r4) goto L_0x0032
            r4 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r3 != r4) goto L_0x0067
            java.lang.String r3 = "auto"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0067
        L_0x002f:
            boolean r0 = f32024a
            goto L_0x004e
        L_0x0032:
            java.lang.String r3 = "off"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0067
            r0 = 0
            goto L_0x004e
        L_0x003c:
            java.lang.String r3 = "on"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0067
            goto L_0x004d
        L_0x0045:
            java.lang.String r3 = ""
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0067
        L_0x004d:
            r0 = 1
        L_0x004e:
            f32025b = r0
            if (r0 == 0) goto L_0x005b
            java.lang.String r0 = "kotlinx.coroutines.stacktrace.recovery"
            boolean r0 = kotlinx.coroutines.p393g2.C12231p.m40324a(r0, r2)
            if (r0 == 0) goto L_0x005b
            r1 = 1
        L_0x005b:
            f32026c = r1
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            f32027d = r0
            return
        L_0x0067:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "System property 'kotlinx.coroutines.debug' has unrecognized value '"
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
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C12248i0.<clinit>():void");
    }

    /* renamed from: a */
    public static final boolean m40396a() {
        return f32024a;
    }

    /* renamed from: b */
    public static final AtomicLong m40397b() {
        return f32027d;
    }

    /* renamed from: c */
    public static final boolean m40398c() {
        return f32025b;
    }

    /* renamed from: d */
    public static final boolean m40399d() {
        return f32026c;
    }
}
