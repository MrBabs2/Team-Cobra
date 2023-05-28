package p123rx.p401n.p404c;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p123rx.C5373h;
import p123rx.C5375k;
import p123rx.p126m.C5377a;
import p123rx.p128t.C12885a;
import p123rx.p128t.C12889e;

/* renamed from: rx.n.c.n */
/* compiled from: TrampolineScheduler */
public final class C12750n extends C5373h {

    /* renamed from: a */
    public static final C12750n f32927a = new C12750n();

    /* renamed from: rx.n.c.n$a */
    /* compiled from: TrampolineScheduler */
    static final class C12751a extends C5373h.C5374a implements C5375k {

        /* renamed from: f */
        final AtomicInteger f32928f = new AtomicInteger();

        /* renamed from: g */
        final PriorityBlockingQueue<C12753b> f32929g = new PriorityBlockingQueue<>();

        /* renamed from: h */
        private final C12885a f32930h = new C12885a();

        /* renamed from: i */
        private final AtomicInteger f32931i = new AtomicInteger();

        /* renamed from: rx.n.c.n$a$a */
        /* compiled from: TrampolineScheduler */
        class C12752a implements C5377a {

            /* renamed from: f */
            final /* synthetic */ C12753b f32932f;

            C12752a(C12753b bVar) {
                this.f32932f = bVar;
            }

            public void call() {
                C12751a.this.f32929g.remove(this.f32932f);
            }
        }

        C12751a() {
        }

        /* renamed from: a */
        public C5375k mo18710a(C5377a aVar) {
            return m41241a(aVar, mo18713b());
        }

        public boolean isUnsubscribed() {
            return this.f32930h.isUnsubscribed();
        }

        public void unsubscribe() {
            this.f32930h.unsubscribe();
        }

        /* renamed from: a */
        public C5375k mo18712a(C5377a aVar, long j, TimeUnit timeUnit) {
            long b = mo18713b() + timeUnit.toMillis(j);
            return m41241a(new C12749m(aVar, this, b), b);
        }

        /* renamed from: a */
        private C5375k m41241a(C5377a aVar, long j) {
            if (this.f32930h.isUnsubscribed()) {
                return C12889e.m41502b();
            }
            C12753b bVar = new C12753b(aVar, Long.valueOf(j), this.f32928f.incrementAndGet());
            this.f32929g.add(bVar);
            if (this.f32931i.getAndIncrement() != 0) {
                return C12889e.m41501a(new C12752a(bVar));
            }
            do {
                C12753b poll = this.f32929g.poll();
                if (poll != null) {
                    poll.f32934f.call();
                }
            } while (this.f32931i.decrementAndGet() > 0);
            return C12889e.m41502b();
        }
    }

    /* renamed from: rx.n.c.n$b */
    /* compiled from: TrampolineScheduler */
    static final class C12753b implements Comparable<C12753b> {

        /* renamed from: f */
        final C5377a f32934f;

        /* renamed from: g */
        final Long f32935g;

        /* renamed from: h */
        final int f32936h;

        C12753b(C5377a aVar, Long l, int i) {
            this.f32934f = aVar;
            this.f32935g = l;
            this.f32936h = i;
        }

        /* renamed from: a */
        public int compareTo(C12753b bVar) {
            int compareTo = this.f32935g.compareTo(bVar.f32935g);
            return compareTo == 0 ? C12750n.m41240a(this.f32936h, bVar.f32936h) : compareTo;
        }
    }

    private C12750n() {
    }

    /* renamed from: a */
    static int m41240a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public C5373h.C5374a createWorker() {
        return new C12751a();
    }
}
