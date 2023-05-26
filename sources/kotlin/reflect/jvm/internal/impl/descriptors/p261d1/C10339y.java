package kotlin.reflect.jvm.internal.impl.descriptors.p261d1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11978z0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10230a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10237a1;
import kotlin.reflect.jvm.internal.impl.descriptors.C10238b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10350h0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10352i0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10358l0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10382u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10388w;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.y */
/* compiled from: PropertyAccessorDescriptorImpl */
public abstract class C10339y extends C10311k implements C10350h0 {

    /* renamed from: j */
    private boolean f28127j;

    /* renamed from: k */
    private final boolean f28128k;

    /* renamed from: l */
    private final C10388w f28129l;

    /* renamed from: m */
    private final C10352i0 f28130m;

    /* renamed from: n */
    private final boolean f28131n;

    /* renamed from: o */
    private final C10238b.C10239a f28132o;

    /* renamed from: p */
    private C10237a1 f28133p;

    /* renamed from: q */
    private C10382u f28134q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10339y(C10388w wVar, C10237a1 a1Var, C10352i0 i0Var, C10249g gVar, C9939f fVar, boolean z, boolean z2, boolean z3, C10238b.C10239a aVar, C10362n0 n0Var) {
        super(i0Var.mo33762b(), gVar, fVar, n0Var);
        if (wVar == null) {
            m34841a(0);
            throw null;
        } else if (a1Var == null) {
            m34841a(1);
            throw null;
        } else if (i0Var == null) {
            m34841a(2);
            throw null;
        } else if (gVar == null) {
            m34841a(3);
            throw null;
        } else if (fVar == null) {
            m34841a(4);
            throw null;
        } else if (n0Var != null) {
            this.f28134q = null;
            this.f28129l = wVar;
            this.f28133p = a1Var;
            this.f28130m = i0Var;
            this.f28127j = z;
            this.f28128k = z2;
            this.f28131n = z3;
            this.f28132o = aVar;
        } else {
            m34841a(5);
            throw null;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m34841a(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 14:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getModality";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 12:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 13:
                objArr[1] = "getOverriddenDescriptors";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 14:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
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

    /* renamed from: F */
    public boolean mo33758F() {
        return false;
    }

    /* renamed from: I */
    public boolean mo33792I() {
        return false;
    }

    /* renamed from: J */
    public boolean mo35499J() {
        return false;
    }

    /* renamed from: P */
    public boolean mo35569P() {
        return this.f28127j;
    }

    /* renamed from: W */
    public C10382u mo35500W() {
        return this.f28134q;
    }

    /* renamed from: X */
    public C10358l0 mo35403X() {
        return mo35574l0().mo35403X();
    }

    /* renamed from: a */
    public <V> V mo34229a(C10230a.C10231a<V> aVar) {
        return null;
    }

    /* renamed from: a */
    public abstract C10350h0 m34854a();

    /* renamed from: a */
    public void mo35422a(Collection<? extends C10238b> collection) {
        if (collection == null) {
            m34841a(14);
            throw null;
        }
    }

    /* renamed from: b */
    public void mo35573b(boolean z) {
        this.f28127j = z;
    }

    /* renamed from: b0 */
    public C10358l0 mo35405b0() {
        return mo35574l0().mo35405b0();
    }

    /* renamed from: g */
    public C10238b.C10239a mo35423g() {
        C10238b.C10239a aVar = this.f28132o;
        if (aVar != null) {
            return aVar;
        }
        m34841a(6);
        throw null;
    }

    public List<C10375s0> getTypeParameters() {
        List<C10375s0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        m34841a(8);
        throw null;
    }

    public C10237a1 getVisibility() {
        C10237a1 a1Var = this.f28133p;
        if (a1Var != null) {
            return a1Var;
        }
        m34841a(10);
        throw null;
    }

    /* renamed from: i */
    public C10388w mo33767i() {
        C10388w wVar = this.f28129l;
        if (wVar != null) {
            return wVar;
        }
        m34841a(9);
        throw null;
    }

    public boolean isInline() {
        return this.f28131n;
    }

    public boolean isSuspend() {
        return false;
    }

    /* renamed from: j0 */
    public boolean mo35514j0() {
        return false;
    }

    /* renamed from: l0 */
    public C10352i0 mo35574l0() {
        C10352i0 i0Var = this.f28130m;
        if (i0Var != null) {
            return i0Var;
        }
        m34841a(12);
        throw null;
    }

    /* renamed from: m0 */
    public boolean mo35515m0() {
        return false;
    }

    /* renamed from: o0 */
    public boolean mo33772o0() {
        return false;
    }

    /* renamed from: p0 */
    public boolean mo35516p0() {
        return false;
    }

    /* renamed from: q */
    public C10382u.C10383a<? extends C10382u> mo35465q() {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    /* renamed from: u */
    public boolean mo33778u() {
        return this.f28128k;
    }

    /* renamed from: a */
    public C10382u m34860a(C11978z0 z0Var) {
        if (z0Var == null) {
            m34841a(7);
            throw null;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo35571a(C10237a1 a1Var) {
        this.f28133p = a1Var;
    }

    /* renamed from: a */
    public C10350h0 m34855a(C10359m mVar, C10388w wVar, C10237a1 a1Var, C10238b.C10239a aVar, boolean z) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Collection<C10350h0> mo35570a(boolean z) {
        ArrayList arrayList = new ArrayList(0);
        for (C10352i0 i0Var : mo35574l0().mo35406d()) {
            Object getter = z ? i0Var.getGetter() : i0Var.getSetter();
            if (getter != null) {
                arrayList.add(getter);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo35572a(C10382u uVar) {
        this.f28134q = uVar;
    }
}
