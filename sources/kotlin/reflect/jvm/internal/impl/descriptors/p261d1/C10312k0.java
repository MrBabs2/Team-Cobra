package kotlin.reflect.jvm.internal.impl.descriptors.p261d1;

import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10037g;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11815g;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.k0 */
/* compiled from: VariableDescriptorWithInitializerImpl */
public abstract class C10312k0 extends C10310j0 {

    /* renamed from: k */
    private final boolean f28025k;

    /* renamed from: l */
    protected C11815g<C10037g<?>> f28026l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10312k0(C10359m mVar, C10249g gVar, C9939f fVar, C11824b0 b0Var, boolean z, C10362n0 n0Var) {
        super(mVar, gVar, fVar, b0Var, n0Var);
        if (mVar == null) {
            m34585a(0);
            throw null;
        } else if (gVar == null) {
            m34585a(1);
            throw null;
        } else if (fVar == null) {
            m34585a(2);
            throw null;
        } else if (n0Var != null) {
            this.f28025k = z;
        } else {
            m34585a(3);
            throw null;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m34585a(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "annotations";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i != 4) {
            objArr[0] = "containingDeclaration";
        } else {
            objArr[0] = "compileTimeInitializer";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i != 4) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: R */
    public C10037g<?> mo35481R() {
        C11815g<C10037g<?>> gVar = this.f28026l;
        if (gVar != null) {
            return (C10037g) gVar.invoke();
        }
        return null;
    }

    /* renamed from: Z */
    public boolean mo35484Z() {
        return this.f28025k;
    }

    /* renamed from: a */
    public void mo35493a(C11815g<C10037g<?>> gVar) {
        if (gVar != null) {
            this.f28026l = gVar;
        } else {
            m34585a(4);
            throw null;
        }
    }
}
