package kotlin.reflect.jvm.internal.impl.descriptors.p261d1;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11978z0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10237a1;
import kotlin.reflect.jvm.internal.impl.descriptors.C10238b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10273d;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10357l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10358l0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10364o;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10382u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10386v0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10388w;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.f */
/* compiled from: ClassConstructorDescriptorImpl */
public class C10296f extends C10322p implements C10273d {

    /* renamed from: J */
    private static final C9939f f27990J = C9939f.m33304d("<init>");

    /* renamed from: I */
    protected final boolean f27991I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C10296f(C10342e eVar, C10357l lVar, C10249g gVar, boolean z, C10238b.C10239a aVar, C10362n0 n0Var) {
        super(eVar, lVar, gVar, f27990J, aVar, n0Var);
        if (eVar == null) {
            m34457a(0);
            throw null;
        } else if (gVar == null) {
            m34457a(1);
            throw null;
        } else if (aVar == null) {
            m34457a(2);
            throw null;
        } else if (n0Var != null) {
            this.f27991I = z;
        } else {
            m34457a(3);
            throw null;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m34457a(int i) {
        String str;
        int i2;
        Throwable th;
        if (!(i == 19 || i == 25)) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i == 19 || i == 25)) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                    break;
                default:
                    i2 = 3;
                    break;
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 23:
                objArr[0] = "annotations";
                break;
            case 2:
            case 22:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 9:
            case 24:
                objArr[0] = "source";
                break;
            case 10:
            case 13:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
            case 14:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "typeParameterDescriptors";
                break;
            case 15:
            case 16:
            case 17:
            case 19:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                break;
            case 18:
                objArr[0] = "originalSubstitutor";
                break;
            case 20:
                objArr[0] = "overriddenDescriptors";
                break;
            case 21:
                objArr[0] = "newOwner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 19) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i != 25) {
            switch (i) {
                case 15:
                    objArr[1] = "getContainingDeclaration";
                    break;
                case 16:
                    objArr[1] = "getConstructedClass";
                    break;
                case 17:
                    objArr[1] = "getOriginal";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "create";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSynthesized";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                objArr[2] = "initialize";
                break;
            case 15:
            case 16:
            case 17:
            case 19:
            case 25:
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            case 20:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i == 19 || i == 25)) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    /* renamed from: a */
    public void mo35422a(Collection<? extends C10238b> collection) {
        if (collection == null) {
            m34457a(20);
            throw null;
        }
    }

    /* renamed from: d */
    public Collection<? extends C10382u> mo35406d() {
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        m34457a(19);
        throw null;
    }

    /* renamed from: r */
    public C10358l0 mo34228r() {
        C10342e b = m34479b();
        if (!b.mo33770k()) {
            return null;
        }
        C10359m b2 = b.mo33762b();
        if (b2 instanceof C10342e) {
            return ((C10342e) b2).mo35452t0();
        }
        return null;
    }

    /* renamed from: w */
    public boolean mo35472w() {
        return this.f27991I;
    }

    /* renamed from: x */
    public C10342e mo35473x() {
        C10342e b = m34479b();
        if (b != null) {
            return b;
        }
        m34457a(16);
        throw null;
    }

    /* renamed from: b */
    public C10342e m34479b() {
        C10342e eVar = (C10342e) super.mo33762b();
        if (eVar != null) {
            return eVar;
        }
        m34457a(15);
        throw null;
    }

    /* renamed from: a */
    public static C10296f m34456a(C10342e eVar, C10249g gVar, boolean z, C10362n0 n0Var) {
        if (eVar == null) {
            m34457a(4);
            throw null;
        } else if (gVar == null) {
            m34457a(5);
            throw null;
        } else if (n0Var != null) {
            return new C10296f(eVar, (C10357l) null, gVar, z, C10238b.C10239a.DECLARATION, n0Var);
        } else {
            m34457a(6);
            throw null;
        }
    }

    /* renamed from: a */
    public C10296f mo35471a(List<C10386v0> list, C10237a1 a1Var, List<C10375s0> list2) {
        if (list == null) {
            m34457a(10);
            throw null;
        } else if (a1Var == null) {
            m34457a(11);
            throw null;
        } else if (list2 != null) {
            super.mo35464a((C10358l0) null, mo34228r(), list2, list, (C11824b0) null, C10388w.FINAL, a1Var);
            return this;
        } else {
            m34457a(12);
            throw null;
        }
    }

    /* renamed from: a */
    public C10296f mo35470a(List<C10386v0> list, C10237a1 a1Var) {
        if (list == null) {
            m34457a(13);
            throw null;
        } else if (a1Var != null) {
            mo35471a(list, a1Var, m34479b().mo33776s());
            return this;
        } else {
            m34457a(14);
            throw null;
        }
    }

    /* renamed from: a */
    public C10273d m34466a() {
        C10273d dVar = (C10273d) super.m34665a();
        if (dVar != null) {
            return dVar;
        }
        m34457a(17);
        throw null;
    }

    /* renamed from: a */
    public C10273d m34474a(C11978z0 z0Var) {
        if (z0Var != null) {
            return (C10273d) super.mo35448a(z0Var);
        }
        m34457a(18);
        throw null;
    }

    /* renamed from: a */
    public <R, D> R mo35440a(C10364o<R, D> oVar, D d) {
        return oVar.mo33629a((C10357l) this, d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C10296f m34465a(C10359m mVar, C10382u uVar, C10238b.C10239a aVar, C9939f fVar, C10249g gVar, C10362n0 n0Var) {
        if (mVar == null) {
            m34457a(21);
            throw null;
        } else if (aVar == null) {
            m34457a(22);
            throw null;
        } else if (gVar == null) {
            m34457a(23);
            throw null;
        } else if (n0Var == null) {
            m34457a(24);
            throw null;
        } else if (aVar == C10238b.C10239a.DECLARATION || aVar == C10238b.C10239a.SYNTHESIZED) {
            return new C10296f((C10342e) mVar, this, gVar, this.f27991I, C10238b.C10239a.DECLARATION, n0Var);
        } else {
            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\n" + "newOwner: " + mVar + "\n" + "kind: " + aVar);
        }
    }

    /* renamed from: a */
    public C10273d m34468a(C10359m mVar, C10388w wVar, C10237a1 a1Var, C10238b.C10239a aVar, boolean z) {
        C10273d dVar = (C10273d) super.mo35421a(mVar, wVar, a1Var, aVar, z);
        if (dVar != null) {
            return dVar;
        }
        m34457a(25);
        throw null;
    }
}
