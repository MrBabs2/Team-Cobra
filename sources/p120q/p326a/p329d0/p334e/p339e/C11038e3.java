package p120q.p326a.p329d0.p334e.p339e;

import p120q.p326a.C11478j;
import p120q.p326a.C11479k;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.e3 */
/* compiled from: ObservableSingleMaybe */
public final class C11038e3<T> extends C11478j<T> {

    /* renamed from: f */
    final C11488s<T> f29331f;

    /* renamed from: q.a.d0.e.e.e3$a */
    /* compiled from: ObservableSingleMaybe */
    static final class C11039a<T> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11479k<? super T> f29332f;

        /* renamed from: g */
        C10842c f29333g;

        /* renamed from: h */
        T f29334h;

        /* renamed from: i */
        boolean f29335i;

        C11039a(C11479k<? super T> kVar) {
            this.f29332f = kVar;
        }

        public void dispose() {
            this.f29333g.dispose();
        }

        public boolean isDisposed() {
            return this.f29333g.isDisposed();
        }

        public void onComplete() {
            if (!this.f29335i) {
                this.f29335i = true;
                T t = this.f29334h;
                this.f29334h = null;
                if (t == null) {
                    this.f29332f.onComplete();
                } else {
                    this.f29332f.onSuccess(t);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f29335i) {
                C11459a.m37531b(th);
                return;
            }
            this.f29335i = true;
            this.f29332f.onError(th);
        }

        public void onNext(T t) {
            if (!this.f29335i) {
                if (this.f29334h != null) {
                    this.f29335i = true;
                    this.f29333g.dispose();
                    this.f29332f.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f29334h = t;
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29333g, cVar)) {
                this.f29333g = cVar;
                this.f29332f.onSubscribe(this);
            }
        }
    }

    public C11038e3(C11488s<T> sVar) {
        this.f29331f = sVar;
    }

    /* renamed from: b */
    public void mo36748b(C11479k<? super T> kVar) {
        this.f29331f.subscribe(new C11039a(kVar));
    }
}
