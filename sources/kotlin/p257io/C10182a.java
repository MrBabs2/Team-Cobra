package kotlin.p257io;

import java.io.Closeable;

/* renamed from: kotlin.io.a */
/* compiled from: Closeable.kt */
public final class C10182a {
    /* renamed from: a */
    public static final void m34136a(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                C9099c.m29803a(th, th2);
            }
        }
    }
}
