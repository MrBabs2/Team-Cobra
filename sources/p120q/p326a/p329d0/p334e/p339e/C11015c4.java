package p120q.p326a.p329d0.p334e.p339e;

import java.util.Collection;
import java.util.concurrent.Callable;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11482n;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.C11496w;
import p120q.p326a.C11498y;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p330a.C10868e;
import p120q.p326a.p329d0.p331b.C10872a;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p332c.C10912a;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.c4 */
/* compiled from: ObservableToListSingle */
public final class C11015c4<T, U extends Collection<? super T>> extends C11496w<U> implements C10912a<U> {

    /* renamed from: f */
    final C11488s<T> f29268f;

    /* renamed from: g */
    final Callable<U> f29269g;

    /* renamed from: q.a.d0.e.e.c4$a */
    /* compiled from: ObservableToListSingle */
    static final class C11016a<T, U extends Collection<? super T>> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11498y<? super U> f29270f;

        /* renamed from: g */
        U f29271g;

        /* renamed from: h */
        C10842c f29272h;

        C11016a(C11498y<? super U> yVar, U u) {
            this.f29270f = yVar;
            this.f29271g = u;
        }

        public void dispose() {
            this.f29272h.dispose();
        }

        public boolean isDisposed() {
            return this.f29272h.isDisposed();
        }

        public void onComplete() {
            U u = this.f29271g;
            this.f29271g = null;
            this.f29270f.onSuccess(u);
        }

        public void onError(Throwable th) {
            this.f29271g = null;
            this.f29270f.onError(th);
        }

        public void onNext(T t) {
            this.f29271g.add(t);
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29272h, cVar)) {
                this.f29272h = cVar;
                this.f29270f.onSubscribe(this);
            }
        }
    }

    public C11015c4(C11488s<T> sVar, int i) {
        this.f29268f = sVar;
        this.f29269g = C10872a.m36794a(i);
    }

    /* renamed from: a */
    public C11482n<U> mo36701a() {
        return C11459a.m37519a(new C11002b4(this.f29268f, this.f29269g));
    }

    /* renamed from: b */
    public void mo36633b(C11498y<? super U> yVar) {
        try {
            U call = this.f29269g.call();
            C10910b.m36861a(call, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.f29268f.subscribe(new C11016a(yVar, (Collection) call));
        } catch (Throwable th) {
            C9034a.m29708a(th);
            C10868e.m36782a(th, (C11498y<?>) yVar);
        }
    }

    public C11015c4(C11488s<T> sVar, Callable<U> callable) {
        this.f29268f = sVar;
        this.f29269g = callable;
    }
}
