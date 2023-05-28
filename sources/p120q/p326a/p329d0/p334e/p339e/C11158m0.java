package p120q.p326a.p329d0.p334e.p339e;

import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10847a;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p332c.C10913b;
import p120q.p326a.p329d0.p333d.C10920b;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.m0 */
/* compiled from: ObservableDoFinally */
public final class C11158m0<T> extends C10980a<T, T> {

    /* renamed from: g */
    final C10847a f29746g;

    public C11158m0(C11488s<T> sVar, C10847a aVar) {
        super(sVar);
        this.f29746g = aVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super T> uVar) {
        this.f29150f.subscribe(new C11159a(uVar, this.f29746g));
    }

    /* renamed from: q.a.d0.e.e.m0$a */
    /* compiled from: ObservableDoFinally */
    static final class C11159a<T> extends C10920b<T> implements C11490u<T> {

        /* renamed from: f */
        final C11490u<? super T> f29747f;

        /* renamed from: g */
        final C10847a f29748g;

        /* renamed from: h */
        C10842c f29749h;

        /* renamed from: i */
        C10913b<T> f29750i;

        /* renamed from: j */
        boolean f29751j;

        C11159a(C11490u<? super T> uVar, C10847a aVar) {
            this.f29747f = uVar;
            this.f29748g = aVar;
        }

        /* renamed from: a */
        public int mo36665a(int i) {
            C10913b<T> bVar = this.f29750i;
            boolean z = false;
            if (bVar == null || (i & 4) != 0) {
                return 0;
            }
            int a = bVar.mo36665a(i);
            if (a != 0) {
                if (a == 1) {
                    z = true;
                }
                this.f29751j = z;
            }
            return a;
        }

        public void clear() {
            this.f29750i.clear();
        }

        public void dispose() {
            this.f29749h.dispose();
            mo36916a();
        }

        public boolean isDisposed() {
            return this.f29749h.isDisposed();
        }

        public boolean isEmpty() {
            return this.f29750i.isEmpty();
        }

        public void onComplete() {
            this.f29747f.onComplete();
            mo36916a();
        }

        public void onError(Throwable th) {
            this.f29747f.onError(th);
            mo36916a();
        }

        public void onNext(T t) {
            this.f29747f.onNext(t);
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29749h, cVar)) {
                this.f29749h = cVar;
                if (cVar instanceof C10913b) {
                    this.f29750i = (C10913b) cVar;
                }
                this.f29747f.onSubscribe(this);
            }
        }

        public T poll() throws Exception {
            T poll = this.f29750i.poll();
            if (poll == null && this.f29751j) {
                mo36916a();
            }
            return poll;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36916a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f29748g.run();
                } catch (Throwable th) {
                    C9034a.m29708a(th);
                    C11459a.m37531b(th);
                }
            }
        }
    }
}
