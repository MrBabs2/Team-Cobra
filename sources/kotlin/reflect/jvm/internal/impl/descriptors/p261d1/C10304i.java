package kotlin.reflect.jvm.internal.impl.descriptors.p261d1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10240b0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10265c0;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.i */
/* compiled from: CompositePackageFragmentProvider.kt */
public final class C10304i implements C10265c0 {

    /* renamed from: a */
    private final List<C10265c0> f28010a;

    public C10304i(List<? extends C10265c0> list) {
        C10202j.m34178b(list, "providers");
        this.f28010a = list;
    }

    /* renamed from: a */
    public List<C10240b0> mo33891a(C9934b bVar) {
        C10202j.m34178b(bVar, "fqName");
        ArrayList arrayList = new ArrayList();
        for (C10265c0 a : this.f28010a) {
            arrayList.addAll(a.mo33891a(bVar));
        }
        return C10539w.m35815n(arrayList);
    }

    /* renamed from: a */
    public Collection<C9934b> mo33890a(C9934b bVar, C9113l<? super C9939f, Boolean> lVar) {
        C10202j.m34178b(bVar, "fqName");
        C10202j.m34178b(lVar, "nameFilter");
        HashSet hashSet = new HashSet();
        for (C10265c0 a : this.f28010a) {
            hashSet.addAll(a.mo33890a(bVar, lVar));
        }
        return hashSet;
    }
}
