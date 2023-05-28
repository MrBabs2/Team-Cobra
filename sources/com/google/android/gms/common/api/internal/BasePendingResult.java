package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.base.zap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
@KeepForSdk
public abstract class BasePendingResult<R extends Result> extends PendingResult<R> {

    /* renamed from: p */
    static final ThreadLocal<Boolean> f13699p = new C7199q0();

    /* renamed from: a */
    private final Object f13700a;

    /* renamed from: b */
    private final CallbackHandler<R> f13701b;

    /* renamed from: c */
    private final WeakReference<GoogleApiClient> f13702c;

    /* renamed from: d */
    private final CountDownLatch f13703d;

    /* renamed from: e */
    private final ArrayList<PendingResult.StatusListener> f13704e;

    /* renamed from: f */
    private ResultCallback<? super R> f13705f;

    /* renamed from: g */
    private final AtomicReference<C7189l0> f13706g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public R f13707h;

    /* renamed from: i */
    private Status f13708i;

    /* renamed from: j */
    private volatile boolean f13709j;

    /* renamed from: k */
    private boolean f13710k;

    /* renamed from: l */
    private boolean f13711l;

    /* renamed from: m */
    private ICancelToken f13712m;
    @KeepName
    private C7162a mResultGuardian;

    /* renamed from: n */
    private volatile zacm<R> f13713n;

    /* renamed from: o */
    private boolean f13714o;

    @VisibleForTesting
    public static class CallbackHandler<R extends Result> extends zap {
        public CallbackHandler() {
            this(Looper.getMainLooper());
        }

