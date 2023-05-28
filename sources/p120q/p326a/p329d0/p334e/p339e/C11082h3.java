package p120q.p326a.p329d0.p334e.p339e;

import java.util.ArrayDeque;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;

/* renamed from: q.a.d0.e.e.h3 */
/* compiled from: ObservableSkipLast */
public final class C11082h3<T> extends C10980a<T, T> {

    /* renamed from: g */
    final int f29472g;

    /* renamed from: q.a.d0.e.e.h3$a */
    /* compiled from: ObservableSkipLast */
    static final class C11083a<T> extends ArrayDeque<T> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super T> f29473f;

        /* renamed from: g */
        final int f29474g;

        /* renamed from: h */
        C10842c f29475h;

        C11083a(C11490u<? super T> uVar, int i) {
            super(i);
            this.f29473f = uVar;
            this.f29474g = i;
        }

        public void dispose() {
            this.f29475h.dispose();
        }

        public boolean isDisposed() {
            return this.f29475h.isDisposed();
        }

        public void onComplete() {
            this.f29473f.onComplete();
        }

        public void onError(Throwable th) {
            this.f29473f.onError(th);
        }

        public void onNext(T t) {
            if (this.f29474g == size()) {
                this.f29473f.onNext(poll());
            }
            offer(t);
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29475h, cVar)) {
                this.f29475h = cVar;
                this.f29473f.onSubscribe(this);
            }
        }
    }

    public C11082h3(C11488s<T> sVar, int i) {
        super(sVar);
        this.f29472g = i;
    }

    public void subscribeActual(C11490u<? super T> uVar) {
        this.f29150f.subscribe(new C11083a(uVar, this.f29472g));
    }
}
