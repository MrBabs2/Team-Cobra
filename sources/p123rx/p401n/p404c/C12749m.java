package p123rx.p401n.p404c;

import p123rx.C5373h;
import p123rx.exceptions.C12472a;
import p123rx.p126m.C5377a;

/* renamed from: rx.n.c.m */
/* compiled from: SleepingAction */
class C12749m implements C5377a {

    /* renamed from: f */
    private final C5377a f32924f;

    /* renamed from: g */
    private final C5373h.C5374a f32925g;

    /* renamed from: h */
    private final long f32926h;

    public C12749m(C5377a aVar, C5373h.C5374a aVar2, long j) {
        this.f32924f = aVar;
        this.f32925g = aVar2;
        this.f32926h = j;
    }

    public void call() {
        if (!this.f32925g.isUnsubscribed()) {
            long b = this.f32926h - this.f32925g.mo18713b();
            if (b > 0) {
                try {
                    Thread.sleep(b);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    C12472a.m40944b(e);
                    throw null;
                }
            }
            if (!this.f32925g.isUnsubscribed()) {
                this.f32924f.call();
            }
        }
    }
}
