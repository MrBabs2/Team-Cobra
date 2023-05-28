package kotlin.p045h0.p046u.p047e.p222j0;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9706e;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9719m;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9723n;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9724o;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.p239a0.C9688a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p254p.C10080c;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10083b;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10096h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10240b0;
import kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10314m;

/* renamed from: kotlin.h0.u.e.j0.a */
/* compiled from: PackagePartScopeCache.kt */
public final class C9305a {

    /* renamed from: a */
    private final ConcurrentHashMap<C9933a, C10096h> f25871a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private final C9706e f25872b;

    /* renamed from: c */
    private final C9312g f25873c;

    public C9305a(C9706e eVar, C9312g gVar) {
        C10202j.m34178b(eVar, "resolver");
        C10202j.m34178b(gVar, "kotlinClassFinder");
        this.f25872b = eVar;
        this.f25873c = gVar;
    }

    /* renamed from: a */
    public final C10096h mo33653a(C9310f fVar) {
        List<C9724o> list;
        C10202j.m34178b(fVar, "fileClass");
        ConcurrentHashMap<C9933a, C10096h> concurrentHashMap = this.f25871a;
        C9933a d = fVar.mo33665d();
        Object obj = concurrentHashMap.get(d);
        if (obj == null) {
            C9934b d2 = fVar.mo33665d().mo34986d();
            C10202j.m34174a((Object) d2, "fileClass.classId.packageFqName");
            if (fVar.mo33661a().mo34261c() == C9688a.C9689a.MULTIFILE_CLASS) {
                List<String> f = fVar.mo33661a().mo34264f();
                list = new ArrayList<>();
                for (String a : f) {
                    C10080c a2 = C10080c.m33921a(a);
                    C10202j.m34174a((Object) a2, "JvmClassName.byInternalName(partName)");
                    C9933a a3 = C9933a.m33260a(a2.mo35281a());
                    C10202j.m34174a((Object) a3, "ClassId.topLevel(JvmClas…velClassMaybeWithDollars)");
                    C9724o a4 = C9723n.m31362a((C9719m) this.f25873c, a3);
                    if (a4 != null) {
                        list.add(a4);
                    }
                }
            } else {
                list = C10527n.m35729a(fVar);
            }
            C10314m mVar = new C10314m(this.f25872b.mo34285a().mo38365m(), d2);
            ArrayList arrayList = new ArrayList();
            for (C9724o a5 : list) {
                C10096h a6 = this.f25872b.mo34283a((C10240b0) mVar, a5);
                if (a6 != null) {
                    arrayList.add(a6);
                }
            }
            List n = C10539w.m35815n(arrayList);
            C10083b.C10084a aVar = C10083b.f27681d;
            obj = aVar.mo35293a("package " + d2 + " (" + fVar + ')', n);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(d, obj);
            if (putIfAbsent != null) {
                obj = putIfAbsent;
            }
        }
        C10202j.m34174a(obj, "cache.getOrPut(fileClass…ileClass)\", scopes)\n    }");
        return (C10096h) obj;
    }
}
