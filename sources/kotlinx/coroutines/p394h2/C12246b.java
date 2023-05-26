package kotlinx.coroutines.p394h2;

import kotlin.C10222o;
import kotlin.C10225p;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10187b0;
import kotlin.p042a0.C9064d;
import kotlin.p042a0.C9069g;
import kotlin.p042a0.p043j.p044a.C9085d;
import kotlin.p042a0.p043j.p044a.C9087g;
import kotlin.p215c0.p216c.C9117p;
import kotlinx.coroutines.C12248i0;
import kotlinx.coroutines.C12303r;
import kotlinx.coroutines.C12305r1;
import kotlinx.coroutines.p393g2.C12228m;
import kotlinx.coroutines.p393g2.C12229n;
import kotlinx.coroutines.p393g2.C12234s;

/* renamed from: kotlinx.coroutines.h2.b */
/* compiled from: Undispatched.kt */
public final class C12246b {
    /* renamed from: a */
    public static final <T, R> Object m40365a(C12228m<? super T> mVar, R r, C9117p<? super R, ? super C9064d<? super T>, ? extends Object> pVar) {
        Object obj;
        mVar.mo38821o();
        if (pVar != null) {
            try {
                C10187b0.m34140a((Object) pVar, 2);
                obj = pVar.invoke(r, mVar);
            } catch (Throwable th) {
                obj = new C12303r(th, false, 2, (DefaultConstructorMarker) null);
            }
            if (obj == C9081d.m29785a()) {
                return C9081d.m29785a();
            }
            Object c = mVar.mo39009c(obj);
            if (c == C12305r1.f32126b) {
                return C9081d.m29785a();
            }
            if (!(c instanceof C12303r)) {
                return C12305r1.m40625b(c);
            }
            Throwable th2 = ((C12303r) c).f32123a;
            C9064d<T> dVar = mVar.f32002i;
            if (C12248i0.m40399d() && (dVar instanceof C9085d)) {
                th2 = C12229n.m40317b(th2, (C9085d) dVar);
            }
            throw th2;
        }
        throw new TypeCastException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
    }

    /* renamed from: a */
    public static final <R, T> void m40366a(C9117p<? super R, ? super C9064d<? super T>, ? extends Object> pVar, R r, C9064d<? super T> dVar) {
        C9069g context;
        Object b;
        C9087g.m29790a(dVar);
        try {
            context = dVar.getContext();
            b = C12234s.m40334b(context, (Object) null);
            if (pVar != null) {
                C10187b0.m34140a((Object) pVar, 2);
                Object invoke = pVar.invoke(r, dVar);
                C12234s.m40333a(context, b);
                if (invoke != C9081d.m29785a()) {
                    C10222o.C10223a aVar = C10222o.f27863f;
                    C10222o.m34210a(invoke);
                    dVar.resumeWith(invoke);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        } catch (Throwable th) {
            C10222o.C10223a aVar2 = C10222o.f27863f;
            Object a = C10225p.m34213a(th);
            C10222o.m34210a(a);
            dVar.resumeWith(a);
        }
    }
}
