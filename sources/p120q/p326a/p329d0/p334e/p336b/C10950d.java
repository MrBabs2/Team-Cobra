package p120q.p326a.p329d0.p334e.p336b;

import java.util.concurrent.atomic.AtomicLong;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11460h;
import p120q.p326a.C11471i;
import p120q.p326a.p328c0.C10853g;
import p120q.p326a.p329d0.p344i.C11424b;
import p120q.p326a.p329d0.p345j.C11429d;
import p120q.p326a.p348g0.C11459a;
import p415t.p416a.C12935b;
import p415t.p416a.C12936c;

/* renamed from: q.a.d0.e.b.d */
/* compiled from: FlowableOnBackpressureDrop */
public final class C10950d<T> extends C10945a<T, T> implements C10853g<T> {

    /* renamed from: h */
    final C10853g<? super T> f29043h = this;

    /* renamed from: q.a.d0.e.b.d$a */
    /* compiled from: FlowableOnBackpressureDrop */
    static final class C10951a<T> extends AtomicLong implements C11471i<T>, C12936c {

        /* renamed from: f */
        final C12935b<? super T> f29044f;

        /* renamed from: g */
        final C10853g<? super T> f29045g;

        /* renamed from: h */
        C12936c f29046h;

        /* renamed from: i */
        boolean f29047i;

        C10951a(C12935b<? super T> bVar, C10853g<? super T> gVar) {
            this.f29044f = bVar;
            this.f29045g = gVar;
        }

        /* renamed from: a */
        public void mo36628a(C12936c cVar) {
            if (C11424b.m37440a(this.f29046h, cVar)) {
                this.f29046h = cVar;
                this.f29044f.mo36628a(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        public void cancel() {
            this.f29046h.cancel();
        }

        public void onComplete() {
            if (!this.f29047i) {
                this.f29047i = true;
                this.f29044f.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f29047i) {
                C11459a.m37531b(th);
                return;
            }
            this.f29047i = true;
            this.f29044f.onError(th);
        }

        public void onNext(T t) {
            if (!this.f29047i) {
                if (get() != 0) {
                    this.f29044f.onNext(t);
                    C11429d.m37452b(this, 1);
                    return;
                }
                try {
                    this.f29045g.mo8098a(t);
                } catch (Throwable th) {
                    C9034a.m29708a(th);
                    cancel();
                    onError(th);
                }
            }
        }

        public void request(long j) {
            if (C11424b.m37436a(j)) {
                C11429d.m37451a((AtomicLong) this, j);
            }
        }
    }

    public C10950d(C11460h<T> hVar) {
        super(hVar);
    }

    /* renamed from: a */
    public void mo8098a(T t) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36741b(C12935b<? super T> bVar) {
        this.f29025g.mo37218a(new C10951a(bVar, this.f29043h));
    }
}
