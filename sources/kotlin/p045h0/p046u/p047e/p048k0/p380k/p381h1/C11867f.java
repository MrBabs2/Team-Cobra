package kotlin.p045h0.p046u.p047e.p048k0.p380k.p381h1;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11827c0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11830d0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11834e1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11952s;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11958u;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11966v;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11975y;

/* renamed from: kotlin.h0.u.e.k0.k.h1.f */
/* compiled from: IntersectionType.kt */
public final class C11867f {
    /* renamed from: a */
    public static final C11834e1 m39161a(List<? extends C11834e1> list) {
        C11901j0 j0Var;
        C10202j.m34178b(list, "types");
        int size = list.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types".toString());
        } else if (size == 1) {
            return (C11834e1) C10539w.m35809i(list);
        } else {
            ArrayList arrayList = new ArrayList(C10531p.m35750a(list, 10));
            boolean z = false;
            boolean z2 = false;
            for (C11834e1 e1Var : list) {
                z = z || C11830d0.m38958a(e1Var);
                if (e1Var instanceof C11901j0) {
                    j0Var = (C11901j0) e1Var;
                } else if (!(e1Var instanceof C11966v)) {
                    throw new NoWhenBranchMatchedException();
                } else if (C11952s.m39520a(e1Var)) {
                    return e1Var;
                } else {
                    j0Var = ((C11966v) e1Var).mo38609z0();
                    z2 = true;
                }
                arrayList.add(j0Var);
            }
            if (z) {
                C11901j0 c = C11958u.m39559c("Intersection of error types: " + list);
                C10202j.m34174a((Object) c, "ErrorUtils.createErrorTy… of error types: $types\")");
                return c;
            } else if (!z2) {
                return C11885t.f31602a.mo38557a((List<? extends C11901j0>) arrayList);
            } else {
                ArrayList arrayList2 = new ArrayList(C10531p.m35750a(list, 10));
                for (C11834e1 d : list) {
                    arrayList2.add(C11975y.m39646d(d));
                }
                return C11827c0.m38946a(C11885t.f31602a.mo38557a((List<? extends C11901j0>) arrayList), C11885t.f31602a.mo38557a((List<? extends C11901j0>) arrayList2));
            }
        }
    }
}
