package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zt */
final class C8225zt {

    /* renamed from: a */
    private static final Class<?> f17662a = m18653a("libcore.io.Memory");

    /* renamed from: b */
    private static final boolean f17663b = (m18653a("org.robolectric.Robolectric") != null);

    /* renamed from: a */
    static boolean m18654a() {
        return f17662a != null && !f17663b;
    }

    /* renamed from: b */
    static Class<?> m18655b() {
        return f17662a;
    }

    /* renamed from: a */
    private static <T> Class<T> m18653a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
