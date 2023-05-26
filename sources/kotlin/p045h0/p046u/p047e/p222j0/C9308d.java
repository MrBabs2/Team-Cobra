package kotlin.p045h0.p046u.p047e.p222j0;

import java.util.Set;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.C9620m;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9520g;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9534t;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p390m0.C12041j;
import kotlin.p045h0.p046u.p047e.p390m0.C12061u;

/* renamed from: kotlin.h0.u.e.j0.d */
/* compiled from: ReflectJavaClassFinder.kt */
public final class C9308d implements C9620m {

    /* renamed from: a */
    private final ClassLoader f25876a;

    public C9308d(ClassLoader classLoader) {
        C10202j.m34178b(classLoader, "classLoader");
        this.f25876a = classLoader;
    }

    /* renamed from: a */
    public C9520g mo33658a(C9620m.C9621a aVar) {
        C10202j.m34178b(aVar, "request");
        C9933a a = aVar.mo34174a();
        C9934b d = a.mo34986d();
        C10202j.m34174a((Object) d, "classId.packageFqName");
        String a2 = a.mo34987e().mo34994a();
        C10202j.m34174a((Object) a2, "classId.relativeClassName.asString()");
        String a3 = C12130v.m40043a(a2, '.', '$', false, 4, (Object) null);
        if (!d.mo34996b()) {
            a3 = d.mo34994a() + "." + a3;
        }
        Class<?> a4 = C9309e.m30112a(this.f25876a, a3);
        if (a4 != null) {
            return new C12041j(a4);
        }
        return null;
    }

    /* renamed from: b */
    public Set<String> mo33660b(C9934b bVar) {
        C10202j.m34178b(bVar, "packageFqName");
        return null;
    }

    /* renamed from: a */
    public C9534t mo33659a(C9934b bVar) {
        C10202j.m34178b(bVar, "fqName");
        return new C12061u(bVar);
    }
}
