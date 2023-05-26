package p123rx.schedulers;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import p123rx.C5373h;
import p123rx.C5375k;
import p123rx.p126m.C5377a;
import p123rx.p128t.C12885a;
import p123rx.p128t.C12889e;
import p123rx.p401n.p404c.C12732i;

/* renamed from: rx.schedulers.TestScheduler */
public class TestScheduler extends C5373h {

    /* renamed from: c */
    static long f33122c;

    /* renamed from: a */
    final Queue<C12884c> f33123a = new PriorityQueue(11, new C12880a());

    /* renamed from: b */
    long f33124b;

    /* renamed from: rx.schedulers.TestScheduler$a */
    static final class C12880a implements Comparator<C12884c> {
        C12880a() {
        }

        /* renamed from: a */
        public int compare(C12884c cVar, C12884c cVar2) {
            long j = cVar.f33131a;
            long j2 = cVar2.f33131a;
            if (j == j2) {
                if (cVar.f33134d < cVar2.f33134d) {
                    return -1;
                }
                if (cVar.f33134d > cVar2.f33134d) {
                    return 1;
                }
                return 0;
            } else if (j < j2) {
                return -1;
            } else {
                if (j > j2) {
                    return 1;
                }
                return 0;
            }
        }
    }

    /* renamed from: rx.schedulers.TestScheduler$c */
    static final class C12884c {

        /* renamed from: a */
        final long f33131a;

        /* renamed from: b */
        final C5377a f33132b;

        /* renamed from: c */
        final C5373h.C5374a f33133c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final long f33134d;

        C12884c(C5373h.C5374a aVar, long j, C5377a aVar2) {
            long j2 = TestScheduler.f33122c;
            TestScheduler.f33122c = 1 + j2;
            this.f33134d = j2;
            this.f33131a = j;
            this.f33132b = aVar2;
            this.f33133c = aVar;
        }

        public String toString() {
            return String.format("TimedAction(time = %d, action = %s)", new Object[]{Long.valueOf(this.f33131a), this.f33132b.toString()});
        }
    }

    /* renamed from: a */
    private void m41487a(long j) {
        while (!this.f33123a.isEmpty()) {
            C12884c peek = this.f33123a.peek();
            long j2 = peek.f33131a;
            if (j2 > j) {
                break;
            }
            if (j2 == 0) {
                j2 = this.f33124b;
            }
            this.f33124b = j2;
            this.f33123a.remove();
            if (!peek.f33133c.isUnsubscribed()) {
                peek.f33132b.call();
            }
        }
        this.f33124b = j;
    }

    public void advanceTimeBy(long j, TimeUnit timeUnit) {
        advanceTimeTo(this.f33124b + timeUnit.toNanos(j), TimeUnit.NANOSECONDS);
    }

    public void advanceTimeTo(long j, TimeUnit timeUnit) {
        m41487a(timeUnit.toNanos(j));
    }

    public C5373h.C5374a createWorker() {
        return new C12881b();
    }

    public long now() {
        return TimeUnit.NANOSECONDS.toMillis(this.f33124b);
    }

    public void triggerActions() {
        m41487a(this.f33124b);
    }

    /* renamed from: rx.schedulers.TestScheduler$b */
    final class C12881b extends C5373h.C5374a implements C12732i.C12734b {

        /* renamed from: f */
        private final C12885a f33125f = new C12885a();

        /* renamed from: rx.schedulers.TestScheduler$b$a */
        class C12882a implements C5377a {

            /* renamed from: f */
            final /* synthetic */ C12884c f33127f;

            C12882a(C12884c cVar) {
                this.f33127f = cVar;
            }

            public void call() {
                TestScheduler.this.f33123a.remove(this.f33127f);
            }
        }

        /* renamed from: rx.schedulers.TestScheduler$b$b */
        class C12883b implements C5377a {

            /* renamed from: f */
            final /* synthetic */ C12884c f33129f;

            C12883b(C12884c cVar) {
                this.f33129f = cVar;
            }

            public void call() {
                TestScheduler.this.f33123a.remove(this.f33129f);
            }
        }

        C12881b() {
        }

        /* renamed from: a */
        public C5375k mo18712a(C5377a aVar, long j, TimeUnit timeUnit) {
            C12884c cVar = new C12884c(this, TestScheduler.this.f33124b + timeUnit.toNanos(j), aVar);
            TestScheduler.this.f33123a.add(cVar);
            return C12889e.m41501a(new C12882a(cVar));
        }

        /* renamed from: b */
        public long mo18713b() {
            return TestScheduler.this.now();
        }

        public boolean isUnsubscribed() {
            return this.f33125f.isUnsubscribed();
        }

        public void unsubscribe() {
            this.f33125f.unsubscribe();
        }

        /* renamed from: a */
        public C5375k mo18710a(C5377a aVar) {
            C12884c cVar = new C12884c(this, 0, aVar);
            TestScheduler.this.f33123a.add(cVar);
            return C12889e.m41501a(new C12883b(cVar));
        }

        /* renamed from: a */
        public C5375k mo18711a(C5377a aVar, long j, long j2, TimeUnit timeUnit) {
            return C12732i.m41225a(this, aVar, j, j2, timeUnit, this);
        }

        /* renamed from: a */
        public long mo40866a() {
            return TestScheduler.this.f33124b;
        }
    }
}
