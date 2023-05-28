package kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p226b.p227b.C9398b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10351i;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10373r0;

/* renamed from: kotlin.h0.u.e.k0.h.q.f */
/* compiled from: InnerClassesScopeWrapper.kt */
public final class C10094f extends C10100i {

    /* renamed from: b */
    private final C10096h f27716b;

    public C10094f(C10096h hVar) {
        C10202j.m34178b(hVar, "workerScope");
        this.f27716b = hVar;
    }

    /* renamed from: b */
    public C10349h mo33917b(C9939f fVar, C9398b bVar) {
        C10202j.m34178b(fVar, "name");
        C10202j.m34178b(bVar, "location");
        C10349h b = this.f27716b.mo33917b(fVar, bVar);
        if (b == null) {
            return null;
        }
        C10342e eVar = (C10342e) (!(b instanceof C10342e) ? null : b);
        if (eVar != null) {
            return eVar;
        }
        if (!(b instanceof C10373r0)) {
            b = null;
        }
        return (C10373r0) b;
    }

    public String toString() {
        return "Classes from " + this.f27716b;
    }

    /* renamed from: a */
    public List<C10349h> m33989a(C10088d dVar, C9113l<? super C9939f, Boolean> lVar) {
        C10202j.m34178b(dVar, "kindFilter");
        C10202j.m34178b(lVar, "nameFilter");
        C10088d b = dVar.mo35299b(C10088d.f27705u.mo35302b());
        if (b == null) {
            return C10529o.m35736a();
        }
        Collection<C10359m> a = this.f27716b.mo33914a(b, lVar);
        ArrayList arrayList = new ArrayList();
        for (T next : a) {
            if (next instanceof C10351i) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public Set<C9939f> mo33916b() {
        return this.f27716b.mo33916b();
    }

    /* renamed from: a */
    public Set<C9939f> mo33915a() {
        return this.f27716b.mo33915a();
    }
}
