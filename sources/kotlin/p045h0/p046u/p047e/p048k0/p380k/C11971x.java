package kotlin.p045h0.p046u.p047e.p048k0.p380k;

import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p247g.C9949c;
import kotlin.p045h0.p046u.p047e.p048k0.p247g.C9977i;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.h0.u.e.k0.k.x */
/* compiled from: TypeWithEnhancement.kt */
public final class C11971x extends C11966v implements C11825b1 {

    /* renamed from: h */
    private final C11966v f31678h;

    /* renamed from: i */
    private final C11824b0 f31679i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11971x(C11966v vVar, C11824b0 b0Var) {
        super(vVar.mo38609z0(), vVar.mo38607A0());
        C10202j.m34178b(vVar, "origin");
        C10202j.m34178b(b0Var, "enhancement");
        this.f31678h = vVar;
        this.f31679i = b0Var;
    }

    /* renamed from: C */
    public C11824b0 mo38440C() {
        return this.f31679i;
    }

    /* renamed from: a */
    public C11834e1 mo34006a(C10249g gVar) {
        C10202j.m34178b(gVar, "newAnnotations");
        return C11828c1.m38954b(mo38441r().mo34006a(gVar), mo38440C());
    }

    /* renamed from: y0 */
    public C11901j0 mo34009y0() {
        return mo38441r().mo34009y0();
    }

    /* renamed from: a */
    public C11834e1 mo34007a(boolean z) {
        return C11828c1.m38954b(mo38441r().mo34007a(z), mo38440C().mo38439x0().mo34007a(z));
    }

    /* renamed from: r */
    public C11966v m39631r() {
        return this.f31678h;
    }

    /* renamed from: a */
    public String mo34005a(C9949c cVar, C9977i iVar) {
        C10202j.m34178b(cVar, "renderer");
        C10202j.m34178b(iVar, "options");
        if (iVar.mo35087a()) {
            return cVar.mo35034a(mo38440C());
        }
        return mo38441r().mo34005a(cVar, iVar);
    }
}
