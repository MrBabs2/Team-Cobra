package kotlin.reflect.jvm.internal.impl.descriptors.p261d1;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.p256n.C10119h;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11838f1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11978z0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10230a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10237a1;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10346f0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10358l0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10364o;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10386v0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10397z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.c */
/* compiled from: AbstractReceiverParameterDescriptor */
public abstract class C10284c extends C10309j implements C10358l0 {

    /* renamed from: h */
    private static final C9939f f27966h = C9939f.m33304d("<this>");

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10284c(C10249g gVar) {
        super(gVar, f27966h);
        if (gVar != null) {
        } else {
            m34377a(0);
            throw null;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m34377a(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "substitutor";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i) {
            case 2:
                objArr[1] = "getTypeParameters";
                break;
            case 3:
                objArr[1] = "getType";
                break;
            case 4:
                objArr[1] = "getValueParameters";
                break;
            case 5:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 6:
                objArr[1] = "getVisibility";
                break;
            case 7:
                objArr[1] = "getOriginal";
                break;
            case 8:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "substitute";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: A */
    public boolean mo34221A() {
        return false;
    }

    /* renamed from: X */
    public C10358l0 mo35403X() {
        return null;
    }

    /* renamed from: a */
    public <V> V mo34229a(C10230a.C10231a<V> aVar) {
        return null;
    }

    /* renamed from: a */
    public C10346f0 m34383a() {
        return this;
    }

    /* renamed from: b0 */
    public C10358l0 mo35405b0() {
        return null;
    }

    /* renamed from: d */
    public Collection<? extends C10230a> mo35406d() {
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        m34377a(5);
        throw null;
    }

    /* renamed from: f */
    public List<C10386v0> mo35407f() {
        List<C10386v0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        m34377a(4);
        throw null;
    }

    public C11824b0 getReturnType() {
        return getType();
    }

    public C11824b0 getType() {
        C11824b0 type = getValue().getType();
        if (type != null) {
            return type;
        }
        m34377a(3);
        throw null;
    }

    public List<C10375s0> getTypeParameters() {
        List<C10375s0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        m34377a(2);
        throw null;
    }

    public C10237a1 getVisibility() {
        C10237a1 a1Var = C10397z0.f28193f;
        if (a1Var != null) {
            return a1Var;
        }
        m34377a(6);
        throw null;
    }

    /* renamed from: p */
    public C10362n0 mo33773p() {
        C10362n0 n0Var = C10362n0.f28175a;
        if (n0Var != null) {
            return n0Var;
        }
        m34377a(8);
        throw null;
    }

    /* renamed from: a */
    public C10358l0 m34386a(C11978z0 z0Var) {
        C11824b0 b0Var;
        if (z0Var == null) {
            m34377a(1);
            throw null;
        } else if (z0Var.mo38622b()) {
            return this;
        } else {
            if (mo33762b() instanceof C10342e) {
                b0Var = z0Var.mo38620b(getType(), C11838f1.OUT_VARIANCE);
            } else {
                b0Var = z0Var.mo38620b(getType(), C11838f1.INVARIANT);
            }
            if (b0Var == null) {
                return null;
            }
            if (b0Var == getType()) {
                return this;
            }
            return new C10285c0(mo33762b(), new C10119h(b0Var), getAnnotations());
        }
    }

    /* renamed from: a */
    public <R, D> R mo35440a(C10364o<R, D> oVar, D d) {
        return oVar.mo35125a((C10358l0) this, d);
    }
}
