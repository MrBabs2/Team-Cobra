package com.flurry.sdk;

/* renamed from: com.flurry.sdk.m2 */
public final class C6925m2 {

    /* renamed from: d */
    static C6925m2 f12985d;

    /* renamed from: a */
    public C7027t2 f12986a = new C7027t2();

    /* renamed from: b */
    public C7102z6 f12987b;

    /* renamed from: c */
    public C7055v6 f12988c;

    private C6925m2() {
        C7055v6 v6Var;
        int a = C6815f1.m14516a();
        if (a == 0 || a == 2) {
            v6Var = C6815f1.m14518c() ? new C6902k2() : new C6885j2();
        } else {
            v6Var = null;
        }
        this.f12988c = v6Var;
        this.f12987b = new C7102z6(this.f12988c);
    }

    /* renamed from: a */
    public static synchronized C6925m2 m14707a() {
        C6925m2 m2Var;
        synchronized (C6925m2.class) {
            if (f12985d == null) {
                f12985d = new C6925m2();
            }
            m2Var = f12985d;
        }
        return m2Var;
    }

    /* renamed from: a */
    public final void mo23649a(C7044u6 u6Var) {
        if (u6Var != null) {
            this.f12986a.mo23720a(u6Var);
        } else {
            C6792d1.m14476a(5, "StreamingManager", "sendFrameToStreaming failed -- message is null");
        }
    }
}
