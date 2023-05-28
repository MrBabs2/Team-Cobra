package kotlin.p045h0.p046u.p047e;

import kotlin.jvm.internal.C10188c;
import kotlin.jvm.internal.C10199g;
import kotlin.jvm.internal.C10200h;
import kotlin.jvm.internal.C10203k;
import kotlin.jvm.internal.C10204l;
import kotlin.jvm.internal.C10205m;
import kotlin.jvm.internal.C10209q;
import kotlin.jvm.internal.C10211s;
import kotlin.jvm.internal.C10217y;
import kotlin.p045h0.C9154c;
import kotlin.p045h0.C9156e;
import kotlin.p045h0.C9157f;
import kotlin.p045h0.C9160h;
import kotlin.p045h0.C9162i;
import kotlin.p045h0.C9171m;
import kotlin.p045h0.C9173n;
import kotlin.p045h0.p046u.C4786d;

/* renamed from: kotlin.h0.u.e.a0 */
/* compiled from: ReflectionFactoryImpl */
public class C9184a0 extends C10217y {
    /* renamed from: a */
    public C9156e mo33545a(Class cls, String str) {
        return new C10126n(cls, str);
    }

    /* renamed from: a */
    public C9154c mo33544a(Class cls) {
        return C9218f.m29956a(cls);
    }

    /* renamed from: a */
    public String mo33543a(C10203k kVar) {
        return mo33542a((C10199g) kVar);
    }

    /* renamed from: a */
    public String mo33542a(C10199g gVar) {
        C9301j b;
        C9157f a = C4786d.m7910a(gVar);
        if (a == null || (b = C9244g0.m30005b(a)) == null) {
            return super.mo33542a(gVar);
        }
        return C9197c0.f25721b.mo33566b(b.mo33587o());
    }

    /* renamed from: a */
    public C9157f mo33546a(C10200h hVar) {
        return new C9301j(m29880a((C10188c) hVar), hVar.getName(), hVar.getSignature(), hVar.getBoundReceiver());
    }

    /* renamed from: a */
    public C9171m mo33549a(C10209q qVar) {
        return new C10138p(m29880a((C10188c) qVar), qVar.getName(), qVar.getSignature(), qVar.getBoundReceiver());
    }

    /* renamed from: a */
    public C9160h mo33547a(C10204l lVar) {
        return new C9321k(m29880a((C10188c) lVar), lVar.getName(), lVar.getSignature(), lVar.getBoundReceiver());
    }

    /* renamed from: a */
    public C9173n mo33550a(C10211s sVar) {
        return new C10142q(m29880a((C10188c) sVar), sVar.getName(), sVar.getSignature(), sVar.getBoundReceiver());
    }

    /* renamed from: a */
    public C9162i mo33548a(C10205m mVar) {
        return new C10120l(m29880a((C10188c) mVar), mVar.getName(), mVar.getSignature(), mVar.getBoundReceiver());
    }

    /* renamed from: a */
    private static C9247i m29880a(C10188c cVar) {
        C9156e owner = cVar.getOwner();
        return owner instanceof C9247i ? (C9247i) owner : C9183a.f25707i;
    }
}
