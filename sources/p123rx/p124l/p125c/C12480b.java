package p123rx.p124l.p125c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import p123rx.C5373h;
import p123rx.C5375k;
import p123rx.exceptions.OnErrorNotImplementedException;
import p123rx.p124l.p400b.C12478a;
import p123rx.p124l.p400b.C12479b;
import p123rx.p126m.C5377a;
import p123rx.p128t.C12889e;
import p123rx.p411q.C12863f;

/* renamed from: rx.l.c.b */
/* compiled from: LooperScheduler */
class C12480b extends C5373h {

    /* renamed from: a */
    private final Handler f32237a;

    /* renamed from: rx.l.c.b$b */
    /* compiled from: LooperScheduler */
    static final class C12482b implements Runnable, C5375k {

        /* renamed from: f */
        private final C5377a f32241f;

        /* renamed from: g */
        private final Handler f32242g;

        /* renamed from: h */
        private volatile boolean f32243h;

        C12482b(C5377a aVar, Handler handler) {
            this.f32241f = aVar;
            this.f32242g = handler;
        }

        public boolean isUnsubscribed() {
            return this.f32243h;
        }

        public void run() {
            IllegalStateException illegalStateException;
            try {
                this.f32241f.call();
            } catch (Throwable th) {
                if (th instanceof OnErrorNotImplementedException) {
                    illegalStateException = new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", th);
                } else {
                    illegalStateException = new IllegalStateException("Fatal Exception thrown on Scheduler.Worker thread.", th);
                }
                C12863f.m41441f().mo41069b().mo41046a((Throwable) illegalStateException);
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, illegalStateException);
            }
        }

        public void unsubscribe() {
            this.f32243h = true;
            this.f32242g.removeCallbacks(this);
        }
    }

    C12480b(Looper looper) {
        this.f32237a = new Handler(looper);
    }

    public C5373h.C5374a createWorker() {
        return new C12481a(this.f32237a);
    }

    /* renamed from: rx.l.c.b$a */
    /* compiled from: LooperScheduler */
    static class C12481a extends C5373h.C5374a {

        /* renamed from: f */
        private final Handler f32238f;

        /* renamed from: g */
        private final C12479b f32239g = C12478a.m40948b().mo40659a();

        /* renamed from: h */
        private volatile boolean f32240h;

        C12481a(Handler handler) {
            this.f32238f = handler;
        }

        /* renamed from: a */
        public C5375k mo18712a(C5377a aVar, long j, TimeUnit timeUnit) {
            if (this.f32240h) {
                return C12889e.m41502b();
            }
            this.f32239g.mo40661a(aVar);
            C12482b bVar = new C12482b(aVar, this.f32238f);
            Message obtain = Message.obtain(this.f32238f, bVar);
            obtain.obj = this;
            this.f32238f.sendMessageDelayed(obtain, timeUnit.toMillis(j));
            if (!this.f32240h) {
                return bVar;
            }
            this.f32238f.removeCallbacks(bVar);
            return C12889e.m41502b();
        }

        public boolean isUnsubscribed() {
            return this.f32240h;
        }

        public void unsubscribe() {
            this.f32240h = true;
            this.f32238f.removeCallbacksAndMessages(this);
        }

        /* renamed from: a */
        public C5375k mo18710a(C5377a aVar) {
            return mo18712a(aVar, 0, TimeUnit.MILLISECONDS);
        }
    }
}
