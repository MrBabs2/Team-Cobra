package kotlin.p042a0.p043j.p044a;

import kotlin.p042a0.C9064d;
import kotlin.p042a0.C9069g;
import kotlin.p042a0.C9075h;

/* renamed from: kotlin.a0.j.a.i */
/* compiled from: ContinuationImpl.kt */
public abstract class C9090i extends C9082a {
    public C9090i(C9064d<Object> dVar) {
        super(dVar);
        if (dVar != null) {
            if (!(dVar.getContext() == C9075h.f25654f)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    public C9069g getContext() {
        return C9075h.f25654f;
    }
}
