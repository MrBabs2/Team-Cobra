package kotlin.p045h0.p046u.p047e.p048k0.p240d;

import kotlin.reflect.jvm.internal.impl.protobuf.C10436i;

/* renamed from: kotlin.h0.u.e.k0.d.u */
/* compiled from: ProtoBuf */
public enum C9853u implements C10436i.C10437a {
    FINAL(0, 0),
    OPEN(1, 1),
    ABSTRACT(2, 2),
    SEALED(3, 3);
    

    /* renamed from: f */
    private final int f27166f;

    /* renamed from: kotlin.h0.u.e.k0.d.u$a */
    /* compiled from: ProtoBuf */
    static class C9854a implements C10436i.C10438b<C9853u> {
        C9854a() {
        }

        /* renamed from: a */
        public C9853u m32714a(int i) {
            return C9853u.m32711a(i);
        }
    }

    static {
        new C9854a();
    }

    private C9853u(int i, int i2) {
        this.f27166f = i2;
    }

    /* renamed from: a */
    public static C9853u m32711a(int i) {
        if (i == 0) {
            return FINAL;
        }
        if (i == 1) {
            return OPEN;
        }
        if (i == 2) {
            return ABSTRACT;
        }
        if (i != 3) {
            return null;
        }
        return SEALED;
    }

    /* renamed from: b */
    public final int mo34424b() {
        return this.f27166f;
    }
}
