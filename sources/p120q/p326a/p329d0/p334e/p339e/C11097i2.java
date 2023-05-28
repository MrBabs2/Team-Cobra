package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.atomic.AtomicReference;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11482n;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10861o;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p330a.C10868e;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p350i0.C11472a;

/* renamed from: q.a.d0.e.e.i2 */
/* compiled from: ObservablePublishSelector */
public final class C11097i2<T, R> extends C10980a<T, R> {

    /* renamed from: g */
    final C10861o<? super C11482n<T>, ? extends C11488s<R>> f29524g;

    /* renamed from: q.a.d0.e.e.i2$a */
    /* compiled from: ObservablePublishSelector */
    static final class C11098a<T, R> implements C11490u<T> {

        /* renamed from: f */
        final C11472a<T> f29525f;

        /* renamed from: g */
        final AtomicReference<C10842c> f29526g;

        C11098a(C11472a<T> aVar, AtomicReference<C10842c> atomicReference) {
            this.f29525f = aVar;
            this.f29526g = atomicReference;
        }

        public void onComplete() {
            this.f29525f.onComplete();
        }

        public void onError(Throwable th) {
            this.f29525f.onError(th);
        }

        public void onNext(T t) {
            this.f29525f.onNext(t);
        }

        public void onSubscribe(C10842c cVar) {
            C10867d.m36778c(this.f29526g, cVar);
        }
    }

    /* renamed from: q.a.d0.e.e.i2$b */
    /* compiled from: ObservablePublishSelector */
    static final class C11099b<T, R> extends AtomicReference<C10842c> implements C11490u<R>, C10842c {

        /* renamed from: f */
        final C11490u<? super R> f29527f;

        /* renamed from: g */
        C10842c f29528g;

        C11099b(C11490u<? super R> uVar) {
            this.f29527f = uVar;
        }

        public void dispose() {
            this.f29528g.dispose();
            C10867d.m36773a((AtomicReference<C10842c>) this);
        }

        public boolean isDisposed() {
            return this.f29528g.isDisposed();
        }

        public void onComplete() {
            C10867d.m36773a((AtomicReference<C10842c>) this);
            this.f29527f.onComplete();
        }

        public void onError(Throwable th) {
            C10867d.m36773a((AtomicReference<C10842c>) this);
            this.f29527f.onError(th);
        }

        public void onNext(R r) {
            this.f29527f.onNext(r);
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29528g, cVar)) {
                this.f29528g = cVar;
                this.f29527f.onSubscribe(this);
            }
        }
    }

    public C11097i2(C11488s<T> sVar, C10861o<? super C11482n<T>, ? extends C11488s<R>> oVar) {
        super(sVar);
        this.f29524g = oVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super R> uVar) {
        C11472a c = C11472a.m37553c();
        try {
            Object apply = this.f29524g.apply(c);
            C10910b.m36861a(apply, "The selector returned a null ObservableSource");
            C11488s sVar = (C11488s) apply;
            C11099b bVar = new C11099b(uVar);
            sVar.subscribe(bVar);
            this.f29150f.subscribe(new C11098a(c, bVar));
        } catch (Throwable th) {
            C9034a.m29708a(th);
            C10868e.m36781a(th, (C11490u<?>) uVar);
        }
    }
}
