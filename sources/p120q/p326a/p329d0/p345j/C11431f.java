package p120q.p326a.p329d0.p345j;

import java.util.concurrent.CountDownLatch;
import p120q.p326a.p328c0.C10847a;
import p120q.p326a.p328c0.C10853g;

/* renamed from: q.a.d0.j.f */
/* compiled from: BlockingIgnoringReceiver */
public final class C11431f extends CountDownLatch implements C10853g<Throwable>, C10847a {

    /* renamed from: f */
    public Throwable f30614f;

    public C11431f() {
        super(1);
    }

    public void run() {
        countDown();
    }

    /* renamed from: a */
    public void mo8098a(Throwable th) {
        this.f30614f = th;
        countDown();
    }
}