        /* renamed from: a */
        public final void mo25020a(ResultCallback<? super R> resultCallback, R r) {
            sendMessage(obtainMessage(1, new Pair(resultCallback, r)));
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                ResultCallback resultCallback = (ResultCallback) pair.first;
                Result result = (Result) pair.second;
                try {
                    resultCallback.mo24971a(result);
                } catch (RuntimeException e) {
                    BasePendingResult.m15400c(result);
                    throw e;
                }
            } else if (i != 2) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).mo25014b(Status.f13685m);
            }
        }

        public CallbackHandler(Looper looper) {
            super(looper);
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    private final class C7162a {
        private C7162a() {
        }

        /* access modifiers changed from: protected */
        public final void finalize() throws Throwable {
            BasePendingResult.m15400c(BasePendingResult.this.f13707h);
            super.finalize();
        }

        /* synthetic */ C7162a(BasePendingResult basePendingResult, C7199q0 q0Var) {
            this();
        }
    }

    @Deprecated
    BasePendingResult() {
        this.f13700a = new Object();
        this.f13703d = new CountDownLatch(1);
        this.f13704e = new ArrayList<>();
        this.f13706g = new AtomicReference<>();
        this.f13714o = false;
        this.f13701b = new CallbackHandler<>(Looper.getMainLooper());
        this.f13702c = new WeakReference<>((Object) null);
    }

    /* renamed from: g */
    private final R mo25010g() {
        R r;
        synchronized (this.f13700a) {
            Preconditions.m16048b(!this.f13709j, "Result has already been consumed.");
            Preconditions.m16048b(mo25016c(), "Result is not ready.");
            r = this.f13707h;
            this.f13707h = null;
            this.f13705f = null;
            this.f13709j = true;
        }
        C7189l0 andSet = this.f13706g.getAndSet((Object) null);
        if (andSet != null) {
            andSet.mo25107a(this);
        }
        return r;
    }

    /* renamed from: a */
    public final R mo24963a(long j, TimeUnit timeUnit) {
        if (j > 0) {
            Preconditions.m16050c("await must not be called on the UI thread when time is greater than zero.");
        }
        boolean z = true;
        Preconditions.m16048b(!this.f13709j, "Result has already been consumed.");
        if (this.f13713n != null) {
            z = false;
        }
        Preconditions.m16048b(z, "Cannot await if then() has been called.");
        try {
            if (!this.f13703d.await(j, timeUnit)) {
                mo25014b(Status.f13685m);
            }
        } catch (InterruptedException unused) {
            mo25014b(Status.f13683k);
        }
        Preconditions.m16048b(mo25016c(), "Result is not ready.");
        return mo25010g();
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: a */
    public abstract R mo24797a(Status status);

    /* renamed from: b */
    public boolean mo25015b() {
        boolean z;
        synchronized (this.f13700a) {
            z = this.f13710k;
        }
        return z;
    }

    @KeepForSdk
    /* renamed from: c */
    public final boolean mo25016c() {
        return this.f13703d.getCount() == 0;
    }

    /* renamed from: d */
    public final Integer mo25017d() {
        return null;
    }

    /* renamed from: e */
    public final boolean mo25018e() {
        boolean b;
        synchronized (this.f13700a) {
            if (((GoogleApiClient) this.f13702c.get()) == null || !this.f13714o) {
                mo24914a();
            }
            b = mo25015b();
        }
        return b;
    }

    /* renamed from: f */
    public final void mo25019f() {
        this.f13714o = this.f13714o || f13699p.get().booleanValue();
    }

    /* renamed from: c */
    public static void m15400c(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).mo24917a();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(result);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("BasePendingResult", sb.toString(), e);
            }
        }
    }

    /* renamed from: b */
    public final void mo25014b(Status status) {
        synchronized (this.f13700a) {
            if (!mo25016c()) {
                mo25012a(mo24797a(status));
                this.f13711l = true;
            }
        }
    }

    @KeepForSdk
    protected BasePendingResult(GoogleApiClient googleApiClient) {
        this.f13700a = new Object();
        this.f13703d = new CountDownLatch(1);
        this.f13704e = new ArrayList<>();
        this.f13706g = new AtomicReference<>();
        this.f13714o = false;
        this.f13701b = new CallbackHandler<>(googleApiClient != null ? googleApiClient.mo24951f() : Looper.getMainLooper());
        this.f13702c = new WeakReference<>(googleApiClient);
    }

    /* renamed from: b */
    private final void mo25008b(R r) {
        this.f13707h = r;
        this.f13712m = null;
        this.f13703d.countDown();
        this.f13708i = this.f13707h.getStatus();
        if (this.f13710k) {
            this.f13705f = null;
        } else if (this.f13705f != null) {
            this.f13701b.removeMessages(2);
            this.f13701b.mo25020a(this.f13705f, mo25010g());
        } else if (this.f13707h instanceof Releasable) {
            this.mResultGuardian = new C7162a(this, (C7199q0) null);
        }
        ArrayList<PendingResult.StatusListener> arrayList = this.f13704e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            PendingResult.StatusListener statusListener = arrayList.get(i);
            i++;
            statusListener.mo24966a(this.f13708i);
        }
        this.f13704e.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        return;
     */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24965a(com.google.android.gms.common.api.ResultCallback<? super R> r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f13700a
            monitor-enter(r0)
            if (r6 != 0) goto L_0x000a
            r6 = 0
            r5.f13705f = r6     // Catch:{ all -> 0x003f }
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x000a:
            boolean r1 = r5.f13709j     // Catch:{ all -> 0x003f }
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0012
            r1 = 1
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            java.lang.String r4 = "Result has already been consumed."
            com.google.android.gms.common.internal.Preconditions.m16048b(r1, r4)     // Catch:{ all -> 0x003f }
            com.google.android.gms.common.api.internal.zacm<R> r1 = r5.f13713n     // Catch:{ all -> 0x003f }
            if (r1 != 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r2 = 0
        L_0x001e:
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            com.google.android.gms.common.internal.Preconditions.m16048b(r2, r1)     // Catch:{ all -> 0x003f }
            boolean r1 = r5.mo25015b()     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x002b
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x002b:
            boolean r1 = r5.mo25016c()     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003b
            com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler<R> r1 = r5.f13701b     // Catch:{ all -> 0x003f }
            com.google.android.gms.common.api.Result r2 = r5.mo25010g()     // Catch:{ all -> 0x003f }
            r1.mo25020a(r6, r2)     // Catch:{ all -> 0x003f }
            goto L_0x003d
        L_0x003b:
            r5.f13705f = r6     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x003f:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.mo24965a(com.google.android.gms.common.api.ResultCallback):void");
    }

    /* renamed from: a */
    public final void mo24964a(PendingResult.StatusListener statusListener) {
        Preconditions.m16044a(statusListener != null, (Object) "Callback cannot be null.");
        synchronized (this.f13700a) {
            if (mo25016c()) {
                statusListener.mo24966a(this.f13708i);
            } else {
                this.f13704e.add(statusListener);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|(2:10|11)|12|13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0015 */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24914a() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f13700a
            monitor-enter(r0)
            boolean r1 = r2.f13710k     // Catch:{ all -> 0x002a }
            if (r1 != 0) goto L_0x0028
            boolean r1 = r2.f13709j     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x000c
            goto L_0x0028
        L_0x000c:
            com.google.android.gms.common.internal.ICancelToken r1 = r2.f13712m     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0015
            com.google.android.gms.common.internal.ICancelToken r1 = r2.f13712m     // Catch:{ RemoteException -> 0x0015 }
            r1.cancel()     // Catch:{ RemoteException -> 0x0015 }
        L_0x0015:
            R r1 = r2.f13707h     // Catch:{ all -> 0x002a }
            m15400c(r1)     // Catch:{ all -> 0x002a }
            r1 = 1
            r2.f13710k = r1     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.f13686n     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.Result r1 = r2.mo24797a((com.google.android.gms.common.api.Status) r1)     // Catch:{ all -> 0x002a }
            r2.mo25008b(r1)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.mo24914a():void");
    }

    @KeepForSdk
    /* renamed from: a */
    public final void mo25012a(R r) {
        synchronized (this.f13700a) {
            if (this.f13711l || this.f13710k) {
                m15400c(r);
                return;
            }
            mo25016c();
            boolean z = true;
            Preconditions.m16048b(!mo25016c(), "Results have already been set");
            if (this.f13709j) {
                z = false;
            }
            Preconditions.m16048b(z, "Result has already been consumed");
            mo25008b(r);
        }
    }

    /* renamed from: a */
    public final void mo25013a(C7189l0 l0Var) {
        this.f13706g.set(l0Var);
    }
}
