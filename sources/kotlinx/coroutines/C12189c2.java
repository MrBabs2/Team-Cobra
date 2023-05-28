package kotlinx.coroutines;

import kotlin.p042a0.C9069g;

/* renamed from: kotlinx.coroutines.c2 */
/* compiled from: Unconfined.kt */
public final class C12189c2 extends C12324y {

    /* renamed from: g */
    public static final C12189c2 f31957g = new C12189c2();

    private C12189c2() {
    }

    /* renamed from: a */
    public void mo38845a(C9069g gVar, Runnable runnable) {
        C12197e2 e2Var = (C12197e2) gVar.get(C12197e2.f31960g);
        if (e2Var != null) {
            e2Var.f31961f = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    /* renamed from: b */
    public boolean mo38846b(C9069g gVar) {
        return false;
    }

    public String toString() {
        return "Unconfined";
    }
}
