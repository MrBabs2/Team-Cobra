package kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.p256n;

import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;

/* renamed from: kotlin.h0.u.e.k0.h.q.n.h */
/* compiled from: TransientReceiver */
public class C10119h extends C10112a {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C10119h(C11824b0 b0Var) {
        this(b0Var, (C10116e) null);
        if (b0Var != null) {
        } else {
            m34045a(0);
            throw null;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m34045a(int i) {
        Object[] objArr = new Object[3];
        if (i != 2) {
            objArr[0] = "type";
        } else {
            objArr[0] = "newType";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver";
        if (i != 2) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "replaceType";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public String toString() {
        return "{Transient} : " + getType();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C10119h(C11824b0 b0Var, C10116e eVar) {
        super(b0Var, eVar);
        if (b0Var != null) {
        } else {
            m34045a(1);
            throw null;
        }
    }
}
