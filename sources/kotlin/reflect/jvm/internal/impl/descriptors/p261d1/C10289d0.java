package kotlin.reflect.jvm.internal.impl.descriptors.p261d1;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10230a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10237a1;
import kotlin.reflect.jvm.internal.impl.descriptors.C10238b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10358l0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10360m0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10382u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10386v0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10388w;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.d0 */
/* compiled from: SimpleFunctionDescriptorImpl */
public class C10289d0 extends C10322p implements C10360m0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C10289d0(C10359m mVar, C10360m0 m0Var, C10249g gVar, C9939f fVar, C10238b.C10239a aVar, C10362n0 n0Var) {
        super(mVar, m0Var, gVar, fVar, aVar, n0Var);
        if (mVar == null) {
            m34417a(0);
            throw null;
        } else if (gVar == null) {
            m34417a(1);
            throw null;
        } else if (fVar == null) {
            m34417a(2);
            throw null;
        } else if (aVar == null) {
            m34417a(3);
            throw null;
        } else if (n0Var != null) {
        } else {
            m34417a(4);
            throw null;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m34417a(int i) {
        String str = (i == 13 || i == 17 || i == 18 || i == 23 || i == 24) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 13 || i == 17 || i == 18 || i == 23 || i == 24) ? 2 : 3)];
        switch (i) {
            case 1:
            case 6:
            case 21:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 20:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 22:
                objArr[0] = "source";
                break;
            case 10:
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 15:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 16:
                objArr[0] = "visibility";
                break;
            case 13:
            case 17:
            case 18:
            case 23:
            case 24:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 19:
                objArr[0] = "newOwner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 13 || i == 17) {
            objArr[1] = "initialize";
        } else if (i == 18) {
            objArr[1] = "getOriginal";
        } else if (i == 23) {
            objArr[1] = "copy";
        } else if (i != 24) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
                objArr[2] = "initialize";
                break;
            case 13:
            case 17:
            case 18:
            case 23:
            case 24:
                break;
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 13 || i == 17 || i == 18 || i == 23 || i == 24) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: q */
    public C10382u.C10383a<? extends C10360m0> mo35465q() {
        C10382u.C10383a<? extends C10382u> q = super.mo35465q();
        if (q != null) {
            return q;
        }
        m34417a(24);
        throw null;
    }

    /* renamed from: a */
    public static C10289d0 m34416a(C10359m mVar, C10249g gVar, C9939f fVar, C10238b.C10239a aVar, C10362n0 n0Var) {
        if (mVar == null) {
            m34417a(5);
            throw null;
        } else if (gVar == null) {
            m34417a(6);
            throw null;
        } else if (fVar == null) {
            m34417a(7);
            throw null;
        } else if (aVar == null) {
            m34417a(8);
            throw null;
        } else if (n0Var != null) {
            return new C10289d0(mVar, (C10360m0) null, gVar, fVar, aVar, n0Var);
        } else {
            m34417a(9);
            throw null;
        }
    }

    /* renamed from: a */
    public C10289d0 m34423a(C10358l0 l0Var, C10358l0 l0Var2, List<? extends C10375s0> list, List<C10386v0> list2, C11824b0 b0Var, C10388w wVar, C10237a1 a1Var) {
        if (list == null) {
            m34417a(10);
            throw null;
        } else if (list2 == null) {
            m34417a(11);
            throw null;
        } else if (a1Var != null) {
            C10289d0 a = mo34226a(l0Var, l0Var2, list, list2, b0Var, wVar, a1Var, (Map<? extends C10230a.C10231a<?>, ?>) null);
            if (a != null) {
                return a;
            }
            m34417a(13);
            throw null;
        } else {
            m34417a(12);
            throw null;
        }
    }

    /* renamed from: a */
    public C10289d0 mo34226a(C10358l0 l0Var, C10358l0 l0Var2, List<? extends C10375s0> list, List<C10386v0> list2, C11824b0 b0Var, C10388w wVar, C10237a1 a1Var, Map<? extends C10230a.C10231a<?>, ?> map) {
        if (list == null) {
            m34417a(14);
            throw null;
        } else if (list2 == null) {
            m34417a(15);
            throw null;
        } else if (a1Var != null) {
            super.mo35464a(l0Var, l0Var2, list, list2, b0Var, wVar, a1Var);
            if (map != null && !map.isEmpty()) {
                this.f28046H = new LinkedHashMap(map);
            }
            return this;
        } else {
            m34417a(16);
            throw null;
        }
    }

    /* renamed from: a */
    public C10360m0 m34425a() {
        C10360m0 m0Var = (C10360m0) super.m34665a();
        if (m0Var != null) {
            return m0Var;
        }
        m34417a(18);
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C10322p mo33793a(C10359m mVar, C10382u uVar, C10238b.C10239a aVar, C9939f fVar, C10249g gVar, C10362n0 n0Var) {
        if (mVar == null) {
            m34417a(19);
            throw null;
        } else if (aVar == null) {
            m34417a(20);
            throw null;
        } else if (gVar == null) {
            m34417a(21);
            throw null;
        } else if (n0Var != null) {
            C10360m0 m0Var = (C10360m0) uVar;
            if (fVar == null) {
                fVar = getName();
            }
            return new C10289d0(mVar, m0Var, gVar, fVar, aVar, n0Var);
        } else {
            m34417a(22);
            throw null;
        }
    }

    /* renamed from: a */
    public C10360m0 m34426a(C10359m mVar, C10388w wVar, C10237a1 a1Var, C10238b.C10239a aVar, boolean z) {
        C10360m0 m0Var = (C10360m0) super.mo35421a(mVar, wVar, a1Var, aVar, z);
        if (m0Var != null) {
            return m0Var;
        }
        m34417a(23);
        throw null;
    }
}
