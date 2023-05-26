package com.google.android.gms.internal.ads;

import java.io.PrintWriter;

public final class zzdmb {

    /* renamed from: a */
    private static final C8003tt f21484a;

    /* renamed from: com.google.android.gms.internal.ads.zzdmb$a */
    static final class C8236a extends C8003tt {
        C8236a() {
        }

        /* renamed from: a */
        public final void mo26581a(Throwable th) {
            th.printStackTrace();
        }

        /* renamed from: a */
        public final void mo26583a(Throwable th, Throwable th2) {
        }

        /* renamed from: a */
        public final void mo26582a(Throwable th, PrintWriter printWriter) {
            th.printStackTrace(printWriter);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    static {
        /*
            java.lang.Integer r0 = m23744a()     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x0014
            int r1 = r0.intValue()     // Catch:{ all -> 0x002a }
            r2 = 19
            if (r1 < r2) goto L_0x0014
            com.google.android.gms.internal.ads.xt r1 = new com.google.android.gms.internal.ads.xt     // Catch:{ all -> 0x002a }
            r1.<init>()     // Catch:{ all -> 0x002a }
            goto L_0x0063
        L_0x0014:
            java.lang.String r1 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r1 = java.lang.Boolean.getBoolean(r1)     // Catch:{ all -> 0x002a }
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.wt r1 = new com.google.android.gms.internal.ads.wt     // Catch:{ all -> 0x002a }
            r1.<init>()     // Catch:{ all -> 0x002a }
            goto L_0x0063
        L_0x0024:
            com.google.android.gms.internal.ads.zzdmb$a r1 = new com.google.android.gms.internal.ads.zzdmb$a     // Catch:{ all -> 0x002a }
            r1.<init>()     // Catch:{ all -> 0x002a }
            goto L_0x0063
        L_0x002a:
            r1 = move-exception
            goto L_0x002e
        L_0x002c:
            r1 = move-exception
            r0 = 0
        L_0x002e:
            java.io.PrintStream r2 = java.lang.System.err
            java.lang.Class<com.google.android.gms.internal.ads.zzdmb$a> r3 = com.google.android.gms.internal.ads.zzdmb.C8236a.class
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            int r4 = r4 + 133
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy "
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = "will be used. The error is: "
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r2.println(r3)
            java.io.PrintStream r2 = java.lang.System.err
            r1.printStackTrace(r2)
            com.google.android.gms.internal.ads.zzdmb$a r1 = new com.google.android.gms.internal.ads.zzdmb$a
            r1.<init>()
        L_0x0063:
            f21484a = r1
            if (r0 != 0) goto L_0x0068
            goto L_0x006b
        L_0x0068:
            r0.intValue()
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdmb.<clinit>():void");
    }

    /* renamed from: a */
    public static void m23747a(Throwable th, Throwable th2) {
        f21484a.mo26583a(th, th2);
    }

    /* renamed from: a */
    public static void m23745a(Throwable th) {
        f21484a.mo26581a(th);
    }

    /* renamed from: a */
    public static void m23746a(Throwable th, PrintWriter printWriter) {
        f21484a.mo26582a(th, printWriter);
    }

    /* renamed from: a */
    private static Integer m23744a() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get((Object) null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }
}
