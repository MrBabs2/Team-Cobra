package kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p226b.p227b.C9398b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10352i0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10360m0;

/* renamed from: kotlin.h0.u.e.k0.h.q.a */
/* compiled from: AbstractScopeAdapter.kt */
public abstract class C10082a implements C10096h {
    /* renamed from: a */
    public Collection<C10360m0> mo33913a(C9939f fVar, C9398b bVar) {
        C10202j.m34178b(fVar, "name");
        C10202j.m34178b(bVar, "location");
        return mo35291c().mo33913a(fVar, bVar);
    }

    /* renamed from: b */
    public C10349h mo33917b(C9939f fVar, C9398b bVar) {
        C10202j.m34178b(fVar, "name");
        C10202j.m34178b(bVar, "location");
        return mo35291c().mo33917b(fVar, bVar);
    }

    /* renamed from: c */
    public Collection<C10352i0> mo33918c(C9939f fVar, C9398b bVar) {
        C10202j.m34178b(fVar, "name");
        C10202j.m34178b(bVar, "location");
        return mo35291c().mo33918c(fVar, bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract C10096h mo35291c();

    /* renamed from: a */
    public Collection<C10359m> mo33914a(C10088d dVar, C9113l<? super C9939f, Boolean> lVar) {
        C10202j.m34178b(dVar, "kindFilter");
        C10202j.m34178b(lVar, "nameFilter");
        return mo35291c().mo33914a(dVar, lVar);
    }

    /* renamed from: b */
    public Set<C9939f> mo33916b() {
        return mo35291c().mo33916b();
    }

    /* renamed from: a */
    public Set<C9939f> mo33915a() {
        return mo35291c().mo33915a();
    }
}
