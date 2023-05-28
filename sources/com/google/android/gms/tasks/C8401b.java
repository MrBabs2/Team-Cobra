package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.b */
final class C8401b<TResult> implements C8403d<TResult> {

    /* renamed from: a */
    private final Executor f23707a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f23708b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public OnCompleteListener<TResult> f23709c;

    public C8401b(Executor executor, OnCompleteListener<TResult> onCompleteListener) {
        this.f23707a = executor;
        this.f23709c = onCompleteListener;
    }

    /* renamed from: a */
    public final void mo30716a(Task<TResult> task) {
        synchronized (this.f23708b) {
            if (this.f23709c != null) {
                this.f23707a.execute(new C8402c(this, task));
            }
        }
    }
}
