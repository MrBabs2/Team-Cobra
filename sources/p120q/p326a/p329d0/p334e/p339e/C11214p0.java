package p120q.p326a.p329d0.p334e.p339e;

import java.util.NoSuchElementException;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.p0 */
/* compiled from: ObservableElementAt */
public final class C11214p0<T> extends C10980a<T, T> {

    /* renamed from: g */
    final long f29933g;

    /* renamed from: h */
    final T f29934h;

    /* renamed from: i */
    final boolean f29935i;

    /* renamed from: q.a.d0.e.e.p0$a */
    /* compiled from: ObservableElementAt */
    static final class C11215a<T> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super T> f29936f;

        /* renamed from: g */
        final long f29937g;

        /* renamed from: h */
        final T f29938h;

        /* renamed from: i */
        final boolean f29939i;

        /* renamed from: j */
        C10842c f29940j;

        /* renamed from: k */
        long f29941k;

        /* renamed from: l */
        boolean f29942l;

        C11215a(C11490u<? super T> uVar, long j, T t, boolean z) {
            this.f29936f = uVar;
            this.f29937g = j;
            this.f29938h = t;
            this.f29939i = z;
        }

        public void dispose() {
            this.f29940j.dispose();
        }

        public boolean isDisposed() {
            return this.f29940j.isDisposed();
        }

        public void onComplete() {
            if (!this.f29942l) {
                this.f29942l = true;
                T t = this.f29938h;
                if (t != null || !this.f29939i) {
                    if (t != null) {
                        this.f29936f.onNext(t);
                    }
                    this.f29936f.onComplete();
                    return;
                }
                this.f29936f.onError(new NoSuchElementException());
            }
        }

        public void onError(Throwable th) {
            if (this.f29942l) {
                C11459a.m37531b(th);
                return;
            }
            this.f29942l = true;
            this.f29936f.onError(th);
        }

        public void onNext(T t) {
            if (!this.f29942l) {
                long j = this.f29941k;
                if (j == this.f29937g) {
                    this.f29942l = true;
                    this.f29940j.dispose();
                    this.f29936f.onNext(t);
                    this.f29936f.onComplete();
                    return;
                }
                this.f29941k = j + 1;
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29940j, cVar)) {
                this.f29940j = cVar;
                this.f29936f.onSubscribe(this);
            }
        }
    }

    public C11214p0(C11488s<T> sVar, long j, T t, boolean z) {
        super(sVar);
        this.f29933g = j;
        this.f29934h = t;
        this.f29935i = z;
    }

    public void subscribeActual(C11490u<? super T> uVar) {
        this.f29150f.subscribe(new C11215a(uVar, this.f29933g, this.f29934h, this.f29935i));
    }
}
