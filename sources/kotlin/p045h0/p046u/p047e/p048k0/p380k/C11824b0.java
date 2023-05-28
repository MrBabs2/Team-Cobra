package kotlin.p045h0.p046u.p047e.p048k0.p380k;

import java.util.List;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10096h;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p381h1.C11878o;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11908g;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10241a;

/* renamed from: kotlin.h0.u.e.k0.k.b0 */
/* compiled from: KotlinType.kt */
public abstract class C11824b0 implements C10241a, C11908g {
    private C11824b0() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11824b0)) {
            return false;
        }
        C11824b0 b0Var = (C11824b0) obj;
        if (mo34094w0() != b0Var.mo34094w0() || !C11878o.f31592a.mo38547a(mo38439x0(), b0Var.mo38439x0())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (C11830d0.m38958a(this)) {
            return super.hashCode();
        }
        return (((mo35227v0().hashCode() * 31) + mo35226u0().hashCode()) * 31) + (mo34094w0() ? 1 : 0);
    }

    /* renamed from: m */
    public abstract C10096h mo34008m();

    /* renamed from: u0 */
    public abstract List<C11965u0> mo35226u0();

    /* renamed from: v0 */
    public abstract C11953s0 mo35227v0();

    /* renamed from: w0 */
    public abstract boolean mo34094w0();

    /* renamed from: x0 */
    public abstract C11834e1 mo38439x0();

    public /* synthetic */ C11824b0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
