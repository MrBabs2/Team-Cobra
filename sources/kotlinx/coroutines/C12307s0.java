package kotlinx.coroutines;

import kotlin.C10222o;
import kotlin.C10225p;
import kotlin.C10483v;
import kotlin.TypeCastException;
import kotlin.p042a0.C9064d;
import kotlin.p042a0.C9069g;
import kotlin.p042a0.p043j.p044a.C9085d;
import kotlinx.coroutines.p393g2.C12229n;
import kotlinx.coroutines.p393g2.C12234s;

/* renamed from: kotlinx.coroutines.s0 */
/* compiled from: DispatchedTask.kt */
public final class C12307s0 {
    /* renamed from: a */
    public static final <T> void m40635a(C12304r0<? super T> r0Var, int i) {
        C9064d<? super T> a = r0Var.mo38927a();
        if (!m40638b(i) || !(a instanceof C12290o0) || m40637a(i) != m40637a(r0Var.f32124h)) {
            m40636a(r0Var, a, i);
            return;
        }
        C12324y yVar = ((C12290o0) a).f32103l;
        C9069g context = a.getContext();
        if (yVar.mo38846b(context)) {
            yVar.mo38845a(context, r0Var);
        } else {
            m40634a((C12304r0<?>) r0Var);
        }
    }

    /* renamed from: a */
    public static final boolean m40637a(int i) {
        return i == 1;
    }

    /* renamed from: b */
    public static final boolean m40638b(int i) {
        return i == 0 || i == 1;
    }

    /* renamed from: a */
    public static final <T> void m40636a(C12304r0<? super T> r0Var, C9064d<? super T> dVar, int i) {
        Object obj;
        Object b = r0Var.mo38930b();
        Throwable a = r0Var.mo39031a(b);
        if (a == null) {
            a = null;
        } else if (C12248i0.m40399d() && (dVar instanceof C9085d)) {
            a = C12229n.m40317b(a, (C9085d) dVar);
        }
        if (a != null) {
            C10222o.C10223a aVar = C10222o.f27863f;
            obj = C10225p.m34213a(a);
        } else {
            C10222o.C10223a aVar2 = C10222o.f27863f;
            obj = r0Var.mo38931b(b);
        }
        C10222o.m34210a(obj);
        if (i == 0) {
            dVar.resumeWith(obj);
        } else if (i == 1) {
            C12295p0.m40532a(dVar, obj);
        } else if (i != 2) {
            throw new IllegalStateException(("Invalid mode " + i).toString());
        } else if (dVar != null) {
            C12290o0 o0Var = (C12290o0) dVar;
            C9069g context = o0Var.getContext();
            Object b2 = C12234s.m40334b(context, o0Var.f32102k);
            try {
                o0Var.f32104m.resumeWith(obj);
                C10483v vVar = C10483v.f28357a;
            } finally {
                C12234s.m40333a(context, b2);
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.DispatchedContinuation<T>");
        }
    }

    /* renamed from: a */
    private static final void m40634a(C12304r0<?> r0Var) {
        C12322x0 a = C12335z1.f32157b.mo39062a();
        if (a.mo39044o()) {
            a.mo39040a(r0Var);
            return;
        }
        a.mo39042b(true);
        try {
            m40636a(r0Var, r0Var.mo38927a(), 2);
            do {
            } while (a.mo39046q());
        } catch (Throwable th) {
            a.mo39041a(true);
            throw th;
        }
        a.mo39041a(true);
    }
}
