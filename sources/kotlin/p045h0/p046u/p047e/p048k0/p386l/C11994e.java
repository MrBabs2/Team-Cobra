package kotlin.p045h0.p046u.p047e.p048k0.p386l;

import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9341i;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p253o.C10071a;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p384k1.C11924a;
import kotlin.p045h0.p046u.p047e.p048k0.p386l.C11984b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10382u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10386v0;

/* renamed from: kotlin.h0.u.e.k0.l.e */
/* compiled from: modifierChecks.kt */
final class C11994e implements C11984b {

    /* renamed from: a */
    private static final String f31702a = f31702a;

    /* renamed from: b */
    public static final C11994e f31703b = new C11994e();

    private C11994e() {
    }

    /* renamed from: a */
    public String mo38626a(C10382u uVar) {
        C10202j.m34178b(uVar, "functionDescriptor");
        return C11984b.C11985a.m39682a(this, uVar);
    }

    /* renamed from: b */
    public boolean mo38627b(C10382u uVar) {
        C10202j.m34178b(uVar, "functionDescriptor");
        C10386v0 v0Var = uVar.mo35407f().get(1);
        C9341i.C9343b bVar = C9341i.f25998e;
        C10202j.m34174a((Object) v0Var, "secondParameter");
        C11824b0 a = bVar.mo33738a(C10071a.m33897e(v0Var));
        if (a == null) {
            return false;
        }
        C11824b0 type = v0Var.getType();
        C10202j.m34174a((Object) type, "secondParameter.type");
        return C11924a.m39416a(a, C11924a.m39420d(type));
    }

    public String getDescription() {
        return f31702a;
    }
}
