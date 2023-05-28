package kotlin.reflect.jvm.internal.impl.descriptors.p261d1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C10485x;
import kotlin.C9134f;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.jvm.internal.C10211s;
import kotlin.jvm.internal.C10212t;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9168l;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p246f.C9943a;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11811c;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11817i;
import kotlin.p215c0.p216c.C9102a;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10265c0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10343e0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10364o;
import kotlin.reflect.jvm.internal.impl.descriptors.C10393y;
import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleException;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.v */
/* compiled from: ModuleDescriptorImpl.kt */
public final class C10334v extends C10309j implements C10393y {

    /* renamed from: o */
    static final /* synthetic */ C9168l[] f28108o = {C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a(C10334v.class), "packageFragmentProviderForWholeModuleWithDependencies", "getPackageFragmentProviderForWholeModuleWithDependencies()Lorg/jetbrains/kotlin/descriptors/impl/CompositePackageFragmentProvider;"))};
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C10332t f28109h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C10265c0 f28110i;

    /* renamed from: j */
    private boolean f28111j;

    /* renamed from: k */
    private final C11811c<C9934b, C10343e0> f28112k;

    /* renamed from: l */
    private final C9134f f28113l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C11817i f28114m;

    /* renamed from: n */
    private final C9333g f28115n;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.v$a */
    /* compiled from: ModuleDescriptorImpl.kt */
    static final class C10335a extends C10203k implements C9102a<C10304i> {

        /* renamed from: f */
        final /* synthetic */ C10334v f28116f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10335a(C10334v vVar) {
            super(0);
            this.f28116f = vVar;
        }

        public final C10304i invoke() {
            C10332t a = this.f28116f.f28109h;
            if (a != null) {
                List<C10334v> a2 = a.mo35547a();
                boolean contains = a2.contains(this.f28116f);
                if (!C10485x.f28360a || contains) {
                    for (C10334v vVar : a2) {
                        boolean e = vVar.m34798v0();
                        if (C10485x.f28360a && !e) {
                            throw new AssertionError("Dependency module " + vVar.m34796q0() + " was not initialized by the time contents of dependent module " + this.f28116f.m34796q0() + " were queried");
                        }
                    }
                    ArrayList arrayList = new ArrayList(C10531p.m35750a(a2, 10));
                    for (C10334v c : a2) {
                        C10265c0 c2 = c.f28110i;
                        if (c2 != null) {
                            arrayList.add(c2);
                        } else {
                            C10202j.m34172a();
                            throw null;
                        }
                    }
                    return new C10304i(arrayList);
                }
                throw new AssertionError("Module " + this.f28116f.m34796q0() + " is not contained in his own dependencies, this is probably a misconfiguration");
            }
            throw new AssertionError("Dependencies of module " + this.f28116f.m34796q0() + " were not set before querying module content");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.v$b */
    /* compiled from: ModuleDescriptorImpl.kt */
    static final class C10336b extends C10203k implements C9113l<C9934b, C10327r> {

        /* renamed from: f */
        final /* synthetic */ C10334v f28117f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10336b(C10334v vVar) {
            super(1);
            this.f28117f = vVar;
        }

        /* renamed from: a */
        public final C10327r invoke(C9934b bVar) {
            C10202j.m34178b(bVar, "fqName");
            C10334v vVar = this.f28117f;
            return new C10327r(vVar, bVar, vVar.f28114m);
        }
    }

    public C10334v(C9939f fVar, C11817i iVar, C9333g gVar, C9943a aVar) {
        this(fVar, iVar, gVar, aVar, (Map) null, (C9939f) null, 48, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10334v(C9939f fVar, C11817i iVar, C9333g gVar, C9943a aVar, Map map, C9939f fVar2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, iVar, gVar, (i & 8) != 0 ? null : aVar, (i & 16) != 0 ? C10518j0.m35601a() : map, (i & 32) != 0 ? null : fVar2);
    }

    /* access modifiers changed from: private */
    /* renamed from: q0 */
    public final String m34796q0() {
        String fVar = getName().toString();
        C10202j.m34174a((Object) fVar, "name.toString()");
        return fVar;
    }

    /* renamed from: u0 */
    private final C10304i m34797u0() {
        C9134f fVar = this.f28113l;
        C9168l lVar = f28108o[0];
        return (C10304i) fVar.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: v0 */
    public final boolean m34798v0() {
        return this.f28110i != null;
    }

    /* renamed from: B */
    public List<C10393y> mo35550B() {
        C10332t tVar = this.f28109h;
        if (tVar != null) {
            return tVar.mo35548b();
        }
        throw new AssertionError("Dependencies of module " + m34796q0() + " were not set");
    }

    /* renamed from: C */
    public final C10265c0 mo35551C() {
        mo35562r();
        return m34797u0();
    }

    /* renamed from: K */
    public boolean mo35552K() {
        return this.f28111j;
    }

    /* renamed from: a */
    public <R, D> R mo35440a(C10364o<R, D> oVar, D d) {
        C10202j.m34178b(oVar, "visitor");
        return C10393y.C10394a.m35082a(this, oVar, d);
    }

    /* renamed from: l */
    public C9333g mo35561l() {
        return this.f28115n;
    }

    /* renamed from: r */
    public void mo35562r() {
        if (!mo35552K()) {
            throw new InvalidModuleException("Accessing invalid module descriptor " + this);
        }
    }

    /* renamed from: b */
    public C10359m mo33762b() {
        return C10393y.C10394a.m35083a(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10334v(C9939f fVar, C11817i iVar, C9333g gVar, C9943a aVar, Map<Object<?>, ? extends Object> map, C9939f fVar2) {
        super(C10249g.f27910c.mo35429a(), fVar);
        C10202j.m34178b(fVar, "moduleName");
        C10202j.m34178b(iVar, "storageManager");
        C10202j.m34178b(gVar, "builtIns");
        C10202j.m34178b(map, "capabilities");
        this.f28114m = iVar;
        this.f28115n = gVar;
        if (fVar.mo35024e()) {
            this.f28111j = true;
            this.f28112k = this.f28114m.mo38399a(new C10336b(this));
            this.f28113l = C10181i.m34134a(new C10335a(this));
            return;
        }
        throw new IllegalArgumentException("Module name must be special: " + fVar);
    }

    /* renamed from: a */
    public C10343e0 mo35554a(C9934b bVar) {
        C10202j.m34178b(bVar, "fqName");
        mo35562r();
        return this.f28112k.invoke(bVar);
    }

    /* renamed from: a */
    public Collection<C9934b> mo35553a(C9934b bVar, C9113l<? super C9939f, Boolean> lVar) {
        C10202j.m34178b(bVar, "fqName");
        C10202j.m34178b(lVar, "nameFilter");
        mo35562r();
        return mo35551C().mo33890a(bVar, lVar);
    }

    /* renamed from: a */
    public final void mo35558a(C10332t tVar) {
        C10202j.m34178b(tVar, "dependencies");
        boolean z = this.f28109h == null;
        if (!C10485x.f28360a || z) {
            this.f28109h = tVar;
            return;
        }
        throw new AssertionError("Dependencies of " + m34796q0() + " were already set");
    }

    /* renamed from: a */
    public final void mo35559a(C10334v... vVarArr) {
        C10202j.m34178b(vVarArr, "descriptors");
        mo35555a((List<C10334v>) C10519k.m35653k(vVarArr));
    }

    /* renamed from: a */
    public final void mo35555a(List<C10334v> list) {
        C10202j.m34178b(list, "descriptors");
        mo35556a(list, (Set<C10334v>) C10530o0.m35747a());
    }

    /* renamed from: a */
    public final void mo35556a(List<C10334v> list, Set<C10334v> set) {
        C10202j.m34178b(list, "descriptors");
        C10202j.m34178b(set, "friends");
        mo35558a((C10332t) new C10333u(list, set, C10529o.m35736a()));
    }

    /* renamed from: a */
    public boolean mo35560a(C10393y yVar) {
        C10202j.m34178b(yVar, "targetModule");
        if (!C10202j.m34176a((Object) this, (Object) yVar)) {
            C10332t tVar = this.f28109h;
            if (tVar != null) {
                return C10539w.m35777a(tVar.mo35549c(), yVar) || mo35550B().contains(yVar);
            }
            C10202j.m34172a();
            throw null;
        }
    }

    /* renamed from: a */
    public final void mo35557a(C10265c0 c0Var) {
        C10202j.m34178b(c0Var, "providerForModuleContent");
        boolean z = !m34798v0();
        if (!C10485x.f28360a || z) {
            this.f28110i = c0Var;
            return;
        }
        throw new AssertionError("Attempt to initialize module " + m34796q0() + " twice");
    }
}
