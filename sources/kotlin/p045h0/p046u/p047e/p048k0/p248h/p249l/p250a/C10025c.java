package kotlin.p045h0.p046u.p047e.p048k0.p248h.p249l.p250a;

import java.util.Collection;
import java.util.List;
import kotlin.C10485x;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11838f1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11965u0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p381h1.C11873j;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;

/* renamed from: kotlin.h0.u.e.k0.h.l.a.c */
/* compiled from: CapturedTypeConstructor.kt */
public final class C10025c implements C10024b {

    /* renamed from: a */
    private C11873j f27618a;

    /* renamed from: b */
    private final C11965u0 f27619b;

    public C10025c(C11965u0 u0Var) {
        C10202j.m34178b(u0Var, "projection");
        this.f27619b = u0Var;
        boolean z = mo35228d().mo38596a() != C11838f1.INVARIANT;
        if (C10485x.f28360a && !z) {
            throw new AssertionError("Only nontrivial projections can be captured, not: " + mo35228d());
        }
    }

    /* renamed from: a */
    public final void mo35230a(C11873j jVar) {
        this.f27618a = jVar;
    }

    /* renamed from: b */
    public Void mo33781b() {
        return null;
    }

    /* renamed from: c */
    public boolean mo33782c() {
        return false;
    }

    /* renamed from: d */
    public C11965u0 mo35228d() {
        return this.f27619b;
    }

    /* renamed from: e */
    public final C11873j mo35231e() {
        return this.f27618a;
    }

    public List<C10375s0> getParameters() {
        return C10529o.m35736a();
    }

    /* renamed from: l */
    public C9333g mo35232l() {
        C9333g l = mo35228d().getType().mo35227v0().mo35232l();
        C10202j.m34174a((Object) l, "projection.type.constructor.builtIns");
        return l;
    }

    public String toString() {
        return "CapturedTypeConstructor(" + mo35228d() + ')';
    }

    /* renamed from: a */
    public Collection<C11824b0> mo35229a() {
        Object obj;
        if (mo35228d().mo38596a() == C11838f1.OUT_VARIANCE) {
            obj = mo35228d().getType();
        } else {
            obj = mo35232l().mo33725u();
        }
        C10202j.m34174a(obj, "if (projection.projectio… builtIns.nullableAnyType");
        return C10527n.m35729a(obj);
    }
}
