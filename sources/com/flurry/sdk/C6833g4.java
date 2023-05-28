package com.flurry.sdk;

import java.util.TimerTask;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* renamed from: com.flurry.sdk.g4 */
public abstract class C6833g4 {

    /* renamed from: i */
    static Runnable f12785i = new C6834a();

    /* renamed from: f */
    protected final C6833g4 f12786f;

    /* renamed from: g */
    protected final boolean f12787g;

    /* renamed from: h */
    protected final boolean f12788h;

    /* renamed from: com.flurry.sdk.g4$a */
    static class C6834a implements Runnable {
        C6834a() {
        }

        public final void run() {
        }
    }

    /* renamed from: com.flurry.sdk.g4$b */
    public class C6835b extends FutureTask<Void> {

        /* renamed from: f */
        public final C6833g4 f12789f;

        /* renamed from: g */
        private TimerTask f12790g;

        /* renamed from: h */
        private int f12791h;

        C6835b(C6833g4 g4Var, C6833g4 g4Var2, Runnable runnable) {
            super(runnable, (Object) null);
            this.f12789f = g4Var2;
            if (runnable == C6833g4.f12785i) {
                this.f12791h = 0;
            } else {
                this.f12791h = 1;
            }
        }

        /* renamed from: a */
        public final synchronized boolean mo23597a() {
            return this.f12791h == 0;
        }

        public synchronized boolean cancel(boolean z) {
            super.cancel(z);
            if (this.f12790g != null) {
                this.f12790g.cancel();
            }
            return true;
        }

        public synchronized void run() {
            if (this.f12791h == 1) {
                this.f12791h = 2;
                if (!this.f12789f.mo23565f(this)) {
                    this.f12789f.mo23595e(this);
                }
                this.f12791h = 1;
                return;
            }
            super.run();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    C6833g4(String str, C6833g4 g4Var, boolean z) {
        this(str, g4Var, z, g4Var == null ? false : g4Var.f12788h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo23561a(Runnable runnable);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo23594b(Runnable runnable) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Future<Void> mo23563c(Runnable runnable);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo23564d(Runnable runnable) throws CancellationException;

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo23595e(Runnable runnable) {
        for (C6833g4 g4Var = this.f12786f; g4Var != null; g4Var = g4Var.f12786f) {
            if (g4Var.mo23565f(runnable)) {
                return true;
            }
        }
        runnable.run();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract boolean mo23565f(Runnable runnable);

    private C6833g4(String str, C6833g4 g4Var, boolean z, boolean z2) {
        this.f12786f = g4Var;
        this.f12787g = z;
        this.f12788h = z2;
    }
}
