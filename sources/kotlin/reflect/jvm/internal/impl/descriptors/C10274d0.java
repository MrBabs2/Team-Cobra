package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p215c0.p216c.C9113l;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d0 */
/* compiled from: PackageFragmentProviderImpl.kt */
public final class C10274d0 implements C10265c0 {

    /* renamed from: a */
    private final Collection<C10240b0> f27952a;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d0$a */
    /* compiled from: PackageFragmentProviderImpl.kt */
    static final class C10275a extends C10203k implements C9113l<C10240b0, C9934b> {

        /* renamed from: f */
        public static final C10275a f27953f = new C10275a();

        C10275a() {
            super(1);
        }

        /* renamed from: a */
        public final C9934b invoke(C10240b0 b0Var) {
            C10202j.m34178b(b0Var, "it");
            return b0Var.mo35425c();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d0$b */
    /* compiled from: PackageFragmentProviderImpl.kt */
    static final class C10276b extends C10203k implements C9113l<C9934b, Boolean> {

        /* renamed from: f */
        final /* synthetic */ C9934b f27954f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10276b(C9934b bVar) {
            super(1);
            this.f27954f = bVar;
        }

        /* renamed from: a */
        public final boolean mo35450a(C9934b bVar) {
            C10202j.m34178b(bVar, "it");
            return !bVar.mo34996b() && C10202j.m34176a((Object) bVar.mo34998c(), (Object) this.f27954f);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(mo35450a((C9934b) obj));
        }
    }

    public C10274d0(Collection<? extends C10240b0> collection) {
        C10202j.m34178b(collection, "packageFragments");
        this.f27952a = collection;
    }

    /* renamed from: a */
    public List<C10240b0> mo33891a(C9934b bVar) {
        C10202j.m34178b(bVar, "fqName");
        Collection<C10240b0> collection = this.f27952a;
        ArrayList arrayList = new ArrayList();
        for (T next : collection) {
            if (C10202j.m34176a((Object) ((C10240b0) next).mo35425c(), (Object) bVar)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public Collection<C9934b> mo33890a(C9934b bVar, C9113l<? super C9939f, Boolean> lVar) {
        C10202j.m34178b(bVar, "fqName");
        C10202j.m34178b(lVar, "nameFilter");
        return C12090n.m39931g(C12090n.m39921a(C12090n.m39926d(C10539w.m35782b(this.f27952a), C10275a.f27953f), new C10276b(bVar)));
    }
}
