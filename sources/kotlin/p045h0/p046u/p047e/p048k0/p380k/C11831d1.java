package kotlin.p045h0.p046u.p047e.p048k0.p380k;

import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10096h;

/* renamed from: kotlin.h0.u.e.k0.k.d1 */
/* compiled from: ErrorType.kt */
public final class C11831d1 extends C11954t {

    /* renamed from: j */
    private final String f31533j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11831d1(String str, C11953s0 s0Var, C10096h hVar, List<? extends C11965u0> list, boolean z) {
        super(s0Var, hVar, list, z);
        C10202j.m34178b(str, "presentableName");
        C10202j.m34178b(s0Var, "constructor");
        C10202j.m34178b(hVar, "memberScope");
        C10202j.m34178b(list, "arguments");
        this.f31533j = str;
    }

    /* renamed from: y0 */
    public final String mo38446y0() {
        return this.f31533j;
    }

    /* renamed from: a */
    public C11901j0 m38961a(boolean z) {
        return new C11831d1(this.f31533j, mo35227v0(), mo34008m(), mo35226u0(), z);
    }
}
