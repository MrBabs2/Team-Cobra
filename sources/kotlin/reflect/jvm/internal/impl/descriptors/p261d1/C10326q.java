package kotlin.reflect.jvm.internal.impl.descriptors.p261d1;

import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.p256n.C10114c;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.p256n.C10116e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.q */
/* compiled from: LazyClassReceiverParameterDescriptor */
public class C10326q extends C10284c {

    /* renamed from: i */
    private final C10342e f28090i;

    /* renamed from: j */
    private final C10114c f28091j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10326q(C10342e eVar) {
        super(C10249g.f27910c.mo35429a());
        if (eVar != null) {
            this.f28090i = eVar;
            this.f28091j = new C10114c(eVar, (C10114c) null);
            return;
        }
        m34744a(0);
        throw null;
    }

    /* renamed from: a */
    private static /* synthetic */ void m34744a(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 1 || i == 2) ? 2 : 3)];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i == 1) {
            objArr[1] = "getValue";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (!(i == 1 || i == 2)) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String format = String.format(str, objArr);
        throw ((i == 1 || i == 2) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public C10359m mo33762b() {
        C10342e eVar = this.f28090i;
        if (eVar != null) {
            return eVar;
        }
        m34744a(2);
        throw null;
    }

    public C10116e getValue() {
        C10114c cVar = this.f28091j;
        if (cVar != null) {
            return cVar;
        }
        m34744a(1);
        throw null;
    }

    public String toString() {
        return "class " + this.f28090i.getName() + "::this";
    }
}
