package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a;

import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.p231n.C9434c;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C10000d;
import kotlin.reflect.jvm.internal.impl.descriptors.C10230a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10352i0;

/* renamed from: kotlin.h0.u.e.k0.c.a.l */
/* compiled from: FieldOverridabilityCondition.kt */
public final class C9619l implements C10000d {
    /* renamed from: a */
    public C10000d.C10002b mo34171a(C10230a aVar, C10230a aVar2, C10342e eVar) {
        C10202j.m34178b(aVar, "superDescriptor");
        C10202j.m34178b(aVar2, "subDescriptor");
        if (!(aVar2 instanceof C10352i0) || !(aVar instanceof C10352i0)) {
            return C10000d.C10002b.UNKNOWN;
        }
        C10352i0 i0Var = (C10352i0) aVar2;
        C10352i0 i0Var2 = (C10352i0) aVar;
        if (!C10202j.m34176a((Object) i0Var.getName(), (Object) i0Var2.getName())) {
            return C10000d.C10002b.UNKNOWN;
        }
        if (C9434c.m30551a(i0Var) && C9434c.m30551a(i0Var2)) {
            return C10000d.C10002b.OVERRIDABLE;
        }
        if (C9434c.m30551a(i0Var) || C9434c.m30551a(i0Var2)) {
            return C10000d.C10002b.INCOMPATIBLE;
        }
        return C10000d.C10002b.UNKNOWN;
    }

    /* renamed from: a */
    public C10000d.C10001a mo34170a() {
        return C10000d.C10001a.BOTH;
    }
}
