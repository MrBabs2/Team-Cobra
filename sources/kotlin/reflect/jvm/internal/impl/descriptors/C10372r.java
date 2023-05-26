package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p226b.p227b.C9398b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10096h;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r */
/* compiled from: descriptorUtil.kt */
public final class C10372r {
    /* renamed from: a */
    public static final C10342e m35006a(C10393y yVar, C9934b bVar, C9398b bVar2) {
        C10359m mVar;
        C10096h k0;
        C10202j.m34178b(yVar, "$this$resolveClassByFqName");
        C10202j.m34178b(bVar, "fqName");
        C10202j.m34178b(bVar2, "lookupLocation");
        C10359m mVar2 = null;
        if (bVar.mo34996b()) {
            return null;
        }
        C9934b c = bVar.mo34998c();
        C10202j.m34174a((Object) c, "fqName.parent()");
        C10096h m = yVar.mo35554a(c).mo35545m();
        C9939f e = bVar.mo35000e();
        C10202j.m34174a((Object) e, "fqName.shortName()");
        C10349h b = m.mo33917b(e, bVar2);
        if (!(b instanceof C10342e)) {
            b = null;
        }
        C10342e eVar = (C10342e) b;
        if (eVar != null) {
            return eVar;
        }
        C9934b c2 = bVar.mo34998c();
        C10202j.m34174a((Object) c2, "fqName.parent()");
        C10342e a = m35006a(yVar, c2, bVar2);
        if (a == null || (k0 = a.mo33928k0()) == null) {
            mVar = null;
        } else {
            C9939f e2 = bVar.mo35000e();
            C10202j.m34174a((Object) e2, "fqName.shortName()");
            mVar = k0.mo33917b(e2, bVar2);
        }
        if (mVar instanceof C10342e) {
            mVar2 = mVar;
        }
        return (C10342e) mVar2;
    }
}
