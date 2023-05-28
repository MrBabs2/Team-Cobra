package kotlin.p045h0.p046u.p047e.p048k0.p248h;

import kotlin.reflect.jvm.internal.impl.descriptors.C10230a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;

/* renamed from: kotlin.h0.u.e.k0.h.d */
/* compiled from: ExternalOverridabilityCondition */
public interface C10000d {

    /* renamed from: kotlin.h0.u.e.k0.h.d$a */
    /* compiled from: ExternalOverridabilityCondition */
    public enum C10001a {
        CONFLICTS_ONLY,
        SUCCESS_ONLY,
        BOTH
    }

    /* renamed from: kotlin.h0.u.e.k0.h.d$b */
    /* compiled from: ExternalOverridabilityCondition */
    public enum C10002b {
        OVERRIDABLE,
        CONFLICT,
        INCOMPATIBLE,
        UNKNOWN
    }

    /* renamed from: a */
    C10001a mo34170a();

    /* renamed from: a */
    C10002b mo34171a(C10230a aVar, C10230a aVar2, C10342e eVar);
}
