package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.w0 */
final class C8357w0 {

    /* renamed from: a */
    private static final C8349u0<?> f23367a = new C8353v0();

    /* renamed from: b */
    private static final C8349u0<?> f23368b = m26255a();

    /* renamed from: a */
    private static C8349u0<?> m26255a() {
        try {
            return (C8349u0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    static C8349u0<?> m26256b() {
        return f23367a;
    }

    /* renamed from: c */
    static C8349u0<?> m26257c() {
        C8349u0<?> u0Var = f23368b;
        if (u0Var != null) {
            return u0Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
