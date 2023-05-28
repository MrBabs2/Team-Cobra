package kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p226b.p227b.C9398b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10096h;
import kotlin.p045h0.p046u.p047e.p048k0.p386l.p388n.C12020a;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10351i;
import kotlin.reflect.jvm.internal.impl.descriptors.C10352i0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10360m0;

/* renamed from: kotlin.h0.u.e.k0.h.q.b */
/* compiled from: ChainedMemberScope.kt */
public final class C10083b implements C10096h {

    /* renamed from: d */
    public static final C10084a f27681d = new C10084a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final String f27682b;

    /* renamed from: c */
    private final List<C10096h> f27683c;

    /* renamed from: kotlin.h0.u.e.k0.h.q.b$a */
    /* compiled from: ChainedMemberScope.kt */
    public static final class C10084a {
        private C10084a() {
        }

        /* renamed from: a */
        public final C10096h mo35293a(String str, List<? extends C10096h> list) {
            C10202j.m34178b(str, "debugName");
            C10202j.m34178b(list, "scopes");
            int size = list.size();
            if (size == 0) {
                return C10096h.C10099b.f27722b;
            }
            if (size != 1) {
                return new C10083b(str, list);
            }
            return (C10096h) C10539w.m35809i(list);
        }

        public /* synthetic */ C10084a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C10083b(String str, List<? extends C10096h> list) {
        C10202j.m34178b(str, "debugName");
        C10202j.m34178b(list, "scopes");
        this.f27682b = str;
        this.f27683c = list;
    }

    /* renamed from: a */
    public Collection<C10360m0> mo33913a(C9939f fVar, C9398b bVar) {
        C10202j.m34178b(fVar, "name");
        C10202j.m34178b(bVar, "location");
        List<C10096h> list = this.f27683c;
        if (list.isEmpty()) {
            return C10530o0.m35747a();
        }
        Collection<T> collection = null;
        for (C10096h a : list) {
            collection = C12020a.m39719a(collection, a.mo33913a(fVar, bVar));
        }
        if (collection != null) {
            return collection;
        }
        return C10530o0.m35747a();
    }

    /* renamed from: b */
    public C10349h mo33917b(C9939f fVar, C9398b bVar) {
        C10202j.m34178b(fVar, "name");
        C10202j.m34178b(bVar, "location");
        C10349h hVar = null;
        for (C10096h b : this.f27683c) {
            C10349h b2 = b.mo33917b(fVar, bVar);
            if (b2 != null) {
                if (!(b2 instanceof C10351i) || !((C10351i) b2).mo33758F()) {
                    return b2;
                }
                if (hVar == null) {
                    hVar = b2;
                }
            }
        }
        return hVar;
    }

    /* renamed from: c */
    public Collection<C10352i0> mo33918c(C9939f fVar, C9398b bVar) {
        C10202j.m34178b(fVar, "name");
        C10202j.m34178b(bVar, "location");
        List<C10096h> list = this.f27683c;
        if (list.isEmpty()) {
            return C10530o0.m35747a();
        }
        Collection<T> collection = null;
        for (C10096h c : list) {
            collection = C12020a.m39719a(collection, c.mo33918c(fVar, bVar));
        }
        if (collection != null) {
            return collection;
        }
        return C10530o0.m35747a();
    }

    public String toString() {
        return this.f27682b;
    }

    /* renamed from: b */
    public Set<C9939f> mo33916b() {
        List<C10096h> list = this.f27683c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C10096h b : list) {
            boolean unused = C10536t.m35760a(linkedHashSet, b.mo33916b());
        }
        return linkedHashSet;
    }

    /* renamed from: a */
    public Collection<C10359m> mo33914a(C10088d dVar, C9113l<? super C9939f, Boolean> lVar) {
        C10202j.m34178b(dVar, "kindFilter");
        C10202j.m34178b(lVar, "nameFilter");
        List<C10096h> list = this.f27683c;
        if (list.isEmpty()) {
            return C10530o0.m35747a();
        }
        Collection<C10359m> collection = null;
        for (C10096h a : list) {
            collection = C12020a.m39719a(collection, a.mo33914a(dVar, lVar));
        }
        if (collection != null) {
            return collection;
        }
        return C10530o0.m35747a();
    }

    /* renamed from: a */
    public Set<C9939f> mo33915a() {
        List<C10096h> list = this.f27683c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C10096h a : list) {
            boolean unused = C10536t.m35760a(linkedHashSet, a.mo33915a());
        }
        return linkedHashSet;
    }
}
