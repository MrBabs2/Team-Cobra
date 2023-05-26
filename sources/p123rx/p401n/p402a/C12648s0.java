package p123rx.p401n.p402a;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p123rx.C12459a;
import p123rx.C12473g;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.p126m.C5377a;
import p123rx.p401n.p406e.C12758c;

/* renamed from: rx.n.a.s0 */
/* compiled from: OperatorOnBackpressureBuffer */
public class C12648s0<T> implements C5368e.C5371b<T, T> {

    /* renamed from: f */
    private final Long f32661f = null;

    /* renamed from: g */
    private final C5377a f32662g = null;

    /* renamed from: h */
    private final C12459a.C12463d f32663h = C12459a.f32213b;

    /* renamed from: rx.n.a.s0$a */
    /* compiled from: OperatorOnBackpressureBuffer */
    static final class C12649a<T> extends C12475j<T> implements C12758c.C12759a {

        /* renamed from: f */
        private final ConcurrentLinkedQueue<Object> f32664f = new ConcurrentLinkedQueue<>();

        /* renamed from: g */
        private final AtomicLong f32665g;

        /* renamed from: h */
        private final C12475j<? super T> f32666h;

        /* renamed from: i */
        private final AtomicBoolean f32667i = new AtomicBoolean(false);

        /* renamed from: j */
        private final C12758c f32668j;

        /* renamed from: k */
        private final C5377a f32669k;

        /* renamed from: l */
        private final C12459a.C12463d f32670l;

        public C12649a(C12475j<? super T> jVar, Long l, C5377a aVar, C12459a.C12463d dVar) {
            this.f32666h = jVar;
            this.f32665g = l != null ? new AtomicLong(l.longValue()) : null;
            this.f32669k = aVar;
            this.f32668j = new C12758c(this);
            this.f32670l = dVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0039 A[SYNTHETIC, Splitter:B:19:0x0039] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0049 A[SYNTHETIC] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean m41130b() {
            /*
                r6 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r6.f32665g
                r1 = 1
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                java.util.concurrent.atomic.AtomicLong r0 = r6.f32665g
                long r2 = r0.get()
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 > 0) goto L_0x004a
                r0 = 0
                rx.a$d r4 = r6.f32670l     // Catch:{ MissingBackpressureException -> 0x0023 }
                boolean r4 = r4.mo40631a()     // Catch:{ MissingBackpressureException -> 0x0023 }
                if (r4 == 0) goto L_0x0034
                java.lang.Object r4 = r6.poll()     // Catch:{ MissingBackpressureException -> 0x0023 }
                if (r4 == 0) goto L_0x0034
                r4 = 1
                goto L_0x0035
            L_0x0023:
                r4 = move-exception
                java.util.concurrent.atomic.AtomicBoolean r5 = r6.f32667i
                boolean r5 = r5.compareAndSet(r0, r1)
                if (r5 == 0) goto L_0x0034
                r6.unsubscribe()
                rx.j<? super T> r5 = r6.f32666h
                r5.onError(r4)
            L_0x0034:
                r4 = 0
            L_0x0035:
                rx.m.a r5 = r6.f32669k
                if (r5 == 0) goto L_0x0047
                r5.call()     // Catch:{ all -> 0x003d }
                goto L_0x0047
            L_0x003d:
                r1 = move-exception
                p123rx.exceptions.C12472a.m40945c(r1)
                rx.n.e.c r2 = r6.f32668j
                r2.mo40881a(r1)
                return r0
            L_0x0047:
                if (r4 != 0) goto L_0x004a
                return r0
            L_0x004a:
                java.util.concurrent.atomic.AtomicLong r0 = r6.f32665g
                r4 = 1
                long r4 = r2 - r4
                boolean r0 = r0.compareAndSet(r2, r4)
                if (r0 == 0) goto L_0x0006
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p123rx.p401n.p402a.C12648s0.C12649a.m41130b():boolean");
        }

        /* renamed from: a */
        public boolean mo40802a(Object obj) {
            return C12558h.m41017a(this.f32666h, obj);
        }

        public void onCompleted() {
            if (!this.f32667i.get()) {
                this.f32668j.mo40882b();
            }
        }

        public void onError(Throwable th) {
            if (!this.f32667i.get()) {
                this.f32668j.mo40881a(th);
            }
        }

        public void onNext(T t) {
            if (m41130b()) {
                this.f32664f.offer(C12558h.m41020d(t));
                this.f32668j.mo40880a();
            }
        }

        public void onStart() {
            request(Long.MAX_VALUE);
        }

        public Object peek() {
            return this.f32664f.peek();
        }

        public Object poll() {
            Object poll = this.f32664f.poll();
            AtomicLong atomicLong = this.f32665g;
            if (!(atomicLong == null || poll == null)) {
                atomicLong.incrementAndGet();
            }
            return poll;
        }

        /* renamed from: a */
        public void mo40801a(Throwable th) {
            if (th != null) {
                this.f32666h.onError(th);
            } else {
                this.f32666h.onCompleted();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C12473g mo40800a() {
            return this.f32668j;
        }
    }

    /* renamed from: rx.n.a.s0$b */
    /* compiled from: OperatorOnBackpressureBuffer */
    static final class C12650b {

        /* renamed from: a */
        static final C12648s0<?> f32671a = new C12648s0<>();
    }

    C12648s0() {
    }

    /* renamed from: a */
    public static <T> C12648s0<T> m41128a() {
        return C12650b.f32671a;
    }

    /* renamed from: a */
    public C12475j<? super T> call(C12475j<? super T> jVar) {
        C12649a aVar = new C12649a(jVar, this.f32661f, this.f32662g, this.f32663h);
        jVar.add(aVar);
        jVar.setProducer(aVar.mo40800a());
        return aVar;
    }
}
