package kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.p256n;

import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10230a;

/* renamed from: kotlin.h0.u.e.k0.h.q.n.b */
/* compiled from: ExtensionReceiver */
public class C10113b extends C10112a implements C10115d {

    /* renamed from: b */
    private final C10230a f27739b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10113b(C10230a aVar, C11824b0 b0Var, C10116e eVar) {
        super(b0Var, eVar);
        if (aVar == null) {
            m34041a(0);
            throw null;
        } else if (b0Var != null) {
            this.f27739b = aVar;
        } else {
            m34041a(1);
            throw null;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m34041a(int i) {
        String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 2 ? 3 : 2)];
        if (i == 1) {
            objArr[0] = "receiverType";
        } else if (i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i != 2) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String format = String.format(str, objArr);
        throw (i != 2 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    public String toString() {
        return getType() + ": Ext {" + this.f27739b + "}";
    }
}
