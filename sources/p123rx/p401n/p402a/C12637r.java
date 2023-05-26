package p123rx.p401n.p402a;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p123rx.C12473g;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.C5372f;
import p123rx.exceptions.C12472a;
import p123rx.exceptions.MissingBackpressureException;
import p123rx.p126m.C5379n;
import p123rx.p401n.p402a.C12663u;
import p123rx.p401n.p406e.C12761e;
import p123rx.p401n.p406e.C12772h;
import p123rx.p401n.p406e.C12775j;
import p123rx.p401n.p406e.p407n.C12799e;
import p123rx.p401n.p406e.p407n.C12801g;
import p123rx.p401n.p406e.p408o.C12821s;
import p123rx.p401n.p406e.p408o.C12828z;
import p123rx.p411q.C12844c;

/* renamed from: rx.n.a.r */
/* compiled from: OnSubscribeFlattenIterable */
public final class C12637r<T, R> implements C5368e.C5370a<R> {

    /* renamed from: f */
    final C5368e<? extends T> f32623f;

    /* renamed from: g */
    final C5379n<? super T, ? extends Iterable<? extends R>> f32624g;

    /* renamed from: h */
    final int f32625h;

    /* renamed from: rx.n.a.r$a */
    /* compiled from: OnSubscribeFlattenIterable */
    class C12638a implements C12473g {

        /* renamed from: f */
        final /* synthetic */ C12639b f32626f;

        C12638a(C12637r rVar, C12639b bVar) {
            this.f32626f = bVar;
        }

        public void request(long j) {
            this.f32626f.mo40788a(j);
        }
    }

    /* renamed from: rx.n.a.r$c */
    /* compiled from: OnSubscribeFlattenIterable */
    static final class C12640c<T, R> implements C5368e.C5370a<R> {

        /* renamed from: f */
        final T f32637f;

        /* renamed from: g */
        final C5379n<? super T, ? extends Iterable<? extends R>> f32638g;

        public C12640c(T t, C5379n<? super T, ? extends Iterable<? extends R>> nVar) {
            this.f32637f = t;
            this.f32638g = nVar;
        }

        /* renamed from: a */
        public void call(C12475j<? super R> jVar) {
            try {
                Iterator it = ((Iterable) this.f32638g.call(this.f32637f)).iterator();
                if (!it.hasNext()) {
                    jVar.onCompleted();
                } else {
                    jVar.setProducer(new C12663u.C12664a(jVar, it));
                }
            } catch (Throwable th) {
                C12472a.m40940a(th, (C5372f<?>) jVar, (Object) this.f32637f);
            }
        }
    }

    protected C12637r(C5368e<? extends T> eVar, C5379n<? super T, ? extends Iterable<? extends R>> nVar, int i) {
        this.f32623f = eVar;
        this.f32624g = nVar;
        this.f32625h = i;
    }

    /* renamed from: a */
    public void call(C12475j<? super R> jVar) {
        C12639b bVar = new C12639b(jVar, this.f32624g, this.f32625h);
        jVar.add(bVar);
        jVar.setProducer(new C12638a(this, bVar));
        this.f32623f.mo18668b(bVar);
    }

    /* renamed from: rx.n.a.r$b */
    /* compiled from: OnSubscribeFlattenIterable */
    static final class C12639b<T, R> extends C12475j<T> {

        /* renamed from: f */
        final C12475j<? super R> f32627f;

        /* renamed from: g */
        final C5379n<? super T, ? extends Iterable<? extends R>> f32628g;

        /* renamed from: h */
        final long f32629h;

        /* renamed from: i */
        final Queue<Object> f32630i;

        /* renamed from: j */
        final AtomicReference<Throwable> f32631j = new AtomicReference<>();

        /* renamed from: k */
        final AtomicLong f32632k = new AtomicLong();

        /* renamed from: l */
        final AtomicInteger f32633l = new AtomicInteger();

        /* renamed from: m */
        volatile boolean f32634m;

        /* renamed from: n */
        long f32635n;

        /* renamed from: o */
        Iterator<? extends R> f32636o;

