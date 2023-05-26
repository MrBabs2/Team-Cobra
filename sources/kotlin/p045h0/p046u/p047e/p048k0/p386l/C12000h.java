package kotlin.p045h0.p046u.p047e.p048k0.p386l;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p253o.C10071a;
import kotlin.p045h0.p046u.p047e.p048k0.p386l.C11984b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10382u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10386v0;

/* renamed from: kotlin.h0.u.e.k0.l.h */
/* compiled from: modifierChecks.kt */
final class C12000h implements C11984b {

    /* renamed from: a */
    private static final String f31708a = f31708a;

    /* renamed from: b */
    public static final C12000h f31709b = new C12000h();

    private C12000h() {
    }

    /* renamed from: a */
    public String mo38626a(C10382u uVar) {
        C10202j.m34178b(uVar, "functionDescriptor");
        return C11984b.C11985a.m39682a(this, uVar);
    }

    /* renamed from: b */
    public boolean mo38627b(C10382u uVar) {
        boolean z;
        C10202j.m34178b(uVar, "functionDescriptor");
        List<C10386v0> f = uVar.mo35407f();
        C10202j.m34174a((Object) f, "functionDescriptor.valueParameters");
        if (!(f instanceof Collection) || !f.isEmpty()) {
            for (C10386v0 v0Var : f) {
                C10202j.m34174a((Object) v0Var, "it");
                if (C10071a.m33891a(v0Var) || v0Var.mo35486a0() != null) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (!z) {
                    return false;
                }
            }
        }
        return true;
    }

    public String getDescription() {
        return f31708a;
    }
}
