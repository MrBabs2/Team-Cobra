package kotlin.p045h0.p046u.p047e.p048k0.p380k.p381h1;

import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10096h;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11834e1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11958u;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11965u0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11903b;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11904c;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.h0.u.e.k0.k.h1.i */
/* compiled from: NewCapturedType.kt */
public final class C11872i extends C11901j0 implements C11904c {

    /* renamed from: f */
    private final C11903b f31582f;

    /* renamed from: g */
    private final C11873j f31583g;

    /* renamed from: h */
    private final C11834e1 f31584h;

    /* renamed from: i */
    private final C10249g f31585i;

    /* renamed from: j */
    private final boolean f31586j;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11872i(C11903b bVar, C11873j jVar, C11834e1 e1Var, C10249g gVar, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, jVar, e1Var, (i & 8) != 0 ? C10249g.f27910c.mo35429a() : gVar, (i & 16) != 0 ? false : z);
    }

    public C10249g getAnnotations() {
        return this.f31585i;
    }

    /* renamed from: m */
    public C10096h mo34008m() {
        C10096h a = C11958u.m39545a("No member resolution should be done on captured type!", true);
        C10202j.m34174a((Object) a, "ErrorUtils.createErrorSc…on captured type!\", true)");
        return a;
    }

    /* renamed from: u0 */
    public List<C11965u0> mo35226u0() {
        return C10529o.m35736a();
    }

    /* renamed from: w0 */
    public boolean mo34094w0() {
        return this.f31586j;
    }

    /* renamed from: y0 */
    public final C11834e1 mo38538y0() {
        return this.f31584h;
    }

    /* renamed from: v0 */
    public C11873j m39180v0() {
        return this.f31583g;
    }

    public C11872i(C11903b bVar, C11873j jVar, C11834e1 e1Var, C10249g gVar, boolean z) {
        C10202j.m34178b(bVar, "captureStatus");
        C10202j.m34178b(jVar, "constructor");
        C10202j.m34178b(gVar, "annotations");
        this.f31582f = bVar;
        this.f31583g = jVar;
        this.f31584h = e1Var;
        this.f31585i = gVar;
        this.f31586j = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C11872i(C11903b bVar, C11834e1 e1Var, C11965u0 u0Var) {
        this(bVar, new C11873j(u0Var, (List) null, 2, (DefaultConstructorMarker) null), e1Var, (C10249g) null, false, 24, (DefaultConstructorMarker) null);
        C10202j.m34178b(bVar, "captureStatus");
        C10202j.m34178b(u0Var, "projection");
    }

    /* renamed from: a */
    public C11872i m39173a(C10249g gVar) {
        C10202j.m34178b(gVar, "newAnnotations");
        return new C11872i(this.f31582f, m39180v0(), this.f31584h, gVar, mo34094w0());
    }

    /* renamed from: a */
    public C11872i m39174a(boolean z) {
        return new C11872i(this.f31582f, m39180v0(), this.f31584h, getAnnotations(), z);
    }
}
