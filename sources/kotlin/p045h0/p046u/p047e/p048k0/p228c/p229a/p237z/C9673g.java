package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p237z;

import java.util.Collection;
import java.util.List;
import kotlin.C10221n;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9609t;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C9997b;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10037g;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11815g;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10230a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10237a1;
import kotlin.reflect.jvm.internal.impl.descriptors.C10238b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10352i0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10353j;
import kotlin.reflect.jvm.internal.impl.descriptors.C10356k0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10358l0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10388w;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;
import kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10281a0;
import kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10283b0;
import kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10340z;

/* renamed from: kotlin.h0.u.e.k0.c.a.z.g */
/* compiled from: JavaPropertyDescriptor */
public class C9673g extends C10340z implements C9666b {

    /* renamed from: F */
    private final boolean f26603F;

    /* renamed from: G */
    private final C10221n<C10230a.C10231a<?>, ?> f26604G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C9673g(C10359m mVar, C10249g gVar, C10388w wVar, C10237a1 a1Var, boolean z, C9939f fVar, C10362n0 n0Var, C10352i0 i0Var, C10238b.C10239a aVar, boolean z2, C10221n<C10230a.C10231a<?>, ?> nVar) {
        super(mVar, i0Var, gVar, wVar, a1Var, z, fVar, aVar, n0Var, false, false, false, false, false, false);
        if (mVar == null) {
            m31175a(0);
            throw null;
        } else if (gVar == null) {
            m31175a(1);
            throw null;
        } else if (wVar == null) {
            m31175a(2);
            throw null;
        } else if (a1Var == null) {
            m31175a(3);
            throw null;
        } else if (fVar == null) {
            m31175a(4);
            throw null;
        } else if (n0Var == null) {
            m31175a(5);
            throw null;
        } else if (aVar != null) {
            this.f26603F = z2;
            this.f26604G = nVar;
        } else {
            m31175a(6);
            throw null;
        }
    }

    /* renamed from: a */
    public static C9673g m31174a(C10359m mVar, C10249g gVar, C10388w wVar, C10237a1 a1Var, boolean z, C9939f fVar, C10362n0 n0Var, boolean z2) {
        if (mVar == null) {
            m31175a(7);
            throw null;
        } else if (gVar == null) {
            m31175a(8);
            throw null;
        } else if (wVar == null) {
            m31175a(9);
            throw null;
        } else if (a1Var == null) {
            m31175a(10);
            throw null;
        } else if (fVar == null) {
            m31175a(11);
            throw null;
        } else if (n0Var != null) {
            return new C9673g(mVar, gVar, wVar, a1Var, z, fVar, n0Var, (C10352i0) null, C10238b.C10239a.DECLARATION, z2, (C10221n<C10230a.C10231a<?>, ?>) null);
        } else {
            m31175a(12);
            throw null;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m31175a(int i) {
        String str = i != 20 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 20 ? 3 : 2)];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 18:
                objArr[0] = "enhancedValueParametersData";
                break;
            case 19:
                objArr[0] = "enhancedReturnType";
                break;
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 18:
            case 19:
                objArr[2] = "enhance";
                break;
            case 20:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw (i != 20 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    /* renamed from: A */
    public boolean mo34221A() {
        return false;
    }

    public boolean isConst() {
        C11824b0 type = getType();
        return this.f26603F && C10353j.m34974a(type) && (!C9609t.m30999a(type) || C9333g.m30209u(type));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C10340z mo34230a(C10359m mVar, C10388w wVar, C10237a1 a1Var, C10352i0 i0Var, C10238b.C10239a aVar, C9939f fVar) {
        if (mVar == null) {
            m31175a(13);
            throw null;
        } else if (wVar == null) {
            m31175a(14);
            throw null;
        } else if (a1Var == null) {
            m31175a(15);
            throw null;
        } else if (aVar == null) {
            m31175a(16);
            throw null;
        } else if (fVar != null) {
            return new C9673g(mVar, getAnnotations(), wVar, a1Var, mo35484Z(), fVar, C10362n0.f28175a, i0Var, aVar, this.f26603F, this.f26604G);
        } else {
            m31175a(17);
            throw null;
        }
    }

    /* renamed from: a */
    public C9666b mo34220a(C11824b0 b0Var, List<C9678l> list, C11824b0 b0Var2, C10221n<C10230a.C10231a<?>, ?> nVar) {
        C10281a0 a0Var;
        C10283b0 b0Var3;
        C10358l0 l0Var;
        C11824b0 b0Var4 = b0Var;
        C11824b0 b0Var5 = b0Var2;
        if (list == null) {
            m31175a(18);
            throw null;
        } else if (b0Var5 != null) {
            C10352i0 a = m34895a() == this ? null : m34895a();
            C9673g gVar = r5;
            C9673g gVar2 = new C9673g(mo33762b(), getAnnotations(), mo33767i(), getVisibility(), mo35484Z(), getName(), mo33773p(), a, mo35423g(), this.f26603F, nVar);
            C10281a0 getter = getGetter();
            if (getter != null) {
                a0Var = r5;
                C10281a0 a0Var2 = new C10281a0(gVar, getter.getAnnotations(), getter.mo33767i(), getter.getVisibility(), getter.mo35569P(), getter.mo33778u(), getter.isInline(), mo35423g(), a == null ? null : a.getGetter(), getter.mo33773p());
                a0Var.mo35572a(getter.mo35500W());
                a0Var.mo35453a(b0Var5);
            } else {
                a0Var = null;
            }
            C10356k0 setter = getSetter();
            if (setter != null) {
                C10283b0 b0Var6 = r5;
                C10283b0 b0Var7 = new C10283b0(gVar, setter.getAnnotations(), setter.mo33767i(), setter.getVisibility(), setter.mo35569P(), setter.mo33778u(), setter.isInline(), mo35423g(), a == null ? null : a.getSetter(), setter.mo33773p());
                C10283b0 b0Var8 = b0Var6;
                b0Var8.mo35572a(b0Var6.mo35500W());
                b0Var8.mo35454a(setter.mo35407f().get(0));
                b0Var3 = b0Var8;
            } else {
                b0Var3 = null;
            }
            C9673g gVar3 = gVar;
            gVar3.mo35580a(a0Var, (C10356k0) b0Var3, mo35583f0(), mo35582c0());
            gVar3.mo35581a(mo35587r());
            C11815g<C10037g<?>> gVar4 = this.f28026l;
            if (gVar4 != null) {
                gVar3.mo35493a(gVar4);
            }
            gVar3.mo35422a((Collection<? extends C10238b>) mo35406d());
            if (b0Var4 == null) {
                l0Var = null;
            } else {
                l0Var = C9997b.m33649a((C10230a) this, b0Var4, C10249g.f27910c.mo35429a());
            }
            gVar3.mo35577a(b0Var5, (List<? extends C10375s0>) getTypeParameters(), mo35403X(), l0Var);
            return gVar3;
        } else {
            m31175a(19);
            throw null;
        }
    }

    /* renamed from: a */
    public <V> V mo34229a(C10230a.C10231a<V> aVar) {
        C10221n<C10230a.C10231a<?>, ?> nVar = this.f26604G;
        if (nVar == null || !nVar.mo35391c().equals(aVar)) {
            return null;
        }
        return this.f26604G.mo35392d();
    }
}
