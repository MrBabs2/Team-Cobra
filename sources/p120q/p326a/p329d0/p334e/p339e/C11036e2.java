package p120q.p326a.p329d0.p334e.p339e;

import p036io.reactivex.exceptions.C9034a;
import p036io.reactivex.exceptions.CompositeException;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10861o;
import p120q.p326a.p329d0.p330a.C10867d;

/* renamed from: q.a.d0.e.e.e2 */
/* compiled from: ObservableOnErrorReturn */
public final class C11036e2<T> extends C10980a<T, T> {

    /* renamed from: g */
    final C10861o<? super Throwable, ? extends T> f29327g;

    /* renamed from: q.a.d0.e.e.e2$a */
    /* compiled from: ObservableOnErrorReturn */
    static final class C11037a<T> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super T> f29328f;

        /* renamed from: g */
        final C10861o<? super Throwable, ? extends T> f29329g;

        /* renamed from: h */
        C10842c f29330h;

        C11037a(C11490u<? super T> uVar, C10861o<? super Throwable, ? extends T> oVar) {
            this.f29328f = uVar;
            this.f29329g = oVar;
        }

        public void dispose() {
            this.f29330h.dispose();
        }

        public boolean isDisposed() {
            return this.f29330h.isDisposed();
        }

        public void onComplete() {
            this.f29328f.onComplete();
        }

        public void onError(Throwable th) {
            try {
                Object apply = this.f29329g.apply(th);
                if (apply == null) {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th);
                    this.f29328f.onError(nullPointerException);
                    return;
                }
                this.f29328f.onNext(apply);
                this.f29328f.onComplete();
            } catch (Throwable th2) {
                C9034a.m29708a(th2);
                this.f29328f.onError(new CompositeException(th, th2));
            }
        }

        public void onNext(T t) {
            this.f29328f.onNext(t);
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29330h, cVar)) {
                this.f29330h = cVar;
                this.f29328f.onSubscribe(this);
            }
        }
    }

    public C11036e2(C11488s<T> sVar, C10861o<? super Throwable, ? extends T> oVar) {
        super(sVar);
        this.f29327g = oVar;
    }

    public void subscribeActual(C11490u<? super T> uVar) {
        this.f29150f.subscribe(new C11037a(uVar, this.f29327g));
    }
}
