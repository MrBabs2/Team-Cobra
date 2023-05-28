package kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9775f;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9861w;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9868a;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9875c;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;

/* renamed from: kotlin.h0.u.e.k0.i.b.z */
/* compiled from: ProtoBasedClassDataFinder.kt */
public final class C11793z implements C11759i {

    /* renamed from: a */
    private final Map<C9933a, C9775f> f31492a;

    /* renamed from: b */
    private final C9875c f31493b;

    /* renamed from: c */
    private final C9868a f31494c;

    /* renamed from: d */
    private final C9113l<C9933a, C10362n0> f31495d;

    public C11793z(C9861w wVar, C9875c cVar, C9868a aVar, C9113l<? super C9933a, ? extends C10362n0> lVar) {
        C10202j.m34178b(wVar, "proto");
        C10202j.m34178b(cVar, "nameResolver");
        C10202j.m34178b(aVar, "metadataVersion");
        C10202j.m34178b(lVar, "classSource");
        this.f31493b = cVar;
        this.f31494c = aVar;
        this.f31495d = lVar;
        List<C9775f> m = wVar.mo34822m();
        C10202j.m34174a((Object) m, "proto.class_List");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C9150f.m29847a(C10515i0.m35582a(C10531p.m35750a(m, 10)), 16));
        for (T next : m) {
            C9775f fVar = (C9775f) next;
            C9875c cVar2 = this.f31493b;
            C10202j.m34174a((Object) fVar, "klass");
            linkedHashMap.put(C11792y.m38824a(cVar2, fVar.mo34482r()), next);
        }
        this.f31492a = linkedHashMap;
    }

    /* renamed from: a */
    public final Collection<C9933a> mo38396a() {
        return this.f31492a.keySet();
    }

    /* renamed from: a */
    public C11758h mo34289a(C9933a aVar) {
        C10202j.m34178b(aVar, "classId");
        C9775f fVar = this.f31492a.get(aVar);
        if (fVar != null) {
            return new C11758h(this.f31493b, fVar, this.f31494c, this.f31495d.invoke(aVar));
        }
        return null;
    }
}
