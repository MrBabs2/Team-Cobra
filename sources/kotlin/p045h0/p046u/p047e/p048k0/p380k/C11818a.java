package kotlin.p045h0.p046u.p047e.p048k0.p380k;

import kotlin.jvm.internal.C10202j;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.h0.u.e.k0.k.a */
/* compiled from: SpecialTypes.kt */
public final class C11818a extends C11939n {

    /* renamed from: f */
    private final C11901j0 f31520f;

    /* renamed from: g */
    private final C11901j0 f31521g;

    public C11818a(C11901j0 j0Var, C11901j0 j0Var2) {
        C10202j.m34178b(j0Var, "delegate");
        C10202j.m34178b(j0Var2, "abbreviation");
        this.f31520f = j0Var;
        this.f31521g = j0Var2;
    }

    /* renamed from: Q */
    public final C11901j0 mo38427Q() {
        return mo34095y0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y0 */
    public C11901j0 mo34095y0() {
        return this.f31520f;
    }

    /* renamed from: z0 */
    public final C11901j0 mo38428z0() {
        return this.f31521g;
    }

    /* renamed from: a */
    public C11818a m38891a(C10249g gVar) {
        C10202j.m34178b(gVar, "newAnnotations");
        return new C11818a(mo34095y0().mo34006a(gVar), this.f31521g);
    }

    /* renamed from: a */
    public C11818a m38892a(boolean z) {
        return new C11818a(mo34095y0().mo34007a(z), this.f31521g.mo34007a(z));
    }
}
