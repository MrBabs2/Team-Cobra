package kotlin.jvm.internal;

import kotlin.p045h0.C9154c;
import kotlin.p045h0.C9156e;
import kotlin.p045h0.C9157f;
import kotlin.p045h0.C9160h;
import kotlin.p045h0.C9162i;
import kotlin.p045h0.C9171m;
import kotlin.p045h0.C9173n;

/* renamed from: kotlin.jvm.internal.y */
/* compiled from: ReflectionFactory */
public class C10217y {
    /* renamed from: a */
    public C9156e mo33545a(Class cls, String str) {
        return new C10208p(cls, str);
    }

    /* renamed from: a */
    public C9157f mo33546a(C10200h hVar) {
        return hVar;
    }

    /* renamed from: a */
    public C9160h mo33547a(C10204l lVar) {
        return lVar;
    }

    /* renamed from: a */
    public C9162i mo33548a(C10205m mVar) {
        return mVar;
    }

    /* renamed from: a */
    public C9171m mo33549a(C10209q qVar) {
        return qVar;
    }

    /* renamed from: a */
    public C9173n mo33550a(C10211s sVar) {
        return sVar;
    }

    /* renamed from: a */
    public C9154c mo33544a(Class cls) {
        return new C10196e(cls);
    }

    /* renamed from: a */
    public String mo33543a(C10203k kVar) {
        return mo33542a((C10199g) kVar);
    }

    /* renamed from: a */
    public String mo33542a(C10199g gVar) {
        String obj = gVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}
