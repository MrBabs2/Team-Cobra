package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.f0 */
final class C8281f0 {

    /* renamed from: a */
    private static final Class<?> f23239a = m25930a("libcore.io.Memory");

    /* renamed from: b */
    private static final boolean f23240b = (m25930a("org.robolectric.Robolectric") != null);

    /* renamed from: a */
    static boolean m25931a() {
        return f23239a != null && !f23240b;
    }

    /* renamed from: b */
    static Class<?> m25932b() {
        return f23239a;
    }

    /* renamed from: a */
    private static <T> Class<T> m25930a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
