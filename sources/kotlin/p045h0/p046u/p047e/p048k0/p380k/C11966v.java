package kotlin.p045h0.p046u.p047e.p048k0.p380k;

import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p247g.C9949c;
import kotlin.p045h0.p046u.p047e.p048k0.p247g.C9977i;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10096h;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11907f;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.h0.u.e.k0.k.v */
/* compiled from: KotlinType.kt */
public abstract class C11966v extends C11834e1 implements C11946p0, C11907f {

    /* renamed from: f */
    private final C11901j0 f31672f;

    /* renamed from: g */
    private final C11901j0 f31673g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11966v(C11901j0 j0Var, C11901j0 j0Var2) {
        super((DefaultConstructorMarker) null);
        C10202j.m34178b(j0Var, "lowerBound");
        C10202j.m34178b(j0Var2, "upperBound");
        this.f31672f = j0Var;
        this.f31673g = j0Var2;
    }

    /* renamed from: A0 */
    public final C11901j0 mo38607A0() {
        return this.f31673g;
    }

    /* renamed from: K */
    public C11824b0 mo35222K() {
        return this.f31673g;
    }

    /* renamed from: a */
    public abstract String mo34005a(C9949c cVar, C9977i iVar);

    /* renamed from: b */
    public boolean mo35223b(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, "type");
        return false;
    }

    public C10249g getAnnotations() {
        return mo34009y0().getAnnotations();
    }

    /* renamed from: m */
    public C10096h mo34008m() {
        return mo34009y0().mo34008m();
    }

    /* renamed from: q0 */
    public C11824b0 mo35224q0() {
        return this.f31672f;
    }

    public String toString() {
        return C9949c.f27454b.mo35034a((C11824b0) this);
    }

    /* renamed from: u0 */
    public List<C11965u0> mo35226u0() {
        return mo34009y0().mo35226u0();
    }

    /* renamed from: v0 */
    public C11953s0 mo35227v0() {
        return mo34009y0().mo35227v0();
    }

    /* renamed from: w0 */
    public boolean mo34094w0() {
        return mo34009y0().mo34094w0();
    }

    /* renamed from: y0 */
    public abstract C11901j0 mo34009y0();

    /* renamed from: z0 */
    public final C11901j0 mo38609z0() {
        return this.f31672f;
    }
}
