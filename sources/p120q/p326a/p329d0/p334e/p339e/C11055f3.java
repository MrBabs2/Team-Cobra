package p120q.p326a.p329d0.p334e.p339e;

import java.util.NoSuchElementException;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.C11496w;
import p120q.p326a.C11498y;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.f3 */
/* compiled from: ObservableSingleSingle */
public final class C11055f3<T> extends C11496w<T> {

    /* renamed from: f */
    final C11488s<? extends T> f29379f;

    /* renamed from: g */
    final T f29380g;

    /* renamed from: q.a.d0.e.e.f3$a */
    /* compiled from: ObservableSingleSingle */
    static final class C11056a<T> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11498y<? super T> f29381f;

        /* renamed from: g */
        final T f29382g;

        /* renamed from: h */
        C10842c f29383h;

        /* renamed from: i */
        T f29384i;

        /* renamed from: j */
        boolean f29385j;

        C11056a(C11498y<? super T> yVar, T t) {
            this.f29381f = yVar;
            this.f29382g = t;
        }

        public void dispose() {
            this.f29383h.dispose();
        }

        public boolean isDisposed() {
            return this.f29383h.isDisposed();
        }

        public void onComplete() {
            if (!this.f29385j) {
                this.f29385j = true;
                T t = this.f29384i;
                this.f29384i = null;
                if (t == null) {
                    t = this.f29382g;
                }
                if (t != null) {
                    this.f29381f.onSuccess(t);
                } else {
                    this.f29381f.onError(new NoSuchElementException());
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f29385j) {
                C11459a.m37531b(th);
                return;
            }
            this.f29385j = true;
            this.f29381f.onError(th);
        }

        public void onNext(T t) {
            if (!this.f29385j) {
                if (this.f29384i != null) {
                    this.f29385j = true;
                    this.f29383h.dispose();
                    this.f29381f.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f29384i = t;
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29383h, cVar)) {
                this.f29383h = cVar;
                this.f29381f.onSubscribe(this);
            }
        }
    }

    public C11055f3(C11488s<? extends T> sVar, T t) {
        this.f29379f = sVar;
        this.f29380g = t;
    }

    /* renamed from: b */
    public void mo36633b(C11498y<? super T> yVar) {
        this.f29379f.subscribe(new C11056a(yVar, this.f29380g));
    }
}
