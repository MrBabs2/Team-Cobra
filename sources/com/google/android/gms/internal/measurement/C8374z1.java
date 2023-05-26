package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.z1 */
final class C8374z1 {

    /* renamed from: a */
    private static final C8362x1 f23403a = m26370c();

    /* renamed from: b */
    private static final C8362x1 f23404b = new C8366y1();

    /* renamed from: a */
    static C8362x1 m26368a() {
        return f23403a;
    }

    /* renamed from: b */
    static C8362x1 m26369b() {
        return f23404b;
    }

    /* renamed from: c */
    private static C8362x1 m26370c() {
        try {
            return (C8362x1) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
