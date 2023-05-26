package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.p231n;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.jvm.internal.C10211s;
import kotlin.jvm.internal.C10212t;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9168l;
import kotlin.p045h0.p046u.p047e.p048k0.p226b.C9396a;
import kotlin.p045h0.p046u.p047e.p048k0.p226b.p227b.C9398b;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.C9422h;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9534t;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9724o;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10096h;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11814f;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11816h;
import kotlin.p045h0.p046u.p047e.p048k0.p386l.p388n.C12020a;
import kotlin.p215c0.p216c.C9102a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10240b0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10351i;
import kotlin.reflect.jvm.internal.impl.descriptors.C10352i0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10360m0;

/* renamed from: kotlin.h0.u.e.k0.c.a.a0.n.d */
/* compiled from: JvmPackageScope.kt */
public final class C9435d implements C10096h {

    /* renamed from: f */
    static final /* synthetic */ C9168l[] f26213f = {C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a(C9435d.class), "kotlinScopes", "getKotlinScopes()Ljava/util/List;"))};

    /* renamed from: b */
    private final C9463j f26214b;

    /* renamed from: c */
    private final C11814f f26215c = this.f26216d.mo33896e().mo38401a(new C9436a(this));
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C9422h f26216d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C9459i f26217e;

    /* renamed from: kotlin.h0.u.e.k0.c.a.a0.n.d$a */
    /* compiled from: JvmPackageScope.kt */
    static final class C9436a extends C10203k implements C9102a<List<? extends C10096h>> {

        /* renamed from: f */
        final /* synthetic */ C9435d f26218f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9436a(C9435d dVar) {
            super(0);
            this.f26218f = dVar;
        }

        public final List<C10096h> invoke() {
            Collection<C9724o> values = this.f26218f.f26217e.mo33954r().values();
            ArrayList arrayList = new ArrayList();
            for (C9724o a : values) {
                C10096h a2 = this.f26218f.f26216d.mo33892a().mo33864b().mo34283a((C10240b0) this.f26218f.f26217e, a);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            return C10539w.m35815n(arrayList);
        }
    }

    public C9435d(C9422h hVar, C9534t tVar, C9459i iVar) {
        C10202j.m34178b(hVar, "c");
        C10202j.m34178b(tVar, "jPackage");
        C10202j.m34178b(iVar, "packageFragment");
        this.f26216d = hVar;
        this.f26217e = iVar;
        this.f26214b = new C9463j(this.f26216d, tVar, this.f26217e);
    }

    /* renamed from: d */
    private final List<C10096h> m30554d() {
        return (List) C11816h.m38876a(this.f26215c, (Object) this, (C9168l<?>) f26213f[0]);
    }

    /* renamed from: c */
    public final C9463j mo33919c() {
        return this.f26214b;
    }

    /* renamed from: d */
    public void mo33920d(C9939f fVar, C9398b bVar) {
        C10202j.m34178b(fVar, "name");
        C10202j.m34178b(bVar, "location");
        C9396a.m30447a(this.f26216d.mo33892a().mo33871i(), bVar, (C10240b0) this.f26217e, fVar);
    }

    /* renamed from: a */
    public Collection<C10360m0> mo33913a(C9939f fVar, C9398b bVar) {
        C10202j.m34178b(fVar, "name");
        C10202j.m34178b(bVar, "location");
        mo33920d(fVar, bVar);
        C9463j jVar = this.f26214b;
        List<C10096h> d = m30554d();
        Collection a = jVar.mo33913a(fVar, bVar);
        for (C10096h a2 : d) {
            a = C12020a.m39719a(a, a2.mo33913a(fVar, bVar));
        }
        return a != null ? a : C10530o0.m35747a();
    }

    /* renamed from: b */
    public C10349h mo33917b(C9939f fVar, C9398b bVar) {
        C10202j.m34178b(fVar, "name");
        C10202j.m34178b(bVar, "location");
        mo33920d(fVar, bVar);
        C10342e b = this.f26214b.m30689b(fVar, bVar);
        if (b != null) {
            return b;
        }
        C10349h hVar = null;
        for (C10096h b2 : m30554d()) {
            C10349h b3 = b2.mo33917b(fVar, bVar);
            if (b3 != null) {
                if (!(b3 instanceof C10351i) || !((C10351i) b3).mo33758F()) {
                    return b3;
                }
                if (hVar == null) {
                    hVar = b3;
                }
            }
        }
        return hVar;
    }

    /* renamed from: c */
    public Collection<C10352i0> mo33918c(C9939f fVar, C9398b bVar) {
        C10202j.m34178b(fVar, "name");
        C10202j.m34178b(bVar, "location");
        mo33920d(fVar, bVar);
        C9463j jVar = this.f26214b;
        List<C10096h> d = m30554d();
        Collection c = jVar.mo33918c(fVar, bVar);
        for (C10096h c2 : d) {
            c = C12020a.m39719a(c, c2.mo33918c(fVar, bVar));
        }
        return c != null ? c : C10530o0.m35747a();
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [kotlin.c0.c.l<? super kotlin.h0.u.e.k0.e.f, java.lang.Boolean>, java.lang.Object, kotlin.c0.c.l] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.C10359m> mo33914a(kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10088d r4, kotlin.p215c0.p216c.C9113l<? super kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f, java.lang.Boolean> r5) {
        /*
            r3 = this;
            java.lang.String r0 = "kindFilter"
            kotlin.jvm.internal.C10202j.m34178b(r4, r0)
            java.lang.String r0 = "nameFilter"
            kotlin.jvm.internal.C10202j.m34178b(r5, r0)
            kotlin.h0.u.e.k0.c.a.a0.n.j r0 = r3.f26214b
            java.util.List r1 = r3.m30554d()
            java.util.Collection r0 = r0.mo33914a(r4, r5)
            java.util.Iterator r1 = r1.iterator()
        L_0x0018:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r1.next()
            kotlin.h0.u.e.k0.h.q.h r2 = (kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10096h) r2
            java.util.Collection r2 = r2.mo33914a(r4, r5)
            java.util.Collection r0 = kotlin.p045h0.p046u.p047e.p048k0.p386l.p388n.C12020a.m39719a(r0, r2)
            goto L_0x0018
        L_0x002d:
            if (r0 == 0) goto L_0x0030
            goto L_0x0034
        L_0x0030:
            java.util.Set r0 = kotlin.p262y.C10530o0.m35747a()
        L_0x0034:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.p231n.C9435d.mo33914a(kotlin.h0.u.e.k0.h.q.d, kotlin.c0.c.l):java.util.Collection");
    }

    /* renamed from: b */
    public Set<C9939f> mo33916b() {
        List<C10096h> d = m30554d();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C10096h b : d) {
            boolean unused = C10536t.m35760a(linkedHashSet, b.mo33916b());
        }
        linkedHashSet.addAll(this.f26214b.mo33916b());
        return linkedHashSet;
    }

    /* renamed from: a */
    public Set<C9939f> mo33915a() {
        List<C10096h> d = m30554d();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C10096h a : d) {
            boolean unused = C10536t.m35760a(linkedHashSet, a.mo33915a());
        }
        linkedHashSet.addAll(this.f26214b.mo33915a());
        return linkedHashSet;
    }
}
