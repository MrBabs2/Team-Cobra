package kotlin.p045h0.p046u.p047e.p048k0.p226b;

import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p226b.p227b.C9397a;
import kotlin.p045h0.p046u.p047e.p048k0.p226b.p227b.C9398b;
import kotlin.p045h0.p046u.p047e.p048k0.p226b.p227b.C9399c;
import kotlin.p045h0.p046u.p047e.p048k0.p226b.p227b.C9402e;
import kotlin.p045h0.p046u.p047e.p048k0.p226b.p227b.C9404f;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C9999c;
import kotlin.reflect.jvm.internal.impl.descriptors.C10240b0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;

/* renamed from: kotlin.h0.u.e.k0.b.a */
/* compiled from: utils.kt */
public final class C9396a {
    /* renamed from: a */
    public static final void m30448a(C9399c cVar, C9398b bVar, C10342e eVar, C9939f fVar) {
        C9397a location;
        C10202j.m34178b(cVar, "$this$record");
        C10202j.m34178b(bVar, "from");
        C10202j.m34178b(eVar, "scopeOwner");
        C10202j.m34178b(fVar, "name");
        if (cVar != C9399c.C9400a.f26127a && (location = bVar.getLocation()) != null) {
            C9402e position = cVar.mo33848a() ? location.getPosition() : C9402e.f26139i.mo33852a();
            String a = location.mo33844a();
            String a2 = C9999c.m33680e(eVar).mo35006a();
            C10202j.m34174a((Object) a2, "DescriptorUtils.getFqName(scopeOwner).asString()");
            C9404f fVar2 = C9404f.CLASSIFIER;
            String a3 = fVar.mo35021a();
            C10202j.m34174a((Object) a3, "name.asString()");
            cVar.mo33847a(a, position, a2, fVar2, a3);
        }
    }

    /* renamed from: a */
    public static final void m30447a(C9399c cVar, C9398b bVar, C10240b0 b0Var, C9939f fVar) {
        C10202j.m34178b(cVar, "$this$record");
        C10202j.m34178b(bVar, "from");
        C10202j.m34178b(b0Var, "scopeOwner");
        C10202j.m34178b(fVar, "name");
        String a = b0Var.mo35425c().mo34994a();
        C10202j.m34174a((Object) a, "scopeOwner.fqName.asString()");
        String a2 = fVar.mo35021a();
        C10202j.m34174a((Object) a2, "name.asString()");
        m30446a(cVar, bVar, a, a2);
    }

    /* renamed from: a */
    public static final void m30446a(C9399c cVar, C9398b bVar, String str, String str2) {
        C9397a location;
        C10202j.m34178b(cVar, "$this$recordPackageLookup");
        C10202j.m34178b(bVar, "from");
        C10202j.m34178b(str, "packageFqName");
        C10202j.m34178b(str2, "name");
        if (cVar != C9399c.C9400a.f26127a && (location = bVar.getLocation()) != null) {
            cVar.mo33847a(location.mo33844a(), cVar.mo33848a() ? location.getPosition() : C9402e.f26139i.mo33852a(), str, C9404f.PACKAGE, str2);
        }
    }
}
