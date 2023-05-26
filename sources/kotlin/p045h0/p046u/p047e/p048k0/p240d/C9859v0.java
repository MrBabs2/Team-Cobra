package kotlin.p045h0.p046u.p047e.p048k0.p240d;

import kotlin.reflect.jvm.internal.impl.protobuf.C10436i;

/* renamed from: kotlin.h0.u.e.k0.d.v0 */
/* compiled from: ProtoBuf */
public enum C9859v0 implements C10436i.C10437a {
    INTERNAL(0, 0),
    PRIVATE(1, 1),
    PROTECTED(2, 2),
    f27187j(3, 3),
    PRIVATE_TO_THIS(4, 4),
    LOCAL(5, 5);
    

    /* renamed from: f */
    private final int f27191f;

    /* renamed from: kotlin.h0.u.e.k0.d.v0$a */
    /* compiled from: ProtoBuf */
    static class C9860a implements C10436i.C10438b<C9859v0> {
        C9860a() {
        }

        /* renamed from: a */
        public C9859v0 m32784a(int i) {
            return C9859v0.m32781a(i);
        }
    }

    static {
        new C9860a();
    }

    private C9859v0(int i, int i2) {
        this.f27191f = i2;
    }

    /* renamed from: a */
    public static C9859v0 m32781a(int i) {
        if (i == 0) {
            return INTERNAL;
        }
        if (i == 1) {
            return PRIVATE;
        }
        if (i == 2) {
            return PROTECTED;
        }
        if (i == 3) {
            return f27187j;
        }
        if (i == 4) {
            return PRIVATE_TO_THIS;
        }
        if (i != 5) {
            return null;
        }
        return LOCAL;
    }

    /* renamed from: b */
    public final int mo34424b() {
        return this.f27191f;
    }
}
