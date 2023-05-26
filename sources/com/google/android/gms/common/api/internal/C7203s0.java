package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.s0 */
final class C7203s0 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C7201r0 f13842f;

    C7203s0(C7201r0 r0Var) {
        this.f13842f = r0Var;
    }

    public final void run() {
        this.f13842f.f13839r.lock();
        try {
            this.f13842f.m15589g();
        } finally {
            this.f13842f.f13839r.unlock();
        }
    }
}
