package p120q.p326a.p329d0.p334e.p339e;

import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p330a.C10868e;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.o3 */
/* compiled from: ObservableTake */
public final class C11205o3<T> extends C10980a<T, T> {

    /* renamed from: g */
    final long f29890g;

    /* renamed from: q.a.d0.e.e.o3$a */
    /* compiled from: ObservableTake */
    static final class C11206a<T> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super T> f29891f;

        /* renamed from: g */
        boolean f29892g;

        /* renamed from: h */
        C10842c f29893h;

        /* renamed from: i */
        long f29894i;

        C11206a(C11490u<? super T> uVar, long j) {
            this.f29891f = uVar;
            this.f29894i = j;
        }

        public void dispose() {
            this.f29893h.dispose();
        }

        public boolean isDisposed() {
            return this.f29893h.isDisposed();
        }

        public void onComplete() {
            if (!this.f29892g) {
                this.f29892g = true;
                this.f29893h.dispose();
                this.f29891f.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f29892g) {
                C11459a.m37531b(th);
                return;
            }
            this.f29892g = true;
            this.f29893h.dispose();
            this.f29891f.onError(th);
        }

        public void onNext(T t) {
            if (!this.f29892g) {
                long j = this.f29894i;
                long j2 = j - 1;
                this.f29894i = j2;
                if (j > 0) {
                    boolean z = j2 == 0;
                    this.f29891f.onNext(t);
                    if (z) {
                        onComplete();
                    }
                }
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29893h, cVar)) {
                this.f29893h = cVar;
                if (this.f29894i == 0) {
                    this.f29892g = true;
                    cVar.dispose();
                    C10868e.m36785a((C11490u<?>) this.f29891f);
                    return;
                }
                this.f29891f.onSubscribe(this);
            }
        }
    }

    public C11205o3(C11488s<T> sVar, long j) {
        super(sVar);
        this.f29890g = j;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super T> uVar) {
        this.f29150f.subscribe(new C11206a(uVar, this.f29890g));
    }
}
