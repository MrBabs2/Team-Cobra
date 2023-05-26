package kotlin.reflect.jvm.internal.impl.descriptors.p261d1;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10096h;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11817i;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11900j;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11953s0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10237a1;
import kotlin.reflect.jvm.internal.impl.descriptors.C10273d;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10345f;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10388w;
import kotlin.reflect.jvm.internal.impl.descriptors.C10397z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.h */
/* compiled from: ClassDescriptorImpl */
public class C10302h extends C10298g {

    /* renamed from: m */
    private final C10388w f28001m;

    /* renamed from: n */
    private final C10345f f28002n;

    /* renamed from: o */
    private final C11953s0 f28003o;

    /* renamed from: p */
    private C10096h f28004p;

    /* renamed from: q */
    private Set<C10273d> f28005q;

    /* renamed from: r */
    private C10273d f28006r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10302h(C10359m mVar, C9939f fVar, C10388w wVar, C10345f fVar2, Collection<C11824b0> collection, C10362n0 n0Var, boolean z, C11817i iVar) {
        super(iVar, mVar, fVar, n0Var, z);
        if (mVar == null) {
            m34515a(0);
            throw null;
        } else if (fVar == null) {
            m34515a(1);
            throw null;
        } else if (wVar == null) {
            m34515a(2);
            throw null;
        } else if (fVar2 == null) {
            m34515a(3);
            throw null;
        } else if (collection == null) {
            m34515a(4);
            throw null;
        } else if (n0Var == null) {
            m34515a(5);
            throw null;
        } else if (iVar != null) {
            this.f28001m = wVar;
            this.f28002n = fVar2;
            this.f28003o = new C11900j(this, Collections.emptyList(), collection, iVar);
        } else {
            m34515a(6);
            throw null;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m34515a(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 13:
                objArr[1] = "getStaticScope";
                break;
            case 14:
                objArr[1] = "getKind";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 17:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 18:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
        }
        switch (i) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: E */
    public Collection<C10342e> mo33757E() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        m34515a(18);
        throw null;
    }

    /* renamed from: F */
    public boolean mo33758F() {
        return false;
    }

    /* renamed from: L */
    public C10273d mo33759L() {
        return this.f28006r;
    }

    /* renamed from: M */
    public C10096h mo33760M() {
        C10096h.C10099b bVar = C10096h.C10099b.f27722b;
        if (bVar != null) {
            return bVar;
        }
        m34515a(13);
        throw null;
    }

    /* renamed from: O */
    public C10342e mo33761O() {
        return null;
    }

    /* renamed from: a */
    public final void mo35477a(C10096h hVar, Set<C10273d> set, C10273d dVar) {
        if (hVar == null) {
            m34515a(7);
            throw null;
        } else if (set != null) {
            this.f28004p = hVar;
            this.f28005q = set;
            this.f28006r = dVar;
        } else {
            m34515a(8);
            throw null;
        }
    }

    /* renamed from: g */
    public C10345f mo33763g() {
        C10345f fVar = this.f28002n;
        if (fVar != null) {
            return fVar;
        }
        m34515a(14);
        throw null;
    }

    public C10249g getAnnotations() {
        C10249g a = C10249g.f27910c.mo35429a();
        if (a != null) {
            return a;
        }
        m34515a(9);
        throw null;
    }

    public C10237a1 getVisibility() {
        C10237a1 a1Var = C10397z0.f28192e;
        if (a1Var != null) {
            return a1Var;
        }
        m34515a(16);
        throw null;
    }

    /* renamed from: h */
    public C11953s0 mo33766h() {
        C11953s0 s0Var = this.f28003o;
        if (s0Var != null) {
            return s0Var;
        }
        m34515a(10);
        throw null;
    }

    /* renamed from: i */
    public C10388w mo33767i() {
        C10388w wVar = this.f28001m;
        if (wVar != null) {
            return wVar;
        }
        m34515a(15);
        throw null;
    }

    public boolean isInline() {
        return false;
    }

    /* renamed from: j */
    public Collection<C10273d> mo33769j() {
        Set<C10273d> set = this.f28005q;
        if (set != null) {
            return set;
        }
        m34515a(11);
        throw null;
    }

    /* renamed from: k */
    public boolean mo33770k() {
        return false;
    }

    /* renamed from: n0 */
    public C10096h mo33771n0() {
        C10096h hVar = this.f28004p;
        if (hVar != null) {
            return hVar;
        }
        m34515a(12);
        throw null;
    }

    /* renamed from: o0 */
    public boolean mo33772o0() {
        return false;
    }

    /* renamed from: r0 */
    public boolean mo33775r0() {
        return false;
    }

    /* renamed from: s */
    public List<C10375s0> mo33776s() {
        List<C10375s0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        m34515a(17);
        throw null;
    }

    public String toString() {
        return "class " + getName();
    }

    /* renamed from: v */
    public boolean mo33779v() {
        return false;
    }
}
