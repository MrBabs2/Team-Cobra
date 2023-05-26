package p123rx.p124l;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
import p123rx.C5375k;
import p123rx.p124l.p125c.C5376a;
import p123rx.p126m.C5377a;

/* renamed from: rx.l.a */
/* compiled from: MainThreadSubscription */
public abstract class C12476a implements C5375k {
    private final AtomicBoolean unsubscribed = new AtomicBoolean();

    /* renamed from: rx.l.a$a */
    /* compiled from: MainThreadSubscription */
    class C12477a implements C5377a {
        C12477a() {
        }

        public void call() {
            C12476a.this.onUnsubscribe();
        }
    }

    public static void verifyMainThread() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Expected to be called on the main thread but was " + Thread.currentThread().getName());
        }
    }

    public final boolean isUnsubscribed() {
        return this.unsubscribed.get();
    }

    /* access modifiers changed from: protected */
    public abstract void onUnsubscribe();

    public final void unsubscribe() {
        if (!this.unsubscribed.compareAndSet(false, true)) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            onUnsubscribe();
        } else {
            C5376a.m10346b().createWorker().mo18710a(new C12477a());
        }
    }
}
