package kotlinx.coroutines.p395i2;

import java.util.concurrent.CancellationException;
import kotlin.p042a0.C9069g;
import kotlinx.coroutines.C12175a0;
import p120q.p326a.p348g0.C11459a;

/* renamed from: kotlinx.coroutines.i2.b */
/* compiled from: RxCancellable.kt */
public final class C12251b {
    /* renamed from: a */
    public static final void m40401a(Throwable th, C9069g gVar) {
        if (!(th instanceof CancellationException)) {
            try {
                C11459a.m37531b(th);
            } catch (Throwable unused) {
                C12175a0.m40204a(gVar, th);
            }
        }
    }
}
