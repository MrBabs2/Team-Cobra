package kotlin.reflect.jvm.internal.impl.descriptors.p261d1;

import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11817i;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11838f1;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10370q0;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.b */
/* compiled from: AbstractLazyTypeParameterDescriptor */
public abstract class C10282b extends C10290e {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10282b(C11817i iVar, C10359m mVar, C9939f fVar, C11838f1 f1Var, boolean z, int i, C10362n0 n0Var, C10370q0 q0Var) {
        super(iVar, mVar, C10249g.f27910c.mo35429a(), fVar, f1Var, z, i, n0Var, q0Var);
        if (iVar == null) {
            m34363a(0);
            throw null;
        } else if (mVar == null) {
            m34363a(1);
            throw null;
        } else if (fVar == null) {
            m34363a(2);
            throw null;
        } else if (f1Var == null) {
            m34363a(3);
            throw null;
        } else if (n0Var == null) {
            m34363a(4);
            throw null;
        } else if (q0Var != null) {
        } else {
            m34363a(5);
            throw null;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m34363a(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "variance";
        } else if (i == 4) {
            objArr[0] = "source";
        } else if (i != 5) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "supertypeLoopChecker";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public String toString() {
        Object[] objArr = new Object[3];
        String str = "";
        objArr[0] = mo35447z() ? "reified " : str;
        if (mo35439G() != C11838f1.INVARIANT) {
            str = mo35439G() + " ";
        }
        objArr[1] = str;
        objArr[2] = getName();
        return String.format("%s%s%s", objArr);
    }
}
