package kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9782g0;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9821n0;
import kotlin.p262y.C10525m;

/* renamed from: kotlin.h0.u.e.k0.d.x0.h */
/* compiled from: TypeTable.kt */
public final class C9880h {

    /* renamed from: a */
    private final List<C9782g0> f27268a;

    public C9880h(C9821n0 n0Var) {
        C10202j.m34178b(n0Var, "typeTable");
        List<C9782g0> k = n0Var.mo34669k();
        if (n0Var.mo34670l()) {
            int i = n0Var.mo34667i();
            List<C9782g0> k2 = n0Var.mo34669k();
            C10202j.m34174a((Object) k2, "typeTable.typeList");
            ArrayList arrayList = new ArrayList(C10531p.m35750a(k2, 10));
            int i2 = 0;
            for (T next : k2) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    C9782g0 g0Var = (C9782g0) next;
                    if (i2 >= i) {
                        C9782g0.C9789c c = g0Var.m31908c();
                        c.mo34557a(true);
                        g0Var = c.m31989a();
                    }
                    arrayList.add(g0Var);
                    i2 = i3;
                } else {
                    C10525m.m35693c();
                    throw null;
                }
            }
            k = arrayList;
        } else {
            C10202j.m34174a((Object) k, "originalTypes");
        }
        this.f27268a = k;
    }

    /* renamed from: a */
    public final C9782g0 mo34856a(int i) {
        return this.f27268a.get(i);
    }
}