        public C12639b(C12475j<? super R> jVar, C5379n<? super T, ? extends Iterable<? extends R>> nVar, int i) {
            this.f32627f = jVar;
            this.f32628g = nVar;
            if (i == Integer.MAX_VALUE) {
                this.f32629h = Long.MAX_VALUE;
                this.f32630i = new C12801g(C12772h.f32957h);
            } else {
                this.f32629h = (long) (i - (i >> 2));
                if (C12828z.m41379a()) {
                    this.f32630i = new C12821s(i);
                } else {
                    this.f32630i = new C12799e(i);
                }
            }
            request((long) i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40788a(long j) {
            if (j > 0) {
                C12502a.m40960a(this.f32632k, j);
                mo40787a();
            } else if (j < 0) {
                throw new IllegalStateException("n >= 0 required but it was " + j);
            }
        }

        public void onCompleted() {
            this.f32634m = true;
            mo40787a();
        }

        public void onError(Throwable th) {
            if (C12761e.m41256a(this.f32631j, th)) {
                this.f32634m = true;
                mo40787a();
                return;
            }
            C12844c.m41417b(th);
        }

        public void onNext(T t) {
            if (!this.f32630i.offer(C12558h.m41020d(t))) {
                unsubscribe();
                onError(new MissingBackpressureException());
                return;
            }
            mo40787a();
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ca, code lost:
            if (r0 != null) goto L_0x00cf;
         */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00af  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x00c5  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x00d8 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x0010 A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo40787a() {
            /*
                r17 = this;
                r1 = r17
                java.util.concurrent.atomic.AtomicInteger r0 = r1.f32633l
                int r0 = r0.getAndIncrement()
                if (r0 == 0) goto L_0x000b
                return
            L_0x000b:
                rx.j<? super R> r2 = r1.f32627f
                java.util.Queue<java.lang.Object> r3 = r1.f32630i
                r5 = 1
            L_0x0010:
                java.util.Iterator<? extends R> r0 = r1.f32636o
                r6 = 1
                r8 = 0
                r10 = 0
                if (r0 != 0) goto L_0x0063
                boolean r11 = r1.f32634m
                java.lang.Object r12 = r3.poll()
                if (r12 != 0) goto L_0x0023
                r13 = 1
                goto L_0x0024
            L_0x0023:
                r13 = 0
            L_0x0024:
                boolean r11 = r1.mo40789a(r11, r13, r2, r3)
                if (r11 == 0) goto L_0x002b
                return
            L_0x002b:
                if (r13 != 0) goto L_0x0063
                long r13 = r1.f32635n
                long r13 = r13 + r6
                r15 = r5
                long r4 = r1.f32629h
                int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
                if (r0 != 0) goto L_0x003d
                r1.f32635n = r8
                r1.request(r13)
                goto L_0x003f
            L_0x003d:
                r1.f32635n = r13
            L_0x003f:
                rx.m.n<? super T, ? extends java.lang.Iterable<? extends R>> r0 = r1.f32628g     // Catch:{ all -> 0x005a }
                java.lang.Object r4 = p123rx.p401n.p402a.C12558h.m41018b(r12)     // Catch:{ all -> 0x005a }
                java.lang.Object r0 = r0.call(r4)     // Catch:{ all -> 0x005a }
                java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x005a }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x005a }
                boolean r4 = r0.hasNext()     // Catch:{ all -> 0x005a }
                if (r4 != 0) goto L_0x0057
                goto L_0x00cc
            L_0x0057:
                r1.f32636o = r0
                goto L_0x0064
            L_0x005a:
                r0 = move-exception
                p123rx.exceptions.C12472a.m40945c(r0)
                r1.onError(r0)
                goto L_0x00cc
            L_0x0063:
                r15 = r5
            L_0x0064:
                if (r0 == 0) goto L_0x00cf
                java.util.concurrent.atomic.AtomicLong r4 = r1.f32632k
                long r4 = r4.get()
                r12 = r8
            L_0x006d:
                r14 = 0
                int r16 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
                if (r16 == 0) goto L_0x00ab
                boolean r11 = r1.f32634m
                boolean r11 = r1.mo40789a(r11, r10, r2, r3)
                if (r11 == 0) goto L_0x007b
                return
            L_0x007b:
                java.lang.Object r11 = r0.next()     // Catch:{ all -> 0x00a0 }
                r2.onNext(r11)
                boolean r11 = r1.f32634m
                boolean r11 = r1.mo40789a(r11, r10, r2, r3)
                if (r11 == 0) goto L_0x008b
                return
            L_0x008b:
                long r12 = r12 + r6
                boolean r11 = r0.hasNext()     // Catch:{ all -> 0x0095 }
                if (r11 != 0) goto L_0x006d
                r1.f32636o = r14
                goto L_0x00aa
            L_0x0095:
                r0 = move-exception
                r6 = r0
                p123rx.exceptions.C12472a.m40945c(r6)
                r1.f32636o = r14
                r1.onError(r6)
                goto L_0x00aa
            L_0x00a0:
                r0 = move-exception
                r6 = r0
                p123rx.exceptions.C12472a.m40945c(r6)
                r1.f32636o = r14
                r1.onError(r6)
            L_0x00aa:
                r0 = r14
            L_0x00ab:
                int r6 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
                if (r6 != 0) goto L_0x00c1
                boolean r4 = r1.f32634m
                boolean r5 = r3.isEmpty()
                if (r5 == 0) goto L_0x00ba
                if (r0 != 0) goto L_0x00ba
                r10 = 1
            L_0x00ba:
                boolean r4 = r1.mo40789a(r4, r10, r2, r3)
                if (r4 == 0) goto L_0x00c1
                return
            L_0x00c1:
                int r4 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
                if (r4 == 0) goto L_0x00ca
                java.util.concurrent.atomic.AtomicLong r4 = r1.f32632k
                p123rx.p401n.p402a.C12502a.m40962b(r4, r12)
            L_0x00ca:
                if (r0 != 0) goto L_0x00cf
            L_0x00cc:
                r5 = r15
                goto L_0x0010
            L_0x00cf:
                java.util.concurrent.atomic.AtomicInteger r0 = r1.f32633l
                int r4 = -r15
                int r5 = r0.addAndGet(r4)
                if (r5 != 0) goto L_0x0010
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p123rx.p401n.p402a.C12637r.C12639b.mo40787a():void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo40789a(boolean z, boolean z2, C12475j<?> jVar, Queue<?> queue) {
            if (jVar.isUnsubscribed()) {
                queue.clear();
                this.f32636o = null;
                return true;
            } else if (!z) {
                return false;
            } else {
                if (this.f32631j.get() != null) {
                    Throwable a = C12761e.m41254a(this.f32631j);
                    unsubscribe();
                    queue.clear();
                    this.f32636o = null;
                    jVar.onError(a);
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    jVar.onCompleted();
                    return true;
                }
            }
        }
    }

    /* renamed from: a */
    public static <T, R> C5368e<R> m41112a(C5368e<? extends T> eVar, C5379n<? super T, ? extends Iterable<? extends R>> nVar, int i) {
        if (eVar instanceof C12775j) {
            return C5368e.m10253b(new C12640c(((C12775j) eVar).mo40900o(), nVar));
        }
        return C5368e.m10253b(new C12637r(eVar, nVar, i));
    }
}
