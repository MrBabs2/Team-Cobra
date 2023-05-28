package kotlinx.coroutines;

import kotlin.C10222o;
import kotlin.C10225p;
import kotlin.p042a0.C9064d;

/* renamed from: kotlinx.coroutines.j0 */
/* compiled from: DebugStrings.kt */
public final class C12256j0 {
    /* renamed from: a */
    public static final String m40410a(C9064d<?> dVar) {
        String str;
        if (dVar instanceof C12290o0) {
            return dVar.toString();
        }
        try {
            C10222o.C10223a aVar = C10222o.f27863f;
            String str2 = dVar + '@' + m40411b(dVar);
            C10222o.m34210a(str2);
            str = str2;
        } catch (Throwable th) {
            C10222o.C10223a aVar2 = C10222o.f27863f;
            Object a = C10225p.m34213a(th);
            C10222o.m34210a(a);
            str = a;
        }
        Throwable b = C10222o.m34211b(str);
        String str3 = str;
        if (b != null) {
            str3 = dVar.getClass().getName() + '@' + m40411b(dVar);
        }
        return (String) str3;
    }

    /* renamed from: b */
    public static final String m40411b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* renamed from: a */
    public static final String m40409a(Object obj) {
        return obj.getClass().getSimpleName();
    }
}
