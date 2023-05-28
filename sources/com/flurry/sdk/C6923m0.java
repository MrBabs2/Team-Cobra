package com.flurry.sdk;

/* renamed from: com.flurry.sdk.m0 */
public final class C6923m0 {

    /* renamed from: a */
    private static C6923m0 f12976a;

    private C6923m0() {
    }

    /* renamed from: a */
    public static synchronized C6923m0 m14706a() {
        C6923m0 m0Var;
        synchronized (C6923m0.class) {
            if (f12976a == null) {
                f12976a = new C6923m0();
            }
            m0Var = f12976a;
        }
        return m0Var;
    }
}
