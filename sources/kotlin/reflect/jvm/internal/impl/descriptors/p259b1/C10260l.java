package kotlin.reflect.jvm.internal.impl.descriptors.p259b1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p215c0.p216c.C9113l;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.b1.l */
/* compiled from: Annotations.kt */
public final class C10260l implements C10249g {

    /* renamed from: f */
    private final C10249g f27923f;

    /* renamed from: g */
    private final C9113l<C9934b, Boolean> f27924g;

    public C10260l(C10249g gVar, C9113l<? super C9934b, Boolean> lVar) {
        C10202j.m34178b(gVar, "delegate");
        C10202j.m34178b(lVar, "fqNameFilter");
        this.f27923f = gVar;
        this.f27924g = lVar;
    }

    /* renamed from: a */
    public C10243c mo33885a(C9934b bVar) {
        C10202j.m34178b(bVar, "fqName");
        if (this.f27924g.invoke(bVar).booleanValue()) {
            return this.f27923f.mo33885a(bVar);
        }
        return null;
    }

    /* renamed from: b */
    public boolean mo33886b(C9934b bVar) {
        C10202j.m34178b(bVar, "fqName");
        if (this.f27924g.invoke(bVar).booleanValue()) {
            return this.f27923f.mo33886b(bVar);
        }
        return false;
    }

    public boolean isEmpty() {
        C10249g<C10243c> gVar = this.f27923f;
        if ((gVar instanceof Collection) && ((Collection) gVar).isEmpty()) {
            return false;
        }
        for (C10243c a : gVar) {
            if (m34302a(a)) {
                return true;
            }
        }
        return false;
    }

    public Iterator<C10243c> iterator() {
        C10249g gVar = this.f27923f;
        ArrayList arrayList = new ArrayList();
        for (Object next : gVar) {
            if (m34302a((C10243c) next)) {
                arrayList.add(next);
            }
        }
        return arrayList.iterator();
    }

    /* renamed from: a */
    private final boolean m34302a(C10243c cVar) {
        C9934b c = cVar.mo33922c();
        return c != null && this.f27924g.invoke(c).booleanValue();
    }
}
