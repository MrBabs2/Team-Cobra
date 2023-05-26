package kotlin.reflect.jvm.internal.impl.descriptors.p261d1;

import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p247g.C9949c;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10242b;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.j */
/* compiled from: DeclarationDescriptorImpl */
public abstract class C10309j extends C10242b implements C10359m {

    /* renamed from: g */
    private final C9939f f28021g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10309j(C10249g gVar, C9939f fVar) {
        super(gVar);
        if (gVar == null) {
            m34571a(0);
            throw null;
        } else if (fVar != null) {
            this.f28021g = fVar;
        } else {
            m34571a(1);
            throw null;
        }
    }

    /* renamed from: a */
    public static String m34570a(C10359m mVar) {
        if (mVar != null) {
            try {
                String str = C9949c.f27454b.mo35037a(mVar) + "[" + mVar.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(mVar)) + "]";
                if (str != null) {
                    return str;
                }
                m34571a(5);
                throw null;
            } catch (Throwable unused) {
                String str2 = mVar.getClass().getSimpleName() + " " + mVar.getName();
                if (str2 != null) {
                    return str2;
                }
                m34571a(6);
                throw null;
            }
        } else {
            m34571a(4);
            throw null;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m34571a(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 2 || i == 3 || i == 5 || i == 6) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 5 || i == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (!(i == 2 || i == 3)) {
            if (i == 4) {
                objArr[2] = "toString";
            } else if (!(i == 5 || i == 6)) {
                objArr[2] = "<init>";
            }
        }
        String format = String.format(str, objArr);
        throw ((i == 2 || i == 3 || i == 5 || i == 6) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: a */
    public C10359m mo35404a() {
        return this;
    }

    public C9939f getName() {
        C9939f fVar = this.f28021g;
        if (fVar != null) {
            return fVar;
        }
        m34571a(2);
        throw null;
    }

    public String toString() {
        return m34570a((C10359m) this);
    }
}
