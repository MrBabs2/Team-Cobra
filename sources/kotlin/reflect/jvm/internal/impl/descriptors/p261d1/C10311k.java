package kotlin.reflect.jvm.internal.impl.descriptors.p261d1;

import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10361n;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10367p;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.k */
/* compiled from: DeclarationDescriptorNonRootImpl */
public abstract class C10311k extends C10309j implements C10361n {

    /* renamed from: h */
    private final C10359m f28023h;

    /* renamed from: i */
    private final C10362n0 f28024i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C10311k(C10359m mVar, C10249g gVar, C9939f fVar, C10362n0 n0Var) {
        super(gVar, fVar);
        if (mVar == null) {
            m34580a(0);
            throw null;
        } else if (gVar == null) {
            m34580a(1);
            throw null;
        } else if (fVar == null) {
            m34580a(2);
            throw null;
        } else if (n0Var != null) {
            this.f28023h = mVar;
            this.f28024i = n0Var;
        } else {
            m34580a(3);
            throw null;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m34580a(int i) {
        String str = (i == 4 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 4 || i == 5 || i == 6) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 4) {
            objArr[1] = "getOriginal";
        } else if (i == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (!(i == 4 || i == 5 || i == 6)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 4 || i == 5 || i == 6) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public C10359m mo33762b() {
        C10359m mVar = this.f28023h;
        if (mVar != null) {
            return mVar;
        }
        m34580a(5);
        throw null;
    }

    /* renamed from: p */
    public C10362n0 mo33773p() {
        C10362n0 n0Var = this.f28024i;
        if (n0Var != null) {
            return n0Var;
        }
        m34580a(6);
        throw null;
    }

    /* renamed from: a */
    public C10367p m34582a() {
        super.mo35404a();
        return this;
    }
}
