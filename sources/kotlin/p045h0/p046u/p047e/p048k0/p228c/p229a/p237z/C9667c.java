package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p237z;

import java.util.List;
import kotlin.C10221n;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C9997b;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10230a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10238b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10358l0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10382u;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;
import kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10296f;

/* renamed from: kotlin.h0.u.e.k0.c.a.z.c */
/* compiled from: JavaClassConstructorDescriptor */
public class C9667c extends C10296f implements C9666b {

    /* renamed from: K */
    private Boolean f26592K;

    /* renamed from: L */
    private Boolean f26593L;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C9667c(C10342e eVar, C9667c cVar, C10249g gVar, boolean z, C10238b.C10239a aVar, C10362n0 n0Var) {
        super(eVar, cVar, gVar, z, aVar, n0Var);
        if (eVar == null) {
            m31150a(0);
            throw null;
        } else if (gVar == null) {
            m31150a(1);
            throw null;
        } else if (aVar == null) {
            m31150a(2);
            throw null;
        } else if (n0Var != null) {
            this.f26592K = null;
            this.f26593L = null;
        } else {
            m31150a(3);
            throw null;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m31150a(int i) {
        String str = (i == 11 || i == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 11 || i == 18) ? 2 : 3)];
        switch (i) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParametersData";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 11 || i == 18) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public static C9667c m31151b(C10342e eVar, C10249g gVar, boolean z, C10362n0 n0Var) {
        if (eVar == null) {
            m31150a(4);
            throw null;
        } else if (gVar == null) {
            m31150a(5);
            throw null;
        } else if (n0Var != null) {
            return new C9667c(eVar, (C9667c) null, gVar, z, C10238b.C10239a.DECLARATION, n0Var);
        } else {
            m31150a(6);
            throw null;
        }
    }

    /* renamed from: A */
    public boolean mo34221A() {
        return this.f26593L.booleanValue();
    }

    /* renamed from: B */
    public boolean mo34222B() {
        return this.f26592K.booleanValue();
    }

    /* renamed from: d */
    public void mo34224d(boolean z) {
        this.f26592K = Boolean.valueOf(z);
    }

    /* renamed from: e */
    public void mo34225e(boolean z) {
        this.f26593L = Boolean.valueOf(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9667c m31159a(C10359m mVar, C10382u uVar, C10238b.C10239a aVar, C9939f fVar, C10249g gVar, C10362n0 n0Var) {
        if (mVar == null) {
            m31150a(7);
            throw null;
        } else if (aVar == null) {
            m31150a(8);
            throw null;
        } else if (gVar == null) {
            m31150a(9);
            throw null;
        } else if (n0Var == null) {
            m31150a(10);
            throw null;
        } else if (aVar == C10238b.C10239a.DECLARATION || aVar == C10238b.C10239a.SYNTHESIZED) {
            C9667c a = mo34223a((C10342e) mVar, (C9667c) uVar, aVar, n0Var, gVar);
            a.mo34224d(mo34222B());
            a.mo34225e(mo34221A());
            if (a != null) {
                return a;
            }
            m31150a(11);
            throw null;
        } else {
            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\n" + "newOwner: " + mVar + "\n" + "kind: " + aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9667c mo34223a(C10342e eVar, C9667c cVar, C10238b.C10239a aVar, C10362n0 n0Var, C10249g gVar) {
        if (eVar == null) {
            m31150a(12);
            throw null;
        } else if (aVar == null) {
            m31150a(13);
            throw null;
        } else if (n0Var == null) {
            m31150a(14);
            throw null;
        } else if (gVar != null) {
            return new C9667c(eVar, cVar, gVar, this.f27991I, aVar, n0Var);
        } else {
            m31150a(15);
            throw null;
        }
    }

    /* renamed from: a */
    public C9667c m31155a(C11824b0 b0Var, List<C9678l> list, C11824b0 b0Var2, C10221n<C10230a.C10231a<?>, ?> nVar) {
        C10358l0 l0Var;
        C11824b0 b0Var3 = b0Var;
        if (list == null) {
            m31150a(16);
            throw null;
        } else if (b0Var2 != null) {
            C9667c a = m31159a((C10359m) m34479b(), (C10382u) null, mo35423g(), (C9939f) null, getAnnotations(), mo33773p());
            if (b0Var3 == null) {
                l0Var = null;
            } else {
                l0Var = C9997b.m33649a((C10230a) a, b0Var, C10249g.f27910c.mo35429a());
            }
            a.mo35464a(l0Var, mo35403X(), getTypeParameters(), C9677k.m31182a(list, mo35407f(), a), b0Var2, mo33767i(), getVisibility());
            if (nVar != null) {
                a.mo35502a(nVar.mo35391c(), (Object) nVar.mo35392d());
            }
            if (a != null) {
                return a;
            }
            m31150a(18);
            throw null;
        } else {
            m31150a(17);
            throw null;
        }
    }
}
