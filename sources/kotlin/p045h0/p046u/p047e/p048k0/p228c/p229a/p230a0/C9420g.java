package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0;

import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.C9428m;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.p231n.C9459i;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9534t;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11794a;
import kotlin.p215c0.p216c.C9102a;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10265c0;

/* renamed from: kotlin.h0.u.e.k0.c.a.a0.g */
/* compiled from: LazyJavaPackageFragmentProvider.kt */
public final class C9420g implements C10265c0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C9422h f26186a;

    /* renamed from: b */
    private final C11794a<C9934b, C9459i> f26187b;

    /* renamed from: kotlin.h0.u.e.k0.c.a.a0.g$a */
    /* compiled from: LazyJavaPackageFragmentProvider.kt */
    static final class C9421a extends C10203k implements C9102a<C9459i> {

        /* renamed from: f */
        final /* synthetic */ C9420g f26188f;

        /* renamed from: g */
        final /* synthetic */ C9534t f26189g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9421a(C9420g gVar, C9534t tVar) {
            super(0);
            this.f26188f = gVar;
            this.f26189g = tVar;
        }

        public final C9459i invoke() {
            return new C9459i(this.f26188f.f26186a, this.f26189g);
        }
    }

    public C9420g(C9412b bVar) {
        C10202j.m34178b(bVar, "components");
        C9422h hVar = new C9422h(bVar, C9428m.C9429a.f26205a, C10183j.m34137a(null));
        this.f26186a = hVar;
        this.f26187b = hVar.mo33896e().mo38398a();
    }

    /* renamed from: b */
    private final C9459i m30512b(C9934b bVar) {
        C9534t a = this.f26186a.mo33892a().mo33866d().mo33659a(bVar);
        if (a != null) {
            return this.f26187b.mo38397a(bVar, new C9421a(this, a));
        }
        return null;
    }

    /* renamed from: a */
    public List<C9459i> mo33891a(C9934b bVar) {
        C10202j.m34178b(bVar, "fqName");
        return C10529o.m35739b(m30512b(bVar));
    }

    /* renamed from: a */
    public List<C9934b> m30515a(C9934b bVar, C9113l<? super C9939f, Boolean> lVar) {
        C10202j.m34178b(bVar, "fqName");
        C10202j.m34178b(lVar, "nameFilter");
        C9459i b = m30512b(bVar);
        List<C9934b> B = b != null ? b.mo33952B() : null;
        return B != null ? B : C10529o.m35736a();
    }
}
