package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.p231n;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p045h0.p046u.p047e.p048k0.p226b.p227b.C9398b;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.C9620m;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.C9422h;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.p231n.C9432b;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9514a0;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9520g;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9534t;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9719m;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9723n;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9724o;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.p239a0.C9688a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9941h;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10088d;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11812d;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11815g;
import kotlin.p215c0.p216c.C9102a;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10352i0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10360m0;
import kotlin.reflect.jvm.internal.impl.utils.C12150d;

/* renamed from: kotlin.h0.u.e.k0.c.a.a0.n.j */
/* compiled from: LazyJavaPackageScope.kt */
public final class C9463j extends C9489m {

    /* renamed from: j */
    private final C11815g<Set<String>> f26277j;

    /* renamed from: k */
    private final C11812d<C9464a, C10342e> f26278k;

    /* renamed from: l */
    private final C9534t f26279l;

    /* renamed from: m */
    private final C9459i f26280m;

    /* renamed from: kotlin.h0.u.e.k0.c.a.a0.n.j$a */
    /* compiled from: LazyJavaPackageScope.kt */
    private static final class C9464a {

        /* renamed from: a */
        private final C9939f f26281a;

        /* renamed from: b */
        private final C9520g f26282b;

        public C9464a(C9939f fVar, C9520g gVar) {
            C10202j.m34178b(fVar, "name");
            this.f26281a = fVar;
            this.f26282b = gVar;
        }

        /* renamed from: a */
        public final C9520g mo33957a() {
            return this.f26282b;
        }

        /* renamed from: b */
        public final C9939f mo33958b() {
            return this.f26281a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C9464a) && C10202j.m34176a((Object) this.f26281a, (Object) ((C9464a) obj).f26281a);
        }

