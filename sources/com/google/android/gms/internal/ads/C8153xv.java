package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xv */
final class C8153xv {

    /* renamed from: a */
    private static final C8079vv f17205a = m18474c();

    /* renamed from: b */
    private static final C8079vv f17206b = new C8116wv();

    /* renamed from: a */
    static C8079vv m18472a() {
        return f17205a;
    }

    /* renamed from: b */
    static C8079vv m18473b() {
        return f17206b;
    }

    /* renamed from: c */
    private static C8079vv m18474c() {
        try {
            return (C8079vv) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
