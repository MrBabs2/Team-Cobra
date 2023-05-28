package kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.p378g0.C11738f;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.p378g0.C11751i;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9759b0;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9772e0;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9856v;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9861w;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9868a;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9877e;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10096h;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11817i;
import kotlin.p215c0.p216c.C9102a;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10393y;

/* renamed from: kotlin.h0.u.e.k0.i.b.q */
/* compiled from: DeserializedPackageFragmentImpl.kt */
public abstract class C11774q extends C11773p {

    /* renamed from: k */
    private final C9877e f31456k;

    /* renamed from: l */
    private final C11793z f31457l;

    /* renamed from: m */
    private C9861w f31458m;

    /* renamed from: n */
    private C10096h f31459n;

    /* renamed from: o */
    private final C9868a f31460o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C11738f f31461p;

    /* renamed from: kotlin.h0.u.e.k0.i.b.q$a */
    /* compiled from: DeserializedPackageFragmentImpl.kt */
    static final class C11775a extends C10203k implements C9113l<C9933a, C10362n0> {

        /* renamed from: f */
        final /* synthetic */ C11774q f31462f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11775a(C11774q qVar) {
            super(1);
            this.f31462f = qVar;
        }

        /* renamed from: a */
        public final C10362n0 invoke(C9933a aVar) {
            C10202j.m34178b(aVar, "it");
            C11738f a = this.f31462f.f31461p;
            if (a != null) {
                return a;
            }
            C10362n0 n0Var = C10362n0.f28175a;
            C10202j.m34174a((Object) n0Var, "SourceElement.NO_SOURCE");
            return n0Var;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.i.b.q$b */
    /* compiled from: DeserializedPackageFragmentImpl.kt */
    static final class C11776b extends C10203k implements C9102a<List<? extends C9939f>> {

        /* renamed from: f */
        final /* synthetic */ C11774q f31463f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11776b(C11774q qVar) {
            super(0);
            this.f31463f = qVar;
        }

        public final List<C9939f> invoke() {
            Collection<C9933a> a = this.f31463f.mo38386r().mo38396a();
            ArrayList<C9933a> arrayList = new ArrayList<>();
            for (T next : a) {
                C9933a aVar = (C9933a) next;
                if (!aVar.mo34991h() && !C11760j.f31419d.mo38347a().contains(aVar)) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C10531p.m35750a(arrayList, 10));
            for (C9933a f : arrayList) {
                arrayList2.add(f.mo34989f());
            }
            return arrayList2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11774q(C9934b bVar, C11817i iVar, C10393y yVar, C9861w wVar, C9868a aVar, C11738f fVar) {
        super(bVar, iVar, yVar);
        C10202j.m34178b(bVar, "fqName");
        C10202j.m34178b(iVar, "storageManager");
        C10202j.m34178b(yVar, "module");
        C10202j.m34178b(wVar, "proto");
        C10202j.m34178b(aVar, "metadataVersion");
        this.f31460o = aVar;
        this.f31461p = fVar;
        C9772e0 p = wVar.mo34825p();
        C10202j.m34174a((Object) p, "proto.strings");
        C9759b0 o = wVar.mo34824o();
        C10202j.m34174a((Object) o, "proto.qualifiedNames");
        C9877e eVar = new C9877e(p, o);
        this.f31456k = eVar;
        this.f31457l = new C11793z(wVar, eVar, this.f31460o, new C11775a(this));
        this.f31458m = wVar;
    }

    /* renamed from: m */
    public C10096h mo33834m() {
        C10096h hVar = this.f31459n;
        if (hVar != null) {
            return hVar;
        }
        C10202j.m34181d("_memberScope");
        throw null;
    }

    /* renamed from: a */
    public void mo38384a(C11767l lVar) {
        C10202j.m34178b(lVar, "components");
        C9861w wVar = this.f31458m;
        if (wVar != null) {
            this.f31458m = null;
            C9856v n = wVar.mo34823n();
            C10202j.m34174a((Object) n, "proto.`package`");
            this.f31459n = new C11751i(this, n, this.f31456k, this.f31460o, this.f31461p, lVar, new C11776b(this));
            return;
        }
        throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize".toString());
    }

    /* renamed from: r */
    public C11793z m38793r() {
        return this.f31457l;
    }
}
