package kotlin.p045h0.p046u.p047e.p048k0.p380k;

import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10096h;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11958u;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.h0.u.e.k0.k.k0 */
/* compiled from: KotlinTypeFactory.kt */
final class C11923k0 extends C11901j0 {

    /* renamed from: f */
    private final C11953s0 f31622f;

    /* renamed from: g */
    private final List<C11965u0> f31623g;

    /* renamed from: h */
    private final boolean f31624h;

    /* renamed from: i */
    private final C10096h f31625i;

    public C11923k0(C11953s0 s0Var, List<? extends C11965u0> list, boolean z, C10096h hVar) {
        C10202j.m34178b(s0Var, "constructor");
        C10202j.m34178b(list, "arguments");
        C10202j.m34178b(hVar, "memberScope");
        this.f31622f = s0Var;
        this.f31623g = list;
        this.f31624h = z;
        this.f31625i = hVar;
        if (mo34008m() instanceof C11958u.C11962d) {
            throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + mo34008m() + 10 + mo35227v0());
        }
    }

    public C10249g getAnnotations() {
        return C10249g.f27910c.mo35429a();
    }

    /* renamed from: m */
    public C10096h mo34008m() {
        return this.f31625i;
    }

    /* renamed from: u0 */
    public List<C11965u0> mo35226u0() {
        return this.f31623g;
    }

    /* renamed from: v0 */
    public C11953s0 mo35227v0() {
        return this.f31622f;
    }

    /* renamed from: w0 */
    public boolean mo34094w0() {
        return this.f31624h;
    }

    /* renamed from: a */
    public C11901j0 m39405a(C10249g gVar) {
        C10202j.m34178b(gVar, "newAnnotations");
        if (gVar.isEmpty()) {
            return this;
        }
        return new C11896i(this, gVar);
    }

    /* renamed from: a */
    public C11901j0 m39406a(boolean z) {
        if (z == mo34094w0()) {
            return this;
        }
        if (z) {
            return new C11858h0(this);
        }
        return new C11837f0(this);
    }
}
