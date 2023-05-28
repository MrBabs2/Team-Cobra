package kotlinx.coroutines;

import kotlin.p042a0.C9069g;

/* renamed from: kotlinx.coroutines.a0 */
/* compiled from: CoroutineExceptionHandler.kt */
public final class C12175a0 {
    /* renamed from: a */
    public static final void m40204a(C9069g gVar, Throwable th) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) gVar.get(CoroutineExceptionHandler.f31941d);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(gVar, th);
            } else {
                C12333z.m40700a(gVar, th);
            }
        } catch (Throwable th2) {
            C12333z.m40700a(gVar, m40203a(th, th2));
        }
    }

    /* renamed from: a */
    public static final Throwable m40203a(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        C9099c.m29803a(runtimeException, th);
        return runtimeException;
    }
}
