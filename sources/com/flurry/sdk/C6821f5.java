package com.flurry.sdk;

/* renamed from: com.flurry.sdk.f5 */
public final class C6821f5 extends C7008r6 {

    /* renamed from: e */
    private static int f12754e;

    private C6821f5(C7031t6 t6Var) {
        super(t6Var);
    }

    /* renamed from: a */
    public final C7023s6 mo23538a() {
        return C7023s6.APP_ORIENTATION;
    }

    /* renamed from: a */
    public static void m14523a(int i) {
        if (i != 0 && f12754e != i) {
            f12754e = i;
            C6925m2.m14707a().mo23649a(new C6821f5(new C6836g5(i)));
        }
    }
}