        public int hashCode() {
            return this.f26281a.hashCode();
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.c.a.a0.n.j$b */
    /* compiled from: LazyJavaPackageScope.kt */
    private static abstract class C9465b {

        /* renamed from: kotlin.h0.u.e.k0.c.a.a0.n.j$b$a */
        /* compiled from: LazyJavaPackageScope.kt */
        public static final class C9466a extends C9465b {

            /* renamed from: a */
            private final C10342e f26283a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9466a(C10342e eVar) {
                super((DefaultConstructorMarker) null);
                C10202j.m34178b(eVar, "descriptor");
                this.f26283a = eVar;
            }

            /* renamed from: a */
            public final C10342e mo33961a() {
                return this.f26283a;
            }
        }

        /* renamed from: kotlin.h0.u.e.k0.c.a.a0.n.j$b$b */
        /* compiled from: LazyJavaPackageScope.kt */
        public static final class C9467b extends C9465b {

            /* renamed from: a */
            public static final C9467b f26284a = new C9467b();

            private C9467b() {
                super((DefaultConstructorMarker) null);
            }
        }

        /* renamed from: kotlin.h0.u.e.k0.c.a.a0.n.j$b$c */
        /* compiled from: LazyJavaPackageScope.kt */
        public static final class C9468c extends C9465b {

            /* renamed from: a */
            public static final C9468c f26285a = new C9468c();

            private C9468c() {
                super((DefaultConstructorMarker) null);
            }
        }

        private C9465b() {
        }

        public /* synthetic */ C9465b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.c.a.a0.n.j$c */
    /* compiled from: LazyJavaPackageScope.kt */
    static final class C9469c extends C10203k implements C9113l<C9464a, C10342e> {

        /* renamed from: f */
        final /* synthetic */ C9463j f26286f;

        /* renamed from: g */
        final /* synthetic */ C9422h f26287g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9469c(C9463j jVar, C9422h hVar) {
            super(1);
            this.f26286f = jVar;
            this.f26287g = hVar;
        }

        /* renamed from: a */
        public final C10342e invoke(C9464a aVar) {
            C9719m.C9720a aVar2;
            byte[] bArr;
            C10202j.m34178b(aVar, "request");
            C9933a aVar3 = new C9933a(this.f26286f.m30695g().mo35425c(), aVar.mo33958b());
            if (aVar.mo33957a() != null) {
                aVar2 = this.f26287g.mo33892a().mo33870h().mo33672a(aVar.mo33957a());
            } else {
                aVar2 = this.f26287g.mo33892a().mo33870h().mo33673a(aVar3);
            }
            C9724o a = aVar2 != null ? aVar2.mo34312a() : null;
            C9933a d = a != null ? a.mo33665d() : null;
            if (d != null && (d.mo34991h() || d.mo34990g())) {
                return null;
            }
            C9465b a2 = this.f26286f.m30682a(a);
            if (a2 instanceof C9465b.C9466a) {
                return ((C9465b.C9466a) a2).mo33961a();
            }
            if (a2 instanceof C9465b.C9468c) {
                return null;
            }
            if (a2 instanceof C9465b.C9467b) {
                C9520g a3 = aVar.mo33957a();
                if (a3 == null) {
                    C9620m d2 = this.f26287g.mo33892a().mo33866d();
                    if (aVar2 != null) {
                        if (!(aVar2 instanceof C9719m.C9720a.C9721a)) {
                            aVar2 = null;
                        }
                        C9719m.C9720a.C9721a aVar4 = (C9719m.C9720a.C9721a) aVar2;
                        if (aVar4 != null) {
                            bArr = aVar4.mo34313b();
                            a3 = d2.mo33658a(new C9620m.C9621a(aVar3, bArr, (C9520g) null, 4, (DefaultConstructorMarker) null));
                        }
                    }
                    bArr = null;
                    a3 = d2.mo33658a(new C9620m.C9621a(aVar3, bArr, (C9520g) null, 4, (DefaultConstructorMarker) null));
                }
                C9520g gVar = a3;
                if ((gVar != null ? gVar.mo34032B() : null) != C9514a0.BINARY) {
                    C9934b c = gVar != null ? gVar.mo34036c() : null;
                    if (c == null || c.mo34996b() || (!C10202j.m34176a((Object) c.mo34998c(), (Object) this.f26286f.m30695g().mo35425c()))) {
                        return null;
                    }
                    C9441f fVar = new C9441f(this.f26287g, this.f26286f.m30695g(), gVar, (C10342e) null, 8, (DefaultConstructorMarker) null);
                    this.f26287g.mo33892a().mo33867e().mo34178a(fVar);
                    return fVar;
                }
                throw new IllegalStateException("Couldn't find kotlin binary class for light class created by kotlin binary file\n" + "JavaClass: " + gVar + 10 + "ClassId: " + aVar3 + 10 + "findKotlinClass(JavaClass) = " + C9723n.m31361a(this.f26287g.mo33892a().mo33870h(), gVar) + 10 + "findKotlinClass(ClassId) = " + C9723n.m31362a(this.f26287g.mo33892a().mo33870h(), aVar3) + 10);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.c.a.a0.n.j$d */
    /* compiled from: LazyJavaPackageScope.kt */
    static final class C9470d extends C10203k implements C9102a<Set<? extends String>> {

        /* renamed from: f */
        final /* synthetic */ C9463j f26288f;

        /* renamed from: g */
        final /* synthetic */ C9422h f26289g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9470d(C9463j jVar, C9422h hVar) {
            super(0);
            this.f26288f = jVar;
            this.f26289g = hVar;
        }

        public final Set<String> invoke() {
            return this.f26289g.mo33892a().mo33866d().mo33660b(this.f26288f.m30695g().mo35425c());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9463j(C9422h hVar, C9534t tVar, C9459i iVar) {
        super(hVar);
        C10202j.m34178b(hVar, "c");
        C10202j.m34178b(tVar, "jPackage");
        C10202j.m34178b(iVar, "ownerDescriptor");
        this.f26279l = tVar;
        this.f26280m = iVar;
        this.f26277j = hVar.mo33896e().mo38408c(new C9470d(this, hVar));
        this.f26278k = hVar.mo33896e().mo38406b(new C9469c(this, hVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo33933a(Collection<C10360m0> collection, C9939f fVar) {
        C10202j.m34178b(collection, "result");
        C10202j.m34178b(fVar, "name");
    }

    /* renamed from: c */
    public Collection<C10352i0> mo33918c(C9939f fVar, C9398b bVar) {
        C10202j.m34178b(fVar, "name");
        C10202j.m34178b(bVar, "location");
        return C10529o.m35736a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Set<C9939f> mo33938d(C10088d dVar, C9113l<? super C9939f, Boolean> lVar) {
        C10202j.m34178b(dVar, "kindFilter");
        return C10530o0.m35747a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Set<C9939f> mo33940e(C10088d dVar, C9113l<? super C9939f, Boolean> lVar) {
        C10202j.m34178b(dVar, "kindFilter");
        return C10530o0.m35747a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C9465b m30682a(C9724o oVar) {
        if (oVar == null) {
            return C9465b.C9467b.f26284a;
        }
        if (oVar.mo33661a().mo34261c() != C9688a.C9689a.CLASS) {
            return C9465b.C9468c.f26285a;
        }
        C10342e b = mo33967d().mo33892a().mo33864b().mo34287b(oVar);
        return b != null ? new C9465b.C9466a(b) : C9465b.C9467b.f26284a;
    }

    /* renamed from: b */
    public C10342e m30689b(C9939f fVar, C9398b bVar) {
        C10202j.m34178b(fVar, "name");
        C10202j.m34178b(bVar, "location");
        return m30683a(fVar, (C9520g) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C9432b mo33937c() {
        return C9432b.C9433a.f26212a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C9459i m30695g() {
        return this.f26280m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Set<C9939f> mo33936b(C10088d dVar, C9113l<? super C9939f, Boolean> lVar) {
        C10202j.m34178b(dVar, "kindFilter");
        if (!dVar.mo35297a(C10088d.f27705u.mo35304d())) {
            return C10530o0.m35747a();
        }
        Set<String> set = (Set) this.f26277j.invoke();
        if (set != null) {
            HashSet hashSet = new HashSet();
            for (String b : set) {
                hashSet.add(C9939f.m33302b(b));
            }
            return hashSet;
        }
        C9534t tVar = this.f26279l;
        if (lVar == null) {
            lVar = C12150d.m40155a();
        }
        Collection<C9520g> a = tVar.mo34066a(lVar);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C9520g gVar : a) {
            C9939f name = gVar.mo34032B() == C9514a0.SOURCE ? null : gVar.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    /* renamed from: a */
    private final C10342e m30683a(C9939f fVar, C9520g gVar) {
        if (!C9941h.m33311a(fVar)) {
            return null;
        }
        Set set = (Set) this.f26277j.invoke();
        if (gVar != null || set == null || set.contains(fVar.mo35021a())) {
            return this.f26278k.invoke(new C9464a(fVar, gVar));
        }
        return null;
    }

    /* renamed from: a */
    public final C10342e mo33956a(C9520g gVar) {
        C10202j.m34178b(gVar, "javaClass");
        return m30683a(gVar.getName(), gVar);
    }

    /* renamed from: a */
    public Collection<C10359m> mo33914a(C10088d dVar, C9113l<? super C9939f, Boolean> lVar) {
        C10202j.m34178b(dVar, "kindFilter");
        C10202j.m34178b(lVar, "nameFilter");
        return mo33966c(dVar, lVar);
    }
}
