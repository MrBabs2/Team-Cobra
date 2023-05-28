package kotlin.p045h0.p046u.p047e.p048k0.p380k;

import kotlin.jvm.internal.C10202j;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.h0.u.e.k0.k.o */
/* compiled from: KotlinTypeFactory.kt */
public abstract class C11942o extends C11939n {

    /* renamed from: f */
    private final C11901j0 f31646f;

    public C11942o(C11901j0 j0Var) {
        C10202j.m34178b(j0Var, "delegate");
        this.f31646f = j0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y0 */
    public C11901j0 mo34095y0() {
        return this.f31646f;
    }

    /* renamed from: a */
    public C11942o m39488a(C10249g gVar) {
        C10202j.m34178b(gVar, "newAnnotations");
        return gVar != getAnnotations() ? new C11896i(this, gVar) : this;
    }

    /* renamed from: a */
    public C11901j0 m39487a(boolean z) {
        if (z == mo34094w0()) {
            return this;
        }
        return mo34095y0().mo34007a(z).mo34006a(getAnnotations());
    }
}
