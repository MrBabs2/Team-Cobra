package p120q.p326a.p329d0.p334e.p339e;

import p120q.p326a.C11478j;
import p120q.p326a.C11479k;
import p120q.p326a.C11482n;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p332c.C10912a;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.q0 */
/* compiled from: ObservableElementAtMaybe */
public final class C11225q0<T> extends C11478j<T> implements C10912a<T> {

    /* renamed from: f */
    final C11488s<T> f29981f;

    /* renamed from: g */
    final long f29982g;

    /* renamed from: q.a.d0.e.e.q0$a */
    /* compiled from: ObservableElementAtMaybe */
    static final class C11226a<T> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11479k<? super T> f29983f;

        /* renamed from: g */
        final long f29984g;

        /* renamed from: h */
        C10842c f29985h;

        /* renamed from: i */
        long f29986i;

        /* renamed from: j */
        boolean f29987j;

        C11226a(C11479k<? super T> kVar, long j) {
            this.f29983f = kVar;
            this.f29984g = j;
        }

        public void dispose() {
            this.f29985h.dispose();
        }

        public boolean isDisposed() {
            return this.f29985h.isDisposed();
        }

        public void onComplete() {
            if (!this.f29987j) {
                this.f29987j = true;
                this.f29983f.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f29987j) {
                C11459a.m37531b(th);
                return;
            }
            this.f29987j = true;
            this.f29983f.onError(th);
        }

        public void onNext(T t) {
            if (!this.f29987j) {
                long j = this.f29986i;
                if (j == this.f29984g) {
                    this.f29987j = true;
                    this.f29985h.dispose();
                    this.f29983f.onSuccess(t);
                    return;
                }
                this.f29986i = j + 1;
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29985h, cVar)) {
                this.f29985h = cVar;
                this.f29983f.onSubscribe(this);
            }
        }
    }

    public C11225q0(C11488s<T> sVar, long j) {
        this.f29981f = sVar;
        this.f29982g = j;
    }

    /* renamed from: a */
    public C11482n<T> mo36701a() {
        return C11459a.m37519a(new C11214p0(this.f29981f, this.f29982g, null, false));
    }

    /* renamed from: b */
    public void mo36748b(C11479k<? super T> kVar) {
        this.f29981f.subscribe(new C11226a(kVar, this.f29982g));
    }
}
