package com.flurry.sdk;

/* renamed from: com.flurry.sdk.t5 */
public final class C7030t5 extends C7008r6 {
    private C7030t5(C7031t6 t6Var) {
        super(t6Var);
    }

    /* renamed from: h */
    public static C7030t5 m14908h() {
        long b = C6971p2.m14812b("frame.counter", 0) + 1;
        C6971p2.m14809a("frame.counter", b);
        return new C7030t5(new C7043u5(b));
    }

    /* renamed from: a */
    public final C7023s6 mo23538a() {
        return C7023s6.FRAME_COUNTER;
    }
}
