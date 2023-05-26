package kotlin.p042a0;

import kotlin.C10222o;
import kotlin.C10483v;
import kotlin.jvm.internal.C10202j;
import kotlin.p215c0.p216c.C9117p;

/* renamed from: kotlin.a0.f */
/* compiled from: Continuation.kt */
public final class C9068f {
    /* renamed from: a */
    public static final <R, T> void m29773a(C9117p<? super R, ? super C9064d<? super T>, ? extends Object> pVar, R r, C9064d<? super T> dVar) {
        C10202j.m34178b(pVar, "$this$startCoroutine");
        C10202j.m34178b(dVar, "completion");
        C9064d<C10483v> a = C9078c.m29783a(C9078c.m29784a(pVar, r, dVar));
        C10483v vVar = C10483v.f28357a;
        C10222o.C10223a aVar = C10222o.f27863f;
        C10222o.m34210a(vVar);
        a.resumeWith(vVar);
    }
}
