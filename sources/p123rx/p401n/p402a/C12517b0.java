package p123rx.p401n.p402a;

import java.util.concurrent.TimeUnit;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.C5373h;
import p123rx.p126m.C5377a;

/* renamed from: rx.n.a.b0 */
/* compiled from: OnSubscribeSkipTimed */
public final class C12517b0<T> implements C5368e.C5370a<T> {

    /* renamed from: f */
    final long f32281f;

    /* renamed from: g */
    final TimeUnit f32282g;

    /* renamed from: h */
    final C5373h f32283h;

    /* renamed from: i */
    final C5368e<T> f32284i;

    /* renamed from: rx.n.a.b0$a */
    /* compiled from: OnSubscribeSkipTimed */
    static final class C12518a<T> extends C12475j<T> implements C5377a {

        /* renamed from: f */
        final C12475j<? super T> f32285f;

        /* renamed from: g */
        volatile boolean f32286g;

        C12518a(C12475j<? super T> jVar) {
            this.f32285f = jVar;
        }

        public void call() {
            this.f32286g = true;
        }

        public void onCompleted() {
            try {
                this.f32285f.onCompleted();
            } finally {
                unsubscribe();
            }
        }

        public void onError(Throwable th) {
            try {
                this.f32285f.onError(th);
            } finally {
                unsubscribe();
            }
        }

        public void onNext(T t) {
            if (this.f32286g) {
                this.f32285f.onNext(t);
            }
        }
    }

    public C12517b0(C5368e<T> eVar, long j, TimeUnit timeUnit, C5373h hVar) {
        this.f32284i = eVar;
        this.f32281f = j;
        this.f32282g = timeUnit;
        this.f32283h = hVar;
    }

    /* renamed from: a */
    public void call(C12475j<? super T> jVar) {
        C5373h.C5374a createWorker = this.f32283h.createWorker();
        C12518a aVar = new C12518a(jVar);
        aVar.add(createWorker);
        jVar.add(aVar);
        createWorker.mo18712a(aVar, this.f32281f, this.f32282g);
        this.f32284i.mo18668b(aVar);
    }
}
