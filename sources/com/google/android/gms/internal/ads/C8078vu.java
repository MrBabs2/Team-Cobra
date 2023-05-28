package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vu */
final class C8078vu {

    /* renamed from: a */
    private static final Class<?> f17039a = m18329a();

    /* renamed from: a */
    private static Class<?> m18329a() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static zzdno m18330b() {
        if (f17039a != null) {
            try {
                return m18328a("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return zzdno.f21513c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000e  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.gms.internal.ads.zzdno m18331c() {
        /*
            java.lang.Class<?> r0 = f17039a
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = "loadGeneratedRegistry"
            com.google.android.gms.internal.ads.zzdno r0 = m18328a(r0)     // Catch:{ Exception -> 0x000b }
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            if (r0 != 0) goto L_0x0012
            com.google.android.gms.internal.ads.zzdno r0 = com.google.android.gms.internal.ads.zzdno.m23983a()
        L_0x0012:
            if (r0 != 0) goto L_0x0018
            com.google.android.gms.internal.ads.zzdno r0 = m18330b()
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8078vu.m18331c():com.google.android.gms.internal.ads.zzdno");
    }

    /* renamed from: a */
    private static final zzdno m18328a(String str) throws Exception {
        return (zzdno) f17039a.getDeclaredMethod(str, new Class[0]).invoke((Object) null, new Object[0]);
    }
}
