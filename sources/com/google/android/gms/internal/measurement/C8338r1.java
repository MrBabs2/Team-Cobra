package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.r1 */
final class C8338r1 {

    /* renamed from: a */
    private static final C8330p1 f23337a = m26130c();

    /* renamed from: b */
    private static final C8330p1 f23338b = new C8334q1();

    /* renamed from: a */
    static C8330p1 m26128a() {
        return f23337a;
    }

    /* renamed from: b */
    static C8330p1 m26129b() {
        return f23338b;
    }

    /* renamed from: c */
    private static C8330p1 m26130c() {
        try {
            return (C8330p1) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
