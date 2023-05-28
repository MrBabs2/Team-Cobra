package kotlin.p045h0.p046u.p047e.p048k0.p223a;

import java.util.ArrayList;
import java.util.List;
import kotlin.C10485x;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C9999c;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11795b;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11827c0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11838f1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11953s0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11958u;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11965u0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p384k1.C11924a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10345f;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10388w;
import kotlin.reflect.jvm.internal.impl.descriptors.C10393y;
import kotlin.reflect.jvm.internal.impl.descriptors.C10397z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;
import kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10303h0;
import kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10314m;
import kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10337w;

/* renamed from: kotlin.h0.u.e.k0.a.k */
/* compiled from: suspendFunctionTypes.kt */
public final class C9346k {

    /* renamed from: a */
    private static final C10337w f26009a;

    /* renamed from: b */
    private static final C10337w f26010b;

    static {
        C10393y c = C11958u.m39560c();
        C10202j.m34174a((Object) c, "ErrorUtils.getErrorModule()");
        C9934b bVar = C9999c.f27580d;
        C10202j.m34174a((Object) bVar, "DescriptorUtils.COROUTIN…KAGE_FQ_NAME_EXPERIMENTAL");
        C10337w wVar = new C10337w(new C10314m(c, bVar), C10345f.INTERFACE, false, false, C9999c.f27581e.mo35000e(), C10362n0.f28175a, C11795b.f31497e);
        wVar.mo35566a(C10388w.ABSTRACT);
        wVar.mo35565a(C10397z0.f28192e);
        wVar.mo35564a((List<C10375s0>) C10527n.m35729a(C10303h0.m34536a(wVar, C10249g.f27910c.mo35429a(), false, C11838f1.IN_VARIANCE, C9939f.m33302b("T"), 0)));
        wVar.mo35567r();
        f26009a = wVar;
        C10393y c2 = C11958u.m39560c();
        C10202j.m34174a((Object) c2, "ErrorUtils.getErrorModule()");
        C9934b bVar2 = C9999c.f27579c;
        C10202j.m34174a((Object) bVar2, "DescriptorUtils.COROUTINES_PACKAGE_FQ_NAME_RELEASE");
        C10337w wVar2 = new C10337w(new C10314m(c2, bVar2), C10345f.INTERFACE, false, false, C9999c.f27582f.mo35000e(), C10362n0.f28175a, C11795b.f31497e);
        wVar2.mo35566a(C10388w.ABSTRACT);
        wVar2.mo35565a(C10397z0.f28192e);
        wVar2.mo35564a((List<C10375s0>) C10527n.m35729a(C10303h0.m34536a(wVar2, C10249g.f27910c.mo35429a(), false, C11838f1.IN_VARIANCE, C9939f.m33302b("T"), 0)));
        wVar2.mo35567r();
        f26010b = wVar2;
    }

    /* renamed from: a */
    public static final C11901j0 m30272a(C11824b0 b0Var, boolean z) {
        C11953s0 s0Var;
        C10202j.m34178b(b0Var, "suspendFunType");
        boolean h = C9332f.m30160h(b0Var);
        if (!C10485x.f28360a || h) {
            C9333g b = C11924a.m39418b(b0Var);
            C10249g annotations = b0Var.getAnnotations();
            C11824b0 b2 = C9332f.m30154b(b0Var);
            List<C11965u0> d = C9332f.m30156d(b0Var);
            ArrayList arrayList = new ArrayList(C10531p.m35750a(d, 10));
            for (C11965u0 type : d) {
                arrayList.add(type.getType());
            }
            C10249g a = C10249g.f27910c.mo35429a();
            if (z) {
                s0Var = f26010b.mo33766h();
            } else {
                s0Var = f26009a.mo33766h();
            }
            C10202j.m34174a((Object) s0Var, "if (isReleaseCoroutines)…ERIMENTAL.typeConstructor");
            List a2 = C10539w.m35776a(arrayList, C11827c0.m38948a(a, s0Var, C10527n.m35729a(C11924a.m39413a(C9332f.m30155c(b0Var))), false));
            C11901j0 u = C11924a.m39418b(b0Var).mo33725u();
            C10202j.m34174a((Object) u, "suspendFunType.builtIns.nullableAnyType");
            return C9332f.m30153a(b, annotations, b2, a2, (List) null, u, false, 64, (Object) null).mo34007a(b0Var.mo34094w0());
        }
        throw new AssertionError("This type should be suspend function type: " + b0Var);
    }

    /* renamed from: a */
    public static final boolean m30273a(C9934b bVar, boolean z) {
        if (z) {
            return C10202j.m34176a((Object) bVar, (Object) C9999c.f27582f);
        }
        return C10202j.m34176a((Object) bVar, (Object) C9999c.f27581e);
    }
}
