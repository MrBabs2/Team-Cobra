package p123rx.p401n.p402a;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.C5372f;
import p123rx.C5373h;
import p123rx.exceptions.C12472a;
import p123rx.p126m.C5377a;
import p123rx.p410p.C12838e;

/* renamed from: rx.n.a.v0 */
/* compiled from: OperatorSampleWithTime */
public final class C12672v0<T> implements C5368e.C5371b<T, T> {

    /* renamed from: f */
    final long f32721f;

    /* renamed from: g */
    final TimeUnit f32722g;

    /* renamed from: h */
    final C5373h f32723h;

    /* renamed from: rx.n.a.v0$a */
    /* compiled from: OperatorSampleWithTime */
    static final class C12673a<T> extends C12475j<T> implements C5377a {

        /* renamed from: h */
        private static final Object f32724h = new Object();

        /* renamed from: f */
        private final C12475j<? super T> f32725f;

        /* renamed from: g */
        final AtomicReference<Object> f32726g = new AtomicReference<>(f32724h);

        public C12673a(C12475j<? super T> jVar) {
            this.f32725f = jVar;
        }

        /* renamed from: a */
        private void m41161a() {
            Object andSet = this.f32726g.getAndSet(f32724h);
            if (andSet != f32724h) {
                try {
                    this.f32725f.onNext(andSet);
                } catch (Throwable th) {
                    C12472a.m40939a(th, (C5372f<?>) this);
                }
            }
        }

        public void call() {
            m41161a();
        }

        public void onCompleted() {
            m41161a();
            this.f32725f.onCompleted();
            unsubscribe();
        }

        public void onError(Throwable th) {
            this.f32725f.onError(th);
            unsubscribe();
        }

        public void onNext(T t) {
            this.f32726g.set(t);
        }

        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public C12672v0(long j, TimeUnit timeUnit, C5373h hVar) {
        this.f32721f = j;
        this.f32722g = timeUnit;
        this.f32723h = hVar;
    }

    /* renamed from: a */
    public C12475j<? super T> call(C12475j<? super T> jVar) {
        C12838e eVar = new C12838e(jVar);
        C5373h.C5374a createWorker = this.f32723h.createWorker();
        jVar.add(createWorker);
        C12673a aVar = new C12673a(eVar);
        jVar.add(aVar);
        long j = this.f32721f;
        createWorker.mo18711a(aVar, j, j, this.f32722g);
        return aVar;
    }
}
