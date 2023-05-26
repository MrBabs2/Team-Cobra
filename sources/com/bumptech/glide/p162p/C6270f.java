package com.bumptech.glide.p162p;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.C5901a;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.p162p.p163l.C6286h;
import com.bumptech.glide.p162p.p163l.C6287i;
import com.bumptech.glide.p162p.p164m.C6296d;
import com.bumptech.glide.p166r.C6316k;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.bumptech.glide.p.f */
/* compiled from: RequestFutureTarget */
public class C6270f<R> implements C6267c<R>, C6272g<R> {

    /* renamed from: p */
    private static final C6271a f11465p = new C6271a();

    /* renamed from: f */
    private final int f11466f;

    /* renamed from: g */
    private final int f11467g;

    /* renamed from: h */
    private final boolean f11468h;

    /* renamed from: i */
    private final C6271a f11469i;

    /* renamed from: j */
    private R f11470j;

    /* renamed from: k */
    private C6268d f11471k;

    /* renamed from: l */
    private boolean f11472l;

    /* renamed from: m */
    private boolean f11473m;

    /* renamed from: n */
    private boolean f11474n;

    /* renamed from: o */
    private GlideException f11475o;

    /* renamed from: com.bumptech.glide.p.f$a */
    /* compiled from: RequestFutureTarget */
    static class C6271a {
        C6271a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo20707a(Object obj, long j) throws InterruptedException {
            obj.wait(j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo20706a(Object obj) {
            obj.notifyAll();
        }
    }

    public C6270f(int i, int i2) {
        this(i, i2, true, f11465p);
    }

    /* renamed from: a */
    private synchronized R m12841a(Long l) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f11468h && !isDone()) {
            C6316k.m12995a();
        }
        if (this.f11472l) {
            throw new CancellationException();
        } else if (this.f11474n) {
            throw new ExecutionException(this.f11475o);
        } else if (this.f11473m) {
            return this.f11470j;
        } else {
            if (l == null) {
                this.f11469i.mo20707a(this, 0);
            } else if (l.longValue() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                long longValue = l.longValue() + currentTimeMillis;
                while (!isDone() && currentTimeMillis < longValue) {
                    this.f11469i.mo20707a(this, longValue - currentTimeMillis);
                    currentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            } else if (this.f11474n) {
                throw new ExecutionException(this.f11475o);
            } else if (this.f11472l) {
                throw new CancellationException();
            } else if (this.f11473m) {
                return this.f11470j;
            } else {
                throw new TimeoutException();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0021, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean cancel(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isDone()     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x000a
            r3 = 0
            monitor-exit(r2)
            return r3
        L_0x000a:
            r0 = 1
            r2.f11472l = r0     // Catch:{ all -> 0x0022 }
            com.bumptech.glide.p.f$a r1 = r2.f11469i     // Catch:{ all -> 0x0022 }
            r1.mo20706a(r2)     // Catch:{ all -> 0x0022 }
            if (r3 == 0) goto L_0x0020
            com.bumptech.glide.p.d r3 = r2.f11471k     // Catch:{ all -> 0x0022 }
            if (r3 == 0) goto L_0x0020
            com.bumptech.glide.p.d r3 = r2.f11471k     // Catch:{ all -> 0x0022 }
            r3.clear()     // Catch:{ all -> 0x0022 }
            r3 = 0
            r2.f11471k = r3     // Catch:{ all -> 0x0022 }
        L_0x0020:
            monitor-exit(r2)
            return r0
        L_0x0022:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p162p.C6270f.cancel(boolean):boolean");
    }

    public R get() throws InterruptedException, ExecutionException {
        try {
            return m12841a((Long) null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    public synchronized C6268d getRequest() {
        return this.f11471k;
    }

    public void getSize(C6286h hVar) {
        hVar.mo20710a(this.f11466f, this.f11467g);
    }

    public synchronized boolean isCancelled() {
        return this.f11472l;
    }

    public synchronized boolean isDone() {
        return this.f11472l || this.f11473m || this.f11474n;
    }

    public void onDestroy() {
    }

    public void onLoadCleared(Drawable drawable) {
    }

    public synchronized void onLoadFailed(Drawable drawable) {
    }

    public void onLoadStarted(Drawable drawable) {
    }

    public synchronized void onResourceReady(R r, C6296d<? super R> dVar) {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public void removeCallback(C6286h hVar) {
    }

    public synchronized void setRequest(C6268d dVar) {
        this.f11471k = dVar;
    }

    C6270f(int i, int i2, boolean z, C6271a aVar) {
        this.f11466f = i;
        this.f11467g = i2;
        this.f11468h = z;
        this.f11469i = aVar;
    }

    public synchronized boolean onLoadFailed(GlideException glideException, Object obj, C6287i<R> iVar, boolean z) {
        this.f11474n = true;
        this.f11475o = glideException;
        this.f11469i.mo20706a(this);
        return false;
    }

    public synchronized boolean onResourceReady(R r, Object obj, C6287i<R> iVar, C5901a aVar, boolean z) {
        this.f11473m = true;
        this.f11470j = r;
        this.f11469i.mo20706a(this);
        return false;
    }

    public R get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return m12841a(Long.valueOf(timeUnit.toMillis(j)));
    }
}
