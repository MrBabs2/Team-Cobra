package p123rx.p401n.p402a;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import p123rx.C12473g;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.C5373h;
import p123rx.exceptions.MissingBackpressureException;
import p123rx.p126m.C5377a;
import p123rx.p401n.p404c.C12727f;
import p123rx.p401n.p404c.C12750n;
import p123rx.p401n.p406e.C12772h;
import p123rx.p401n.p406e.p407n.C12799e;
import p123rx.p401n.p406e.p408o.C12821s;
import p123rx.p401n.p406e.p408o.C12828z;
import p123rx.p411q.C12844c;

/* renamed from: rx.n.a.r0 */
/* compiled from: OperatorObserveOn */
public final class C12641r0<T> implements C5368e.C5371b<T, T> {

    /* renamed from: f */
    private final C5373h f32639f;

    /* renamed from: g */
    private final boolean f32640g;

    /* renamed from: h */
    private final int f32641h;

    public C12641r0(C5373h hVar, boolean z, int i) {
        this.f32639f = hVar;
        this.f32640g = z;
        this.f32641h = i <= 0 ? C12772h.f32957h : i;
    }

    /* renamed from: a */
    public C12475j<? super T> call(C12475j<? super T> jVar) {
        C5373h hVar = this.f32639f;
        if ((hVar instanceof C12727f) || (hVar instanceof C12750n)) {
            return jVar;
        }
        C12642a aVar = new C12642a(hVar, jVar, this.f32640g, this.f32641h);
        aVar.mo40792a();
        return aVar;
    }

    /* renamed from: rx.n.a.r0$a */
    /* compiled from: OperatorObserveOn */
    static final class C12642a<T> extends C12475j<T> implements C5377a {

        /* renamed from: f */
        final C12475j<? super T> f32642f;

        /* renamed from: g */
        final C5373h.C5374a f32643g;

        /* renamed from: h */
        final boolean f32644h;

        /* renamed from: i */
        final Queue<Object> f32645i;

        /* renamed from: j */
        final int f32646j;

        /* renamed from: k */
        volatile boolean f32647k;

        /* renamed from: l */
        final AtomicLong f32648l = new AtomicLong();

        /* renamed from: m */
        final AtomicLong f32649m = new AtomicLong();

        /* renamed from: n */
        Throwable f32650n;

        /* renamed from: o */
        long f32651o;

        /* renamed from: rx.n.a.r0$a$a */
        /* compiled from: OperatorObserveOn */
        class C12643a implements C12473g {
            C12643a() {
            }

            public void request(long j) {
                if (j > 0) {
                    C12502a.m40960a(C12642a.this.f32648l, j);
                    C12642a.this.mo40794b();
                }
            }
        }

        public C12642a(C5373h hVar, C12475j<? super T> jVar, boolean z, int i) {
            this.f32642f = jVar;
            this.f32643g = hVar.createWorker();
            this.f32644h = z;
            i = i <= 0 ? C12772h.f32957h : i;
            this.f32646j = i - (i >> 2);
            if (C12828z.m41379a()) {
                this.f32645i = new C12821s(i);
            } else {
                this.f32645i = new C12799e(i);
            }
            request((long) i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40792a() {
            C12475j<? super T> jVar = this.f32642f;
            jVar.setProducer(new C12643a());
            jVar.add(this.f32643g);
            jVar.add(this);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo40794b() {
            if (this.f32649m.getAndIncrement() == 0) {
                this.f32643g.mo18710a(this);
            }
        }

        public void call() {
            long j = this.f32651o;
            Queue<Object> queue = this.f32645i;
            C12475j<? super T> jVar = this.f32642f;
            long j2 = 1;
            do {
                long j3 = this.f32648l.get();
                while (j3 != j) {
                    boolean z = this.f32647k;
                    Object poll = queue.poll();
                    boolean z2 = poll == null;
                    if (!mo40793a(z, z2, jVar, queue)) {
                        if (z2) {
                            break;
                        }
                        jVar.onNext(C12558h.m41018b(poll));
                        j++;
                        if (j == ((long) this.f32646j)) {
                            j3 = C12502a.m40962b(this.f32648l, j);
                            request(j);
                            j = 0;
                        }
                    } else {
                        return;
                    }
                }
                if (j3 != j || !mo40793a(this.f32647k, queue.isEmpty(), jVar, queue)) {
                    this.f32651o = j;
                    j2 = this.f32649m.addAndGet(-j2);
                } else {
                    return;
                }
            } while (j2 != 0);
        }

        public void onCompleted() {
            if (!isUnsubscribed() && !this.f32647k) {
                this.f32647k = true;
                mo40794b();
            }
        }

        public void onError(Throwable th) {
            if (isUnsubscribed() || this.f32647k) {
                C12844c.m41417b(th);
                return;
            }
            this.f32650n = th;
            this.f32647k = true;
            mo40794b();
        }

        public void onNext(T t) {
            if (!isUnsubscribed() && !this.f32647k) {
                if (!this.f32645i.offer(C12558h.m41020d(t))) {
                    onError(new MissingBackpressureException());
                } else {
                    mo40794b();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo40793a(boolean z, boolean z2, C12475j<? super T> jVar, Queue<Object> queue) {
            if (jVar.isUnsubscribed()) {
                queue.clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!this.f32644h) {
                    Throwable th = this.f32650n;
                    if (th != null) {
                        queue.clear();
                        try {
                            jVar.onError(th);
                            return true;
                        } finally {
                            this.f32643g.unsubscribe();
                        }
                    } else if (!z2) {
                        return false;
                    } else {
                        try {
                            jVar.onCompleted();
                            return true;
                        } finally {
                            this.f32643g.unsubscribe();
                        }
                    }
                } else if (!z2) {
                    return false;
                } else {
                    Throwable th2 = this.f32650n;
                    if (th2 != null) {
                        try {
                            jVar.onError(th2);
                        } catch (Throwable th3) {
                            this.f32643g.unsubscribe();
                            throw th3;
                        }
                    } else {
                        jVar.onCompleted();
                    }
                    this.f32643g.unsubscribe();
                    return false;
                }
            }
        }
    }
}
