package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p237z;

import java.util.List;
import java.util.Map;
import kotlin.C10221n;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C9997b;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p386l.C12001i;
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
import kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10289d0;

/* renamed from: kotlin.h0.u.e.k0.c.a.z.f */
/* compiled from: JavaMethodDescriptor */
public class C9670f extends C10289d0 implements C9666b {

    /* renamed from: J */
    public static final C10230a.C10231a<C10386v0> f26594J = new C9671a();

    /* renamed from: I */
    private C9672b f26595I;

    /* renamed from: kotlin.h0.u.e.k0.c.a.z.f$a */
    /* compiled from: JavaMethodDescriptor */
    static class C9671a implements C10230a.C10231a<C10386v0> {
        C9671a() {
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.c.a.z.f$b */
    /* compiled from: JavaMethodDescriptor */
    private enum C9672b {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);
        

        /* renamed from: f */
        public final boolean f26601f;

        /* renamed from: g */
        public final boolean f26602g;

        private C9672b(boolean z, boolean z2) {
            this.f26601f = z;
            this.f26602g = z2;
        }

        /* renamed from: a */
        public static C9672b m31172a(boolean z, boolean z2) {
            C9672b bVar = z ? z2 ? STABLE_SYNTHESIZED : STABLE_DECLARED : z2 ? NON_STABLE_SYNTHESIZED : NON_STABLE_DECLARED;
            if (bVar != null) {
                return bVar;
            }
            m31173a(0);
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C9670f(C10359m mVar, C10360m0 m0Var, C10249g gVar, C9939f fVar, C10238b.C10239a aVar, C10362n0 n0Var) {
        super(mVar, m0Var, gVar, fVar, aVar, n0Var);
        if (mVar == null) {
            m31163a(0);
            throw null;
        } else if (gVar == null) {
            m31163a(1);
            throw null;
        } else if (fVar == null) {
            m31163a(2);
            throw null;
        } else if (aVar == null) {
            m31163a(3);
            throw null;
        } else if (n0Var != null) {
            this.f26595I = null;
        } else {
            m31163a(4);
            throw null;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m31163a(int i) {
        String str = (i == 12 || i == 17 || i == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 12 || i == 17 || i == 20) ? 2 : 3)];
        switch (i) {
            case 1:
            case 6:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 14:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 16:
                objArr[0] = "source";
                break;
            case 9:
                objArr[0] = "typeParameters";
                break;
            case 10:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
                objArr[0] = "visibility";
                break;
            case 12:
            case 17:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 18:
                objArr[0] = "enhancedValueParametersData";
                break;
            case 19:
                objArr[0] = "enhancedReturnType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 12) {
            objArr[1] = "initialize";
        } else if (i == 17) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
                objArr[2] = "initialize";
                break;
            case 12:
            case 17:
            case 20:
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 18:
            case 19:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 12 || i == 17 || i == 20) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: A */
    public boolean mo34221A() {
        return this.f26595I.f26602g;
    }

    /* renamed from: r */
    public boolean mo34228r() {
        return this.f26595I.f26601f;
    }

    /* renamed from: a */
    public static C9670f m31162a(C10359m mVar, C10249g gVar, C9939f fVar, C10362n0 n0Var) {
        if (mVar == null) {
            m31163a(5);
            throw null;
        } else if (gVar == null) {
            m31163a(6);
            throw null;
        } else if (fVar == null) {
            m31163a(7);
            throw null;
        } else if (n0Var != null) {
            return new C9670f(mVar, (C10360m0) null, gVar, fVar, C10238b.C10239a.DECLARATION, n0Var);
        } else {
            m31163a(8);
            throw null;
        }
    }

    /* renamed from: a */
    public C10289d0 mo34226a(C10358l0 l0Var, C10358l0 l0Var2, List<? extends C10375s0> list, List<C10386v0> list2, C11824b0 b0Var, C10388w wVar, C10237a1 a1Var, Map<? extends C10230a.C10231a<?>, ?> map) {
        if (list == null) {
            m31163a(9);
            throw null;
        } else if (list2 == null) {
            m31163a(10);
            throw null;
        } else if (a1Var != null) {
            super.mo34226a(l0Var, l0Var2, list, list2, b0Var, wVar, a1Var, map);
            mo35510h(C12001i.f31711b.mo38625a(this).mo38629a());
            return this;
        } else {
            m31163a(11);
            throw null;
        }
    }

    /* renamed from: a */
    public void mo34227a(boolean z, boolean z2) {
        this.f26595I = C9672b.m31172a(z, z2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9670f m31169a(C10359m mVar, C10382u uVar, C10238b.C10239a aVar, C9939f fVar, C10249g gVar, C10362n0 n0Var) {
        if (mVar == null) {
            m31163a(13);
            throw null;
        } else if (aVar == null) {
            m31163a(14);
            throw null;
        } else if (gVar == null) {
            m31163a(15);
            throw null;
        } else if (n0Var != null) {
            C10360m0 m0Var = (C10360m0) uVar;
            if (fVar == null) {
                fVar = getName();
            }
            C9670f fVar2 = new C9670f(mVar, m0Var, gVar, fVar, aVar, n0Var);
            fVar2.mo34227a(mo34228r(), mo34221A());
            return fVar2;
        } else {
            m31163a(16);
            throw null;
        }
    }

    /* renamed from: a */
    public C9670f m31166a(C11824b0 b0Var, List<C9678l> list, C11824b0 b0Var2, C10221n<C10230a.C10231a<?>, ?> nVar) {
        C10358l0 l0Var;
        if (list == null) {
            m31163a(18);
            throw null;
        } else if (b0Var2 != null) {
            List<C10386v0> a = C9677k.m31182a(list, mo35407f(), this);
            if (b0Var == null) {
                l0Var = null;
            } else {
                l0Var = C9997b.m33649a((C10230a) this, b0Var, C10249g.f27910c.mo35429a());
            }
            C9670f fVar = (C9670f) mo35465q().mo35517a(a).mo35519a(b0Var2).mo35532b(l0Var).mo35530b().mo35534c().mo35529a();
            if (nVar != null) {
                fVar.mo35502a(nVar.mo35391c(), (Object) nVar.mo35392d());
            }
            if (fVar != null) {
                return fVar;
            }
            m31163a(20);
            throw null;
        } else {
            m31163a(19);
            throw null;
        }
    }
}
