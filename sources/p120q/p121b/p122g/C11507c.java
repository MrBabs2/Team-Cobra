package p120q.p121b.p122g;

import android.os.Looper;
import java.lang.Thread;

/* renamed from: q.b.g.c */
/* compiled from: ApplicationNotResponding */
class C11507c extends Throwable {

    /* renamed from: f */
    private Thread.State f30746f;

    public C11507c(String str) {
        super(str);
    }

    /* renamed from: a */
    public Thread.State mo37622a() {
        return this.f30746f;
    }

    public Throwable fillInStackTrace() {
        Thread thread = Looper.getMainLooper().getThread();
        this.f30746f = thread.getState();
        setStackTrace(thread.getStackTrace());
        return this;
    }
}
