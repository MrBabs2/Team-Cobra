package kotlin.reflect.jvm.internal.impl.descriptors.p261d1;

import java.util.ArrayList;
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
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.w */
/* compiled from: MutableClassDescriptor */
public class C10337w extends C10298g {

    /* renamed from: m */
    private final C10345f f28118m;

    /* renamed from: n */
    private final boolean f28119n;

    /* renamed from: o */
    private C10388w f28120o;

    /* renamed from: p */
    private C10237a1 f28121p;

    /* renamed from: q */
    private C11953s0 f28122q;

    /* renamed from: r */
    private List<C10375s0> f28123r;

    /* renamed from: s */
    private final Collection<C11824b0> f28124s;

    /* renamed from: t */
    private final C11817i f28125t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10337w(C10359m mVar, C10345f fVar, boolean z, boolean z2, C9939f fVar2, C10362n0 n0Var, C11817i iVar) {
        super(iVar, mVar, fVar2, n0Var, z2);
        if (mVar == null) {
            m34815a(0);
            throw null;
        } else if (fVar == null) {
            m34815a(1);
            throw null;
        } else if (fVar2 == null) {
            m34815a(2);
            throw null;
        } else if (n0Var == null) {
            m34815a(3);
            throw null;
        } else if (iVar != null) {
            this.f28124s = new ArrayList();
            this.f28125t = iVar;
            this.f28118m = fVar;
            this.f28119n = z;
        } else {
            m34815a(4);
            throw null;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m34815a(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
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
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
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
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 16:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 17:
                objArr[1] = "getStaticScope";
                break;
            case 18:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 16:
            case 17:
            case 18:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
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
        m34815a(18);
        throw null;
    }

    /* renamed from: F */
    public boolean mo33758F() {
        return false;
    }

    /* renamed from: L */
    public C10273d mo33759L() {
        return null;
    }

    /* renamed from: M */
    public C10096h mo33760M() {
        C10096h.C10099b bVar = C10096h.C10099b.f27722b;
        if (bVar != null) {
            return bVar;
        }
        m34815a(17);
        throw null;
    }

    /* renamed from: O */
    public C10342e mo33761O() {
        return null;
    }

    /* renamed from: a */
    public void mo35566a(C10388w wVar) {
        if (wVar != null) {
            this.f28120o = wVar;
        } else {
            m34815a(6);
            throw null;
        }
    }

    /* renamed from: g */
    public C10345f mo33763g() {
        C10345f fVar = this.f28118m;
        if (fVar != null) {
            return fVar;
        }
        m34815a(8);
        throw null;
    }

    public C10249g getAnnotations() {
        C10249g a = C10249g.f27910c.mo35429a();
        if (a != null) {
            return a;
        }
        m34815a(5);
        throw null;
    }

    public C10237a1 getVisibility() {
        C10237a1 a1Var = this.f28121p;
        if (a1Var != null) {
            return a1Var;
        }
        m34815a(10);
        throw null;
    }

    /* renamed from: h */
    public C11953s0 mo33766h() {
        C11953s0 s0Var = this.f28122q;
        if (s0Var != null) {
            return s0Var;
        }
        m34815a(11);
        throw null;
    }

    /* renamed from: i */
    public C10388w mo33767i() {
        C10388w wVar = this.f28120o;
        if (wVar != null) {
            return wVar;
        }
        m34815a(7);
        throw null;
    }

    public boolean isInline() {
        return false;
    }

    /* renamed from: k */
    public boolean mo33770k() {
        return this.f28119n;
    }

    /* renamed from: n0 */
    public C10096h mo33771n0() {
        C10096h.C10099b bVar = C10096h.C10099b.f27722b;
        if (bVar != null) {
            return bVar;
        }
        m34815a(16);
        throw null;
    }

    /* renamed from: o0 */
    public boolean mo33772o0() {
        return false;
    }

    /* renamed from: r */
    public void mo35567r() {
        this.f28122q = new C11900j(this, this.f28123r, this.f28124s, this.f28125t);
        for (C10273d dVar : mo33769j()) {
            ((C10296f) dVar).mo35501a((C11824b0) mo35445o());
        }
    }

    /* renamed from: r0 */
    public boolean mo33775r0() {
        return false;
    }

    /* renamed from: s */
    public List<C10375s0> mo33776s() {
        List<C10375s0> list = this.f28123r;
        if (list != null) {
            return list;
        }
        m34815a(15);
        throw null;
    }

    public String toString() {
        return C10309j.m34570a((C10359m) this);
    }

    /* renamed from: v */
    public boolean mo33779v() {
        return false;
    }

    /* renamed from: j */
    public Set<C10273d> m34828j() {
        Set<C10273d> emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        m34815a(13);
        throw null;
    }

    /* renamed from: a */
    public void mo35565a(C10237a1 a1Var) {
        if (a1Var != null) {
            this.f28121p = a1Var;
        } else {
            m34815a(9);
            throw null;
        }
    }

    /* renamed from: a */
    public void mo35564a(List<C10375s0> list) {
        if (list == null) {
            m34815a(14);
            throw null;
        } else if (this.f28123r == null) {
            this.f28123r = new ArrayList(list);
        } else {
            throw new IllegalStateException("Type parameters are already set for " + getName());
        }
    }
}
