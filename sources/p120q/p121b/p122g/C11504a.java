package p120q.p121b.p122g;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

/* renamed from: q.b.g.a */
/* compiled from: ANRWatchDog */
class C11504a extends Thread {

    /* renamed from: l */
    private static final String f30738l = C11504a.class.getName();

    /* renamed from: f */
    private C11506b f30739f = null;

    /* renamed from: g */
    private final Handler f30740g = new Handler(Looper.getMainLooper());

    /* renamed from: h */
    private final int f30741h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public volatile long f30742i = 0;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public volatile boolean f30743j = false;

    /* renamed from: k */
    private final Runnable f30744k = new C11505a();

    /* renamed from: q.b.g.a$a */
    /* compiled from: ANRWatchDog */
    class C11505a implements Runnable {
        C11505a() {
        }

        public void run() {
            long unused = C11504a.this.f30742i = 0;
            boolean unused2 = C11504a.this.f30743j = false;
        }
    }

    /* renamed from: q.b.g.a$b */
    /* compiled from: ANRWatchDog */
    public interface C11506b {
        /* renamed from: a */
        void mo18525a(C11507c cVar);
    }

    public C11504a(int i, C11506b bVar) {
        this.f30739f = bVar;
        this.f30741h = i;
    }

    public void run() {
        setName("|ANR-WatchDog|");
        long j = (long) this.f30741h;
        while (!isInterrupted()) {
            boolean z = this.f30742i == 0;
            this.f30742i += j;
            if (z) {
                this.f30740g.post(this.f30744k);
            }
            try {
                Thread.sleep(j);
                if (this.f30742i != 0 && !this.f30743j) {
                    if (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) {
                        Log.d(f30738l, "An ANR was detected but ignored because the debugger is connected.");
                        this.f30743j = true;
                    } else {
                        Log.d(f30738l, "Raising ANR");
                        this.f30739f.mo18525a(new C11507c("Application Not Responding for at least " + this.f30741h + " ms."));
                        j = (long) this.f30741h;
                        this.f30743j = true;
                    }
                }
            } catch (InterruptedException e) {
                Log.w(f30738l, "Interrupted: " + e.getMessage());
                return;
            }
        }
    }
}
