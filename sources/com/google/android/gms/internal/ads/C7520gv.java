package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gv */
final class C7520gv implements C8227zv {

    /* renamed from: a */
    private static final C7520gv f15322a = new C7520gv();

    private C7520gv() {
    }

    /* renamed from: a */
    public static C7520gv m17024a() {
        return f15322a;
    }

    /* renamed from: b */
    public final boolean mo25978b(Class<?> cls) {
        return zzdob.class.isAssignableFrom(cls);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Class<?>, java.lang.Class] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C8190yv mo25977a(java.lang.Class<?> r5) {
        /*
            r4 = this;
            java.lang.Class<com.google.android.gms.internal.ads.zzdob> r0 = com.google.android.gms.internal.ads.zzdob.class
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
            com.google.android.gms.internal.ads.zzdob r0 = com.google.android.gms.internal.ads.zzdob.m24002a(r0)     // Catch:{ Exception -> 0x003a }
            int r1 = com.google.android.gms.internal.ads.zzdob.zze.f21576c     // Catch:{ Exception -> 0x003a }
            r2 = 0
            java.lang.Object r0 = r0.mo28168a((int) r1, (java.lang.Object) r2, (java.lang.Object) r2)     // Catch:{ Exception -> 0x003a }
            com.google.android.gms.internal.ads.yv r0 = (com.google.android.gms.internal.ads.C8190yv) r0     // Catch:{ Exception -> 0x003a }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7520gv.mo25977a(java.lang.Class):com.google.android.gms.internal.ads.yv");
    }
}
