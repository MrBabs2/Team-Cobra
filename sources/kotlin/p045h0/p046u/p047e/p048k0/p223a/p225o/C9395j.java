package kotlin.p045h0.p046u.p047e.p048k0.p223a.p225o;

import java.util.ArrayList;
import java.util.List;
import kotlin.C10485x;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11955t0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p384k1.C11924a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;

/* renamed from: kotlin.h0.u.e.k0.a.o.j */
/* compiled from: mappingUtil.kt */
public final class C9395j {
    /* renamed from: a */
    public static final C11955t0 m30445a(C10342e eVar, C10342e eVar2) {
        C10202j.m34178b(eVar, "from");
        C10202j.m34178b(eVar2, "to");
        boolean z = eVar.mo33776s().size() == eVar2.mo33776s().size();
        if (!C10485x.f28360a || z) {
            C11955t0.C11956a aVar = C11955t0.f31657b;
            List<C10375s0> s = eVar.mo33776s();
            C10202j.m34174a((Object) s, "from.declaredTypeParameters");
            ArrayList arrayList = new ArrayList(C10531p.m35750a(s, 10));
            for (C10375s0 h : s) {
                arrayList.add(h.mo33766h());
            }
            List<C10375s0> s2 = eVar2.mo33776s();
            C10202j.m34174a((Object) s2, "to.declaredTypeParameters");
            ArrayList arrayList2 = new ArrayList(C10531p.m35750a(s2, 10));
            for (C10375s0 s0Var : s2) {
                C10202j.m34174a((Object) s0Var, "it");
                C11901j0 o = s0Var.mo35445o();
                C10202j.m34174a((Object) o, "it.defaultType");
                arrayList2.add(C11924a.m39413a((C11824b0) o));
            }
            return C11955t0.C11956a.m39537a(aVar, C10518j0.m35602a(C10539w.m35800e(arrayList, arrayList2)), false, 2, (Object) null);
        }
        throw new AssertionError(eVar + " and " + eVar2 + " should have same number of type parameters, " + "but " + eVar.mo33776s().size() + " / " + eVar2.mo33776s().size() + " found");
    }
}
