package kotlin.reflect.jvm.internal.impl.descriptors.p261d1;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10085c;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10088d;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10100i;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10343e0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10393y;
import kotlin.reflect.jvm.internal.impl.utils.C12141a;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.e0 */
/* compiled from: SubpackagesScope.kt */
public class C10295e0 extends C10100i {

    /* renamed from: b */
    private final C10393y f27988b;

    /* renamed from: c */
    private final C9934b f27989c;

    public C10295e0(C10393y yVar, C9934b bVar) {
        C10202j.m34178b(yVar, "moduleDescriptor");
        C10202j.m34178b(bVar, "fqName");
        this.f27988b = yVar;
        this.f27989c = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C10343e0 mo35469a(C9939f fVar) {
        C10202j.m34178b(fVar, "name");
        if (fVar.mo35024e()) {
            return null;
        }
        C10393y yVar = this.f27988b;
        C9934b a = this.f27989c.mo34995a(fVar);
        C10202j.m34174a((Object) a, "fqName.child(name)");
        C10343e0 a2 = yVar.mo35554a(a);
        if (a2.isEmpty()) {
            return null;
        }
        return a2;
    }

    /* renamed from: a */
    public Collection<C10359m> mo33914a(C10088d dVar, C9113l<? super C9939f, Boolean> lVar) {
        C10202j.m34178b(dVar, "kindFilter");
        C10202j.m34178b(lVar, "nameFilter");
        if (!dVar.mo35297a(C10088d.f27705u.mo35305e())) {
            return C10529o.m35736a();
        }
        if (this.f27989c.mo34996b() && dVar.mo35296a().contains(C10085c.C10087b.f27686a)) {
            return C10529o.m35736a();
        }
        Collection<C9934b> a = this.f27988b.mo35553a(this.f27989c, lVar);
        ArrayList arrayList = new ArrayList(a.size());
        for (C9934b e : a) {
            C9939f e2 = e.mo35000e();
            C10202j.m34174a((Object) e2, "subFqName.shortName()");
            if (lVar.invoke(e2).booleanValue()) {
                C12141a.m40133a(arrayList, mo35469a(e2));
            }
        }
        return arrayList;
    }
}
