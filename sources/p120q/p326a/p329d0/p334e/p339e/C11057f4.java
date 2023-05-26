package p120q.p326a.p329d0.p334e.p339e;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p120q.p326a.C11482n;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p350i0.C11476d;

/* renamed from: q.a.d0.e.e.f4 */
/* compiled from: ObservableWindow */
public final class C11057f4<T> extends C10980a<T, C11482n<T>> {

    /* renamed from: g */
    final long f29386g;

    /* renamed from: h */
    final long f29387h;

    /* renamed from: i */
    final int f29388i;

    /* renamed from: q.a.d0.e.e.f4$a */
    /* compiled from: ObservableWindow */
    static final class C11058a<T> extends AtomicInteger implements C11490u<T>, C10842c, Runnable {

        /* renamed from: f */
        final C11490u<? super C11482n<T>> f29389f;

        /* renamed from: g */
        final long f29390g;

        /* renamed from: h */
        final int f29391h;

        /* renamed from: i */
        long f29392i;

        /* renamed from: j */
        C10842c f29393j;

        /* renamed from: k */
        C11476d<T> f29394k;

        /* renamed from: l */
        volatile boolean f29395l;

        C11058a(C11490u<? super C11482n<T>> uVar, long j, int i) {
            this.f29389f = uVar;
            this.f29390g = j;
            this.f29391h = i;
        }

        public void dispose() {
            this.f29395l = true;
        }

        public boolean isDisposed() {
            return this.f29395l;
        }

        public void onComplete() {
            C11476d<T> dVar = this.f29394k;
            if (dVar != null) {
                this.f29394k = null;
                dVar.onComplete();
            }
            this.f29389f.onComplete();
        }

        public void onError(Throwable th) {
            C11476d<T> dVar = this.f29394k;
            if (dVar != null) {
                this.f29394k = null;
                dVar.onError(th);
            }
            this.f29389f.onError(th);
        }

        public void onNext(T t) {
            C11476d<T> dVar = this.f29394k;
            if (dVar == null && !this.f29395l) {
                dVar = C11476d.m37563a(this.f29391h, (Runnable) this);
                this.f29394k = dVar;
                this.f29389f.onNext(dVar);
            }
            if (dVar != null) {
                dVar.onNext(t);
                long j = this.f29392i + 1;
                this.f29392i = j;
                if (j >= this.f29390g) {
                    this.f29392i = 0;
                    this.f29394k = null;
                    dVar.onComplete();
                    if (this.f29395l) {
                        this.f29393j.dispose();
                    }
                }
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29393j, cVar)) {
                this.f29393j = cVar;
                this.f29389f.onSubscribe(this);
            }
        }

        public void run() {
            if (this.f29395l) {
                this.f29393j.dispose();
            }
        }
    }

    /* renamed from: q.a.d0.e.e.f4$b */
    /* compiled from: ObservableWindow */
    static final class C11059b<T> extends AtomicBoolean implements C11490u<T>, C10842c, Runnable {

        /* renamed from: f */
        final C11490u<? super C11482n<T>> f29396f;

        /* renamed from: g */
        final long f29397g;

        /* renamed from: h */
        final long f29398h;

        /* renamed from: i */
        final int f29399i;

        /* renamed from: j */
        final ArrayDeque<C11476d<T>> f29400j;

        /* renamed from: k */
        long f29401k;

        /* renamed from: l */
        volatile boolean f29402l;

        /* renamed from: m */
        long f29403m;

        /* renamed from: n */
        C10842c f29404n;

        /* renamed from: o */
        final AtomicInteger f29405o = new AtomicInteger();

        C11059b(C11490u<? super C11482n<T>> uVar, long j, long j2, int i) {
            this.f29396f = uVar;
            this.f29397g = j;
            this.f29398h = j2;
            this.f29399i = i;
            this.f29400j = new ArrayDeque<>();
        }

        public void dispose() {
            this.f29402l = true;
        }

        public boolean isDisposed() {
            return this.f29402l;
        }

        public void onComplete() {
            ArrayDeque<C11476d<T>> arrayDeque = this.f29400j;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onComplete();
            }
            this.f29396f.onComplete();
        }

        public void onError(Throwable th) {
            ArrayDeque<C11476d<T>> arrayDeque = this.f29400j;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onError(th);
            }
            this.f29396f.onError(th);
        }

        public void onNext(T t) {
            ArrayDeque<C11476d<T>> arrayDeque = this.f29400j;
            long j = this.f29401k;
            long j2 = this.f29398h;
            if (j % j2 == 0 && !this.f29402l) {
                this.f29405o.getAndIncrement();
                C11476d a = C11476d.m37563a(this.f29399i, (Runnable) this);
                arrayDeque.offer(a);
                this.f29396f.onNext(a);
            }
            long j3 = this.f29403m + 1;
            Iterator<C11476d<T>> it = arrayDeque.iterator();
            while (it.hasNext()) {
                it.next().onNext(t);
            }
            if (j3 >= this.f29397g) {
                arrayDeque.poll().onComplete();
                if (!arrayDeque.isEmpty() || !this.f29402l) {
                    this.f29403m = j3 - j2;
                } else {
                    this.f29404n.dispose();
                    return;
                }
            } else {
                this.f29403m = j3;
            }
            this.f29401k = j + 1;
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29404n, cVar)) {
                this.f29404n = cVar;
                this.f29396f.onSubscribe(this);
            }
        }

        public void run() {
            if (this.f29405o.decrementAndGet() == 0 && this.f29402l) {
                this.f29404n.dispose();
            }
        }
    }

    public C11057f4(C11488s<T> sVar, long j, long j2, int i) {
        super(sVar);
        this.f29386g = j;
        this.f29387h = j2;
        this.f29388i = i;
    }

    public void subscribeActual(C11490u<? super C11482n<T>> uVar) {
        if (this.f29386g == this.f29387h) {
            this.f29150f.subscribe(new C11058a(uVar, this.f29386g, this.f29388i));
            return;
        }
        this.f29150f.subscribe(new C11059b(uVar, this.f29386g, this.f29387h, this.f29388i));
    }
}
