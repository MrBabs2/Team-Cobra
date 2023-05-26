package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.t0 */
final class C8345t0 {

    /* renamed from: a */
    private static final Class<?> f23346a = m26181a();

    /* renamed from: a */
    private static Class<?> m26181a() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static zzub m26182b() {
        if (f23346a != null) {
            try {
                return m26180a("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return zzub.f23441a;
    }

    /* renamed from: a */
    private static final zzub m26180a(String str) throws Exception {
        return (zzub) f23346a.getDeclaredMethod(str, new Class[0]).invoke((Object) null, new Object[0]);
    }
}
