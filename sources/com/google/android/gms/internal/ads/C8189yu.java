package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yu */
final class C8189yu {

    /* renamed from: a */
    private static final C8115wu<?> f17485a = new C8152xu();

    /* renamed from: b */
    private static final C8115wu<?> f17486b = m18553a();

    /* renamed from: a */
    private static C8115wu<?> m18553a() {
        try {
            return (C8115wu) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    static C8115wu<?> m18554b() {
        return f17485a;
    }

    /* renamed from: c */
    static C8115wu<?> m18555c() {
        C8115wu<?> wuVar = f17486b;
        if (wuVar != null) {
            return wuVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
