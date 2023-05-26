package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@zzard
public class zzbbr<T> implements zzbbh<T> {

    /* renamed from: f */
    private final Object f18752f = new Object();

    /* renamed from: g */
    private T f18753g;

    /* renamed from: h */
    private Throwable f18754h;

    /* renamed from: i */
    private boolean f18755i;

    /* renamed from: j */
    private boolean f18756j;

    /* renamed from: k */
    private final C7349c7 f18757k = new C7349c7();

    /* renamed from: a */
    public final void mo27903a(Throwable th) {
        synchronized (this.f18752f) {
            if (!this.f18756j) {
                if (mo27902a()) {
                    zzk.zzlk().mo27736b(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture.setException");
                    return;
                }
                this.f18754h = th;
                this.f18752f.notifyAll();
                this.f18757k.mo25767a();
            }
        }
    }

    /* renamed from: b */
    public final void mo25573b(Runnable runnable, Executor executor) {
        this.f18757k.mo25768a(runnable, executor);
    }

    public boolean cancel(boolean z) {
        if (!z) {
            return false;
        }
        synchronized (this.f18752f) {
            if (mo27902a()) {
                return false;
            }
            this.f18756j = true;
            this.f18755i = true;
            this.f18752f.notifyAll();
            this.f18757k.mo25767a();
            return true;
        }
    }

    public T get() throws CancellationException, ExecutionException, InterruptedException {
        T t;
        synchronized (this.f18752f) {
            while (!mo27902a()) {
                this.f18752f.wait();
            }
            if (this.f18754h != null) {
                throw new ExecutionException(this.f18754h);
            } else if (!this.f18756j) {
                t = this.f18753g;
            } else {
                throw new CancellationException("SettableFuture was cancelled.");
            }
        }
        return t;
    }

    public boolean isCancelled() {
        boolean z;
        synchronized (this.f18752f) {
            z = this.f18756j;
        }
        return z;
    }

    public boolean isDone() {
        boolean a;
        synchronized (this.f18752f) {
            a = mo27902a();
        }
        return a;
    }

    /* renamed from: b */
    public final void mo27904b(T t) {
        synchronized (this.f18752f) {
            if (!this.f18756j) {
                if (mo27902a()) {
                    zzk.zzlk().mo27736b(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture.set");
                    return;
                }
                this.f18755i = true;
                this.f18753g = t;
                this.f18752f.notifyAll();
                this.f18757k.mo25767a();
            }
        }
    }

    public T get(long j, TimeUnit timeUnit) throws CancellationException, ExecutionException, InterruptedException, TimeoutException {
        T t;
        synchronized (this.f18752f) {
            long millis = timeUnit.toMillis(j);
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = millis + currentTimeMillis;
            while (!mo27902a() && currentTimeMillis < j2) {
                this.f18752f.wait(j2 - currentTimeMillis);
                currentTimeMillis = System.currentTimeMillis();
            }
            if (this.f18756j) {
                throw new CancellationException("SettableFuture was cancelled.");
            } else if (this.f18754h != null) {
                throw new ExecutionException(this.f18754h);
            } else if (this.f18755i) {
                t = this.f18753g;
            } else {
                throw new TimeoutException("SettableFuture timed out.");
            }
        }
        return t;
    }

    /* renamed from: a */
    private final boolean mo27902a() {
        return this.f18754h != null || this.f18755i;
    }
}
