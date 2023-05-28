package kotlin.p045h0.p046u.p047e.p048k0.p240d;

import kotlin.reflect.jvm.internal.impl.protobuf.C10436i;

/* renamed from: kotlin.h0.u.e.k0.d.t */
/* compiled from: ProtoBuf */
public enum C9848t implements C10436i.C10437a {
    DECLARATION(0, 0),
    FAKE_OVERRIDE(1, 1),
    DELEGATION(2, 2),
    SYNTHESIZED(3, 3);
    

    /* renamed from: f */
    private final int f27152f;

    /* renamed from: kotlin.h0.u.e.k0.d.t$a */
    /* compiled from: ProtoBuf */
    static class C9849a implements C10436i.C10438b<C9848t> {
        C9849a() {
        }

        /* renamed from: a */
        public C9848t m32675a(int i) {
            return C9848t.m32672a(i);
        }
    }

    static {
        new C9849a();
    }

    private C9848t(int i, int i2) {
        this.f27152f = i2;
    }

    /* renamed from: a */
    public static C9848t m32672a(int i) {
        if (i == 0) {
            return DECLARATION;
        }
        if (i == 1) {
            return FAKE_OVERRIDE;
        }
        if (i == 2) {
            return DELEGATION;
        }
        if (i != 3) {
            return null;
        }
        return SYNTHESIZED;
    }

    /* renamed from: b */
    public final int mo34424b() {
        return this.f27152f;
    }
}
