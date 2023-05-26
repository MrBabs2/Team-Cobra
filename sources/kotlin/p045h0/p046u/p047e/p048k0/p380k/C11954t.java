package kotlin.p045h0.p046u.p047e.p048k0.p380k;

import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10096h;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.h0.u.e.k0.k.t */
/* compiled from: ErrorType.kt */
public class C11954t extends C11901j0 {

    /* renamed from: f */
    private final C11953s0 f31653f;

    /* renamed from: g */
    private final C10096h f31654g;

    /* renamed from: h */
    private final List<C11965u0> f31655h;

    /* renamed from: i */
    private final boolean f31656i;

    public C11954t(C11953s0 s0Var, C10096h hVar) {
        this(s0Var, hVar, (List) null, false, 12, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11954t(C11953s0 s0Var, C10096h hVar, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(s0Var, hVar, (i & 4) != 0 ? C10529o.m35736a() : list, (i & 8) != 0 ? false : z);
    }

    /* renamed from: a */
    public C11901j0 m39527a(C10249g gVar) {
        C10202j.m34178b(gVar, "newAnnotations");
        return this;
    }

    public C10249g getAnnotations() {
        return C10249g.f27910c.mo35429a();
    }

    /* renamed from: m */
    public C10096h mo34008m() {
        return this.f31654g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo35227v0().toString());
        sb.append(mo35226u0().isEmpty() ? "" : C10539w.m35772a(mo35226u0(), ", ", "<", ">", -1, "...", (C9113l) null));
        return sb.toString();
    }

    /* renamed from: u0 */
    public List<C11965u0> mo35226u0() {
        return this.f31655h;
    }

    /* renamed from: v0 */
    public C11953s0 mo35227v0() {
        return this.f31653f;
    }

    /* renamed from: w0 */
    public boolean mo34094w0() {
        return this.f31656i;
    }

    public C11954t(C11953s0 s0Var, C10096h hVar, List<? extends C11965u0> list, boolean z) {
        C10202j.m34178b(s0Var, "constructor");
        C10202j.m34178b(hVar, "memberScope");
        C10202j.m34178b(list, "arguments");
        this.f31653f = s0Var;
        this.f31654g = hVar;
        this.f31655h = list;
        this.f31656i = z;
    }

    /* renamed from: a */
    public C11901j0 m39528a(boolean z) {
        return new C11954t(mo35227v0(), mo34008m(), mo35226u0(), z);
    }
}
