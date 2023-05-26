package p123rx.p401n.p404c;

import java.util.concurrent.ThreadFactory;
import p123rx.C5373h;

/* renamed from: rx.n.c.g */
/* compiled from: NewThreadScheduler */
public final class C12729g extends C5373h {

    /* renamed from: a */
    private final ThreadFactory f32879a;

    public C12729g(ThreadFactory threadFactory) {
        this.f32879a = threadFactory;
    }

    public C5373h.C5374a createWorker() {
        return new C12730h(this.f32879a);
    }
}
