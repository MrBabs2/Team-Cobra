package kotlinx.coroutines;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: kotlinx.coroutines.k0 */
/* compiled from: DefaultExecutor.kt */
public final class C12276k0 extends C12327y0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: l */
    private static final long f32091l;

    /* renamed from: m */
    public static final C12276k0 f32092m;

    static {
        Long l;
        C12276k0 k0Var = new C12276k0();
        f32092m = k0Var;
        C12322x0.m40655a(k0Var, false, 1, (Object) null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f32091l = timeUnit.toNanos(l.longValue());
    }

    private C12276k0() {
    }

    /* renamed from: A */
    private final boolean m40482A() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    /* renamed from: B */
    private final synchronized boolean m40483B() {
        if (m40482A()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    /* renamed from: y */
    private final synchronized void m40484y() {
        if (m40482A()) {
            debugStatus = 3;
            mo39053x();
            notifyAll();
        }
    }

    /* renamed from: z */
    private final synchronized Thread m40485z() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    public void run() {
        C12335z1.f32157b.mo39063a(this);
        C12177a2 a = C12182b2.m40222a();
        if (a != null) {
            a.mo38827b();
        }
        try {
            if (m40483B()) {
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long w = mo39052w();
                    if (w == Long.MAX_VALUE) {
                        C12177a2 a2 = C12182b2.m40222a();
                        long a3 = a2 != null ? a2.mo38823a() : System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = f32091l + a3;
                        }
                        long j2 = j - a3;
                        if (j2 <= 0) {
                            _thread = null;
                            m40484y();
                            C12177a2 a4 = C12182b2.m40222a();
                            if (a4 != null) {
                                a4.mo38829d();
                            }
                            if (!mo39051v()) {
                                mo38839t();
                                return;
                            }
                            return;
                        }
                        w = C9150f.m29852b(w, j2);
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (w > 0) {
                        if (m40482A()) {
                            _thread = null;
                            m40484y();
                            C12177a2 a5 = C12182b2.m40222a();
                            if (a5 != null) {
                                a5.mo38829d();
                            }
                            if (!mo39051v()) {
                                mo38839t();
                                return;
                            }
                            return;
                        }
                        C12177a2 a6 = C12182b2.m40222a();
                        if (a6 != null) {
                            a6.mo38825a(this, w);
                        } else {
                            LockSupport.parkNanos(this, w);
                        }
                    }
                }
            }
        } finally {
            _thread = null;
            m40484y();
            C12177a2 a7 = C12182b2.m40222a();
            if (a7 != null) {
                a7.mo38829d();
            }
            if (!mo39051v()) {
                mo38839t();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public Thread mo38839t() {
        Thread thread = _thread;
        return thread != null ? thread : m40485z();
    }
}
