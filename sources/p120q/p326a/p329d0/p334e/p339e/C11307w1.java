package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.Callable;
import p036io.reactivex.exceptions.C9034a;
import p036io.reactivex.exceptions.CompositeException;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10861o;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p331b.C10910b;

/* renamed from: q.a.d0.e.e.w1 */
/* compiled from: ObservableMapNotification */
public final class C11307w1<T, R> extends C10980a<T, C11488s<? extends R>> {

    /* renamed from: g */
    final C10861o<? super T, ? extends C11488s<? extends R>> f30276g;

    /* renamed from: h */
    final C10861o<? super Throwable, ? extends C11488s<? extends R>> f30277h;

    /* renamed from: i */
    final Callable<? extends C11488s<? extends R>> f30278i;

    /* renamed from: q.a.d0.e.e.w1$a */
    /* compiled from: ObservableMapNotification */
    static final class C11308a<T, R> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super C11488s<? extends R>> f30279f;

        /* renamed from: g */
        final C10861o<? super T, ? extends C11488s<? extends R>> f30280g;

        /* renamed from: h */
        final C10861o<? super Throwable, ? extends C11488s<? extends R>> f30281h;

        /* renamed from: i */
        final Callable<? extends C11488s<? extends R>> f30282i;

        /* renamed from: j */
        C10842c f30283j;

        C11308a(C11490u<? super C11488s<? extends R>> uVar, C10861o<? super T, ? extends C11488s<? extends R>> oVar, C10861o<? super Throwable, ? extends C11488s<? extends R>> oVar2, Callable<? extends C11488s<? extends R>> callable) {
            this.f30279f = uVar;
            this.f30280g = oVar;
            this.f30281h = oVar2;
            this.f30282i = callable;
        }

        public void dispose() {
            this.f30283j.dispose();
        }

        public boolean isDisposed() {
            return this.f30283j.isDisposed();
        }

        public void onComplete() {
            try {
                Object call = this.f30282i.call();
                C10910b.m36861a(call, "The onComplete ObservableSource returned is null");
                this.f30279f.onNext((C11488s) call);
                this.f30279f.onComplete();
            } catch (Throwable th) {
                C9034a.m29708a(th);
                this.f30279f.onError(th);
            }
        }

        public void onError(Throwable th) {
            try {
                Object apply = this.f30281h.apply(th);
                C10910b.m36861a(apply, "The onError ObservableSource returned is null");
                this.f30279f.onNext((C11488s) apply);
                this.f30279f.onComplete();
            } catch (Throwable th2) {
                C9034a.m29708a(th2);
                this.f30279f.onError(new CompositeException(th, th2));
            }
        }

        public void onNext(T t) {
            try {
                Object apply = this.f30280g.apply(t);
                C10910b.m36861a(apply, "The onNext ObservableSource returned is null");
                this.f30279f.onNext((C11488s) apply);
            } catch (Throwable th) {
                C9034a.m29708a(th);
                this.f30279f.onError(th);
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f30283j, cVar)) {
                this.f30283j = cVar;
                this.f30279f.onSubscribe(this);
            }
        }
    }

    public C11307w1(C11488s<T> sVar, C10861o<? super T, ? extends C11488s<? extends R>> oVar, C10861o<? super Throwable, ? extends C11488s<? extends R>> oVar2, Callable<? extends C11488s<? extends R>> callable) {
        super(sVar);
        this.f30276g = oVar;
        this.f30277h = oVar2;
        this.f30278i = callable;
    }

    public void subscribeActual(C11490u<? super C11488s<? extends R>> uVar) {
        this.f29150f.subscribe(new C11308a(uVar, this.f30276g, this.f30277h, this.f30278i));
    }
}
