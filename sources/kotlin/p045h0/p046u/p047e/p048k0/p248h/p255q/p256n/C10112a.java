package kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.p256n;

import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;

/* renamed from: kotlin.h0.u.e.k0.h.q.n.a */
/* compiled from: AbstractReceiverValue */
public abstract class C10112a implements C10116e {

    /* renamed from: a */
    protected final C11824b0 f27738a;

    public C10112a(C11824b0 b0Var, C10116e eVar) {
        if (b0Var != null) {
            this.f27738a = b0Var;
        } else {
            m34040a(0);
            throw null;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m34040a(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 1 || i == 2) ? 2 : 3)];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i == 1) {
            objArr[1] = "getType";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (!(i == 1 || i == 2)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 1 || i == 2) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public C11824b0 getType() {
        C11824b0 b0Var = this.f27738a;
        if (b0Var != null) {
            return b0Var;
        }
        m34040a(1);
        throw null;
    }
}
