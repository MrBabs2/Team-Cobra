package kotlin.reflect.jvm.internal.impl.descriptors.p261d1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.jvm.internal.C10211s;
import kotlin.jvm.internal.C10212t;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9168l;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10083b;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10095g;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10096h;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11814f;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11816h;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11817i;
import kotlin.p215c0.p216c.C9102a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10240b0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10343e0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10364o;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.r */
/* compiled from: LazyPackageViewDescriptorImpl.kt */
public final class C10327r extends C10309j implements C10343e0 {

    /* renamed from: l */
    static final /* synthetic */ C9168l[] f28092l = {C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a(C10327r.class), "fragments", "getFragments()Ljava/util/List;"))};

    /* renamed from: h */
    private final C11814f f28093h;

    /* renamed from: i */
    private final C10096h f28094i;

    /* renamed from: j */
    private final C10334v f28095j;

    /* renamed from: k */
    private final C9934b f28096k;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.r$a */
    /* compiled from: LazyPackageViewDescriptorImpl.kt */
    static final class C10328a extends C10203k implements C9102a<List<? extends C10240b0>> {

        /* renamed from: f */
        final /* synthetic */ C10327r f28097f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10328a(C10327r rVar) {
            super(0);
            this.f28097f = rVar;
        }

        public final List<C10240b0> invoke() {
            return this.f28097f.m34752i0().mo35551C().mo33891a(this.f28097f.mo35540c());
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.r$b */
    /* compiled from: LazyPackageViewDescriptorImpl.kt */
    static final class C10329b extends C10203k implements C9102a<C10096h> {

        /* renamed from: f */
        final /* synthetic */ C10327r f28098f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10329b(C10327r rVar) {
            super(0);
            this.f28098f = rVar;
        }

        public final C10096h invoke() {
            if (this.f28098f.mo35539D().isEmpty()) {
                return C10096h.C10099b.f27722b;
            }
            List<C10240b0> D = this.f28098f.mo35539D();
            ArrayList arrayList = new ArrayList(C10531p.m35750a(D, 10));
            for (C10240b0 m : D) {
                arrayList.add(m.mo33834m());
            }
            List a = C10539w.m35776a(arrayList, new C10295e0(this.f28098f.m34752i0(), this.f28098f.mo35540c()));
            return new C10083b("package view scope for " + this.f28098f.mo35540c() + " in " + this.f28098f.m34752i0().getName(), a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10327r(C10334v vVar, C9934b bVar, C11817i iVar) {
        super(C10249g.f27910c.mo35429a(), bVar.mo35002f());
        C10202j.m34178b(vVar, "module");
        C10202j.m34178b(bVar, "fqName");
        C10202j.m34178b(iVar, "storageManager");
        this.f28095j = vVar;
        this.f28096k = bVar;
        this.f28093h = iVar.mo38401a(new C10328a(this));
        this.f28094i = new C10095g(iVar.mo38401a(new C10329b(this)));
    }

    /* renamed from: D */
    public List<C10240b0> mo35539D() {
        return (List) C11816h.m38876a(this.f28093h, (Object) this, (C9168l<?>) f28092l[0]);
    }

    /* renamed from: a */
    public <R, D> R mo35440a(C10364o<R, D> oVar, D d) {
        C10202j.m34178b(oVar, "visitor");
        return oVar.mo35121a((C10343e0) this, d);
    }

    /* renamed from: c */
    public C9934b mo35540c() {
        return this.f28096k;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10343e0)) {
            obj = null;
        }
        C10343e0 e0Var = (C10343e0) obj;
        if (e0Var == null || !C10202j.m34176a((Object) mo35540c(), (Object) e0Var.mo35540c()) || !C10202j.m34176a((Object) m34752i0(), (Object) e0Var.mo35543i0())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (m34752i0().hashCode() * 31) + mo35540c().hashCode();
    }

    public boolean isEmpty() {
        return C10343e0.C10344a.m34956a(this);
    }

    /* renamed from: m */
    public C10096h mo35545m() {
        return this.f28094i;
    }

    /* renamed from: b */
    public C10343e0 m34749b() {
        if (mo35540c().mo34996b()) {
            return null;
        }
        C10334v i0 = m34752i0();
        C9934b c = mo35540c().mo34998c();
        C10202j.m34174a((Object) c, "fqName.parent()");
        return i0.mo35554a(c);
    }

    /* renamed from: i0 */
    public C10334v m34752i0() {
        return this.f28095j;
    }
}
