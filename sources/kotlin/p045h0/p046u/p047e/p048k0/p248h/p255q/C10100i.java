package kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p226b.p227b.C9398b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10352i0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10360m0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10392x0;
import kotlin.reflect.jvm.internal.impl.utils.C12150d;

/* renamed from: kotlin.h0.u.e.k0.h.q.i */
/* compiled from: MemberScopeImpl.kt */
public abstract class C10100i implements C10096h {
    /* renamed from: a */
    public Collection<? extends C10360m0> mo33913a(C9939f fVar, C9398b bVar) {
        C10202j.m34178b(fVar, "name");
        C10202j.m34178b(bVar, "location");
        return C10529o.m35736a();
    }

    /* renamed from: b */
    public Set<C9939f> mo33916b() {
        Collection<C10359m> a = mo33914a(C10088d.f27702r, (C9113l<? super C9939f, Boolean>) C12150d.m40155a());
        ArrayList<C10392x0> arrayList = new ArrayList<>();
        for (T next : a) {
            if (next instanceof C10392x0) {
                arrayList.add(next);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C10392x0 name : arrayList) {
            linkedHashSet.add(name.getName());
        }
        return linkedHashSet;
    }

    /* renamed from: b */
    public C10349h mo33917b(C9939f fVar, C9398b bVar) {
        C10202j.m34178b(fVar, "name");
        C10202j.m34178b(bVar, "location");
        return null;
    }

    /* renamed from: c */
    public Collection<? extends C10352i0> mo33918c(C9939f fVar, C9398b bVar) {
        C10202j.m34178b(fVar, "name");
        C10202j.m34178b(bVar, "location");
        return C10529o.m35736a();
    }

    /* renamed from: a */
    public Collection<C10359m> mo33914a(C10088d dVar, C9113l<? super C9939f, Boolean> lVar) {
        C10202j.m34178b(dVar, "kindFilter");
        C10202j.m34178b(lVar, "nameFilter");
        return C10529o.m35736a();
    }

    /* renamed from: a */
    public Set<C9939f> mo33915a() {
        Collection<C10359m> a = mo33914a(C10088d.f27701q, (C9113l<? super C9939f, Boolean>) C12150d.m40155a());
        ArrayList<C10360m0> arrayList = new ArrayList<>();
        for (T next : a) {
            if (next instanceof C10360m0) {
                arrayList.add(next);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C10360m0 name : arrayList) {
            linkedHashSet.add(name.getName());
        }
        return linkedHashSet;
    }
}
