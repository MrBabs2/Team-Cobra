package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.b1 */
final class C8262b1 implements C8346t1 {

    /* renamed from: a */
    private static final C8262b1 f23213a = new C8262b1();

    private C8262b1() {
    }

    /* renamed from: a */
    public static C8262b1 m25889a() {
        return f23213a;
    }

    /* renamed from: b */
    public final boolean mo30063b(Class<?> cls) {
        return zzuo.class.isAssignableFrom(cls);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Class<?>, java.lang.Class] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.C8342s1 mo30062a(java.lang.Class<?> r5) {
        /*
            r4 = this;
            java.lang.Class<com.google.android.gms.internal.measurement.zzuo> r0 = com.google.android.gms.internal.measurement.zzuo.class
            boolean r1 = r0.isAssignableFrom(r5)
            if (r1 != 0) goto L_0x0028
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported message type: "
            java.lang.String r5 = r5.getName()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r2 = r5.length()
            if (r2 == 0) goto L_0x001f
            java.lang.String r5 = r1.concat(r5)
            goto L_0x0024
        L_0x001f:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1)
        L_0x0024:
            r0.<init>(r5)
            throw r0
        L_0x0028:
            java.lang.Class r0 = r5.asSubclass(r0)     // Catch:{ Exception -> 0x003a }
            com.google.android.gms.internal.measurement.zzuo r0 = com.google.android.gms.internal.measurement.zzuo.m26653a(r0)     // Catch:{ Exception -> 0x003a }
            int r1 = com.google.android.gms.internal.measurement.zzuo.zze.f23501c     // Catch:{ Exception -> 0x003a }
            r2 = 0
            java.lang.Object r0 = r0.mo30423a((int) r1, (java.lang.Object) r2, (java.lang.Object) r2)     // Catch:{ Exception -> 0x003a }
            com.google.android.gms.internal.measurement.s1 r0 = (com.google.android.gms.internal.measurement.C8342s1) r0     // Catch:{ Exception -> 0x003a }
            return r0
        L_0x003a:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Unable to get message info for "
            java.lang.String r5 = r5.getName()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r3 = r5.length()
            if (r3 == 0) goto L_0x0052
            java.lang.String r5 = r2.concat(r5)
            goto L_0x0057
        L_0x0052:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r2)
        L_0x0057:
            r1.<init>(r5, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C8262b1.mo30062a(java.lang.Class):com.google.android.gms.internal.measurement.s1");
    }
}
