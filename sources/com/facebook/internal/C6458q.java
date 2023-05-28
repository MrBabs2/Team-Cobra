package com.facebook.internal;

import com.facebook.C4716f;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;

/* renamed from: com.facebook.internal.q */
/* compiled from: LockOnGetVariable */
public class C6458q<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public T f11886a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public CountDownLatch f11887b = new CountDownLatch(1);

    /* renamed from: com.facebook.internal.q$a */
    /* compiled from: LockOnGetVariable */
    class C6459a implements Callable<Void> {

        /* renamed from: f */
        final /* synthetic */ Callable f11888f;

        C6459a(Callable callable) {
            this.f11888f = callable;
        }

        /* JADX INFO: finally extract failed */
        public Void call() throws Exception {
            try {
                Object unused = C6458q.this.f11886a = this.f11888f.call();
                C6458q.this.f11887b.countDown();
                return null;
            } catch (Throwable th) {
                C6458q.this.f11887b.countDown();
                throw th;
            }
        }
    }

    public C6458q(Callable<T> callable) {
        C4716f.m7704m().execute(new FutureTask(new C6459a(callable)));
    }
}
