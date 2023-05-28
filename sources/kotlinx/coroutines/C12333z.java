package kotlinx.coroutines;

import java.util.List;
import kotlin.p042a0.C9069g;

/* renamed from: kotlinx.coroutines.z */
/* compiled from: CoroutineExceptionHandlerImpl.kt */
public final class C12333z {

    /* renamed from: a */
    private static final List<CoroutineExceptionHandler> f32155a = C12090n.m39931g(C12083l.m39907a(C0000a.m0a()));

    /* renamed from: a */
    public static final void m40700a(C9069g gVar, Throwable th) {
        for (CoroutineExceptionHandler handleException : f32155a) {
            try {
                handleException.handleException(gVar, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, C12175a0.m40203a(th, th2));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
