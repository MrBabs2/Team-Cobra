package kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b;

import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11779s;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.p232o.C9502g;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9782g0;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.C9890a;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11827c0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11958u;

/* renamed from: kotlin.h0.u.e.k0.c.b.g */
/* compiled from: JavaFlexibleTypeDeserializer.kt */
public final class C9710g implements C11779s {

    /* renamed from: a */
    public static final C9710g f26691a = new C9710g();

    private C9710g() {
    }

    /* renamed from: a */
    public C11824b0 mo34290a(C9782g0 g0Var, String str, C11901j0 j0Var, C11901j0 j0Var2) {
        C10202j.m34178b(g0Var, "proto");
        C10202j.m34178b(str, "flexibleId");
        C10202j.m34178b(j0Var, "lowerBound");
        C10202j.m34178b(j0Var2, "upperBound");
        if (!C10202j.m34176a((Object) str, (Object) "kotlin.jvm.PlatformType")) {
            C11901j0 c = C11958u.m39559c("Error java flexible type with id: " + str + ". (" + j0Var + ".." + j0Var2 + ')');
            C10202j.m34174a((Object) c, "ErrorUtils.createErrorTy…owerBound..$upperBound)\")");
            return c;
        } else if (g0Var.mo35768c(C9890a.f27290g)) {
            return new C9502g(j0Var, j0Var2);
        } else {
            return C11827c0.m38946a(j0Var, j0Var2);
        }
    }
}
