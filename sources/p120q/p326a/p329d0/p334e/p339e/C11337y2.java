package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11482n;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p328c0.C10861o;
import p120q.p326a.p329d0.p330a.C10868e;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p332c.C10913b;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.y2 */
/* compiled from: ObservableScalarXMap */
public final class C11337y2 {

    /* renamed from: q.a.d0.e.e.y2$a */
    /* compiled from: ObservableScalarXMap */
    public static final class C11338a<T> extends AtomicInteger implements C10913b<T>, Runnable {

        /* renamed from: f */
        final C11490u<? super T> f30368f;

        /* renamed from: g */
        final T f30369g;

        public C11338a(C11490u<? super T> uVar, T t) {
            this.f30368f = uVar;
            this.f30369g = t;
        }

        /* renamed from: a */
        public int mo36665a(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        public void clear() {
            lazySet(3);
        }

        public void dispose() {
            set(3);
        }

        public boolean isDisposed() {
            return get() == 3;
        }

        public boolean isEmpty() {
            return get() != 1;
        }

        public boolean offer(T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        public T poll() throws Exception {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.f30369g;
        }

        public void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.f30368f.onNext(this.f30369g);
                if (get() == 2) {
                    lazySet(3);
                    this.f30368f.onComplete();
                }
            }
        }
    }

    /* renamed from: q.a.d0.e.e.y2$b */
    /* compiled from: ObservableScalarXMap */
    static final class C11339b<T, R> extends C11482n<R> {

        /* renamed from: f */
        final T f30370f;

        /* renamed from: g */
        final C10861o<? super T, ? extends C11488s<? extends R>> f30371g;

        C11339b(T t, C10861o<? super T, ? extends C11488s<? extends R>> oVar) {
            this.f30370f = t;
            this.f30371g = oVar;
        }

        public void subscribeActual(C11490u<? super R> uVar) {
            try {
                Object apply = this.f30371g.apply(this.f30370f);
                C10910b.m36861a(apply, "The mapper returned a null ObservableSource");
                C11488s sVar = (C11488s) apply;
                if (sVar instanceof Callable) {
                    try {
                        Object call = ((Callable) sVar).call();
                        if (call == null) {
                            C10868e.m36785a((C11490u<?>) uVar);
                            return;
                        }
                        C11338a aVar = new C11338a(uVar, call);
                        uVar.onSubscribe(aVar);
                        aVar.run();
                    } catch (Throwable th) {
                        C9034a.m29708a(th);
                        C10868e.m36781a(th, (C11490u<?>) uVar);
                    }
                } else {
                    sVar.subscribe(uVar);
                }
            } catch (Throwable th2) {
                C10868e.m36781a(th2, (C11490u<?>) uVar);
            }
        }
    }

    /* renamed from: a */
    public static <T, R> boolean m37296a(C11488s<T> sVar, C11490u<? super R> uVar, C10861o<? super T, ? extends C11488s<? extends R>> oVar) {
        if (!(sVar instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) sVar).call();
            if (call == null) {
                C10868e.m36785a((C11490u<?>) uVar);
                return true;
            }
            try {
                Object apply = oVar.apply(call);
                C10910b.m36861a(apply, "The mapper returned a null ObservableSource");
                C11488s sVar2 = (C11488s) apply;
                if (sVar2 instanceof Callable) {
                    try {
                        Object call2 = ((Callable) sVar2).call();
                        if (call2 == null) {
                            C10868e.m36785a((C11490u<?>) uVar);
                            return true;
                        }
                        C11338a aVar = new C11338a(uVar, call2);
                        uVar.onSubscribe(aVar);
                        aVar.run();
                    } catch (Throwable th) {
                        C9034a.m29708a(th);
                        C10868e.m36781a(th, (C11490u<?>) uVar);
                        return true;
                    }
                } else {
                    sVar2.subscribe(uVar);
                }
                return true;
            } catch (Throwable th2) {
                C9034a.m29708a(th2);
                C10868e.m36781a(th2, (C11490u<?>) uVar);
                return true;
            }
        } catch (Throwable th3) {
            C9034a.m29708a(th3);
            C10868e.m36781a(th3, (C11490u<?>) uVar);
            return true;
        }
    }

    /* renamed from: a */
    public static <T, U> C11482n<U> m37295a(T t, C10861o<? super T, ? extends C11488s<? extends U>> oVar) {
        return C11459a.m37519a(new C11339b(t, oVar));
    }
}
