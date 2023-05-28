package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gw */
final class C7521gw {

    /* renamed from: a */
    private static final C7448ew f15323a = m17029c();

    /* renamed from: b */
    private static final C7448ew f15324b = new C7485fw();

    /* renamed from: a */
    static C7448ew m17027a() {
        return f15323a;
    }

    /* renamed from: b */
    static C7448ew m17028b() {
        return f15324b;
    }

    /* renamed from: c */
    private static C7448ew m17029c() {
        try {
            return (C7448ew) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
