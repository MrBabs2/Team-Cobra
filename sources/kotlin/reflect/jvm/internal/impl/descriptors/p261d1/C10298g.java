package kotlin.reflect.jvm.internal.impl.descriptors.p261d1;

import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11817i;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.g */
/* compiled from: ClassDescriptorBase */
public abstract class C10298g extends C10277a {

    /* renamed from: j */
    private final C10359m f27992j;

    /* renamed from: k */
    private final C10362n0 f27993k;

    /* renamed from: l */
    private final boolean f27994l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C10298g(C11817i iVar, C10359m mVar, C9939f fVar, C10362n0 n0Var, boolean z) {
        super(iVar, fVar);
        if (iVar == null) {
            m34485a(0);
            throw null;
        } else if (mVar == null) {
            m34485a(1);
            throw null;
        } else if (fVar == null) {
            m34485a(2);
            throw null;
        } else if (n0Var != null) {
            this.f27992j = mVar;
            this.f27993k = n0Var;
            this.f27994l = z;
        } else {
            m34485a(3);
            throw null;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m34485a(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 4 || i == 5) ? 2 : 3)];
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (!(i == 4 || i == 5)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 4 || i == 5) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public C10359m mo33762b() {
        C10359m mVar = this.f27992j;
        if (mVar != null) {
            return mVar;
        }
        m34485a(4);
        throw null;
    }

    /* renamed from: p */
    public C10362n0 mo33773p() {
        C10362n0 n0Var = this.f27993k;
        if (n0Var != null) {
            return n0Var;
        }
        m34485a(5);
        throw null;
    }

    /* renamed from: u */
    public boolean mo33778u() {
        return this.f27994l;
    }
}
