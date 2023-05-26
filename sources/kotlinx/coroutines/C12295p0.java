package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.C10222o;
import kotlin.C10225p;
import kotlin.C10483v;
import kotlin.p042a0.C9064d;
import kotlin.p042a0.C9069g;
import kotlinx.coroutines.p393g2.C12230o;
import kotlinx.coroutines.p393g2.C12234s;

/* renamed from: kotlinx.coroutines.p0 */
/* compiled from: DispatchedContinuation.kt */
public final class C12295p0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C12230o f32110a = new C12230o("UNDEFINED");

    /* renamed from: b */
    public static final C12230o f32111b = new C12230o("REUSABLE_CLAIMED");

    /* renamed from: a */
    public static final <T> void m40532a(C9064d<? super T> dVar, Object obj) {
        boolean z;
        C9069g context;
        Object b;
        if (dVar instanceof C12290o0) {
            C12290o0 o0Var = (C12290o0) dVar;
            Object a = C12306s.m40631a(obj);
            if (o0Var.f32103l.mo38846b(o0Var.getContext())) {
                o0Var.f32100i = a;
                o0Var.f32124h = 1;
                o0Var.f32103l.mo38845a(o0Var.getContext(), o0Var);
                return;
            }
            C12322x0 a2 = C12335z1.f32157b.mo39062a();
            if (a2.mo39044o()) {
                o0Var.f32100i = a;
                o0Var.f32124h = 1;
                a2.mo39040a((C12304r0<?>) o0Var);
                return;
            }
            a2.mo39042b(true);
            try {
                C12277k1 k1Var = (C12277k1) o0Var.getContext().get(C12277k1.f32093e);
                if (k1Var == null || k1Var.mo38813b()) {
                    z = false;
                } else {
                    CancellationException d = k1Var.mo38984d();
                    C10222o.C10223a aVar = C10222o.f27863f;
                    Object a3 = C10225p.m34213a((Throwable) d);
                    C10222o.m34210a(a3);
                    o0Var.resumeWith(a3);
                    z = true;
                }
                if (!z) {
                    context = o0Var.getContext();
                    b = C12234s.m40334b(context, o0Var.f32102k);
                    o0Var.f32104m.resumeWith(obj);
                    C10483v vVar = C10483v.f28357a;
                    C12234s.m40333a(context, b);
                }
                do {
                } while (a2.mo39046q());
            } catch (Throwable th) {
                try {
                    o0Var.mo39032a(th, (Throwable) null);
                } catch (Throwable th2) {
                    a2.mo39041a(true);
                    throw th2;
                }
            }
            a2.mo39041a(true);
            return;
        }
        dVar.resumeWith(obj);
    }
}
