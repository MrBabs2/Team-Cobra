package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.g */
final class C8406g<TResult> extends Task<TResult> {

    /* renamed from: a */
    private final Object f23715a = new Object();

    /* renamed from: b */
    private final C8404e<TResult> f23716b = new C8404e<>();

    /* renamed from: c */
    private boolean f23717c;

    /* renamed from: d */
    private volatile boolean f23718d;

    /* renamed from: e */
    private TResult f23719e;

    /* renamed from: f */
    private Exception f23720f;

    C8406g() {
    }

    /* renamed from: e */
    private final void m26922e() {
        Preconditions.m16048b(this.f23717c, "Task is not yet complete");
    }

    /* renamed from: f */
    private final void m26923f() {
        Preconditions.m16048b(!this.f23717c, "Task is already complete");
    }

    /* renamed from: g */
    private final void m26924g() {
        if (this.f23718d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    /* renamed from: h */
    private final void m26925h() {
        synchronized (this.f23715a) {
            if (this.f23717c) {
                this.f23716b.mo30718a(this);
            }
        }
    }

    /* renamed from: a */
    public final Exception mo30706a() {
        Exception exc;
        synchronized (this.f23715a) {
            exc = this.f23720f;
        }
        return exc;
    }

    /* renamed from: b */
    public final TResult mo30707b() {
        TResult tresult;
        synchronized (this.f23715a) {
            m26922e();
            m26924g();
            if (this.f23720f == null) {
                tresult = this.f23719e;
            } else {
                throw new RuntimeExecutionException(this.f23720f);
            }
        }
        return tresult;
    }

    /* renamed from: c */
    public final boolean mo30708c() {
        boolean z;
        synchronized (this.f23715a) {
            z = this.f23717c;
        }
        return z;
    }

    /* renamed from: d */
    public final boolean mo30709d() {
        boolean z;
        synchronized (this.f23715a) {
            z = this.f23717c && !this.f23718d && this.f23720f == null;
        }
        return z;
    }

    /* renamed from: a */
    public final Task<TResult> mo30704a(OnCompleteListener<TResult> onCompleteListener) {
        mo30705a(TaskExecutors.f23705a, onCompleteListener);
        return this;
    }

    /* renamed from: a */
    public final Task<TResult> mo30705a(Executor executor, OnCompleteListener<TResult> onCompleteListener) {
        this.f23716b.mo30719a(new C8401b(executor, onCompleteListener));
        m26925h();
        return this;
    }

    /* renamed from: a */
    public final void mo30722a(TResult tresult) {
        synchronized (this.f23715a) {
            m26923f();
            this.f23717c = true;
            this.f23719e = tresult;
        }
        this.f23716b.mo30718a(this);
    }

    /* renamed from: b */
    public final boolean mo30724b(TResult tresult) {
        synchronized (this.f23715a) {
            if (this.f23717c) {
                return false;
            }
            this.f23717c = true;
            this.f23719e = tresult;
            this.f23716b.mo30718a(this);
            return true;
        }
    }

    /* renamed from: a */
    public final void mo30721a(Exception exc) {
        Preconditions.m16038a(exc, (Object) "Exception must not be null");
        synchronized (this.f23715a) {
            m26923f();
            this.f23717c = true;
            this.f23720f = exc;
        }
        this.f23716b.mo30718a(this);
    }

    /* renamed from: b */
    public final boolean mo30723b(Exception exc) {
        Preconditions.m16038a(exc, (Object) "Exception must not be null");
        synchronized (this.f23715a) {
            if (this.f23717c) {
                return false;
            }
            this.f23717c = true;
            this.f23720f = exc;
            this.f23716b.mo30718a(this);
            return true;
        }
    }
}
