package kotlin.p045h0.p046u.p047e.p048k0.p380k;

import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.h0.u.e.k0.k.l0 */
/* compiled from: TypeWithEnhancement.kt */
public final class C11927l0 extends C11939n implements C11825b1 {

    /* renamed from: f */
    private final C11901j0 f31628f;

    /* renamed from: g */
    private final C11824b0 f31629g;

    public C11927l0(C11901j0 j0Var, C11824b0 b0Var) {
        C10202j.m34178b(j0Var, "delegate");
        C10202j.m34178b(b0Var, "enhancement");
        this.f31628f = j0Var;
        this.f31629g = b0Var;
    }

    /* renamed from: C */
    public C11824b0 mo38440C() {
        return this.f31629g;
    }

    /* renamed from: r */
    public C11834e1 mo38441r() {
        return mo34095y0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y0 */
    public C11901j0 mo34095y0() {
        return this.f31628f;
    }

    /* renamed from: a */
    public C11901j0 m39438a(C10249g gVar) {
        C10202j.m34178b(gVar, "newAnnotations");
        C11834e1 b = C11828c1.m38954b(mo38441r().mo34006a(gVar), mo38440C());
        if (b != null) {
            return (C11901j0) b;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
    }

    /* renamed from: a */
    public C11901j0 m39439a(boolean z) {
        C11834e1 b = C11828c1.m38954b(mo38441r().mo34007a(z), mo38440C().mo38439x0().mo34007a(z));
        if (b != null) {
            return (C11901j0) b;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
    }
}
