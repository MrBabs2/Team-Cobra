package p050l.p094l.p096b;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: l.l.b.c */
/* compiled from: ModernAsyncTask */
abstract class C5124c<Params, Progress, Result> {

    /* renamed from: k */
    private static final ThreadFactory f9047k = new C5125a();

    /* renamed from: l */
    private static final BlockingQueue<Runnable> f9048l = new LinkedBlockingQueue(10);

    /* renamed from: m */
    public static final Executor f9049m = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, f9048l, f9047k);

    /* renamed from: n */
    private static C5130f f9050n;

    /* renamed from: f */
    private final C5132h<Params, Result> f9051f = new C5126b();

    /* renamed from: g */
    private final FutureTask<Result> f9052g = new C5127c(this.f9051f);

    /* renamed from: h */
    private volatile C5131g f9053h = C5131g.PENDING;

    /* renamed from: i */
    final AtomicBoolean f9054i = new AtomicBoolean();

    /* renamed from: j */
    final AtomicBoolean f9055j = new AtomicBoolean();

    /* renamed from: l.l.b.c$a */
    /* compiled from: ModernAsyncTask */
    static class C5125a implements ThreadFactory {

        /* renamed from: f */
        private final AtomicInteger f9056f = new AtomicInteger(1);

        C5125a() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f9056f.getAndIncrement());
        }
    }

    /* renamed from: l.l.b.c$b */
    /* compiled from: ModernAsyncTask */
    class C5126b extends C5132h<Params, Result> {
        C5126b() {
        }

        public Result call() throws Exception {
            C5124c.this.f9055j.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = C5124c.this.mo17760a(this.f9066f);
                Binder.flushPendingCommands();
                C5124c.this.mo17793d(result);
                return result;
            } catch (Throwable th) {
                C5124c.this.mo17793d(result);
                throw th;
            }
        }
    }

    /* renamed from: l.l.b.c$c */
    /* compiled from: ModernAsyncTask */
    class C5127c extends FutureTask<Result> {
        C5127c(Callable callable) {
            super(callable);
        }

        /* access modifiers changed from: protected */
        public void done() {
            try {
                C5124c.this.mo17794e(get());
            } catch (InterruptedException e) {
                Log.w("AsyncTask", e);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            } catch (CancellationException unused) {
                C5124c.this.mo17794e(null);
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* renamed from: l.l.b.c$d */
    /* compiled from: ModernAsyncTask */
    static /* synthetic */ class C5128d {

        /* renamed from: a */
        static final /* synthetic */ int[] f9059a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                l.l.b.c$g[] r0 = p050l.p094l.p096b.C5124c.C5131g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9059a = r0
                l.l.b.c$g r1 = p050l.p094l.p096b.C5124c.C5131g.RUNNING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9059a     // Catch:{ NoSuchFieldError -> 0x001d }
                l.l.b.c$g r1 = p050l.p094l.p096b.C5124c.C5131g.FINISHED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p050l.p094l.p096b.C5124c.C5128d.<clinit>():void");
        }
    }

    /* renamed from: l.l.b.c$e */
    /* compiled from: ModernAsyncTask */
    private static class C5129e<Data> {

        /* renamed from: a */
        final C5124c f9060a;

        /* renamed from: b */
        final Data[] f9061b;

        C5129e(C5124c cVar, Data... dataArr) {
            this.f9060a = cVar;
            this.f9061b = dataArr;
        }
    }

    /* renamed from: l.l.b.c$f */
    /* compiled from: ModernAsyncTask */
    private static class C5130f extends Handler {
        C5130f() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            C5129e eVar = (C5129e) message.obj;
            int i = message.what;
            if (i == 1) {
                eVar.f9060a.mo17787a(eVar.f9061b[0]);
            } else if (i == 2) {
                eVar.f9060a.mo17791b((Progress[]) eVar.f9061b);
            }
        }
    }

    /* renamed from: l.l.b.c$g */
    /* compiled from: ModernAsyncTask */
    public enum C5131g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: l.l.b.c$h */
    /* compiled from: ModernAsyncTask */
    private static abstract class C5132h<Params, Result> implements Callable<Result> {

        /* renamed from: f */
        Params[] f9066f;

        C5132h() {
        }
    }

    C5124c() {
    }

    /* renamed from: d */
    private static Handler m9465d() {
        C5130f fVar;
        synchronized (C5124c.class) {
            if (f9050n == null) {
                f9050n = new C5130f();
            }
            fVar = f9050n;
        }
        return fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Result mo17760a(Params... paramsArr);

    /* renamed from: a */
    public final boolean mo17788a() {
        return this.f9054i.get();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17790b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17762b(Result result) {
        mo17790b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17791b(Progress... progressArr) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo17792c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo17763c(Result result) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo17794e(Result result) {
        if (!this.f9055j.get()) {
            mo17793d(result);
        }
    }

    /* renamed from: a */
    public final boolean mo17789a(boolean z) {
        this.f9054i.set(true);
        return this.f9052g.cancel(z);
    }

    /* renamed from: a */
    public final C5124c<Params, Progress, Result> mo17786a(Executor executor, Params... paramsArr) {
        if (this.f9053h != C5131g.PENDING) {
            int i = C5128d.f9059a[this.f9053h.ordinal()];
            if (i == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            } else if (i != 2) {
                throw new IllegalStateException("We should never reach this state");
            } else {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        } else {
            this.f9053h = C5131g.RUNNING;
            mo17792c();
            this.f9051f.f9066f = paramsArr;
            executor.execute(this.f9052g);
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Result mo17793d(Result result) {
        m9465d().obtainMessage(1, new C5129e(this, result)).sendToTarget();
        return result;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17787a(Result result) {
        if (mo17788a()) {
            mo17762b(result);
        } else {
            mo17763c(result);
        }
        this.f9053h = C5131g.FINISHED;
    }
}
