package p050l.p075h.p081i;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: l.h.i.c */
/* compiled from: SelfDestructiveThread */
public class C4979c {

    /* renamed from: a */
    private final Object f8800a = new Object();

    /* renamed from: b */
    private HandlerThread f8801b;

    /* renamed from: c */
    private Handler f8802c;

    /* renamed from: d */
    private int f8803d;

    /* renamed from: e */
    private Handler.Callback f8804e = new C4980a();

    /* renamed from: f */
    private final int f8805f;

    /* renamed from: g */
    private final int f8806g;

    /* renamed from: h */
    private final String f8807h;

    /* renamed from: l.h.i.c$a */
    /* compiled from: SelfDestructiveThread */
    class C4980a implements Handler.Callback {
        C4980a() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                C4979c.this.mo17405a();
                return true;
            } else if (i != 1) {
                return true;
            } else {
                C4979c.this.mo17406a((Runnable) message.obj);
                return true;
            }
        }
    }

    /* renamed from: l.h.i.c$b */
    /* compiled from: SelfDestructiveThread */
    class C4981b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Callable f8809f;

        /* renamed from: g */
        final /* synthetic */ Handler f8810g;

        /* renamed from: h */
        final /* synthetic */ C4984d f8811h;

        /* renamed from: l.h.i.c$b$a */
        /* compiled from: SelfDestructiveThread */
        class C4982a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ Object f8812f;

            C4982a(Object obj) {
                this.f8812f = obj;
            }

            public void run() {
                C4981b.this.f8811h.mo17392a(this.f8812f);
            }
        }

        C4981b(C4979c cVar, Callable callable, Handler handler, C4984d dVar) {
            this.f8809f = callable;
            this.f8810g = handler;
            this.f8811h = dVar;
        }

        public void run() {
            Object obj;
            try {
                obj = this.f8809f.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f8810g.post(new C4982a(obj));
        }
    }

    /* renamed from: l.h.i.c$c */
    /* compiled from: SelfDestructiveThread */
    class C4983c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ AtomicReference f8814f;

        /* renamed from: g */
        final /* synthetic */ Callable f8815g;

        /* renamed from: h */
        final /* synthetic */ ReentrantLock f8816h;

        /* renamed from: i */
        final /* synthetic */ AtomicBoolean f8817i;

        /* renamed from: j */
        final /* synthetic */ Condition f8818j;

        C4983c(C4979c cVar, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f8814f = atomicReference;
            this.f8815g = callable;
            this.f8816h = reentrantLock;
            this.f8817i = atomicBoolean;
            this.f8818j = condition;
        }

        public void run() {
            try {
                this.f8814f.set(this.f8815g.call());
            } catch (Exception unused) {
            }
            this.f8816h.lock();
            try {
                this.f8817i.set(false);
                this.f8818j.signal();
            } finally {
                this.f8816h.unlock();
            }
        }
    }

    /* renamed from: l.h.i.c$d */
    /* compiled from: SelfDestructiveThread */
    public interface C4984d<T> {
        /* renamed from: a */
        void mo17392a(T t);
    }

    public C4979c(String str, int i, int i2) {
        this.f8807h = str;
        this.f8806g = i;
        this.f8805f = i2;
        this.f8803d = 0;
    }

    /* renamed from: b */
    private void m8830b(Runnable runnable) {
        synchronized (this.f8800a) {
            if (this.f8801b == null) {
                HandlerThread handlerThread = new HandlerThread(this.f8807h, this.f8806g);
                this.f8801b = handlerThread;
                handlerThread.start();
                this.f8802c = new Handler(this.f8801b.getLooper(), this.f8804e);
                this.f8803d++;
            }
            this.f8802c.removeMessages(0);
            this.f8802c.sendMessage(this.f8802c.obtainMessage(1, runnable));
        }
    }

    /* renamed from: a */
    public <T> void mo17407a(Callable<T> callable, C4984d<T> dVar) {
        m8830b(new C4981b(this, callable, new Handler(), dVar));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:9|10|11|12|(4:25|14|15|16)(1:17)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003f */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0045 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T mo17404a(java.util.concurrent.Callable<T> r13, int r14) throws java.lang.InterruptedException {
        /*
            r12 = this;
            java.util.concurrent.locks.ReentrantLock r7 = new java.util.concurrent.locks.ReentrantLock
            r7.<init>()
            java.util.concurrent.locks.Condition r8 = r7.newCondition()
            java.util.concurrent.atomic.AtomicReference r9 = new java.util.concurrent.atomic.AtomicReference
            r9.<init>()
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 1
            r10.<init>(r0)
            l.h.i.c$c r11 = new l.h.i.c$c
            r0 = r11
            r1 = r12
            r2 = r9
            r3 = r13
            r4 = r7
            r5 = r10
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r12.m8830b(r11)
            r7.lock()
            boolean r13 = r10.get()     // Catch:{ all -> 0x005c }
            if (r13 != 0) goto L_0x0034
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x0034:
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x005c }
            long r0 = (long) r14     // Catch:{ all -> 0x005c }
            long r13 = r13.toNanos(r0)     // Catch:{ all -> 0x005c }
        L_0x003b:
            long r13 = r8.awaitNanos(r13)     // Catch:{ InterruptedException -> 0x003f }
        L_0x003f:
            boolean r0 = r10.get()     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x004d
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x004d:
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0054
            goto L_0x003b
        L_0x0054:
            java.lang.InterruptedException r13 = new java.lang.InterruptedException     // Catch:{ all -> 0x005c }
            java.lang.String r14 = "timeout"
            r13.<init>(r14)     // Catch:{ all -> 0x005c }
            throw r13     // Catch:{ all -> 0x005c }
        L_0x005c:
            r13 = move-exception
            r7.unlock()
            goto L_0x0062
        L_0x0061:
            throw r13
        L_0x0062:
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: p050l.p075h.p081i.C4979c.mo17404a(java.util.concurrent.Callable, int):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17406a(Runnable runnable) {
        runnable.run();
        synchronized (this.f8800a) {
            this.f8802c.removeMessages(0);
            this.f8802c.sendMessageDelayed(this.f8802c.obtainMessage(0), (long) this.f8805f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17405a() {
        synchronized (this.f8800a) {
            if (!this.f8802c.hasMessages(1)) {
                this.f8801b.quit();
                this.f8801b = null;
                this.f8802c = null;
            }
        }
    }
}
