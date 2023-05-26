package p123rx.p401n.p402a;

import java.util.concurrent.atomic.AtomicInteger;
import p123rx.C12473g;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.p128t.C12888d;
import p123rx.p401n.p403b.C12704a;

/* renamed from: rx.n.a.c0 */
/* compiled from: OnSubscribeSwitchIfEmpty */
public final class C12524c0<T> implements C5368e.C5370a<T> {

    /* renamed from: f */
    final C5368e<? extends T> f32299f;

    /* renamed from: g */
    final C5368e<? extends T> f32300g;

    /* renamed from: rx.n.a.c0$a */
    /* compiled from: OnSubscribeSwitchIfEmpty */
    static final class C12525a<T> extends C12475j<T> {

        /* renamed from: f */
        private final C12704a f32301f;

        /* renamed from: g */
        private final C12475j<? super T> f32302g;

        C12525a(C12475j<? super T> jVar, C12704a aVar) {
            this.f32302g = jVar;
            this.f32301f = aVar;
        }

        public void onCompleted() {
            this.f32302g.onCompleted();
        }

        public void onError(Throwable th) {
            this.f32302g.onError(th);
        }

        public void onNext(T t) {
            this.f32302g.onNext(t);
            this.f32301f.mo40844a(1);
        }

        public void setProducer(C12473g gVar) {
            this.f32301f.mo40845a(gVar);
        }
    }

    /* renamed from: rx.n.a.c0$b */
    /* compiled from: OnSubscribeSwitchIfEmpty */
    static final class C12526b<T> extends C12475j<T> {

        /* renamed from: f */
        private boolean f32303f = true;

        /* renamed from: g */
        private final C12475j<? super T> f32304g;

        /* renamed from: h */
        private final C12888d f32305h;

        /* renamed from: i */
        private final C12704a f32306i;

        /* renamed from: j */
        private final C5368e<? extends T> f32307j;

        /* renamed from: k */
        final AtomicInteger f32308k;

        /* renamed from: l */
        volatile boolean f32309l;

        C12526b(C12475j<? super T> jVar, C12888d dVar, C12704a aVar, C5368e<? extends T> eVar) {
            this.f32304g = jVar;
            this.f32305h = dVar;
            this.f32306i = aVar;
            this.f32307j = eVar;
            this.f32308k = new AtomicInteger();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40683a(C5368e<? extends T> eVar) {
            if (this.f32308k.getAndIncrement() == 0) {
                while (!this.f32304g.isUnsubscribed()) {
                    if (!this.f32309l) {
                        if (eVar == null) {
                            C12525a aVar = new C12525a(this.f32304g, this.f32306i);
                            this.f32305h.mo41109a(aVar);
                            this.f32309l = true;
                            this.f32307j.mo18668b(aVar);
                        } else {
                            this.f32309l = true;
                            eVar.mo18668b((C12475j<? super Object>) this);
                            eVar = null;
                        }
                    }
                    if (this.f32308k.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        public void onCompleted() {
            if (!this.f32303f) {
                this.f32304g.onCompleted();
            } else if (!this.f32304g.isUnsubscribed()) {
                this.f32309l = false;
                mo40683a((C5368e) null);
            }
        }

        public void onError(Throwable th) {
            this.f32304g.onError(th);
        }

        public void onNext(T t) {
            this.f32303f = false;
            this.f32304g.onNext(t);
            this.f32306i.mo40844a(1);
        }

        public void setProducer(C12473g gVar) {
            this.f32306i.mo40845a(gVar);
        }
    }

    public C12524c0(C5368e<? extends T> eVar, C5368e<? extends T> eVar2) {
        this.f32299f = eVar;
        this.f32300g = eVar2;
    }

    /* renamed from: a */
    public void call(C12475j<? super T> jVar) {
        C12888d dVar = new C12888d();
        C12704a aVar = new C12704a();
        C12526b bVar = new C12526b(jVar, dVar, aVar, this.f32300g);
        dVar.mo41109a(bVar);
        jVar.add(dVar);
        jVar.setProducer(aVar);
        bVar.mo40683a(this.f32299f);
    }
}
