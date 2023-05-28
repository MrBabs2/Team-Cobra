package com.flurry.sdk;

/* renamed from: com.flurry.sdk.l0 */
public final class C6914l0 {

    /* renamed from: a */
    private static C6914l0 f12959a;

    private C6914l0() {
    }

    /* renamed from: a */
    public static synchronized C6914l0 m14692a() {
        C6914l0 l0Var;
        synchronized (C6914l0.class) {
            if (f12959a == null) {
                f12959a = new C6914l0();
            }
            l0Var = f12959a;
        }
        return l0Var;
    }
}
