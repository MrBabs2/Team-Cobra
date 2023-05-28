package kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.C9134f;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.jvm.internal.C10211s;
import kotlin.jvm.internal.C10212t;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9168l;
import kotlin.p045h0.p046u.p047e.p048k0.p226b.p227b.C9398b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p249l.p250a.C10026d;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10101j;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11972x0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11978z0;
import kotlin.p215c0.p216c.C9102a;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10352i0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10360m0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10368p0;
import kotlin.reflect.jvm.internal.impl.utils.C12141a;

/* renamed from: kotlin.h0.u.e.k0.h.q.l */
/* compiled from: SubstitutingScope.kt */
public final class C10105l implements C10096h {

    /* renamed from: f */
    static final /* synthetic */ C9168l[] f27727f = {C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a(C10105l.class), "_allDescriptors", "get_allDescriptors()Ljava/util/Collection;"))};

    /* renamed from: b */
    private final C11978z0 f27728b;

    /* renamed from: c */
    private Map<C10359m, C10359m> f27729c;

    /* renamed from: d */
    private final C9134f f27730d = C10181i.m34134a(new C10106a(this));
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C10096h f27731e;

    /* renamed from: kotlin.h0.u.e.k0.h.q.l$a */
    /* compiled from: SubstitutingScope.kt */
    static final class C10106a extends C10203k implements C9102a<Collection<? extends C10359m>> {

        /* renamed from: f */
        final /* synthetic */ C10105l f27732f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10106a(C10105l lVar) {
            super(0);
            this.f27732f = lVar;
        }

        public final Collection<C10359m> invoke() {
            C10105l lVar = this.f27732f;
            return lVar.m34019a(C10101j.C10102a.m34010a(lVar.f27731e, (C10088d) null, (C9113l) null, 3, (Object) null));
        }
    }

    public C10105l(C10096h hVar, C11978z0 z0Var) {
        C10202j.m34178b(hVar, "workerScope");
        C10202j.m34178b(z0Var, "givenSubstitutor");
        this.f27731e = hVar;
        C11972x0 a = z0Var.mo38619a();
        C10202j.m34174a((Object) a, "givenSubstitutor.substitution");
        this.f27728b = C10026d.m33799a(a, false, 1, (Object) null).mo38613c();
    }

    /* renamed from: c */
    private final Collection<C10359m> m34023c() {
        C9134f fVar = this.f27730d;
        C9168l lVar = f27727f[0];
        return (Collection) fVar.getValue();
    }

    /* renamed from: b */
    public C10349h mo33917b(C9939f fVar, C9398b bVar) {
        C10202j.m34178b(fVar, "name");
        C10202j.m34178b(bVar, "location");
        C10349h b = this.f27731e.mo33917b(fVar, bVar);
        if (b != null) {
            return (C10349h) m34022a(b);
        }
        return null;
    }

    /* renamed from: c */
    public Collection<? extends C10352i0> mo33918c(C9939f fVar, C9398b bVar) {
        C10202j.m34178b(fVar, "name");
        C10202j.m34178b(bVar, "location");
        return m34019a(this.f27731e.mo33918c(fVar, bVar));
    }

    /* renamed from: b */
    public Set<C9939f> mo33916b() {
        return this.f27731e.mo33916b();
    }

    /* renamed from: a */
    private final <D extends C10359m> D m34022a(D d) {
        if (this.f27728b.mo38622b()) {
            return d;
        }
        if (this.f27729c == null) {
            this.f27729c = new HashMap();
        }
        Map<C10359m, C10359m> map = this.f27729c;
        if (map != null) {
            D d2 = map.get(d);
            if (d2 == null) {
                if (d instanceof C10368p0) {
                    d2 = ((C10368p0) d).mo35448a(this.f27728b);
                    if (d2 != null) {
                        map.put(d, d2);
                    } else {
                        throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, " + "but " + d + " substitution fails");
                    }
                } else {
                    throw new IllegalStateException(("Unknown descriptor in scope: " + d).toString());
                }
            }
            D d3 = (C10359m) d2;
            if (d3 != null) {
                return d3;
            }
            throw new TypeCastException("null cannot be cast to non-null type D");
        }
        C10202j.m34172a();
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final <D extends C10359m> Collection<D> m34019a(Collection<? extends D> collection) {
        if (this.f27728b.mo38622b() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet d = C12141a.m40136d(collection.size());
        Iterator<? extends D> it = collection.iterator();
        while (it.hasNext()) {
            d.add(m34022a((C10359m) it.next()));
        }
        return d;
    }

    /* renamed from: a */
    public Collection<? extends C10360m0> mo33913a(C9939f fVar, C9398b bVar) {
        C10202j.m34178b(fVar, "name");
        C10202j.m34178b(bVar, "location");
        return m34019a(this.f27731e.mo33913a(fVar, bVar));
    }

    /* renamed from: a */
    public Collection<C10359m> mo33914a(C10088d dVar, C9113l<? super C9939f, Boolean> lVar) {
        C10202j.m34178b(dVar, "kindFilter");
        C10202j.m34178b(lVar, "nameFilter");
        return m34023c();
    }

    /* renamed from: a */
    public Set<C9939f> mo33915a() {
        return this.f27731e.mo33915a();
    }
}
