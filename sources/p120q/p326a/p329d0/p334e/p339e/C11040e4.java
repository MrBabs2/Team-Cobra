package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import p036io.reactivex.exceptions.C9034a;
import p036io.reactivex.exceptions.CompositeException;
import p120q.p326a.C11482n;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10853g;
import p120q.p326a.p328c0.C10861o;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p330a.C10868e;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.e4 */
/* compiled from: ObservableUsing */
public final class C11040e4<T, D> extends C11482n<T> {

    /* renamed from: f */
    final Callable<? extends D> f29336f;

    /* renamed from: g */
    final C10861o<? super D, ? extends C11488s<? extends T>> f29337g;

    /* renamed from: h */
    final C10853g<? super D> f29338h;

    /* renamed from: i */
    final boolean f29339i;

    /* renamed from: q.a.d0.e.e.e4$a */
    /* compiled from: ObservableUsing */
    static final class C11041a<T, D> extends AtomicBoolean implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super T> f29340f;

        /* renamed from: g */
        final D f29341g;

        /* renamed from: h */
        final C10853g<? super D> f29342h;

        /* renamed from: i */
        final boolean f29343i;

        /* renamed from: j */
        C10842c f29344j;

        C11041a(C11490u<? super T> uVar, D d, C10853g<? super D> gVar, boolean z) {
            this.f29340f = uVar;
            this.f29341g = d;
            this.f29342h = gVar;
            this.f29343i = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36833a() {
            if (compareAndSet(false, true)) {
                try {
                    this.f29342h.mo8098a(this.f29341g);
                } catch (Throwable th) {
                    C9034a.m29708a(th);
                    C11459a.m37531b(th);
                }
            }
        }

        public void dispose() {
            mo36833a();
            this.f29344j.dispose();
        }

        public boolean isDisposed() {
            return get();
        }

        public void onComplete() {
            if (this.f29343i) {
                if (compareAndSet(false, true)) {
                    try {
                        this.f29342h.mo8098a(this.f29341g);
                    } catch (Throwable th) {
                        C9034a.m29708a(th);
                        this.f29340f.onError(th);
                        return;
                    }
                }
                this.f29344j.dispose();
                this.f29340f.onComplete();
                return;
            }
            this.f29340f.onComplete();
            this.f29344j.dispose();
            mo36833a();
        }

        public void onError(Throwable th) {
            if (this.f29343i) {
                if (compareAndSet(false, true)) {
                    try {
                        this.f29342h.mo8098a(this.f29341g);
                    } catch (Throwable th2) {
                        C9034a.m29708a(th2);
                        th = new CompositeException(th, th2);
                    }
                }
                this.f29344j.dispose();
                this.f29340f.onError(th);
                return;
            }
            this.f29340f.onError(th);
            this.f29344j.dispose();
            mo36833a();
        }

        public void onNext(T t) {
            this.f29340f.onNext(t);
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29344j, cVar)) {
                this.f29344j = cVar;
                this.f29340f.onSubscribe(this);
            }
        }
    }

    public C11040e4(Callable<? extends D> callable, C10861o<? super D, ? extends C11488s<? extends T>> oVar, C10853g<? super D> gVar, boolean z) {
        this.f29336f = callable;
        this.f29337g = oVar;
        this.f29338h = gVar;
        this.f29339i = z;
    }

    public void subscribeActual(C11490u<? super T> uVar) {
        try {
            Object call = this.f29336f.call();
            try {
                Object apply = this.f29337g.apply(call);
                C10910b.m36861a(apply, "The sourceSupplier returned a null ObservableSource");
                ((C11488s) apply).subscribe(new C11041a(uVar, call, this.f29338h, this.f29339i));
            } catch (Throwable th) {
                C9034a.m29708a(th);
                C10868e.m36781a((Throwable) new CompositeException(th, th), (C11490u<?>) uVar);
            }
        } catch (Throwable th2) {
            C9034a.m29708a(th2);
            C10868e.m36781a(th2, (C11490u<?>) uVar);
        }
    }
}
