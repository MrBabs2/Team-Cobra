package p123rx.p401n.p404c;

import java.util.concurrent.TimeUnit;
import p123rx.C5373h;
import p123rx.C5375k;
import p123rx.p126m.C5377a;
import p123rx.p128t.C12885a;
import p123rx.p128t.C12889e;

/* renamed from: rx.n.c.f */
/* compiled from: ImmediateScheduler */
public final class C12727f extends C5373h {

    /* renamed from: a */
    public static final C12727f f32876a = new C12727f();

    private C12727f() {
    }

    public C5373h.C5374a createWorker() {
        return new C12728a();
    }

    /* renamed from: rx.n.c.f$a */
    /* compiled from: ImmediateScheduler */
    final class C12728a extends C5373h.C5374a implements C5375k {

        /* renamed from: f */
        final C12885a f32877f = new C12885a();

        C12728a() {
        }

        /* renamed from: a */
        public C5375k mo18712a(C5377a aVar, long j, TimeUnit timeUnit) {
            return mo18710a(new C12749m(aVar, this, C12727f.this.now() + timeUnit.toMillis(j)));
        }

        public boolean isUnsubscribed() {
            return this.f32877f.isUnsubscribed();
        }

        public void unsubscribe() {
            this.f32877f.unsubscribe();
        }

        /* renamed from: a */
        public C5375k mo18710a(C5377a aVar) {
            aVar.call();
            return C12889e.m41502b();
        }
    }
}
