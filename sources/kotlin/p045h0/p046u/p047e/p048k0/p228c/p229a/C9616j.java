package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.p232o.C9501f;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.p232o.C9502g;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p237z.C9670f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C10000d;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C10007i;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p215c0.p216c.C9113l;
import kotlin.p391i0.C12079h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10230a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10358l0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10360m0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10386v0;

/* renamed from: kotlin.h0.u.e.k0.c.a.j */
/* compiled from: ErasedOverridabilityCondition.kt */
public final class C9616j implements C10000d {

    /* renamed from: kotlin.h0.u.e.k0.c.a.j$a */
    /* compiled from: ErasedOverridabilityCondition.kt */
    static final class C9617a extends C10203k implements C9113l<C10386v0, C11824b0> {

        /* renamed from: f */
        public static final C9617a f26503f = new C9617a();

        C9617a() {
            super(1);
        }

        /* renamed from: a */
        public final C11824b0 invoke(C10386v0 v0Var) {
            C10202j.m34174a((Object) v0Var, "it");
            return v0Var.getType();
        }
    }

    /* renamed from: a */
    public C10000d.C10002b mo34171a(C10230a aVar, C10230a aVar2, C10342e eVar) {
        boolean z;
        boolean z2;
        C10202j.m34178b(aVar, "superDescriptor");
        C10202j.m34178b(aVar2, "subDescriptor");
        if (aVar2 instanceof C9670f) {
            C9670f fVar = (C9670f) aVar2;
            List<C10375s0> typeParameters = fVar.getTypeParameters();
            C10202j.m34174a((Object) typeParameters, "subDescriptor.typeParameters");
            if (!(!typeParameters.isEmpty())) {
                C10007i.C10017j b = C10007i.m33745b(aVar, aVar2);
                if ((b != null ? b.mo35220a() : null) != null) {
                    return C10000d.C10002b.UNKNOWN;
                }
                List<C10386v0> f = fVar.mo35407f();
                C10202j.m34174a((Object) f, "subDescriptor.valueParameters");
                C12079h<R> d = C12090n.m39926d(C10539w.m35782b(f), C9617a.f26503f);
                C11824b0 returnType = fVar.getReturnType();
                if (returnType != null) {
                    C12079h<R> a = C12090n.m39920a(d, returnType);
                    C10358l0 b0 = fVar.mo35405b0();
                    Iterator<R> it = C12090n.m39919a(a, C10529o.m35739b(b0 != null ? b0.getType() : null)).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        }
                        C11824b0 b0Var = (C11824b0) it.next();
                        if (!(!b0Var.mo35226u0().isEmpty()) || (b0Var.mo38439x0() instanceof C9502g)) {
                            z2 = false;
                            continue;
                        } else {
                            z2 = true;
                            continue;
                        }
                        if (z2) {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        return C10000d.C10002b.UNKNOWN;
                    }
                    C10230a aVar3 = (C10230a) aVar.mo35448a(C9501f.f26350d.mo38613c());
                    if (aVar3 == null) {
                        return C10000d.C10002b.UNKNOWN;
                    }
                    if (aVar3 instanceof C10360m0) {
                        C10360m0 m0Var = (C10360m0) aVar3;
                        List<C10375s0> typeParameters2 = m0Var.getTypeParameters();
                        C10202j.m34174a((Object) typeParameters2, "erasedSuper.typeParameters");
                        if ((!typeParameters2.isEmpty()) && (aVar3 = m0Var.mo35465q().mo35531b((List<C10375s0>) C10529o.m35736a()).mo35529a()) == null) {
                            C10202j.m34172a();
                            throw null;
                        }
                    }
                    C10007i.C10017j a2 = C10007i.f27595c.mo35213a(aVar3, aVar2, false);
                    C10202j.m34174a((Object) a2, "OverridingUtil.DEFAULT.i…er, subDescriptor, false)");
                    C10007i.C10017j.C10018a a3 = a2.mo35220a();
                    C10202j.m34174a((Object) a3, "OverridingUtil.DEFAULT.i…Descriptor, false).result");
                    if (C9615i.f26502a[a3.ordinal()] != 1) {
                        return C10000d.C10002b.UNKNOWN;
                    }
                    return C10000d.C10002b.OVERRIDABLE;
                }
                C10202j.m34172a();
                throw null;
            }
        }
        return C10000d.C10002b.UNKNOWN;
    }

    /* renamed from: a */
    public C10000d.C10001a mo34170a() {
        return C10000d.C10001a.SUCCESS_ONLY;
    }
}
