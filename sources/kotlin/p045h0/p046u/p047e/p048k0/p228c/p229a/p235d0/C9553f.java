package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0;

import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11821a1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11827c0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11828c1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11834e1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11847g0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11939n;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11966v;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p384k1.C11924a;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.h0.u.e.k0.c.a.d0.f */
/* compiled from: typeEnhancement.kt */
public final class C9553f extends C11939n implements C11847g0 {

    /* renamed from: f */
    private final C11901j0 f26403f;

    public C9553f(C11901j0 j0Var) {
        C10202j.m34178b(j0Var, "delegate");
        this.f26403f = j0Var;
    }

    /* renamed from: B */
    public boolean mo34092B() {
        return true;
    }

    /* renamed from: w0 */
    public boolean mo34094w0() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y0 */
    public C11901j0 mo34095y0() {
        return this.f26403f;
    }

    /* renamed from: a */
    public C11824b0 mo34093a(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, "replacement");
        C11834e1 x0 = b0Var.mo38439x0();
        if (!C11821a1.m38916g(x0) && !C11924a.m39419c(x0)) {
            return x0;
        }
        if (x0 instanceof C11901j0) {
            return m30893a((C11901j0) x0);
        }
        if (x0 instanceof C11966v) {
            C11966v vVar = (C11966v) x0;
            return C11828c1.m38954b(C11827c0.m38946a(m30893a(vVar.mo38609z0()), m30893a(vVar.mo38607A0())), C11828c1.m38951a(x0));
        }
        throw new IllegalStateException(("Incorrect type: " + x0).toString());
    }

    /* renamed from: a */
    private final C11901j0 m30893a(C11901j0 j0Var) {
        C11901j0 a = j0Var.mo34007a(false);
        if (!C11924a.m39419c(j0Var)) {
            return a;
        }
        return new C9553f(a);
    }

    /* renamed from: a */
    public C9553f m30899a(C10249g gVar) {
        C10202j.m34178b(gVar, "newAnnotations");
        return new C9553f(mo34095y0().mo34006a(gVar));
    }

    /* renamed from: a */
    public C11901j0 m30900a(boolean z) {
        return z ? mo34095y0().mo34007a(true) : this;
    }
}
