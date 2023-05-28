package kotlin.p045h0.p046u.p047e.p048k0.p380k;

import java.util.List;
import kotlin.TypeCastException;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10096h;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.h0.u.e.k0.k.g1 */
/* compiled from: KotlinType.kt */
public abstract class C11848g1 extends C11824b0 {
    public C11848g1() {
        super((DefaultConstructorMarker) null);
    }

    public C10249g getAnnotations() {
        return mo38447y0().getAnnotations();
    }

    /* renamed from: m */
    public C10096h mo34008m() {
        return mo38447y0().mo34008m();
    }

    public String toString() {
        return mo38448z0() ? mo38447y0().toString() : "<Not computed yet>";
    }

    /* renamed from: u0 */
    public List<C11965u0> mo35226u0() {
        return mo38447y0().mo35226u0();
    }

    /* renamed from: v0 */
    public C11953s0 mo35227v0() {
        return mo38447y0().mo35227v0();
    }

    /* renamed from: w0 */
    public boolean mo34094w0() {
        return mo38447y0().mo34094w0();
    }

    /* renamed from: x0 */
    public final C11834e1 mo38439x0() {
        C11824b0 y0 = mo38447y0();
        while (y0 instanceof C11848g1) {
            y0 = ((C11848g1) y0).mo38447y0();
        }
        if (y0 != null) {
            return (C11834e1) y0;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y0 */
    public abstract C11824b0 mo38447y0();

    /* renamed from: z0 */
    public boolean mo38448z0() {
        return true;
    }
}
