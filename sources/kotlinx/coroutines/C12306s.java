package kotlinx.coroutines;

import kotlin.C10222o;
import kotlin.C10225p;
import kotlin.p042a0.C9064d;
import kotlin.p042a0.p043j.p044a.C9085d;
import kotlinx.coroutines.p393g2.C12229n;

/* renamed from: kotlinx.coroutines.s */
/* compiled from: CompletedExceptionally.kt */
public final class C12306s {
    /* renamed from: a */
    public static final <T> Object m40631a(Object obj) {
        Throwable b = C10222o.m34211b(obj);
        return b == null ? obj : new C12303r(b, false, 2, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public static final <T> Object m40633a(Object obj, C12242h<?> hVar) {
        Throwable b = C10222o.m34211b(obj);
        if (b == null) {
            return obj;
        }
        if (C12248i0.m40399d() && (hVar instanceof C9085d)) {
            b = C12229n.m40317b(b, (C9085d) hVar);
        }
        return new C12303r(b, false, 2, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public static final <T> Object m40632a(Object obj, C9064d<? super T> dVar) {
        if (obj instanceof C12303r) {
            C10222o.C10223a aVar = C10222o.f27863f;
            Throwable th = ((C12303r) obj).f32123a;
            if (C12248i0.m40399d() && (dVar instanceof C9085d)) {
                th = C12229n.m40317b(th, (C9085d) dVar);
            }
            Object a = C10225p.m34213a(th);
            C10222o.m34210a(a);
            return a;
        }
        C10222o.C10223a aVar2 = C10222o.f27863f;
        C10222o.m34210a(obj);
        return obj;
    }
}
