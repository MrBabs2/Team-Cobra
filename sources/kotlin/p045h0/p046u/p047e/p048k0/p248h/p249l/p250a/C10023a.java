package kotlin.p045h0.p046u.p047e.p048k0.p248h.p249l.p250a;

import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10096h;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11838f1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11946p0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11958u;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11965u0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11904c;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p384k1.C11924a;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.h0.u.e.k0.h.l.a.a */
/* compiled from: CapturedTypeConstructor.kt */
public final class C10023a extends C11901j0 implements C11946p0, C11904c {

    /* renamed from: f */
    private final C11965u0 f27614f;

    /* renamed from: g */
    private final C10024b f27615g;

    /* renamed from: h */
    private final boolean f27616h;

    /* renamed from: i */
    private final C10249g f27617i;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10023a(C11965u0 u0Var, C10024b bVar, boolean z, C10249g gVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(u0Var, (i & 2) != 0 ? new C10025c(u0Var) : bVar, (i & 4) != 0 ? false : z, (i & 8) != 0 ? C10249g.f27910c.mo35429a() : gVar);
    }

    /* renamed from: K */
    public C11824b0 mo35222K() {
        C11838f1 f1Var = C11838f1.IN_VARIANCE;
        C11901j0 t = C11924a.m39418b(this).mo33724t();
        C10202j.m34174a((Object) t, "builtIns.nothingType");
        return m33772a(f1Var, t);
    }

    /* renamed from: b */
    public boolean mo35223b(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, "type");
        return m33785v0() == b0Var.mo35227v0();
    }

    public C10249g getAnnotations() {
        return this.f27617i;
    }

    /* renamed from: m */
    public C10096h mo34008m() {
        C10096h a = C11958u.m39545a("No member resolution should be done on captured type, it used only during constraint system resolution", true);
        C10202j.m34174a((Object) a, "ErrorUtils.createErrorSc…solution\", true\n        )");
        return a;
    }

    /* renamed from: q0 */
    public C11824b0 mo35224q0() {
        C11838f1 f1Var = C11838f1.OUT_VARIANCE;
        C11901j0 u = C11924a.m39418b(this).mo33725u();
        C10202j.m34174a((Object) u, "builtIns.nullableAnyType");
        return m33772a(f1Var, u);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Captured(");
        sb.append(this.f27614f);
        sb.append(')');
        sb.append(mo34094w0() ? "?" : "");
        return sb.toString();
    }

    /* renamed from: u0 */
    public List<C11965u0> mo35226u0() {
        return C10529o.m35736a();
    }

    /* renamed from: w0 */
    public boolean mo34094w0() {
        return this.f27616h;
    }

    /* renamed from: v0 */
    public C10024b m33785v0() {
        return this.f27615g;
    }

    public C10023a(C11965u0 u0Var, C10024b bVar, boolean z, C10249g gVar) {
        C10202j.m34178b(u0Var, "typeProjection");
        C10202j.m34178b(bVar, "constructor");
        C10202j.m34178b(gVar, "annotations");
        this.f27614f = u0Var;
        this.f27615g = bVar;
        this.f27616h = z;
        this.f27617i = gVar;
    }

    /* renamed from: a */
    private final C11824b0 m33772a(C11838f1 f1Var, C11824b0 b0Var) {
        if (this.f27614f.mo38596a() == f1Var) {
            b0Var = this.f27614f.getType();
        }
        C10202j.m34174a((Object) b0Var, "if (typeProjection.proje…jection.type else default");
        return b0Var;
    }

    /* renamed from: a */
    public C10023a m33779a(boolean z) {
        if (z == mo34094w0()) {
            return this;
        }
        return new C10023a(this.f27614f, m33785v0(), z, getAnnotations());
    }

    /* renamed from: a */
    public C10023a m33778a(C10249g gVar) {
        C10202j.m34178b(gVar, "newAnnotations");
        return new C10023a(this.f27614f, m33785v0(), mo34094w0(), gVar);
    }
}
