package kotlinx.coroutines.p394h2;

import kotlin.C10222o;
import kotlin.C10225p;
import kotlin.C10483v;
import kotlin.p042a0.C9064d;
import kotlin.p215c0.p216c.C9117p;
import kotlinx.coroutines.C12295p0;

/* renamed from: kotlinx.coroutines.h2.a */
/* compiled from: Cancellable.kt */
public final class C12245a {
    /* renamed from: a */
    public static final <R, T> void m40364a(C9117p<? super R, ? super C9064d<? super T>, ? extends Object> pVar, R r, C9064d<? super T> dVar) {
        try {
            C9064d<C10483v> a = C9078c.m29783a(C9078c.m29784a(pVar, r, dVar));
            C10222o.C10223a aVar = C10222o.f27863f;
            C10483v vVar = C10483v.f28357a;
            C10222o.m34210a(vVar);
            C12295p0.m40532a(a, vVar);
        } catch (Throwable th) {
            C10222o.C10223a aVar2 = C10222o.f27863f;
            Object a2 = C10225p.m34213a(th);
            C10222o.m34210a(a2);
            dVar.resumeWith(a2);
        }
    }

    /* renamed from: a */
    public static final void m40363a(C9064d<? super C10483v> dVar, C9064d<?> dVar2) {
        try {
            C9064d<? super C10483v> a = C9078c.m29783a(dVar);
            C10222o.C10223a aVar = C10222o.f27863f;
            C10483v vVar = C10483v.f28357a;
            C10222o.m34210a(vVar);
            C12295p0.m40532a(a, vVar);
        } catch (Throwable th) {
            C10222o.C10223a aVar2 = C10222o.f27863f;
            Object a2 = C10225p.m34213a(th);
            C10222o.m34210a(a2);
            dVar2.resumeWith(a2);
        }
    }
}
