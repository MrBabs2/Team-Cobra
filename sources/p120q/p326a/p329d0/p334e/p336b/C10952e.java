package p120q.p326a.p329d0.p334e.p336b;

import java.util.concurrent.atomic.AtomicLong;
import p036io.reactivex.exceptions.MissingBackpressureException;
import p120q.p326a.C11460h;
import p120q.p326a.C11471i;
import p120q.p326a.p329d0.p344i.C11424b;
import p120q.p326a.p329d0.p345j.C11429d;
import p120q.p326a.p348g0.C11459a;
import p415t.p416a.C12935b;
import p415t.p416a.C12936c;

/* renamed from: q.a.d0.e.b.e */
/* compiled from: FlowableOnBackpressureError */
public final class C10952e<T> extends C10945a<T, T> {

    /* renamed from: q.a.d0.e.b.e$a */
    /* compiled from: FlowableOnBackpressureError */
    static final class C10953a<T> extends AtomicLong implements C11471i<T>, C12936c {

        /* renamed from: f */
        final C12935b<? super T> f29048f;

        /* renamed from: g */
        C12936c f29049g;

        /* renamed from: h */
        boolean f29050h;

        C10953a(C12935b<? super T> bVar) {
            this.f29048f = bVar;
        }

        /* renamed from: a */
        public void mo36628a(C12936c cVar) {
            if (C11424b.m37440a(this.f29049g, cVar)) {
                this.f29049g = cVar;
                this.f29048f.mo36628a(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        public void cancel() {
            this.f29049g.cancel();
        }

        public void onComplete() {
            if (!this.f29050h) {
                this.f29050h = true;
                this.f29048f.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f29050h) {
                C11459a.m37531b(th);
                return;
            }
            this.f29050h = true;
            this.f29048f.onError(th);
        }

        public void onNext(T t) {
            if (!this.f29050h) {
                if (get() != 0) {
                    this.f29048f.onNext(t);
                    C11429d.m37452b(this, 1);
                    return;
                }
                onError(new MissingBackpressureException("could not emit value due to lack of requests"));
            }
        }

        public void request(long j) {
            if (C11424b.m37436a(j)) {
                C11429d.m37451a((AtomicLong) this, j);
            }
        }
    }

    public C10952e(C11460h<T> hVar) {
        super(hVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36741b(C12935b<? super T> bVar) {
        this.f29025g.mo37218a(new C10953a(bVar));
    }
}
