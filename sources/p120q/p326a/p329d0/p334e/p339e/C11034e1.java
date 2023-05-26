package p120q.p326a.p329d0.p334e.p339e;

import java.util.Iterator;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11482n;
import p120q.p326a.C11490u;
import p120q.p326a.p329d0.p330a.C10868e;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p333d.C10921c;

/* renamed from: q.a.d0.e.e.e1 */
/* compiled from: ObservableFromIterable */
public final class C11034e1<T> extends C11482n<T> {

    /* renamed from: f */
    final Iterable<? extends T> f29320f;

    public C11034e1(Iterable<? extends T> iterable) {
        this.f29320f = iterable;
    }

    public void subscribeActual(C11490u<? super T> uVar) {
        try {
            Iterator<? extends T> it = this.f29320f.iterator();
            try {
                if (!it.hasNext()) {
                    C10868e.m36785a((C11490u<?>) uVar);
                    return;
                }
                C11035a aVar = new C11035a(uVar, it);
                uVar.onSubscribe(aVar);
                if (!aVar.f29324i) {
                    aVar.mo36832a();
                }
            } catch (Throwable th) {
                C9034a.m29708a(th);
                C10868e.m36781a(th, (C11490u<?>) uVar);
            }
        } catch (Throwable th2) {
            C9034a.m29708a(th2);
            C10868e.m36781a(th2, (C11490u<?>) uVar);
        }
    }

    /* renamed from: q.a.d0.e.e.e1$a */
    /* compiled from: ObservableFromIterable */
    static final class C11035a<T> extends C10921c<T> {

        /* renamed from: f */
        final C11490u<? super T> f29321f;

        /* renamed from: g */
        final Iterator<? extends T> f29322g;

        /* renamed from: h */
        volatile boolean f29323h;

        /* renamed from: i */
        boolean f29324i;

        /* renamed from: j */
        boolean f29325j;

        /* renamed from: k */
        boolean f29326k;

        C11035a(C11490u<? super T> uVar, Iterator<? extends T> it) {
            this.f29321f = uVar;
            this.f29322g = it;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36832a() {
            while (!isDisposed()) {
                try {
                    Object next = this.f29322g.next();
                    C10910b.m36861a(next, "The iterator returned a null value");
                    this.f29321f.onNext(next);
                    if (!isDisposed()) {
                        try {
                            if (!this.f29322g.hasNext()) {
                                if (!isDisposed()) {
                                    this.f29321f.onComplete();
                                    return;
                                }
                                return;
                            }
                        } catch (Throwable th) {
                            C9034a.m29708a(th);
                            this.f29321f.onError(th);
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    C9034a.m29708a(th2);
                    this.f29321f.onError(th2);
                    return;
                }
            }
        }

        public void clear() {
            this.f29325j = true;
        }

        public void dispose() {
            this.f29323h = true;
        }

        public boolean isDisposed() {
            return this.f29323h;
        }

        public boolean isEmpty() {
            return this.f29325j;
        }

        public T poll() {
            if (this.f29325j) {
                return null;
            }
            if (!this.f29326k) {
                this.f29326k = true;
            } else if (!this.f29322g.hasNext()) {
                this.f29325j = true;
                return null;
            }
            T next = this.f29322g.next();
            C10910b.m36861a(next, "The iterator returned a null value");
            return next;
        }

        /* renamed from: a */
        public int mo36665a(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f29324i = true;
            return 1;
        }
    }
}
